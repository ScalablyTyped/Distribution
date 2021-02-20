package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingPaymentResponse extends StObject {
  
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
  implicit class BillingPaymentResponseMutableBuilder[Self <: BillingPaymentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBillingPayments(value: js.Array[/* Contains information on a billing plan. */ BillingPayment]): Self = StObject.set(x, "billingPayments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingPaymentsUndefined: Self = StObject.set(x, "billingPayments", js.undefined)
    
    @scala.inline
    def setBillingPaymentsVarargs(value: (/* Contains information on a billing plan. */ BillingPayment)*): Self = StObject.set(x, "billingPayments", js.Array(value :_*))
  }
}
