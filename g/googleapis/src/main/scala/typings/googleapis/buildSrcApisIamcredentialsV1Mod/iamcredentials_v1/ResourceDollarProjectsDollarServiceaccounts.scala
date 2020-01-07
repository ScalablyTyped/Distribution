package typings.googleapis.buildSrcApisIamcredentialsV1Mod.iamcredentials_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/iamcredentials/v1", "iamcredentials_v1.Resource$Projects$Serviceaccounts")
@js.native
class ResourceDollarProjectsDollarServiceaccounts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * iamcredentials.projects.serviceAccounts.generateAccessToken
    * @desc Generates an OAuth 2.0 access token for a service account.
    * @alias iamcredentials.projects.serviceAccounts.generateAccessToken
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the service account for which the credentials are requested, in the following format: `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`. The `-` wildcard character is required; replacing it with a project ID is invalid.
    * @param {().GenerateAccessTokenRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def generateAccessToken(): GaxiosPromise[Schema$GenerateAccessTokenResponse] = js.native
  def generateAccessToken(callback: BodyResponseCallback[Schema$GenerateAccessTokenResponse]): Unit = js.native
  def generateAccessToken(params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarGenerateaccesstoken): GaxiosPromise[Schema$GenerateAccessTokenResponse] = js.native
  def generateAccessToken(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarGenerateaccesstoken,
    callback: BodyResponseCallback[Schema$GenerateAccessTokenResponse]
  ): Unit = js.native
  def generateAccessToken(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarGenerateaccesstoken,
    options: BodyResponseCallback[Schema$GenerateAccessTokenResponse],
    callback: BodyResponseCallback[Schema$GenerateAccessTokenResponse]
  ): Unit = js.native
  def generateAccessToken(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarGenerateaccesstoken,
    options: MethodOptions
  ): GaxiosPromise[Schema$GenerateAccessTokenResponse] = js.native
  def generateAccessToken(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarGenerateaccesstoken,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GenerateAccessTokenResponse]
  ): Unit = js.native
  /**
    * iamcredentials.projects.serviceAccounts.generateIdToken
    * @desc Generates an OpenID Connect ID token for a service account.
    * @alias iamcredentials.projects.serviceAccounts.generateIdToken
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the service account for which the credentials are requested, in the following format: `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`. The `-` wildcard character is required; replacing it with a project ID is invalid.
    * @param {().GenerateIdTokenRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def generateIdToken(): GaxiosPromise[Schema$GenerateIdTokenResponse] = js.native
  def generateIdToken(callback: BodyResponseCallback[Schema$GenerateIdTokenResponse]): Unit = js.native
  def generateIdToken(params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarGenerateidtoken): GaxiosPromise[Schema$GenerateIdTokenResponse] = js.native
  def generateIdToken(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarGenerateidtoken,
    callback: BodyResponseCallback[Schema$GenerateIdTokenResponse]
  ): Unit = js.native
  def generateIdToken(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarGenerateidtoken,
    options: BodyResponseCallback[Schema$GenerateIdTokenResponse],
    callback: BodyResponseCallback[Schema$GenerateIdTokenResponse]
  ): Unit = js.native
  def generateIdToken(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarGenerateidtoken,
    options: MethodOptions
  ): GaxiosPromise[Schema$GenerateIdTokenResponse] = js.native
  def generateIdToken(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarGenerateidtoken,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GenerateIdTokenResponse]
  ): Unit = js.native
  /**
    * iamcredentials.projects.serviceAccounts.generateIdentityBindingAccessToken
    * @alias
    * iamcredentials.projects.serviceAccounts.generateIdentityBindingAccessToken
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the service account for which the credentials are requested, in the following format: `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`. The `-` wildcard character is required; replacing it with a project ID is invalid.
    * @param {().GenerateIdentityBindingAccessTokenRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def generateIdentityBindingAccessToken(): GaxiosPromise[Schema$GenerateIdentityBindingAccessTokenResponse] = js.native
  def generateIdentityBindingAccessToken(callback: BodyResponseCallback[Schema$GenerateIdentityBindingAccessTokenResponse]): Unit = js.native
  def generateIdentityBindingAccessToken(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarGenerateidentitybindingaccesstoken
  ): GaxiosPromise[Schema$GenerateIdentityBindingAccessTokenResponse] = js.native
  def generateIdentityBindingAccessToken(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarGenerateidentitybindingaccesstoken,
    callback: BodyResponseCallback[Schema$GenerateIdentityBindingAccessTokenResponse]
  ): Unit = js.native
  def generateIdentityBindingAccessToken(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarGenerateidentitybindingaccesstoken,
    options: BodyResponseCallback[Schema$GenerateIdentityBindingAccessTokenResponse],
    callback: BodyResponseCallback[Schema$GenerateIdentityBindingAccessTokenResponse]
  ): Unit = js.native
  def generateIdentityBindingAccessToken(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarGenerateidentitybindingaccesstoken,
    options: MethodOptions
  ): GaxiosPromise[Schema$GenerateIdentityBindingAccessTokenResponse] = js.native
  def generateIdentityBindingAccessToken(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarGenerateidentitybindingaccesstoken,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GenerateIdentityBindingAccessTokenResponse]
  ): Unit = js.native
  /**
    * iamcredentials.projects.serviceAccounts.signBlob
    * @desc Signs a blob using a service account's system-managed private key.
    * @alias iamcredentials.projects.serviceAccounts.signBlob
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the service account for which the credentials are requested, in the following format: `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`. The `-` wildcard character is required; replacing it with a project ID is invalid.
    * @param {().SignBlobRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def signBlob(): GaxiosPromise[Schema$SignBlobResponse] = js.native
  def signBlob(callback: BodyResponseCallback[Schema$SignBlobResponse]): Unit = js.native
  def signBlob(params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarSignblob): GaxiosPromise[Schema$SignBlobResponse] = js.native
  def signBlob(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarSignblob,
    callback: BodyResponseCallback[Schema$SignBlobResponse]
  ): Unit = js.native
  def signBlob(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarSignblob,
    options: BodyResponseCallback[Schema$SignBlobResponse],
    callback: BodyResponseCallback[Schema$SignBlobResponse]
  ): Unit = js.native
  def signBlob(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarSignblob,
    options: MethodOptions
  ): GaxiosPromise[Schema$SignBlobResponse] = js.native
  def signBlob(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarSignblob,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SignBlobResponse]
  ): Unit = js.native
  /**
    * iamcredentials.projects.serviceAccounts.signJwt
    * @desc Signs a JWT using a service account's system-managed private key.
    * @alias iamcredentials.projects.serviceAccounts.signJwt
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the service account for which the credentials are requested, in the following format: `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`. The `-` wildcard character is required; replacing it with a project ID is invalid.
    * @param {().SignJwtRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def signJwt(): GaxiosPromise[Schema$SignJwtResponse] = js.native
  def signJwt(callback: BodyResponseCallback[Schema$SignJwtResponse]): Unit = js.native
  def signJwt(params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarSignjwt): GaxiosPromise[Schema$SignJwtResponse] = js.native
  def signJwt(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarSignjwt,
    callback: BodyResponseCallback[Schema$SignJwtResponse]
  ): Unit = js.native
  def signJwt(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarSignjwt,
    options: BodyResponseCallback[Schema$SignJwtResponse],
    callback: BodyResponseCallback[Schema$SignJwtResponse]
  ): Unit = js.native
  def signJwt(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarSignjwt,
    options: MethodOptions
  ): GaxiosPromise[Schema$SignJwtResponse] = js.native
  def signJwt(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarSignjwt,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SignJwtResponse]
  ): Unit = js.native
}

