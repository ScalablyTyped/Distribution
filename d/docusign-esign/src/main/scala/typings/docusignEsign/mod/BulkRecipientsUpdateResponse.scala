package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkRecipientsUpdateResponse extends js.Object {
  
  var signer: js.UndefOr[Signer] = js.native
}
object BulkRecipientsUpdateResponse {
  
  @scala.inline
  def apply(): BulkRecipientsUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkRecipientsUpdateResponse]
  }
  
  @scala.inline
  implicit class BulkRecipientsUpdateResponseOps[Self <: BulkRecipientsUpdateResponse] (val x: Self) extends AnyVal {
    
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
    def setSigner(value: Signer): Self = this.set("signer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigner: Self = this.set("signer", js.undefined)
  }
}
