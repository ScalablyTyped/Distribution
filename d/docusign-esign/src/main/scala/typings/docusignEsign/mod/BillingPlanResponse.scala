package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingPlanResponse extends StObject {
  
  /**
    * An object that contains details about the billing plan.
    */
  var billingPlan: js.UndefOr[/* Contains information about a billing plan. */ BillingPlan] = js.undefined
  
  /**
    * A list of billing plans that the current billing plan can be rolled into.
    */
  var successorPlans: js.UndefOr[js.Array[/* Contains information about a billing plan. */ BillingPlan]] = js.undefined
}
object BillingPlanResponse {
  
  inline def apply(): BillingPlanResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingPlanResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BillingPlanResponse] (val x: Self) extends AnyVal {
    
    inline def setBillingPlan(value: /* Contains information about a billing plan. */ BillingPlan): Self = StObject.set(x, "billingPlan", value.asInstanceOf[js.Any])
    
    inline def setBillingPlanUndefined: Self = StObject.set(x, "billingPlan", js.undefined)
    
    inline def setSuccessorPlans(value: js.Array[/* Contains information about a billing plan. */ BillingPlan]): Self = StObject.set(x, "successorPlans", value.asInstanceOf[js.Any])
    
    inline def setSuccessorPlansUndefined: Self = StObject.set(x, "successorPlans", js.undefined)
    
    inline def setSuccessorPlansVarargs(value: (/* Contains information about a billing plan. */ BillingPlan)*): Self = StObject.set(x, "successorPlans", js.Array(value*))
  }
}
