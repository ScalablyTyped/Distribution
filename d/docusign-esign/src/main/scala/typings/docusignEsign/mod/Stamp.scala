package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stamp extends StObject {
  
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
  
  var imageBase64: js.UndefOr[String] = js.undefined
  
  /**
    * Specificies the type of image. Valid values are:
    *
    * - `signature_image`
    * - `initials_image`
    */
  var imageType: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time that the item was last modified.
    */
  var lastModifiedDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The phonetic spelling of the `signatureName`.
    */
  var phoneticName: js.UndefOr[String] = js.undefined
  
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
    * The URI for retrieving the image of the user's stamp.
    */
  var stampImageUri: js.UndefOr[String] = js.undefined
  
  /**
    * The physical height of the stamp image (in millimeters) that the stamp vendor recommends for displaying the image in PDF documents.
    */
  var stampSizeMM: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the item.
    */
  var status: js.UndefOr[String] = js.undefined
}
object Stamp {
  
  @scala.inline
  def apply(): Stamp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Stamp]
  }
  
  @scala.inline
  implicit class StampMutableBuilder[Self <: Stamp] (val x: Self) extends AnyVal {
    
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
    def setLastModifiedDateTime(value: String): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    @scala.inline
    def setPhoneticName(value: String): Self = StObject.set(x, "phoneticName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneticNameUndefined: Self = StObject.set(x, "phoneticName", js.undefined)
    
    @scala.inline
    def setSignatureName(value: String): Self = StObject.set(x, "signatureName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureNameUndefined: Self = StObject.set(x, "signatureName", js.undefined)
    
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
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
