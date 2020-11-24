package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkSendRequest extends js.Object {
  
  /**
    * The GUID of the envelope or template that you want to send in bulk.
    */
  var envelopeOrTemplateId: js.UndefOr[String] = js.native
}
object BulkSendRequest {
  
  @scala.inline
  def apply(): BulkSendRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkSendRequest]
  }
  
  @scala.inline
  implicit class BulkSendRequestOps[Self <: BulkSendRequest] (val x: Self) extends AnyVal {
    
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
    def setEnvelopeOrTemplateId(value: String): Self = this.set("envelopeOrTemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeOrTemplateId: Self = this.set("envelopeOrTemplateId", js.undefined)
  }
}
