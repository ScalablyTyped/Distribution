package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingPaymentResponse extends StObject {
  
  /**
    * Reserved: TBD
    */
  var billingPayments: js.UndefOr[js.Array[/* Contains information on a billing plan. */ BillingPayment]] = js.undefined
}
object BillingPaymentResponse {
  
  inline def apply(): BillingPaymentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingPaymentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BillingPaymentResponse] (val x: Self) extends AnyVal {
    
    inline def setBillingPayments(value: js.Array[/* Contains information on a billing plan. */ BillingPayment]): Self = StObject.set(x, "billingPayments", value.asInstanceOf[js.Any])
    
    inline def setBillingPaymentsUndefined: Self = StObject.set(x, "billingPayments", js.undefined)
    
    inline def setBillingPaymentsVarargs(value: (/* Contains information on a billing plan. */ BillingPayment)*): Self = StObject.set(x, "billingPayments", js.Array(value*))
  }
}
