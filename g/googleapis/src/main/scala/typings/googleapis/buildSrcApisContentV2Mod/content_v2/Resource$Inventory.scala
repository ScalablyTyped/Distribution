package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/content/v2", "content_v2.Resource$Inventory")
@js.native
class Resource$Inventory protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * content.inventory.custombatch
    * @desc Updates price and availability for multiple products or stores in a
    * single request. This operation does not update the expiration date of the
    * products.
    * @alias content.inventory.custombatch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.dryRun Flag to simulate a request like in a live environment. If set to true, dry-run mode checks the validity of the request and returns errors (if any).
    * @param {().InventoryCustomBatchRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def custombatch(): GaxiosPromise[Schema$InventoryCustomBatchResponse] = js.native
  def custombatch(callback: BodyResponseCallback[Schema$InventoryCustomBatchResponse]): Unit = js.native
  def custombatch(params: ParamsDollarResourceDollarInventoryDollarCustombatch): GaxiosPromise[Schema$InventoryCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsDollarResourceDollarInventoryDollarCustombatch,
    callback: BodyResponseCallback[Schema$InventoryCustomBatchResponse]
  ): Unit = js.native
  def custombatch(
    params: ParamsDollarResourceDollarInventoryDollarCustombatch,
    options: BodyResponseCallback[Schema$InventoryCustomBatchResponse],
    callback: BodyResponseCallback[Schema$InventoryCustomBatchResponse]
  ): Unit = js.native
  def custombatch(params: ParamsDollarResourceDollarInventoryDollarCustombatch, options: MethodOptions): GaxiosPromise[Schema$InventoryCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsDollarResourceDollarInventoryDollarCustombatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$InventoryCustomBatchResponse]
  ): Unit = js.native
  /**
    * content.inventory.set
    * @desc Updates price and availability of a product in your Merchant Center
    * account.
    * @alias content.inventory.set
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.dryRun Flag to simulate a request like in a live environment. If set to true, dry-run mode checks the validity of the request and returns errors (if any).
    * @param {string} params.merchantId The ID of the account that contains the product. This account cannot be a multi-client account.
    * @param {string} params.productId The REST ID of the product for which to update price and availability.
    * @param {string} params.storeCode The code of the store for which to update price and availability. Use online to update price and availability of an online product.
    * @param {().InventorySetRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def set(): GaxiosPromise[Schema$InventorySetResponse] = js.native
  def set(callback: BodyResponseCallback[Schema$InventorySetResponse]): Unit = js.native
  def set(params: ParamsDollarResourceDollarInventoryDollarSet): GaxiosPromise[Schema$InventorySetResponse] = js.native
  def set(
    params: ParamsDollarResourceDollarInventoryDollarSet,
    callback: BodyResponseCallback[Schema$InventorySetResponse]
  ): Unit = js.native
  def set(
    params: ParamsDollarResourceDollarInventoryDollarSet,
    options: BodyResponseCallback[Schema$InventorySetResponse],
    callback: BodyResponseCallback[Schema$InventorySetResponse]
  ): Unit = js.native
  def set(params: ParamsDollarResourceDollarInventoryDollarSet, options: MethodOptions): GaxiosPromise[Schema$InventorySetResponse] = js.native
  def set(
    params: ParamsDollarResourceDollarInventoryDollarSet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$InventorySetResponse]
  ): Unit = js.native
}

