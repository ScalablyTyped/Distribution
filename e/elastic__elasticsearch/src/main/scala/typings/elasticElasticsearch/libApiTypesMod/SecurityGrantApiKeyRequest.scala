package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGrantApiKeyRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var access_token: js.UndefOr[String] = js.undefined
  
  var api_key: SecurityGrantApiKeyGrantApiKey
  
  var grant_type: SecurityGrantApiKeyApiKeyGrantType
  
  var password: js.UndefOr[Password] = js.undefined
  
  var run_as: js.UndefOr[Username] = js.undefined
  
  var username: js.UndefOr[Username] = js.undefined
}
object SecurityGrantApiKeyRequest {
  
  inline def apply(api_key: SecurityGrantApiKeyGrantApiKey, grant_type: SecurityGrantApiKeyApiKeyGrantType): SecurityGrantApiKeyRequest = {
    val __obj = js.Dynamic.literal(api_key = api_key.asInstanceOf[js.Any], grant_type = grant_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGrantApiKeyRequest]
  }
  
  extension [Self <: SecurityGrantApiKeyRequest](x: Self) {
    
    inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
    
    inline def setApi_key(value: SecurityGrantApiKeyGrantApiKey): Self = StObject.set(x, "api_key", value.asInstanceOf[js.Any])
    
    inline def setGrant_type(value: SecurityGrantApiKeyApiKeyGrantType): Self = StObject.set(x, "grant_type", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: Password): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setRun_as(value: Username): Self = StObject.set(x, "run_as", value.asInstanceOf[js.Any])
    
    inline def setRun_asUndefined: Self = StObject.set(x, "run_as", js.undefined)
    
    inline def setUsername(value: Username): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
