package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityPutUserRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var email: js.UndefOr[String | Null] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var full_name: js.UndefOr[String | Null] = js.undefined
  
  var metadata: js.UndefOr[Metadata] = js.undefined
  
  var password: js.UndefOr[Password] = js.undefined
  
  var password_hash: js.UndefOr[String] = js.undefined
  
  var refresh: js.UndefOr[Refresh] = js.undefined
  
  var roles: js.UndefOr[js.Array[String]] = js.undefined
  
  var username: Username
}
object SecurityPutUserRequest {
  
  inline def apply(username: Username): SecurityPutUserRequest = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityPutUserRequest]
  }
  
  extension [Self <: SecurityPutUserRequest](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
    
    inline def setFull_nameNull: Self = StObject.set(x, "full_name", null)
    
    inline def setFull_nameUndefined: Self = StObject.set(x, "full_name", js.undefined)
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setPassword(value: Password): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setPassword_hash(value: String): Self = StObject.set(x, "password_hash", value.asInstanceOf[js.Any])
    
    inline def setPassword_hashUndefined: Self = StObject.set(x, "password_hash", js.undefined)
    
    inline def setRefresh(value: Refresh): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    
    inline def setRoles(value: js.Array[String]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    inline def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value*))
    
    inline def setUsername(value: Username): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
