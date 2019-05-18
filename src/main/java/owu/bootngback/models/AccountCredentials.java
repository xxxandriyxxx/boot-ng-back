package owu.bootngback.models;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountCredentials {
    private String username;
    private String password;
}
