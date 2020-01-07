package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/content/v2", "content_v2.Resource$Productstatuses")
@js.native
class Resource$Productstatuses protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * content.productstatuses.custombatch
    * @desc Gets the statuses of multiple products in a single request.
    * @alias content.productstatuses.custombatch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.includeAttributes Flag to include full product data in the results of this request. The default value is false.
    * @param {().ProductstatusesCustomBatchRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def custombatch(): GaxiosPromise[Schema$ProductstatusesCustomBatchResponse] = js.native
  def custombatch(callback: BodyResponseCallback[Schema$ProductstatusesCustomBatchResponse]): Unit = js.native
  def custombatch(params: ParamsDollarResourceDollarProductstatusesDollarCustombatch): GaxiosPromise[Schema$ProductstatusesCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsDollarResourceDollarProductstatusesDollarCustombatch,
    callback: BodyResponseCallback[Schema$ProductstatusesCustomBatchResponse]
  ): Unit = js.native
  def custombatch(
    params: ParamsDollarResourceDollarProductstatusesDollarCustombatch,
    options: BodyResponseCallback[Schema$ProductstatusesCustomBatchResponse],
    callback: BodyResponseCallback[Schema$ProductstatusesCustomBatchResponse]
  ): Unit = js.native
  def custombatch(params: ParamsDollarResourceDollarProductstatusesDollarCustombatch, options: MethodOptions): GaxiosPromise[Schema$ProductstatusesCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsDollarResourceDollarProductstatusesDollarCustombatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ProductstatusesCustomBatchResponse]
  ): Unit = js.native
  /**
    * content.productstatuses.get
    * @desc Gets the status of a product from your Merchant Center account.
    * @alias content.productstatuses.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.destinations If set, only issues for the specified destinations are returned, otherwise only issues for the Shopping destination.
    * @param {boolean=} params.includeAttributes Flag to include full product data in the result of this get request. The default value is false.
    * @param {string} params.merchantId The ID of the account that contains the product. This account cannot be a multi-client account.
    * @param {string} params.productId The REST ID of the product.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$ProductStatus] = js.native
  def get(callback: BodyResponseCallback[Schema$ProductStatus]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProductstatusesDollarGet): GaxiosPromise[Schema$ProductStatus] = js.native
  def get(
    params: ParamsDollarResourceDollarProductstatusesDollarGet,
    callback: BodyResponseCallback[Schema$ProductStatus]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProductstatusesDollarGet,
    options: BodyResponseCallback[Schema$ProductStatus],
    callback: BodyResponseCallback[Schema$ProductStatus]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarProductstatusesDollarGet, options: MethodOptions): GaxiosPromise[Schema$ProductStatus] = js.native
  def get(
    params: ParamsDollarResourceDollarProductstatusesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ProductStatus]
  ): Unit = js.native
  /**
    * content.productstatuses.list
    * @desc Lists the statuses of the products in your Merchant Center account.
    * @alias content.productstatuses.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.destinations If set, only issues for the specified destinations are returned, otherwise only issues for the Shopping destination.
    * @param {boolean=} params.includeAttributes Flag to include full product data in the results of the list request. The default value is false.
    * @param {boolean=} params.includeInvalidInsertedItems Flag to include the invalid inserted items in the result of the list request. By default the invalid items are not shown (the default value is false).
    * @param {integer=} params.maxResults The maximum number of product statuses to return in the response, used for paging.
    * @param {string} params.merchantId The ID of the account that contains the products. This account cannot be a multi-client account.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ProductstatusesListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ProductstatusesListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProductstatusesDollarList): GaxiosPromise[Schema$ProductstatusesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProductstatusesDollarList,
    callback: BodyResponseCallback[Schema$ProductstatusesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProductstatusesDollarList,
    options: BodyResponseCallback[Schema$ProductstatusesListResponse],
    callback: BodyResponseCallback[Schema$ProductstatusesListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarProductstatusesDollarList, options: MethodOptions): GaxiosPromise[Schema$ProductstatusesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProductstatusesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ProductstatusesListResponse]
  ): Unit = js.native
}

