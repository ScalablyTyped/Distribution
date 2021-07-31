package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountPasswordRules extends StObject {
  
  /**
    * When set to **true**, passwords expire. The default value is `false`.
    */
  var expirePassword: js.UndefOr[String] = js.undefined
  
  /**
    * The number of days before passwords expire. To use this property, the `expirePassword` property must be set to **true**.
    */
  var expirePasswordDays: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `expirePasswordDays` property is editable.
    *
    */
  var expirePasswordDaysMetadata: js.UndefOr[AccountPasswordExpirePasswordDays] = js.undefined
  
  /**
    * The number of minutes a user is locked out of the system after three (?) failed login attempts. The default value is `2`.
    */
  var lockoutDurationMinutes: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `lockoutDurationMinutes` property is editable.
    *
    */
  var lockoutDurationMinutesMetadata: js.UndefOr[AccountPasswordLockoutDurationMinutes] = js.undefined
  
  /**
    * The interval associated with the user lockout after a failed login attempt.
    *
    * Possible values are: (?????)
    *
    * - `minutes` (default)
    * - `hours`
    * - `days`
    */
  var lockoutDurationType: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `lockoutDurationType` property is editable.
    *
    */
  var lockoutDurationTypeMetadata: js.UndefOr[AccountPasswordLockoutDurationType] = js.undefined
  
  /**
    * The minimum number of days after a password is set before it can be changed. This value can be `0` or more days. The default value is `0`.
    */
  var minimumPasswordAgeDays: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `minimumPasswordAgeDays` property is editable.
    *
    */
  var minimumPasswordAgeDaysMetadata: js.UndefOr[AccountPasswordMinimumPasswordAgeDays] = js.undefined
  
  /**
    * The minimum number of characters in the password. This value must be a number between `6` and `15`. The default value is `6`.
    */
  var minimumPasswordLength: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `minimumPasswordLength` property is editable.
    *
    */
  var minimumPasswordLengthMetadata: js.UndefOr[AccountMinimumPasswordLength] = js.undefined
  
  /**
    * When set to **true**, passwords must include a digit. The default value is `false`.
    */
  var passwordIncludeDigit: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, passwords must include either a digit or a special character. The default value is `false`.
    *
    * **Note**: Passwords cannot include angle brackets (`<` `>`) or spaces.
    */
  var passwordIncludeDigitOrSpecialCharacter: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, passwords must include a lowercase letter. The default value is `false`.
    */
  var passwordIncludeLowerCase: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, passwords must include a special character. The default value is `false`.
    *
    * **Note**: Passwords cannot include angle brackets (`<` `>`) or spaces.
    */
  var passwordIncludeSpecialCharacter: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, passwords must include an uppercase letter. The default value is `false`.
    */
  var passwordIncludeUpperCase: js.UndefOr[String] = js.undefined
  
  /**
    * The type of password strength. Possible values are:
    *
    * - `basic`: The minimum password length is 6 characters with no other password requirements.
    * - `medium`: The minimum password length is 7 characters. Passwords must also have one uppercase letter, one lowercase letter, and one number or special character.
    * - `strong`: The minimum password length is 9 characters. Passwords must also have one uppercase letter, one lowercase letter, one number, and one special character.
    * - `custom`: This option enables you to customize password requirements, including the following properties:
    *
    *    - `minimumPasswordLength`
    *    - `minimumPasswordAgeDays`
    *    - `passwordIncludeDigit`
    *    - `passwordIncludeDigitOrSpecialCharacter`
    *    - `passwordIncludeLowerCase`
    *    - `passwordIncludeSpecialCharacter`
    *    - `passwordIncludeUpperCase`
    *    - `questionsRequired`
    */
  var passwordStrengthType: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `passwordStrengthType` property is editable.
    *
    */
  var passwordStrengthTypeMetadata: js.UndefOr[AccountPasswordStrengthType] = js.undefined
  
  /**
    * The number of security questions required to confirm the user’s identity before the user can reset their password. The default value is `0`.
    */
  var questionsRequired: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `questionsRequired` property is editable.
    *
    */
  var questionsRequiredMetadata: js.UndefOr[
    /* Information about the number of password questions required (0 to 4) to confirm a user's identity when a user needs to reset their password.
    */ AccountPasswordQuestionsRequired
  ] = js.undefined
}
object AccountPasswordRules {
  
  @scala.inline
  def apply(): AccountPasswordRules = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountPasswordRules]
  }
  
  @scala.inline
  implicit class AccountPasswordRulesMutableBuilder[Self <: AccountPasswordRules] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpirePassword(value: String): Self = StObject.set(x, "expirePassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirePasswordDays(value: String): Self = StObject.set(x, "expirePasswordDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirePasswordDaysMetadata(value: AccountPasswordExpirePasswordDays): Self = StObject.set(x, "expirePasswordDaysMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirePasswordDaysMetadataUndefined: Self = StObject.set(x, "expirePasswordDaysMetadata", js.undefined)
    
    @scala.inline
    def setExpirePasswordDaysUndefined: Self = StObject.set(x, "expirePasswordDays", js.undefined)
    
    @scala.inline
    def setExpirePasswordUndefined: Self = StObject.set(x, "expirePassword", js.undefined)
    
    @scala.inline
    def setLockoutDurationMinutes(value: String): Self = StObject.set(x, "lockoutDurationMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockoutDurationMinutesMetadata(value: AccountPasswordLockoutDurationMinutes): Self = StObject.set(x, "lockoutDurationMinutesMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockoutDurationMinutesMetadataUndefined: Self = StObject.set(x, "lockoutDurationMinutesMetadata", js.undefined)
    
    @scala.inline
    def setLockoutDurationMinutesUndefined: Self = StObject.set(x, "lockoutDurationMinutes", js.undefined)
    
    @scala.inline
    def setLockoutDurationType(value: String): Self = StObject.set(x, "lockoutDurationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockoutDurationTypeMetadata(value: AccountPasswordLockoutDurationType): Self = StObject.set(x, "lockoutDurationTypeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockoutDurationTypeMetadataUndefined: Self = StObject.set(x, "lockoutDurationTypeMetadata", js.undefined)
    
    @scala.inline
    def setLockoutDurationTypeUndefined: Self = StObject.set(x, "lockoutDurationType", js.undefined)
    
    @scala.inline
    def setMinimumPasswordAgeDays(value: String): Self = StObject.set(x, "minimumPasswordAgeDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumPasswordAgeDaysMetadata(value: AccountPasswordMinimumPasswordAgeDays): Self = StObject.set(x, "minimumPasswordAgeDaysMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumPasswordAgeDaysMetadataUndefined: Self = StObject.set(x, "minimumPasswordAgeDaysMetadata", js.undefined)
    
    @scala.inline
    def setMinimumPasswordAgeDaysUndefined: Self = StObject.set(x, "minimumPasswordAgeDays", js.undefined)
    
    @scala.inline
    def setMinimumPasswordLength(value: String): Self = StObject.set(x, "minimumPasswordLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumPasswordLengthMetadata(value: AccountMinimumPasswordLength): Self = StObject.set(x, "minimumPasswordLengthMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumPasswordLengthMetadataUndefined: Self = StObject.set(x, "minimumPasswordLengthMetadata", js.undefined)
    
    @scala.inline
    def setMinimumPasswordLengthUndefined: Self = StObject.set(x, "minimumPasswordLength", js.undefined)
    
    @scala.inline
    def setPasswordIncludeDigit(value: String): Self = StObject.set(x, "passwordIncludeDigit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordIncludeDigitOrSpecialCharacter(value: String): Self = StObject.set(x, "passwordIncludeDigitOrSpecialCharacter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordIncludeDigitOrSpecialCharacterUndefined: Self = StObject.set(x, "passwordIncludeDigitOrSpecialCharacter", js.undefined)
    
    @scala.inline
    def setPasswordIncludeDigitUndefined: Self = StObject.set(x, "passwordIncludeDigit", js.undefined)
    
    @scala.inline
    def setPasswordIncludeLowerCase(value: String): Self = StObject.set(x, "passwordIncludeLowerCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordIncludeLowerCaseUndefined: Self = StObject.set(x, "passwordIncludeLowerCase", js.undefined)
    
    @scala.inline
    def setPasswordIncludeSpecialCharacter(value: String): Self = StObject.set(x, "passwordIncludeSpecialCharacter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordIncludeSpecialCharacterUndefined: Self = StObject.set(x, "passwordIncludeSpecialCharacter", js.undefined)
    
    @scala.inline
    def setPasswordIncludeUpperCase(value: String): Self = StObject.set(x, "passwordIncludeUpperCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordIncludeUpperCaseUndefined: Self = StObject.set(x, "passwordIncludeUpperCase", js.undefined)
    
    @scala.inline
    def setPasswordStrengthType(value: String): Self = StObject.set(x, "passwordStrengthType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordStrengthTypeMetadata(value: AccountPasswordStrengthType): Self = StObject.set(x, "passwordStrengthTypeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordStrengthTypeMetadataUndefined: Self = StObject.set(x, "passwordStrengthTypeMetadata", js.undefined)
    
    @scala.inline
    def setPasswordStrengthTypeUndefined: Self = StObject.set(x, "passwordStrengthType", js.undefined)
    
    @scala.inline
    def setQuestionsRequired(value: String): Self = StObject.set(x, "questionsRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuestionsRequiredMetadata(
      value: /* Information about the number of password questions required (0 to 4) to confirm a user's identity when a user needs to reset their password.
      */ AccountPasswordQuestionsRequired
    ): Self = StObject.set(x, "questionsRequiredMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuestionsRequiredMetadataUndefined: Self = StObject.set(x, "questionsRequiredMetadata", js.undefined)
    
    @scala.inline
    def setQuestionsRequiredUndefined: Self = StObject.set(x, "questionsRequired", js.undefined)
  }
}
