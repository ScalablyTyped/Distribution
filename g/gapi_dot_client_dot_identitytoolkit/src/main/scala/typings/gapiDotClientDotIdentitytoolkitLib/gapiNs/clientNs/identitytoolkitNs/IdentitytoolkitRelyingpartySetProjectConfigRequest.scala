package typings
package gapiDotClientDotIdentitytoolkitLib.gapiNs.clientNs.identitytoolkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IdentitytoolkitRelyingpartySetProjectConfigRequest extends js.Object {
  /** Whether to allow password user sign in or sign up. */
  var allowPasswordUser: js.UndefOr[scala.Boolean] = js.undefined
  /** Browser API key, needed when making http request to Apiary. */
  var apiKey: js.UndefOr[java.lang.String] = js.undefined
  /** Authorized domains for widget redirect. */
  var authorizedDomains: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Change email template. */
  var changeEmailTemplate: js.UndefOr[EmailTemplate] = js.undefined
  /** GCP project number of the requesting delegated app. Currently only intended for Firebase V1 migration. */
  var delegatedProjectNumber: js.UndefOr[java.lang.String] = js.undefined
  /** Whether to enable anonymous user. */
  var enableAnonymousUser: js.UndefOr[scala.Boolean] = js.undefined
  /** Oauth2 provider configuration. */
  var idpConfig: js.UndefOr[js.Array[IdpConfig]] = js.undefined
  /** Legacy reset password email template. */
  var legacyResetPasswordTemplate: js.UndefOr[EmailTemplate] = js.undefined
  /** Reset password email template. */
  var resetPasswordTemplate: js.UndefOr[EmailTemplate] = js.undefined
  /** Whether to use email sending provided by Firebear. */
  var useEmailSending: js.UndefOr[scala.Boolean] = js.undefined
  /** Verify email template. */
  var verifyEmailTemplate: js.UndefOr[EmailTemplate] = js.undefined
}

