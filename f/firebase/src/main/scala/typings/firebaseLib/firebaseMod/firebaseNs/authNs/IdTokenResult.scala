package typings
package firebaseLib.firebaseMod.firebaseNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait IdTokenResult extends js.Object {
  /**
    * The authentication time formatted as a UTC string. This is the time the
    * user authenticated (signed in) and not the time the token was refreshed.
    */
  var authTime: java.lang.String
  /**
    * The entire payload claims of the ID token including the standard reserved
    * claims as well as the custom claims.
    */
  var claims: org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * The ID token expiration time formatted as a UTC string.
    */
  var expirationTime: java.lang.String
  /**
    * The ID token issued at time formatted as a UTC string.
    */
  var issuedAtTime: java.lang.String
  /**
    * The sign-in provider through which the ID token was obtained (anonymous,
    * custom, phone, password, etc). Note, this does not map to provider IDs.
    */
  var signInProvider: java.lang.String | scala.Null
  /**
    * The Firebase Auth ID token JWT string.
    */
  var token: java.lang.String
}

object IdTokenResult {
  @scala.inline
  def apply(
    authTime: java.lang.String,
    claims: org.scalablytyped.runtime.StringDictionary[js.Any],
    expirationTime: java.lang.String,
    issuedAtTime: java.lang.String,
    token: java.lang.String,
    signInProvider: java.lang.String = null
  ): IdTokenResult = {
    val __obj = js.Dynamic.literal(authTime = authTime, claims = claims, expirationTime = expirationTime, issuedAtTime = issuedAtTime, token = token)
    if (signInProvider != null) __obj.updateDynamic("signInProvider")(signInProvider)
    __obj.asInstanceOf[IdTokenResult]
  }
}

