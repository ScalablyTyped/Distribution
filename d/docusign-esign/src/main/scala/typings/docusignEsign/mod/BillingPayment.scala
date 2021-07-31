package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingPayment extends StObject {
  
  /**
    * Reserved: TBD
    */
  var amount: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved: TBD
    */
  var invoiceId: js.UndefOr[String] = js.undefined
  
  var paymentId: js.UndefOr[String] = js.undefined
}
object BillingPayment {
  
  @scala.inline
  def apply(): BillingPayment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingPayment]
  }
  
  @scala.inline
  implicit class BillingPaymentMutableBuilder[Self <: BillingPayment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    @scala.inline
    def setInvoiceId(value: String): Self = StObject.set(x, "invoiceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvoiceIdUndefined: Self = StObject.set(x, "invoiceId", js.undefined)
    
    @scala.inline
    def setPaymentId(value: String): Self = StObject.set(x, "paymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentIdUndefined: Self = StObject.set(x, "paymentId", js.undefined)
  }
}
