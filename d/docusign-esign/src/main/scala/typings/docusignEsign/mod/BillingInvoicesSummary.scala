package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingInvoicesSummary extends js.Object {
  
  /**
    * Reserved: TBD
    */
  var billingInvoices: js.UndefOr[js.Array[BillingInvoice]] = js.native
  
  var pastDueBalance: js.UndefOr[String] = js.native
  
  var paymentAllowed: js.UndefOr[String] = js.native
}
object BillingInvoicesSummary {
  
  @scala.inline
  def apply(): BillingInvoicesSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingInvoicesSummary]
  }
  
  @scala.inline
  implicit class BillingInvoicesSummaryOps[Self <: BillingInvoicesSummary] (val x: Self) extends AnyVal {
    
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
    def setBillingInvoicesVarargs(value: BillingInvoice*): Self = this.set("billingInvoices", js.Array(value :_*))
    
    @scala.inline
    def setBillingInvoices(value: js.Array[BillingInvoice]): Self = this.set("billingInvoices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingInvoices: Self = this.set("billingInvoices", js.undefined)
    
    @scala.inline
    def setPastDueBalance(value: String): Self = this.set("pastDueBalance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePastDueBalance: Self = this.set("pastDueBalance", js.undefined)
    
    @scala.inline
    def setPaymentAllowed(value: String): Self = this.set("paymentAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentAllowed: Self = this.set("paymentAllowed", js.undefined)
  }
}
