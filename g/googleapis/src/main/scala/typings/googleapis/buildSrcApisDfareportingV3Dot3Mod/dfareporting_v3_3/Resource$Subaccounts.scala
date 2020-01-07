package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Subaccounts")
@js.native
class Resource$Subaccounts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.subaccounts.get
    * @desc Gets one subaccount by ID.
    * @alias dfareporting.subaccounts.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Subaccount ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Subaccount] = js.native
  def get(callback: BodyResponseCallback[Schema$Subaccount]): Unit = js.native
  def get(params: ParamsDollarResourceDollarSubaccountsDollarGet): GaxiosPromise[Schema$Subaccount] = js.native
  def get(
    params: ParamsDollarResourceDollarSubaccountsDollarGet,
    callback: BodyResponseCallback[Schema$Subaccount]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarSubaccountsDollarGet,
    options: BodyResponseCallback[Schema$Subaccount],
    callback: BodyResponseCallback[Schema$Subaccount]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarSubaccountsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Subaccount] = js.native
  def get(
    params: ParamsDollarResourceDollarSubaccountsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Subaccount]
  ): Unit = js.native
  /**
    * dfareporting.subaccounts.insert
    * @desc Inserts a new subaccount.
    * @alias dfareporting.subaccounts.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().Subaccount} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Subaccount] = js.native
  def insert(callback: BodyResponseCallback[Schema$Subaccount]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarSubaccountsDollarInsert): GaxiosPromise[Schema$Subaccount] = js.native
  def insert(
    params: ParamsDollarResourceDollarSubaccountsDollarInsert,
    callback: BodyResponseCallback[Schema$Subaccount]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarSubaccountsDollarInsert,
    options: BodyResponseCallback[Schema$Subaccount],
    callback: BodyResponseCallback[Schema$Subaccount]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarSubaccountsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Subaccount] = js.native
  def insert(
    params: ParamsDollarResourceDollarSubaccountsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Subaccount]
  ): Unit = js.native
  /**
    * dfareporting.subaccounts.list
    * @desc Gets a list of subaccounts, possibly filtered. This method supports
    * paging.
    * @alias dfareporting.subaccounts.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.ids Select only subaccounts with these IDs.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.searchString Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, "subaccount*2015" will return objects with names like "subaccount June 2015", "subaccount April 2015", or simply "subaccount 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "subaccount" will match objects with name "my subaccount", "subaccount 2015", or simply "subaccount".
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$SubaccountsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$SubaccountsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarSubaccountsDollarList): GaxiosPromise[Schema$SubaccountsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarSubaccountsDollarList,
    callback: BodyResponseCallback[Schema$SubaccountsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarSubaccountsDollarList,
    options: BodyResponseCallback[Schema$SubaccountsListResponse],
    callback: BodyResponseCallback[Schema$SubaccountsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarSubaccountsDollarList, options: MethodOptions): GaxiosPromise[Schema$SubaccountsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarSubaccountsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SubaccountsListResponse]
  ): Unit = js.native
  /**
    * dfareporting.subaccounts.patch
    * @desc Updates an existing subaccount. This method supports patch
    * semantics.
    * @alias dfareporting.subaccounts.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Subaccount ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().Subaccount} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Subaccount] = js.native
  def patch(callback: BodyResponseCallback[Schema$Subaccount]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarSubaccountsDollarPatch): GaxiosPromise[Schema$Subaccount] = js.native
  def patch(
    params: ParamsDollarResourceDollarSubaccountsDollarPatch,
    callback: BodyResponseCallback[Schema$Subaccount]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarSubaccountsDollarPatch,
    options: BodyResponseCallback[Schema$Subaccount],
    callback: BodyResponseCallback[Schema$Subaccount]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarSubaccountsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Subaccount] = js.native
  def patch(
    params: ParamsDollarResourceDollarSubaccountsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Subaccount]
  ): Unit = js.native
  /**
    * dfareporting.subaccounts.update
    * @desc Updates an existing subaccount.
    * @alias dfareporting.subaccounts.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().Subaccount} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Subaccount] = js.native
  def update(callback: BodyResponseCallback[Schema$Subaccount]): Unit = js.native
  def update(params: ParamsDollarResourceDollarSubaccountsDollarUpdate): GaxiosPromise[Schema$Subaccount] = js.native
  def update(
    params: ParamsDollarResourceDollarSubaccountsDollarUpdate,
    callback: BodyResponseCallback[Schema$Subaccount]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarSubaccountsDollarUpdate,
    options: BodyResponseCallback[Schema$Subaccount],
    callback: BodyResponseCallback[Schema$Subaccount]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarSubaccountsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Subaccount] = js.native
  def update(
    params: ParamsDollarResourceDollarSubaccountsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Subaccount]
  ): Unit = js.native
}

