package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SecurityGrantApiKeyApiKeyGrantType
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SecurityGrantApiKeyGrantApiKey
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Username
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Apikey extends StObject {
  
  var access_token: js.UndefOr[String] = js.undefined
  
  var api_key: SecurityGrantApiKeyGrantApiKey
  
  var grant_type: SecurityGrantApiKeyApiKeyGrantType
  
  var password: js.UndefOr[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Password] = js.undefined
  
  var username: js.UndefOr[Username] = js.undefined
}
object Apikey {
  
  inline def apply(api_key: SecurityGrantApiKeyGrantApiKey, grant_type: SecurityGrantApiKeyApiKeyGrantType): Apikey = {
    val __obj = js.Dynamic.literal(api_key = api_key.asInstanceOf[js.Any], grant_type = grant_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Apikey]
  }
  
  extension [Self <: Apikey](x: Self) {
    
    inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
    
    inline def setApi_key(value: SecurityGrantApiKeyGrantApiKey): Self = StObject.set(x, "api_key", value.asInstanceOf[js.Any])
    
    inline def setGrant_type(value: SecurityGrantApiKeyApiKeyGrantType): Self = StObject.set(x, "grant_type", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Password): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setUsername(value: Username): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
