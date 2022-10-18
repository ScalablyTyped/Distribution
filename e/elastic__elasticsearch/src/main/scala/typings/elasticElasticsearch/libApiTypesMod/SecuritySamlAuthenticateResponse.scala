package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecuritySamlAuthenticateResponse extends StObject {
  
  var access_token: String
  
  var expires_in: integer
  
  var realm: String
  
  var refresh_token: String
  
  var username: String
}
object SecuritySamlAuthenticateResponse {
  
  inline def apply(access_token: String, expires_in: integer, realm: String, refresh_token: String, username: String): SecuritySamlAuthenticateResponse = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any], refresh_token = refresh_token.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySamlAuthenticateResponse]
  }
  
  extension [Self <: SecuritySamlAuthenticateResponse](x: Self) {
    
    inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    inline def setExpires_in(value: integer): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
    
    inline def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
    
    inline def setRefresh_token(value: String): Self = StObject.set(x, "refresh_token", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
