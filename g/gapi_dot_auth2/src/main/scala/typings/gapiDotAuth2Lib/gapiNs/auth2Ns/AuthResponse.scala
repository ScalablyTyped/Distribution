package typings
package gapiDotAuth2Lib.gapiNs.auth2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reference: https://developers.google.com/api-client-library/javascript/reference/referencedocs#gapiauth2authresponse
  */
trait AuthResponse extends js.Object {
  var access_token: java.lang.String
  var expires_at: scala.Double
  var expires_in: scala.Double
  var first_issued_at: scala.Double
  var id_token: java.lang.String
  var login_hint: java.lang.String
  var scope: java.lang.String
}

object AuthResponse {
  @scala.inline
  def apply(
    access_token: java.lang.String,
    expires_at: scala.Double,
    expires_in: scala.Double,
    first_issued_at: scala.Double,
    id_token: java.lang.String,
    login_hint: java.lang.String,
    scope: java.lang.String
  ): AuthResponse = {
    val __obj = js.Dynamic.literal(access_token = access_token, expires_at = expires_at, expires_in = expires_in, first_issued_at = first_issued_at, id_token = id_token, login_hint = login_hint, scope = scope)
  
    __obj.asInstanceOf[AuthResponse]
  }
}

