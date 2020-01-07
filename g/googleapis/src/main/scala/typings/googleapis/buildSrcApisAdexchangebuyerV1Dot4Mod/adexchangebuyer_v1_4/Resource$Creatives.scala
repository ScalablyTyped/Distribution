package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot4Mod.adexchangebuyer_v1_4

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adexchangebuyer/v1.4", "adexchangebuyer_v1_4.Resource$Creatives")
@js.native
class Resource$Creatives protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adexchangebuyer.creatives.addDeal
    * @desc Add a deal id association for the creative.
    * @alias adexchangebuyer.creatives.addDeal
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.accountId The id for the account that will serve this creative.
    * @param {string} params.buyerCreativeId The buyer-specific id for this creative.
    * @param {string} params.dealId The id of the deal id to associate with this creative.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def addDeal(): GaxiosPromise[Unit] = js.native
  def addDeal(callback: BodyResponseCallback[Unit]): Unit = js.native
  def addDeal(params: ParamsDollarResourceDollarCreativesDollarAdddeal): GaxiosPromise[Unit] = js.native
  def addDeal(params: ParamsDollarResourceDollarCreativesDollarAdddeal, callback: BodyResponseCallback[Unit]): Unit = js.native
  def addDeal(
    params: ParamsDollarResourceDollarCreativesDollarAdddeal,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def addDeal(params: ParamsDollarResourceDollarCreativesDollarAdddeal, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def addDeal(
    params: ParamsDollarResourceDollarCreativesDollarAdddeal,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
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
    * @param {integer=} params.accountId When specified, only creatives for the given account ids are returned.
    * @param {string=} params.buyerCreativeId When specified, only creatives for the given buyer creative ids are returned.
    * @param {string=} params.dealsStatusFilter When specified, only creatives having the given deals status are returned.
    * @param {integer=} params.maxResults Maximum number of entries returned on one result page. If not set, the default is 100. Optional.
    * @param {string=} params.openAuctionStatusFilter When specified, only creatives having the given open auction status are returned.
    * @param {string=} params.pageToken A continuation token, used to page through ad clients. To retrieve the next page, set this parameter to the value of "nextPageToken" from the previous response. Optional.
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
  /**
    * adexchangebuyer.creatives.listDeals
    * @desc Lists the external deal ids associated with the creative.
    * @alias adexchangebuyer.creatives.listDeals
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.accountId The id for the account that will serve this creative.
    * @param {string} params.buyerCreativeId The buyer-specific id for this creative.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listDeals(): GaxiosPromise[Schema$CreativeDealIds] = js.native
  def listDeals(callback: BodyResponseCallback[Schema$CreativeDealIds]): Unit = js.native
  def listDeals(params: ParamsDollarResourceDollarCreativesDollarListdeals): GaxiosPromise[Schema$CreativeDealIds] = js.native
  def listDeals(
    params: ParamsDollarResourceDollarCreativesDollarListdeals,
    callback: BodyResponseCallback[Schema$CreativeDealIds]
  ): Unit = js.native
  def listDeals(
    params: ParamsDollarResourceDollarCreativesDollarListdeals,
    options: BodyResponseCallback[Schema$CreativeDealIds],
    callback: BodyResponseCallback[Schema$CreativeDealIds]
  ): Unit = js.native
  def listDeals(params: ParamsDollarResourceDollarCreativesDollarListdeals, options: MethodOptions): GaxiosPromise[Schema$CreativeDealIds] = js.native
  def listDeals(
    params: ParamsDollarResourceDollarCreativesDollarListdeals,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CreativeDealIds]
  ): Unit = js.native
  /**
    * adexchangebuyer.creatives.removeDeal
    * @desc Remove a deal id associated with the creative.
    * @alias adexchangebuyer.creatives.removeDeal
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.accountId The id for the account that will serve this creative.
    * @param {string} params.buyerCreativeId The buyer-specific id for this creative.
    * @param {string} params.dealId The id of the deal id to disassociate with this creative.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def removeDeal(): GaxiosPromise[Unit] = js.native
  def removeDeal(callback: BodyResponseCallback[Unit]): Unit = js.native
  def removeDeal(params: ParamsDollarResourceDollarCreativesDollarRemovedeal): GaxiosPromise[Unit] = js.native
  def removeDeal(params: ParamsDollarResourceDollarCreativesDollarRemovedeal, callback: BodyResponseCallback[Unit]): Unit = js.native
  def removeDeal(
    params: ParamsDollarResourceDollarCreativesDollarRemovedeal,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def removeDeal(params: ParamsDollarResourceDollarCreativesDollarRemovedeal, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def removeDeal(
    params: ParamsDollarResourceDollarCreativesDollarRemovedeal,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
}

