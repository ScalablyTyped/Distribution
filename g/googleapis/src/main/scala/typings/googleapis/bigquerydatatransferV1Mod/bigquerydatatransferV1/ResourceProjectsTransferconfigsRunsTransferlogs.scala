package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/bigquerydatatransfer/v1", "bigquerydatatransfer_v1.Resource$Projects$Transferconfigs$Runs$Transferlogs")
@js.native
class ResourceProjectsTransferconfigsRunsTransferlogs protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * bigquerydatatransfer.projects.transferConfigs.runs.transferLogs.list
    * @desc Returns user facing log messages for the data transfer run.
    * @alias
    * bigquerydatatransfer.projects.transferConfigs.runs.transferLogs.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.messageTypes Message types to return. If not populated - INFO, WARNING and ERROR messages are returned.
    * @param {integer=} params.pageSize Page size. The default page size is the maximum value of 1000 results.
    * @param {string=} params.pageToken Pagination token, which can be used to request a specific page of `ListTransferLogsRequest` list results. For multiple-page results, `ListTransferLogsResponse` outputs a `next_page` token, which can be used as the `page_token` value to request the next page of list results.
    * @param {string} params.parent Transfer run name in the form: `projects/{project_id}/transferConfigs/{config_Id}/runs/{run_id}`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListTransferLogsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListTransferLogsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListTransferLogsResponse] = js.native
  def list(params: ParamsResourceProjectsTransferconfigsRunsTransferlogsList): GaxiosPromise[SchemaListTransferLogsResponse] = js.native
  def list(
    params: ParamsResourceProjectsTransferconfigsRunsTransferlogsList,
    callback: BodyResponseCallback[SchemaListTransferLogsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsTransferconfigsRunsTransferlogsList,
    options: BodyResponseCallback[SchemaListTransferLogsResponse],
    callback: BodyResponseCallback[SchemaListTransferLogsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsTransferconfigsRunsTransferlogsList, options: MethodOptions): GaxiosPromise[SchemaListTransferLogsResponse] = js.native
  def list(
    params: ParamsResourceProjectsTransferconfigsRunsTransferlogsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListTransferLogsResponse]
  ): Unit = js.native
}

