package typings.firebaseAdmin.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request interface for updating a SAML Auth provider. This is used
  * when updating a SAML provider's configuration via
  * {@link https://firebase.google.com/docs/reference/admin/node/admin.auth.Auth#updateProviderConfig `updateProviderConfig()`}.
  */
trait SAMLUpdateAuthProviderRequest extends js.Object {
  /**
    * The SAML provider's callback URL. If not provided, the existing
    * configuration's value is not modified.
    */
  var callbackURL: js.UndefOr[String] = js.undefined
  /**
    * The SAML provider's updated display name. If not provided, the existing
    * configuration's value is not modified.
    */
  var displayName: js.UndefOr[String] = js.undefined
  /**
    * Whether the SAML provider is enabled or not. If not provided, the existing
    * configuration's setting is not modified.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The SAML provider's updated IdP entity ID. If not provided, the existing
    * configuration's value is not modified.
    */
  var idpEntityId: js.UndefOr[String] = js.undefined
  /**
    * The SAML provider's updated RP entity ID. If not provided, the existing
    * configuration's value is not modified.
    */
  var rpEntityId: js.UndefOr[String] = js.undefined
  /**
    * The SAML provider's updated SSO URL. If not provided, the existing
    * configuration's value is not modified.
    */
  var ssoURL: js.UndefOr[String] = js.undefined
  /**
    * The SAML provider's updated list of X.509 certificated. If not provided, the
    * existing configuration list is not modified.
    */
  var x509Certificates: js.UndefOr[js.Array[String]] = js.undefined
}

object SAMLUpdateAuthProviderRequest {
  @scala.inline
  def apply(
    callbackURL: String = null,
    displayName: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    idpEntityId: String = null,
    rpEntityId: String = null,
    ssoURL: String = null,
    x509Certificates: js.Array[String] = null
  ): SAMLUpdateAuthProviderRequest = {
    val __obj = js.Dynamic.literal()
    if (callbackURL != null) __obj.updateDynamic("callbackURL")(callbackURL.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (idpEntityId != null) __obj.updateDynamic("idpEntityId")(idpEntityId.asInstanceOf[js.Any])
    if (rpEntityId != null) __obj.updateDynamic("rpEntityId")(rpEntityId.asInstanceOf[js.Any])
    if (ssoURL != null) __obj.updateDynamic("ssoURL")(ssoURL.asInstanceOf[js.Any])
    if (x509Certificates != null) __obj.updateDynamic("x509Certificates")(x509Certificates.asInstanceOf[js.Any])
    __obj.asInstanceOf[SAMLUpdateAuthProviderRequest]
  }
}

