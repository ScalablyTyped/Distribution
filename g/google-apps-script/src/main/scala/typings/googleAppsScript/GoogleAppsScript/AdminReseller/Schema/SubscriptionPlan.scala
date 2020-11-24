package typings.googleAppsScript.GoogleAppsScript.AdminReseller.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionPlan extends js.Object {
  
  var commitmentInterval: js.UndefOr[SubscriptionPlanCommitmentInterval] = js.native
  
  var isCommitmentPlan: js.UndefOr[Boolean] = js.native
  
  var planName: js.UndefOr[String] = js.native
}
object SubscriptionPlan {
  
  @scala.inline
  def apply(): SubscriptionPlan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionPlan]
  }
  
  @scala.inline
  implicit class SubscriptionPlanOps[Self <: SubscriptionPlan] (val x: Self) extends AnyVal {
    
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
    def setCommitmentInterval(value: SubscriptionPlanCommitmentInterval): Self = this.set("commitmentInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommitmentInterval: Self = this.set("commitmentInterval", js.undefined)
    
    @scala.inline
    def setIsCommitmentPlan(value: Boolean): Self = this.set("isCommitmentPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCommitmentPlan: Self = this.set("isCommitmentPlan", js.undefined)
    
    @scala.inline
    def setPlanName(value: String): Self = this.set("planName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlanName: Self = this.set("planName", js.undefined)
  }
}
