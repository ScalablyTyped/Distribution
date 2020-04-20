package typings.firebaseAdmin.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The [OIDC](https://openid.net/specs/openid-connect-core-1_0-final.html) Auth
  * provider configuration interface. An OIDC provider can be created via
  * {@link https://firebase.google.com/docs/reference/admin/node/admin.auth.Auth#createProviderConfig `createProviderConfig()`}.
  */
trait OIDCAuthProviderConfig extends AuthProviderConfig {
  /**
    * This is the required client ID used to confirm the audience of an OIDC
    * provider's
    * [ID token](https://openid.net/specs/openid-connect-core-1_0-final.html#IDToken).
    */
  var clientId: String
  /**
    * This is the required provider issuer used to match the provider issuer of
    * the ID token and to determine the corresponding OIDC discovery document, eg.
    * [`/.well-known/openid-configuration`](https://openid.net/specs/openid-connect-discovery-1_0.html#ProviderConfig).
    * This is needed for the following:
    * <ul>
    * <li>To verify the provided issuer.</li>
    * <li>Determine the authentication/authorization endpoint during the OAuth
    *     `id_token` authentication flow.</li>
    * <li>To retrieve the public signing keys via `jwks_uri` to verify the OIDC
    *     provider's ID token's signature.</li>
    * <li>To determine the claims_supported to construct the user attributes to be
    *     returned in the additional user info response.</li>
    * </ul>
    * ID token validation will be performed as defined in the
    * [spec](https://openid.net/specs/openid-connect-core-1_0.html#IDTokenValidation).
    */
  var issuer: String
}

object OIDCAuthProviderConfig {
  @scala.inline
  def apply(clientId: String, displayName: String, enabled: Boolean, issuer: String, providerId: String): OIDCAuthProviderConfig = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], providerId = providerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OIDCAuthProviderConfig]
  }
}

