package typings.gapiDotClientDotIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentitytoolkitRelyingpartyGetProjectConfigResponse extends js.Object {
  /** Whether to allow password user sign in or sign up. */
  var allowPasswordUser: js.UndefOr[Boolean] = js.undefined
  /** Browser API key, needed when making http request to Apiary. */
  var apiKey: js.UndefOr[String] = js.undefined
  /** Authorized domains. */
  var authorizedDomains: js.UndefOr[js.Array[String]] = js.undefined
  /** Change email template. */
  var changeEmailTemplate: js.UndefOr[EmailTemplate] = js.undefined
  var dynamicLinksDomain: js.UndefOr[String] = js.undefined
  /** Whether anonymous user is enabled. */
  var enableAnonymousUser: js.UndefOr[Boolean] = js.undefined
  /** OAuth2 provider configuration. */
  var idpConfig: js.UndefOr[js.Array[IdpConfig]] = js.undefined
  /** Legacy reset password email template. */
  var legacyResetPasswordTemplate: js.UndefOr[EmailTemplate] = js.undefined
  /** Project ID of the relying party. */
  var projectId: js.UndefOr[String] = js.undefined
  /** Reset password email template. */
  var resetPasswordTemplate: js.UndefOr[EmailTemplate] = js.undefined
  /** Whether to use email sending provided by Firebear. */
  var useEmailSending: js.UndefOr[Boolean] = js.undefined
  /** Verify email template. */
  var verifyEmailTemplate: js.UndefOr[EmailTemplate] = js.undefined
}

object IdentitytoolkitRelyingpartyGetProjectConfigResponse {
  @scala.inline
  def apply(
    allowPasswordUser: js.UndefOr[Boolean] = js.undefined,
    apiKey: String = null,
    authorizedDomains: js.Array[String] = null,
    changeEmailTemplate: EmailTemplate = null,
    dynamicLinksDomain: String = null,
    enableAnonymousUser: js.UndefOr[Boolean] = js.undefined,
    idpConfig: js.Array[IdpConfig] = null,
    legacyResetPasswordTemplate: EmailTemplate = null,
    projectId: String = null,
    resetPasswordTemplate: EmailTemplate = null,
    useEmailSending: js.UndefOr[Boolean] = js.undefined,
    verifyEmailTemplate: EmailTemplate = null
  ): IdentitytoolkitRelyingpartyGetProjectConfigResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowPasswordUser)) __obj.updateDynamic("allowPasswordUser")(allowPasswordUser.asInstanceOf[js.Any])
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey.asInstanceOf[js.Any])
    if (authorizedDomains != null) __obj.updateDynamic("authorizedDomains")(authorizedDomains.asInstanceOf[js.Any])
    if (changeEmailTemplate != null) __obj.updateDynamic("changeEmailTemplate")(changeEmailTemplate.asInstanceOf[js.Any])
    if (dynamicLinksDomain != null) __obj.updateDynamic("dynamicLinksDomain")(dynamicLinksDomain.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAnonymousUser)) __obj.updateDynamic("enableAnonymousUser")(enableAnonymousUser.asInstanceOf[js.Any])
    if (idpConfig != null) __obj.updateDynamic("idpConfig")(idpConfig.asInstanceOf[js.Any])
    if (legacyResetPasswordTemplate != null) __obj.updateDynamic("legacyResetPasswordTemplate")(legacyResetPasswordTemplate.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (resetPasswordTemplate != null) __obj.updateDynamic("resetPasswordTemplate")(resetPasswordTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(useEmailSending)) __obj.updateDynamic("useEmailSending")(useEmailSending.asInstanceOf[js.Any])
    if (verifyEmailTemplate != null) __obj.updateDynamic("verifyEmailTemplate")(verifyEmailTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentitytoolkitRelyingpartyGetProjectConfigResponse]
  }
}

