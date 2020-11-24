package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayApplianceSignerAttachment extends js.Object {
  
  var attachmentDescription: js.UndefOr[String] = js.native
  
  var attachmentTabId: js.UndefOr[String] = js.native
  
  var documentId: js.UndefOr[String] = js.native
  
  var envelopeId: js.UndefOr[String] = js.native
  
  var pageCount: js.UndefOr[Double] = js.native
  
  var pageId: js.UndefOr[String] = js.native
  
  var recipientId: js.UndefOr[String] = js.native
}
object DisplayApplianceSignerAttachment {
  
  @scala.inline
  def apply(): DisplayApplianceSignerAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayApplianceSignerAttachment]
  }
  
  @scala.inline
  implicit class DisplayApplianceSignerAttachmentOps[Self <: DisplayApplianceSignerAttachment] (val x: Self) extends AnyVal {
    
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
    def setAttachmentDescription(value: String): Self = this.set("attachmentDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachmentDescription: Self = this.set("attachmentDescription", js.undefined)
    
    @scala.inline
    def setAttachmentTabId(value: String): Self = this.set("attachmentTabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachmentTabId: Self = this.set("attachmentTabId", js.undefined)
    
    @scala.inline
    def setDocumentId(value: String): Self = this.set("documentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentId: Self = this.set("documentId", js.undefined)
    
    @scala.inline
    def setEnvelopeId(value: String): Self = this.set("envelopeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeId: Self = this.set("envelopeId", js.undefined)
    
    @scala.inline
    def setPageCount(value: Double): Self = this.set("pageCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageCount: Self = this.set("pageCount", js.undefined)
    
    @scala.inline
    def setPageId(value: String): Self = this.set("pageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageId: Self = this.set("pageId", js.undefined)
    
    @scala.inline
    def setRecipientId(value: String): Self = this.set("recipientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientId: Self = this.set("recipientId", js.undefined)
  }
}
