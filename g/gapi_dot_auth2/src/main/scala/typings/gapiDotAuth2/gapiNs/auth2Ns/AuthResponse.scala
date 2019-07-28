package typings.gapiDotAuth2.gapiNs.auth2Ns

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
    val __obj = js.Dynamic.literal(access_token = access_token, expires_at = expires_at, expires_in = expires_in, first_issued_at = first_issued_at, id_token = id_token, login_hint = login_hint, scope = scope)
  
    __obj.asInstanceOf[AuthResponse]
  }
}

