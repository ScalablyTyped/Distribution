package typings.googleCloudSpanner.protosMod.google.iam.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an AuditConfig. */
trait IAuditConfig extends StObject {
  
  /** AuditConfig auditLogConfigs */
  var auditLogConfigs: js.UndefOr[js.Array[IAuditLogConfig] | Null] = js.undefined
  
  /** AuditConfig service */
  var service: js.UndefOr[String | Null] = js.undefined
}
object IAuditConfig {
  
  inline def apply(): IAuditConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAuditConfig]
  }
  
  extension [Self <: IAuditConfig](x: Self) {
    
    inline def setAuditLogConfigs(value: js.Array[IAuditLogConfig]): Self = StObject.set(x, "auditLogConfigs", value.asInstanceOf[js.Any])
    
    inline def setAuditLogConfigsNull: Self = StObject.set(x, "auditLogConfigs", null)
    
    inline def setAuditLogConfigsUndefined: Self = StObject.set(x, "auditLogConfigs", js.undefined)
    
    inline def setAuditLogConfigsVarargs(value: IAuditLogConfig*): Self = StObject.set(x, "auditLogConfigs", js.Array(value*))
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceNull: Self = StObject.set(x, "service", null)
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
