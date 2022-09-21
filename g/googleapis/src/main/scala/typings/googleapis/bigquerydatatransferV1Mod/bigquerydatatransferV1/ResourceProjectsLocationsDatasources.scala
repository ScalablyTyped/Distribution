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

@JSImport("googleapis/build/src/apis/bigquerydatatransfer/v1", "bigquerydatatransfer_v1.Resource$Projects$Locations$Datasources")
@js.native
open class ResourceProjectsLocationsDatasources protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def checkValidCreds(): GaxiosPromise[SchemaCheckValidCredsResponse] = js.native
  def checkValidCreds(callback: BodyResponseCallback[SchemaCheckValidCredsResponse]): Unit = js.native
  def checkValidCreds(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCheckValidCredsResponse] = js.native
  def checkValidCreds(params: ParamsResourceProjectsLocationsDatasourcesCheckvalidcreds): GaxiosPromise[SchemaCheckValidCredsResponse] = js.native
  def checkValidCreds(
    params: ParamsResourceProjectsLocationsDatasourcesCheckvalidcreds,
    callback: BodyResponseCallback[SchemaCheckValidCredsResponse]
  ): Unit = js.native
  def checkValidCreds(
    params: ParamsResourceProjectsLocationsDatasourcesCheckvalidcreds,
    options: BodyResponseCallback[Readable | SchemaCheckValidCredsResponse],
    callback: BodyResponseCallback[Readable | SchemaCheckValidCredsResponse]
  ): Unit = js.native
  def checkValidCreds(params: ParamsResourceProjectsLocationsDatasourcesCheckvalidcreds, options: MethodOptions): GaxiosPromise[SchemaCheckValidCredsResponse] = js.native
  def checkValidCreds(
    params: ParamsResourceProjectsLocationsDatasourcesCheckvalidcreds,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCheckValidCredsResponse]
  ): Unit = js.native
  /**
    * Returns true if valid credentials exist for the given data source and requesting user.
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
    *     await bigquerydatatransfer.projects.locations.dataSources.checkValidCreds({
    *       // Required. The data source in the form: `projects/{project_id\}/dataSources/{data_source_id\}` or `projects/{project_id\}/locations/{location_id\}/dataSources/{data_source_id\}`.
    *       name: 'projects/my-project/locations/my-location/dataSources/my-dataSource',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {}
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "hasValidCreds": false
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
  def checkValidCreds(params: ParamsResourceProjectsLocationsDatasourcesCheckvalidcreds, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def checkValidCreds(
    params: ParamsResourceProjectsLocationsDatasourcesCheckvalidcreds,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaDataSource] = js.native
  def get(callback: BodyResponseCallback[SchemaDataSource]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDataSource] = js.native
  def get(params: ParamsResourceProjectsLocationsDatasourcesGet): GaxiosPromise[SchemaDataSource] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasourcesGet,
    callback: BodyResponseCallback[SchemaDataSource]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasourcesGet,
    options: BodyResponseCallback[Readable | SchemaDataSource],
    callback: BodyResponseCallback[Readable | SchemaDataSource]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsDatasourcesGet, options: MethodOptions): GaxiosPromise[SchemaDataSource] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasourcesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDataSource]
  ): Unit = js.native
  /**
    * Retrieves a supported data source and returns its settings.
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
    *   const res = await bigquerydatatransfer.projects.locations.dataSources.get({
    *     // Required. The field will contain name of the resource requested, for example: `projects/{project_id\}/dataSources/{data_source_id\}` or `projects/{project_id\}/locations/{location_id\}/dataSources/{data_source_id\}`
    *     name: 'projects/my-project/locations/my-location/dataSources/my-dataSource',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "authorizationType": "my_authorizationType",
    *   //   "clientId": "my_clientId",
    *   //   "dataRefreshType": "my_dataRefreshType",
    *   //   "dataSourceId": "my_dataSourceId",
    *   //   "defaultDataRefreshWindowDays": 0,
    *   //   "defaultSchedule": "my_defaultSchedule",
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "helpUrl": "my_helpUrl",
    *   //   "manualRunsDisabled": false,
    *   //   "minimumScheduleInterval": "my_minimumScheduleInterval",
    *   //   "name": "my_name",
    *   //   "parameters": [],
    *   //   "scopes": [],
    *   //   "supportsCustomSchedule": false,
    *   //   "supportsMultipleTransfers": false,
    *   //   "transferType": "my_transferType",
    *   //   "updateDeadlineSeconds": 0
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
  def get(params: ParamsResourceProjectsLocationsDatasourcesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasourcesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListDataSourcesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListDataSourcesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListDataSourcesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsDatasourcesList): GaxiosPromise[SchemaListDataSourcesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasourcesList,
    callback: BodyResponseCallback[SchemaListDataSourcesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasourcesList,
    options: BodyResponseCallback[Readable | SchemaListDataSourcesResponse],
    callback: BodyResponseCallback[Readable | SchemaListDataSourcesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsDatasourcesList, options: MethodOptions): GaxiosPromise[SchemaListDataSourcesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasourcesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListDataSourcesResponse]
  ): Unit = js.native
  /**
    * Lists supported data sources and returns their settings.
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
    *   const res = await bigquerydatatransfer.projects.locations.dataSources.list({
    *     // Page size. The default page size is the maximum value of 1000 results.
    *     pageSize: 'placeholder-value',
    *     // Pagination token, which can be used to request a specific page of `ListDataSourcesRequest` list results. For multiple-page results, `ListDataSourcesResponse` outputs a `next_page` token, which can be used as the `page_token` value to request the next page of list results.
    *     pageToken: 'placeholder-value',
    *     // Required. The BigQuery project id for which data sources should be returned. Must be in the form: `projects/{project_id\}` or `projects/{project_id\}/locations/{location_id\}`
    *     parent: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "dataSources": [],
    *   //   "nextPageToken": "my_nextPageToken"
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
  def list(params: ParamsResourceProjectsLocationsDatasourcesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasourcesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
