package typings.googleapis.cloudbuildV1alpha1Mod.cloudbuildV1alpha1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudbuild/v1alpha1", "cloudbuild_v1alpha1.Resource$Projects$Workerpools")
@js.native
open class ResourceProjectsWorkerpools protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaWorkerPool] = js.native
  def create(callback: BodyResponseCallback[SchemaWorkerPool]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWorkerPool] = js.native
  def create(params: ParamsResourceProjectsWorkerpoolsCreate): GaxiosPromise[SchemaWorkerPool] = js.native
  def create(params: ParamsResourceProjectsWorkerpoolsCreate, callback: BodyResponseCallback[SchemaWorkerPool]): Unit = js.native
  def create(
    params: ParamsResourceProjectsWorkerpoolsCreate,
    options: BodyResponseCallback[Readable | SchemaWorkerPool],
    callback: BodyResponseCallback[Readable | SchemaWorkerPool]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsWorkerpoolsCreate, options: MethodOptions): GaxiosPromise[SchemaWorkerPool] = js.native
  def create(
    params: ParamsResourceProjectsWorkerpoolsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWorkerPool]
  ): Unit = js.native
  /**
    * Creates a `WorkerPool` to run the builds, and returns the new worker pool.
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
    * const cloudbuild = google.cloudbuild('v1alpha1');
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
    *   const res = await cloudbuild.projects.workerPools.create({
    *     // ID of the parent project.
    *     parent: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "deleteTime": "my_deleteTime",
    *       //   "name": "my_name",
    *       //   "projectId": "my_projectId",
    *       //   "regions": [],
    *       //   "serviceAccountEmail": "my_serviceAccountEmail",
    *       //   "status": "my_status",
    *       //   "updateTime": "my_updateTime",
    *       //   "workerConfig": {},
    *       //   "workerCount": "my_workerCount"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "deleteTime": "my_deleteTime",
    *   //   "name": "my_name",
    *   //   "projectId": "my_projectId",
    *   //   "regions": [],
    *   //   "serviceAccountEmail": "my_serviceAccountEmail",
    *   //   "status": "my_status",
    *   //   "updateTime": "my_updateTime",
    *   //   "workerConfig": {},
    *   //   "workerCount": "my_workerCount"
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
  def create(params: ParamsResourceProjectsWorkerpoolsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsWorkerpoolsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsWorkerpoolsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsWorkerpoolsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsWorkerpoolsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsWorkerpoolsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsWorkerpoolsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a `WorkerPool` by its project ID and WorkerPool name.
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
    * const cloudbuild = google.cloudbuild('v1alpha1');
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
    *   const res = await cloudbuild.projects.workerPools.delete({
    *     // The field will contain name of the resource requested, for example: "projects/project-1/workerPools/workerpool-name"
    *     name: 'projects/my-project/workerPools/my-workerPool',
    *   });
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
  def delete(params: ParamsResourceProjectsWorkerpoolsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsWorkerpoolsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaWorkerPool] = js.native
  def get(callback: BodyResponseCallback[SchemaWorkerPool]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWorkerPool] = js.native
  def get(params: ParamsResourceProjectsWorkerpoolsGet): GaxiosPromise[SchemaWorkerPool] = js.native
  def get(params: ParamsResourceProjectsWorkerpoolsGet, callback: BodyResponseCallback[SchemaWorkerPool]): Unit = js.native
  def get(
    params: ParamsResourceProjectsWorkerpoolsGet,
    options: BodyResponseCallback[Readable | SchemaWorkerPool],
    callback: BodyResponseCallback[Readable | SchemaWorkerPool]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsWorkerpoolsGet, options: MethodOptions): GaxiosPromise[SchemaWorkerPool] = js.native
  def get(
    params: ParamsResourceProjectsWorkerpoolsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWorkerPool]
  ): Unit = js.native
  /**
    * Returns information about a `WorkerPool`.
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
    * const cloudbuild = google.cloudbuild('v1alpha1');
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
    *   const res = await cloudbuild.projects.workerPools.get({
    *     // The field will contain name of the resource requested, for example: "projects/project-1/workerPools/workerpool-name"
    *     name: 'projects/my-project/workerPools/my-workerPool',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "deleteTime": "my_deleteTime",
    *   //   "name": "my_name",
    *   //   "projectId": "my_projectId",
    *   //   "regions": [],
    *   //   "serviceAccountEmail": "my_serviceAccountEmail",
    *   //   "status": "my_status",
    *   //   "updateTime": "my_updateTime",
    *   //   "workerConfig": {},
    *   //   "workerCount": "my_workerCount"
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
  def get(params: ParamsResourceProjectsWorkerpoolsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsWorkerpoolsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListWorkerPoolsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListWorkerPoolsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListWorkerPoolsResponse] = js.native
  def list(params: ParamsResourceProjectsWorkerpoolsList): GaxiosPromise[SchemaListWorkerPoolsResponse] = js.native
  def list(
    params: ParamsResourceProjectsWorkerpoolsList,
    callback: BodyResponseCallback[SchemaListWorkerPoolsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsWorkerpoolsList,
    options: BodyResponseCallback[Readable | SchemaListWorkerPoolsResponse],
    callback: BodyResponseCallback[Readable | SchemaListWorkerPoolsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsWorkerpoolsList, options: MethodOptions): GaxiosPromise[SchemaListWorkerPoolsResponse] = js.native
  def list(
    params: ParamsResourceProjectsWorkerpoolsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListWorkerPoolsResponse]
  ): Unit = js.native
  /**
    * List project's `WorkerPool`s.
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
    * const cloudbuild = google.cloudbuild('v1alpha1');
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
    *   const res = await cloudbuild.projects.workerPools.list({
    *     // ID of the parent project.
    *     parent: 'projects/my-project',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
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
  def list(params: ParamsResourceProjectsWorkerpoolsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsWorkerpoolsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaWorkerPool] = js.native
  def patch(callback: BodyResponseCallback[SchemaWorkerPool]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWorkerPool] = js.native
  def patch(params: ParamsResourceProjectsWorkerpoolsPatch): GaxiosPromise[SchemaWorkerPool] = js.native
  def patch(params: ParamsResourceProjectsWorkerpoolsPatch, callback: BodyResponseCallback[SchemaWorkerPool]): Unit = js.native
  def patch(
    params: ParamsResourceProjectsWorkerpoolsPatch,
    options: BodyResponseCallback[Readable | SchemaWorkerPool],
    callback: BodyResponseCallback[Readable | SchemaWorkerPool]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsWorkerpoolsPatch, options: MethodOptions): GaxiosPromise[SchemaWorkerPool] = js.native
  def patch(
    params: ParamsResourceProjectsWorkerpoolsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWorkerPool]
  ): Unit = js.native
  /**
    * Update a `WorkerPool`.
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
    * const cloudbuild = google.cloudbuild('v1alpha1');
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
    *   const res = await cloudbuild.projects.workerPools.patch({
    *     // The field will contain name of the resource requested, for example: "projects/project-1/workerPools/workerpool-name"
    *     name: 'projects/my-project/workerPools/my-workerPool',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "deleteTime": "my_deleteTime",
    *       //   "name": "my_name",
    *       //   "projectId": "my_projectId",
    *       //   "regions": [],
    *       //   "serviceAccountEmail": "my_serviceAccountEmail",
    *       //   "status": "my_status",
    *       //   "updateTime": "my_updateTime",
    *       //   "workerConfig": {},
    *       //   "workerCount": "my_workerCount"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "deleteTime": "my_deleteTime",
    *   //   "name": "my_name",
    *   //   "projectId": "my_projectId",
    *   //   "regions": [],
    *   //   "serviceAccountEmail": "my_serviceAccountEmail",
    *   //   "status": "my_status",
    *   //   "updateTime": "my_updateTime",
    *   //   "workerConfig": {},
    *   //   "workerCount": "my_workerCount"
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
  def patch(params: ParamsResourceProjectsWorkerpoolsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsWorkerpoolsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
