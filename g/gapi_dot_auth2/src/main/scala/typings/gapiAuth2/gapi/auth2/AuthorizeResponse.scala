package typings.gapiAuth2.gapi.auth2

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
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], error_subtype = error_subtype.asInstanceOf[js.Any], expires_at = expires_at.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], first_issued_at = first_issued_at.asInstanceOf[js.Any], id_token = id_token.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizeResponse]
  }
}

