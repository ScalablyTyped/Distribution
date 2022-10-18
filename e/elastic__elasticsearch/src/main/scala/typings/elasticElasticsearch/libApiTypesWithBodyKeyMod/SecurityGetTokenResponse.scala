package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGetTokenResponse extends StObject {
  
  var access_token: String
  
  var authentication: SecurityGetTokenAuthenticatedUser
  
  var expires_in: long
  
  var kerberos_authentication_response_token: js.UndefOr[String] = js.undefined
  
  var refresh_token: js.UndefOr[String] = js.undefined
  
  var scope: js.UndefOr[String] = js.undefined
  
  var `type`: String
}
object SecurityGetTokenResponse {
  
  inline def apply(
    access_token: String,
    authentication: SecurityGetTokenAuthenticatedUser,
    expires_in: long,
    `type`: String
  ): SecurityGetTokenResponse = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], authentication = authentication.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGetTokenResponse]
  }
  
  extension [Self <: SecurityGetTokenResponse](x: Self) {
    
    inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    inline def setAuthentication(value: SecurityGetTokenAuthenticatedUser): Self = StObject.set(x, "authentication", value.asInstanceOf[js.Any])
    
    inline def setExpires_in(value: long): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
    
    inline def setKerberos_authentication_response_token(value: String): Self = StObject.set(x, "kerberos_authentication_response_token", value.asInstanceOf[js.Any])
    
    inline def setKerberos_authentication_response_tokenUndefined: Self = StObject.set(x, "kerberos_authentication_response_token", js.undefined)
    
    inline def setRefresh_token(value: String): Self = StObject.set(x, "refresh_token", value.asInstanceOf[js.Any])
    
    inline def setRefresh_tokenUndefined: Self = StObject.set(x, "refresh_token", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
