package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingChargeResponse extends js.Object {
  
  /**
    * Reserved: TBD
    */
  var billingChargeItems: js.UndefOr[js.Array[/* Contains information about a billing charge. */ BillingCharge]] = js.native
}
object BillingChargeResponse {
  
  @scala.inline
  def apply(): BillingChargeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingChargeResponse]
  }
  
  @scala.inline
  implicit class BillingChargeResponseOps[Self <: BillingChargeResponse] (val x: Self) extends AnyVal {
    
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
    def setBillingChargeItemsVarargs(value: (/* Contains information about a billing charge. */ BillingCharge)*): Self = this.set("billingChargeItems", js.Array(value :_*))
    
    @scala.inline
    def setBillingChargeItems(value: js.Array[/* Contains information about a billing charge. */ BillingCharge]): Self = this.set("billingChargeItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingChargeItems: Self = this.set("billingChargeItems", js.undefined)
  }
}
