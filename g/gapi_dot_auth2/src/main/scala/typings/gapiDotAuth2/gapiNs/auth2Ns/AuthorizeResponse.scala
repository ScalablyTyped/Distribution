package typings.gapiDotAuth2.gapiNs.auth2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reference: https://developers.google.com/api-client-library/javascript/reference/referencedocs#gapiauth2authorizeresponse
  */
trait AuthorizeResponse extends js.Object {
  var access_token: String
  var code: String
  var error: String
  var error_subtype: String
  var expires_at: Double
  var expires_in: Double
  var first_issued_at: Double
  var id_token: String
  var scope: String
}

object AuthorizeResponse {
  @scala.inline
  def apply(
    access_token: String,
    code: String,
    error: String,
    error_subtype: String,
    expires_at: Double,
    expires_in: Double,
    first_issued_at: Double,
    id_token: String,
    scope: String
  ): AuthorizeResponse = {
    val __obj = js.Dynamic.literal(access_token = access_token, code = code, error = error, error_subtype = error_subtype, expires_at = expires_at, expires_in = expires_in, first_issued_at = first_issued_at, id_token = id_token, scope = scope)
  
    __obj.asInstanceOf[AuthorizeResponse]
  }
}

