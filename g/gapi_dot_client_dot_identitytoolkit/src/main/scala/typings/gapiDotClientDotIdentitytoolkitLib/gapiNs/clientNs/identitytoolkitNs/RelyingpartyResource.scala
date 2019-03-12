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
    createAuthUri: gapiDotClientDotIdentitytoolkitLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[CreateAuthUriResponse],
    deleteAccount: gapiDotClientDotIdentitytoolkitLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[DeleteAccountResponse],
    downloadAccount: gapiDotClientDotIdentitytoolkitLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[DownloadAccountResponse],
    emailLinkSignin: gapiDotClientDotIdentitytoolkitLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[EmailLinkSigninResponse],
    getAccountInfo: gapiDotClientDotIdentitytoolkitLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[GetAccountInfoResponse],
    getOobConfirmationCode: gapiDotClientDotIdentitytoolkitLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[GetOobConfirmationCodeResponse],
    getProjectConfig: gapiDotClientDotIdentitytoolkitLib.Anon_AltDelegatedProjectNumber => gapiDotClientLib.gapiNs.clientNs.Request[IdentitytoolkitRelyingpartyGetProjectConfigResponse],
    getPublicKeys: gapiDotClientDotIdentitytoolkitLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[js.Object],
    getRecaptchaParam: gapiDotClientDotIdentitytoolkitLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[GetRecaptchaParamResponse],
    resetPassword: gapiDotClientDotIdentitytoolkitLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[ResetPasswordResponse],
    sendVerificationCode: gapiDotClientDotIdentitytoolkitLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[IdentitytoolkitRelyingpartySendVerificationCodeResponse],
    setAccountInfo: gapiDotClientDotIdentitytoolkitLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[SetAccountInfoResponse],
    setProjectConfig: gapiDotClientDotIdentitytoolkitLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[IdentitytoolkitRelyingpartySetProjectConfigResponse],
    signOutUser: gapiDotClientDotIdentitytoolkitLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[IdentitytoolkitRelyingpartySignOutUserResponse],
    signupNewUser: gapiDotClientDotIdentitytoolkitLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[SignupNewUserResponse],
    uploadAccount: gapiDotClientDotIdentitytoolkitLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[UploadAccountResponse],
    verifyAssertion: gapiDotClientDotIdentitytoolkitLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[VerifyAssertionResponse],
    verifyCustomToken: gapiDotClientDotIdentitytoolkitLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[VerifyCustomTokenResponse],
    verifyPassword: gapiDotClientDotIdentitytoolkitLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[VerifyPasswordResponse],
    verifyPhoneNumber: gapiDotClientDotIdentitytoolkitLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse]
  ): RelyingpartyResource = {
    val __obj = js.Dynamic.literal(createAuthUri = js.Any.fromFunction1(createAuthUri), deleteAccount = js.Any.fromFunction1(deleteAccount), downloadAccount = js.Any.fromFunction1(downloadAccount), emailLinkSignin = js.Any.fromFunction1(emailLinkSignin), getAccountInfo = js.Any.fromFunction1(getAccountInfo), getOobConfirmationCode = js.Any.fromFunction1(getOobConfirmationCode), getProjectConfig = js.Any.fromFunction1(getProjectConfig), getPublicKeys = js.Any.fromFunction1(getPublicKeys), getRecaptchaParam = js.Any.fromFunction1(getRecaptchaParam), resetPassword = js.Any.fromFunction1(resetPassword), sendVerificationCode = js.Any.fromFunction1(sendVerificationCode), setAccountInfo = js.Any.fromFunction1(setAccountInfo), setProjectConfig = js.Any.fromFunction1(setProjectConfig), signOutUser = js.Any.fromFunction1(signOutUser), signupNewUser = js.Any.fromFunction1(signupNewUser), uploadAccount = js.Any.fromFunction1(uploadAccount), verifyAssertion = js.Any.fromFunction1(verifyAssertion), verifyCustomToken = js.Any.fromFunction1(verifyCustomToken), verifyPassword = js.Any.fromFunction1(verifyPassword), verifyPhoneNumber = js.Any.fromFunction1(verifyPhoneNumber))
  
    __obj.asInstanceOf[RelyingpartyResource]
  }
}

