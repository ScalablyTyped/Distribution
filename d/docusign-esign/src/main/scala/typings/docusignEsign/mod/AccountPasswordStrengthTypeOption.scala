package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountPasswordStrengthTypeOption extends StObject {
  
  /**
    * Minimum length of the access code string.
    */
  var minimumLength: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
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
}
object AccountPasswordStrengthTypeOption {
  
  inline def apply(): AccountPasswordStrengthTypeOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountPasswordStrengthTypeOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountPasswordStrengthTypeOption] (val x: Self) extends AnyVal {
    
    inline def setMinimumLength(value: String): Self = StObject.set(x, "minimumLength", value.asInstanceOf[js.Any])
    
    inline def setMinimumLengthUndefined: Self = StObject.set(x, "minimumLength", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPasswordIncludeDigit(value: String): Self = StObject.set(x, "passwordIncludeDigit", value.asInstanceOf[js.Any])
    
    inline def setPasswordIncludeDigitOrSpecialCharacter(value: String): Self = StObject.set(x, "passwordIncludeDigitOrSpecialCharacter", value.asInstanceOf[js.Any])
    
    inline def setPasswordIncludeDigitOrSpecialCharacterUndefined: Self = StObject.set(x, "passwordIncludeDigitOrSpecialCharacter", js.undefined)
    
    inline def setPasswordIncludeDigitUndefined: Self = StObject.set(x, "passwordIncludeDigit", js.undefined)
    
    inline def setPasswordIncludeLowerCase(value: String): Self = StObject.set(x, "passwordIncludeLowerCase", value.asInstanceOf[js.Any])
    
    inline def setPasswordIncludeLowerCaseUndefined: Self = StObject.set(x, "passwordIncludeLowerCase", js.undefined)
    
    inline def setPasswordIncludeSpecialCharacter(value: String): Self = StObject.set(x, "passwordIncludeSpecialCharacter", value.asInstanceOf[js.Any])
    
    inline def setPasswordIncludeSpecialCharacterUndefined: Self = StObject.set(x, "passwordIncludeSpecialCharacter", js.undefined)
    
    inline def setPasswordIncludeUpperCase(value: String): Self = StObject.set(x, "passwordIncludeUpperCase", value.asInstanceOf[js.Any])
    
    inline def setPasswordIncludeUpperCaseUndefined: Self = StObject.set(x, "passwordIncludeUpperCase", js.undefined)
  }
}
