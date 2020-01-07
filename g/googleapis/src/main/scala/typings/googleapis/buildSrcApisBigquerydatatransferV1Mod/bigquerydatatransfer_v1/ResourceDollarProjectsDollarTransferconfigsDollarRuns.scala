package typings.googleapis.buildSrcApisBigquerydatatransferV1Mod.bigquerydatatransfer_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/bigquerydatatransfer/v1", "bigquerydatatransfer_v1.Resource$Projects$Transferconfigs$Runs")
@js.native
class ResourceDollarProjectsDollarTransferconfigsDollarRuns protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var transferLogs: ResourceDollarProjectsDollarTransferconfigsDollarRunsDollarTransferlogs = js.native
  /**
    * bigquerydatatransfer.projects.transferConfigs.runs.delete
    * @desc Deletes the specified transfer run.
    * @alias bigquerydatatransfer.projects.transferConfigs.runs.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The field will contain name of the resource requested, for example: `projects/{project_id}/transferConfigs/{config_id}/runs/{run_id}`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarTransferconfigsDollarRunsDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarTransferconfigsDollarRunsDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarTransferconfigsDollarRunsDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarTransferconfigsDollarRunsDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarTransferconfigsDollarRunsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * bigquerydatatransfer.projects.transferConfigs.runs.get
    * @desc Returns information about the particular transfer run.
    * @alias bigquerydatatransfer.projects.transferConfigs.runs.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The field will contain name of the resource requested, for example: `projects/{project_id}/transferConfigs/{config_id}/runs/{run_id}`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$TransferRun] = js.native
  def get(callback: BodyResponseCallback[Schema$TransferRun]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarTransferconfigsDollarRunsDollarGet): GaxiosPromise[Schema$TransferRun] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarTransferconfigsDollarRunsDollarGet,
    callback: BodyResponseCallback[Schema$TransferRun]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarTransferconfigsDollarRunsDollarGet,
    options: BodyResponseCallback[Schema$TransferRun],
    callback: BodyResponseCallback[Schema$TransferRun]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarTransferconfigsDollarRunsDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$TransferRun] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarTransferconfigsDollarRunsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TransferRun]
  ): Unit = js.native
  /**
    * bigquerydatatransfer.projects.transferConfigs.runs.list
    * @desc Returns information about running and completed jobs.
    * @alias bigquerydatatransfer.projects.transferConfigs.runs.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Page size. The default page size is the maximum value of 1000 results.
    * @param {string=} params.pageToken Pagination token, which can be used to request a specific page of `ListTransferRunsRequest` list results. For multiple-page results, `ListTransferRunsResponse` outputs a `next_page` token, which can be used as the `page_token` value to request the next page of list results.
    * @param {string} params.parent Name of transfer configuration for which transfer runs should be retrieved. Format of transfer configuration resource name is: `projects/{project_id}/transferConfigs/{config_id}`.
    * @param {string=} params.runAttempt Indicates how run attempts are to be pulled.
    * @param {string=} params.states When specified, only transfer runs with requested states are returned.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListTransferRunsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListTransferRunsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarTransferconfigsDollarRunsDollarList): GaxiosPromise[Schema$ListTransferRunsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarTransferconfigsDollarRunsDollarList,
    callback: BodyResponseCallback[Schema$ListTransferRunsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarTransferconfigsDollarRunsDollarList,
    options: BodyResponseCallback[Schema$ListTransferRunsResponse],
    callback: BodyResponseCallback[Schema$ListTransferRunsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarTransferconfigsDollarRunsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListTransferRunsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarTransferconfigsDollarRunsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListTransferRunsResponse]
  ): Unit = js.native
}

