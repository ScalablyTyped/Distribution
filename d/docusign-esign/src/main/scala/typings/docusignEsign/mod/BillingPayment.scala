package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingPayment extends js.Object {
  
  /**
    * Reserved: TBD
    */
  var amount: js.UndefOr[String] = js.native
  
  /**
    * Reserved: TBD
    */
  var invoiceId: js.UndefOr[String] = js.native
  
  var paymentId: js.UndefOr[String] = js.native
}
object BillingPayment {
  
  @scala.inline
  def apply(): BillingPayment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingPayment]
  }
  
  @scala.inline
  implicit class BillingPaymentOps[Self <: BillingPayment] (val x: Self) extends AnyVal {
    
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
    def setAmount(value: String): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    
    @scala.inline
    def setInvoiceId(value: String): Self = this.set("invoiceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvoiceId: Self = this.set("invoiceId", js.undefined)
    
    @scala.inline
    def setPaymentId(value: String): Self = this.set("paymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentId: Self = this.set("paymentId", js.undefined)
  }
}
