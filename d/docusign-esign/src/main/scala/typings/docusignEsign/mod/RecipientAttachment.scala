package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecipientAttachment extends StObject {
  
  /**
    * The unique identifier for the attachment.
    */
  var attachmentId: js.UndefOr[String] = js.native
  
  /**
    * Specifies the type of the attachment for the recipient. Possible values are:
    *
    * - `.htm`
    * - `.xml`
    */
  var attachmentType: js.UndefOr[String] = js.native
  
  /**
    * A Base64-encoded representation of the attachment that is used to upload and download the file. File attachments may be up to 50 MB in size.
    */
  var data: js.UndefOr[String] = js.native
  
  /**
    * An optional label for the attachment.
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * The name of the attachment.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The URL of a previously staged chunked upload. Using a chunked upload enables you to stage a large, chunkable temp file. You then use the `remoteUrl`
    * property to reference the chunked upload as the content in attachment and document-related requests. The `remoteUrl` property cannot be used for downloads.
    */
  var remoteUrl: js.UndefOr[String] = js.native
}
object RecipientAttachment {
  
  @scala.inline
  def apply(): RecipientAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientAttachment]
  }
  
  @scala.inline
  implicit class RecipientAttachmentMutableBuilder[Self <: RecipientAttachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachmentId(value: String): Self = StObject.set(x, "attachmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentIdUndefined: Self = StObject.set(x, "attachmentId", js.undefined)
    
    @scala.inline
    def setAttachmentType(value: String): Self = StObject.set(x, "attachmentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentTypeUndefined: Self = StObject.set(x, "attachmentType", js.undefined)
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRemoteUrl(value: String): Self = StObject.set(x, "remoteUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteUrlUndefined: Self = StObject.set(x, "remoteUrl", js.undefined)
  }
}
