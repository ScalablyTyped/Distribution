package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecipientSignatureInformation extends StObject {
  
  /**
    * Specifies the font style for the user's signature.
    */
  var fontStyle: js.UndefOr[String] = js.native
  
  /**
    * Specifies the user's signature in initials format.
    */
  var signatureInitials: js.UndefOr[String] = js.native
  
  /**
    * Specifies the user's signature name.
    */
  var signatureName: js.UndefOr[String] = js.native
}
object RecipientSignatureInformation {
  
  @scala.inline
  def apply(): RecipientSignatureInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientSignatureInformation]
  }
  
  @scala.inline
  implicit class RecipientSignatureInformationMutableBuilder[Self <: RecipientSignatureInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    @scala.inline
    def setSignatureInitials(value: String): Self = StObject.set(x, "signatureInitials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureInitialsUndefined: Self = StObject.set(x, "signatureInitials", js.undefined)
    
    @scala.inline
    def setSignatureName(value: String): Self = StObject.set(x, "signatureName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureNameUndefined: Self = StObject.set(x, "signatureName", js.undefined)
  }
}
