package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingPaymentRequest extends js.Object {
  
  /**
    * The payment amount for the past due invoices. This value must match the pastDueBalance value retrieved using Get Past Due Invoices.
    */
  var paymentAmount: js.UndefOr[String] = js.native
}
object BillingPaymentRequest {
  
  @scala.inline
  def apply(): BillingPaymentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingPaymentRequest]
  }
  
  @scala.inline
  implicit class BillingPaymentRequestOps[Self <: BillingPaymentRequest] (val x: Self) extends AnyVal {
    
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
    def setPaymentAmount(value: String): Self = this.set("paymentAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentAmount: Self = this.set("paymentAmount", js.undefined)
  }
}
