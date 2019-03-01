package typings
package gapiDotClientDotIdentitytoolkitLib.gapiNs.clientNs.identitytoolkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelyingpartyResource extends js.Object {
  /** Creates the URI used by the IdP to authenticate the user. */
  def createAuthUri(request: gapiDotClientDotIdentitytoolkitLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[CreateAuthUriResponse]
  /** Delete user account. */
  def deleteAccount(request: gapiDotClientDotIdentitytoolkitLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[DeleteAccountResponse]
  /** Batch download user accounts. */
  def downloadAccount(request: gapiDotClientDotIdentitytoolkitLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[DownloadAccountResponse]
  /** Reset password for a user. */
  def emailLinkSignin(request: gapiDotClientDotIdentitytoolkitLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[EmailLinkSigninResponse]
  /** Returns the account info. */
  def getAccountInfo(request: gapiDotClientDotIdentitytoolkitLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[GetAccountInfoResponse]
  /** Get a code for user action confirmation. */
  def getOobConfirmationCode(request: gapiDotClientDotIdentitytoolkitLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[GetOobConfirmationCodeResponse]
  /** Get project configuration. */
  def getProjectConfig(request: gapiDotClientDotIdentitytoolkitLib.Anon_AltDelegatedProjectNumber): gapiDotClientLib.gapiNs.clientNs.Request[IdentitytoolkitRelyingpartyGetProjectConfigResponse]
  /** Get token signing public key. */
  def getPublicKeys(request: gapiDotClientDotIdentitytoolkitLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Get recaptcha secure param. */
  def getRecaptchaParam(request: gapiDotClientDotIdentitytoolkitLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[GetRecaptchaParamResponse]
  /** Reset password for a user. */
  def resetPassword(request: gapiDotClientDotIdentitytoolkitLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[ResetPasswordResponse]
  /** Send SMS verification code. */
  def sendVerificationCode(request: gapiDotClientDotIdentitytoolkitLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[IdentitytoolkitRelyingpartySendVerificationCodeResponse]
  /** Set account info for a user. */
  def setAccountInfo(request: gapiDotClientDotIdentitytoolkitLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[SetAccountInfoResponse]
  /** Set project configuration. */
  def setProjectConfig(request: gapiDotClientDotIdentitytoolkitLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[IdentitytoolkitRelyingpartySetProjectConfigResponse]
  /** Sign out user. */
  def signOutUser(request: gapiDotClientDotIdentitytoolkitLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[IdentitytoolkitRelyingpartySignOutUserResponse]
  /** Signup new user. */
  def signupNewUser(request: gapiDotClientDotIdentitytoolkitLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[SignupNewUserResponse]
  /** Batch upload existing user accounts. */
  def uploadAccount(request: gapiDotClientDotIdentitytoolkitLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[UploadAccountResponse]
  /** Verifies the assertion returned by the IdP. */
  def verifyAssertion(request: gapiDotClientDotIdentitytoolkitLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[VerifyAssertionResponse]
  /** Verifies the developer asserted ID token. */
  def verifyCustomToken(request: gapiDotClientDotIdentitytoolkitLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[VerifyCustomTokenResponse]
  /** Verifies the user entered password. */
  def verifyPassword(request: gapiDotClientDotIdentitytoolkitLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[VerifyPasswordResponse]
  /** Verifies ownership of a phone number and creates/updates the user account accordingly. */
  def verifyPhoneNumber(request: gapiDotClientDotIdentitytoolkitLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse]
}

object RelyingpartyResource {
  @scala.inline
  def apply(
    createAuthUri: js.Function1[
      gapiDotClientDotIdentitytoolkitLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[CreateAuthUriResponse]
    ],
    deleteAccount: js.Function1[
      gapiDotClientDotIdentitytoolkitLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[DeleteAccountResponse]
    ],
    downloadAccount: js.Function1[
      gapiDotClientDotIdentitytoolkitLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[DownloadAccountResponse]
    ],
    emailLinkSignin: js.Function1[
      gapiDotClientDotIdentitytoolkitLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[EmailLinkSigninResponse]
    ],
    getAccountInfo: js.Function1[
      gapiDotClientDotIdentitytoolkitLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[GetAccountInfoResponse]
    ],
    getOobConfirmationCode: js.Function1[
      gapiDotClientDotIdentitytoolkitLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[GetOobConfirmationCodeResponse]
    ],
    getProjectConfig: js.Function1[
      gapiDotClientDotIdentitytoolkitLib.Anon_AltDelegatedProjectNumber, 
      gapiDotClientLib.gapiNs.clientNs.Request[IdentitytoolkitRelyingpartyGetProjectConfigResponse]
    ],
    getPublicKeys: js.Function1[
      gapiDotClientDotIdentitytoolkitLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
    ],
    getRecaptchaParam: js.Function1[
      gapiDotClientDotIdentitytoolkitLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[GetRecaptchaParamResponse]
    ],
    resetPassword: js.Function1[
      gapiDotClientDotIdentitytoolkitLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[ResetPasswordResponse]
    ],
    sendVerificationCode: js.Function1[
      gapiDotClientDotIdentitytoolkitLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[IdentitytoolkitRelyingpartySendVerificationCodeResponse]
    ],
    setAccountInfo: js.Function1[
      gapiDotClientDotIdentitytoolkitLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[SetAccountInfoResponse]
    ],
    setProjectConfig: js.Function1[
      gapiDotClientDotIdentitytoolkitLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[IdentitytoolkitRelyingpartySetProjectConfigResponse]
    ],
    signOutUser: js.Function1[
      gapiDotClientDotIdentitytoolkitLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[IdentitytoolkitRelyingpartySignOutUserResponse]
    ],
    signupNewUser: js.Function1[
      gapiDotClientDotIdentitytoolkitLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[SignupNewUserResponse]
    ],
    uploadAccount: js.Function1[
      gapiDotClientDotIdentitytoolkitLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[UploadAccountResponse]
    ],
    verifyAssertion: js.Function1[
      gapiDotClientDotIdentitytoolkitLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[VerifyAssertionResponse]
    ],
    verifyCustomToken: js.Function1[
      gapiDotClientDotIdentitytoolkitLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[VerifyCustomTokenResponse]
    ],
    verifyPassword: js.Function1[
      gapiDotClientDotIdentitytoolkitLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[VerifyPasswordResponse]
    ],
    verifyPhoneNumber: js.Function1[
      gapiDotClientDotIdentitytoolkitLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse]
    ]
  ): RelyingpartyResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createAuthUri")(createAuthUri)
    __obj.updateDynamic("deleteAccount")(deleteAccount)
    __obj.updateDynamic("downloadAccount")(downloadAccount)
    __obj.updateDynamic("emailLinkSignin")(emailLinkSignin)
    __obj.updateDynamic("getAccountInfo")(getAccountInfo)
    __obj.updateDynamic("getOobConfirmationCode")(getOobConfirmationCode)
    __obj.updateDynamic("getProjectConfig")(getProjectConfig)
    __obj.updateDynamic("getPublicKeys")(getPublicKeys)
    __obj.updateDynamic("getRecaptchaParam")(getRecaptchaParam)
    __obj.updateDynamic("resetPassword")(resetPassword)
    __obj.updateDynamic("sendVerificationCode")(sendVerificationCode)
    __obj.updateDynamic("setAccountInfo")(setAccountInfo)
    __obj.updateDynamic("setProjectConfig")(setProjectConfig)
    __obj.updateDynamic("signOutUser")(signOutUser)
    __obj.updateDynamic("signupNewUser")(signupNewUser)
    __obj.updateDynamic("uploadAccount")(uploadAccount)
    __obj.updateDynamic("verifyAssertion")(verifyAssertion)
    __obj.updateDynamic("verifyCustomToken")(verifyCustomToken)
    __obj.updateDynamic("verifyPassword")(verifyPassword)
    __obj.updateDynamic("verifyPhoneNumber")(verifyPhoneNumber)
    __obj.asInstanceOf[RelyingpartyResource]
  }
}

