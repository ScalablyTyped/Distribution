package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayApplianceSignerAttachment extends StObject {
  
  var attachmentDescription: js.UndefOr[String] = js.undefined
  
  var attachmentTabId: js.UndefOr[String] = js.undefined
  
  var documentId: js.UndefOr[String] = js.undefined
  
  var envelopeId: js.UndefOr[String] = js.undefined
  
  var pageCount: js.UndefOr[Double] = js.undefined
  
  var pageId: js.UndefOr[String] = js.undefined
  
  var recipientId: js.UndefOr[String] = js.undefined
}
object DisplayApplianceSignerAttachment {
  
  @scala.inline
  def apply(): DisplayApplianceSignerAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayApplianceSignerAttachment]
  }
  
  @scala.inline
  implicit class DisplayApplianceSignerAttachmentMutableBuilder[Self <: DisplayApplianceSignerAttachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachmentDescription(value: String): Self = StObject.set(x, "attachmentDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentDescriptionUndefined: Self = StObject.set(x, "attachmentDescription", js.undefined)
    
    @scala.inline
    def setAttachmentTabId(value: String): Self = StObject.set(x, "attachmentTabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentTabIdUndefined: Self = StObject.set(x, "attachmentTabId", js.undefined)
    
    @scala.inline
    def setDocumentId(value: String): Self = StObject.set(x, "documentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentIdUndefined: Self = StObject.set(x, "documentId", js.undefined)
    
    @scala.inline
    def setEnvelopeId(value: String): Self = StObject.set(x, "envelopeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvelopeIdUndefined: Self = StObject.set(x, "envelopeId", js.undefined)
    
    @scala.inline
    def setPageCount(value: Double): Self = StObject.set(x, "pageCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageCountUndefined: Self = StObject.set(x, "pageCount", js.undefined)
    
    @scala.inline
    def setPageId(value: String): Self = StObject.set(x, "pageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageIdUndefined: Self = StObject.set(x, "pageId", js.undefined)
    
    @scala.inline
    def setRecipientId(value: String): Self = StObject.set(x, "recipientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientIdUndefined: Self = StObject.set(x, "recipientId", js.undefined)
  }
}
