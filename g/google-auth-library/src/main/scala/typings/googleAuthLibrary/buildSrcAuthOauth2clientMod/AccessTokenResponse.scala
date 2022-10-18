package typings.googleAuthLibrary.buildSrcAuthOauth2clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessTokenResponse extends StObject {
  
  var access_token: String
  
  var expiry_date: Double
}
object AccessTokenResponse {
  
  inline def apply(access_token: String, expiry_date: Double): AccessTokenResponse = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expiry_date = expiry_date.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessTokenResponse]
  }
  
  extension [Self <: AccessTokenResponse](x: Self) {
    
    inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    inline def setExpiry_date(value: Double): Self = StObject.set(x, "expiry_date", value.asInstanceOf[js.Any])
  }
}
