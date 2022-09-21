package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSpecificNonComplianceContext extends StObject {
  
  /**
    * Additional context for non-compliance related to Wi-Fi configuration. See ONC_WIFI_INVALID_VALUE and ONC_WIFI_API_LEVEL
    */
  var oncWifiContext: js.UndefOr[SchemaOncWifiContext] = js.undefined
  
  /**
    * Additional context for non-compliance related to password policies. See PASSWORD_POLICIES_PASSWORD_EXPIRED and PASSWORD_POLICIES_PASSWORD_NOT_SUFFICIENT.
    */
  var passwordPoliciesContext: js.UndefOr[SchemaPasswordPoliciesContext] = js.undefined
}
object SchemaSpecificNonComplianceContext {
  
  inline def apply(): SchemaSpecificNonComplianceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSpecificNonComplianceContext]
  }
  
  extension [Self <: SchemaSpecificNonComplianceContext](x: Self) {
    
    inline def setOncWifiContext(value: SchemaOncWifiContext): Self = StObject.set(x, "oncWifiContext", value.asInstanceOf[js.Any])
    
    inline def setOncWifiContextUndefined: Self = StObject.set(x, "oncWifiContext", js.undefined)
    
    inline def setPasswordPoliciesContext(value: SchemaPasswordPoliciesContext): Self = StObject.set(x, "passwordPoliciesContext", value.asInstanceOf[js.Any])
    
    inline def setPasswordPoliciesContextUndefined: Self = StObject.set(x, "passwordPoliciesContext", js.undefined)
  }
}
