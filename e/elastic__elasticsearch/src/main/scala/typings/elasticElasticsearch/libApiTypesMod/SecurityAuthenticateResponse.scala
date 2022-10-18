package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityAuthenticateResponse extends StObject {
  
  var api_key: js.UndefOr[SecurityApiKey] = js.undefined
  
  var authentication_realm: SecurityRealmInfo
  
  var authentication_type: String
  
  var email: js.UndefOr[String | Null] = js.undefined
  
  var enabled: Boolean
  
  var full_name: js.UndefOr[Name | Null] = js.undefined
  
  var lookup_realm: SecurityRealmInfo
  
  var metadata: Metadata
  
  var roles: js.Array[String]
  
  var token: js.UndefOr[SecurityAuthenticateToken] = js.undefined
  
  var username: Username
}
object SecurityAuthenticateResponse {
  
  inline def apply(
    authentication_realm: SecurityRealmInfo,
    authentication_type: String,
    enabled: Boolean,
    lookup_realm: SecurityRealmInfo,
    metadata: Metadata,
    roles: js.Array[String],
    username: Username
  ): SecurityAuthenticateResponse = {
    val __obj = js.Dynamic.literal(authentication_realm = authentication_realm.asInstanceOf[js.Any], authentication_type = authentication_type.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], lookup_realm = lookup_realm.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityAuthenticateResponse]
  }
  
  extension [Self <: SecurityAuthenticateResponse](x: Self) {
    
    inline def setApi_key(value: SecurityApiKey): Self = StObject.set(x, "api_key", value.asInstanceOf[js.Any])
    
    inline def setApi_keyUndefined: Self = StObject.set(x, "api_key", js.undefined)
    
    inline def setAuthentication_realm(value: SecurityRealmInfo): Self = StObject.set(x, "authentication_realm", value.asInstanceOf[js.Any])
    
    inline def setAuthentication_type(value: String): Self = StObject.set(x, "authentication_type", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setFull_name(value: Name): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
    
    inline def setFull_nameNull: Self = StObject.set(x, "full_name", null)
    
    inline def setFull_nameUndefined: Self = StObject.set(x, "full_name", js.undefined)
    
    inline def setLookup_realm(value: SecurityRealmInfo): Self = StObject.set(x, "lookup_realm", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setRoles(value: js.Array[String]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value*))
    
    inline def setToken(value: SecurityAuthenticateToken): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    inline def setUsername(value: Username): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
