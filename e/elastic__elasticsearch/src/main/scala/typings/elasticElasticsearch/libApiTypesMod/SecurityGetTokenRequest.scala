package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGetTokenRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var grant_type: js.UndefOr[SecurityGetTokenAccessTokenGrantType] = js.undefined
  
  var kerberos_ticket: js.UndefOr[String] = js.undefined
  
  var password: js.UndefOr[Password] = js.undefined
  
  var refresh_token: js.UndefOr[String] = js.undefined
  
  var scope: js.UndefOr[String] = js.undefined
  
  var username: js.UndefOr[Username] = js.undefined
}
object SecurityGetTokenRequest {
  
  inline def apply(): SecurityGetTokenRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityGetTokenRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityGetTokenRequest] (val x: Self) extends AnyVal {
    
    inline def setGrant_type(value: SecurityGetTokenAccessTokenGrantType): Self = StObject.set(x, "grant_type", value.asInstanceOf[js.Any])
    
    inline def setGrant_typeUndefined: Self = StObject.set(x, "grant_type", js.undefined)
    
    inline def setKerberos_ticket(value: String): Self = StObject.set(x, "kerberos_ticket", value.asInstanceOf[js.Any])
    
    inline def setKerberos_ticketUndefined: Self = StObject.set(x, "kerberos_ticket", js.undefined)
    
    inline def setPassword(value: Password): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setRefresh_token(value: String): Self = StObject.set(x, "refresh_token", value.asInstanceOf[js.Any])
    
    inline def setRefresh_tokenUndefined: Self = StObject.set(x, "refresh_token", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setUsername(value: Username): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
