package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/content/v2", "content_v2.Resource$Datafeedstatuses")
@js.native
class Resource$Datafeedstatuses protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * content.datafeedstatuses.custombatch
    * @desc Gets multiple Merchant Center datafeed statuses in a single
    * request.
    * @alias content.datafeedstatuses.custombatch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().DatafeedstatusesCustomBatchRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def custombatch(): GaxiosPromise[Schema$DatafeedstatusesCustomBatchResponse] = js.native
  def custombatch(callback: BodyResponseCallback[Schema$DatafeedstatusesCustomBatchResponse]): Unit = js.native
  def custombatch(params: ParamsDollarResourceDollarDatafeedstatusesDollarCustombatch): GaxiosPromise[Schema$DatafeedstatusesCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsDollarResourceDollarDatafeedstatusesDollarCustombatch,
    callback: BodyResponseCallback[Schema$DatafeedstatusesCustomBatchResponse]
  ): Unit = js.native
  def custombatch(
    params: ParamsDollarResourceDollarDatafeedstatusesDollarCustombatch,
    options: BodyResponseCallback[Schema$DatafeedstatusesCustomBatchResponse],
    callback: BodyResponseCallback[Schema$DatafeedstatusesCustomBatchResponse]
  ): Unit = js.native
  def custombatch(params: ParamsDollarResourceDollarDatafeedstatusesDollarCustombatch, options: MethodOptions): GaxiosPromise[Schema$DatafeedstatusesCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsDollarResourceDollarDatafeedstatusesDollarCustombatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DatafeedstatusesCustomBatchResponse]
  ): Unit = js.native
  /**
    * content.datafeedstatuses.get
    * @desc Retrieves the status of a datafeed from your Merchant Center
    * account.
    * @alias content.datafeedstatuses.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.country The country for which to get the datafeed status. If this parameter is provided then language must also be provided. Note that this parameter is required for feeds targeting multiple countries and languages, since a feed may have a different status for each target.
    * @param {string} params.datafeedId The ID of the datafeed.
    * @param {string=} params.language The language for which to get the datafeed status. If this parameter is provided then country must also be provided. Note that this parameter is required for feeds targeting multiple countries and languages, since a feed may have a different status for each target.
    * @param {string} params.merchantId The ID of the account that manages the datafeed. This account cannot be a multi-client account.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$DatafeedStatus] = js.native
  def get(callback: BodyResponseCallback[Schema$DatafeedStatus]): Unit = js.native
  def get(params: ParamsDollarResourceDollarDatafeedstatusesDollarGet): GaxiosPromise[Schema$DatafeedStatus] = js.native
  def get(
    params: ParamsDollarResourceDollarDatafeedstatusesDollarGet,
    callback: BodyResponseCallback[Schema$DatafeedStatus]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarDatafeedstatusesDollarGet,
    options: BodyResponseCallback[Schema$DatafeedStatus],
    callback: BodyResponseCallback[Schema$DatafeedStatus]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarDatafeedstatusesDollarGet, options: MethodOptions): GaxiosPromise[Schema$DatafeedStatus] = js.native
  def get(
    params: ParamsDollarResourceDollarDatafeedstatusesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DatafeedStatus]
  ): Unit = js.native
  /**
    * content.datafeedstatuses.list
    * @desc Lists the statuses of the datafeeds in your Merchant Center
    * account.
    * @alias content.datafeedstatuses.list
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
  def list(): GaxiosPromise[Schema$DatafeedstatusesListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$DatafeedstatusesListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarDatafeedstatusesDollarList): GaxiosPromise[Schema$DatafeedstatusesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarDatafeedstatusesDollarList,
    callback: BodyResponseCallback[Schema$DatafeedstatusesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarDatafeedstatusesDollarList,
    options: BodyResponseCallback[Schema$DatafeedstatusesListResponse],
    callback: BodyResponseCallback[Schema$DatafeedstatusesListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarDatafeedstatusesDollarList, options: MethodOptions): GaxiosPromise[Schema$DatafeedstatusesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarDatafeedstatusesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DatafeedstatusesListResponse]
  ): Unit = js.native
}

