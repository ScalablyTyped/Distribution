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
  
  inline def apply(): BillingPayment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingPayment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BillingPayment] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setInvoiceId(value: String): Self = StObject.set(x, "invoiceId", value.asInstanceOf[js.Any])
    
    inline def setInvoiceIdUndefined: Self = StObject.set(x, "invoiceId", js.undefined)
    
    inline def setPaymentId(value: String): Self = StObject.set(x, "paymentId", value.asInstanceOf[js.Any])
    
    inline def setPaymentIdUndefined: Self = StObject.set(x, "paymentId", js.undefined)
  }
}
