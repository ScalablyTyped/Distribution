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
  
  inline def apply(): BillingChargeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingChargeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BillingChargeResponse] (val x: Self) extends AnyVal {
    
    inline def setBillingChargeItems(value: js.Array[/* Contains information about a billing charge. */ BillingCharge]): Self = StObject.set(x, "billingChargeItems", value.asInstanceOf[js.Any])
    
    inline def setBillingChargeItemsUndefined: Self = StObject.set(x, "billingChargeItems", js.undefined)
    
    inline def setBillingChargeItemsVarargs(value: (/* Contains information about a billing charge. */ BillingCharge)*): Self = StObject.set(x, "billingChargeItems", js.Array(value*))
  }
}
