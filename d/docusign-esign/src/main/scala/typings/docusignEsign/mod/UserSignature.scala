package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserSignature extends js.Object {
  
  /**
    * The UTC date and time when the user adopted the signature.
    */
  var adoptedDateTime: js.UndefOr[String] = js.native
  
  /**
    * The UTC DateTime when the item was created.
    */
  var createdDateTime: js.UndefOr[String] = js.native
  
  var customField: js.UndefOr[String] = js.native
  
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
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.native
  
  /**
    * Optionally specify an external identifier for the user's signature.
    */
  var externalID: js.UndefOr[String] = js.native
  
  /**
    * A Base64-encoded representation of the signature image.
    */
  var imageBase64: js.UndefOr[String] = js.native
  
  /**
    * Specificies the type of image. Valid values are:
    *
    * - `signature_image`
    * - `initials_image`
    */
  var imageType: js.UndefOr[String] = js.native
  
  /**
    * The ID of the user's initials image.
    */
  var initials150ImageId: js.UndefOr[String] = js.native
  
  /**
    * The URI for retrieving the image of the user's initials.
    */
  var initialsImageUri: js.UndefOr[String] = js.native
  
  /**
    * Boolean that specifies whether the signature is the default signature for the user.
    */
  var isDefault: js.UndefOr[String] = js.native
  
  /**
    * The date and time that the item was last modified.
    */
  var lastModifiedDateTime: js.UndefOr[String] = js.native
  
  /**
    * The National Association of Realtors (NAR) membership ID for a user who is a realtor.
    */
  var nrdsId: js.UndefOr[String] = js.native
  
  /**
    * The realtor's last name.
    */
  var nrdsLastName: js.UndefOr[String] = js.native
  
  /**
    * The realtor's NAR membership status. The value `active` verifies that the user is a current NAR member. Valid values are:
    *
    * - `Active`
    * - `Inactive`
    * - `Terminate`
    * - `Provisional`
    * - `Deceased`
    * - `Suspend`
    * - `Unknown`
    */
  var nrdsStatus: js.UndefOr[String] = js.native
  
  /**
    * The phonetic spelling of the `signatureName`.
    */
  var phoneticName: js.UndefOr[String] = js.native
  
  /**
    * The ID of the user's signature image.
    */
  var signature150ImageId: js.UndefOr[String] = js.native
  
  /**
    * The font to use for the signature.
    */
  var signatureFont: js.UndefOr[String] = js.native
  
  /**
    * The ID of the signature being accessed.
    */
  var signatureId: js.UndefOr[String] = js.native
  
  /**
    * An endpoint URI that you can use to retrieve the user's signature image.
    */
  var signatureImageUri: js.UndefOr[String] = js.native
  
  /**
    * Specifies the user's signature in initials format.
    */
  var signatureInitials: js.UndefOr[String] = js.native
  
  /**
    * Specifies the user's signature name.
    */
  var signatureName: js.UndefOr[String] = js.native
  
  /**
    * The rights that the user has to the signature. Valid values are:
    *
    * - `none`
    * - `read`
    * - `admin`
    */
  var signatureRights: js.UndefOr[String] = js.native
  
  /**
    * Specifies the type of signature.
    */
  var signatureType: js.UndefOr[String] = js.native
  
  /**
    * The format of a stamp. Valid values are:
    *
    * - `NameHanko`: The stamp represents only the signer's name.
    * - `NameDateHanko`: The stamp represents the signer's name and the date.
    */
  var stampFormat: js.UndefOr[String] = js.native
  
  /**
    * The URI for retrieving the image of the user's stamp.
    */
  var stampImageUri: js.UndefOr[String] = js.native
  
  /**
    * The physical height of the stamp image (in millimeters) that the stamp vendor recommends for displaying the image in PDF documents.
    */
  var stampSizeMM: js.UndefOr[String] = js.native
  
  /**
    * The type of stamp. Valid values are:
    *
    * - `signature`: A signature image. This is the default value.
    * - `stamp`: A stamp image.
    * - null
    */
  var stampType: js.UndefOr[String] = js.native
  
  /**
    * The status of the item.
    */
  var status: js.UndefOr[String] = js.native
}
object UserSignature {
  
  @scala.inline
  def apply(): UserSignature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserSignature]
  }
  
  @scala.inline
  implicit class UserSignatureOps[Self <: UserSignature] (val x: Self) extends AnyVal {
    
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
    def setAdoptedDateTime(value: String): Self = this.set("adoptedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdoptedDateTime: Self = this.set("adoptedDateTime", js.undefined)
    
    @scala.inline
    def setCreatedDateTime(value: String): Self = this.set("createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDateTime: Self = this.set("createdDateTime", js.undefined)
    
    @scala.inline
    def setCustomField(value: String): Self = this.set("customField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomField: Self = this.set("customField", js.undefined)
    
    @scala.inline
    def setDateStampProperties(value: DateStampProperties): Self = this.set("dateStampProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateStampProperties: Self = this.set("dateStampProperties", js.undefined)
    
    @scala.inline
    def setDisallowUserResizeStamp(value: String): Self = this.set("disallowUserResizeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisallowUserResizeStamp: Self = this.set("disallowUserResizeStamp", js.undefined)
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = this.set("errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorDetails: Self = this.set("errorDetails", js.undefined)
    
    @scala.inline
    def setExternalID(value: String): Self = this.set("externalID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalID: Self = this.set("externalID", js.undefined)
    
    @scala.inline
    def setImageBase64(value: String): Self = this.set("imageBase64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageBase64: Self = this.set("imageBase64", js.undefined)
    
    @scala.inline
    def setImageType(value: String): Self = this.set("imageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageType: Self = this.set("imageType", js.undefined)
    
    @scala.inline
    def setInitials150ImageId(value: String): Self = this.set("initials150ImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitials150ImageId: Self = this.set("initials150ImageId", js.undefined)
    
    @scala.inline
    def setInitialsImageUri(value: String): Self = this.set("initialsImageUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialsImageUri: Self = this.set("initialsImageUri", js.undefined)
    
    @scala.inline
    def setIsDefault(value: String): Self = this.set("isDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDefault: Self = this.set("isDefault", js.undefined)
    
    @scala.inline
    def setLastModifiedDateTime(value: String): Self = this.set("lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedDateTime: Self = this.set("lastModifiedDateTime", js.undefined)
    
    @scala.inline
    def setNrdsId(value: String): Self = this.set("nrdsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNrdsId: Self = this.set("nrdsId", js.undefined)
    
    @scala.inline
    def setNrdsLastName(value: String): Self = this.set("nrdsLastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNrdsLastName: Self = this.set("nrdsLastName", js.undefined)
    
    @scala.inline
    def setNrdsStatus(value: String): Self = this.set("nrdsStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNrdsStatus: Self = this.set("nrdsStatus", js.undefined)
    
    @scala.inline
    def setPhoneticName(value: String): Self = this.set("phoneticName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneticName: Self = this.set("phoneticName", js.undefined)
    
    @scala.inline
    def setSignature150ImageId(value: String): Self = this.set("signature150ImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignature150ImageId: Self = this.set("signature150ImageId", js.undefined)
    
    @scala.inline
    def setSignatureFont(value: String): Self = this.set("signatureFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureFont: Self = this.set("signatureFont", js.undefined)
    
    @scala.inline
    def setSignatureId(value: String): Self = this.set("signatureId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureId: Self = this.set("signatureId", js.undefined)
    
    @scala.inline
    def setSignatureImageUri(value: String): Self = this.set("signatureImageUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureImageUri: Self = this.set("signatureImageUri", js.undefined)
    
    @scala.inline
    def setSignatureInitials(value: String): Self = this.set("signatureInitials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureInitials: Self = this.set("signatureInitials", js.undefined)
    
    @scala.inline
    def setSignatureName(value: String): Self = this.set("signatureName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureName: Self = this.set("signatureName", js.undefined)
    
    @scala.inline
    def setSignatureRights(value: String): Self = this.set("signatureRights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureRights: Self = this.set("signatureRights", js.undefined)
    
    @scala.inline
    def setSignatureType(value: String): Self = this.set("signatureType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureType: Self = this.set("signatureType", js.undefined)
    
    @scala.inline
    def setStampFormat(value: String): Self = this.set("stampFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStampFormat: Self = this.set("stampFormat", js.undefined)
    
    @scala.inline
    def setStampImageUri(value: String): Self = this.set("stampImageUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStampImageUri: Self = this.set("stampImageUri", js.undefined)
    
    @scala.inline
    def setStampSizeMM(value: String): Self = this.set("stampSizeMM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStampSizeMM: Self = this.set("stampSizeMM", js.undefined)
    
    @scala.inline
    def setStampType(value: String): Self = this.set("stampType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStampType: Self = this.set("stampType", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
