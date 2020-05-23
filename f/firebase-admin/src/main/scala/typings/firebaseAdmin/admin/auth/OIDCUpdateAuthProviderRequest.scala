package typings.firebaseAdmin.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request interface for updating an OIDC Auth provider. This is used
  * when updating an OIDC provider's configuration via
  * {@link https://firebase.google.com/docs/reference/admin/node/admin.auth.Auth#updateProviderConfig `updateProviderConfig()`}.
  */
trait OIDCUpdateAuthProviderRequest extends js.Object {
  /**
    * The OIDC provider's updated client ID. If not provided, the existing
    * configuration's value is not modified.
    */
  var clientId: js.UndefOr[String] = js.undefined
  /**
    * The OIDC provider's updated display name. If not provided, the existing
    * configuration's value is not modified.
    */
  var displayName: js.UndefOr[String] = js.undefined
  /**
    * Whether the OIDC provider is enabled or not. If not provided, the existing
    * configuration's setting is not modified.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The OIDC provider's updated issuer. If not provided, the existing
    * configuration's value is not modified.
    */
  var issuer: js.UndefOr[String] = js.undefined
}

object OIDCUpdateAuthProviderRequest {
  @scala.inline
  def apply(
    clientId: String = null,
    displayName: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    issuer: String = null
  ): OIDCUpdateAuthProviderRequest = {
    val __obj = js.Dynamic.literal()
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (issuer != null) __obj.updateDynamic("issuer")(issuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[OIDCUpdateAuthProviderRequest]
  }
}

