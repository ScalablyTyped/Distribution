package typings.googleapis.bigqueryV2Mod.bigqueryV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/bigquery/v2", "bigquery_v2.Resource$Tabledata")
@js.native
class ResourceTabledata protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * bigquery.tabledata.insertAll
    * @desc Streams data into BigQuery one record at a time without needing to
    * run a load job. Requires the WRITER dataset role.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the BigQuery API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/bigquery
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * const {google} = require('googleapis');
    * var bigquery = google.bigquery('v2');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID of the destination table.
    *     projectId: 'my-project-id',  // TODO: Update placeholder value.
    *
    *     // Dataset ID of the destination table.
    *     datasetId: 'my-dataset-id',  // TODO: Update placeholder value.
    *
    *     // Table ID of the destination table.
    *     tableId: 'my-table-id',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   bigquery.tabledata.insertAll(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias bigquery.tabledata.insertAll
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.datasetId Dataset ID of the destination table.
    * @param {string} params.projectId Project ID of the destination table.
    * @param {string} params.tableId Table ID of the destination table.
    * @param {().TableDataInsertAllRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insertAll(): GaxiosPromise[SchemaTableDataInsertAllResponse] = js.native
  def insertAll(callback: BodyResponseCallback[SchemaTableDataInsertAllResponse]): Unit = js.native
  def insertAll(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTableDataInsertAllResponse] = js.native
  def insertAll(params: ParamsResourceTabledataInsertall): GaxiosPromise[SchemaTableDataInsertAllResponse] = js.native
  def insertAll(
    params: ParamsResourceTabledataInsertall,
    callback: BodyResponseCallback[SchemaTableDataInsertAllResponse]
  ): Unit = js.native
  def insertAll(
    params: ParamsResourceTabledataInsertall,
    options: BodyResponseCallback[SchemaTableDataInsertAllResponse],
    callback: BodyResponseCallback[SchemaTableDataInsertAllResponse]
  ): Unit = js.native
  def insertAll(params: ParamsResourceTabledataInsertall, options: MethodOptions): GaxiosPromise[SchemaTableDataInsertAllResponse] = js.native
  def insertAll(
    params: ParamsResourceTabledataInsertall,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTableDataInsertAllResponse]
  ): Unit = js.native
  
  /**
    * bigquery.tabledata.list
    * @desc Retrieves table data from a specified set of rows. Requires the
    * READER dataset role.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the BigQuery API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/bigquery
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * const {google} = require('googleapis');
    * var bigquery = google.bigquery('v2');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID of the table to read
    *     projectId: 'my-project-id',  // TODO: Update placeholder value.
    *
    *     // Dataset ID of the table to read
    *     datasetId: 'my-dataset-id',  // TODO: Update placeholder value.
    *
    *     // Table ID of the table to read
    *     tableId: 'my-table-id',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   var handlePage = function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     var rowsPage = response['rows'];
    *     if (!rowsPage) {
    *       return;
    *     }
    *     for (var i = 0; i < rowsPage.length; i++) {
    *       // TODO: Change code below to process each resource in `rowsPage`:
    *       console.log(JSON.stringify(rowsPage[i], null, 2));
    *     }
    *
    *     if (response.pageToken) {
    *       request.pageToken = response.pageToken;
    *       bigquery.tabledata.list(request, handlePage);
    *     }
    *   };
    *
    *   bigquery.tabledata.list(request, handlePage);
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias bigquery.tabledata.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.datasetId Dataset ID of the table to read
    * @param {integer=} params.maxResults Maximum number of results to return
    * @param {string=} params.pageToken Page token, returned by a previous call, identifying the result set
    * @param {string} params.projectId Project ID of the table to read
    * @param {string=} params.selectedFields List of fields to return (comma-separated). If unspecified, all fields are returned
    * @param {string=} params.startIndex Zero-based index of the starting row to read
    * @param {string} params.tableId Table ID of the table to read
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaTableDataList] = js.native
  def list(callback: BodyResponseCallback[SchemaTableDataList]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTableDataList] = js.native
  def list(params: ParamsResourceTabledataList): GaxiosPromise[SchemaTableDataList] = js.native
  def list(params: ParamsResourceTabledataList, callback: BodyResponseCallback[SchemaTableDataList]): Unit = js.native
  def list(
    params: ParamsResourceTabledataList,
    options: BodyResponseCallback[SchemaTableDataList],
    callback: BodyResponseCallback[SchemaTableDataList]
  ): Unit = js.native
  def list(params: ParamsResourceTabledataList, options: MethodOptions): GaxiosPromise[SchemaTableDataList] = js.native
  def list(
    params: ParamsResourceTabledataList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTableDataList]
  ): Unit = js.native
}
