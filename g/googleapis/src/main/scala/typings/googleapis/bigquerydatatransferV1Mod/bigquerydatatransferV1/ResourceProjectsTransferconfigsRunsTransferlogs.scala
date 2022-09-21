package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/bigquerydatatransfer/v1", "bigquerydatatransfer_v1.Resource$Projects$Transferconfigs$Runs$Transferlogs")
@js.native
open class ResourceProjectsTransferconfigsRunsTransferlogs protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListTransferLogsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListTransferLogsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListTransferLogsResponse] = js.native
  def list(params: ParamsResourceProjectsTransferconfigsRunsTransferlogsList): GaxiosPromise[SchemaListTransferLogsResponse] = js.native
  def list(
    params: ParamsResourceProjectsTransferconfigsRunsTransferlogsList,
    callback: BodyResponseCallback[SchemaListTransferLogsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsTransferconfigsRunsTransferlogsList,
    options: BodyResponseCallback[Readable | SchemaListTransferLogsResponse],
    callback: BodyResponseCallback[Readable | SchemaListTransferLogsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsTransferconfigsRunsTransferlogsList, options: MethodOptions): GaxiosPromise[SchemaListTransferLogsResponse] = js.native
  def list(
    params: ParamsResourceProjectsTransferconfigsRunsTransferlogsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListTransferLogsResponse]
  ): Unit = js.native
  /**
    * Returns log messages for the transfer run.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigquerydatatransfer.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigquerydatatransfer = google.bigquerydatatransfer('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigquery',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await bigquerydatatransfer.projects.transferConfigs.runs.transferLogs.list({
    *       // Message types to return. If not populated - INFO, WARNING and ERROR messages are returned.
    *       messageTypes: 'placeholder-value',
    *       // Page size. The default page size is the maximum value of 1000 results.
    *       pageSize: 'placeholder-value',
    *       // Pagination token, which can be used to request a specific page of `ListTransferLogsRequest` list results. For multiple-page results, `ListTransferLogsResponse` outputs a `next_page` token, which can be used as the `page_token` value to request the next page of list results.
    *       pageToken: 'placeholder-value',
    *       // Required. Transfer run name in the form: `projects/{project_id\}/transferConfigs/{config_id\}/runs/{run_id\}` or `projects/{project_id\}/locations/{location_id\}/transferConfigs/{config_id\}/runs/{run_id\}`
    *       parent:
    *         'projects/my-project/transferConfigs/my-transferConfig/runs/my-run',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "transferMessages": []
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def list(params: ParamsResourceProjectsTransferconfigsRunsTransferlogsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsTransferconfigsRunsTransferlogsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
