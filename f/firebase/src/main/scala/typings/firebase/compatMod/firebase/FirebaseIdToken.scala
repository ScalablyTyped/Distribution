package typings.firebase.compatMod.firebase

import org.scalablytyped.runtime.StringDictionary
import typings.firebase.anon.Signinprovider
import typings.firebase.firebaseStrings.anonymous
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirebaseIdToken
  extends StObject
     with /** Custom claims set by the developer */
/* claim */ StringDictionary[Any] {
  
  /** Always set to PROJECT_ID */
  var aud: String
  
  /** The time the user authenticated, normally 'iat' */
  var auth_time: Double
  
  /** The user's primary email */
  var email: js.UndefOr[String] = js.undefined
  
  /** The user's email verification status */
  var email_verified: js.UndefOr[Boolean] = js.undefined
  
  /** The token expiry time, normally 'iat' + 3600 */
  var exp: Double
  
  /** Information on all identities linked to this user */
  var firebase: Signinprovider
  
  /** The token issue time, in seconds since epoch */
  var iat: Double
  
  /** Always set to https://securetoken.google.com/PROJECT_ID */
  var iss: String
  
  /** The user's display name */
  var name: js.UndefOr[String] = js.undefined
  
  /** The user's primary phone number */
  var phone_number: js.UndefOr[String] = js.undefined
  
  /** The user's profile photo URL */
  var picture: js.UndefOr[String] = js.undefined
  
  /** The sign in provider, only set when the provider is 'anonymous' */
  var provider_id: js.UndefOr[anonymous] = js.undefined
  
  /** The user's unique ID */
  var sub: String
  
  // NO LONGER SUPPORTED. Use "sub" instead. (Not a jsdoc comment to avoid generating docs.)
  var uid: js.UndefOr[scala.Nothing] = js.undefined
  
  /** The user's unique ID. Must be equal to 'sub' */
  var user_id: String
}
object FirebaseIdToken {
  
  inline def apply(
    aud: String,
    auth_time: Double,
    exp: Double,
    firebase: Signinprovider,
    iat: Double,
    iss: String,
    sub: String,
    user_id: String
  ): FirebaseIdToken = {
    val __obj = js.Dynamic.literal(aud = aud.asInstanceOf[js.Any], auth_time = auth_time.asInstanceOf[js.Any], exp = exp.asInstanceOf[js.Any], firebase = firebase.asInstanceOf[js.Any], iat = iat.asInstanceOf[js.Any], iss = iss.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirebaseIdToken]
  }
  
  extension [Self <: FirebaseIdToken](x: Self) {
    
    inline def setAud(value: String): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
    
    inline def setAuth_time(value: Double): Self = StObject.set(x, "auth_time", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setEmail_verified(value: Boolean): Self = StObject.set(x, "email_verified", value.asInstanceOf[js.Any])
    
    inline def setEmail_verifiedUndefined: Self = StObject.set(x, "email_verified", js.undefined)
    
    inline def setExp(value: Double): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
    
    inline def setFirebase(value: Signinprovider): Self = StObject.set(x, "firebase", value.asInstanceOf[js.Any])
    
    inline def setIat(value: Double): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
    
    inline def setIss(value: String): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
    
    inline def setPhone_numberUndefined: Self = StObject.set(x, "phone_number", js.undefined)
    
    inline def setPicture(value: String): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
    
    inline def setPictureUndefined: Self = StObject.set(x, "picture", js.undefined)
    
    inline def setProvider_id(value: anonymous): Self = StObject.set(x, "provider_id", value.asInstanceOf[js.Any])
    
    inline def setProvider_idUndefined: Self = StObject.set(x, "provider_id", js.undefined)
    
    inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
    
    inline def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
  }
}
