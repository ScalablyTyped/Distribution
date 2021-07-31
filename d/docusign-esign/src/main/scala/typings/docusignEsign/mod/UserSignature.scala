package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserSignature extends StObject {
  
  /**
    * The UTC date and time when the user adopted the signature.
    */
  var adoptedDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The UTC DateTime when the item was created.
    */
  var createdDateTime: js.UndefOr[String] = js.undefined
  
  var customField: js.UndefOr[String] = js.undefined
  
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
  var dateStampProperties: js.UndefOr[DateStampProperties] = js.undefined
  
  /**
    * When set to **true**, users may not resize the stamp.
    */
  var disallowUserResizeStamp: js.UndefOr[String] = js.undefined
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.undefined
  
  /**
    * Optionally specify an external identifier for the user's signature.
    */
  var externalID: js.UndefOr[String] = js.undefined
  
  /**
    * A Base64-encoded representation of the signature image.
    */
  var imageBase64: js.UndefOr[String] = js.undefined
  
  /**
    * Specificies the type of image. Valid values are:
    *
    * - `signature_image`
    * - `initials_image`
    */
  var imageType: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the user's initials image.
    */
  var initials150ImageId: js.UndefOr[String] = js.undefined
  
  /**
    * The URI for retrieving the image of the user's initials.
    */
  var initialsImageUri: js.UndefOr[String] = js.undefined
  
  /**
    * Boolean that specifies whether the signature is the default signature for the user.
    */
  var isDefault: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time that the item was last modified.
    */
  var lastModifiedDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The National Association of Realtors (NAR) membership ID for a user who is a realtor.
    */
  var nrdsId: js.UndefOr[String] = js.undefined
  
  /**
    * The realtor's last name.
    */
  var nrdsLastName: js.UndefOr[String] = js.undefined
  
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
  var nrdsStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The phonetic spelling of the `signatureName`.
    */
  var phoneticName: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the user's signature image.
    */
  var signature150ImageId: js.UndefOr[String] = js.undefined
  
  /**
    * The font to use for the signature.
    */
  var signatureFont: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the signature being accessed.
    */
  var signatureId: js.UndefOr[String] = js.undefined
  
  /**
    * An endpoint URI that you can use to retrieve the user's signature image.
    */
  var signatureImageUri: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the user's signature in initials format.
    */
  var signatureInitials: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the user's signature name.
    */
  var signatureName: js.UndefOr[String] = js.undefined
  
  /**
    * The rights that the user has to the signature. Valid values are:
    *
    * - `none`
    * - `read`
    * - `admin`
    */
  var signatureRights: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the type of signature.
    */
  var signatureType: js.UndefOr[String] = js.undefined
  
  /**
    * The format of a stamp. Valid values are:
    *
    * - `NameHanko`: The stamp represents only the signer's name.
    * - `NameDateHanko`: The stamp represents the signer's name and the date.
    */
  var stampFormat: js.UndefOr[String] = js.undefined
  
  /**
    * The URI for retrieving the image of the user's stamp.
    */
  var stampImageUri: js.UndefOr[String] = js.undefined
  
  /**
    * The physical height of the stamp image (in millimeters) that the stamp vendor recommends for displaying the image in PDF documents.
    */
  var stampSizeMM: js.UndefOr[String] = js.undefined
  
  /**
    * The type of stamp. Valid values are:
    *
    * - `signature`: A signature image. This is the default value.
    * - `stamp`: A stamp image.
    * - null
    */
  var stampType: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the item.
    */
  var status: js.UndefOr[String] = js.undefined
}
object UserSignature {
  
  @scala.inline
  def apply(): UserSignature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserSignature]
  }
  
  @scala.inline
  implicit class UserSignatureMutableBuilder[Self <: UserSignature] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdoptedDateTime(value: String): Self = StObject.set(x, "adoptedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdoptedDateTimeUndefined: Self = StObject.set(x, "adoptedDateTime", js.undefined)
    
    @scala.inline
    def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    @scala.inline
    def setCustomField(value: String): Self = StObject.set(x, "customField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomFieldUndefined: Self = StObject.set(x, "customField", js.undefined)
    
    @scala.inline
    def setDateStampProperties(value: DateStampProperties): Self = StObject.set(x, "dateStampProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateStampPropertiesUndefined: Self = StObject.set(x, "dateStampProperties", js.undefined)
    
    @scala.inline
    def setDisallowUserResizeStamp(value: String): Self = StObject.set(x, "disallowUserResizeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisallowUserResizeStampUndefined: Self = StObject.set(x, "disallowUserResizeStamp", js.undefined)
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    @scala.inline
    def setExternalID(value: String): Self = StObject.set(x, "externalID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalIDUndefined: Self = StObject.set(x, "externalID", js.undefined)
    
    @scala.inline
    def setImageBase64(value: String): Self = StObject.set(x, "imageBase64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageBase64Undefined: Self = StObject.set(x, "imageBase64", js.undefined)
    
    @scala.inline
    def setImageType(value: String): Self = StObject.set(x, "imageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageTypeUndefined: Self = StObject.set(x, "imageType", js.undefined)
    
    @scala.inline
    def setInitials150ImageId(value: String): Self = StObject.set(x, "initials150ImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitials150ImageIdUndefined: Self = StObject.set(x, "initials150ImageId", js.undefined)
    
    @scala.inline
    def setInitialsImageUri(value: String): Self = StObject.set(x, "initialsImageUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialsImageUriUndefined: Self = StObject.set(x, "initialsImageUri", js.undefined)
    
    @scala.inline
    def setIsDefault(value: String): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
    
    @scala.inline
    def setLastModifiedDateTime(value: String): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    @scala.inline
    def setNrdsId(value: String): Self = StObject.set(x, "nrdsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNrdsIdUndefined: Self = StObject.set(x, "nrdsId", js.undefined)
    
    @scala.inline
    def setNrdsLastName(value: String): Self = StObject.set(x, "nrdsLastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNrdsLastNameUndefined: Self = StObject.set(x, "nrdsLastName", js.undefined)
    
    @scala.inline
    def setNrdsStatus(value: String): Self = StObject.set(x, "nrdsStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNrdsStatusUndefined: Self = StObject.set(x, "nrdsStatus", js.undefined)
    
    @scala.inline
    def setPhoneticName(value: String): Self = StObject.set(x, "phoneticName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneticNameUndefined: Self = StObject.set(x, "phoneticName", js.undefined)
    
    @scala.inline
    def setSignature150ImageId(value: String): Self = StObject.set(x, "signature150ImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignature150ImageIdUndefined: Self = StObject.set(x, "signature150ImageId", js.undefined)
    
    @scala.inline
    def setSignatureFont(value: String): Self = StObject.set(x, "signatureFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureFontUndefined: Self = StObject.set(x, "signatureFont", js.undefined)
    
    @scala.inline
    def setSignatureId(value: String): Self = StObject.set(x, "signatureId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureIdUndefined: Self = StObject.set(x, "signatureId", js.undefined)
    
    @scala.inline
    def setSignatureImageUri(value: String): Self = StObject.set(x, "signatureImageUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureImageUriUndefined: Self = StObject.set(x, "signatureImageUri", js.undefined)
    
    @scala.inline
    def setSignatureInitials(value: String): Self = StObject.set(x, "signatureInitials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureInitialsUndefined: Self = StObject.set(x, "signatureInitials", js.undefined)
    
    @scala.inline
    def setSignatureName(value: String): Self = StObject.set(x, "signatureName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureNameUndefined: Self = StObject.set(x, "signatureName", js.undefined)
    
    @scala.inline
    def setSignatureRights(value: String): Self = StObject.set(x, "signatureRights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureRightsUndefined: Self = StObject.set(x, "signatureRights", js.undefined)
    
    @scala.inline
    def setSignatureType(value: String): Self = StObject.set(x, "signatureType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureTypeUndefined: Self = StObject.set(x, "signatureType", js.undefined)
    
    @scala.inline
    def setStampFormat(value: String): Self = StObject.set(x, "stampFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStampFormatUndefined: Self = StObject.set(x, "stampFormat", js.undefined)
    
    @scala.inline
    def setStampImageUri(value: String): Self = StObject.set(x, "stampImageUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStampImageUriUndefined: Self = StObject.set(x, "stampImageUri", js.undefined)
    
    @scala.inline
    def setStampSizeMM(value: String): Self = StObject.set(x, "stampSizeMM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStampSizeMMUndefined: Self = StObject.set(x, "stampSizeMM", js.undefined)
    
    @scala.inline
    def setStampType(value: String): Self = StObject.set(x, "stampType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStampTypeUndefined: Self = StObject.set(x, "stampType", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
