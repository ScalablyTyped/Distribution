package typings
package gapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiOAuth2TokenObject extends js.Object {
  /**
    * The OAuth 2.0 token. Only present in successful responses
    */
  var access_token: java.lang.String
  /**
    * Details about the error. Only present in error responses
    */
  var error: java.lang.String
  /**
    * The duration, in seconds, the token is valid for. Only present in successful responses
    */
  var expires_in: java.lang.String
  var session_state: js.UndefOr[GoogleApiOAuth2TokenSessionState] = js.undefined
  /**
    * The Google API scopes related to this token
    */
  var state: java.lang.String
}

object GoogleApiOAuth2TokenObject {
  @scala.inline
  def apply(
    access_token: java.lang.String,
    error: java.lang.String,
    expires_in: java.lang.String,
    state: java.lang.String,
    session_state: GoogleApiOAuth2TokenSessionState = null
  ): GoogleApiOAuth2TokenObject = {
    val __obj = js.Dynamic.literal(access_token = access_token, error = error, expires_in = expires_in, state = state)
    if (session_state != null) __obj.updateDynamic("session_state")(session_state)
    __obj.asInstanceOf[GoogleApiOAuth2TokenObject]
  }
}

