package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stamp extends js.Object {
  
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
  
  var imageBase64: js.UndefOr[String] = js.native
  
  /**
    * Specificies the type of image. Valid values are:
    *
    * - `signature_image`
    * - `initials_image`
    */
  var imageType: js.UndefOr[String] = js.native
  
  /**
    * The date and time that the item was last modified.
    */
  var lastModifiedDateTime: js.UndefOr[String] = js.native
  
  /**
    * The phonetic spelling of the `signatureName`.
    */
  var phoneticName: js.UndefOr[String] = js.native
  
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
    * The URI for retrieving the image of the user's stamp.
    */
  var stampImageUri: js.UndefOr[String] = js.native
  
  /**
    * The physical height of the stamp image (in millimeters) that the stamp vendor recommends for displaying the image in PDF documents.
    */
  var stampSizeMM: js.UndefOr[String] = js.native
  
  /**
    * The status of the item.
    */
  var status: js.UndefOr[String] = js.native
}
object Stamp {
  
  @scala.inline
  def apply(): Stamp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Stamp]
  }
  
  @scala.inline
  implicit class StampOps[Self <: Stamp] (val x: Self) extends AnyVal {
    
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
    def setLastModifiedDateTime(value: String): Self = this.set("lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedDateTime: Self = this.set("lastModifiedDateTime", js.undefined)
    
    @scala.inline
    def setPhoneticName(value: String): Self = this.set("phoneticName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneticName: Self = this.set("phoneticName", js.undefined)
    
    @scala.inline
    def setSignatureName(value: String): Self = this.set("signatureName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureName: Self = this.set("signatureName", js.undefined)
    
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
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
