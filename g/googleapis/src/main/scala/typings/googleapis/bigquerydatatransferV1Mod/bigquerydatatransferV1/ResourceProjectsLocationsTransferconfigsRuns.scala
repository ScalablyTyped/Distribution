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

@JSImport("googleapis/build/src/apis/bigquerydatatransfer/v1", "bigquerydatatransfer_v1.Resource$Projects$Locations$Transferconfigs$Runs")
@js.native
open class ResourceProjectsLocationsTransferconfigsRuns protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsTransferconfigsRunsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsTransferconfigsRunsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsTransferconfigsRunsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsTransferconfigsRunsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsTransferconfigsRunsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes the specified transfer run.
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
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await bigquerydatatransfer.projects.locations.transferConfigs.runs.delete({
    *       // Required. The field will contain name of the resource requested, for example: `projects/{project_id\}/transferConfigs/{config_id\}/runs/{run_id\}` or `projects/{project_id\}/locations/{location_id\}/transferConfigs/{config_id\}/runs/{run_id\}`
    *       name: 'projects/my-project/locations/my-location/transferConfigs/my-transferConfig/runs/my-run',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
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
  def delete(params: ParamsResourceProjectsLocationsTransferconfigsRunsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsTransferconfigsRunsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaTransferRun] = js.native
  def get(callback: BodyResponseCallback[SchemaTransferRun]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTransferRun] = js.native
  def get(params: ParamsResourceProjectsLocationsTransferconfigsRunsGet): GaxiosPromise[SchemaTransferRun] = js.native
  def get(
    params: ParamsResourceProjectsLocationsTransferconfigsRunsGet,
    callback: BodyResponseCallback[SchemaTransferRun]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsTransferconfigsRunsGet,
    options: BodyResponseCallback[Readable | SchemaTransferRun],
    callback: BodyResponseCallback[Readable | SchemaTransferRun]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsTransferconfigsRunsGet, options: MethodOptions): GaxiosPromise[SchemaTransferRun] = js.native
  def get(
    params: ParamsResourceProjectsLocationsTransferconfigsRunsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTransferRun]
  ): Unit = js.native
  /**
    * Returns information about the particular transfer run.
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
    *     await bigquerydatatransfer.projects.locations.transferConfigs.runs.get({
    *       // Required. The field will contain name of the resource requested, for example: `projects/{project_id\}/transferConfigs/{config_id\}/runs/{run_id\}` or `projects/{project_id\}/locations/{location_id\}/transferConfigs/{config_id\}/runs/{run_id\}`
    *       name: 'projects/my-project/locations/my-location/transferConfigs/my-transferConfig/runs/my-run',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "dataSourceId": "my_dataSourceId",
    *   //   "destinationDatasetId": "my_destinationDatasetId",
    *   //   "emailPreferences": {},
    *   //   "endTime": "my_endTime",
    *   //   "errorStatus": {},
    *   //   "name": "my_name",
    *   //   "notificationPubsubTopic": "my_notificationPubsubTopic",
    *   //   "params": {},
    *   //   "runTime": "my_runTime",
    *   //   "schedule": "my_schedule",
    *   //   "scheduleTime": "my_scheduleTime",
    *   //   "startTime": "my_startTime",
    *   //   "state": "my_state",
    *   //   "updateTime": "my_updateTime",
    *   //   "userId": "my_userId"
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
  def get(params: ParamsResourceProjectsLocationsTransferconfigsRunsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsTransferconfigsRunsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListTransferRunsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListTransferRunsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListTransferRunsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsTransferconfigsRunsList): GaxiosPromise[SchemaListTransferRunsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsTransferconfigsRunsList,
    callback: BodyResponseCallback[SchemaListTransferRunsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsTransferconfigsRunsList,
    options: BodyResponseCallback[Readable | SchemaListTransferRunsResponse],
    callback: BodyResponseCallback[Readable | SchemaListTransferRunsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsTransferconfigsRunsList, options: MethodOptions): GaxiosPromise[SchemaListTransferRunsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsTransferconfigsRunsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListTransferRunsResponse]
  ): Unit = js.native
  /**
    * Returns information about running and completed transfer runs.
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
    *     await bigquerydatatransfer.projects.locations.transferConfigs.runs.list({
    *       // Page size. The default page size is the maximum value of 1000 results.
    *       pageSize: 'placeholder-value',
    *       // Pagination token, which can be used to request a specific page of `ListTransferRunsRequest` list results. For multiple-page results, `ListTransferRunsResponse` outputs a `next_page` token, which can be used as the `page_token` value to request the next page of list results.
    *       pageToken: 'placeholder-value',
    *       // Required. Name of transfer configuration for which transfer runs should be retrieved. Format of transfer configuration resource name is: `projects/{project_id\}/transferConfigs/{config_id\}` or `projects/{project_id\}/locations/{location_id\}/transferConfigs/{config_id\}`.
    *       parent:
    *         'projects/my-project/locations/my-location/transferConfigs/my-transferConfig',
    *       // Indicates how run attempts are to be pulled.
    *       runAttempt: 'placeholder-value',
    *       // When specified, only transfer runs with requested states are returned.
    *       states: 'placeholder-value',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "transferRuns": []
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
  def list(params: ParamsResourceProjectsLocationsTransferconfigsRunsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsTransferconfigsRunsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var transferLogs: ResourceProjectsLocationsTransferconfigsRunsTransferlogs = js.native
}
