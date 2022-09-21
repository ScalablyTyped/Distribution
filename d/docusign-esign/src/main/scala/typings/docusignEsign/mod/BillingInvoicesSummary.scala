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
  
  inline def apply(): BillingInvoicesSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingInvoicesSummary]
  }
  
  extension [Self <: BillingInvoicesSummary](x: Self) {
    
    inline def setBillingInvoices(value: js.Array[BillingInvoice]): Self = StObject.set(x, "billingInvoices", value.asInstanceOf[js.Any])
    
    inline def setBillingInvoicesUndefined: Self = StObject.set(x, "billingInvoices", js.undefined)
    
    inline def setBillingInvoicesVarargs(value: BillingInvoice*): Self = StObject.set(x, "billingInvoices", js.Array(value*))
    
    inline def setPastDueBalance(value: String): Self = StObject.set(x, "pastDueBalance", value.asInstanceOf[js.Any])
    
    inline def setPastDueBalanceUndefined: Self = StObject.set(x, "pastDueBalance", js.undefined)
    
    inline def setPaymentAllowed(value: String): Self = StObject.set(x, "paymentAllowed", value.asInstanceOf[js.Any])
    
    inline def setPaymentAllowedUndefined: Self = StObject.set(x, "paymentAllowed", js.undefined)
  }
}
