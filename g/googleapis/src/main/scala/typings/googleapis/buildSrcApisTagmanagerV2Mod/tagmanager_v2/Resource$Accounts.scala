package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/tagmanager/v2", "tagmanager_v2.Resource$Accounts")
@js.native
class Resource$Accounts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var containers: ResourceDollarAccountsDollarContainers = js.native
  var context: APIRequestContext = js.native
  var user_permissions: ResourceDollarAccountsDollarUser_permissions = js.native
  /**
    * tagmanager.accounts.get
    * @desc Gets a GTM Account.
    * @alias tagmanager.accounts.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM Accounts's API relative path. Example: accounts/{account_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Account] = js.native
  def get(callback: BodyResponseCallback[Schema$Account]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountsDollarGet): GaxiosPromise[Schema$Account] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarGet,
    callback: BodyResponseCallback[Schema$Account]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarGet,
    options: BodyResponseCallback[Schema$Account],
    callback: BodyResponseCallback[Schema$Account]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Account] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Account]
  ): Unit = js.native
  /**
    * tagmanager.accounts.list
    * @desc Lists all GTM Accounts that a user has access to.
    * @alias tagmanager.accounts.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.pageToken Continuation token for fetching the next page of results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListAccountsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListAccountsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarList): GaxiosPromise[Schema$ListAccountsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarList,
    callback: BodyResponseCallback[Schema$ListAccountsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarList,
    options: BodyResponseCallback[Schema$ListAccountsResponse],
    callback: BodyResponseCallback[Schema$ListAccountsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListAccountsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListAccountsResponse]
  ): Unit = js.native
  /**
    * tagmanager.accounts.update
    * @desc Updates a GTM Account.
    * @alias tagmanager.accounts.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.fingerprint When provided, this fingerprint must match the fingerprint of the account in storage.
    * @param {string} params.path GTM Accounts's API relative path. Example: accounts/{account_id}
    * @param {().Account} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Account] = js.native
  def update(callback: BodyResponseCallback[Schema$Account]): Unit = js.native
  def update(params: ParamsDollarResourceDollarAccountsDollarUpdate): GaxiosPromise[Schema$Account] = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarUpdate,
    callback: BodyResponseCallback[Schema$Account]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarUpdate,
    options: BodyResponseCallback[Schema$Account],
    callback: BodyResponseCallback[Schema$Account]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarAccountsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Account] = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Account]
  ): Unit = js.native
}

