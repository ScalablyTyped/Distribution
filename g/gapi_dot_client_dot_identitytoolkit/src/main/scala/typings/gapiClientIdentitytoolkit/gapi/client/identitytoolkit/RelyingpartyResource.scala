package typings.gapiClientIdentitytoolkit.gapi.client.identitytoolkit

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientIdentitytoolkit.AnonAlt
import typings.gapiClientIdentitytoolkit.AnonAltDelegatedProjectNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelyingpartyResource extends js.Object {
  /** Creates the URI used by the IdP to authenticate the user. */
  def createAuthUri(request: AnonAlt): Request_[CreateAuthUriResponse]
  /** Delete user account. */
  def deleteAccount(request: AnonAlt): Request_[DeleteAccountResponse]
  /** Batch download user accounts. */
  def downloadAccount(request: AnonAlt): Request_[DownloadAccountResponse]
  /** Reset password for a user. */
  def emailLinkSignin(request: AnonAlt): Request_[EmailLinkSigninResponse]
  /** Returns the account info. */
  def getAccountInfo(request: AnonAlt): Request_[GetAccountInfoResponse]
  /** Get a code for user action confirmation. */
  def getOobConfirmationCode(request: AnonAlt): Request_[GetOobConfirmationCodeResponse]
  /** Get project configuration. */
  def getProjectConfig(request: AnonAltDelegatedProjectNumber): Request_[IdentitytoolkitRelyingpartyGetProjectConfigResponse]
  /** Get token signing public key. */
  def getPublicKeys(request: AnonAlt): Request_[js.Object]
  /** Get recaptcha secure param. */
  def getRecaptchaParam(request: AnonAlt): Request_[GetRecaptchaParamResponse]
  /** Reset password for a user. */
  def resetPassword(request: AnonAlt): Request_[ResetPasswordResponse]
  /** Send SMS verification code. */
  def sendVerificationCode(request: AnonAlt): Request_[IdentitytoolkitRelyingpartySendVerificationCodeResponse]
  /** Set account info for a user. */
  def setAccountInfo(request: AnonAlt): Request_[SetAccountInfoResponse]
  /** Set project configuration. */
  def setProjectConfig(request: AnonAlt): Request_[IdentitytoolkitRelyingpartySetProjectConfigResponse]
  /** Sign out user. */
  def signOutUser(request: AnonAlt): Request_[IdentitytoolkitRelyingpartySignOutUserResponse]
  /** Signup new user. */
  def signupNewUser(request: AnonAlt): Request_[SignupNewUserResponse]
  /** Batch upload existing user accounts. */
  def uploadAccount(request: AnonAlt): Request_[UploadAccountResponse]
  /** Verifies the assertion returned by the IdP. */
  def verifyAssertion(request: AnonAlt): Request_[VerifyAssertionResponse]
  /** Verifies the developer asserted ID token. */
  def verifyCustomToken(request: AnonAlt): Request_[VerifyCustomTokenResponse]
  /** Verifies the user entered password. */
  def verifyPassword(request: AnonAlt): Request_[VerifyPasswordResponse]
  /** Verifies ownership of a phone number and creates/updates the user account accordingly. */
  def verifyPhoneNumber(request: AnonAlt): Request_[IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse]
}

object RelyingpartyResource {
  @scala.inline
  def apply(
    createAuthUri: AnonAlt => Request_[CreateAuthUriResponse],
    deleteAccount: AnonAlt => Request_[DeleteAccountResponse],
    downloadAccount: AnonAlt => Request_[DownloadAccountResponse],
    emailLinkSignin: AnonAlt => Request_[EmailLinkSigninResponse],
    getAccountInfo: AnonAlt => Request_[GetAccountInfoResponse],
    getOobConfirmationCode: AnonAlt => Request_[GetOobConfirmationCodeResponse],
    getProjectConfig: AnonAltDelegatedProjectNumber => Request_[IdentitytoolkitRelyingpartyGetProjectConfigResponse],
    getPublicKeys: AnonAlt => Request_[js.Object],
    getRecaptchaParam: AnonAlt => Request_[GetRecaptchaParamResponse],
    resetPassword: AnonAlt => Request_[ResetPasswordResponse],
    sendVerificationCode: AnonAlt => Request_[IdentitytoolkitRelyingpartySendVerificationCodeResponse],
    setAccountInfo: AnonAlt => Request_[SetAccountInfoResponse],
    setProjectConfig: AnonAlt => Request_[IdentitytoolkitRelyingpartySetProjectConfigResponse],
    signOutUser: AnonAlt => Request_[IdentitytoolkitRelyingpartySignOutUserResponse],
    signupNewUser: AnonAlt => Request_[SignupNewUserResponse],
    uploadAccount: AnonAlt => Request_[UploadAccountResponse],
    verifyAssertion: AnonAlt => Request_[VerifyAssertionResponse],
    verifyCustomToken: AnonAlt => Request_[VerifyCustomTokenResponse],
    verifyPassword: AnonAlt => Request_[VerifyPasswordResponse],
    verifyPhoneNumber: AnonAlt => Request_[IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse]
  ): RelyingpartyResource = {
    val __obj = js.Dynamic.literal(createAuthUri = js.Any.fromFunction1(createAuthUri), deleteAccount = js.Any.fromFunction1(deleteAccount), downloadAccount = js.Any.fromFunction1(downloadAccount), emailLinkSignin = js.Any.fromFunction1(emailLinkSignin), getAccountInfo = js.Any.fromFunction1(getAccountInfo), getOobConfirmationCode = js.Any.fromFunction1(getOobConfirmationCode), getProjectConfig = js.Any.fromFunction1(getProjectConfig), getPublicKeys = js.Any.fromFunction1(getPublicKeys), getRecaptchaParam = js.Any.fromFunction1(getRecaptchaParam), resetPassword = js.Any.fromFunction1(resetPassword), sendVerificationCode = js.Any.fromFunction1(sendVerificationCode), setAccountInfo = js.Any.fromFunction1(setAccountInfo), setProjectConfig = js.Any.fromFunction1(setProjectConfig), signOutUser = js.Any.fromFunction1(signOutUser), signupNewUser = js.Any.fromFunction1(signupNewUser), uploadAccount = js.Any.fromFunction1(uploadAccount), verifyAssertion = js.Any.fromFunction1(verifyAssertion), verifyCustomToken = js.Any.fromFunction1(verifyCustomToken), verifyPassword = js.Any.fromFunction1(verifyPassword), verifyPhoneNumber = js.Any.fromFunction1(verifyPhoneNumber))
  
    __obj.asInstanceOf[RelyingpartyResource]
  }
}

