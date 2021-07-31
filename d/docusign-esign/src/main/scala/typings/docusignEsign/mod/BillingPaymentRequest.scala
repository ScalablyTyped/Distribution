package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingPaymentRequest extends StObject {
  
  /**
    * The payment amount for the past due invoices. This value must match the pastDueBalance value retrieved using Get Past Due Invoices.
    */
  var paymentAmount: js.UndefOr[String] = js.undefined
}
object BillingPaymentRequest {
  
  @scala.inline
  def apply(): BillingPaymentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingPaymentRequest]
  }
  
  @scala.inline
  implicit class BillingPaymentRequestMutableBuilder[Self <: BillingPaymentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPaymentAmount(value: String): Self = StObject.set(x, "paymentAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentAmountUndefined: Self = StObject.set(x, "paymentAmount", js.undefined)
  }
}
