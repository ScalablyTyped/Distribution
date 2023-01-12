package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityUserProfileUser extends StObject {
  
  var email: js.UndefOr[String | Null] = js.undefined
  
  var full_name: js.UndefOr[Name | Null] = js.undefined
  
  var realm_domain: js.UndefOr[Name] = js.undefined
  
  var realm_name: Name
  
  var roles: js.Array[String]
  
  var username: Username
}
object SecurityUserProfileUser {
  
  inline def apply(realm_name: Name, roles: js.Array[String], username: Username): SecurityUserProfileUser = {
    val __obj = js.Dynamic.literal(realm_name = realm_name.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityUserProfileUser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityUserProfileUser] (val x: Self) extends AnyVal {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setFull_name(value: Name): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
    
    inline def setFull_nameNull: Self = StObject.set(x, "full_name", null)
    
    inline def setFull_nameUndefined: Self = StObject.set(x, "full_name", js.undefined)
    
    inline def setRealm_domain(value: Name): Self = StObject.set(x, "realm_domain", value.asInstanceOf[js.Any])
    
    inline def setRealm_domainUndefined: Self = StObject.set(x, "realm_domain", js.undefined)
    
    inline def setRealm_name(value: Name): Self = StObject.set(x, "realm_name", value.asInstanceOf[js.Any])
    
    inline def setRoles(value: js.Array[String]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value*))
    
    inline def setUsername(value: Username): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
