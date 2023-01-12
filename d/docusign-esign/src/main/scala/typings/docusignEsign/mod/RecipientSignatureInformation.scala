package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecipientSignatureInformation extends StObject {
  
  /**
    * Specifies the font style for the user's signature.
    */
  var fontStyle: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the user's signature in initials format.
    */
  var signatureInitials: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the user's signature name.
    */
  var signatureName: js.UndefOr[String] = js.undefined
}
object RecipientSignatureInformation {
  
  inline def apply(): RecipientSignatureInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientSignatureInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecipientSignatureInformation] (val x: Self) extends AnyVal {
    
    inline def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    inline def setSignatureInitials(value: String): Self = StObject.set(x, "signatureInitials", value.asInstanceOf[js.Any])
    
    inline def setSignatureInitialsUndefined: Self = StObject.set(x, "signatureInitials", js.undefined)
    
    inline def setSignatureName(value: String): Self = StObject.set(x, "signatureName", value.asInstanceOf[js.Any])
    
    inline def setSignatureNameUndefined: Self = StObject.set(x, "signatureName", js.undefined)
  }
}
