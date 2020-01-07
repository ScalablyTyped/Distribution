package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adexchangebuyer2/v2beta1", "adexchangebuyer2_v2beta1.Resource$Accounts$Creatives")
@js.native
class ResourceDollarAccountsDollarCreatives protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var dealAssociations: ResourceDollarAccountsDollarCreativesDollarDealassociations = js.native
  /**
    * adexchangebuyer2.accounts.creatives.create
    * @desc Creates a creative.
    * @alias adexchangebuyer2.accounts.creatives.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The account that this creative belongs to. Can be used to filter the response of the creatives.list method.
    * @param {string=} params.duplicateIdMode Indicates if multiple creatives can share an ID or not. Default is NO_DUPLICATES (one ID per creative).
    * @param {().Creative} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Creative] = js.native
  def create(callback: BodyResponseCallback[Schema$Creative]): Unit = js.native
  def create(params: ParamsDollarResourceDollarAccountsDollarCreativesDollarCreate): GaxiosPromise[Schema$Creative] = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarCreativesDollarCreate,
    callback: BodyResponseCallback[Schema$Creative]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarCreativesDollarCreate,
    options: BodyResponseCallback[Schema$Creative],
    callback: BodyResponseCallback[Schema$Creative]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarAccountsDollarCreativesDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Creative] = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarCreativesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Creative]
  ): Unit = js.native
  /**
    * adexchangebuyer2.accounts.creatives.get
    * @desc Gets a creative.
    * @alias adexchangebuyer2.accounts.creatives.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The account the creative belongs to.
    * @param {string} params.creativeId The ID of the creative to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Creative] = js.native
  def get(callback: BodyResponseCallback[Schema$Creative]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountsDollarCreativesDollarGet): GaxiosPromise[Schema$Creative] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarCreativesDollarGet,
    callback: BodyResponseCallback[Schema$Creative]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarCreativesDollarGet,
    options: BodyResponseCallback[Schema$Creative],
    callback: BodyResponseCallback[Schema$Creative]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountsDollarCreativesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Creative] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarCreativesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Creative]
  ): Unit = js.native
  /**
    * adexchangebuyer2.accounts.creatives.list
    * @desc Lists creatives.
    * @alias adexchangebuyer2.accounts.creatives.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The account to list the creatives from. Specify "-" to list all creatives the current user has access to.
    * @param {integer=} params.pageSize Requested page size. The server may return fewer creatives than requested (due to timeout constraint) even if more are available via another call. If unspecified, server will pick an appropriate default. Acceptable values are 1 to 1000, inclusive.
    * @param {string=} params.pageToken A token identifying a page of results the server should return. Typically, this is the value of ListCreativesResponse.next_page_token returned from the previous call to 'ListCreatives' method.
    * @param {string=} params.query An optional query string to filter creatives. If no filter is specified, all active creatives will be returned. <p>Supported queries are: <ul> <li>accountId=<i>account_id_string</i> <li>creativeId=<i>creative_id_string</i> <li>dealsStatus: {approved, conditionally_approved, disapproved,                    not_checked} <li>openAuctionStatus: {approved, conditionally_approved, disapproved,                           not_checked} <li>attribute: {a numeric attribute from the list of attributes} <li>disapprovalReason: {a reason from DisapprovalReason} </ul> Example: 'accountId=12345 AND (dealsStatus:disapproved AND disapprovalReason:unacceptable_content) OR attribute:47'
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListCreativesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListCreativesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarCreativesDollarList): GaxiosPromise[Schema$ListCreativesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarCreativesDollarList,
    callback: BodyResponseCallback[Schema$ListCreativesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarCreativesDollarList,
    options: BodyResponseCallback[Schema$ListCreativesResponse],
    callback: BodyResponseCallback[Schema$ListCreativesResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarCreativesDollarList, options: MethodOptions): GaxiosPromise[Schema$ListCreativesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarCreativesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListCreativesResponse]
  ): Unit = js.native
  /**
    * adexchangebuyer2.accounts.creatives.stopWatching
    * @desc Stops watching a creative. Will stop push notifications being sent
    * to the topics when the creative changes status.
    * @alias adexchangebuyer2.accounts.creatives.stopWatching
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The account of the creative to stop notifications for.
    * @param {string} params.creativeId The creative ID of the creative to stop notifications for. Specify "-" to specify stopping account level notifications.
    * @param {().StopWatchingCreativeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def stopWatching(): GaxiosPromise[Schema$Empty] = js.native
  def stopWatching(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def stopWatching(params: ParamsDollarResourceDollarAccountsDollarCreativesDollarStopwatching): GaxiosPromise[Schema$Empty] = js.native
  def stopWatching(
    params: ParamsDollarResourceDollarAccountsDollarCreativesDollarStopwatching,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def stopWatching(
    params: ParamsDollarResourceDollarAccountsDollarCreativesDollarStopwatching,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def stopWatching(
    params: ParamsDollarResourceDollarAccountsDollarCreativesDollarStopwatching,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def stopWatching(
    params: ParamsDollarResourceDollarAccountsDollarCreativesDollarStopwatching,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * adexchangebuyer2.accounts.creatives.update
    * @desc Updates a creative.
    * @alias adexchangebuyer2.accounts.creatives.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The account that this creative belongs to. Can be used to filter the response of the creatives.list method.
    * @param {string} params.creativeId The buyer-defined creative ID of this creative. Can be used to filter the response of the creatives.list method.
    * @param {().Creative} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Creative] = js.native
  def update(callback: BodyResponseCallback[Schema$Creative]): Unit = js.native
  def update(params: ParamsDollarResourceDollarAccountsDollarCreativesDollarUpdate): GaxiosPromise[Schema$Creative] = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarCreativesDollarUpdate,
    callback: BodyResponseCallback[Schema$Creative]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarCreativesDollarUpdate,
    options: BodyResponseCallback[Schema$Creative],
    callback: BodyResponseCallback[Schema$Creative]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarAccountsDollarCreativesDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Creative] = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarCreativesDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Creative]
  ): Unit = js.native
  /**
    * adexchangebuyer2.accounts.creatives.watch
    * @desc Watches a creative. Will result in push notifications being sent to
    * the topic when the creative changes status.
    * @alias adexchangebuyer2.accounts.creatives.watch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The account of the creative to watch.
    * @param {string} params.creativeId The creative ID to watch for status changes. Specify "-" to watch all creatives under the above account. If both creative-level and account-level notifications are sent, only a single notification will be sent to the creative-level notification topic.
    * @param {().WatchCreativeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def watch(): GaxiosPromise[Schema$Empty] = js.native
  def watch(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def watch(params: ParamsDollarResourceDollarAccountsDollarCreativesDollarWatch): GaxiosPromise[Schema$Empty] = js.native
  def watch(
    params: ParamsDollarResourceDollarAccountsDollarCreativesDollarWatch,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def watch(
    params: ParamsDollarResourceDollarAccountsDollarCreativesDollarWatch,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def watch(params: ParamsDollarResourceDollarAccountsDollarCreativesDollarWatch, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def watch(
    params: ParamsDollarResourceDollarAccountsDollarCreativesDollarWatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
}

