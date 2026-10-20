import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;;

public class Main{
    public int[] findDuplicates(int[] arr){
        Set<Integer> uniqueValues = new HashSet<>();
        Set<Integer> duplicateValues = new HashSet<>();

        for(int num : arr){
            if (!uniqueValues.add(num)) {
                duplicateValues.add(num);
            }
        }

        int[] result = new int[duplicateValues.size()];
        int index = 0;

        for(int num : duplicateValues){
            result[index] = num;
            index++;
        }

        return result;
    }

    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            Main obj = new Main();

            System.out.print("Enter the number of elements: ");
            int n = scan.nextInt();

            int[] arr = new int[n];

            System.out.print("Enter the elements: ");
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }

            int[] result = obj.findDuplicates(arr);
            if (result.length > 0) {
                System.out.println("Duplicates found: ");
                for ( int num:result) {
                    System.out.print(num + " ");
                }
            }   else{
                System.out.println("No duplicates found.");
            }
        }
    }
}