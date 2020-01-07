package typings.googleapis.buildSrcApisIdentitytoolkitV3Mod.identitytoolkit_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/identitytoolkit/v3", "identitytoolkit_v3.Resource$Relyingparty")
@js.native
class Resource$Relyingparty protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * identitytoolkit.relyingparty.createAuthUri
    * @desc Creates the URI used by the IdP to authenticate the user.
    * @alias identitytoolkit.relyingparty.createAuthUri
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().IdentitytoolkitRelyingpartyCreateAuthUriRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def createAuthUri(): GaxiosPromise[Schema$CreateAuthUriResponse] = js.native
  def createAuthUri(callback: BodyResponseCallback[Schema$CreateAuthUriResponse]): Unit = js.native
  def createAuthUri(params: ParamsDollarResourceDollarRelyingpartyDollarCreateauthuri): GaxiosPromise[Schema$CreateAuthUriResponse] = js.native
  def createAuthUri(
    params: ParamsDollarResourceDollarRelyingpartyDollarCreateauthuri,
    callback: BodyResponseCallback[Schema$CreateAuthUriResponse]
  ): Unit = js.native
  def createAuthUri(
    params: ParamsDollarResourceDollarRelyingpartyDollarCreateauthuri,
    options: BodyResponseCallback[Schema$CreateAuthUriResponse],
    callback: BodyResponseCallback[Schema$CreateAuthUriResponse]
  ): Unit = js.native
  def createAuthUri(params: ParamsDollarResourceDollarRelyingpartyDollarCreateauthuri, options: MethodOptions): GaxiosPromise[Schema$CreateAuthUriResponse] = js.native
  def createAuthUri(
    params: ParamsDollarResourceDollarRelyingpartyDollarCreateauthuri,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CreateAuthUriResponse]
  ): Unit = js.native
  /**
    * identitytoolkit.relyingparty.deleteAccount
    * @desc Delete user account.
    * @alias identitytoolkit.relyingparty.deleteAccount
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().IdentitytoolkitRelyingpartyDeleteAccountRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def deleteAccount(): GaxiosPromise[Schema$DeleteAccountResponse] = js.native
  def deleteAccount(callback: BodyResponseCallback[Schema$DeleteAccountResponse]): Unit = js.native
  def deleteAccount(params: ParamsDollarResourceDollarRelyingpartyDollarDeleteaccount): GaxiosPromise[Schema$DeleteAccountResponse] = js.native
  def deleteAccount(
    params: ParamsDollarResourceDollarRelyingpartyDollarDeleteaccount,
    callback: BodyResponseCallback[Schema$DeleteAccountResponse]
  ): Unit = js.native
  def deleteAccount(
    params: ParamsDollarResourceDollarRelyingpartyDollarDeleteaccount,
    options: BodyResponseCallback[Schema$DeleteAccountResponse],
    callback: BodyResponseCallback[Schema$DeleteAccountResponse]
  ): Unit = js.native
  def deleteAccount(params: ParamsDollarResourceDollarRelyingpartyDollarDeleteaccount, options: MethodOptions): GaxiosPromise[Schema$DeleteAccountResponse] = js.native
  def deleteAccount(
    params: ParamsDollarResourceDollarRelyingpartyDollarDeleteaccount,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DeleteAccountResponse]
  ): Unit = js.native
  /**
    * identitytoolkit.relyingparty.downloadAccount
    * @desc Batch download user accounts.
    * @alias identitytoolkit.relyingparty.downloadAccount
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().IdentitytoolkitRelyingpartyDownloadAccountRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def downloadAccount(): GaxiosPromise[Schema$DownloadAccountResponse] = js.native
  def downloadAccount(callback: BodyResponseCallback[Schema$DownloadAccountResponse]): Unit = js.native
  def downloadAccount(params: ParamsDollarResourceDollarRelyingpartyDollarDownloadaccount): GaxiosPromise[Schema$DownloadAccountResponse] = js.native
  def downloadAccount(
    params: ParamsDollarResourceDollarRelyingpartyDollarDownloadaccount,
    callback: BodyResponseCallback[Schema$DownloadAccountResponse]
  ): Unit = js.native
  def downloadAccount(
    params: ParamsDollarResourceDollarRelyingpartyDollarDownloadaccount,
    options: BodyResponseCallback[Schema$DownloadAccountResponse],
    callback: BodyResponseCallback[Schema$DownloadAccountResponse]
  ): Unit = js.native
  def downloadAccount(params: ParamsDollarResourceDollarRelyingpartyDollarDownloadaccount, options: MethodOptions): GaxiosPromise[Schema$DownloadAccountResponse] = js.native
  def downloadAccount(
    params: ParamsDollarResourceDollarRelyingpartyDollarDownloadaccount,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DownloadAccountResponse]
  ): Unit = js.native
  /**
    * identitytoolkit.relyingparty.emailLinkSignin
    * @desc Reset password for a user.
    * @alias identitytoolkit.relyingparty.emailLinkSignin
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().IdentitytoolkitRelyingpartyEmailLinkSigninRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def emailLinkSignin(): GaxiosPromise[Schema$EmailLinkSigninResponse] = js.native
  def emailLinkSignin(callback: BodyResponseCallback[Schema$EmailLinkSigninResponse]): Unit = js.native
  def emailLinkSignin(params: ParamsDollarResourceDollarRelyingpartyDollarEmaillinksignin): GaxiosPromise[Schema$EmailLinkSigninResponse] = js.native
  def emailLinkSignin(
    params: ParamsDollarResourceDollarRelyingpartyDollarEmaillinksignin,
    callback: BodyResponseCallback[Schema$EmailLinkSigninResponse]
  ): Unit = js.native
  def emailLinkSignin(
    params: ParamsDollarResourceDollarRelyingpartyDollarEmaillinksignin,
    options: BodyResponseCallback[Schema$EmailLinkSigninResponse],
    callback: BodyResponseCallback[Schema$EmailLinkSigninResponse]
  ): Unit = js.native
  def emailLinkSignin(params: ParamsDollarResourceDollarRelyingpartyDollarEmaillinksignin, options: MethodOptions): GaxiosPromise[Schema$EmailLinkSigninResponse] = js.native
  def emailLinkSignin(
    params: ParamsDollarResourceDollarRelyingpartyDollarEmaillinksignin,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$EmailLinkSigninResponse]
  ): Unit = js.native
  /**
    * identitytoolkit.relyingparty.getAccountInfo
    * @desc Returns the account info.
    * @alias identitytoolkit.relyingparty.getAccountInfo
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().IdentitytoolkitRelyingpartyGetAccountInfoRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getAccountInfo(): GaxiosPromise[Schema$GetAccountInfoResponse] = js.native
  def getAccountInfo(callback: BodyResponseCallback[Schema$GetAccountInfoResponse]): Unit = js.native
  def getAccountInfo(params: ParamsDollarResourceDollarRelyingpartyDollarGetaccountinfo): GaxiosPromise[Schema$GetAccountInfoResponse] = js.native
  def getAccountInfo(
    params: ParamsDollarResourceDollarRelyingpartyDollarGetaccountinfo,
    callback: BodyResponseCallback[Schema$GetAccountInfoResponse]
  ): Unit = js.native
  def getAccountInfo(
    params: ParamsDollarResourceDollarRelyingpartyDollarGetaccountinfo,
    options: BodyResponseCallback[Schema$GetAccountInfoResponse],
    callback: BodyResponseCallback[Schema$GetAccountInfoResponse]
  ): Unit = js.native
  def getAccountInfo(params: ParamsDollarResourceDollarRelyingpartyDollarGetaccountinfo, options: MethodOptions): GaxiosPromise[Schema$GetAccountInfoResponse] = js.native
  def getAccountInfo(
    params: ParamsDollarResourceDollarRelyingpartyDollarGetaccountinfo,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GetAccountInfoResponse]
  ): Unit = js.native
  /**
    * identitytoolkit.relyingparty.getOobConfirmationCode
    * @desc Get a code for user action confirmation.
    * @alias identitytoolkit.relyingparty.getOobConfirmationCode
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().Relyingparty} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getOobConfirmationCode(): GaxiosPromise[Schema$GetOobConfirmationCodeResponse] = js.native
  def getOobConfirmationCode(callback: BodyResponseCallback[Schema$GetOobConfirmationCodeResponse]): Unit = js.native
  def getOobConfirmationCode(params: ParamsDollarResourceDollarRelyingpartyDollarGetoobconfirmationcode): GaxiosPromise[Schema$GetOobConfirmationCodeResponse] = js.native
  def getOobConfirmationCode(
    params: ParamsDollarResourceDollarRelyingpartyDollarGetoobconfirmationcode,
    callback: BodyResponseCallback[Schema$GetOobConfirmationCodeResponse]
  ): Unit = js.native
  def getOobConfirmationCode(
    params: ParamsDollarResourceDollarRelyingpartyDollarGetoobconfirmationcode,
    options: BodyResponseCallback[Schema$GetOobConfirmationCodeResponse],
    callback: BodyResponseCallback[Schema$GetOobConfirmationCodeResponse]
  ): Unit = js.native
  def getOobConfirmationCode(params: ParamsDollarResourceDollarRelyingpartyDollarGetoobconfirmationcode, options: MethodOptions): GaxiosPromise[Schema$GetOobConfirmationCodeResponse] = js.native
  def getOobConfirmationCode(
    params: ParamsDollarResourceDollarRelyingpartyDollarGetoobconfirmationcode,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GetOobConfirmationCodeResponse]
  ): Unit = js.native
  /**
    * identitytoolkit.relyingparty.getProjectConfig
    * @desc Get project configuration.
    * @alias identitytoolkit.relyingparty.getProjectConfig
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.delegatedProjectNumber Delegated GCP project number of the request.
    * @param {string=} params.projectNumber GCP project number of the request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getProjectConfig(): GaxiosPromise[Schema$IdentitytoolkitRelyingpartyGetProjectConfigResponse] = js.native
  def getProjectConfig(callback: BodyResponseCallback[Schema$IdentitytoolkitRelyingpartyGetProjectConfigResponse]): Unit = js.native
  def getProjectConfig(params: ParamsDollarResourceDollarRelyingpartyDollarGetprojectconfig): GaxiosPromise[Schema$IdentitytoolkitRelyingpartyGetProjectConfigResponse] = js.native
  def getProjectConfig(
    params: ParamsDollarResourceDollarRelyingpartyDollarGetprojectconfig,
    callback: BodyResponseCallback[Schema$IdentitytoolkitRelyingpartyGetProjectConfigResponse]
  ): Unit = js.native
  def getProjectConfig(
    params: ParamsDollarResourceDollarRelyingpartyDollarGetprojectconfig,
    options: BodyResponseCallback[Schema$IdentitytoolkitRelyingpartyGetProjectConfigResponse],
    callback: BodyResponseCallback[Schema$IdentitytoolkitRelyingpartyGetProjectConfigResponse]
  ): Unit = js.native
  def getProjectConfig(params: ParamsDollarResourceDollarRelyingpartyDollarGetprojectconfig, options: MethodOptions): GaxiosPromise[Schema$IdentitytoolkitRelyingpartyGetProjectConfigResponse] = js.native
  def getProjectConfig(
    params: ParamsDollarResourceDollarRelyingpartyDollarGetprojectconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$IdentitytoolkitRelyingpartyGetProjectConfigResponse]
  ): Unit = js.native
  /**
    * identitytoolkit.relyingparty.getPublicKeys
    * @desc Get token signing public key.
    * @alias identitytoolkit.relyingparty.getPublicKeys
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getPublicKeys(): GaxiosPromise[Schema$IdentitytoolkitRelyingpartyGetPublicKeysResponse] = js.native
  def getPublicKeys(callback: BodyResponseCallback[Schema$IdentitytoolkitRelyingpartyGetPublicKeysResponse]): Unit = js.native
  def getPublicKeys(params: ParamsDollarResourceDollarRelyingpartyDollarGetpublickeys): GaxiosPromise[Schema$IdentitytoolkitRelyingpartyGetPublicKeysResponse] = js.native
  def getPublicKeys(
    params: ParamsDollarResourceDollarRelyingpartyDollarGetpublickeys,
    callback: BodyResponseCallback[Schema$IdentitytoolkitRelyingpartyGetPublicKeysResponse]
  ): Unit = js.native
  def getPublicKeys(
    params: ParamsDollarResourceDollarRelyingpartyDollarGetpublickeys,
    options: BodyResponseCallback[Schema$IdentitytoolkitRelyingpartyGetPublicKeysResponse],
    callback: BodyResponseCallback[Schema$IdentitytoolkitRelyingpartyGetPublicKeysResponse]
  ): Unit = js.native
  def getPublicKeys(params: ParamsDollarResourceDollarRelyingpartyDollarGetpublickeys, options: MethodOptions): GaxiosPromise[Schema$IdentitytoolkitRelyingpartyGetPublicKeysResponse] = js.native
  def getPublicKeys(
    params: ParamsDollarResourceDollarRelyingpartyDollarGetpublickeys,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$IdentitytoolkitRelyingpartyGetPublicKeysResponse]
  ): Unit = js.native
  /**
    * identitytoolkit.relyingparty.getRecaptchaParam
    * @desc Get recaptcha secure param.
    * @alias identitytoolkit.relyingparty.getRecaptchaParam
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getRecaptchaParam(): GaxiosPromise[Schema$GetRecaptchaParamResponse] = js.native
  def getRecaptchaParam(callback: BodyResponseCallback[Schema$GetRecaptchaParamResponse]): Unit = js.native
  def getRecaptchaParam(params: ParamsDollarResourceDollarRelyingpartyDollarGetrecaptchaparam): GaxiosPromise[Schema$GetRecaptchaParamResponse] = js.native
  def getRecaptchaParam(
    params: ParamsDollarResourceDollarRelyingpartyDollarGetrecaptchaparam,
    callback: BodyResponseCallback[Schema$GetRecaptchaParamResponse]
  ): Unit = js.native
  def getRecaptchaParam(
    params: ParamsDollarResourceDollarRelyingpartyDollarGetrecaptchaparam,
    options: BodyResponseCallback[Schema$GetRecaptchaParamResponse],
    callback: BodyResponseCallback[Schema$GetRecaptchaParamResponse]
  ): Unit = js.native
  def getRecaptchaParam(params: ParamsDollarResourceDollarRelyingpartyDollarGetrecaptchaparam, options: MethodOptions): GaxiosPromise[Schema$GetRecaptchaParamResponse] = js.native
  def getRecaptchaParam(
    params: ParamsDollarResourceDollarRelyingpartyDollarGetrecaptchaparam,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GetRecaptchaParamResponse]
  ): Unit = js.native
  /**
    * identitytoolkit.relyingparty.resetPassword
    * @desc Reset password for a user.
    * @alias identitytoolkit.relyingparty.resetPassword
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().IdentitytoolkitRelyingpartyResetPasswordRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resetPassword(): GaxiosPromise[Schema$ResetPasswordResponse] = js.native
  def resetPassword(callback: BodyResponseCallback[Schema$ResetPasswordResponse]): Unit = js.native
  def resetPassword(params: ParamsDollarResourceDollarRelyingpartyDollarResetpassword): GaxiosPromise[Schema$ResetPasswordResponse] = js.native
  def resetPassword(
    params: ParamsDollarResourceDollarRelyingpartyDollarResetpassword,
    callback: BodyResponseCallback[Schema$ResetPasswordResponse]
  ): Unit = js.native
  def resetPassword(
    params: ParamsDollarResourceDollarRelyingpartyDollarResetpassword,
    options: BodyResponseCallback[Schema$ResetPasswordResponse],
    callback: BodyResponseCallback[Schema$ResetPasswordResponse]
  ): Unit = js.native
  def resetPassword(params: ParamsDollarResourceDollarRelyingpartyDollarResetpassword, options: MethodOptions): GaxiosPromise[Schema$ResetPasswordResponse] = js.native
  def resetPassword(
    params: ParamsDollarResourceDollarRelyingpartyDollarResetpassword,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ResetPasswordResponse]
  ): Unit = js.native
  /**
    * identitytoolkit.relyingparty.sendVerificationCode
    * @desc Send SMS verification code.
    * @alias identitytoolkit.relyingparty.sendVerificationCode
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().IdentitytoolkitRelyingpartySendVerificationCodeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def sendVerificationCode(): GaxiosPromise[Schema$IdentitytoolkitRelyingpartySendVerificationCodeResponse] = js.native
  def sendVerificationCode(callback: BodyResponseCallback[Schema$IdentitytoolkitRelyingpartySendVerificationCodeResponse]): Unit = js.native
  def sendVerificationCode(params: ParamsDollarResourceDollarRelyingpartyDollarSendverificationcode): GaxiosPromise[Schema$IdentitytoolkitRelyingpartySendVerificationCodeResponse] = js.native
  def sendVerificationCode(
    params: ParamsDollarResourceDollarRelyingpartyDollarSendverificationcode,
    callback: BodyResponseCallback[Schema$IdentitytoolkitRelyingpartySendVerificationCodeResponse]
  ): Unit = js.native
  def sendVerificationCode(
    params: ParamsDollarResourceDollarRelyingpartyDollarSendverificationcode,
    options: BodyResponseCallback[Schema$IdentitytoolkitRelyingpartySendVerificationCodeResponse],
    callback: BodyResponseCallback[Schema$IdentitytoolkitRelyingpartySendVerificationCodeResponse]
  ): Unit = js.native
  def sendVerificationCode(params: ParamsDollarResourceDollarRelyingpartyDollarSendverificationcode, options: MethodOptions): GaxiosPromise[Schema$IdentitytoolkitRelyingpartySendVerificationCodeResponse] = js.native
  def sendVerificationCode(
    params: ParamsDollarResourceDollarRelyingpartyDollarSendverificationcode,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$IdentitytoolkitRelyingpartySendVerificationCodeResponse]
  ): Unit = js.native
  /**
    * identitytoolkit.relyingparty.setAccountInfo
    * @desc Set account info for a user.
    * @alias identitytoolkit.relyingparty.setAccountInfo
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().IdentitytoolkitRelyingpartySetAccountInfoRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setAccountInfo(): GaxiosPromise[Schema$SetAccountInfoResponse] = js.native
  def setAccountInfo(callback: BodyResponseCallback[Schema$SetAccountInfoResponse]): Unit = js.native
  def setAccountInfo(params: ParamsDollarResourceDollarRelyingpartyDollarSetaccountinfo): GaxiosPromise[Schema$SetAccountInfoResponse] = js.native
  def setAccountInfo(
    params: ParamsDollarResourceDollarRelyingpartyDollarSetaccountinfo,
    callback: BodyResponseCallback[Schema$SetAccountInfoResponse]
  ): Unit = js.native
  def setAccountInfo(
    params: ParamsDollarResourceDollarRelyingpartyDollarSetaccountinfo,
    options: BodyResponseCallback[Schema$SetAccountInfoResponse],
    callback: BodyResponseCallback[Schema$SetAccountInfoResponse]
  ): Unit = js.native
  def setAccountInfo(params: ParamsDollarResourceDollarRelyingpartyDollarSetaccountinfo, options: MethodOptions): GaxiosPromise[Schema$SetAccountInfoResponse] = js.native
  def setAccountInfo(
    params: ParamsDollarResourceDollarRelyingpartyDollarSetaccountinfo,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SetAccountInfoResponse]
  ): Unit = js.native
  /**
    * identitytoolkit.relyingparty.setProjectConfig
    * @desc Set project configuration.
    * @alias identitytoolkit.relyingparty.setProjectConfig
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().IdentitytoolkitRelyingpartySetProjectConfigRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setProjectConfig(): GaxiosPromise[Schema$IdentitytoolkitRelyingpartySetProjectConfigResponse] = js.native
  def setProjectConfig(callback: BodyResponseCallback[Schema$IdentitytoolkitRelyingpartySetProjectConfigResponse]): Unit = js.native
  def setProjectConfig(params: ParamsDollarResourceDollarRelyingpartyDollarSetprojectconfig): GaxiosPromise[Schema$IdentitytoolkitRelyingpartySetProjectConfigResponse] = js.native
  def setProjectConfig(
    params: ParamsDollarResourceDollarRelyingpartyDollarSetprojectconfig,
    callback: BodyResponseCallback[Schema$IdentitytoolkitRelyingpartySetProjectConfigResponse]
  ): Unit = js.native
  def setProjectConfig(
    params: ParamsDollarResourceDollarRelyingpartyDollarSetprojectconfig,
    options: BodyResponseCallback[Schema$IdentitytoolkitRelyingpartySetProjectConfigResponse],
    callback: BodyResponseCallback[Schema$IdentitytoolkitRelyingpartySetProjectConfigResponse]
  ): Unit = js.native
  def setProjectConfig(params: ParamsDollarResourceDollarRelyingpartyDollarSetprojectconfig, options: MethodOptions): GaxiosPromise[Schema$IdentitytoolkitRelyingpartySetProjectConfigResponse] = js.native
  def setProjectConfig(
    params: ParamsDollarResourceDollarRelyingpartyDollarSetprojectconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$IdentitytoolkitRelyingpartySetProjectConfigResponse]
  ): Unit = js.native
  /**
    * identitytoolkit.relyingparty.signOutUser
    * @desc Sign out user.
    * @alias identitytoolkit.relyingparty.signOutUser
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().IdentitytoolkitRelyingpartySignOutUserRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def signOutUser(): GaxiosPromise[Schema$IdentitytoolkitRelyingpartySignOutUserResponse] = js.native
  def signOutUser(callback: BodyResponseCallback[Schema$IdentitytoolkitRelyingpartySignOutUserResponse]): Unit = js.native
  def signOutUser(params: ParamsDollarResourceDollarRelyingpartyDollarSignoutuser): GaxiosPromise[Schema$IdentitytoolkitRelyingpartySignOutUserResponse] = js.native
  def signOutUser(
    params: ParamsDollarResourceDollarRelyingpartyDollarSignoutuser,
    callback: BodyResponseCallback[Schema$IdentitytoolkitRelyingpartySignOutUserResponse]
  ): Unit = js.native
  def signOutUser(
    params: ParamsDollarResourceDollarRelyingpartyDollarSignoutuser,
    options: BodyResponseCallback[Schema$IdentitytoolkitRelyingpartySignOutUserResponse],
    callback: BodyResponseCallback[Schema$IdentitytoolkitRelyingpartySignOutUserResponse]
  ): Unit = js.native
  def signOutUser(params: ParamsDollarResourceDollarRelyingpartyDollarSignoutuser, options: MethodOptions): GaxiosPromise[Schema$IdentitytoolkitRelyingpartySignOutUserResponse] = js.native
  def signOutUser(
    params: ParamsDollarResourceDollarRelyingpartyDollarSignoutuser,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$IdentitytoolkitRelyingpartySignOutUserResponse]
  ): Unit = js.native
  /**
    * identitytoolkit.relyingparty.signupNewUser
    * @desc Signup new user.
    * @alias identitytoolkit.relyingparty.signupNewUser
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().IdentitytoolkitRelyingpartySignupNewUserRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def signupNewUser(): GaxiosPromise[Schema$SignupNewUserResponse] = js.native
  def signupNewUser(callback: BodyResponseCallback[Schema$SignupNewUserResponse]): Unit = js.native
  def signupNewUser(params: ParamsDollarResourceDollarRelyingpartyDollarSignupnewuser): GaxiosPromise[Schema$SignupNewUserResponse] = js.native
  def signupNewUser(
    params: ParamsDollarResourceDollarRelyingpartyDollarSignupnewuser,
    callback: BodyResponseCallback[Schema$SignupNewUserResponse]
  ): Unit = js.native
  def signupNewUser(
    params: ParamsDollarResourceDollarRelyingpartyDollarSignupnewuser,
    options: BodyResponseCallback[Schema$SignupNewUserResponse],
    callback: BodyResponseCallback[Schema$SignupNewUserResponse]
  ): Unit = js.native
  def signupNewUser(params: ParamsDollarResourceDollarRelyingpartyDollarSignupnewuser, options: MethodOptions): GaxiosPromise[Schema$SignupNewUserResponse] = js.native
  def signupNewUser(
    params: ParamsDollarResourceDollarRelyingpartyDollarSignupnewuser,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SignupNewUserResponse]
  ): Unit = js.native
  /**
    * identitytoolkit.relyingparty.uploadAccount
    * @desc Batch upload existing user accounts.
    * @alias identitytoolkit.relyingparty.uploadAccount
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().IdentitytoolkitRelyingpartyUploadAccountRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def uploadAccount(): GaxiosPromise[Schema$UploadAccountResponse] = js.native
  def uploadAccount(callback: BodyResponseCallback[Schema$UploadAccountResponse]): Unit = js.native
  def uploadAccount(params: ParamsDollarResourceDollarRelyingpartyDollarUploadaccount): GaxiosPromise[Schema$UploadAccountResponse] = js.native
  def uploadAccount(
    params: ParamsDollarResourceDollarRelyingpartyDollarUploadaccount,
    callback: BodyResponseCallback[Schema$UploadAccountResponse]
  ): Unit = js.native
  def uploadAccount(
    params: ParamsDollarResourceDollarRelyingpartyDollarUploadaccount,
    options: BodyResponseCallback[Schema$UploadAccountResponse],
    callback: BodyResponseCallback[Schema$UploadAccountResponse]
  ): Unit = js.native
  def uploadAccount(params: ParamsDollarResourceDollarRelyingpartyDollarUploadaccount, options: MethodOptions): GaxiosPromise[Schema$UploadAccountResponse] = js.native
  def uploadAccount(
    params: ParamsDollarResourceDollarRelyingpartyDollarUploadaccount,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UploadAccountResponse]
  ): Unit = js.native
  /**
    * identitytoolkit.relyingparty.verifyAssertion
    * @desc Verifies the assertion returned by the IdP.
    * @alias identitytoolkit.relyingparty.verifyAssertion
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().IdentitytoolkitRelyingpartyVerifyAssertionRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def verifyAssertion(): GaxiosPromise[Schema$VerifyAssertionResponse] = js.native
  def verifyAssertion(callback: BodyResponseCallback[Schema$VerifyAssertionResponse]): Unit = js.native
  def verifyAssertion(params: ParamsDollarResourceDollarRelyingpartyDollarVerifyassertion): GaxiosPromise[Schema$VerifyAssertionResponse] = js.native
  def verifyAssertion(
    params: ParamsDollarResourceDollarRelyingpartyDollarVerifyassertion,
    callback: BodyResponseCallback[Schema$VerifyAssertionResponse]
  ): Unit = js.native
  def verifyAssertion(
    params: ParamsDollarResourceDollarRelyingpartyDollarVerifyassertion,
    options: BodyResponseCallback[Schema$VerifyAssertionResponse],
    callback: BodyResponseCallback[Schema$VerifyAssertionResponse]
  ): Unit = js.native
  def verifyAssertion(params: ParamsDollarResourceDollarRelyingpartyDollarVerifyassertion, options: MethodOptions): GaxiosPromise[Schema$VerifyAssertionResponse] = js.native
  def verifyAssertion(
    params: ParamsDollarResourceDollarRelyingpartyDollarVerifyassertion,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$VerifyAssertionResponse]
  ): Unit = js.native
  /**
    * identitytoolkit.relyingparty.verifyCustomToken
    * @desc Verifies the developer asserted ID token.
    * @alias identitytoolkit.relyingparty.verifyCustomToken
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().IdentitytoolkitRelyingpartyVerifyCustomTokenRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def verifyCustomToken(): GaxiosPromise[Schema$VerifyCustomTokenResponse] = js.native
  def verifyCustomToken(callback: BodyResponseCallback[Schema$VerifyCustomTokenResponse]): Unit = js.native
  def verifyCustomToken(params: ParamsDollarResourceDollarRelyingpartyDollarVerifycustomtoken): GaxiosPromise[Schema$VerifyCustomTokenResponse] = js.native
  def verifyCustomToken(
    params: ParamsDollarResourceDollarRelyingpartyDollarVerifycustomtoken,
    callback: BodyResponseCallback[Schema$VerifyCustomTokenResponse]
  ): Unit = js.native
  def verifyCustomToken(
    params: ParamsDollarResourceDollarRelyingpartyDollarVerifycustomtoken,
    options: BodyResponseCallback[Schema$VerifyCustomTokenResponse],
    callback: BodyResponseCallback[Schema$VerifyCustomTokenResponse]
  ): Unit = js.native
  def verifyCustomToken(params: ParamsDollarResourceDollarRelyingpartyDollarVerifycustomtoken, options: MethodOptions): GaxiosPromise[Schema$VerifyCustomTokenResponse] = js.native
  def verifyCustomToken(
    params: ParamsDollarResourceDollarRelyingpartyDollarVerifycustomtoken,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$VerifyCustomTokenResponse]
  ): Unit = js.native
  /**
    * identitytoolkit.relyingparty.verifyPassword
    * @desc Verifies the user entered password.
    * @alias identitytoolkit.relyingparty.verifyPassword
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().IdentitytoolkitRelyingpartyVerifyPasswordRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def verifyPassword(): GaxiosPromise[Schema$VerifyPasswordResponse] = js.native
  def verifyPassword(callback: BodyResponseCallback[Schema$VerifyPasswordResponse]): Unit = js.native
  def verifyPassword(params: ParamsDollarResourceDollarRelyingpartyDollarVerifypassword): GaxiosPromise[Schema$VerifyPasswordResponse] = js.native
  def verifyPassword(
    params: ParamsDollarResourceDollarRelyingpartyDollarVerifypassword,
    callback: BodyResponseCallback[Schema$VerifyPasswordResponse]
  ): Unit = js.native
  def verifyPassword(
    params: ParamsDollarResourceDollarRelyingpartyDollarVerifypassword,
    options: BodyResponseCallback[Schema$VerifyPasswordResponse],
    callback: BodyResponseCallback[Schema$VerifyPasswordResponse]
  ): Unit = js.native
  def verifyPassword(params: ParamsDollarResourceDollarRelyingpartyDollarVerifypassword, options: MethodOptions): GaxiosPromise[Schema$VerifyPasswordResponse] = js.native
  def verifyPassword(
    params: ParamsDollarResourceDollarRelyingpartyDollarVerifypassword,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$VerifyPasswordResponse]
  ): Unit = js.native
  /**
    * identitytoolkit.relyingparty.verifyPhoneNumber
    * @desc Verifies ownership of a phone number and creates/updates the user
    * account accordingly.
    * @alias identitytoolkit.relyingparty.verifyPhoneNumber
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().IdentitytoolkitRelyingpartyVerifyPhoneNumberRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def verifyPhoneNumber(): GaxiosPromise[Schema$IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse] = js.native
  def verifyPhoneNumber(callback: BodyResponseCallback[Schema$IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse]): Unit = js.native
  def verifyPhoneNumber(params: ParamsDollarResourceDollarRelyingpartyDollarVerifyphonenumber): GaxiosPromise[Schema$IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse] = js.native
  def verifyPhoneNumber(
    params: ParamsDollarResourceDollarRelyingpartyDollarVerifyphonenumber,
    callback: BodyResponseCallback[Schema$IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse]
  ): Unit = js.native
  def verifyPhoneNumber(
    params: ParamsDollarResourceDollarRelyingpartyDollarVerifyphonenumber,
    options: BodyResponseCallback[Schema$IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse],
    callback: BodyResponseCallback[Schema$IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse]
  ): Unit = js.native
  def verifyPhoneNumber(params: ParamsDollarResourceDollarRelyingpartyDollarVerifyphonenumber, options: MethodOptions): GaxiosPromise[Schema$IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse] = js.native
  def verifyPhoneNumber(
    params: ParamsDollarResourceDollarRelyingpartyDollarVerifyphonenumber,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse]
  ): Unit = js.native
}

