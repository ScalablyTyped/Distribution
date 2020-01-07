package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot4Mod.adexchangebuyer_v1_4

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adexchangebuyer/v1.4", "adexchangebuyer_v1_4.Resource$Marketplacenotes")
@js.native
class Resource$Marketplacenotes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adexchangebuyer.marketplacenotes.insert
    * @desc Add notes to the proposal
    * @alias adexchangebuyer.marketplacenotes.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.proposalId The proposalId to add notes for.
    * @param {().AddOrderNotesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$AddOrderNotesResponse] = js.native
  def insert(callback: BodyResponseCallback[Schema$AddOrderNotesResponse]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarMarketplacenotesDollarInsert): GaxiosPromise[Schema$AddOrderNotesResponse] = js.native
  def insert(
    params: ParamsDollarResourceDollarMarketplacenotesDollarInsert,
    callback: BodyResponseCallback[Schema$AddOrderNotesResponse]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarMarketplacenotesDollarInsert,
    options: BodyResponseCallback[Schema$AddOrderNotesResponse],
    callback: BodyResponseCallback[Schema$AddOrderNotesResponse]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarMarketplacenotesDollarInsert, options: MethodOptions): GaxiosPromise[Schema$AddOrderNotesResponse] = js.native
  def insert(
    params: ParamsDollarResourceDollarMarketplacenotesDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AddOrderNotesResponse]
  ): Unit = js.native
  /**
    * adexchangebuyer.marketplacenotes.list
    * @desc Get all the notes associated with a proposal
    * @alias adexchangebuyer.marketplacenotes.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.pqlQuery Query string to retrieve specific notes. To search the text contents of notes, please use syntax like "WHERE note.note = "foo" or "WHERE note.note LIKE "%bar%"
    * @param {string} params.proposalId The proposalId to get notes for. To search across all proposals specify order_id = '-' as part of the URL.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$GetOrderNotesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$GetOrderNotesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarMarketplacenotesDollarList): GaxiosPromise[Schema$GetOrderNotesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarMarketplacenotesDollarList,
    callback: BodyResponseCallback[Schema$GetOrderNotesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarMarketplacenotesDollarList,
    options: BodyResponseCallback[Schema$GetOrderNotesResponse],
    callback: BodyResponseCallback[Schema$GetOrderNotesResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarMarketplacenotesDollarList, options: MethodOptions): GaxiosPromise[Schema$GetOrderNotesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarMarketplacenotesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GetOrderNotesResponse]
  ): Unit = js.native
}

