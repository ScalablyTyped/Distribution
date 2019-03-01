package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityAwareProxy extends js.Object {
  /**
    * Whether the serving infrastructure will authenticate and authorize all incoming requests.If true, the oauth2_client_id and oauth2_client_secret fields
    * must be non-empty.
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** OAuth2 client ID to use for the authentication flow. */
  var oauth2ClientId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * OAuth2 client secret to use for the authentication flow.For security reasons, this value cannot be retrieved via the API. Instead, the SHA-256 hash of
    * the value is returned in the oauth2_client_secret_sha256 field.@InputOnly
    */
  var oauth2ClientSecret: js.UndefOr[java.lang.String] = js.undefined
  /** Hex-encoded SHA-256 hash of the client secret.@OutputOnly */
  var oauth2ClientSecretSha256: js.UndefOr[java.lang.String] = js.undefined
}

object IdentityAwareProxy {
  @scala.inline
  def apply(
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    oauth2ClientId: java.lang.String = null,
    oauth2ClientSecret: java.lang.String = null,
    oauth2ClientSecretSha256: java.lang.String = null
  ): IdentityAwareProxy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (oauth2ClientId != null) __obj.updateDynamic("oauth2ClientId")(oauth2ClientId)
    if (oauth2ClientSecret != null) __obj.updateDynamic("oauth2ClientSecret")(oauth2ClientSecret)
    if (oauth2ClientSecretSha256 != null) __obj.updateDynamic("oauth2ClientSecretSha256")(oauth2ClientSecretSha256)
    __obj.asInstanceOf[IdentityAwareProxy]
  }
}

