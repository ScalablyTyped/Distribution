package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingPaymentResponse extends js.Object {
  
  /**
    * Reserved: TBD
    */
  var billingPayments: js.UndefOr[js.Array[/* Contains information on a billing plan. */ BillingPayment]] = js.native
}
object BillingPaymentResponse {
  
  @scala.inline
  def apply(): BillingPaymentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingPaymentResponse]
  }
  
  @scala.inline
  implicit class BillingPaymentResponseOps[Self <: BillingPaymentResponse] (val x: Self) extends AnyVal {
    
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
    def setBillingPaymentsVarargs(value: (/* Contains information on a billing plan. */ BillingPayment)*): Self = this.set("billingPayments", js.Array(value :_*))
    
    @scala.inline
    def setBillingPayments(value: js.Array[/* Contains information on a billing plan. */ BillingPayment]): Self = this.set("billingPayments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingPayments: Self = this.set("billingPayments", js.undefined)
  }
}
