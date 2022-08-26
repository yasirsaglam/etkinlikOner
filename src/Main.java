import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.print("Hava Sıcaklığını Giriniz!");
        heat = input.nextInt();
        if (heat < 5) {
            System.out.println("Kayak yapmaya gidebilirsin.");
        } else if (heat <= 15) {
            System.out.println("Sinemaya gidebilirsin.");
        } else if (heat <= 25) {
            System.out.println("Pikniğe gidebilirsin.");
        } else {
            System.out.println("Yüzmeye gidebilirsin.");
        }
    }
}
