package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudbuild/v1", "cloudbuild_v1.Resource$Projects$Locations$Workerpools")
@js.native
open class ResourceProjectsLocationsWorkerpools protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsLocationsWorkerpoolsCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsWorkerpoolsCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsWorkerpoolsCreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsWorkerpoolsCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsWorkerpoolsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Creates a `WorkerPool`.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudbuild.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudbuild = google.cloudbuild('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudbuild.projects.locations.workerPools.create({
    *     // Required. The parent resource where this worker pool will be created. Format: `projects/{project\}/locations/{location\}`.
    *     parent: 'projects/my-project/locations/my-location',
    *     // If set, validate the request and preview the response, but do not actually post it.
    *     validateOnly: 'placeholder-value',
    *     // Required. Immutable. The ID to use for the `WorkerPool`, which will become the final component of the resource name. This value should be 1-63 characters, and valid characters are /a-z-/.
    *     workerPoolId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "annotations": {},
    *       //   "createTime": "my_createTime",
    *       //   "deleteTime": "my_deleteTime",
    *       //   "displayName": "my_displayName",
    *       //   "etag": "my_etag",
    *       //   "name": "my_name",
    *       //   "privatePoolV1Config": {},
    *       //   "state": "my_state",
    *       //   "uid": "my_uid",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def create(params: ParamsResourceProjectsLocationsWorkerpoolsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsWorkerpoolsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceProjectsLocationsWorkerpoolsDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsWorkerpoolsDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsWorkerpoolsDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsWorkerpoolsDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsWorkerpoolsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Deletes a `WorkerPool`.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudbuild.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudbuild = google.cloudbuild('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudbuild.projects.locations.workerPools.delete({
    *     // If set to true, and the `WorkerPool` is not found, the request will succeed but no action will be taken on the server.
    *     allowMissing: 'placeholder-value',
    *     // Optional. If provided, it must match the server's etag on the workerpool for the request to be processed.
    *     etag: 'placeholder-value',
    *     // Required. The name of the `WorkerPool` to delete. Format: `projects/{project\}/locations/{location\}/workerPools/{workerPool\}`.
    *     name: 'projects/my-project/locations/my-location/workerPools/my-workerPool',
    *     // If set, validate the request and preview the response, but do not actually post it.
    *     validateOnly: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def delete(params: ParamsResourceProjectsLocationsWorkerpoolsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsWorkerpoolsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaWorkerPool] = js.native
  def get(callback: BodyResponseCallback[SchemaWorkerPool]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWorkerPool] = js.native
  def get(params: ParamsResourceProjectsLocationsWorkerpoolsGet): GaxiosPromise[SchemaWorkerPool] = js.native
  def get(
    params: ParamsResourceProjectsLocationsWorkerpoolsGet,
    callback: BodyResponseCallback[SchemaWorkerPool]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsWorkerpoolsGet,
    options: BodyResponseCallback[Readable | SchemaWorkerPool],
    callback: BodyResponseCallback[Readable | SchemaWorkerPool]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsWorkerpoolsGet, options: MethodOptions): GaxiosPromise[SchemaWorkerPool] = js.native
  def get(
    params: ParamsResourceProjectsLocationsWorkerpoolsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWorkerPool]
  ): Unit = js.native
  /**
    * Returns details of a `WorkerPool`.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudbuild.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudbuild = google.cloudbuild('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudbuild.projects.locations.workerPools.get({
    *     // Required. The name of the `WorkerPool` to retrieve. Format: `projects/{project\}/locations/{location\}/workerPools/{workerPool\}`.
    *     name: 'projects/my-project/locations/my-location/workerPools/my-workerPool',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "annotations": {},
    *   //   "createTime": "my_createTime",
    *   //   "deleteTime": "my_deleteTime",
    *   //   "displayName": "my_displayName",
    *   //   "etag": "my_etag",
    *   //   "name": "my_name",
    *   //   "privatePoolV1Config": {},
    *   //   "state": "my_state",
    *   //   "uid": "my_uid",
    *   //   "updateTime": "my_updateTime"
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
  def get(params: ParamsResourceProjectsLocationsWorkerpoolsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsWorkerpoolsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListWorkerPoolsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListWorkerPoolsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListWorkerPoolsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsWorkerpoolsList): GaxiosPromise[SchemaListWorkerPoolsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsWorkerpoolsList,
    callback: BodyResponseCallback[SchemaListWorkerPoolsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsWorkerpoolsList,
    options: BodyResponseCallback[Readable | SchemaListWorkerPoolsResponse],
    callback: BodyResponseCallback[Readable | SchemaListWorkerPoolsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsWorkerpoolsList, options: MethodOptions): GaxiosPromise[SchemaListWorkerPoolsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsWorkerpoolsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListWorkerPoolsResponse]
  ): Unit = js.native
  /**
    * Lists `WorkerPool`s.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudbuild.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudbuild = google.cloudbuild('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudbuild.projects.locations.workerPools.list({
    *     // The maximum number of `WorkerPool`s to return. The service may return fewer than this value. If omitted, the server will use a sensible default.
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous `ListWorkerPools` call. Provide this to retrieve the subsequent page.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent of the collection of `WorkerPools`. Format: `projects/{project\}/locations/{location\}`.
    *     parent: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "workerPools": []
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
  def list(params: ParamsResourceProjectsLocationsWorkerpoolsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsWorkerpoolsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceProjectsLocationsWorkerpoolsPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsWorkerpoolsPatch,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsWorkerpoolsPatch,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsWorkerpoolsPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsWorkerpoolsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Updates a `WorkerPool`.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudbuild.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudbuild = google.cloudbuild('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudbuild.projects.locations.workerPools.patch({
    *     // Output only. The resource name of the `WorkerPool`, with format `projects/{project\}/locations/{location\}/workerPools/{worker_pool\}`. The value of `{worker_pool\}` is provided by `worker_pool_id` in `CreateWorkerPool` request and the value of `{location\}` is determined by the endpoint accessed.
    *     name: 'projects/my-project/locations/my-location/workerPools/my-workerPool',
    *     // A mask specifying which fields in `worker_pool` to update.
    *     updateMask: 'placeholder-value',
    *     // If set, validate the request and preview the response, but do not actually post it.
    *     validateOnly: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "annotations": {},
    *       //   "createTime": "my_createTime",
    *       //   "deleteTime": "my_deleteTime",
    *       //   "displayName": "my_displayName",
    *       //   "etag": "my_etag",
    *       //   "name": "my_name",
    *       //   "privatePoolV1Config": {},
    *       //   "state": "my_state",
    *       //   "uid": "my_uid",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def patch(params: ParamsResourceProjectsLocationsWorkerpoolsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsWorkerpoolsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
