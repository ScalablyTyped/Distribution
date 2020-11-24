package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserSignatureDefinition extends js.Object {
  
  /**
    * Specifies the area in which a date stamp is placed. This parameter uses pixel positioning to draw a rectangle at the center of the stamp area.
    * The stamp is superimposed on top of this central area.
    *
    * This property contains the following information about the central rectangle:
    *
    * - `DateAreaX`: The X axis position of the top-left corner.
    * - `DateAreaY`: The Y axis position of the top-left corner.
    * - `DateAreaWidth`: The width of the rectangle.
    * - `DateAreaHeight`: The height of the rectangle.
    */
  var dateStampProperties: js.UndefOr[DateStampProperties] = js.native
  
  /**
    * When set to **true**, users may not resize the stamp.
    */
  var disallowUserResizeStamp: js.UndefOr[String] = js.native
  
  /**
    * Optionally specify an external identifier for the user's signature.
    */
  var externalID: js.UndefOr[String] = js.native
  
  /**
    * Specificies the type of image. Valid values are:
    *
    * - `signature_image`
    * - `initials_image`
    */
  var imageType: js.UndefOr[String] = js.native
  
  /**
    * Boolean that specifies whether the signature is the default signature for the user.
    */
  var isDefault: js.UndefOr[String] = js.native
  
  /**
    * The National Association of Realtors (NAR) membership ID for a user who is a realtor.
    */
  var nrdsId: js.UndefOr[String] = js.native
  
  /**
    * The realtor's last name.
    */
  var nrdsLastName: js.UndefOr[String] = js.native
  
  /**
    * The phonetic spelling of the `signatureName`.
    */
  var phoneticName: js.UndefOr[String] = js.native
  
  /**
    * The font to use for the signature.
    */
  var signatureFont: js.UndefOr[String] = js.native
  
  /**
    * Specifies the signature ID associated with the signature name. You can use the signature ID in the URI in place of the signature name,
    * and the value stored in the `signatureName` property in the body is used. This allows the use of special characters (such as "&", "<", ">") in a the signature name.
    * Note that with each update to signatures, the returned signature ID might change, so the caller will need to trigger off the signature name to get the new signature ID.
    */
  var signatureId: js.UndefOr[String] = js.native
  
  /**
    * Specifies the user's signature in initials format.
    */
  var signatureInitials: js.UndefOr[String] = js.native
  
  /**
    * Specifies the user's signature name.
    */
  var signatureName: js.UndefOr[String] = js.native
  
  /**
    * The format of a stamp. Valid values are:
    *
    * - `NameHanko`: The stamp represents only the signer's name.
    * - `NameDateHanko`: The stamp represents the signer's name and the date.
    */
  var stampFormat: js.UndefOr[String] = js.native
  
  /**
    * The physical height of the stamp image (in millimeters) that the stamp vendor recommends for displaying the image in PDF documents.
    */
  var stampSizeMM: js.UndefOr[String] = js.native
}
object UserSignatureDefinition {
  
  @scala.inline
  def apply(): UserSignatureDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserSignatureDefinition]
  }
  
  @scala.inline
  implicit class UserSignatureDefinitionOps[Self <: UserSignatureDefinition] (val x: Self) extends AnyVal {
    
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
    def setDateStampProperties(value: DateStampProperties): Self = this.set("dateStampProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateStampProperties: Self = this.set("dateStampProperties", js.undefined)
    
    @scala.inline
    def setDisallowUserResizeStamp(value: String): Self = this.set("disallowUserResizeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisallowUserResizeStamp: Self = this.set("disallowUserResizeStamp", js.undefined)
    
    @scala.inline
    def setExternalID(value: String): Self = this.set("externalID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalID: Self = this.set("externalID", js.undefined)
    
    @scala.inline
    def setImageType(value: String): Self = this.set("imageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageType: Self = this.set("imageType", js.undefined)
    
    @scala.inline
    def setIsDefault(value: String): Self = this.set("isDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDefault: Self = this.set("isDefault", js.undefined)
    
    @scala.inline
    def setNrdsId(value: String): Self = this.set("nrdsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNrdsId: Self = this.set("nrdsId", js.undefined)
    
    @scala.inline
    def setNrdsLastName(value: String): Self = this.set("nrdsLastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNrdsLastName: Self = this.set("nrdsLastName", js.undefined)
    
    @scala.inline
    def setPhoneticName(value: String): Self = this.set("phoneticName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneticName: Self = this.set("phoneticName", js.undefined)
    
    @scala.inline
    def setSignatureFont(value: String): Self = this.set("signatureFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureFont: Self = this.set("signatureFont", js.undefined)
    
    @scala.inline
    def setSignatureId(value: String): Self = this.set("signatureId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureId: Self = this.set("signatureId", js.undefined)
    
    @scala.inline
    def setSignatureInitials(value: String): Self = this.set("signatureInitials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureInitials: Self = this.set("signatureInitials", js.undefined)
    
    @scala.inline
    def setSignatureName(value: String): Self = this.set("signatureName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureName: Self = this.set("signatureName", js.undefined)
    
    @scala.inline
    def setStampFormat(value: String): Self = this.set("stampFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStampFormat: Self = this.set("stampFormat", js.undefined)
    
    @scala.inline
    def setStampSizeMM(value: String): Self = this.set("stampSizeMM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStampSizeMM: Self = this.set("stampSizeMM", js.undefined)
  }
}
