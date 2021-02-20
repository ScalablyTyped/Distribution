package typings.firebase.mod.firebase.auth

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface representing ID token result obtained from
  * {@link firebase.User.getIdTokenResult}. It contains the ID token JWT string
  * and other helper properties for getting different data associated with the
  * token as well as all the decoded payload claims.
  *
  * Note that these claims are not to be trusted as they are parsed client side.
  * Only server side verification can guarantee the integrity of the token
  * claims.
  */
@js.native
trait IdTokenResult extends StObject {
  
  /**
    * The authentication time formatted as a UTC string. This is the time the
    * user authenticated (signed in) and not the time the token was refreshed.
    */
  var authTime: String = js.native
  
  /**
    * The entire payload claims of the ID token including the standard reserved
    * claims as well as the custom claims.
    */
  var claims: StringDictionary[js.Any] = js.native
  
  /**
    * The ID token expiration time formatted as a UTC string.
    */
  var expirationTime: String = js.native
  
  /**
    * The ID token issued at time formatted as a UTC string.
    */
  var issuedAtTime: String = js.native
  
  /**
    * The sign-in provider through which the ID token was obtained (anonymous,
    * custom, phone, password, etc). Note, this does not map to provider IDs.
    */
  var signInProvider: String | Null = js.native
  
  /**
    * The type of second factor associated with this session, provided the user
    * was multi-factor authenticated (eg. phone, etc).
    */
  var signInSecondFactor: String | Null = js.native
  
  /**
    * The Firebase Auth ID token JWT string.
    */
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
