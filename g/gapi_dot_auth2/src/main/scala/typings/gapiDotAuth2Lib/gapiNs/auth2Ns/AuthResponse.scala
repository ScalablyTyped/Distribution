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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("access_token")(access_token)
    __obj.updateDynamic("expires_at")(expires_at)
    __obj.updateDynamic("expires_in")(expires_in)
    __obj.updateDynamic("first_issued_at")(first_issued_at)
    __obj.updateDynamic("id_token")(id_token)
    __obj.updateDynamic("login_hint")(login_hint)
    __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[AuthResponse]
  }
}

