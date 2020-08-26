package typings.gapiClientIdentitytoolkit.gapi.client.identitytoolkit

import typings.gapiClient.gapi.client.Request
import typings.gapiClientIdentitytoolkit.anon.Alt
import typings.gapiClientIdentitytoolkit.anon.DelegatedProjectNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelyingpartyResource extends js.Object {
  /** Creates the URI used by the IdP to authenticate the user. */
  def createAuthUri(request: Alt): Request[CreateAuthUriResponse] = js.native
  /** Delete user account. */
  def deleteAccount(request: Alt): Request[DeleteAccountResponse] = js.native
  /** Batch download user accounts. */
  def downloadAccount(request: Alt): Request[DownloadAccountResponse] = js.native
  /** Reset password for a user. */
  def emailLinkSignin(request: Alt): Request[EmailLinkSigninResponse] = js.native
  /** Returns the account info. */
  def getAccountInfo(request: Alt): Request[GetAccountInfoResponse] = js.native
  /** Get a code for user action confirmation. */
  def getOobConfirmationCode(request: Alt): Request[GetOobConfirmationCodeResponse] = js.native
  /** Get project configuration. */
  def getProjectConfig(request: DelegatedProjectNumber): Request[IdentitytoolkitRelyingpartyGetProjectConfigResponse] = js.native
  /** Get token signing public key. */
  def getPublicKeys(request: Alt): Request[js.Object] = js.native
  /** Get recaptcha secure param. */
  def getRecaptchaParam(request: Alt): Request[GetRecaptchaParamResponse] = js.native
  /** Reset password for a user. */
  def resetPassword(request: Alt): Request[ResetPasswordResponse] = js.native
  /** Send SMS verification code. */
  def sendVerificationCode(request: Alt): Request[IdentitytoolkitRelyingpartySendVerificationCodeResponse] = js.native
  /** Set account info for a user. */
  def setAccountInfo(request: Alt): Request[SetAccountInfoResponse] = js.native
  /** Set project configuration. */
  def setProjectConfig(request: Alt): Request[IdentitytoolkitRelyingpartySetProjectConfigResponse] = js.native
  /** Sign out user. */
  def signOutUser(request: Alt): Request[IdentitytoolkitRelyingpartySignOutUserResponse] = js.native
  /** Signup new user. */
  def signupNewUser(request: Alt): Request[SignupNewUserResponse] = js.native
  /** Batch upload existing user accounts. */
  def uploadAccount(request: Alt): Request[UploadAccountResponse] = js.native
  /** Verifies the assertion returned by the IdP. */
  def verifyAssertion(request: Alt): Request[VerifyAssertionResponse] = js.native
  /** Verifies the developer asserted ID token. */
  def verifyCustomToken(request: Alt): Request[VerifyCustomTokenResponse] = js.native
  /** Verifies the user entered password. */
  def verifyPassword(request: Alt): Request[VerifyPasswordResponse] = js.native
  /** Verifies ownership of a phone number and creates/updates the user account accordingly. */
  def verifyPhoneNumber(request: Alt): Request[IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse] = js.native
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
  @scala.inline
  implicit class RelyingpartyResourceOps[Self <: RelyingpartyResource] (val x: Self) extends AnyVal {
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
    def setCreateAuthUri(value: Alt => Request[CreateAuthUriResponse]): Self = this.set("createAuthUri", js.Any.fromFunction1(value))
    @scala.inline
    def setDeleteAccount(value: Alt => Request[DeleteAccountResponse]): Self = this.set("deleteAccount", js.Any.fromFunction1(value))
    @scala.inline
    def setDownloadAccount(value: Alt => Request[DownloadAccountResponse]): Self = this.set("downloadAccount", js.Any.fromFunction1(value))
    @scala.inline
    def setEmailLinkSignin(value: Alt => Request[EmailLinkSigninResponse]): Self = this.set("emailLinkSignin", js.Any.fromFunction1(value))
    @scala.inline
    def setGetAccountInfo(value: Alt => Request[GetAccountInfoResponse]): Self = this.set("getAccountInfo", js.Any.fromFunction1(value))
    @scala.inline
    def setGetOobConfirmationCode(value: Alt => Request[GetOobConfirmationCodeResponse]): Self = this.set("getOobConfirmationCode", js.Any.fromFunction1(value))
    @scala.inline
    def setGetProjectConfig(value: DelegatedProjectNumber => Request[IdentitytoolkitRelyingpartyGetProjectConfigResponse]): Self = this.set("getProjectConfig", js.Any.fromFunction1(value))
    @scala.inline
    def setGetPublicKeys(value: Alt => Request[js.Object]): Self = this.set("getPublicKeys", js.Any.fromFunction1(value))
    @scala.inline
    def setGetRecaptchaParam(value: Alt => Request[GetRecaptchaParamResponse]): Self = this.set("getRecaptchaParam", js.Any.fromFunction1(value))
    @scala.inline
    def setResetPassword(value: Alt => Request[ResetPasswordResponse]): Self = this.set("resetPassword", js.Any.fromFunction1(value))
    @scala.inline
    def setSendVerificationCode(value: Alt => Request[IdentitytoolkitRelyingpartySendVerificationCodeResponse]): Self = this.set("sendVerificationCode", js.Any.fromFunction1(value))
    @scala.inline
    def setSetAccountInfo(value: Alt => Request[SetAccountInfoResponse]): Self = this.set("setAccountInfo", js.Any.fromFunction1(value))
    @scala.inline
    def setSetProjectConfig(value: Alt => Request[IdentitytoolkitRelyingpartySetProjectConfigResponse]): Self = this.set("setProjectConfig", js.Any.fromFunction1(value))
    @scala.inline
    def setSignOutUser(value: Alt => Request[IdentitytoolkitRelyingpartySignOutUserResponse]): Self = this.set("signOutUser", js.Any.fromFunction1(value))
    @scala.inline
    def setSignupNewUser(value: Alt => Request[SignupNewUserResponse]): Self = this.set("signupNewUser", js.Any.fromFunction1(value))
    @scala.inline
    def setUploadAccount(value: Alt => Request[UploadAccountResponse]): Self = this.set("uploadAccount", js.Any.fromFunction1(value))
    @scala.inline
    def setVerifyAssertion(value: Alt => Request[VerifyAssertionResponse]): Self = this.set("verifyAssertion", js.Any.fromFunction1(value))
    @scala.inline
    def setVerifyCustomToken(value: Alt => Request[VerifyCustomTokenResponse]): Self = this.set("verifyCustomToken", js.Any.fromFunction1(value))
    @scala.inline
    def setVerifyPassword(value: Alt => Request[VerifyPasswordResponse]): Self = this.set("verifyPassword", js.Any.fromFunction1(value))
    @scala.inline
    def setVerifyPhoneNumber(value: Alt => Request[IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse]): Self = this.set("verifyPhoneNumber", js.Any.fromFunction1(value))
  }
  
}

