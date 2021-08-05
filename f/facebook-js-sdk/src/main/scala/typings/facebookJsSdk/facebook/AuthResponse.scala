package typings.facebookJsSdk.facebook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////////
//
//  RESPONSES
//
////////////////////////
trait AuthResponse extends StObject {
  
  var accessToken: String
  
  var expiresIn: Double
  
  var grantedScopes: js.UndefOr[String] = js.undefined
  
  var reauthorize_required_in: js.UndefOr[Double] = js.undefined
  
  var signedRequest: String
  
  var userID: String
}
object AuthResponse {
  
  inline def apply(accessToken: String, expiresIn: Double, signedRequest: String, userID: String): AuthResponse = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any], signedRequest = signedRequest.asInstanceOf[js.Any], userID = userID.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthResponse]
  }
  
  extension [Self <: AuthResponse](x: Self) {
    
    inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    inline def setExpiresIn(value: Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
    
    inline def setGrantedScopes(value: String): Self = StObject.set(x, "grantedScopes", value.asInstanceOf[js.Any])
    
    inline def setGrantedScopesUndefined: Self = StObject.set(x, "grantedScopes", js.undefined)
    
    inline def setReauthorize_required_in(value: Double): Self = StObject.set(x, "reauthorize_required_in", value.asInstanceOf[js.Any])
    
    inline def setReauthorize_required_inUndefined: Self = StObject.set(x, "reauthorize_required_in", js.undefined)
    
    inline def setSignedRequest(value: String): Self = StObject.set(x, "signedRequest", value.asInstanceOf[js.Any])
    
    inline def setUserID(value: String): Self = StObject.set(x, "userID", value.asInstanceOf[js.Any])
  }
}
