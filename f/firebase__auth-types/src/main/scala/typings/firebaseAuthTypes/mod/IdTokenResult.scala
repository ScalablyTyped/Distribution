package typings.firebaseAuthTypes.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdTokenResult extends StObject {
  
  var authTime: String = js.native
  
  var claims: StringDictionary[js.Any] = js.native
  
  var expirationTime: String = js.native
  
  var issuedAtTime: String = js.native
  
  var signInProvider: String | Null = js.native
  
  var signInSecondFactor: String | Null = js.native
  
  var token: String = js.native
}
object IdTokenResult {
  
  @scala.inline
  def apply(
    authTime: String,
    claims: StringDictionary[js.Any],
    expirationTime: String,
    issuedAtTime: String,
    token: String
  ): IdTokenResult = {
    val __obj = js.Dynamic.literal(authTime = authTime.asInstanceOf[js.Any], claims = claims.asInstanceOf[js.Any], expirationTime = expirationTime.asInstanceOf[js.Any], issuedAtTime = issuedAtTime.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdTokenResult]
  }
  
  @scala.inline
  implicit class IdTokenResultMutableBuilder[Self <: IdTokenResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthTime(value: String): Self = StObject.set(x, "authTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClaims(value: StringDictionary[js.Any]): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationTime(value: String): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuedAtTime(value: String): Self = StObject.set(x, "issuedAtTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignInProvider(value: String): Self = StObject.set(x, "signInProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignInProviderNull: Self = StObject.set(x, "signInProvider", null)
    
    @scala.inline
    def setSignInSecondFactor(value: String): Self = StObject.set(x, "signInSecondFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignInSecondFactorNull: Self = StObject.set(x, "signInSecondFactor", null)
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
