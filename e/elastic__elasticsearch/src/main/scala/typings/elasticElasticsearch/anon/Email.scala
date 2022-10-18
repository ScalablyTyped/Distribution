package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Username
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Email extends StObject {
  
  var email: js.UndefOr[String | Null] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var full_name: js.UndefOr[String | Null] = js.undefined
  
  var metadata: js.UndefOr[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Metadata] = js.undefined
  
  var password: js.UndefOr[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Password] = js.undefined
  
  var password_hash: js.UndefOr[String] = js.undefined
  
  var roles: js.UndefOr[js.Array[String]] = js.undefined
  
  var username: js.UndefOr[Username] = js.undefined
}
object Email {
  
  inline def apply(): Email = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Email]
  }
  
  extension [Self <: Email](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
    
    inline def setFull_nameNull: Self = StObject.set(x, "full_name", null)
    
    inline def setFull_nameUndefined: Self = StObject.set(x, "full_name", js.undefined)
    
    inline def setMetadata(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setPassword(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Password): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setPassword_hash(value: String): Self = StObject.set(x, "password_hash", value.asInstanceOf[js.Any])
    
    inline def setPassword_hashUndefined: Self = StObject.set(x, "password_hash", js.undefined)
    
    inline def setRoles(value: js.Array[String]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    inline def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value*))
    
    inline def setUsername(value: Username): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
