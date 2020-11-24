package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvelopeAttachmentsResult extends js.Object {
  
  /**
    * An array of attachment objects that contain information about the attachments.
    */
  var attachments: js.UndefOr[js.Array[EnvelopeAttachment]] = js.native
}
object EnvelopeAttachmentsResult {
  
  @scala.inline
  def apply(): EnvelopeAttachmentsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopeAttachmentsResult]
  }
  
  @scala.inline
  implicit class EnvelopeAttachmentsResultOps[Self <: EnvelopeAttachmentsResult] (val x: Self) extends AnyVal {
    
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
    def setAttachmentsVarargs(value: EnvelopeAttachment*): Self = this.set("attachments", js.Array(value :_*))
    
    @scala.inline
    def setAttachments(value: js.Array[EnvelopeAttachment]): Self = this.set("attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachments: Self = this.set("attachments", js.undefined)
  }
}
