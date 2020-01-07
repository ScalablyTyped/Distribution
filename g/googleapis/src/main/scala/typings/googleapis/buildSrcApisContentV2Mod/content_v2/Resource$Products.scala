package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/content/v2", "content_v2.Resource$Products")
@js.native
class Resource$Products protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * content.products.custombatch
    * @desc Retrieves, inserts, and deletes multiple products in a single
    * request.
    * @alias content.products.custombatch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.dryRun Flag to simulate a request like in a live environment. If set to true, dry-run mode checks the validity of the request and returns errors (if any).
    * @param {().ProductsCustomBatchRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def custombatch(): GaxiosPromise[Schema$ProductsCustomBatchResponse] = js.native
  def custombatch(callback: BodyResponseCallback[Schema$ProductsCustomBatchResponse]): Unit = js.native
  def custombatch(params: ParamsDollarResourceDollarProductsDollarCustombatch): GaxiosPromise[Schema$ProductsCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsDollarResourceDollarProductsDollarCustombatch,
    callback: BodyResponseCallback[Schema$ProductsCustomBatchResponse]
  ): Unit = js.native
  def custombatch(
    params: ParamsDollarResourceDollarProductsDollarCustombatch,
    options: BodyResponseCallback[Schema$ProductsCustomBatchResponse],
    callback: BodyResponseCallback[Schema$ProductsCustomBatchResponse]
  ): Unit = js.native
  def custombatch(params: ParamsDollarResourceDollarProductsDollarCustombatch, options: MethodOptions): GaxiosPromise[Schema$ProductsCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsDollarResourceDollarProductsDollarCustombatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ProductsCustomBatchResponse]
  ): Unit = js.native
  /**
    * content.products.delete
    * @desc Deletes a product from your Merchant Center account.
    * @alias content.products.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.dryRun Flag to simulate a request like in a live environment. If set to true, dry-run mode checks the validity of the request and returns errors (if any).
    * @param {string} params.merchantId The ID of the account that contains the product. This account cannot be a multi-client account.
    * @param {string} params.productId The REST ID of the product.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProductsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarProductsDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProductsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProductsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarProductsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * content.products.get
    * @desc Retrieves a product from your Merchant Center account.
    * @alias content.products.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that contains the product. This account cannot be a multi-client account.
    * @param {string} params.productId The REST ID of the product.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Product] = js.native
  def get(callback: BodyResponseCallback[Schema$Product]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProductsDollarGet): GaxiosPromise[Schema$Product] = js.native
  def get(
    params: ParamsDollarResourceDollarProductsDollarGet,
    callback: BodyResponseCallback[Schema$Product]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProductsDollarGet,
    options: BodyResponseCallback[Schema$Product],
    callback: BodyResponseCallback[Schema$Product]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarProductsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Product] = js.native
  def get(
    params: ParamsDollarResourceDollarProductsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Product]
  ): Unit = js.native
  /**
    * content.products.insert
    * @desc Uploads a product to your Merchant Center account. If an item with
    * the same channel, contentLanguage, offerId, and targetCountry already
    * exists, this method updates that entry.
    * @alias content.products.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.dryRun Flag to simulate a request like in a live environment. If set to true, dry-run mode checks the validity of the request and returns errors (if any).
    * @param {string} params.merchantId The ID of the account that contains the product. This account cannot be a multi-client account.
    * @param {().Product} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Product] = js.native
  def insert(callback: BodyResponseCallback[Schema$Product]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarProductsDollarInsert): GaxiosPromise[Schema$Product] = js.native
  def insert(
    params: ParamsDollarResourceDollarProductsDollarInsert,
    callback: BodyResponseCallback[Schema$Product]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarProductsDollarInsert,
    options: BodyResponseCallback[Schema$Product],
    callback: BodyResponseCallback[Schema$Product]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarProductsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Product] = js.native
  def insert(
    params: ParamsDollarResourceDollarProductsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Product]
  ): Unit = js.native
  /**
    * content.products.list
    * @desc Lists the products in your Merchant Center account.
    * @alias content.products.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.includeInvalidInsertedItems Flag to include the invalid inserted items in the result of the list request. By default the invalid items are not shown (the default value is false).
    * @param {integer=} params.maxResults The maximum number of products to return in the response, used for paging.
    * @param {string} params.merchantId The ID of the account that contains the products. This account cannot be a multi-client account.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ProductsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ProductsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProductsDollarList): GaxiosPromise[Schema$ProductsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProductsDollarList,
    callback: BodyResponseCallback[Schema$ProductsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProductsDollarList,
    options: BodyResponseCallback[Schema$ProductsListResponse],
    callback: BodyResponseCallback[Schema$ProductsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarProductsDollarList, options: MethodOptions): GaxiosPromise[Schema$ProductsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProductsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ProductsListResponse]
  ): Unit = js.native
}

