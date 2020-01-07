package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/content/v2.1", "content_v2_1.Resource$Datafeeds")
@js.native
class Resource$Datafeeds protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * content.datafeeds.custombatch
    * @desc Deletes, fetches, gets, inserts and updates multiple datafeeds in a
    * single request.
    * @alias content.datafeeds.custombatch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().DatafeedsCustomBatchRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def custombatch(): GaxiosPromise[Schema$DatafeedsCustomBatchResponse] = js.native
  def custombatch(callback: BodyResponseCallback[Schema$DatafeedsCustomBatchResponse]): Unit = js.native
  def custombatch(params: ParamsDollarResourceDollarDatafeedsDollarCustombatch): GaxiosPromise[Schema$DatafeedsCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsDollarResourceDollarDatafeedsDollarCustombatch,
    callback: BodyResponseCallback[Schema$DatafeedsCustomBatchResponse]
  ): Unit = js.native
  def custombatch(
    params: ParamsDollarResourceDollarDatafeedsDollarCustombatch,
    options: BodyResponseCallback[Schema$DatafeedsCustomBatchResponse],
    callback: BodyResponseCallback[Schema$DatafeedsCustomBatchResponse]
  ): Unit = js.native
  def custombatch(params: ParamsDollarResourceDollarDatafeedsDollarCustombatch, options: MethodOptions): GaxiosPromise[Schema$DatafeedsCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsDollarResourceDollarDatafeedsDollarCustombatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DatafeedsCustomBatchResponse]
  ): Unit = js.native
  /**
    * content.datafeeds.delete
    * @desc Deletes a datafeed configuration from your Merchant Center account.
    * @alias content.datafeeds.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.datafeedId The ID of the datafeed.
    * @param {string} params.merchantId The ID of the account that manages the datafeed. This account cannot be a multi-client account.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarDatafeedsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarDatafeedsDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarDatafeedsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarDatafeedsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarDatafeedsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * content.datafeeds.fetchnow
    * @desc Invokes a fetch for the datafeed in your Merchant Center account.
    * @alias content.datafeeds.fetchnow
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.datafeedId The ID of the datafeed to be fetched.
    * @param {string} params.merchantId The ID of the account that manages the datafeed. This account cannot be a multi-client account.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def fetchnow(): GaxiosPromise[Schema$DatafeedsFetchNowResponse] = js.native
  def fetchnow(callback: BodyResponseCallback[Schema$DatafeedsFetchNowResponse]): Unit = js.native
  def fetchnow(params: ParamsDollarResourceDollarDatafeedsDollarFetchnow): GaxiosPromise[Schema$DatafeedsFetchNowResponse] = js.native
  def fetchnow(
    params: ParamsDollarResourceDollarDatafeedsDollarFetchnow,
    callback: BodyResponseCallback[Schema$DatafeedsFetchNowResponse]
  ): Unit = js.native
  def fetchnow(
    params: ParamsDollarResourceDollarDatafeedsDollarFetchnow,
    options: BodyResponseCallback[Schema$DatafeedsFetchNowResponse],
    callback: BodyResponseCallback[Schema$DatafeedsFetchNowResponse]
  ): Unit = js.native
  def fetchnow(params: ParamsDollarResourceDollarDatafeedsDollarFetchnow, options: MethodOptions): GaxiosPromise[Schema$DatafeedsFetchNowResponse] = js.native
  def fetchnow(
    params: ParamsDollarResourceDollarDatafeedsDollarFetchnow,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DatafeedsFetchNowResponse]
  ): Unit = js.native
  /**
    * content.datafeeds.get
    * @desc Retrieves a datafeed configuration from your Merchant Center
    * account.
    * @alias content.datafeeds.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.datafeedId The ID of the datafeed.
    * @param {string} params.merchantId The ID of the account that manages the datafeed. This account cannot be a multi-client account.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Datafeed] = js.native
  def get(callback: BodyResponseCallback[Schema$Datafeed]): Unit = js.native
  def get(params: ParamsDollarResourceDollarDatafeedsDollarGet): GaxiosPromise[Schema$Datafeed] = js.native
  def get(
    params: ParamsDollarResourceDollarDatafeedsDollarGet,
    callback: BodyResponseCallback[Schema$Datafeed]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarDatafeedsDollarGet,
    options: BodyResponseCallback[Schema$Datafeed],
    callback: BodyResponseCallback[Schema$Datafeed]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarDatafeedsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Datafeed] = js.native
  def get(
    params: ParamsDollarResourceDollarDatafeedsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Datafeed]
  ): Unit = js.native
  /**
    * content.datafeeds.insert
    * @desc Registers a datafeed configuration with your Merchant Center
    * account.
    * @alias content.datafeeds.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that manages the datafeed. This account cannot be a multi-client account.
    * @param {().Datafeed} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Datafeed] = js.native
  def insert(callback: BodyResponseCallback[Schema$Datafeed]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarDatafeedsDollarInsert): GaxiosPromise[Schema$Datafeed] = js.native
  def insert(
    params: ParamsDollarResourceDollarDatafeedsDollarInsert,
    callback: BodyResponseCallback[Schema$Datafeed]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarDatafeedsDollarInsert,
    options: BodyResponseCallback[Schema$Datafeed],
    callback: BodyResponseCallback[Schema$Datafeed]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarDatafeedsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Datafeed] = js.native
  def insert(
    params: ParamsDollarResourceDollarDatafeedsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Datafeed]
  ): Unit = js.native
  /**
    * content.datafeeds.list
    * @desc Lists the configurations for datafeeds in your Merchant Center
    * account.
    * @alias content.datafeeds.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxResults The maximum number of products to return in the response, used for paging.
    * @param {string} params.merchantId The ID of the account that manages the datafeeds. This account cannot be a multi-client account.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$DatafeedsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$DatafeedsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarDatafeedsDollarList): GaxiosPromise[Schema$DatafeedsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarDatafeedsDollarList,
    callback: BodyResponseCallback[Schema$DatafeedsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarDatafeedsDollarList,
    options: BodyResponseCallback[Schema$DatafeedsListResponse],
    callback: BodyResponseCallback[Schema$DatafeedsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarDatafeedsDollarList, options: MethodOptions): GaxiosPromise[Schema$DatafeedsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarDatafeedsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DatafeedsListResponse]
  ): Unit = js.native
  /**
    * content.datafeeds.update
    * @desc Updates a datafeed configuration of your Merchant Center account.
    * @alias content.datafeeds.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.datafeedId The ID of the datafeed.
    * @param {string} params.merchantId The ID of the account that manages the datafeed. This account cannot be a multi-client account.
    * @param {().Datafeed} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Datafeed] = js.native
  def update(callback: BodyResponseCallback[Schema$Datafeed]): Unit = js.native
  def update(params: ParamsDollarResourceDollarDatafeedsDollarUpdate): GaxiosPromise[Schema$Datafeed] = js.native
  def update(
    params: ParamsDollarResourceDollarDatafeedsDollarUpdate,
    callback: BodyResponseCallback[Schema$Datafeed]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarDatafeedsDollarUpdate,
    options: BodyResponseCallback[Schema$Datafeed],
    callback: BodyResponseCallback[Schema$Datafeed]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarDatafeedsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Datafeed] = js.native
  def update(
    params: ParamsDollarResourceDollarDatafeedsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Datafeed]
  ): Unit = js.native
}

