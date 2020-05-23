package typings.firebaseAdmin.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebaseAdmin.authMod.admin.auth.SAMLUpdateAuthProviderRequest
  - typings.firebaseAdmin.authMod.admin.auth.OIDCUpdateAuthProviderRequest
*/
trait UpdateAuthProviderRequest extends js.Object

object UpdateAuthProviderRequest {
  @scala.inline
  def SAMLUpdateAuthProviderRequest(
    callbackURL: String = null,
    displayName: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    idpEntityId: String = null,
    rpEntityId: String = null,
    ssoURL: String = null,
    x509Certificates: js.Array[String] = null
  ): UpdateAuthProviderRequest = {
    val __obj = js.Dynamic.literal()
    if (callbackURL != null) __obj.updateDynamic("callbackURL")(callbackURL.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (idpEntityId != null) __obj.updateDynamic("idpEntityId")(idpEntityId.asInstanceOf[js.Any])
    if (rpEntityId != null) __obj.updateDynamic("rpEntityId")(rpEntityId.asInstanceOf[js.Any])
    if (ssoURL != null) __obj.updateDynamic("ssoURL")(ssoURL.asInstanceOf[js.Any])
    if (x509Certificates != null) __obj.updateDynamic("x509Certificates")(x509Certificates.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAuthProviderRequest]
  }
  @scala.inline
  def OIDCUpdateAuthProviderRequest(
    clientId: String = null,
    displayName: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    issuer: String = null
  ): UpdateAuthProviderRequest = {
    val __obj = js.Dynamic.literal()
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (issuer != null) __obj.updateDynamic("issuer")(issuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAuthProviderRequest]
  }
}

