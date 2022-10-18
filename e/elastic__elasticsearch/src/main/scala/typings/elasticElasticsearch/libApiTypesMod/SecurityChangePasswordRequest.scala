package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityChangePasswordRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var password: js.UndefOr[Password] = js.undefined
  
  var password_hash: js.UndefOr[String] = js.undefined
  
  var refresh: js.UndefOr[Refresh] = js.undefined
  
  var username: js.UndefOr[Username] = js.undefined
}
object SecurityChangePasswordRequest {
  
  inline def apply(): SecurityChangePasswordRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityChangePasswordRequest]
  }
  
  extension [Self <: SecurityChangePasswordRequest](x: Self) {
    
    inline def setPassword(value: Password): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setPassword_hash(value: String): Self = StObject.set(x, "password_hash", value.asInstanceOf[js.Any])
    
    inline def setPassword_hashUndefined: Self = StObject.set(x, "password_hash", js.undefined)
    
    inline def setRefresh(value: Refresh): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    
    inline def setUsername(value: Username): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
