package typings.gapiDotClient.gapi.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The OAuth 2.0 token object represents the OAuth 2.0 token and any associated data.
  */
trait GoogleApiOAuth2TokenObject extends js.Object {
  /**
    * The OAuth 2.0 token. Only present in successful responses
    */
  var access_token: String
  /**
    * Details about the error. Only present in error responses
    */
  var error: String
  /**
    * The duration, in seconds, the token is valid for. Only present in successful responses
    */
  var expires_in: String
  /**
    * The Google API scopes related to this token
    */
  var state: String
}

object GoogleApiOAuth2TokenObject {
  @scala.inline
  def apply(access_token: String, error: String, expires_in: String, state: String): GoogleApiOAuth2TokenObject = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GoogleApiOAuth2TokenObject]
  }
}

