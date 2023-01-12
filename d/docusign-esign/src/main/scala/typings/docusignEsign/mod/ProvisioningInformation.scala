package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisioningInformation extends StObject {
  
  var defaultConnectionId: js.UndefOr[String] = js.undefined
  
  var defaultPlanId: js.UndefOr[String] = js.undefined
  
  /**
    * The code that identifies the billing plan groups and plans for the new account.
    */
  var distributorCode: js.UndefOr[String] = js.undefined
  
  /**
    * The password for the `distributorCode`.
    */
  var distributorPassword: js.UndefOr[String] = js.undefined
  
  var passwordRuleText: js.UndefOr[String] = js.undefined
  
  var planPromotionText: js.UndefOr[String] = js.undefined
  
  var purchaseOrderOrPromAllowed: js.UndefOr[String] = js.undefined
}
object ProvisioningInformation {
  
  inline def apply(): ProvisioningInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisioningInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProvisioningInformation] (val x: Self) extends AnyVal {
    
    inline def setDefaultConnectionId(value: String): Self = StObject.set(x, "defaultConnectionId", value.asInstanceOf[js.Any])
    
    inline def setDefaultConnectionIdUndefined: Self = StObject.set(x, "defaultConnectionId", js.undefined)
    
    inline def setDefaultPlanId(value: String): Self = StObject.set(x, "defaultPlanId", value.asInstanceOf[js.Any])
    
    inline def setDefaultPlanIdUndefined: Self = StObject.set(x, "defaultPlanId", js.undefined)
    
    inline def setDistributorCode(value: String): Self = StObject.set(x, "distributorCode", value.asInstanceOf[js.Any])
    
    inline def setDistributorCodeUndefined: Self = StObject.set(x, "distributorCode", js.undefined)
    
    inline def setDistributorPassword(value: String): Self = StObject.set(x, "distributorPassword", value.asInstanceOf[js.Any])
    
    inline def setDistributorPasswordUndefined: Self = StObject.set(x, "distributorPassword", js.undefined)
    
    inline def setPasswordRuleText(value: String): Self = StObject.set(x, "passwordRuleText", value.asInstanceOf[js.Any])
    
    inline def setPasswordRuleTextUndefined: Self = StObject.set(x, "passwordRuleText", js.undefined)
    
    inline def setPlanPromotionText(value: String): Self = StObject.set(x, "planPromotionText", value.asInstanceOf[js.Any])
    
    inline def setPlanPromotionTextUndefined: Self = StObject.set(x, "planPromotionText", js.undefined)
    
    inline def setPurchaseOrderOrPromAllowed(value: String): Self = StObject.set(x, "purchaseOrderOrPromAllowed", value.asInstanceOf[js.Any])
    
    inline def setPurchaseOrderOrPromAllowedUndefined: Self = StObject.set(x, "purchaseOrderOrPromAllowed", js.undefined)
  }
}
