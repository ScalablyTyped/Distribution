package typings
package firebaseDashAdminLib.adminNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing a decoded Firebase ID token, returned from the
  * {@link https://firebase.google.com/docs/reference/admin/node/admin.auth.Auth#verifyIdToken `verifyIdToken()`} method.
  *
  * Firebase ID tokens are OpenID Connect spec-compliant JSON Web Tokens (JWTs).
  * See the
  * [ID Token section of the OpenID Connect spec](http://openid.net/specs/openid-connect-core-1_0.html#IDToken)
  * for more information about the specific properties below.
  */
trait DecodedIdToken
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * The audience for which this token is intended.
    *
    * This value is a string equal to your Firebase project ID, the unique
    * identifier for your Firebase project, which can be found in [your project's
    * settings](https://console.firebase.google.com/project/_/settings/general/android:com.random.android).
    */
  var aud: java.lang.String
  /**
    * Time, in seconds since the Unix epoch, when the end-user authentication
    * occurred.
    *
    * This value is not set when this particular ID token was created, but when the
    * user initially logged in to this session. In a single session, the Firebase
    * SDKs will refresh a user's ID tokens every hour. Each ID token will have a
    * different [`iat`](#iat) value, but the same `auth_time` value.
    */
  var auth_time: scala.Double
  /**
    * The ID token's expiration time, in seconds since the Unix epoch. That is, the
    * time at which this ID token expires and should no longer be considered valid.
    *
    * The Firebase SDKs transparently refresh ID tokens every hour, issuing a new
    * ID token with up to a one hour expiration.
    */
  var exp: scala.Double
  /**
    * Information about the sign in event, including which sign in provider was
    * used and provider-specific identity details.
    *
    * This data is provided by the Firebase Authentication service and is a
    * reserved claim in the ID token.
    */
  var firebase: firebaseDashAdminLib.Anon_Identities
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
  var iat: scala.Double
  /**
    * The issuer identifier for the issuer of the response.
    *
    * This value is a URL with the format
    * `https://securetoken.google.com/<PROJECT_ID>`, where `<PROJECT_ID>` is the
    * same project ID specified in the [`aud`](#aud) property.
    */
  var iss: java.lang.String
  /**
    * The `uid` corresponding to the user who the ID token belonged to.
    *
    * As a convenience, this value is copied over to the [`uid`](#uid) property.
    */
  var sub: java.lang.String
  /**
    * The `uid` corresponding to the user who the ID token belonged to.
    *
    * This value is not actually in the JWT token claims itself. It is added as a
    * convenience, and is set as the value of the [`sub`](#sub) property.
    */
  var uid: java.lang.String
}

object DecodedIdToken {
  @scala.inline
  def apply(
    aud: java.lang.String,
    auth_time: scala.Double,
    exp: scala.Double,
    firebase: firebaseDashAdminLib.Anon_Identities,
    iat: scala.Double,
    iss: java.lang.String,
    sub: java.lang.String,
    uid: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): DecodedIdToken = {
    val __obj = js.Dynamic.literal(aud = aud, auth_time = auth_time, exp = exp, firebase = firebase, iat = iat, iss = iss, sub = sub, uid = uid)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[DecodedIdToken]
  }
}

