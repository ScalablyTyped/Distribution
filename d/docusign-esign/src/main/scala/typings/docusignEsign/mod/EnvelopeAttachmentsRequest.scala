package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvelopeAttachmentsRequest extends js.Object {
  
  /**
    * An object that contains information about the attachment.
    */
  var attachments: js.UndefOr[js.Array[/* Contains information about an attachment. */ Attachment]] = js.native
}
object EnvelopeAttachmentsRequest {
  
  @scala.inline
  def apply(): EnvelopeAttachmentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopeAttachmentsRequest]
  }
  
  @scala.inline
  implicit class EnvelopeAttachmentsRequestOps[Self <: EnvelopeAttachmentsRequest] (val x: Self) extends AnyVal {
    
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
    def setAttachmentsVarargs(value: (/* Contains information about an attachment. */ Attachment)*): Self = this.set("attachments", js.Array(value :_*))
    
    @scala.inline
    def setAttachments(value: js.Array[/* Contains information about an attachment. */ Attachment]): Self = this.set("attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachments: Self = this.set("attachments", js.undefined)
  }
}
