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

@JSImport("googleapis/build/src/apis/bigquery/v2", "bigquery_v2.Resource$Routines")
@js.native
open class ResourceRoutines protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceRoutinesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceRoutinesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceRoutinesDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceRoutinesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceRoutinesDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * Deletes the routine specified by routineId from the dataset.
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
    *   const res = await bigquery.routines.delete({
    *     // Required. Dataset ID of the routine to delete
    *     datasetId: '[^/]+',
    *     // Required. Project ID of the routine to delete
    *     projectId: '[^/]+',
    *     // Required. Routine ID of the routine to delete
    *     routineId: '[^/]+',
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
  def delete(params: ParamsResourceRoutinesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceRoutinesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaRoutine] = js.native
  def get(callback: BodyResponseCallback[SchemaRoutine]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRoutine] = js.native
  def get(params: ParamsResourceRoutinesGet): GaxiosPromise[SchemaRoutine] = js.native
  def get(params: ParamsResourceRoutinesGet, callback: BodyResponseCallback[SchemaRoutine]): Unit = js.native
  def get(
    params: ParamsResourceRoutinesGet,
    options: BodyResponseCallback[Readable | SchemaRoutine],
    callback: BodyResponseCallback[Readable | SchemaRoutine]
  ): Unit = js.native
  def get(params: ParamsResourceRoutinesGet, options: MethodOptions): GaxiosPromise[SchemaRoutine] = js.native
  def get(
    params: ParamsResourceRoutinesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRoutine]
  ): Unit = js.native
  /**
    * Gets the specified routine resource by routine ID.
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
    *   const res = await bigquery.routines.get({
    *     // Required. Dataset ID of the requested routine
    *     datasetId: '[^/]+',
    *     // Required. Project ID of the requested routine
    *     projectId: '[^/]+',
    *     // If set, only the Routine fields in the field mask are returned in the response. If unset, all Routine fields are returned.
    *     readMask: 'placeholder-value',
    *     // Required. Routine ID of the requested routine
    *     routineId: '[^/]+',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "arguments": [],
    *   //   "creationTime": "my_creationTime",
    *   //   "definitionBody": "my_definitionBody",
    *   //   "description": "my_description",
    *   //   "determinismLevel": "my_determinismLevel",
    *   //   "etag": "my_etag",
    *   //   "importedLibraries": [],
    *   //   "language": "my_language",
    *   //   "lastModifiedTime": "my_lastModifiedTime",
    *   //   "remoteFunctionOptions": {},
    *   //   "returnTableType": {},
    *   //   "returnType": {},
    *   //   "routineReference": {},
    *   //   "routineType": "my_routineType",
    *   //   "sparkOptions": {},
    *   //   "strictMode": false
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
  def get(params: ParamsResourceRoutinesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceRoutinesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaRoutine] = js.native
  def insert(callback: BodyResponseCallback[SchemaRoutine]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRoutine] = js.native
  def insert(params: ParamsResourceRoutinesInsert): GaxiosPromise[SchemaRoutine] = js.native
  def insert(params: ParamsResourceRoutinesInsert, callback: BodyResponseCallback[SchemaRoutine]): Unit = js.native
  def insert(
    params: ParamsResourceRoutinesInsert,
    options: BodyResponseCallback[Readable | SchemaRoutine],
    callback: BodyResponseCallback[Readable | SchemaRoutine]
  ): Unit = js.native
  def insert(params: ParamsResourceRoutinesInsert, options: MethodOptions): GaxiosPromise[SchemaRoutine] = js.native
  def insert(
    params: ParamsResourceRoutinesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRoutine]
  ): Unit = js.native
  /**
    * Creates a new routine in the dataset.
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
    *   const res = await bigquery.routines.insert({
    *     // Required. Dataset ID of the new routine
    *     datasetId: '[^/]+',
    *     // Required. Project ID of the new routine
    *     projectId: '[^/]+',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "arguments": [],
    *       //   "creationTime": "my_creationTime",
    *       //   "definitionBody": "my_definitionBody",
    *       //   "description": "my_description",
    *       //   "determinismLevel": "my_determinismLevel",
    *       //   "etag": "my_etag",
    *       //   "importedLibraries": [],
    *       //   "language": "my_language",
    *       //   "lastModifiedTime": "my_lastModifiedTime",
    *       //   "remoteFunctionOptions": {},
    *       //   "returnTableType": {},
    *       //   "returnType": {},
    *       //   "routineReference": {},
    *       //   "routineType": "my_routineType",
    *       //   "sparkOptions": {},
    *       //   "strictMode": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "arguments": [],
    *   //   "creationTime": "my_creationTime",
    *   //   "definitionBody": "my_definitionBody",
    *   //   "description": "my_description",
    *   //   "determinismLevel": "my_determinismLevel",
    *   //   "etag": "my_etag",
    *   //   "importedLibraries": [],
    *   //   "language": "my_language",
    *   //   "lastModifiedTime": "my_lastModifiedTime",
    *   //   "remoteFunctionOptions": {},
    *   //   "returnTableType": {},
    *   //   "returnType": {},
    *   //   "routineReference": {},
    *   //   "routineType": "my_routineType",
    *   //   "sparkOptions": {},
    *   //   "strictMode": false
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
  def insert(params: ParamsResourceRoutinesInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceRoutinesInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListRoutinesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListRoutinesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListRoutinesResponse] = js.native
  def list(params: ParamsResourceRoutinesList): GaxiosPromise[SchemaListRoutinesResponse] = js.native
  def list(params: ParamsResourceRoutinesList, callback: BodyResponseCallback[SchemaListRoutinesResponse]): Unit = js.native
  def list(
    params: ParamsResourceRoutinesList,
    options: BodyResponseCallback[Readable | SchemaListRoutinesResponse],
    callback: BodyResponseCallback[Readable | SchemaListRoutinesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceRoutinesList, options: MethodOptions): GaxiosPromise[SchemaListRoutinesResponse] = js.native
  def list(
    params: ParamsResourceRoutinesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListRoutinesResponse]
  ): Unit = js.native
  /**
    * Lists all routines in the specified dataset. Requires the READER dataset role.
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
    *   const res = await bigquery.routines.list({
    *     // Required. Dataset ID of the routines to list
    *     datasetId: '[^/]+',
    *     // If set, then only the Routines matching this filter are returned. The current supported form is either "routine_type:" or "routineType:", where is a RoutineType enum. Example: "routineType:SCALAR_FUNCTION".
    *     filter: 'placeholder-value',
    *     // The maximum number of results to return in a single response page. Leverage the page tokens to iterate through the entire collection.
    *     maxResults: 'placeholder-value',
    *     // Page token, returned by a previous call, to request the next page of results
    *     pageToken: 'placeholder-value',
    *     // Required. Project ID of the routines to list
    *     projectId: '[^/]+',
    *     // If set, then only the Routine fields in the field mask, as well as project_id, dataset_id and routine_id, are returned in the response. If unset, then the following Routine fields are returned: etag, project_id, dataset_id, routine_id, routine_type, creation_time, last_modified_time, and language.
    *     readMask: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "routines": []
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
  def list(params: ParamsResourceRoutinesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceRoutinesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaRoutine] = js.native
  def update(callback: BodyResponseCallback[SchemaRoutine]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRoutine] = js.native
  def update(params: ParamsResourceRoutinesUpdate): GaxiosPromise[SchemaRoutine] = js.native
  def update(params: ParamsResourceRoutinesUpdate, callback: BodyResponseCallback[SchemaRoutine]): Unit = js.native
  def update(
    params: ParamsResourceRoutinesUpdate,
    options: BodyResponseCallback[Readable | SchemaRoutine],
    callback: BodyResponseCallback[Readable | SchemaRoutine]
  ): Unit = js.native
  def update(params: ParamsResourceRoutinesUpdate, options: MethodOptions): GaxiosPromise[SchemaRoutine] = js.native
  def update(
    params: ParamsResourceRoutinesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRoutine]
  ): Unit = js.native
  /**
    * Updates information in an existing routine. The update method replaces the entire Routine resource.
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
    *   const res = await bigquery.routines.update({
    *     // Required. Dataset ID of the routine to update
    *     datasetId: '[^/]+',
    *     // Required. Project ID of the routine to update
    *     projectId: '[^/]+',
    *     // Required. Routine ID of the routine to update
    *     routineId: '[^/]+',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "arguments": [],
    *       //   "creationTime": "my_creationTime",
    *       //   "definitionBody": "my_definitionBody",
    *       //   "description": "my_description",
    *       //   "determinismLevel": "my_determinismLevel",
    *       //   "etag": "my_etag",
    *       //   "importedLibraries": [],
    *       //   "language": "my_language",
    *       //   "lastModifiedTime": "my_lastModifiedTime",
    *       //   "remoteFunctionOptions": {},
    *       //   "returnTableType": {},
    *       //   "returnType": {},
    *       //   "routineReference": {},
    *       //   "routineType": "my_routineType",
    *       //   "sparkOptions": {},
    *       //   "strictMode": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "arguments": [],
    *   //   "creationTime": "my_creationTime",
    *   //   "definitionBody": "my_definitionBody",
    *   //   "description": "my_description",
    *   //   "determinismLevel": "my_determinismLevel",
    *   //   "etag": "my_etag",
    *   //   "importedLibraries": [],
    *   //   "language": "my_language",
    *   //   "lastModifiedTime": "my_lastModifiedTime",
    *   //   "remoteFunctionOptions": {},
    *   //   "returnTableType": {},
    *   //   "returnType": {},
    *   //   "routineReference": {},
    *   //   "routineType": "my_routineType",
    *   //   "sparkOptions": {},
    *   //   "strictMode": false
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
  def update(params: ParamsResourceRoutinesUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceRoutinesUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
