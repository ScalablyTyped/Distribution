package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountPasswordStrengthTypeOption extends js.Object {
  
  /**
    * Minimum length of the access code string.
    */
  var minimumLength: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
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
}
object AccountPasswordStrengthTypeOption {
  
  @scala.inline
  def apply(): AccountPasswordStrengthTypeOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountPasswordStrengthTypeOption]
  }
  
  @scala.inline
  implicit class AccountPasswordStrengthTypeOptionOps[Self <: AccountPasswordStrengthTypeOption] (val x: Self) extends AnyVal {
    
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
    def setMinimumLength(value: String): Self = this.set("minimumLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumLength: Self = this.set("minimumLength", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
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
  }
}
