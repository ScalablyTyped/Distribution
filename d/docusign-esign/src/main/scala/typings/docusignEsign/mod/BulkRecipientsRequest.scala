package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkRecipientsRequest extends js.Object {
  
  /**
    * A complex type containing information about the bulk recipients in the request.
    */
  var bulkRecipients: js.UndefOr[js.Array[BulkRecipient]] = js.native
}
object BulkRecipientsRequest {
  
  @scala.inline
  def apply(): BulkRecipientsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkRecipientsRequest]
  }
  
  @scala.inline
  implicit class BulkRecipientsRequestOps[Self <: BulkRecipientsRequest] (val x: Self) extends AnyVal {
    
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
    def setBulkRecipientsVarargs(value: BulkRecipient*): Self = this.set("bulkRecipients", js.Array(value :_*))
    
    @scala.inline
    def setBulkRecipients(value: js.Array[BulkRecipient]): Self = this.set("bulkRecipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBulkRecipients: Self = this.set("bulkRecipients", js.undefined)
  }
}
