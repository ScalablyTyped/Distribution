package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecipientSignatureInformation extends js.Object {
  
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
  implicit class RecipientSignatureInformationOps[Self <: RecipientSignatureInformation] (val x: Self) extends AnyVal {
    
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
    def setFontStyle(value: String): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    
    @scala.inline
    def setSignatureInitials(value: String): Self = this.set("signatureInitials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureInitials: Self = this.set("signatureInitials", js.undefined)
    
    @scala.inline
    def setSignatureName(value: String): Self = this.set("signatureName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureName: Self = this.set("signatureName", js.undefined)
  }
}
