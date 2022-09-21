package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAuditConfig extends StObject {
  
  /**
    * The configuration for logging of each type of permission.
    */
  var auditLogConfigs: js.UndefOr[js.Array[SchemaAuditLogConfig]] = js.undefined
  
  /**
    * This is deprecated and has no effect. Do not use.
    */
  var exemptedMembers: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Specifies a service that will be enabled for audit logging. For example, `storage.googleapis.com`, `cloudsql.googleapis.com`. `allServices` is a special value that covers all services.
    */
  var service: js.UndefOr[String | Null] = js.undefined
}
object SchemaAuditConfig {
  
  inline def apply(): SchemaAuditConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuditConfig]
  }
  
  extension [Self <: SchemaAuditConfig](x: Self) {
    
    inline def setAuditLogConfigs(value: js.Array[SchemaAuditLogConfig]): Self = StObject.set(x, "auditLogConfigs", value.asInstanceOf[js.Any])
    
    inline def setAuditLogConfigsUndefined: Self = StObject.set(x, "auditLogConfigs", js.undefined)
    
    inline def setAuditLogConfigsVarargs(value: SchemaAuditLogConfig*): Self = StObject.set(x, "auditLogConfigs", js.Array(value*))
    
    inline def setExemptedMembers(value: js.Array[String]): Self = StObject.set(x, "exemptedMembers", value.asInstanceOf[js.Any])
    
    inline def setExemptedMembersNull: Self = StObject.set(x, "exemptedMembers", null)
    
    inline def setExemptedMembersUndefined: Self = StObject.set(x, "exemptedMembers", js.undefined)
    
    inline def setExemptedMembersVarargs(value: String*): Self = StObject.set(x, "exemptedMembers", js.Array(value*))
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceNull: Self = StObject.set(x, "service", null)
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
