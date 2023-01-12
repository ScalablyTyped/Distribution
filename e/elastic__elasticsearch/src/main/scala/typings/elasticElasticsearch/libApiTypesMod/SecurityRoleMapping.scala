package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityRoleMapping extends StObject {
  
  var enabled: Boolean
  
  var metadata: Metadata
  
  var role_templates: js.UndefOr[js.Array[SecurityGetRoleRoleTemplate]] = js.undefined
  
  var roles: js.Array[String]
  
  var rules: SecurityRoleMappingRule
}
object SecurityRoleMapping {
  
  inline def apply(enabled: Boolean, metadata: Metadata, roles: js.Array[String], rules: SecurityRoleMappingRule): SecurityRoleMapping = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityRoleMapping]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityRoleMapping] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setRole_templates(value: js.Array[SecurityGetRoleRoleTemplate]): Self = StObject.set(x, "role_templates", value.asInstanceOf[js.Any])
    
    inline def setRole_templatesUndefined: Self = StObject.set(x, "role_templates", js.undefined)
    
    inline def setRole_templatesVarargs(value: SecurityGetRoleRoleTemplate*): Self = StObject.set(x, "role_templates", js.Array(value*))
    
    inline def setRoles(value: js.Array[String]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value*))
    
    inline def setRules(value: SecurityRoleMappingRule): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
  }
}
