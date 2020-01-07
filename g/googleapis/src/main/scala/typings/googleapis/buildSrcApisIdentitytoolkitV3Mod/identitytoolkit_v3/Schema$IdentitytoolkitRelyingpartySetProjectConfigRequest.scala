package typings.googleapis.buildSrcApisIdentitytoolkitV3Mod.identitytoolkit_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to set the project configuration.
  */
@js.native
trait Schema$IdentitytoolkitRelyingpartySetProjectConfigRequest extends js.Object {
  /**
    * Whether to allow password user sign in or sign up.
    */
  var allowPasswordUser: js.UndefOr[Boolean] = js.native
  /**
    * Browser API key, needed when making http request to Apiary.
    */
  var apiKey: js.UndefOr[String] = js.native
  /**
    * Authorized domains for widget redirect.
    */
  var authorizedDomains: js.UndefOr[js.Array[String]] = js.native
  /**
    * Change email template.
    */
  var changeEmailTemplate: js.UndefOr[Schema$EmailTemplate] = js.native
  /**
    * GCP project number of the requesting delegated app. Currently only
    * intended for Firebase V1 migration.
    */
  var delegatedProjectNumber: js.UndefOr[String] = js.native
  /**
    * Whether to enable anonymous user.
    */
  var enableAnonymousUser: js.UndefOr[Boolean] = js.native
  /**
    * Oauth2 provider configuration.
    */
  var idpConfig: js.UndefOr[js.Array[Schema$IdpConfig]] = js.native
  /**
    * Legacy reset password email template.
    */
  var legacyResetPasswordTemplate: js.UndefOr[Schema$EmailTemplate] = js.native
  /**
    * Reset password email template.
    */
  var resetPasswordTemplate: js.UndefOr[Schema$EmailTemplate] = js.native
  /**
    * Whether to use email sending provided by Firebear.
    */
  var useEmailSending: js.UndefOr[Boolean] = js.native
  /**
    * Verify email template.
    */
  var verifyEmailTemplate: js.UndefOr[Schema$EmailTemplate] = js.native
}

object Schema$IdentitytoolkitRelyingpartySetProjectConfigRequest {
  @scala.inline
  def apply(
    allowPasswordUser: js.UndefOr[Boolean] = js.undefined,
    apiKey: String = null,
    authorizedDomains: js.Array[String] = null,
    changeEmailTemplate: Schema$EmailTemplate = null,
    delegatedProjectNumber: String = null,
    enableAnonymousUser: js.UndefOr[Boolean] = js.undefined,
    idpConfig: js.Array[Schema$IdpConfig] = null,
    legacyResetPasswordTemplate: Schema$EmailTemplate = null,
    resetPasswordTemplate: Schema$EmailTemplate = null,
    useEmailSending: js.UndefOr[Boolean] = js.undefined,
    verifyEmailTemplate: Schema$EmailTemplate = null
  ): Schema$IdentitytoolkitRelyingpartySetProjectConfigRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowPasswordUser)) __obj.updateDynamic("allowPasswordUser")(allowPasswordUser.asInstanceOf[js.Any])
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey.asInstanceOf[js.Any])
    if (authorizedDomains != null) __obj.updateDynamic("authorizedDomains")(authorizedDomains.asInstanceOf[js.Any])
    if (changeEmailTemplate != null) __obj.updateDynamic("changeEmailTemplate")(changeEmailTemplate.asInstanceOf[js.Any])
    if (delegatedProjectNumber != null) __obj.updateDynamic("delegatedProjectNumber")(delegatedProjectNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAnonymousUser)) __obj.updateDynamic("enableAnonymousUser")(enableAnonymousUser.asInstanceOf[js.Any])
    if (idpConfig != null) __obj.updateDynamic("idpConfig")(idpConfig.asInstanceOf[js.Any])
    if (legacyResetPasswordTemplate != null) __obj.updateDynamic("legacyResetPasswordTemplate")(legacyResetPasswordTemplate.asInstanceOf[js.Any])
    if (resetPasswordTemplate != null) __obj.updateDynamic("resetPasswordTemplate")(resetPasswordTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(useEmailSending)) __obj.updateDynamic("useEmailSending")(useEmailSending.asInstanceOf[js.Any])
    if (verifyEmailTemplate != null) __obj.updateDynamic("verifyEmailTemplate")(verifyEmailTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$IdentitytoolkitRelyingpartySetProjectConfigRequest]
  }
}

