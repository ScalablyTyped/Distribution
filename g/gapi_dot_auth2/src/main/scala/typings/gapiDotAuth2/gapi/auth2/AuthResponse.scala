package typings.gapiDotAuth2.gapi.auth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reference: https://developers.google.com/api-client-library/javascript/reference/referencedocs#gapiauth2authresponse
  */
trait AuthResponse extends js.Object {
  var access_token: String
  var expires_at: Double
  var expires_in: Double
  var first_issued_at: Double
  var id_token: String
  var login_hint: String
  var scope: String
}

object AuthResponse {
  @scala.inline
  def apply(
    access_token: String,
    expires_at: Double,
    expires_in: Double,
    first_issued_at: Double,
    id_token: String,
    login_hint: String,
    scope: String
  ): AuthResponse = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expires_at = expires_at.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], first_issued_at = first_issued_at.asInstanceOf[js.Any], id_token = id_token.asInstanceOf[js.Any], login_hint = login_hint.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AuthResponse]
  }
}

