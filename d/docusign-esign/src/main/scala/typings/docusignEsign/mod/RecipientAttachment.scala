package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecipientAttachment extends js.Object {
  
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
  implicit class RecipientAttachmentOps[Self <: RecipientAttachment] (val x: Self) extends AnyVal {
    
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
    def setAttachmentId(value: String): Self = this.set("attachmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachmentId: Self = this.set("attachmentId", js.undefined)
    
    @scala.inline
    def setAttachmentType(value: String): Self = this.set("attachmentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachmentType: Self = this.set("attachmentType", js.undefined)
    
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRemoteUrl(value: String): Self = this.set("remoteUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteUrl: Self = this.set("remoteUrl", js.undefined)
  }
}
