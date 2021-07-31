package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingChargeResponse extends StObject {
  
  /**
    * Reserved: TBD
    */
  var billingChargeItems: js.UndefOr[js.Array[/* Contains information about a billing charge. */ BillingCharge]] = js.undefined
}
object BillingChargeResponse {
  
  @scala.inline
  def apply(): BillingChargeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingChargeResponse]
  }
  
  @scala.inline
  implicit class BillingChargeResponseMutableBuilder[Self <: BillingChargeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBillingChargeItems(value: js.Array[/* Contains information about a billing charge. */ BillingCharge]): Self = StObject.set(x, "billingChargeItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingChargeItemsUndefined: Self = StObject.set(x, "billingChargeItems", js.undefined)
    
    @scala.inline
    def setBillingChargeItemsVarargs(value: (/* Contains information about a billing charge. */ BillingCharge)*): Self = StObject.set(x, "billingChargeItems", js.Array(value :_*))
  }
}
