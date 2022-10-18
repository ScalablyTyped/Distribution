package typings.firebaseAuth.distCordovaSrcModelPublicTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdTokenResult extends StObject {
  
  /**
    * The authentication time formatted as a UTC string.
    *
    * @remarks
    * This is the time the user authenticated (signed in) and not the time the token was refreshed.
    */
  var authTime: String
  
  /**
    * The entire payload claims of the ID token including the standard reserved claims as well as
    * the custom claims.
    */
  var claims: ParsedToken
  
  /** The ID token expiration time formatted as a UTC string. */
  var expirationTime: String
  
  /** The ID token issuance time formatted as a UTC string. */
  var issuedAtTime: String
  
  /**
    * The sign-in provider through which the ID token was obtained (anonymous, custom, phone,
    * password, etc).
    *
    * @remarks
    * Note, this does not map to provider IDs.
    */
  var signInProvider: String | Null
  
  /**
    * The type of second factor associated with this session, provided the user was multi-factor
    * authenticated (eg. phone, etc).
    */
  var signInSecondFactor: String | Null
  
  /** The Firebase Auth ID token JWT string. */
  var token: String
}
object IdTokenResult {
  
  inline def apply(authTime: String, claims: ParsedToken, expirationTime: String, issuedAtTime: String, token: String): IdTokenResult = {
    val __obj = js.Dynamic.literal(authTime = authTime.asInstanceOf[js.Any], claims = claims.asInstanceOf[js.Any], expirationTime = expirationTime.asInstanceOf[js.Any], issuedAtTime = issuedAtTime.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], signInProvider = null, signInSecondFactor = null)
    __obj.asInstanceOf[IdTokenResult]
  }
  
  extension [Self <: IdTokenResult](x: Self) {
    
    inline def setAuthTime(value: String): Self = StObject.set(x, "authTime", value.asInstanceOf[js.Any])
    
    inline def setClaims(value: ParsedToken): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
    
    inline def setExpirationTime(value: String): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    inline def setIssuedAtTime(value: String): Self = StObject.set(x, "issuedAtTime", value.asInstanceOf[js.Any])
    
    inline def setSignInProvider(value: String): Self = StObject.set(x, "signInProvider", value.asInstanceOf[js.Any])
    
    inline def setSignInProviderNull: Self = StObject.set(x, "signInProvider", null)
    
    inline def setSignInSecondFactor(value: String): Self = StObject.set(x, "signInSecondFactor", value.asInstanceOf[js.Any])
    
    inline def setSignInSecondFactorNull: Self = StObject.set(x, "signInSecondFactor", null)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
