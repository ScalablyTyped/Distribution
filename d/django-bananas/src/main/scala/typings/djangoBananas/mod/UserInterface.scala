package typings.djangoBananas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserInterface extends StObject {
  
  var email: String
  
  var full_name: String
  
  var groups: js.Array[String]
  
  var id: Double
  
  var is_superuser: Boolean
  
  var permissions: js.Array[String]
  
  var username: js.UndefOr[String] = js.undefined
}
object UserInterface {
  
  inline def apply(
    email: String,
    full_name: String,
    groups: js.Array[String],
    id: Double,
    is_superuser: Boolean,
    permissions: js.Array[String]
  ): UserInterface = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_superuser = is_superuser.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserInterface]
  }
  
  extension [Self <: UserInterface](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
    
    inline def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value*))
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIs_superuser(value: Boolean): Self = StObject.set(x, "is_superuser", value.asInstanceOf[js.Any])
    
    inline def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value*))
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
