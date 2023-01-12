package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityUser extends StObject {
  
  var email: js.UndefOr[String | Null] = js.undefined
  
  var enabled: Boolean
  
  var full_name: js.UndefOr[Name | Null] = js.undefined
  
  var metadata: Metadata
  
  var profile_uid: js.UndefOr[SecurityUserProfileId] = js.undefined
  
  var roles: js.Array[String]
  
  var username: Username
}
object SecurityUser {
  
  inline def apply(enabled: Boolean, metadata: Metadata, roles: js.Array[String], username: Username): SecurityUser = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityUser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityUser] (val x: Self) extends AnyVal {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setFull_name(value: Name): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
    
    inline def setFull_nameNull: Self = StObject.set(x, "full_name", null)
    
    inline def setFull_nameUndefined: Self = StObject.set(x, "full_name", js.undefined)
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setProfile_uid(value: SecurityUserProfileId): Self = StObject.set(x, "profile_uid", value.asInstanceOf[js.Any])
    
    inline def setProfile_uidUndefined: Self = StObject.set(x, "profile_uid", js.undefined)
    
    inline def setRoles(value: js.Array[String]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value*))
    
    inline def setUsername(value: Username): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
