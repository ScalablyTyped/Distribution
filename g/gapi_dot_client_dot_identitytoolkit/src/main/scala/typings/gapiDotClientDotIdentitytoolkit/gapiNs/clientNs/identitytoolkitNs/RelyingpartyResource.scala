package typings.gapiDotClientDotIdentitytoolkit.gapiNs.clientNs.identitytoolkitNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotIdentitytoolkit.Anon_Alt
import typings.gapiDotClientDotIdentitytoolkit.Anon_AltDelegatedProjectNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelyingpartyResource extends js.Object {
  /** Creates the URI used by the IdP to authenticate the user. */
  def createAuthUri(request: Anon_Alt): Request[CreateAuthUriResponse]
  /** Delete user account. */
  def deleteAccount(request: Anon_Alt): Request[DeleteAccountResponse]
  /** Batch download user accounts. */
  def downloadAccount(request: Anon_Alt): Request[DownloadAccountResponse]
  /** Reset password for a user. */
  def emailLinkSignin(request: Anon_Alt): Request[EmailLinkSigninResponse]
  /** Returns the account info. */
  def getAccountInfo(request: Anon_Alt): Request[GetAccountInfoResponse]
  /** Get a code for user action confirmation. */
  def getOobConfirmationCode(request: Anon_Alt): Request[GetOobConfirmationCodeResponse]
  /** Get project configuration. */
  def getProjectConfig(request: Anon_AltDelegatedProjectNumber): Request[IdentitytoolkitRelyingpartyGetProjectConfigResponse]
  /** Get token signing public key. */
  def getPublicKeys(request: Anon_Alt): Request[js.Object]
  /** Get recaptcha secure param. */
  def getRecaptchaParam(request: Anon_Alt): Request[GetRecaptchaParamResponse]
  /** Reset password for a user. */
  def resetPassword(request: Anon_Alt): Request[ResetPasswordResponse]
  /** Send SMS verification code. */
  def sendVerificationCode(request: Anon_Alt): Request[IdentitytoolkitRelyingpartySendVerificationCodeResponse]
  /** Set account info for a user. */
  def setAccountInfo(request: Anon_Alt): Request[SetAccountInfoResponse]
  /** Set project configuration. */
  def setProjectConfig(request: Anon_Alt): Request[IdentitytoolkitRelyingpartySetProjectConfigResponse]
  /** Sign out user. */
  def signOutUser(request: Anon_Alt): Request[IdentitytoolkitRelyingpartySignOutUserResponse]
  /** Signup new user. */
  def signupNewUser(request: Anon_Alt): Request[SignupNewUserResponse]
  /** Batch upload existing user accounts. */
  def uploadAccount(request: Anon_Alt): Request[UploadAccountResponse]
  /** Verifies the assertion returned by the IdP. */
  def verifyAssertion(request: Anon_Alt): Request[VerifyAssertionResponse]
  /** Verifies the developer asserted ID token. */
  def verifyCustomToken(request: Anon_Alt): Request[VerifyCustomTokenResponse]
  /** Verifies the user entered password. */
  def verifyPassword(request: Anon_Alt): Request[VerifyPasswordResponse]
  /** Verifies ownership of a phone number and creates/updates the user account accordingly. */
  def verifyPhoneNumber(request: Anon_Alt): Request[IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse]
}

object RelyingpartyResource {
  @scala.inline
  def apply(
    createAuthUri: Anon_Alt => Request[CreateAuthUriResponse],
    deleteAccount: Anon_Alt => Request[DeleteAccountResponse],
    downloadAccount: Anon_Alt => Request[DownloadAccountResponse],
    emailLinkSignin: Anon_Alt => Request[EmailLinkSigninResponse],
    getAccountInfo: Anon_Alt => Request[GetAccountInfoResponse],
    getOobConfirmationCode: Anon_Alt => Request[GetOobConfirmationCodeResponse],
    getProjectConfig: Anon_AltDelegatedProjectNumber => Request[IdentitytoolkitRelyingpartyGetProjectConfigResponse],
    getPublicKeys: Anon_Alt => Request[js.Object],
    getRecaptchaParam: Anon_Alt => Request[GetRecaptchaParamResponse],
    resetPassword: Anon_Alt => Request[ResetPasswordResponse],
    sendVerificationCode: Anon_Alt => Request[IdentitytoolkitRelyingpartySendVerificationCodeResponse],
    setAccountInfo: Anon_Alt => Request[SetAccountInfoResponse],
    setProjectConfig: Anon_Alt => Request[IdentitytoolkitRelyingpartySetProjectConfigResponse],
    signOutUser: Anon_Alt => Request[IdentitytoolkitRelyingpartySignOutUserResponse],
    signupNewUser: Anon_Alt => Request[SignupNewUserResponse],
    uploadAccount: Anon_Alt => Request[UploadAccountResponse],
    verifyAssertion: Anon_Alt => Request[VerifyAssertionResponse],
    verifyCustomToken: Anon_Alt => Request[VerifyCustomTokenResponse],
    verifyPassword: Anon_Alt => Request[VerifyPasswordResponse],
    verifyPhoneNumber: Anon_Alt => Request[IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse]
  ): RelyingpartyResource = {
    val __obj = js.Dynamic.literal(createAuthUri = js.Any.fromFunction1(createAuthUri), deleteAccount = js.Any.fromFunction1(deleteAccount), downloadAccount = js.Any.fromFunction1(downloadAccount), emailLinkSignin = js.Any.fromFunction1(emailLinkSignin), getAccountInfo = js.Any.fromFunction1(getAccountInfo), getOobConfirmationCode = js.Any.fromFunction1(getOobConfirmationCode), getProjectConfig = js.Any.fromFunction1(getProjectConfig), getPublicKeys = js.Any.fromFunction1(getPublicKeys), getRecaptchaParam = js.Any.fromFunction1(getRecaptchaParam), resetPassword = js.Any.fromFunction1(resetPassword), sendVerificationCode = js.Any.fromFunction1(sendVerificationCode), setAccountInfo = js.Any.fromFunction1(setAccountInfo), setProjectConfig = js.Any.fromFunction1(setProjectConfig), signOutUser = js.Any.fromFunction1(signOutUser), signupNewUser = js.Any.fromFunction1(signupNewUser), uploadAccount = js.Any.fromFunction1(uploadAccount), verifyAssertion = js.Any.fromFunction1(verifyAssertion), verifyCustomToken = js.Any.fromFunction1(verifyCustomToken), verifyPassword = js.Any.fromFunction1(verifyPassword), verifyPhoneNumber = js.Any.fromFunction1(verifyPhoneNumber))
  
    __obj.asInstanceOf[RelyingpartyResource]
  }
}

