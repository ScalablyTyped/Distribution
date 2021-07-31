package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingInvoicesSummary extends StObject {
  
  /**
    * Reserved: TBD
    */
  var billingInvoices: js.UndefOr[js.Array[BillingInvoice]] = js.undefined
  
  var pastDueBalance: js.UndefOr[String] = js.undefined
  
  var paymentAllowed: js.UndefOr[String] = js.undefined
}
object BillingInvoicesSummary {
  
  @scala.inline
  def apply(): BillingInvoicesSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingInvoicesSummary]
  }
  
  @scala.inline
  implicit class BillingInvoicesSummaryMutableBuilder[Self <: BillingInvoicesSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBillingInvoices(value: js.Array[BillingInvoice]): Self = StObject.set(x, "billingInvoices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingInvoicesUndefined: Self = StObject.set(x, "billingInvoices", js.undefined)
    
    @scala.inline
    def setBillingInvoicesVarargs(value: BillingInvoice*): Self = StObject.set(x, "billingInvoices", js.Array(value :_*))
    
    @scala.inline
    def setPastDueBalance(value: String): Self = StObject.set(x, "pastDueBalance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPastDueBalanceUndefined: Self = StObject.set(x, "pastDueBalance", js.undefined)
    
    @scala.inline
    def setPaymentAllowed(value: String): Self = StObject.set(x, "paymentAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentAllowedUndefined: Self = StObject.set(x, "paymentAllowed", js.undefined)
  }
}
