package typings.gapiClient.gapi.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The OAuth 2.0 token object represents the OAuth 2.0 token and any associated data.
  */
@js.native
trait GoogleApiOAuth2TokenObject extends js.Object {
  /**
    * The OAuth 2.0 token. Only present in successful responses
    */
  var access_token: String = js.native
  /**
    * Details about the error. Only present in error responses
    */
  var error: String = js.native
  /**
    * The duration, in seconds, the token is valid for. Only present in successful responses
    */
  var expires_in: String = js.native
  /**
    * The Google API scopes related to this token
    */
  var state: String = js.native
}

object GoogleApiOAuth2TokenObject {
  @scala.inline
  def apply(access_token: String, error: String, expires_in: String, state: String): GoogleApiOAuth2TokenObject = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiOAuth2TokenObject]
  }
  @scala.inline
  implicit class GoogleApiOAuth2TokenObjectOps[Self <: GoogleApiOAuth2TokenObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccess_token(value: String): Self = this.set("access_token", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpires_in(value: String): Self = this.set("expires_in", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

