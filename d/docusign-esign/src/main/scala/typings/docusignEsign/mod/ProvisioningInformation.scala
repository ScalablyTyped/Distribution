package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvisioningInformation extends js.Object {
  
  var defaultConnectionId: js.UndefOr[String] = js.native
  
  var defaultPlanId: js.UndefOr[String] = js.native
  
  /**
    * The code that identifies the billing plan groups and plans for the new account.
    */
  var distributorCode: js.UndefOr[String] = js.native
  
  /**
    * The password for the `distributorCode`.
    */
  var distributorPassword: js.UndefOr[String] = js.native
  
  var passwordRuleText: js.UndefOr[String] = js.native
  
  var planPromotionText: js.UndefOr[String] = js.native
  
  var purchaseOrderOrPromAllowed: js.UndefOr[String] = js.native
}
object ProvisioningInformation {
  
  @scala.inline
  def apply(): ProvisioningInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisioningInformation]
  }
  
  @scala.inline
  implicit class ProvisioningInformationOps[Self <: ProvisioningInformation] (val x: Self) extends AnyVal {
    
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
    def setDefaultConnectionId(value: String): Self = this.set("defaultConnectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultConnectionId: Self = this.set("defaultConnectionId", js.undefined)
    
    @scala.inline
    def setDefaultPlanId(value: String): Self = this.set("defaultPlanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultPlanId: Self = this.set("defaultPlanId", js.undefined)
    
    @scala.inline
    def setDistributorCode(value: String): Self = this.set("distributorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistributorCode: Self = this.set("distributorCode", js.undefined)
    
    @scala.inline
    def setDistributorPassword(value: String): Self = this.set("distributorPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistributorPassword: Self = this.set("distributorPassword", js.undefined)
    
    @scala.inline
    def setPasswordRuleText(value: String): Self = this.set("passwordRuleText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordRuleText: Self = this.set("passwordRuleText", js.undefined)
    
    @scala.inline
    def setPlanPromotionText(value: String): Self = this.set("planPromotionText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlanPromotionText: Self = this.set("planPromotionText", js.undefined)
    
    @scala.inline
    def setPurchaseOrderOrPromAllowed(value: String): Self = this.set("purchaseOrderOrPromAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurchaseOrderOrPromAllowed: Self = this.set("purchaseOrderOrPromAllowed", js.undefined)
  }
}
