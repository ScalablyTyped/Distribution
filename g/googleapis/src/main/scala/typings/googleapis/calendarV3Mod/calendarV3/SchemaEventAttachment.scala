package typings.googleapis.calendarV3Mod.calendarV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaEventAttachment extends js.Object {
  
  /**
    * ID of the attached file. Read-only. For Google Drive files, this is the
    * ID of the corresponding Files resource entry in the Drive API.
    */
  var fileId: js.UndefOr[String] = js.native
  
  /**
    * URL link to the attachment. For adding Google Drive file attachments use
    * the same format as in alternateLink property of the Files resource in the
    * Drive API. Required when adding an attachment.
    */
  var fileUrl: js.UndefOr[String] = js.native
  
  /**
    * URL link to the attachment&#39;s icon. Read-only.
    */
  var iconLink: js.UndefOr[String] = js.native
  
  /**
    * Internet media type (MIME type) of the attachment.
    */
  var mimeType: js.UndefOr[String] = js.native
  
  /**
    * Attachment title.
    */
  var title: js.UndefOr[String] = js.native
}
object SchemaEventAttachment {
  
  @scala.inline
  def apply(): SchemaEventAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventAttachment]
  }
  
  @scala.inline
  implicit class SchemaEventAttachmentOps[Self <: SchemaEventAttachment] (val x: Self) extends AnyVal {
    
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
    def setFileId(value: String): Self = this.set("fileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileId: Self = this.set("fileId", js.undefined)
    
    @scala.inline
    def setFileUrl(value: String): Self = this.set("fileUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileUrl: Self = this.set("fileUrl", js.undefined)
    
    @scala.inline
    def setIconLink(value: String): Self = this.set("iconLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconLink: Self = this.set("iconLink", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
