package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/content/v2", "content_v2.Resource$Pos")
@js.native
class Resource$Pos protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * content.pos.custombatch
    * @desc Batches multiple POS-related calls in a single request.
    * @alias content.pos.custombatch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.dryRun Flag to simulate a request like in a live environment. If set to true, dry-run mode checks the validity of the request and returns errors (if any).
    * @param {().PosCustomBatchRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def custombatch(): GaxiosPromise[Schema$PosCustomBatchResponse] = js.native
  def custombatch(callback: BodyResponseCallback[Schema$PosCustomBatchResponse]): Unit = js.native
  def custombatch(params: ParamsDollarResourceDollarPosDollarCustombatch): GaxiosPromise[Schema$PosCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsDollarResourceDollarPosDollarCustombatch,
    callback: BodyResponseCallback[Schema$PosCustomBatchResponse]
  ): Unit = js.native
  def custombatch(
    params: ParamsDollarResourceDollarPosDollarCustombatch,
    options: BodyResponseCallback[Schema$PosCustomBatchResponse],
    callback: BodyResponseCallback[Schema$PosCustomBatchResponse]
  ): Unit = js.native
  def custombatch(params: ParamsDollarResourceDollarPosDollarCustombatch, options: MethodOptions): GaxiosPromise[Schema$PosCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsDollarResourceDollarPosDollarCustombatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PosCustomBatchResponse]
  ): Unit = js.native
  /**
    * content.pos.delete
    * @desc Deletes a store for the given merchant.
    * @alias content.pos.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.dryRun Flag to simulate a request like in a live environment. If set to true, dry-run mode checks the validity of the request and returns errors (if any).
    * @param {string} params.merchantId The ID of the POS or inventory data provider.
    * @param {string} params.storeCode A store code that is unique per merchant.
    * @param {string} params.targetMerchantId The ID of the target merchant.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarPosDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarPosDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarPosDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarPosDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarPosDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * content.pos.get
    * @desc Retrieves information about the given store.
    * @alias content.pos.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the POS or inventory data provider.
    * @param {string} params.storeCode A store code that is unique per merchant.
    * @param {string} params.targetMerchantId The ID of the target merchant.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$PosStore] = js.native
  def get(callback: BodyResponseCallback[Schema$PosStore]): Unit = js.native
  def get(params: ParamsDollarResourceDollarPosDollarGet): GaxiosPromise[Schema$PosStore] = js.native
  def get(params: ParamsDollarResourceDollarPosDollarGet, callback: BodyResponseCallback[Schema$PosStore]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarPosDollarGet,
    options: BodyResponseCallback[Schema$PosStore],
    callback: BodyResponseCallback[Schema$PosStore]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarPosDollarGet, options: MethodOptions): GaxiosPromise[Schema$PosStore] = js.native
  def get(
    params: ParamsDollarResourceDollarPosDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PosStore]
  ): Unit = js.native
  /**
    * content.pos.insert
    * @desc Creates a store for the given merchant.
    * @alias content.pos.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.dryRun Flag to simulate a request like in a live environment. If set to true, dry-run mode checks the validity of the request and returns errors (if any).
    * @param {string} params.merchantId The ID of the POS or inventory data provider.
    * @param {string} params.targetMerchantId The ID of the target merchant.
    * @param {().PosStore} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$PosStore] = js.native
  def insert(callback: BodyResponseCallback[Schema$PosStore]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarPosDollarInsert): GaxiosPromise[Schema$PosStore] = js.native
  def insert(params: ParamsDollarResourceDollarPosDollarInsert, callback: BodyResponseCallback[Schema$PosStore]): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarPosDollarInsert,
    options: BodyResponseCallback[Schema$PosStore],
    callback: BodyResponseCallback[Schema$PosStore]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarPosDollarInsert, options: MethodOptions): GaxiosPromise[Schema$PosStore] = js.native
  def insert(
    params: ParamsDollarResourceDollarPosDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PosStore]
  ): Unit = js.native
  /**
    * content.pos.inventory
    * @desc Submit inventory for the given merchant.
    * @alias content.pos.inventory
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.dryRun Flag to simulate a request like in a live environment. If set to true, dry-run mode checks the validity of the request and returns errors (if any).
    * @param {string} params.merchantId The ID of the POS or inventory data provider.
    * @param {string} params.targetMerchantId The ID of the target merchant.
    * @param {().PosInventoryRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def inventory(): GaxiosPromise[Schema$PosInventoryResponse] = js.native
  def inventory(callback: BodyResponseCallback[Schema$PosInventoryResponse]): Unit = js.native
  def inventory(params: ParamsDollarResourceDollarPosDollarInventory): GaxiosPromise[Schema$PosInventoryResponse] = js.native
  def inventory(
    params: ParamsDollarResourceDollarPosDollarInventory,
    callback: BodyResponseCallback[Schema$PosInventoryResponse]
  ): Unit = js.native
  def inventory(
    params: ParamsDollarResourceDollarPosDollarInventory,
    options: BodyResponseCallback[Schema$PosInventoryResponse],
    callback: BodyResponseCallback[Schema$PosInventoryResponse]
  ): Unit = js.native
  def inventory(params: ParamsDollarResourceDollarPosDollarInventory, options: MethodOptions): GaxiosPromise[Schema$PosInventoryResponse] = js.native
  def inventory(
    params: ParamsDollarResourceDollarPosDollarInventory,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PosInventoryResponse]
  ): Unit = js.native
  /**
    * content.pos.list
    * @desc Lists the stores of the target merchant.
    * @alias content.pos.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the POS or inventory data provider.
    * @param {string} params.targetMerchantId The ID of the target merchant.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$PosListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$PosListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarPosDollarList): GaxiosPromise[Schema$PosListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarPosDollarList,
    callback: BodyResponseCallback[Schema$PosListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarPosDollarList,
    options: BodyResponseCallback[Schema$PosListResponse],
    callback: BodyResponseCallback[Schema$PosListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarPosDollarList, options: MethodOptions): GaxiosPromise[Schema$PosListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarPosDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PosListResponse]
  ): Unit = js.native
  /**
    * content.pos.sale
    * @desc Submit a sale event for the given merchant.
    * @alias content.pos.sale
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.dryRun Flag to simulate a request like in a live environment. If set to true, dry-run mode checks the validity of the request and returns errors (if any).
    * @param {string} params.merchantId The ID of the POS or inventory data provider.
    * @param {string} params.targetMerchantId The ID of the target merchant.
    * @param {().PosSaleRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def sale(): GaxiosPromise[Schema$PosSaleResponse] = js.native
  def sale(callback: BodyResponseCallback[Schema$PosSaleResponse]): Unit = js.native
  def sale(params: ParamsDollarResourceDollarPosDollarSale): GaxiosPromise[Schema$PosSaleResponse] = js.native
  def sale(
    params: ParamsDollarResourceDollarPosDollarSale,
    callback: BodyResponseCallback[Schema$PosSaleResponse]
  ): Unit = js.native
  def sale(
    params: ParamsDollarResourceDollarPosDollarSale,
    options: BodyResponseCallback[Schema$PosSaleResponse],
    callback: BodyResponseCallback[Schema$PosSaleResponse]
  ): Unit = js.native
  def sale(params: ParamsDollarResourceDollarPosDollarSale, options: MethodOptions): GaxiosPromise[Schema$PosSaleResponse] = js.native
  def sale(
    params: ParamsDollarResourceDollarPosDollarSale,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PosSaleResponse]
  ): Unit = js.native
}

