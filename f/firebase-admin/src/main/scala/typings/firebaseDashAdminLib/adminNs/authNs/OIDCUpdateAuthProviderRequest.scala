package typings
package firebaseDashAdminLib.adminNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request interface for updating an OIDC Auth provider. This is used
  * when updating an OIDC provider's configuration via
  * {@link https://firebase.google.com/docs/reference/admin/node/admin.auth.Auth#updateProviderConfig `updateProviderConfig()`}.
  */
trait OIDCUpdateAuthProviderRequest extends UpdateAuthProviderRequest {
  /**
    * The OIDC provider's updated client ID. If not provided, the existing
    * configuration's value is not modified.
    */
  var clientId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The OIDC provider's updated display name. If not provided, the existing
    * configuration's value is not modified.
    */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the OIDC provider is enabled or not. If not provided, the existing
    * configuration's setting is not modified.
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The OIDC provider's updated issuer. If not provided, the existing
    * configuration's value is not modified.
    */
  var issuer: js.UndefOr[java.lang.String] = js.undefined
}

object OIDCUpdateAuthProviderRequest {
  @scala.inline
  def apply(
    clientId: java.lang.String = null,
    displayName: java.lang.String = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    issuer: java.lang.String = null
  ): OIDCUpdateAuthProviderRequest = {
    val __obj = js.Dynamic.literal()
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (issuer != null) __obj.updateDynamic("issuer")(issuer)
    __obj.asInstanceOf[OIDCUpdateAuthProviderRequest]
  }
}

