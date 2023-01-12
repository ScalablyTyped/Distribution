package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageSecurity
  extends StObject
     with XpackUsageBase {
  
  var anonymous: XpackUsageFeatureToggle
  
  var api_key_service: XpackUsageFeatureToggle
  
  var audit: XpackUsageAudit
  
  var fips_140: XpackUsageFeatureToggle
  
  var ipfilter: XpackUsageIpFilter
  
  var operator_privileges: XpackUsageBase
  
  var realms: Record[String, XpackUsageRealm]
  
  var role_mapping: Record[String, XpackUsageRoleMapping]
  
  var roles: XpackUsageSecurityRoles
  
  var ssl: XpackUsageSsl
  
  var system_key: js.UndefOr[XpackUsageFeatureToggle] = js.undefined
  
  var token_service: XpackUsageFeatureToggle
}
object XpackUsageSecurity {
  
  inline def apply(
    anonymous: XpackUsageFeatureToggle,
    api_key_service: XpackUsageFeatureToggle,
    audit: XpackUsageAudit,
    available: Boolean,
    enabled: Boolean,
    fips_140: XpackUsageFeatureToggle,
    ipfilter: XpackUsageIpFilter,
    operator_privileges: XpackUsageBase,
    realms: Record[String, XpackUsageRealm],
    role_mapping: Record[String, XpackUsageRoleMapping],
    roles: XpackUsageSecurityRoles,
    ssl: XpackUsageSsl,
    token_service: XpackUsageFeatureToggle
  ): XpackUsageSecurity = {
    val __obj = js.Dynamic.literal(anonymous = anonymous.asInstanceOf[js.Any], api_key_service = api_key_service.asInstanceOf[js.Any], audit = audit.asInstanceOf[js.Any], available = available.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], fips_140 = fips_140.asInstanceOf[js.Any], ipfilter = ipfilter.asInstanceOf[js.Any], operator_privileges = operator_privileges.asInstanceOf[js.Any], realms = realms.asInstanceOf[js.Any], role_mapping = role_mapping.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any], ssl = ssl.asInstanceOf[js.Any], token_service = token_service.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageSecurity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XpackUsageSecurity] (val x: Self) extends AnyVal {
    
    inline def setAnonymous(value: XpackUsageFeatureToggle): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
    
    inline def setApi_key_service(value: XpackUsageFeatureToggle): Self = StObject.set(x, "api_key_service", value.asInstanceOf[js.Any])
    
    inline def setAudit(value: XpackUsageAudit): Self = StObject.set(x, "audit", value.asInstanceOf[js.Any])
    
    inline def setFips_140(value: XpackUsageFeatureToggle): Self = StObject.set(x, "fips_140", value.asInstanceOf[js.Any])
    
    inline def setIpfilter(value: XpackUsageIpFilter): Self = StObject.set(x, "ipfilter", value.asInstanceOf[js.Any])
    
    inline def setOperator_privileges(value: XpackUsageBase): Self = StObject.set(x, "operator_privileges", value.asInstanceOf[js.Any])
    
    inline def setRealms(value: Record[String, XpackUsageRealm]): Self = StObject.set(x, "realms", value.asInstanceOf[js.Any])
    
    inline def setRole_mapping(value: Record[String, XpackUsageRoleMapping]): Self = StObject.set(x, "role_mapping", value.asInstanceOf[js.Any])
    
    inline def setRoles(value: XpackUsageSecurityRoles): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setSsl(value: XpackUsageSsl): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
    
    inline def setSystem_key(value: XpackUsageFeatureToggle): Self = StObject.set(x, "system_key", value.asInstanceOf[js.Any])
    
    inline def setSystem_keyUndefined: Self = StObject.set(x, "system_key", js.undefined)
    
    inline def setToken_service(value: XpackUsageFeatureToggle): Self = StObject.set(x, "token_service", value.asInstanceOf[js.Any])
  }
}
