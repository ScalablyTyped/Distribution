package typings.googleapis.bigqueryV2Mod.bigqueryV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/bigquery/v2", "bigquery_v2.Resource$Tabledata")
@js.native
open class ResourceTabledata protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def insertAll(): GaxiosPromise[SchemaTableDataInsertAllResponse] = js.native
  def insertAll(callback: BodyResponseCallback[SchemaTableDataInsertAllResponse]): Unit = js.native
  def insertAll(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTableDataInsertAllResponse] = js.native
  def insertAll(params: ParamsResourceTabledataInsertall): GaxiosPromise[SchemaTableDataInsertAllResponse] = js.native
  def insertAll(
    params: ParamsResourceTabledataInsertall,
    callback: BodyResponseCallback[SchemaTableDataInsertAllResponse]
  ): Unit = js.native
  def insertAll(
    params: ParamsResourceTabledataInsertall,
    options: BodyResponseCallback[Readable | SchemaTableDataInsertAllResponse],
    callback: BodyResponseCallback[Readable | SchemaTableDataInsertAllResponse]
  ): Unit = js.native
  def insertAll(params: ParamsResourceTabledataInsertall, options: MethodOptions): GaxiosPromise[SchemaTableDataInsertAllResponse] = js.native
  def insertAll(
    params: ParamsResourceTabledataInsertall,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTableDataInsertAllResponse]
  ): Unit = js.native
  /**
    * Streams data into BigQuery one record at a time without needing to run a load job. Requires the WRITER dataset role.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigquery.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigquery = google.bigquery('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigquery',
    *       'https://www.googleapis.com/auth/bigquery.insertdata',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await bigquery.tabledata.insertAll({
    *     // Dataset ID of the destination table.
    *     datasetId: 'placeholder-value',
    *     // Project ID of the destination table.
    *     projectId: 'placeholder-value',
    *     // Table ID of the destination table.
    *     tableId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "ignoreUnknownValues": false,
    *       //   "kind": "my_kind",
    *       //   "rows": [],
    *       //   "skipInvalidRows": false,
    *       //   "templateSuffix": "my_templateSuffix"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "insertErrors": [],
    *   //   "kind": "my_kind"
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
  def insertAll(params: ParamsResourceTabledataInsertall, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insertAll(
    params: ParamsResourceTabledataInsertall,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaTableDataList] = js.native
  def list(callback: BodyResponseCallback[SchemaTableDataList]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTableDataList] = js.native
  def list(params: ParamsResourceTabledataList): GaxiosPromise[SchemaTableDataList] = js.native
  def list(params: ParamsResourceTabledataList, callback: BodyResponseCallback[SchemaTableDataList]): Unit = js.native
  def list(
    params: ParamsResourceTabledataList,
    options: BodyResponseCallback[Readable | SchemaTableDataList],
    callback: BodyResponseCallback[Readable | SchemaTableDataList]
  ): Unit = js.native
  def list(params: ParamsResourceTabledataList, options: MethodOptions): GaxiosPromise[SchemaTableDataList] = js.native
  def list(
    params: ParamsResourceTabledataList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTableDataList]
  ): Unit = js.native
  /**
    * Retrieves table data from a specified set of rows. Requires the READER dataset role.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigquery.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigquery = google.bigquery('v2');
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
    *   const res = await bigquery.tabledata.list({
    *     // Dataset ID of the table to read
    *     datasetId: 'placeholder-value',
    *     // Maximum number of results to return
    *     maxResults: 'placeholder-value',
    *     // Page token, returned by a previous call, identifying the result set
    *     pageToken: 'placeholder-value',
    *     // Project ID of the table to read
    *     projectId: 'placeholder-value',
    *     // List of fields to return (comma-separated). If unspecified, all fields are returned
    *     selectedFields: 'placeholder-value',
    *     // Zero-based index of the starting row to read
    *     startIndex: 'placeholder-value',
    *     // Table ID of the table to read
    *     tableId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "kind": "my_kind",
    *   //   "pageToken": "my_pageToken",
    *   //   "rows": [],
    *   //   "totalRows": "my_totalRows"
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
  def list(params: ParamsResourceTabledataList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceTabledataList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
