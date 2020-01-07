package typings.googleapis.buildSrcApisAppengineV1Mod.appengine_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Identity-Aware Proxy
  */
@js.native
trait Schema$IdentityAwareProxy extends js.Object {
  /**
    * Whether the serving infrastructure will authenticate and authorize all
    * incoming requests.If true, the oauth2_client_id and oauth2_client_secret
    * fields must be non-empty.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * OAuth2 client ID to use for the authentication flow.
    */
  var oauth2ClientId: js.UndefOr[String] = js.native
  /**
    * OAuth2 client secret to use for the authentication flow.For security
    * reasons, this value cannot be retrieved via the API. Instead, the SHA-256
    * hash of the value is returned in the oauth2_client_secret_sha256
    * field.@InputOnly
    */
  var oauth2ClientSecret: js.UndefOr[String] = js.native
  /**
    * Hex-encoded SHA-256 hash of the client secret.@OutputOnly
    */
  var oauth2ClientSecretSha256: js.UndefOr[String] = js.native
}

object Schema$IdentityAwareProxy {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    oauth2ClientId: String = null,
    oauth2ClientSecret: String = null,
    oauth2ClientSecretSha256: String = null
  ): Schema$IdentityAwareProxy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (oauth2ClientId != null) __obj.updateDynamic("oauth2ClientId")(oauth2ClientId.asInstanceOf[js.Any])
    if (oauth2ClientSecret != null) __obj.updateDynamic("oauth2ClientSecret")(oauth2ClientSecret.asInstanceOf[js.Any])
    if (oauth2ClientSecretSha256 != null) __obj.updateDynamic("oauth2ClientSecretSha256")(oauth2ClientSecretSha256.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$IdentityAwareProxy]
  }
}

