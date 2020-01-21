package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JWT configuration for origin authentication.
  */
@js.native
trait SchemaJwt extends js.Object {
  /**
    * A JWT containing any of these audiences will be accepted. The service
    * name will be accepted if audiences is empty. Examples:
    * bookstore_android.apps.googleusercontent.com,
    * bookstore_web.apps.googleusercontent.com
    */
  var audiences: js.UndefOr[js.Array[String]] = js.native
  /**
    * Identifies the issuer that issued the JWT, which is usually a URL or an
    * email address. Examples: https://securetoken.google.com,
    * 1234567-compute@developer.gserviceaccount.com
    */
  var issuer: js.UndefOr[String] = js.native
  /**
    * The provider?s public key set to validate the signature of the JWT.
    */
  var jwksPublicKeys: js.UndefOr[String] = js.native
  /**
    * jwt_headers and jwt_params define where to extract the JWT from an HTTP
    * request. If no explicit location is specified, the following default
    * locations are tried in order:  1. The Authorization header using the
    * Bearer schema. See `here `_. Example:  Authorization: Bearer .  2.
    * `access_token` query parameter. See `this `_  Multiple JWTs can be
    * verified for a request. Each JWT has to be extracted from the locations
    * its issuer specified or from the default locations.  This field is set if
    * JWT is sent in a request header. This field specifies the header name.
    * For example, if `header=x-goog-iap-jwt-assertion`, the header format will
    * be x-goog-iap-jwt-assertion: .
    */
  var jwtHeaders: js.UndefOr[js.Array[SchemaJwtHeader]] = js.native
  /**
    * This field is set if JWT is sent in a query parameter. This field
    * specifies the query parameter name. For example, if jwt_params[0] is
    * jwt_token, the JWT format in the query parameter is /path?jwt_token=.
    */
  var jwtParams: js.UndefOr[js.Array[String]] = js.native
}

object SchemaJwt {
  @scala.inline
  def apply(
    audiences: js.Array[String] = null,
    issuer: String = null,
    jwksPublicKeys: String = null,
    jwtHeaders: js.Array[SchemaJwtHeader] = null,
    jwtParams: js.Array[String] = null
  ): SchemaJwt = {
    val __obj = js.Dynamic.literal()
    if (audiences != null) __obj.updateDynamic("audiences")(audiences.asInstanceOf[js.Any])
    if (issuer != null) __obj.updateDynamic("issuer")(issuer.asInstanceOf[js.Any])
    if (jwksPublicKeys != null) __obj.updateDynamic("jwksPublicKeys")(jwksPublicKeys.asInstanceOf[js.Any])
    if (jwtHeaders != null) __obj.updateDynamic("jwtHeaders")(jwtHeaders.asInstanceOf[js.Any])
    if (jwtParams != null) __obj.updateDynamic("jwtParams")(jwtParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaJwt]
  }
}

