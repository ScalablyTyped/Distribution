package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountPasswordRules extends js.Object {
  
  /**
    * When set to **true**, passwords expire. The default value is `false`.
    */
  var expirePassword: js.UndefOr[String] = js.native
  
  /**
    * The number of days before passwords expire. To use this property, the `expirePassword` property must be set to **true**.
    */
  var expirePasswordDays: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `expirePasswordDays` property is editable.
    *
    */
  var expirePasswordDaysMetadata: js.UndefOr[AccountPasswordExpirePasswordDays] = js.native
  
  /**
    * The number of minutes a user is locked out of the system after three (?) failed login attempts. The default value is `2`.
    */
  var lockoutDurationMinutes: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `lockoutDurationMinutes` property is editable.
    *
    */
  var lockoutDurationMinutesMetadata: js.UndefOr[AccountPasswordLockoutDurationMinutes] = js.native
  
  /**
    * The interval associated with the user lockout after a failed login attempt.
    *
    * Possible values are: (?????)
    *
    * - `minutes` (default)
    * - `hours`
    * - `days`
    */
  var lockoutDurationType: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `lockoutDurationType` property is editable.
    *
    */
  var lockoutDurationTypeMetadata: js.UndefOr[AccountPasswordLockoutDurationType] = js.native
  
  /**
    * The minimum number of days after a password is set before it can be changed. This value can be `0` or more days. The default value is `0`.
    */
  var minimumPasswordAgeDays: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `minimumPasswordAgeDays` property is editable.
    *
    */
  var minimumPasswordAgeDaysMetadata: js.UndefOr[AccountPasswordMinimumPasswordAgeDays] = js.native
  
  /**
    * The minimum number of characters in the password. This value must be a number between `6` and `15`. The default value is `6`.
    */
  var minimumPasswordLength: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `minimumPasswordLength` property is editable.
    *
    */
  var minimumPasswordLengthMetadata: js.UndefOr[AccountMinimumPasswordLength] = js.native
  
  /**
    * When set to **true**, passwords must include a digit. The default value is `false`.
    */
  var passwordIncludeDigit: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, passwords must include either a digit or a special character. The default value is `false`.
    *
    * **Note**: Passwords cannot include angle brackets (`<` `>`) or spaces.
    */
  var passwordIncludeDigitOrSpecialCharacter: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, passwords must include a lowercase letter. The default value is `false`.
    */
  var passwordIncludeLowerCase: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, passwords must include a special character. The default value is `false`.
    *
    * **Note**: Passwords cannot include angle brackets (`<` `>`) or spaces.
    */
  var passwordIncludeSpecialCharacter: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, passwords must include an uppercase letter. The default value is `false`.
    */
  var passwordIncludeUpperCase: js.UndefOr[String] = js.native
  
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
  var passwordStrengthType: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `passwordStrengthType` property is editable.
    *
    */
  var passwordStrengthTypeMetadata: js.UndefOr[AccountPasswordStrengthType] = js.native
  
  /**
    * The number of security questions required to confirm the user’s identity before the user can reset their password. The default value is `0`.
    */
  var questionsRequired: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `questionsRequired` property is editable.
    *
    */
  var questionsRequiredMetadata: js.UndefOr[
    /* Information about the number of password questions required (0 to 4) to confirm a user's identity when a user needs to reset their password.
    */ AccountPasswordQuestionsRequired
  ] = js.native
}
object AccountPasswordRules {
  
  @scala.inline
  def apply(): AccountPasswordRules = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountPasswordRules]
  }
  
  @scala.inline
  implicit class AccountPasswordRulesOps[Self <: AccountPasswordRules] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExpirePassword(value: String): Self = this.set("expirePassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpirePassword: Self = this.set("expirePassword", js.undefined)
    
    @scala.inline
    def setExpirePasswordDays(value: String): Self = this.set("expirePasswordDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpirePasswordDays: Self = this.set("expirePasswordDays", js.undefined)
    
    @scala.inline
    def setExpirePasswordDaysMetadata(value: AccountPasswordExpirePasswordDays): Self = this.set("expirePasswordDaysMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpirePasswordDaysMetadata: Self = this.set("expirePasswordDaysMetadata", js.undefined)
    
    @scala.inline
    def setLockoutDurationMinutes(value: String): Self = this.set("lockoutDurationMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockoutDurationMinutes: Self = this.set("lockoutDurationMinutes", js.undefined)
    
    @scala.inline
    def setLockoutDurationMinutesMetadata(value: AccountPasswordLockoutDurationMinutes): Self = this.set("lockoutDurationMinutesMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockoutDurationMinutesMetadata: Self = this.set("lockoutDurationMinutesMetadata", js.undefined)
    
    @scala.inline
    def setLockoutDurationType(value: String): Self = this.set("lockoutDurationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockoutDurationType: Self = this.set("lockoutDurationType", js.undefined)
    
    @scala.inline
    def setLockoutDurationTypeMetadata(value: AccountPasswordLockoutDurationType): Self = this.set("lockoutDurationTypeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockoutDurationTypeMetadata: Self = this.set("lockoutDurationTypeMetadata", js.undefined)
    
    @scala.inline
    def setMinimumPasswordAgeDays(value: String): Self = this.set("minimumPasswordAgeDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumPasswordAgeDays: Self = this.set("minimumPasswordAgeDays", js.undefined)
    
    @scala.inline
    def setMinimumPasswordAgeDaysMetadata(value: AccountPasswordMinimumPasswordAgeDays): Self = this.set("minimumPasswordAgeDaysMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumPasswordAgeDaysMetadata: Self = this.set("minimumPasswordAgeDaysMetadata", js.undefined)
    
    @scala.inline
    def setMinimumPasswordLength(value: String): Self = this.set("minimumPasswordLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumPasswordLength: Self = this.set("minimumPasswordLength", js.undefined)
    
    @scala.inline
    def setMinimumPasswordLengthMetadata(value: AccountMinimumPasswordLength): Self = this.set("minimumPasswordLengthMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumPasswordLengthMetadata: Self = this.set("minimumPasswordLengthMetadata", js.undefined)
    
    @scala.inline
    def setPasswordIncludeDigit(value: String): Self = this.set("passwordIncludeDigit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordIncludeDigit: Self = this.set("passwordIncludeDigit", js.undefined)
    
    @scala.inline
    def setPasswordIncludeDigitOrSpecialCharacter(value: String): Self = this.set("passwordIncludeDigitOrSpecialCharacter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordIncludeDigitOrSpecialCharacter: Self = this.set("passwordIncludeDigitOrSpecialCharacter", js.undefined)
    
    @scala.inline
    def setPasswordIncludeLowerCase(value: String): Self = this.set("passwordIncludeLowerCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordIncludeLowerCase: Self = this.set("passwordIncludeLowerCase", js.undefined)
    
    @scala.inline
    def setPasswordIncludeSpecialCharacter(value: String): Self = this.set("passwordIncludeSpecialCharacter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordIncludeSpecialCharacter: Self = this.set("passwordIncludeSpecialCharacter", js.undefined)
    
    @scala.inline
    def setPasswordIncludeUpperCase(value: String): Self = this.set("passwordIncludeUpperCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordIncludeUpperCase: Self = this.set("passwordIncludeUpperCase", js.undefined)
    
    @scala.inline
    def setPasswordStrengthType(value: String): Self = this.set("passwordStrengthType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordStrengthType: Self = this.set("passwordStrengthType", js.undefined)
    
    @scala.inline
    def setPasswordStrengthTypeMetadata(value: AccountPasswordStrengthType): Self = this.set("passwordStrengthTypeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordStrengthTypeMetadata: Self = this.set("passwordStrengthTypeMetadata", js.undefined)
    
    @scala.inline
    def setQuestionsRequired(value: String): Self = this.set("questionsRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuestionsRequired: Self = this.set("questionsRequired", js.undefined)
    
    @scala.inline
    def setQuestionsRequiredMetadata(
      value: /* Information about the number of password questions required (0 to 4) to confirm a user's identity when a user needs to reset their password.
      */ AccountPasswordQuestionsRequired
    ): Self = this.set("questionsRequiredMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuestionsRequiredMetadata: Self = this.set("questionsRequiredMetadata", js.undefined)
  }
}
