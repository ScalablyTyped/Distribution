package typings.googleapis.buildSrcApisIamV1Mod.iam_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/iam/v1", "iam_v1.Resource$Projects$Serviceaccounts$Keys")
@js.native
class ResourceDollarProjectsDollarServiceaccountsDollarKeys protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * iam.projects.serviceAccounts.keys.create
    * @desc Creates a ServiceAccountKey and returns it.
    * @alias iam.projects.serviceAccounts.keys.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the service account in the following format: `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`. Using `-` as a wildcard for the `PROJECT_ID` will infer the project from the account. The `ACCOUNT` value can be the `email` address or the `unique_id` of the service account.
    * @param {().CreateServiceAccountKeyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$ServiceAccountKey] = js.native
  def create(callback: BodyResponseCallback[Schema$ServiceAccountKey]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarKeysDollarCreate): GaxiosPromise[Schema$ServiceAccountKey] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarKeysDollarCreate,
    callback: BodyResponseCallback[Schema$ServiceAccountKey]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarKeysDollarCreate,
    options: BodyResponseCallback[Schema$ServiceAccountKey],
    callback: BodyResponseCallback[Schema$ServiceAccountKey]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarKeysDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$ServiceAccountKey] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarKeysDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ServiceAccountKey]
  ): Unit = js.native
  /**
    * iam.projects.serviceAccounts.keys.delete
    * @desc Deletes a ServiceAccountKey.
    * @alias iam.projects.serviceAccounts.keys.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the service account key in the following format: `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}/keys/{key}`. Using `-` as a wildcard for the `PROJECT_ID` will infer the project from the account. The `ACCOUNT` value can be the `email` address or the `unique_id` of the service account.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarKeysDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarKeysDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarKeysDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarKeysDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarKeysDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * iam.projects.serviceAccounts.keys.get
    * @desc Gets the ServiceAccountKey by key id.
    * @alias iam.projects.serviceAccounts.keys.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the service account key in the following format: `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}/keys/{key}`.  Using `-` as a wildcard for the `PROJECT_ID` will infer the project from the account. The `ACCOUNT` value can be the `email` address or the `unique_id` of the service account.
    * @param {string=} params.publicKeyType The output format of the public key requested. X509_PEM is the default output format.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$ServiceAccountKey] = js.native
  def get(callback: BodyResponseCallback[Schema$ServiceAccountKey]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarKeysDollarGet): GaxiosPromise[Schema$ServiceAccountKey] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarKeysDollarGet,
    callback: BodyResponseCallback[Schema$ServiceAccountKey]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarKeysDollarGet,
    options: BodyResponseCallback[Schema$ServiceAccountKey],
    callback: BodyResponseCallback[Schema$ServiceAccountKey]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarKeysDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$ServiceAccountKey] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarKeysDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ServiceAccountKey]
  ): Unit = js.native
  /**
    * iam.projects.serviceAccounts.keys.list
    * @desc Lists ServiceAccountKeys.
    * @alias iam.projects.serviceAccounts.keys.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.keyTypes Filters the types of keys the user wants to include in the list response. Duplicate key types are not allowed. If no key type is provided, all keys are returned.
    * @param {string} params.name The resource name of the service account in the following format: `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.  Using `-` as a wildcard for the `PROJECT_ID`, will infer the project from the account. The `ACCOUNT` value can be the `email` address or the `unique_id` of the service account.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListServiceAccountKeysResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListServiceAccountKeysResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarKeysDollarList): GaxiosPromise[Schema$ListServiceAccountKeysResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarKeysDollarList,
    callback: BodyResponseCallback[Schema$ListServiceAccountKeysResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarKeysDollarList,
    options: BodyResponseCallback[Schema$ListServiceAccountKeysResponse],
    callback: BodyResponseCallback[Schema$ListServiceAccountKeysResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarKeysDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListServiceAccountKeysResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarKeysDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListServiceAccountKeysResponse]
  ): Unit = js.native
}

