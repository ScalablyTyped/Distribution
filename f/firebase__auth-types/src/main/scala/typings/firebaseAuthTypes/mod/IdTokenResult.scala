package typings.firebaseAuthTypes.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdTokenResult extends StObject {
  
  var authTime: String
  
  var claims: StringDictionary[js.Any]
  
  var expirationTime: String
  
  var issuedAtTime: String
  
  var signInProvider: String | Null
  
  var signInSecondFactor: String | Null
  
  var token: String
}
object IdTokenResult {
  
  inline def apply(
    authTime: String,
    claims: StringDictionary[js.Any],
    expirationTime: String,
    issuedAtTime: String,
    token: String
  ): IdTokenResult = {
    val __obj = js.Dynamic.literal(authTime = authTime.asInstanceOf[js.Any], claims = claims.asInstanceOf[js.Any], expirationTime = expirationTime.asInstanceOf[js.Any], issuedAtTime = issuedAtTime.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], signInProvider = null, signInSecondFactor = null)
    __obj.asInstanceOf[IdTokenResult]
  }
  
  extension [Self <: IdTokenResult](x: Self) {
    
    inline def setAuthTime(value: String): Self = StObject.set(x, "authTime", value.asInstanceOf[js.Any])
    
    inline def setClaims(value: StringDictionary[js.Any]): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
    
    inline def setExpirationTime(value: String): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    inline def setIssuedAtTime(value: String): Self = StObject.set(x, "issuedAtTime", value.asInstanceOf[js.Any])
    
    inline def setSignInProvider(value: String): Self = StObject.set(x, "signInProvider", value.asInstanceOf[js.Any])
    
    inline def setSignInProviderNull: Self = StObject.set(x, "signInProvider", null)
    
    inline def setSignInSecondFactor(value: String): Self = StObject.set(x, "signInSecondFactor", value.asInstanceOf[js.Any])
    
    inline def setSignInSecondFactorNull: Self = StObject.set(x, "signInSecondFactor", null)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
