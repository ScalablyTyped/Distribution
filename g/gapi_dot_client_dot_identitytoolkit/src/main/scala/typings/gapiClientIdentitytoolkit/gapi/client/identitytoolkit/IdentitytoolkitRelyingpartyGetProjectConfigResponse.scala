package typings.gapiClientIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentitytoolkitRelyingpartyGetProjectConfigResponse extends js.Object {
  /** Whether to allow password user sign in or sign up. */
  var allowPasswordUser: js.UndefOr[Boolean] = js.native
  /** Browser API key, needed when making http request to Apiary. */
  var apiKey: js.UndefOr[String] = js.native
  /** Authorized domains. */
  var authorizedDomains: js.UndefOr[js.Array[String]] = js.native
  /** Change email template. */
  var changeEmailTemplate: js.UndefOr[EmailTemplate] = js.native
  var dynamicLinksDomain: js.UndefOr[String] = js.native
  /** Whether anonymous user is enabled. */
  var enableAnonymousUser: js.UndefOr[Boolean] = js.native
  /** OAuth2 provider configuration. */
  var idpConfig: js.UndefOr[js.Array[IdpConfig]] = js.native
  /** Legacy reset password email template. */
  var legacyResetPasswordTemplate: js.UndefOr[EmailTemplate] = js.native
  /** Project ID of the relying party. */
  var projectId: js.UndefOr[String] = js.native
  /** Reset password email template. */
  var resetPasswordTemplate: js.UndefOr[EmailTemplate] = js.native
  /** Whether to use email sending provided by Firebear. */
  var useEmailSending: js.UndefOr[Boolean] = js.native
  /** Verify email template. */
  var verifyEmailTemplate: js.UndefOr[EmailTemplate] = js.native
}

object IdentitytoolkitRelyingpartyGetProjectConfigResponse {
  @scala.inline
  def apply(): IdentitytoolkitRelyingpartyGetProjectConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentitytoolkitRelyingpartyGetProjectConfigResponse]
  }
  @scala.inline
  implicit class IdentitytoolkitRelyingpartyGetProjectConfigResponseOps[Self <: IdentitytoolkitRelyingpartyGetProjectConfigResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowPasswordUser(value: Boolean): Self = this.set("allowPasswordUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowPasswordUser: Self = this.set("allowPasswordUser", js.undefined)
    @scala.inline
    def setApiKey(value: String): Self = this.set("apiKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiKey: Self = this.set("apiKey", js.undefined)
    @scala.inline
    def setAuthorizedDomainsVarargs(value: String*): Self = this.set("authorizedDomains", js.Array(value :_*))
    @scala.inline
    def setAuthorizedDomains(value: js.Array[String]): Self = this.set("authorizedDomains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorizedDomains: Self = this.set("authorizedDomains", js.undefined)
    @scala.inline
    def setChangeEmailTemplate(value: EmailTemplate): Self = this.set("changeEmailTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangeEmailTemplate: Self = this.set("changeEmailTemplate", js.undefined)
    @scala.inline
    def setDynamicLinksDomain(value: String): Self = this.set("dynamicLinksDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamicLinksDomain: Self = this.set("dynamicLinksDomain", js.undefined)
    @scala.inline
    def setEnableAnonymousUser(value: Boolean): Self = this.set("enableAnonymousUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableAnonymousUser: Self = this.set("enableAnonymousUser", js.undefined)
    @scala.inline
    def setIdpConfigVarargs(value: IdpConfig*): Self = this.set("idpConfig", js.Array(value :_*))
    @scala.inline
    def setIdpConfig(value: js.Array[IdpConfig]): Self = this.set("idpConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdpConfig: Self = this.set("idpConfig", js.undefined)
    @scala.inline
    def setLegacyResetPasswordTemplate(value: EmailTemplate): Self = this.set("legacyResetPasswordTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegacyResetPasswordTemplate: Self = this.set("legacyResetPasswordTemplate", js.undefined)
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    @scala.inline
    def setResetPasswordTemplate(value: EmailTemplate): Self = this.set("resetPasswordTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResetPasswordTemplate: Self = this.set("resetPasswordTemplate", js.undefined)
    @scala.inline
    def setUseEmailSending(value: Boolean): Self = this.set("useEmailSending", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseEmailSending: Self = this.set("useEmailSending", js.undefined)
    @scala.inline
    def setVerifyEmailTemplate(value: EmailTemplate): Self = this.set("verifyEmailTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerifyEmailTemplate: Self = this.set("verifyEmailTemplate", js.undefined)
  }
  
}

