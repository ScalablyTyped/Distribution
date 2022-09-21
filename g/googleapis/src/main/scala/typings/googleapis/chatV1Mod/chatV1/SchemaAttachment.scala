package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAttachment extends StObject {
  
  /**
    * A reference to the attachment data. This is used with the media API to download the attachment data.
    */
  var attachmentDataRef: js.UndefOr[SchemaAttachmentDataRef] = js.undefined
  
  /**
    * The original file name for the content, not the full path.
    */
  var contentName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The content type (MIME type) of the file.
    */
  var contentType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The download URL which should be used to allow a human user to download the attachment. Chat apps should not use this URL to download attachment content.
    */
  var downloadUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A reference to the drive attachment. This is used with the Drive API.
    */
  var driveDataRef: js.UndefOr[SchemaDriveDataRef] = js.undefined
  
  /**
    * Resource name of the attachment, in the form "spaces/x/messages/x/attachments/x".
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The source of the attachment.
    */
  var source: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The thumbnail URL which should be used to preview the attachment to a human user. Chat apps should not use this URL to download attachment content.
    */
  var thumbnailUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaAttachment {
  
  inline def apply(): SchemaAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttachment]
  }
  
  extension [Self <: SchemaAttachment](x: Self) {
    
    inline def setAttachmentDataRef(value: SchemaAttachmentDataRef): Self = StObject.set(x, "attachmentDataRef", value.asInstanceOf[js.Any])
    
    inline def setAttachmentDataRefUndefined: Self = StObject.set(x, "attachmentDataRef", js.undefined)
    
    inline def setContentName(value: String): Self = StObject.set(x, "contentName", value.asInstanceOf[js.Any])
    
    inline def setContentNameNull: Self = StObject.set(x, "contentName", null)
    
    inline def setContentNameUndefined: Self = StObject.set(x, "contentName", js.undefined)
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeNull: Self = StObject.set(x, "contentType", null)
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setDownloadUri(value: String): Self = StObject.set(x, "downloadUri", value.asInstanceOf[js.Any])
    
    inline def setDownloadUriNull: Self = StObject.set(x, "downloadUri", null)
    
    inline def setDownloadUriUndefined: Self = StObject.set(x, "downloadUri", js.undefined)
    
    inline def setDriveDataRef(value: SchemaDriveDataRef): Self = StObject.set(x, "driveDataRef", value.asInstanceOf[js.Any])
    
    inline def setDriveDataRefUndefined: Self = StObject.set(x, "driveDataRef", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceNull: Self = StObject.set(x, "source", null)
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setThumbnailUri(value: String): Self = StObject.set(x, "thumbnailUri", value.asInstanceOf[js.Any])
    
    inline def setThumbnailUriNull: Self = StObject.set(x, "thumbnailUri", null)
    
    inline def setThumbnailUriUndefined: Self = StObject.set(x, "thumbnailUri", js.undefined)
  }
}
