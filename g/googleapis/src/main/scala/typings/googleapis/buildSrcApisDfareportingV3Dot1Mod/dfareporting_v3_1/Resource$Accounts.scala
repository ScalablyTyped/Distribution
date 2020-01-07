package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.1", "dfareporting_v3_1.Resource$Accounts")
@js.native
class Resource$Accounts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.accounts.get
    * @desc Gets one account by ID.
    * @alias dfareporting.accounts.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Account ID.
    * @param {string} params.profileId User profile ID associated with this request.
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
    * dfareporting.accounts.list
    * @desc Retrieves the list of accounts, possibly filtered. This method
    * supports paging.
    * @alias dfareporting.accounts.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.active Select only active accounts. Don't set this field to select both active and non-active accounts.
    * @param {string=} params.ids Select only accounts with these IDs.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.searchString Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, "account*2015" will return objects with names like "account June 2015", "account April 2015", or simply "account 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "account" will match objects with name "my account", "account 2015", or simply "account".
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$AccountsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$AccountsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarList): GaxiosPromise[Schema$AccountsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarList,
    callback: BodyResponseCallback[Schema$AccountsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarList,
    options: BodyResponseCallback[Schema$AccountsListResponse],
    callback: BodyResponseCallback[Schema$AccountsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarList, options: MethodOptions): GaxiosPromise[Schema$AccountsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AccountsListResponse]
  ): Unit = js.native
  /**
    * dfareporting.accounts.patch
    * @desc Updates an existing account. This method supports patch semantics.
    * @alias dfareporting.accounts.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Account ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().Account} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Account] = js.native
  def patch(callback: BodyResponseCallback[Schema$Account]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarAccountsDollarPatch): GaxiosPromise[Schema$Account] = js.native
  def patch(
    params: ParamsDollarResourceDollarAccountsDollarPatch,
    callback: BodyResponseCallback[Schema$Account]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarAccountsDollarPatch,
    options: BodyResponseCallback[Schema$Account],
    callback: BodyResponseCallback[Schema$Account]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarAccountsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Account] = js.native
  def patch(
    params: ParamsDollarResourceDollarAccountsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Account]
  ): Unit = js.native
  /**
    * dfareporting.accounts.update
    * @desc Updates an existing account.
    * @alias dfareporting.accounts.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
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

