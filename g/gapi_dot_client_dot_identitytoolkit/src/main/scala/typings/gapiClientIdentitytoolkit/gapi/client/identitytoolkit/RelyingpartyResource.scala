package typings.gapiClientIdentitytoolkit.gapi.client.identitytoolkit

import typings.gapiClient.gapi.client.Request
import typings.gapiClientIdentitytoolkit.anon.Alt
import typings.gapiClientIdentitytoolkit.anon.DelegatedProjectNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelyingpartyResource extends js.Object {
  /** Creates the URI used by the IdP to authenticate the user. */
  def createAuthUri(request: Alt): Request[CreateAuthUriResponse]
  /** Delete user account. */
  def deleteAccount(request: Alt): Request[DeleteAccountResponse]
  /** Batch download user accounts. */
  def downloadAccount(request: Alt): Request[DownloadAccountResponse]
  /** Reset password for a user. */
  def emailLinkSignin(request: Alt): Request[EmailLinkSigninResponse]
  /** Returns the account info. */
  def getAccountInfo(request: Alt): Request[GetAccountInfoResponse]
  /** Get a code for user action confirmation. */
  def getOobConfirmationCode(request: Alt): Request[GetOobConfirmationCodeResponse]
  /** Get project configuration. */
  def getProjectConfig(request: DelegatedProjectNumber): Request[IdentitytoolkitRelyingpartyGetProjectConfigResponse]
  /** Get token signing public key. */
  def getPublicKeys(request: Alt): Request[js.Object]
  /** Get recaptcha secure param. */
  def getRecaptchaParam(request: Alt): Request[GetRecaptchaParamResponse]
  /** Reset password for a user. */
  def resetPassword(request: Alt): Request[ResetPasswordResponse]
  /** Send SMS verification code. */
  def sendVerificationCode(request: Alt): Request[IdentitytoolkitRelyingpartySendVerificationCodeResponse]
  /** Set account info for a user. */
  def setAccountInfo(request: Alt): Request[SetAccountInfoResponse]
  /** Set project configuration. */
  def setProjectConfig(request: Alt): Request[IdentitytoolkitRelyingpartySetProjectConfigResponse]
  /** Sign out user. */
  def signOutUser(request: Alt): Request[IdentitytoolkitRelyingpartySignOutUserResponse]
  /** Signup new user. */
  def signupNewUser(request: Alt): Request[SignupNewUserResponse]
  /** Batch upload existing user accounts. */
  def uploadAccount(request: Alt): Request[UploadAccountResponse]
  /** Verifies the assertion returned by the IdP. */
  def verifyAssertion(request: Alt): Request[VerifyAssertionResponse]
  /** Verifies the developer asserted ID token. */
  def verifyCustomToken(request: Alt): Request[VerifyCustomTokenResponse]
  /** Verifies the user entered password. */
  def verifyPassword(request: Alt): Request[VerifyPasswordResponse]
  /** Verifies ownership of a phone number and creates/updates the user account accordingly. */
  def verifyPhoneNumber(request: Alt): Request[IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse]
}

object RelyingpartyResource {
  @scala.inline
  def apply(
    createAuthUri: Alt => Request[CreateAuthUriResponse],
    deleteAccount: Alt => Request[DeleteAccountResponse],
    downloadAccount: Alt => Request[DownloadAccountResponse],
    emailLinkSignin: Alt => Request[EmailLinkSigninResponse],
    getAccountInfo: Alt => Request[GetAccountInfoResponse],
    getOobConfirmationCode: Alt => Request[GetOobConfirmationCodeResponse],
    getProjectConfig: DelegatedProjectNumber => Request[IdentitytoolkitRelyingpartyGetProjectConfigResponse],
    getPublicKeys: Alt => Request[js.Object],
    getRecaptchaParam: Alt => Request[GetRecaptchaParamResponse],
    resetPassword: Alt => Request[ResetPasswordResponse],
    sendVerificationCode: Alt => Request[IdentitytoolkitRelyingpartySendVerificationCodeResponse],
    setAccountInfo: Alt => Request[SetAccountInfoResponse],
    setProjectConfig: Alt => Request[IdentitytoolkitRelyingpartySetProjectConfigResponse],
    signOutUser: Alt => Request[IdentitytoolkitRelyingpartySignOutUserResponse],
    signupNewUser: Alt => Request[SignupNewUserResponse],
    uploadAccount: Alt => Request[UploadAccountResponse],
    verifyAssertion: Alt => Request[VerifyAssertionResponse],
    verifyCustomToken: Alt => Request[VerifyCustomTokenResponse],
    verifyPassword: Alt => Request[VerifyPasswordResponse],
    verifyPhoneNumber: Alt => Request[IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse]
  ): RelyingpartyResource = {
    val __obj = js.Dynamic.literal(createAuthUri = js.Any.fromFunction1(createAuthUri), deleteAccount = js.Any.fromFunction1(deleteAccount), downloadAccount = js.Any.fromFunction1(downloadAccount), emailLinkSignin = js.Any.fromFunction1(emailLinkSignin), getAccountInfo = js.Any.fromFunction1(getAccountInfo), getOobConfirmationCode = js.Any.fromFunction1(getOobConfirmationCode), getProjectConfig = js.Any.fromFunction1(getProjectConfig), getPublicKeys = js.Any.fromFunction1(getPublicKeys), getRecaptchaParam = js.Any.fromFunction1(getRecaptchaParam), resetPassword = js.Any.fromFunction1(resetPassword), sendVerificationCode = js.Any.fromFunction1(sendVerificationCode), setAccountInfo = js.Any.fromFunction1(setAccountInfo), setProjectConfig = js.Any.fromFunction1(setProjectConfig), signOutUser = js.Any.fromFunction1(signOutUser), signupNewUser = js.Any.fromFunction1(signupNewUser), uploadAccount = js.Any.fromFunction1(uploadAccount), verifyAssertion = js.Any.fromFunction1(verifyAssertion), verifyCustomToken = js.Any.fromFunction1(verifyCustomToken), verifyPassword = js.Any.fromFunction1(verifyPassword), verifyPhoneNumber = js.Any.fromFunction1(verifyPhoneNumber))
    __obj.asInstanceOf[RelyingpartyResource]
  }
}

