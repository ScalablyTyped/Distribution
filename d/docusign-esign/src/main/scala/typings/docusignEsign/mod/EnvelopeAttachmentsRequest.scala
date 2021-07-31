package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvelopeAttachmentsRequest extends StObject {
  
  /**
    * An object that contains information about the attachment.
    */
  var attachments: js.UndefOr[js.Array[/* Contains information about an attachment. */ Attachment]] = js.undefined
}
object EnvelopeAttachmentsRequest {
  
  @scala.inline
  def apply(): EnvelopeAttachmentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopeAttachmentsRequest]
  }
  
  @scala.inline
  implicit class EnvelopeAttachmentsRequestMutableBuilder[Self <: EnvelopeAttachmentsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachments(value: js.Array[/* Contains information about an attachment. */ Attachment]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    @scala.inline
    def setAttachmentsVarargs(value: (/* Contains information about an attachment. */ Attachment)*): Self = StObject.set(x, "attachments", js.Array(value :_*))
  }
}
