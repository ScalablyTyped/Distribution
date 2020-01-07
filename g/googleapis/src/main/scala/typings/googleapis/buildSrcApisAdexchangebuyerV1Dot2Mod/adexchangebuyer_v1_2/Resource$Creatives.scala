package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot2Mod.adexchangebuyer_v1_2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adexchangebuyer/v1.2", "adexchangebuyer_v1_2.Resource$Creatives")
@js.native
class Resource$Creatives protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adexchangebuyer.creatives.get
    * @desc Gets the status for a single creative. A creative will be available
    * 30-40 minutes after submission.
    * @alias adexchangebuyer.creatives.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.accountId The id for the account that will serve this creative.
    * @param {string} params.buyerCreativeId The buyer-specific id for this creative.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Creative] = js.native
  def get(callback: BodyResponseCallback[Schema$Creative]): Unit = js.native
  def get(params: ParamsDollarResourceDollarCreativesDollarGet): GaxiosPromise[Schema$Creative] = js.native
  def get(
    params: ParamsDollarResourceDollarCreativesDollarGet,
    callback: BodyResponseCallback[Schema$Creative]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarCreativesDollarGet,
    options: BodyResponseCallback[Schema$Creative],
    callback: BodyResponseCallback[Schema$Creative]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarCreativesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Creative] = js.native
  def get(
    params: ParamsDollarResourceDollarCreativesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Creative]
  ): Unit = js.native
  /**
    * adexchangebuyer.creatives.insert
    * @desc Submit a new creative.
    * @alias adexchangebuyer.creatives.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().Creative} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Creative] = js.native
  def insert(callback: BodyResponseCallback[Schema$Creative]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarCreativesDollarInsert): GaxiosPromise[Schema$Creative] = js.native
  def insert(
    params: ParamsDollarResourceDollarCreativesDollarInsert,
    callback: BodyResponseCallback[Schema$Creative]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarCreativesDollarInsert,
    options: BodyResponseCallback[Schema$Creative],
    callback: BodyResponseCallback[Schema$Creative]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarCreativesDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Creative] = js.native
  def insert(
    params: ParamsDollarResourceDollarCreativesDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Creative]
  ): Unit = js.native
  /**
    * adexchangebuyer.creatives.list
    * @desc Retrieves a list of the authenticated user's active creatives. A
    * creative will be available 30-40 minutes after submission.
    * @alias adexchangebuyer.creatives.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {integer=} params.maxResults Maximum number of entries returned on one result page. If not set, the default is 100. Optional.
    * @param {string=} params.pageToken A continuation token, used to page through ad clients. To retrieve the next page, set this parameter to the value of "nextPageToken" from the previous response. Optional.
    * @param {string=} params.statusFilter When specified, only creatives having the given status are returned.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$CreativesList] = js.native
  def list(callback: BodyResponseCallback[Schema$CreativesList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarCreativesDollarList): GaxiosPromise[Schema$CreativesList] = js.native
  def list(
    params: ParamsDollarResourceDollarCreativesDollarList,
    callback: BodyResponseCallback[Schema$CreativesList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarCreativesDollarList,
    options: BodyResponseCallback[Schema$CreativesList],
    callback: BodyResponseCallback[Schema$CreativesList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarCreativesDollarList, options: MethodOptions): GaxiosPromise[Schema$CreativesList] = js.native
  def list(
    params: ParamsDollarResourceDollarCreativesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CreativesList]
  ): Unit = js.native
}

