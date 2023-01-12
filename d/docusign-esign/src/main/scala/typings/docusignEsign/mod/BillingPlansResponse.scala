package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingPlansResponse extends StObject {
  
  /**
    * Reserved: TBD
    */
  var billingPlans: js.UndefOr[js.Array[/* Contains information about a billing plan. */ BillingPlan]] = js.undefined
}
object BillingPlansResponse {
  
  inline def apply(): BillingPlansResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingPlansResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BillingPlansResponse] (val x: Self) extends AnyVal {
    
    inline def setBillingPlans(value: js.Array[/* Contains information about a billing plan. */ BillingPlan]): Self = StObject.set(x, "billingPlans", value.asInstanceOf[js.Any])
    
    inline def setBillingPlansUndefined: Self = StObject.set(x, "billingPlans", js.undefined)
    
    inline def setBillingPlansVarargs(value: (/* Contains information about a billing plan. */ BillingPlan)*): Self = StObject.set(x, "billingPlans", js.Array(value*))
  }
}
