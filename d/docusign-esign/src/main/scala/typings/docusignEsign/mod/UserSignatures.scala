package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserSignatures extends StObject {
  
  /**
    * The UTC date and time when the user adopted the signature.
    */
  var adoptedDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The UTC date and time when the user created the signature.
    */
  var createdDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Serialized information about any custom [eHanko stamps](https://support.docusign.com/en/articles/Sending-and-Signing-with-eHanko)
    * that have been ordered from an eHanko provider, including the order status, purchase order id, time created, and time modified.
    */
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
    * An external ID for the signature or stamp.
    *
    * **Note**: If a recipient uses a stamp instead of a signature, this is the stamp vendor's serial number for the stamp.
    */
  var externalID: js.UndefOr[String] = js.undefined
  
  /**
    * A Base64-encoded representation of the signature image.
    */
  var imageBase64: js.UndefOr[String] = js.undefined
  
  /**
    * The format of the signature image, such as:
    *
    * - `GIF`
    * - `PNG`
    * - `JPG`
    * - `PDF`
    * - `BMP`
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
    * The UTC date and time when the signature was last modified.
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
    * The font type to use for the signature if the signature is not drawn. The following font types are supported:
    *
    * - `1_DocuSign`
    * - `2_DocuSign`
    * - `3_DocuSign`
    * - `4_DocuSign`
    * - `5_DocuSign`
    * - `6_DocuSign`
    * - `7_DocuSign`
    * - `8_DocuSign`
    * - `Mistral`
    * - `Rage Italic`
    *
    */
  var signatureFont: js.UndefOr[String] = js.undefined
  
  /**
    * The ID associated with the signature name. You can use this property in the URI in place of the signature name. This enables the use of special
    * characters (such as "&", "<", and ">") in a signature name.
    *
    * **Note**: When you update a signature, its signature ID might change. In that case you need to use `signatureName` to get the new `signatureId`.
    */
  var signatureId: js.UndefOr[String] = js.undefined
  
  /**
    * An endpoint URI that you can use to retrieve the user's signature image.
    */
  var signatureImageUri: js.UndefOr[String] = js.undefined
  
  /**
    *  The initials associated with the signature.
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
    * Specifies the type of signature. Possible values include:
    *
    * - `RubberStamp`: A DocuSign pre-formatted signature style. This is the default value.
    * - `Imported`: A signature image that the user uploaded.
    * - `Drawn`: A freehand drawing of the user's signature and initials.
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
object UserSignatures {
  
  inline def apply(): UserSignatures = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserSignatures]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserSignatures] (val x: Self) extends AnyVal {
    
    inline def setAdoptedDateTime(value: String): Self = StObject.set(x, "adoptedDateTime", value.asInstanceOf[js.Any])
    
    inline def setAdoptedDateTimeUndefined: Self = StObject.set(x, "adoptedDateTime", js.undefined)
    
    inline def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setCustomField(value: String): Self = StObject.set(x, "customField", value.asInstanceOf[js.Any])
    
    inline def setCustomFieldUndefined: Self = StObject.set(x, "customField", js.undefined)
    
    inline def setDateStampProperties(value: DateStampProperties): Self = StObject.set(x, "dateStampProperties", value.asInstanceOf[js.Any])
    
    inline def setDateStampPropertiesUndefined: Self = StObject.set(x, "dateStampProperties", js.undefined)
    
    inline def setDisallowUserResizeStamp(value: String): Self = StObject.set(x, "disallowUserResizeStamp", value.asInstanceOf[js.Any])
    
    inline def setDisallowUserResizeStampUndefined: Self = StObject.set(x, "disallowUserResizeStamp", js.undefined)
    
    inline def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    inline def setExternalID(value: String): Self = StObject.set(x, "externalID", value.asInstanceOf[js.Any])
    
    inline def setExternalIDUndefined: Self = StObject.set(x, "externalID", js.undefined)
    
    inline def setImageBase64(value: String): Self = StObject.set(x, "imageBase64", value.asInstanceOf[js.Any])
    
    inline def setImageBase64Undefined: Self = StObject.set(x, "imageBase64", js.undefined)
    
    inline def setImageType(value: String): Self = StObject.set(x, "imageType", value.asInstanceOf[js.Any])
    
    inline def setImageTypeUndefined: Self = StObject.set(x, "imageType", js.undefined)
    
    inline def setInitials150ImageId(value: String): Self = StObject.set(x, "initials150ImageId", value.asInstanceOf[js.Any])
    
    inline def setInitials150ImageIdUndefined: Self = StObject.set(x, "initials150ImageId", js.undefined)
    
    inline def setInitialsImageUri(value: String): Self = StObject.set(x, "initialsImageUri", value.asInstanceOf[js.Any])
    
    inline def setInitialsImageUriUndefined: Self = StObject.set(x, "initialsImageUri", js.undefined)
    
    inline def setIsDefault(value: String): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
    
    inline def setLastModifiedDateTime(value: String): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    inline def setNrdsId(value: String): Self = StObject.set(x, "nrdsId", value.asInstanceOf[js.Any])
    
    inline def setNrdsIdUndefined: Self = StObject.set(x, "nrdsId", js.undefined)
    
    inline def setNrdsLastName(value: String): Self = StObject.set(x, "nrdsLastName", value.asInstanceOf[js.Any])
    
    inline def setNrdsLastNameUndefined: Self = StObject.set(x, "nrdsLastName", js.undefined)
    
    inline def setNrdsStatus(value: String): Self = StObject.set(x, "nrdsStatus", value.asInstanceOf[js.Any])
    
    inline def setNrdsStatusUndefined: Self = StObject.set(x, "nrdsStatus", js.undefined)
    
    inline def setPhoneticName(value: String): Self = StObject.set(x, "phoneticName", value.asInstanceOf[js.Any])
    
    inline def setPhoneticNameUndefined: Self = StObject.set(x, "phoneticName", js.undefined)
    
    inline def setSignature150ImageId(value: String): Self = StObject.set(x, "signature150ImageId", value.asInstanceOf[js.Any])
    
    inline def setSignature150ImageIdUndefined: Self = StObject.set(x, "signature150ImageId", js.undefined)
    
    inline def setSignatureFont(value: String): Self = StObject.set(x, "signatureFont", value.asInstanceOf[js.Any])
    
    inline def setSignatureFontUndefined: Self = StObject.set(x, "signatureFont", js.undefined)
    
    inline def setSignatureId(value: String): Self = StObject.set(x, "signatureId", value.asInstanceOf[js.Any])
    
    inline def setSignatureIdUndefined: Self = StObject.set(x, "signatureId", js.undefined)
    
    inline def setSignatureImageUri(value: String): Self = StObject.set(x, "signatureImageUri", value.asInstanceOf[js.Any])
    
    inline def setSignatureImageUriUndefined: Self = StObject.set(x, "signatureImageUri", js.undefined)
    
    inline def setSignatureInitials(value: String): Self = StObject.set(x, "signatureInitials", value.asInstanceOf[js.Any])
    
    inline def setSignatureInitialsUndefined: Self = StObject.set(x, "signatureInitials", js.undefined)
    
    inline def setSignatureName(value: String): Self = StObject.set(x, "signatureName", value.asInstanceOf[js.Any])
    
    inline def setSignatureNameUndefined: Self = StObject.set(x, "signatureName", js.undefined)
    
    inline def setSignatureRights(value: String): Self = StObject.set(x, "signatureRights", value.asInstanceOf[js.Any])
    
    inline def setSignatureRightsUndefined: Self = StObject.set(x, "signatureRights", js.undefined)
    
    inline def setSignatureType(value: String): Self = StObject.set(x, "signatureType", value.asInstanceOf[js.Any])
    
    inline def setSignatureTypeUndefined: Self = StObject.set(x, "signatureType", js.undefined)
    
    inline def setStampFormat(value: String): Self = StObject.set(x, "stampFormat", value.asInstanceOf[js.Any])
    
    inline def setStampFormatUndefined: Self = StObject.set(x, "stampFormat", js.undefined)
    
    inline def setStampImageUri(value: String): Self = StObject.set(x, "stampImageUri", value.asInstanceOf[js.Any])
    
    inline def setStampImageUriUndefined: Self = StObject.set(x, "stampImageUri", js.undefined)
    
    inline def setStampSizeMM(value: String): Self = StObject.set(x, "stampSizeMM", value.asInstanceOf[js.Any])
    
    inline def setStampSizeMMUndefined: Self = StObject.set(x, "stampSizeMM", js.undefined)
    
    inline def setStampType(value: String): Self = StObject.set(x, "stampType", value.asInstanceOf[js.Any])
    
    inline def setStampTypeUndefined: Self = StObject.set(x, "stampType", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
