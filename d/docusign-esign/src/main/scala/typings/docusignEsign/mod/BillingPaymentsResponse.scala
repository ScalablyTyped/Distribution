package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingPaymentsResponse extends StObject {
  
  /**
    * Reserved: TBD
    */
  var billingPayments: js.UndefOr[js.Array[BillingPaymentItem]] = js.undefined
  
  /**
    * The URI for the next chunk of records based on the search request. It is `null` if this is the last set of results for the search.
    */
  var nextUri: js.UndefOr[String] = js.undefined
  
  /**
    * The URI for the prior chunk of records based on the search request. It is `null` if this is the first set of results for the search.
    */
  var previousUri: js.UndefOr[String] = js.undefined
}
object BillingPaymentsResponse {
  
  @scala.inline
  def apply(): BillingPaymentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingPaymentsResponse]
  }
  
  @scala.inline
  implicit class BillingPaymentsResponseMutableBuilder[Self <: BillingPaymentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBillingPayments(value: js.Array[BillingPaymentItem]): Self = StObject.set(x, "billingPayments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingPaymentsUndefined: Self = StObject.set(x, "billingPayments", js.undefined)
    
    @scala.inline
    def setBillingPaymentsVarargs(value: BillingPaymentItem*): Self = StObject.set(x, "billingPayments", js.Array(value :_*))
    
    @scala.inline
    def setNextUri(value: String): Self = StObject.set(x, "nextUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextUriUndefined: Self = StObject.set(x, "nextUri", js.undefined)
    
    @scala.inline
    def setPreviousUri(value: String): Self = StObject.set(x, "previousUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousUriUndefined: Self = StObject.set(x, "previousUri", js.undefined)
  }
}
