package typings.googleapis.apigatewayV1betaMod.apigatewayV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApigatewayAuditConfig extends StObject {
  
  /**
    * The configuration for logging of each type of permission.
    */
  var auditLogConfigs: js.UndefOr[js.Array[SchemaApigatewayAuditLogConfig]] = js.undefined
  
  /**
    * Specifies a service that will be enabled for audit logging. For example, `storage.googleapis.com`, `cloudsql.googleapis.com`. `allServices` is a special value that covers all services.
    */
  var service: js.UndefOr[String | Null] = js.undefined
}
object SchemaApigatewayAuditConfig {
  
  inline def apply(): SchemaApigatewayAuditConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApigatewayAuditConfig]
  }
  
  extension [Self <: SchemaApigatewayAuditConfig](x: Self) {
    
    inline def setAuditLogConfigs(value: js.Array[SchemaApigatewayAuditLogConfig]): Self = StObject.set(x, "auditLogConfigs", value.asInstanceOf[js.Any])
    
    inline def setAuditLogConfigsUndefined: Self = StObject.set(x, "auditLogConfigs", js.undefined)
    
    inline def setAuditLogConfigsVarargs(value: SchemaApigatewayAuditLogConfig*): Self = StObject.set(x, "auditLogConfigs", js.Array(value*))
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceNull: Self = StObject.set(x, "service", null)
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
