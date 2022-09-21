package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomerSettings extends StObject {
  
  /**
    * Audit Logging settings for the customer. If update_mask is empty then this field will be updated based on UpdateCustomerSettings request.
    */
  var auditLoggingSettings: js.UndefOr[SchemaAuditLoggingSettings] = js.undefined
  
  /**
    * VPC SC settings for the customer. If update_mask is empty then this field will be updated based on UpdateCustomerSettings request.
    */
  var vpcSettings: js.UndefOr[SchemaVPCSettings] = js.undefined
}
object SchemaCustomerSettings {
  
  inline def apply(): SchemaCustomerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomerSettings]
  }
  
  extension [Self <: SchemaCustomerSettings](x: Self) {
    
    inline def setAuditLoggingSettings(value: SchemaAuditLoggingSettings): Self = StObject.set(x, "auditLoggingSettings", value.asInstanceOf[js.Any])
    
    inline def setAuditLoggingSettingsUndefined: Self = StObject.set(x, "auditLoggingSettings", js.undefined)
    
    inline def setVpcSettings(value: SchemaVPCSettings): Self = StObject.set(x, "vpcSettings", value.asInstanceOf[js.Any])
    
    inline def setVpcSettingsUndefined: Self = StObject.set(x, "vpcSettings", js.undefined)
  }
}
