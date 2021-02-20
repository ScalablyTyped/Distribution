package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountPasswordStrengthTypeOption extends StObject {
  
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
  implicit class AccountPasswordStrengthTypeOptionMutableBuilder[Self <: AccountPasswordStrengthTypeOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMinimumLength(value: String): Self = StObject.set(x, "minimumLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumLengthUndefined: Self = StObject.set(x, "minimumLength", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
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
  }
}
