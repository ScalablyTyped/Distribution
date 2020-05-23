package typings.firebase.mod.auth

import org.scalablytyped.runtime.StringDictionary
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
  var authTime: String
  /**
    * The entire payload claims of the ID token including the standard reserved
    * claims as well as the custom claims.
    */
  var claims: StringDictionary[js.Any]
  /**
    * The ID token expiration time formatted as a UTC string.
    */
  var expirationTime: String
  /**
    * The ID token issued at time formatted as a UTC string.
    */
  var issuedAtTime: String
  /**
    * The sign-in provider through which the ID token was obtained (anonymous,
    * custom, phone, password, etc). Note, this does not map to provider IDs.
    */
  var signInProvider: String | Null
  /**
    * The type of second factor associated with this session, provided the user
    * was multi-factor authenticated (eg. phone, etc).
    */
  var signInSecondFactor: String | Null
  /**
    * The Firebase Auth ID token JWT string.
    */
  var token: String
}

object IdTokenResult {
  @scala.inline
  def apply(
    authTime: String,
    claims: StringDictionary[js.Any],
    expirationTime: String,
    issuedAtTime: String,
    token: String,
    signInProvider: String = null,
    signInSecondFactor: String = null
  ): IdTokenResult = {
    val __obj = js.Dynamic.literal(authTime = authTime.asInstanceOf[js.Any], claims = claims.asInstanceOf[js.Any], expirationTime = expirationTime.asInstanceOf[js.Any], issuedAtTime = issuedAtTime.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], signInProvider = signInProvider.asInstanceOf[js.Any], signInSecondFactor = signInSecondFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdTokenResult]
  }
}

