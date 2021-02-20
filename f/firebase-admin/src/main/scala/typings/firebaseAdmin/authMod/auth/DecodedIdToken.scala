package typings.firebaseAdmin.authMod.auth

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAdmin.anon.Dictkey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface representing a decoded Firebase ID token, returned from the
  * {@link auth.Auth.verifyIdToken `verifyIdToken()`} method.
  *
  * Firebase ID tokens are OpenID Connect spec-compliant JSON Web Tokens (JWTs).
  * See the
  * [ID Token section of the OpenID Connect spec](http://openid.net/specs/openid-connect-core-1_0.html#IDToken)
  * for more information about the specific properties below.
  */
@js.native
trait DecodedIdToken
  extends /* key */ StringDictionary[js.Any] {
  
  /**
    * The audience for which this token is intended.
    *
    * This value is a string equal to your Firebase project ID, the unique
    * identifier for your Firebase project, which can be found in [your project's
    * settings](https://console.firebase.google.com/project/_/settings/general/android:com.random.android).
    */
  var aud: String = js.native
  
  /**
    * Time, in seconds since the Unix epoch, when the end-user authentication
    * occurred.
    *
    * This value is not set when this particular ID token was created, but when the
    * user initially logged in to this session. In a single session, the Firebase
    * SDKs will refresh a user's ID tokens every hour. Each ID token will have a
    * different [`iat`](#iat) value, but the same `auth_time` value.
    */
  var auth_time: Double = js.native
  
  /**
    * The email of the user to whom the ID token belongs, if available.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * Whether or not the email of the user to whom the ID token belongs is
    * verified, provided the user has an email.
    */
  var email_verified: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID token's expiration time, in seconds since the Unix epoch. That is, the
    * time at which this ID token expires and should no longer be considered valid.
    *
    * The Firebase SDKs transparently refresh ID tokens every hour, issuing a new
    * ID token with up to a one hour expiration.
    */
  var exp: Double = js.native
  
  /**
    * Information about the sign in event, including which sign in provider was
    * used and provider-specific identity details.
    *
    * This data is provided by the Firebase Authentication service and is a
    * reserved claim in the ID token.
    */
  var firebase: Dictkey = js.native
  
  /**
    * The ID token's issued-at time, in seconds since the Unix epoch. That is, the
    * time at which this ID token was issued and should start to be considered
    * valid.
    *
    * The Firebase SDKs transparently refresh ID tokens every hour, issuing a new
    * ID token with a new issued-at time. If you want to get the time at which the
    * user session corresponding to the ID token initially occurred, see the
    * [`auth_time`](#auth_time) property.
    */
  var iat: Double = js.native
  
  /**
    * The issuer identifier for the issuer of the response.
    *
    * This value is a URL with the format
    * `https://securetoken.google.com/<PROJECT_ID>`, where `<PROJECT_ID>` is the
    * same project ID specified in the [`aud`](#aud) property.
    */
  var iss: String = js.native
  
  /**
    * The phone number of the user to whom the ID token belongs, if available.
    */
  var phone_number: js.UndefOr[String] = js.native
  
  /**
    * The photo URL for the user to whom the ID token belongs, if available.
    */
  var picture: js.UndefOr[String] = js.native
  
  /**
    * The `uid` corresponding to the user who the ID token belonged to.
    *
    * As a convenience, this value is copied over to the [`uid`](#uid) property.
    */
  var sub: String = js.native
  
  /**
    * The `uid` corresponding to the user who the ID token belonged to.
    *
    * This value is not actually in the JWT token claims itself. It is added as a
    * convenience, and is set as the value of the [`sub`](#sub) property.
    */
  var uid: String = js.native
}
object DecodedIdToken {
  
  @scala.inline
  def apply(
    aud: String,
    auth_time: Double,
    exp: Double,
    firebase: Dictkey,
    iat: Double,
    iss: String,
    sub: String,
    uid: String
  ): DecodedIdToken = {
    val __obj = js.Dynamic.literal(aud = aud.asInstanceOf[js.Any], auth_time = auth_time.asInstanceOf[js.Any], exp = exp.asInstanceOf[js.Any], firebase = firebase.asInstanceOf[js.Any], iat = iat.asInstanceOf[js.Any], iss = iss.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecodedIdToken]
  }
  
  @scala.inline
  implicit class DecodedIdTokenMutableBuilder[Self <: DecodedIdToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAud(value: String): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuth_time(value: Double): Self = StObject.set(x, "auth_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setEmail_verified(value: Boolean): Self = StObject.set(x, "email_verified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail_verifiedUndefined: Self = StObject.set(x, "email_verified", js.undefined)
    
    @scala.inline
    def setExp(value: Double): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirebase(value: Dictkey): Self = StObject.set(x, "firebase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIat(value: Double): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIss(value: String): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhone_numberUndefined: Self = StObject.set(x, "phone_number", js.undefined)
    
    @scala.inline
    def setPicture(value: String): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPictureUndefined: Self = StObject.set(x, "picture", js.undefined)
    
    @scala.inline
    def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
