package typings
package gapiDotAuth2Lib.gapiNs.auth2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reference: https://developers.google.com/api-client-library/javascript/reference/referencedocs#gapiauth2authorizeresponse
  */
trait AuthorizeResponse extends js.Object {
  var access_token: java.lang.String
  var code: java.lang.String
  var error: java.lang.String
  var error_subtype: java.lang.String
  var expires_at: scala.Double
  var expires_in: scala.Double
  var first_issued_at: scala.Double
  var id_token: java.lang.String
  var scope: java.lang.String
}

object AuthorizeResponse {
  @scala.inline
  def apply(
    access_token: java.lang.String,
    code: java.lang.String,
    error: java.lang.String,
    error_subtype: java.lang.String,
    expires_at: scala.Double,
    expires_in: scala.Double,
    first_issued_at: scala.Double,
    id_token: java.lang.String,
    scope: java.lang.String
  ): AuthorizeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("access_token")(access_token)
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("error_subtype")(error_subtype)
    __obj.updateDynamic("expires_at")(expires_at)
    __obj.updateDynamic("expires_in")(expires_in)
    __obj.updateDynamic("first_issued_at")(first_issued_at)
    __obj.updateDynamic("id_token")(id_token)
    __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[AuthorizeResponse]
  }
}

