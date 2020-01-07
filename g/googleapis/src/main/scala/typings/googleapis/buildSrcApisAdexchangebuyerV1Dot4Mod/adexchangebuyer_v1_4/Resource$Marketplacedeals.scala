package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot4Mod.adexchangebuyer_v1_4

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adexchangebuyer/v1.4", "adexchangebuyer_v1_4.Resource$Marketplacedeals")
@js.native
class Resource$Marketplacedeals protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adexchangebuyer.marketplacedeals.delete
    * @desc Delete the specified deals from the proposal
    * @alias adexchangebuyer.marketplacedeals.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.proposalId The proposalId to delete deals from.
    * @param {().DeleteOrderDealsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$DeleteOrderDealsResponse] = js.native
  def delete(callback: BodyResponseCallback[Schema$DeleteOrderDealsResponse]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarMarketplacedealsDollarDelete): GaxiosPromise[Schema$DeleteOrderDealsResponse] = js.native
  def delete(
    params: ParamsDollarResourceDollarMarketplacedealsDollarDelete,
    callback: BodyResponseCallback[Schema$DeleteOrderDealsResponse]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarMarketplacedealsDollarDelete,
    options: BodyResponseCallback[Schema$DeleteOrderDealsResponse],
    callback: BodyResponseCallback[Schema$DeleteOrderDealsResponse]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarMarketplacedealsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$DeleteOrderDealsResponse] = js.native
  def delete(
    params: ParamsDollarResourceDollarMarketplacedealsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DeleteOrderDealsResponse]
  ): Unit = js.native
  /**
    * adexchangebuyer.marketplacedeals.insert
    * @desc Add new deals for the specified proposal
    * @alias adexchangebuyer.marketplacedeals.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.proposalId proposalId for which deals need to be added.
    * @param {().AddOrderDealsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$AddOrderDealsResponse] = js.native
  def insert(callback: BodyResponseCallback[Schema$AddOrderDealsResponse]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarMarketplacedealsDollarInsert): GaxiosPromise[Schema$AddOrderDealsResponse] = js.native
  def insert(
    params: ParamsDollarResourceDollarMarketplacedealsDollarInsert,
    callback: BodyResponseCallback[Schema$AddOrderDealsResponse]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarMarketplacedealsDollarInsert,
    options: BodyResponseCallback[Schema$AddOrderDealsResponse],
    callback: BodyResponseCallback[Schema$AddOrderDealsResponse]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarMarketplacedealsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$AddOrderDealsResponse] = js.native
  def insert(
    params: ParamsDollarResourceDollarMarketplacedealsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AddOrderDealsResponse]
  ): Unit = js.native
  /**
    * adexchangebuyer.marketplacedeals.list
    * @desc List all the deals for a given proposal
    * @alias adexchangebuyer.marketplacedeals.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.pqlQuery Query string to retrieve specific deals.
    * @param {string} params.proposalId The proposalId to get deals for. To search across all proposals specify order_id = '-' as part of the URL.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$GetOrderDealsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$GetOrderDealsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarMarketplacedealsDollarList): GaxiosPromise[Schema$GetOrderDealsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarMarketplacedealsDollarList,
    callback: BodyResponseCallback[Schema$GetOrderDealsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarMarketplacedealsDollarList,
    options: BodyResponseCallback[Schema$GetOrderDealsResponse],
    callback: BodyResponseCallback[Schema$GetOrderDealsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarMarketplacedealsDollarList, options: MethodOptions): GaxiosPromise[Schema$GetOrderDealsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarMarketplacedealsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GetOrderDealsResponse]
  ): Unit = js.native
  /**
    * adexchangebuyer.marketplacedeals.update
    * @desc Replaces all the deals in the proposal with the passed in deals
    * @alias adexchangebuyer.marketplacedeals.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.proposalId The proposalId to edit deals on.
    * @param {().EditAllOrderDealsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$EditAllOrderDealsResponse] = js.native
  def update(callback: BodyResponseCallback[Schema$EditAllOrderDealsResponse]): Unit = js.native
  def update(params: ParamsDollarResourceDollarMarketplacedealsDollarUpdate): GaxiosPromise[Schema$EditAllOrderDealsResponse] = js.native
  def update(
    params: ParamsDollarResourceDollarMarketplacedealsDollarUpdate,
    callback: BodyResponseCallback[Schema$EditAllOrderDealsResponse]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarMarketplacedealsDollarUpdate,
    options: BodyResponseCallback[Schema$EditAllOrderDealsResponse],
    callback: BodyResponseCallback[Schema$EditAllOrderDealsResponse]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarMarketplacedealsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$EditAllOrderDealsResponse] = js.native
  def update(
    params: ParamsDollarResourceDollarMarketplacedealsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$EditAllOrderDealsResponse]
  ): Unit = js.native
}

