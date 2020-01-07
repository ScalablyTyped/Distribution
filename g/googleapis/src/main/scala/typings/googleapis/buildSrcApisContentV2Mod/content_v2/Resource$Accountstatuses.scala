package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/content/v2", "content_v2.Resource$Accountstatuses")
@js.native
class Resource$Accountstatuses protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * content.accountstatuses.custombatch
    * @desc Retrieves multiple Merchant Center account statuses in a single
    * request.
    * @alias content.accountstatuses.custombatch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().AccountstatusesCustomBatchRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def custombatch(): GaxiosPromise[Schema$AccountstatusesCustomBatchResponse] = js.native
  def custombatch(callback: BodyResponseCallback[Schema$AccountstatusesCustomBatchResponse]): Unit = js.native
  def custombatch(params: ParamsDollarResourceDollarAccountstatusesDollarCustombatch): GaxiosPromise[Schema$AccountstatusesCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsDollarResourceDollarAccountstatusesDollarCustombatch,
    callback: BodyResponseCallback[Schema$AccountstatusesCustomBatchResponse]
  ): Unit = js.native
  def custombatch(
    params: ParamsDollarResourceDollarAccountstatusesDollarCustombatch,
    options: BodyResponseCallback[Schema$AccountstatusesCustomBatchResponse],
    callback: BodyResponseCallback[Schema$AccountstatusesCustomBatchResponse]
  ): Unit = js.native
  def custombatch(params: ParamsDollarResourceDollarAccountstatusesDollarCustombatch, options: MethodOptions): GaxiosPromise[Schema$AccountstatusesCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsDollarResourceDollarAccountstatusesDollarCustombatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AccountstatusesCustomBatchResponse]
  ): Unit = js.native
  /**
    * content.accountstatuses.get
    * @desc Retrieves the status of a Merchant Center account. No
    * itemLevelIssues are returned for multi-client accounts.
    * @alias content.accountstatuses.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The ID of the account.
    * @param {string=} params.destinations If set, only issues for the specified destinations are returned, otherwise only issues for the Shopping destination.
    * @param {string} params.merchantId The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and accountId must be the ID of a sub-account of this account.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$AccountStatus] = js.native
  def get(callback: BodyResponseCallback[Schema$AccountStatus]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountstatusesDollarGet): GaxiosPromise[Schema$AccountStatus] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountstatusesDollarGet,
    callback: BodyResponseCallback[Schema$AccountStatus]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccountstatusesDollarGet,
    options: BodyResponseCallback[Schema$AccountStatus],
    callback: BodyResponseCallback[Schema$AccountStatus]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountstatusesDollarGet, options: MethodOptions): GaxiosPromise[Schema$AccountStatus] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountstatusesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AccountStatus]
  ): Unit = js.native
  /**
    * content.accountstatuses.list
    * @desc Lists the statuses of the sub-accounts in your Merchant Center
    * account.
    * @alias content.accountstatuses.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.destinations If set, only issues for the specified destinations are returned, otherwise only issues for the Shopping destination.
    * @param {integer=} params.maxResults The maximum number of account statuses to return in the response, used for paging.
    * @param {string} params.merchantId The ID of the managing account. This must be a multi-client account.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$AccountstatusesListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$AccountstatusesListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountstatusesDollarList): GaxiosPromise[Schema$AccountstatusesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountstatusesDollarList,
    callback: BodyResponseCallback[Schema$AccountstatusesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountstatusesDollarList,
    options: BodyResponseCallback[Schema$AccountstatusesListResponse],
    callback: BodyResponseCallback[Schema$AccountstatusesListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountstatusesDollarList, options: MethodOptions): GaxiosPromise[Schema$AccountstatusesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountstatusesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AccountstatusesListResponse]
  ): Unit = js.native
}

