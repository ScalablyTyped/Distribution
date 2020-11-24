package typings.googleAppsScript.GoogleAppsScript.AdminReseller.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subscription extends js.Object {
  
  var billingMethod: js.UndefOr[String] = js.native
  
  var creationTime: js.UndefOr[String] = js.native
  
  var customerDomain: js.UndefOr[String] = js.native
  
  var customerId: js.UndefOr[String] = js.native
  
  var dealCode: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var plan: js.UndefOr[SubscriptionPlan] = js.native
  
  var purchaseOrderId: js.UndefOr[String] = js.native
  
  var renewalSettings: js.UndefOr[RenewalSettings] = js.native
  
  var resourceUiUrl: js.UndefOr[String] = js.native
  
  var seats: js.UndefOr[Seats] = js.native
  
  var skuId: js.UndefOr[String] = js.native
  
  var skuName: js.UndefOr[String] = js.native
  
  var status: js.UndefOr[String] = js.native
  
  var subscriptionId: js.UndefOr[String] = js.native
  
  var suspensionReasons: js.UndefOr[js.Array[String]] = js.native
  
  var transferInfo: js.UndefOr[SubscriptionTransferInfo] = js.native
  
  var trialSettings: js.UndefOr[SubscriptionTrialSettings] = js.native
}
object Subscription {
  
  @scala.inline
  def apply(): Subscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subscription]
  }
  
  @scala.inline
  implicit class SubscriptionOps[Self <: Subscription] (val x: Self) extends AnyVal {
    
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
    def setBillingMethod(value: String): Self = this.set("billingMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingMethod: Self = this.set("billingMethod", js.undefined)
    
    @scala.inline
    def setCreationTime(value: String): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    
    @scala.inline
    def setCustomerDomain(value: String): Self = this.set("customerDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerDomain: Self = this.set("customerDomain", js.undefined)
    
    @scala.inline
    def setCustomerId(value: String): Self = this.set("customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerId: Self = this.set("customerId", js.undefined)
    
    @scala.inline
    def setDealCode(value: String): Self = this.set("dealCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDealCode: Self = this.set("dealCode", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setPlan(value: SubscriptionPlan): Self = this.set("plan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlan: Self = this.set("plan", js.undefined)
    
    @scala.inline
    def setPurchaseOrderId(value: String): Self = this.set("purchaseOrderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurchaseOrderId: Self = this.set("purchaseOrderId", js.undefined)
    
    @scala.inline
    def setRenewalSettings(value: RenewalSettings): Self = this.set("renewalSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenewalSettings: Self = this.set("renewalSettings", js.undefined)
    
    @scala.inline
    def setResourceUiUrl(value: String): Self = this.set("resourceUiUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceUiUrl: Self = this.set("resourceUiUrl", js.undefined)
    
    @scala.inline
    def setSeats(value: Seats): Self = this.set("seats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeats: Self = this.set("seats", js.undefined)
    
    @scala.inline
    def setSkuId(value: String): Self = this.set("skuId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkuId: Self = this.set("skuId", js.undefined)
    
    @scala.inline
    def setSkuName(value: String): Self = this.set("skuName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkuName: Self = this.set("skuName", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setSubscriptionId(value: String): Self = this.set("subscriptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscriptionId: Self = this.set("subscriptionId", js.undefined)
    
    @scala.inline
    def setSuspensionReasonsVarargs(value: String*): Self = this.set("suspensionReasons", js.Array(value :_*))
    
    @scala.inline
    def setSuspensionReasons(value: js.Array[String]): Self = this.set("suspensionReasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuspensionReasons: Self = this.set("suspensionReasons", js.undefined)
    
    @scala.inline
    def setTransferInfo(value: SubscriptionTransferInfo): Self = this.set("transferInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransferInfo: Self = this.set("transferInfo", js.undefined)
    
    @scala.inline
    def setTrialSettings(value: SubscriptionTrialSettings): Self = this.set("trialSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrialSettings: Self = this.set("trialSettings", js.undefined)
  }
}
