package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityUser extends StObject {
  
  var email: js.UndefOr[String | Null] = js.undefined
  
  var enabled: Boolean
  
  var full_name: js.UndefOr[Name | Null] = js.undefined
  
  var metadata: Metadata
  
  var roles: js.Array[String]
  
  var username: Username
}
object SecurityUser {
  
  inline def apply(enabled: Boolean, metadata: Metadata, roles: js.Array[String], username: Username): SecurityUser = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityUser]
  }
  
  extension [Self <: SecurityUser](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setFull_name(value: Name): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
    
    inline def setFull_nameNull: Self = StObject.set(x, "full_name", null)
    
    inline def setFull_nameUndefined: Self = StObject.set(x, "full_name", js.undefined)
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setRoles(value: js.Array[String]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value*))
    
    inline def setUsername(value: Username): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
