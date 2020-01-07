package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/content/v2.1", "content_v2_1.Resource$Regionalinventory")
@js.native
class Resource$Regionalinventory protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * content.regionalinventory.custombatch
    * @desc Updates regional inventory for multiple products or regions in a
    * single request.
    * @alias content.regionalinventory.custombatch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().RegionalinventoryCustomBatchRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def custombatch(): GaxiosPromise[Schema$RegionalinventoryCustomBatchResponse] = js.native
  def custombatch(callback: BodyResponseCallback[Schema$RegionalinventoryCustomBatchResponse]): Unit = js.native
  def custombatch(params: ParamsDollarResourceDollarRegionalinventoryDollarCustombatch): GaxiosPromise[Schema$RegionalinventoryCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsDollarResourceDollarRegionalinventoryDollarCustombatch,
    callback: BodyResponseCallback[Schema$RegionalinventoryCustomBatchResponse]
  ): Unit = js.native
  def custombatch(
    params: ParamsDollarResourceDollarRegionalinventoryDollarCustombatch,
    options: BodyResponseCallback[Schema$RegionalinventoryCustomBatchResponse],
    callback: BodyResponseCallback[Schema$RegionalinventoryCustomBatchResponse]
  ): Unit = js.native
  def custombatch(params: ParamsDollarResourceDollarRegionalinventoryDollarCustombatch, options: MethodOptions): GaxiosPromise[Schema$RegionalinventoryCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsDollarResourceDollarRegionalinventoryDollarCustombatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$RegionalinventoryCustomBatchResponse]
  ): Unit = js.native
  /**
    * content.regionalinventory.insert
    * @desc Update the regional inventory of a product in your Merchant Center
    * account. If a regional inventory with the same region ID already exists,
    * this method updates that entry.
    * @alias content.regionalinventory.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that contains the product. This account cannot be a multi-client account.
    * @param {string} params.productId The REST ID of the product for which to update the regional inventory.
    * @param {().RegionalInventory} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$RegionalInventory] = js.native
  def insert(callback: BodyResponseCallback[Schema$RegionalInventory]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarRegionalinventoryDollarInsert): GaxiosPromise[Schema$RegionalInventory] = js.native
  def insert(
    params: ParamsDollarResourceDollarRegionalinventoryDollarInsert,
    callback: BodyResponseCallback[Schema$RegionalInventory]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarRegionalinventoryDollarInsert,
    options: BodyResponseCallback[Schema$RegionalInventory],
    callback: BodyResponseCallback[Schema$RegionalInventory]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarRegionalinventoryDollarInsert, options: MethodOptions): GaxiosPromise[Schema$RegionalInventory] = js.native
  def insert(
    params: ParamsDollarResourceDollarRegionalinventoryDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$RegionalInventory]
  ): Unit = js.native
}

