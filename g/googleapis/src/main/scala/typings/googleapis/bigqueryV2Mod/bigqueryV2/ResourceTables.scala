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

@JSImport("googleapis/build/src/apis/bigquery/v2", "bigquery_v2.Resource$Tables")
@js.native
open class ResourceTables protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceTablesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceTablesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceTablesDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceTablesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceTablesDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * Deletes the table specified by tableId from the dataset. If the table contains data, all the data will be deleted.
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
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await bigquery.tables.delete({
    *     // Dataset ID of the table to delete
    *     datasetId: 'placeholder-value',
    *     // Project ID of the table to delete
    *     projectId: 'placeholder-value',
    *     // Table ID of the table to delete
    *     tableId: 'placeholder-value',
    *   });
    *   console.log(res.data);
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
  def delete(params: ParamsResourceTablesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceTablesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaTable] = js.native
  def get(callback: BodyResponseCallback[SchemaTable]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTable] = js.native
  def get(params: ParamsResourceTablesGet): GaxiosPromise[SchemaTable] = js.native
  def get(params: ParamsResourceTablesGet, callback: BodyResponseCallback[SchemaTable]): Unit = js.native
  def get(
    params: ParamsResourceTablesGet,
    options: BodyResponseCallback[Readable | SchemaTable],
    callback: BodyResponseCallback[Readable | SchemaTable]
  ): Unit = js.native
  def get(params: ParamsResourceTablesGet, options: MethodOptions): GaxiosPromise[SchemaTable] = js.native
  def get(
    params: ParamsResourceTablesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTable]
  ): Unit = js.native
  /**
    * Gets the specified table resource by table ID. This method does not return the data in the table, it only returns the table resource, which describes the structure of this table.
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
    *   const res = await bigquery.tables.get({
    *     // Dataset ID of the requested table
    *     datasetId: 'placeholder-value',
    *     // Project ID of the requested table
    *     projectId: 'placeholder-value',
    *     // List of fields to return (comma-separated). If unspecified, all fields are returned
    *     selectedFields: 'placeholder-value',
    *     // Table ID of the requested table
    *     tableId: 'placeholder-value',
    *     // Specifies the view that determines which table information is returned. By default, basic table information and storage statistics (STORAGE_STATS) are returned.
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cloneDefinition": {},
    *   //   "clustering": {},
    *   //   "creationTime": "my_creationTime",
    *   //   "defaultCollation": "my_defaultCollation",
    *   //   "description": "my_description",
    *   //   "encryptionConfiguration": {},
    *   //   "etag": "my_etag",
    *   //   "expirationTime": "my_expirationTime",
    *   //   "externalDataConfiguration": {},
    *   //   "friendlyName": "my_friendlyName",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "labels": {},
    *   //   "lastModifiedTime": "my_lastModifiedTime",
    *   //   "location": "my_location",
    *   //   "materializedView": {},
    *   //   "maxStaleness": "my_maxStaleness",
    *   //   "model": {},
    *   //   "numBytes": "my_numBytes",
    *   //   "numLongTermBytes": "my_numLongTermBytes",
    *   //   "numPhysicalBytes": "my_numPhysicalBytes",
    *   //   "numRows": "my_numRows",
    *   //   "num_active_logical_bytes": "my_num_active_logical_bytes",
    *   //   "num_active_physical_bytes": "my_num_active_physical_bytes",
    *   //   "num_long_term_logical_bytes": "my_num_long_term_logical_bytes",
    *   //   "num_long_term_physical_bytes": "my_num_long_term_physical_bytes",
    *   //   "num_partitions": "my_num_partitions",
    *   //   "num_time_travel_physical_bytes": "my_num_time_travel_physical_bytes",
    *   //   "num_total_logical_bytes": "my_num_total_logical_bytes",
    *   //   "num_total_physical_bytes": "my_num_total_physical_bytes",
    *   //   "rangePartitioning": {},
    *   //   "requirePartitionFilter": false,
    *   //   "schema": {},
    *   //   "selfLink": "my_selfLink",
    *   //   "snapshotDefinition": {},
    *   //   "streamingBuffer": {},
    *   //   "tableReference": {},
    *   //   "timePartitioning": {},
    *   //   "type": "my_type",
    *   //   "view": {}
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
  def get(params: ParamsResourceTablesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceTablesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceTablesGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceTablesGetiampolicy, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceTablesGetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceTablesGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceTablesGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
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
    *   const res = await bigquery.tables.getIamPolicy({
    *     // REQUIRED: The resource for which the policy is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *     resource: 'projects/my-project/datasets/my-dataset/tables/my-table',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "options": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "auditConfigs": [],
    *   //   "bindings": [],
    *   //   "etag": "my_etag",
    *   //   "version": 0
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
  def getIamPolicy(params: ParamsResourceTablesGetiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getIamPolicy(
    params: ParamsResourceTablesGetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaTable] = js.native
  def insert(callback: BodyResponseCallback[SchemaTable]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTable] = js.native
  def insert(params: ParamsResourceTablesInsert): GaxiosPromise[SchemaTable] = js.native
  def insert(params: ParamsResourceTablesInsert, callback: BodyResponseCallback[SchemaTable]): Unit = js.native
  def insert(
    params: ParamsResourceTablesInsert,
    options: BodyResponseCallback[Readable | SchemaTable],
    callback: BodyResponseCallback[Readable | SchemaTable]
  ): Unit = js.native
  def insert(params: ParamsResourceTablesInsert, options: MethodOptions): GaxiosPromise[SchemaTable] = js.native
  def insert(
    params: ParamsResourceTablesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTable]
  ): Unit = js.native
  /**
    * Creates a new, empty table in the dataset.
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
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await bigquery.tables.insert({
    *     // Dataset ID of the new table
    *     datasetId: 'placeholder-value',
    *     // Project ID of the new table
    *     projectId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "cloneDefinition": {},
    *       //   "clustering": {},
    *       //   "creationTime": "my_creationTime",
    *       //   "defaultCollation": "my_defaultCollation",
    *       //   "description": "my_description",
    *       //   "encryptionConfiguration": {},
    *       //   "etag": "my_etag",
    *       //   "expirationTime": "my_expirationTime",
    *       //   "externalDataConfiguration": {},
    *       //   "friendlyName": "my_friendlyName",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "labels": {},
    *       //   "lastModifiedTime": "my_lastModifiedTime",
    *       //   "location": "my_location",
    *       //   "materializedView": {},
    *       //   "maxStaleness": "my_maxStaleness",
    *       //   "model": {},
    *       //   "numBytes": "my_numBytes",
    *       //   "numLongTermBytes": "my_numLongTermBytes",
    *       //   "numPhysicalBytes": "my_numPhysicalBytes",
    *       //   "numRows": "my_numRows",
    *       //   "num_active_logical_bytes": "my_num_active_logical_bytes",
    *       //   "num_active_physical_bytes": "my_num_active_physical_bytes",
    *       //   "num_long_term_logical_bytes": "my_num_long_term_logical_bytes",
    *       //   "num_long_term_physical_bytes": "my_num_long_term_physical_bytes",
    *       //   "num_partitions": "my_num_partitions",
    *       //   "num_time_travel_physical_bytes": "my_num_time_travel_physical_bytes",
    *       //   "num_total_logical_bytes": "my_num_total_logical_bytes",
    *       //   "num_total_physical_bytes": "my_num_total_physical_bytes",
    *       //   "rangePartitioning": {},
    *       //   "requirePartitionFilter": false,
    *       //   "schema": {},
    *       //   "selfLink": "my_selfLink",
    *       //   "snapshotDefinition": {},
    *       //   "streamingBuffer": {},
    *       //   "tableReference": {},
    *       //   "timePartitioning": {},
    *       //   "type": "my_type",
    *       //   "view": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cloneDefinition": {},
    *   //   "clustering": {},
    *   //   "creationTime": "my_creationTime",
    *   //   "defaultCollation": "my_defaultCollation",
    *   //   "description": "my_description",
    *   //   "encryptionConfiguration": {},
    *   //   "etag": "my_etag",
    *   //   "expirationTime": "my_expirationTime",
    *   //   "externalDataConfiguration": {},
    *   //   "friendlyName": "my_friendlyName",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "labels": {},
    *   //   "lastModifiedTime": "my_lastModifiedTime",
    *   //   "location": "my_location",
    *   //   "materializedView": {},
    *   //   "maxStaleness": "my_maxStaleness",
    *   //   "model": {},
    *   //   "numBytes": "my_numBytes",
    *   //   "numLongTermBytes": "my_numLongTermBytes",
    *   //   "numPhysicalBytes": "my_numPhysicalBytes",
    *   //   "numRows": "my_numRows",
    *   //   "num_active_logical_bytes": "my_num_active_logical_bytes",
    *   //   "num_active_physical_bytes": "my_num_active_physical_bytes",
    *   //   "num_long_term_logical_bytes": "my_num_long_term_logical_bytes",
    *   //   "num_long_term_physical_bytes": "my_num_long_term_physical_bytes",
    *   //   "num_partitions": "my_num_partitions",
    *   //   "num_time_travel_physical_bytes": "my_num_time_travel_physical_bytes",
    *   //   "num_total_logical_bytes": "my_num_total_logical_bytes",
    *   //   "num_total_physical_bytes": "my_num_total_physical_bytes",
    *   //   "rangePartitioning": {},
    *   //   "requirePartitionFilter": false,
    *   //   "schema": {},
    *   //   "selfLink": "my_selfLink",
    *   //   "snapshotDefinition": {},
    *   //   "streamingBuffer": {},
    *   //   "tableReference": {},
    *   //   "timePartitioning": {},
    *   //   "type": "my_type",
    *   //   "view": {}
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
  def insert(params: ParamsResourceTablesInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceTablesInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaTableList] = js.native
  def list(callback: BodyResponseCallback[SchemaTableList]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTableList] = js.native
  def list(params: ParamsResourceTablesList): GaxiosPromise[SchemaTableList] = js.native
  def list(params: ParamsResourceTablesList, callback: BodyResponseCallback[SchemaTableList]): Unit = js.native
  def list(
    params: ParamsResourceTablesList,
    options: BodyResponseCallback[Readable | SchemaTableList],
    callback: BodyResponseCallback[Readable | SchemaTableList]
  ): Unit = js.native
  def list(params: ParamsResourceTablesList, options: MethodOptions): GaxiosPromise[SchemaTableList] = js.native
  def list(
    params: ParamsResourceTablesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTableList]
  ): Unit = js.native
  /**
    * Lists all tables in the specified dataset. Requires the READER dataset role.
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
    *   const res = await bigquery.tables.list({
    *     // Dataset ID of the tables to list
    *     datasetId: 'placeholder-value',
    *     // Maximum number of results to return
    *     maxResults: 'placeholder-value',
    *     // Page token, returned by a previous call, to request the next page of results
    *     pageToken: 'placeholder-value',
    *     // Project ID of the tables to list
    *     projectId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "tables": [],
    *   //   "totalItems": 0
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
  def list(params: ParamsResourceTablesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceTablesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaTable] = js.native
  def patch(callback: BodyResponseCallback[SchemaTable]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTable] = js.native
  def patch(params: ParamsResourceTablesPatch): GaxiosPromise[SchemaTable] = js.native
  def patch(params: ParamsResourceTablesPatch, callback: BodyResponseCallback[SchemaTable]): Unit = js.native
  def patch(
    params: ParamsResourceTablesPatch,
    options: BodyResponseCallback[Readable | SchemaTable],
    callback: BodyResponseCallback[Readable | SchemaTable]
  ): Unit = js.native
  def patch(params: ParamsResourceTablesPatch, options: MethodOptions): GaxiosPromise[SchemaTable] = js.native
  def patch(
    params: ParamsResourceTablesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTable]
  ): Unit = js.native
  /**
    * Updates information in an existing table. The update method replaces the entire table resource, whereas the patch method only replaces fields that are provided in the submitted table resource. This method supports patch semantics.
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
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await bigquery.tables.patch({
    *     // When true will autodetect schema, else will keep original schema
    *     autodetect_schema: 'placeholder-value',
    *     // Dataset ID of the table to update
    *     datasetId: 'placeholder-value',
    *     // Project ID of the table to update
    *     projectId: 'placeholder-value',
    *     // Table ID of the table to update
    *     tableId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "cloneDefinition": {},
    *       //   "clustering": {},
    *       //   "creationTime": "my_creationTime",
    *       //   "defaultCollation": "my_defaultCollation",
    *       //   "description": "my_description",
    *       //   "encryptionConfiguration": {},
    *       //   "etag": "my_etag",
    *       //   "expirationTime": "my_expirationTime",
    *       //   "externalDataConfiguration": {},
    *       //   "friendlyName": "my_friendlyName",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "labels": {},
    *       //   "lastModifiedTime": "my_lastModifiedTime",
    *       //   "location": "my_location",
    *       //   "materializedView": {},
    *       //   "maxStaleness": "my_maxStaleness",
    *       //   "model": {},
    *       //   "numBytes": "my_numBytes",
    *       //   "numLongTermBytes": "my_numLongTermBytes",
    *       //   "numPhysicalBytes": "my_numPhysicalBytes",
    *       //   "numRows": "my_numRows",
    *       //   "num_active_logical_bytes": "my_num_active_logical_bytes",
    *       //   "num_active_physical_bytes": "my_num_active_physical_bytes",
    *       //   "num_long_term_logical_bytes": "my_num_long_term_logical_bytes",
    *       //   "num_long_term_physical_bytes": "my_num_long_term_physical_bytes",
    *       //   "num_partitions": "my_num_partitions",
    *       //   "num_time_travel_physical_bytes": "my_num_time_travel_physical_bytes",
    *       //   "num_total_logical_bytes": "my_num_total_logical_bytes",
    *       //   "num_total_physical_bytes": "my_num_total_physical_bytes",
    *       //   "rangePartitioning": {},
    *       //   "requirePartitionFilter": false,
    *       //   "schema": {},
    *       //   "selfLink": "my_selfLink",
    *       //   "snapshotDefinition": {},
    *       //   "streamingBuffer": {},
    *       //   "tableReference": {},
    *       //   "timePartitioning": {},
    *       //   "type": "my_type",
    *       //   "view": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cloneDefinition": {},
    *   //   "clustering": {},
    *   //   "creationTime": "my_creationTime",
    *   //   "defaultCollation": "my_defaultCollation",
    *   //   "description": "my_description",
    *   //   "encryptionConfiguration": {},
    *   //   "etag": "my_etag",
    *   //   "expirationTime": "my_expirationTime",
    *   //   "externalDataConfiguration": {},
    *   //   "friendlyName": "my_friendlyName",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "labels": {},
    *   //   "lastModifiedTime": "my_lastModifiedTime",
    *   //   "location": "my_location",
    *   //   "materializedView": {},
    *   //   "maxStaleness": "my_maxStaleness",
    *   //   "model": {},
    *   //   "numBytes": "my_numBytes",
    *   //   "numLongTermBytes": "my_numLongTermBytes",
    *   //   "numPhysicalBytes": "my_numPhysicalBytes",
    *   //   "numRows": "my_numRows",
    *   //   "num_active_logical_bytes": "my_num_active_logical_bytes",
    *   //   "num_active_physical_bytes": "my_num_active_physical_bytes",
    *   //   "num_long_term_logical_bytes": "my_num_long_term_logical_bytes",
    *   //   "num_long_term_physical_bytes": "my_num_long_term_physical_bytes",
    *   //   "num_partitions": "my_num_partitions",
    *   //   "num_time_travel_physical_bytes": "my_num_time_travel_physical_bytes",
    *   //   "num_total_logical_bytes": "my_num_total_logical_bytes",
    *   //   "num_total_physical_bytes": "my_num_total_physical_bytes",
    *   //   "rangePartitioning": {},
    *   //   "requirePartitionFilter": false,
    *   //   "schema": {},
    *   //   "selfLink": "my_selfLink",
    *   //   "snapshotDefinition": {},
    *   //   "streamingBuffer": {},
    *   //   "tableReference": {},
    *   //   "timePartitioning": {},
    *   //   "type": "my_type",
    *   //   "view": {}
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
  def patch(params: ParamsResourceTablesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceTablesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceTablesSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceTablesSetiampolicy, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceTablesSetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceTablesSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceTablesSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
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
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await bigquery.tables.setIamPolicy({
    *     // REQUIRED: The resource for which the policy is being specified. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *     resource: 'projects/my-project/datasets/my-dataset/tables/my-table',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "policy": {},
    *       //   "updateMask": "my_updateMask"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "auditConfigs": [],
    *   //   "bindings": [],
    *   //   "etag": "my_etag",
    *   //   "version": 0
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
  def setIamPolicy(params: ParamsResourceTablesSetiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setIamPolicy(
    params: ParamsResourceTablesSetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceTablesTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceTablesTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceTablesTestiampermissions,
    options: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceTablesTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceTablesTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
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
    *   const res = await bigquery.tables.testIamPermissions({
    *     // REQUIRED: The resource for which the policy detail is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *     resource: 'projects/my-project/datasets/my-dataset/tables/my-table',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "permissions": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "permissions": []
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
  def testIamPermissions(params: ParamsResourceTablesTestiampermissions, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def testIamPermissions(
    params: ParamsResourceTablesTestiampermissions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaTable] = js.native
  def update(callback: BodyResponseCallback[SchemaTable]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTable] = js.native
  def update(params: ParamsResourceTablesUpdate): GaxiosPromise[SchemaTable] = js.native
  def update(params: ParamsResourceTablesUpdate, callback: BodyResponseCallback[SchemaTable]): Unit = js.native
  def update(
    params: ParamsResourceTablesUpdate,
    options: BodyResponseCallback[Readable | SchemaTable],
    callback: BodyResponseCallback[Readable | SchemaTable]
  ): Unit = js.native
  def update(params: ParamsResourceTablesUpdate, options: MethodOptions): GaxiosPromise[SchemaTable] = js.native
  def update(
    params: ParamsResourceTablesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTable]
  ): Unit = js.native
  /**
    * Updates information in an existing table. The update method replaces the entire table resource, whereas the patch method only replaces fields that are provided in the submitted table resource.
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
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await bigquery.tables.update({
    *     // When true will autodetect schema, else will keep original schema
    *     autodetect_schema: 'placeholder-value',
    *     // Dataset ID of the table to update
    *     datasetId: 'placeholder-value',
    *     // Project ID of the table to update
    *     projectId: 'placeholder-value',
    *     // Table ID of the table to update
    *     tableId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "cloneDefinition": {},
    *       //   "clustering": {},
    *       //   "creationTime": "my_creationTime",
    *       //   "defaultCollation": "my_defaultCollation",
    *       //   "description": "my_description",
    *       //   "encryptionConfiguration": {},
    *       //   "etag": "my_etag",
    *       //   "expirationTime": "my_expirationTime",
    *       //   "externalDataConfiguration": {},
    *       //   "friendlyName": "my_friendlyName",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "labels": {},
    *       //   "lastModifiedTime": "my_lastModifiedTime",
    *       //   "location": "my_location",
    *       //   "materializedView": {},
    *       //   "maxStaleness": "my_maxStaleness",
    *       //   "model": {},
    *       //   "numBytes": "my_numBytes",
    *       //   "numLongTermBytes": "my_numLongTermBytes",
    *       //   "numPhysicalBytes": "my_numPhysicalBytes",
    *       //   "numRows": "my_numRows",
    *       //   "num_active_logical_bytes": "my_num_active_logical_bytes",
    *       //   "num_active_physical_bytes": "my_num_active_physical_bytes",
    *       //   "num_long_term_logical_bytes": "my_num_long_term_logical_bytes",
    *       //   "num_long_term_physical_bytes": "my_num_long_term_physical_bytes",
    *       //   "num_partitions": "my_num_partitions",
    *       //   "num_time_travel_physical_bytes": "my_num_time_travel_physical_bytes",
    *       //   "num_total_logical_bytes": "my_num_total_logical_bytes",
    *       //   "num_total_physical_bytes": "my_num_total_physical_bytes",
    *       //   "rangePartitioning": {},
    *       //   "requirePartitionFilter": false,
    *       //   "schema": {},
    *       //   "selfLink": "my_selfLink",
    *       //   "snapshotDefinition": {},
    *       //   "streamingBuffer": {},
    *       //   "tableReference": {},
    *       //   "timePartitioning": {},
    *       //   "type": "my_type",
    *       //   "view": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cloneDefinition": {},
    *   //   "clustering": {},
    *   //   "creationTime": "my_creationTime",
    *   //   "defaultCollation": "my_defaultCollation",
    *   //   "description": "my_description",
    *   //   "encryptionConfiguration": {},
    *   //   "etag": "my_etag",
    *   //   "expirationTime": "my_expirationTime",
    *   //   "externalDataConfiguration": {},
    *   //   "friendlyName": "my_friendlyName",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "labels": {},
    *   //   "lastModifiedTime": "my_lastModifiedTime",
    *   //   "location": "my_location",
    *   //   "materializedView": {},
    *   //   "maxStaleness": "my_maxStaleness",
    *   //   "model": {},
    *   //   "numBytes": "my_numBytes",
    *   //   "numLongTermBytes": "my_numLongTermBytes",
    *   //   "numPhysicalBytes": "my_numPhysicalBytes",
    *   //   "numRows": "my_numRows",
    *   //   "num_active_logical_bytes": "my_num_active_logical_bytes",
    *   //   "num_active_physical_bytes": "my_num_active_physical_bytes",
    *   //   "num_long_term_logical_bytes": "my_num_long_term_logical_bytes",
    *   //   "num_long_term_physical_bytes": "my_num_long_term_physical_bytes",
    *   //   "num_partitions": "my_num_partitions",
    *   //   "num_time_travel_physical_bytes": "my_num_time_travel_physical_bytes",
    *   //   "num_total_logical_bytes": "my_num_total_logical_bytes",
    *   //   "num_total_physical_bytes": "my_num_total_physical_bytes",
    *   //   "rangePartitioning": {},
    *   //   "requirePartitionFilter": false,
    *   //   "schema": {},
    *   //   "selfLink": "my_selfLink",
    *   //   "snapshotDefinition": {},
    *   //   "streamingBuffer": {},
    *   //   "tableReference": {},
    *   //   "timePartitioning": {},
    *   //   "type": "my_type",
    *   //   "view": {}
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
  def update(params: ParamsResourceTablesUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceTablesUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
