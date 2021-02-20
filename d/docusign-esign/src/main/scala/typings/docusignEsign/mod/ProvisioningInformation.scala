package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvisioningInformation extends StObject {
  
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
  implicit class ProvisioningInformationMutableBuilder[Self <: ProvisioningInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultConnectionId(value: String): Self = StObject.set(x, "defaultConnectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultConnectionIdUndefined: Self = StObject.set(x, "defaultConnectionId", js.undefined)
    
    @scala.inline
    def setDefaultPlanId(value: String): Self = StObject.set(x, "defaultPlanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPlanIdUndefined: Self = StObject.set(x, "defaultPlanId", js.undefined)
    
    @scala.inline
    def setDistributorCode(value: String): Self = StObject.set(x, "distributorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributorCodeUndefined: Self = StObject.set(x, "distributorCode", js.undefined)
    
    @scala.inline
    def setDistributorPassword(value: String): Self = StObject.set(x, "distributorPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributorPasswordUndefined: Self = StObject.set(x, "distributorPassword", js.undefined)
    
    @scala.inline
    def setPasswordRuleText(value: String): Self = StObject.set(x, "passwordRuleText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordRuleTextUndefined: Self = StObject.set(x, "passwordRuleText", js.undefined)
    
    @scala.inline
    def setPlanPromotionText(value: String): Self = StObject.set(x, "planPromotionText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanPromotionTextUndefined: Self = StObject.set(x, "planPromotionText", js.undefined)
    
    @scala.inline
    def setPurchaseOrderOrPromAllowed(value: String): Self = StObject.set(x, "purchaseOrderOrPromAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurchaseOrderOrPromAllowedUndefined: Self = StObject.set(x, "purchaseOrderOrPromAllowed", js.undefined)
  }
}
