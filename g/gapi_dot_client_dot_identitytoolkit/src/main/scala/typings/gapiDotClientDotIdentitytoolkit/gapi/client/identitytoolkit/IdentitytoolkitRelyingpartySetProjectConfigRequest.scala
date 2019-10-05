package typings.gapiDotClientDotIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentitytoolkitRelyingpartySetProjectConfigRequest extends js.Object {
  /** Whether to allow password user sign in or sign up. */
  var allowPasswordUser: js.UndefOr[Boolean] = js.undefined
  /** Browser API key, needed when making http request to Apiary. */
  var apiKey: js.UndefOr[String] = js.undefined
  /** Authorized domains for widget redirect. */
  var authorizedDomains: js.UndefOr[js.Array[String]] = js.undefined
  /** Change email template. */
  var changeEmailTemplate: js.UndefOr[EmailTemplate] = js.undefined
  /** GCP project number of the requesting delegated app. Currently only intended for Firebase V1 migration. */
  var delegatedProjectNumber: js.UndefOr[String] = js.undefined
  /** Whether to enable anonymous user. */
  var enableAnonymousUser: js.UndefOr[Boolean] = js.undefined
  /** Oauth2 provider configuration. */
  var idpConfig: js.UndefOr[js.Array[IdpConfig]] = js.undefined
  /** Legacy reset password email template. */
  var legacyResetPasswordTemplate: js.UndefOr[EmailTemplate] = js.undefined
  /** Reset password email template. */
  var resetPasswordTemplate: js.UndefOr[EmailTemplate] = js.undefined
  /** Whether to use email sending provided by Firebear. */
  var useEmailSending: js.UndefOr[Boolean] = js.undefined
  /** Verify email template. */
  var verifyEmailTemplate: js.UndefOr[EmailTemplate] = js.undefined
}

object IdentitytoolkitRelyingpartySetProjectConfigRequest {
  @scala.inline
  def apply(
    allowPasswordUser: js.UndefOr[Boolean] = js.undefined,
    apiKey: String = null,
    authorizedDomains: js.Array[String] = null,
    changeEmailTemplate: EmailTemplate = null,
    delegatedProjectNumber: String = null,
    enableAnonymousUser: js.UndefOr[Boolean] = js.undefined,
    idpConfig: js.Array[IdpConfig] = null,
    legacyResetPasswordTemplate: EmailTemplate = null,
    resetPasswordTemplate: EmailTemplate = null,
    useEmailSending: js.UndefOr[Boolean] = js.undefined,
    verifyEmailTemplate: EmailTemplate = null
  ): IdentitytoolkitRelyingpartySetProjectConfigRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowPasswordUser)) __obj.updateDynamic("allowPasswordUser")(allowPasswordUser)
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey)
    if (authorizedDomains != null) __obj.updateDynamic("authorizedDomains")(authorizedDomains)
    if (changeEmailTemplate != null) __obj.updateDynamic("changeEmailTemplate")(changeEmailTemplate)
    if (delegatedProjectNumber != null) __obj.updateDynamic("delegatedProjectNumber")(delegatedProjectNumber)
    if (!js.isUndefined(enableAnonymousUser)) __obj.updateDynamic("enableAnonymousUser")(enableAnonymousUser)
    if (idpConfig != null) __obj.updateDynamic("idpConfig")(idpConfig)
    if (legacyResetPasswordTemplate != null) __obj.updateDynamic("legacyResetPasswordTemplate")(legacyResetPasswordTemplate)
    if (resetPasswordTemplate != null) __obj.updateDynamic("resetPasswordTemplate")(resetPasswordTemplate)
    if (!js.isUndefined(useEmailSending)) __obj.updateDynamic("useEmailSending")(useEmailSending)
    if (verifyEmailTemplate != null) __obj.updateDynamic("verifyEmailTemplate")(verifyEmailTemplate)
    __obj.asInstanceOf[IdentitytoolkitRelyingpartySetProjectConfigRequest]
  }
}

