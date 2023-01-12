package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserSignatureDefinition extends StObject {
  
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
    * Optionally specify an external identifier for the user's signature.
    */
  var externalID: js.UndefOr[String] = js.undefined
  
  /**
    * Specificies the type of image. Valid values are:
    *
    * - `signature_image`
    * - `initials_image`
    */
  var imageType: js.UndefOr[String] = js.undefined
  
  /**
    * Boolean that specifies whether the signature is the default signature for the user.
    */
  var isDefault: js.UndefOr[String] = js.undefined
  
  /**
    * The National Association of Realtors (NAR) membership ID for a user who is a realtor.
    */
  var nrdsId: js.UndefOr[String] = js.undefined
  
  /**
    * The realtor's last name.
    */
  var nrdsLastName: js.UndefOr[String] = js.undefined
  
  /**
    * The phonetic spelling of the `signatureName`.
    */
  var phoneticName: js.UndefOr[String] = js.undefined
  
  /**
    * The font to use for the signature.
    */
  var signatureFont: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the signature ID associated with the signature name. You can use the signature ID in the URI in place of the signature name,
    * and the value stored in the `signatureName` property in the body is used. This allows the use of special characters (such as "&", "<", ">") in a the signature name.
    * Note that with each update to signatures, the returned signature ID might change, so the caller will need to trigger off the signature name to get the new signature ID.
    */
  var signatureId: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the user's signature in initials format.
    */
  var signatureInitials: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the user's signature name.
    */
  var signatureName: js.UndefOr[String] = js.undefined
  
  /**
    * The format of a stamp. Valid values are:
    *
    * - `NameHanko`: The stamp represents only the signer's name.
    * - `NameDateHanko`: The stamp represents the signer's name and the date.
    */
  var stampFormat: js.UndefOr[String] = js.undefined
  
  /**
    * The physical height of the stamp image (in millimeters) that the stamp vendor recommends for displaying the image in PDF documents.
    */
  var stampSizeMM: js.UndefOr[String] = js.undefined
}
object UserSignatureDefinition {
  
  inline def apply(): UserSignatureDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserSignatureDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserSignatureDefinition] (val x: Self) extends AnyVal {
    
    inline def setDateStampProperties(value: DateStampProperties): Self = StObject.set(x, "dateStampProperties", value.asInstanceOf[js.Any])
    
    inline def setDateStampPropertiesUndefined: Self = StObject.set(x, "dateStampProperties", js.undefined)
    
    inline def setDisallowUserResizeStamp(value: String): Self = StObject.set(x, "disallowUserResizeStamp", value.asInstanceOf[js.Any])
    
    inline def setDisallowUserResizeStampUndefined: Self = StObject.set(x, "disallowUserResizeStamp", js.undefined)
    
    inline def setExternalID(value: String): Self = StObject.set(x, "externalID", value.asInstanceOf[js.Any])
    
    inline def setExternalIDUndefined: Self = StObject.set(x, "externalID", js.undefined)
    
    inline def setImageType(value: String): Self = StObject.set(x, "imageType", value.asInstanceOf[js.Any])
    
    inline def setImageTypeUndefined: Self = StObject.set(x, "imageType", js.undefined)
    
    inline def setIsDefault(value: String): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
    
    inline def setNrdsId(value: String): Self = StObject.set(x, "nrdsId", value.asInstanceOf[js.Any])
    
    inline def setNrdsIdUndefined: Self = StObject.set(x, "nrdsId", js.undefined)
    
    inline def setNrdsLastName(value: String): Self = StObject.set(x, "nrdsLastName", value.asInstanceOf[js.Any])
    
    inline def setNrdsLastNameUndefined: Self = StObject.set(x, "nrdsLastName", js.undefined)
    
    inline def setPhoneticName(value: String): Self = StObject.set(x, "phoneticName", value.asInstanceOf[js.Any])
    
    inline def setPhoneticNameUndefined: Self = StObject.set(x, "phoneticName", js.undefined)
    
    inline def setSignatureFont(value: String): Self = StObject.set(x, "signatureFont", value.asInstanceOf[js.Any])
    
    inline def setSignatureFontUndefined: Self = StObject.set(x, "signatureFont", js.undefined)
    
    inline def setSignatureId(value: String): Self = StObject.set(x, "signatureId", value.asInstanceOf[js.Any])
    
    inline def setSignatureIdUndefined: Self = StObject.set(x, "signatureId", js.undefined)
    
    inline def setSignatureInitials(value: String): Self = StObject.set(x, "signatureInitials", value.asInstanceOf[js.Any])
    
    inline def setSignatureInitialsUndefined: Self = StObject.set(x, "signatureInitials", js.undefined)
    
    inline def setSignatureName(value: String): Self = StObject.set(x, "signatureName", value.asInstanceOf[js.Any])
    
    inline def setSignatureNameUndefined: Self = StObject.set(x, "signatureName", js.undefined)
    
    inline def setStampFormat(value: String): Self = StObject.set(x, "stampFormat", value.asInstanceOf[js.Any])
    
    inline def setStampFormatUndefined: Self = StObject.set(x, "stampFormat", js.undefined)
    
    inline def setStampSizeMM(value: String): Self = StObject.set(x, "stampSizeMM", value.asInstanceOf[js.Any])
    
    inline def setStampSizeMMUndefined: Self = StObject.set(x, "stampSizeMM", js.undefined)
  }
}
