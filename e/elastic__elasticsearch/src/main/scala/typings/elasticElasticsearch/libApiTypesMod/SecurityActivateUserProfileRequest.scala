package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityActivateUserProfileRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var access_token: js.UndefOr[String] = js.undefined
  
  var grant_type: SecurityGrantType
  
  var password: js.UndefOr[String] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
}
object SecurityActivateUserProfileRequest {
  
  inline def apply(grant_type: SecurityGrantType): SecurityActivateUserProfileRequest = {
    val __obj = js.Dynamic.literal(grant_type = grant_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityActivateUserProfileRequest]
  }
  
  extension [Self <: SecurityActivateUserProfileRequest](x: Self) {
    
    inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
    
    inline def setGrant_type(value: SecurityGrantType): Self = StObject.set(x, "grant_type", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
