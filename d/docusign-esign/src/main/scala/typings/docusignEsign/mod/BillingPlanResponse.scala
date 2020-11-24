package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingPlanResponse extends js.Object {
  
  /**
    * An object that contains details about the billing plan.
    */
  var billingPlan: js.UndefOr[/* Contains information about a billing plan. */ BillingPlan] = js.native
  
  /**
    * A list of billing plans that the current billing plan can be rolled into.
    */
  var successorPlans: js.UndefOr[js.Array[/* Contains information about a billing plan. */ BillingPlan]] = js.native
}
object BillingPlanResponse {
  
  @scala.inline
  def apply(): BillingPlanResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingPlanResponse]
  }
  
  @scala.inline
  implicit class BillingPlanResponseOps[Self <: BillingPlanResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBillingPlan(value: /* Contains information about a billing plan. */ BillingPlan): Self = this.set("billingPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingPlan: Self = this.set("billingPlan", js.undefined)
    
    @scala.inline
    def setSuccessorPlansVarargs(value: (/* Contains information about a billing plan. */ BillingPlan)*): Self = this.set("successorPlans", js.Array(value :_*))
    
    @scala.inline
    def setSuccessorPlans(value: js.Array[/* Contains information about a billing plan. */ BillingPlan]): Self = this.set("successorPlans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessorPlans: Self = this.set("successorPlans", js.undefined)
  }
}
