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

@JSImport("googleapis/build/src/apis/cloudbuild/v1", "cloudbuild_v1.Resource$Projects$Locations$Builds")
@js.native
open class ResourceProjectsLocationsBuilds protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def approve(): GaxiosPromise[SchemaOperation] = js.native
  def approve(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def approve(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def approve(params: ParamsResourceProjectsLocationsBuildsApprove): GaxiosPromise[SchemaOperation] = js.native
  def approve(
    params: ParamsResourceProjectsLocationsBuildsApprove,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def approve(
    params: ParamsResourceProjectsLocationsBuildsApprove,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def approve(params: ParamsResourceProjectsLocationsBuildsApprove, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def approve(
    params: ParamsResourceProjectsLocationsBuildsApprove,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Approves or rejects a pending build. If approved, the returned LRO will be analogous to the LRO returned from a CreateBuild call. If rejected, the returned LRO will be immediately done.
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
    *   const res = await cloudbuild.projects.locations.builds.approve({
    *     // Required. Name of the target build. For example: "projects/{$project_id\}/builds/{$build_id\}"
    *     name: 'projects/my-project/locations/my-location/builds/my-build',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "approvalResult": {}
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
  def approve(params: ParamsResourceProjectsLocationsBuildsApprove, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def approve(
    params: ParamsResourceProjectsLocationsBuildsApprove,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def cancel(): GaxiosPromise[SchemaBuild] = js.native
  def cancel(callback: BodyResponseCallback[SchemaBuild]): Unit = js.native
  def cancel(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBuild] = js.native
  def cancel(params: ParamsResourceProjectsLocationsBuildsCancel): GaxiosPromise[SchemaBuild] = js.native
  def cancel(params: ParamsResourceProjectsLocationsBuildsCancel, callback: BodyResponseCallback[SchemaBuild]): Unit = js.native
  def cancel(
    params: ParamsResourceProjectsLocationsBuildsCancel,
    options: BodyResponseCallback[Readable | SchemaBuild],
    callback: BodyResponseCallback[Readable | SchemaBuild]
  ): Unit = js.native
  def cancel(params: ParamsResourceProjectsLocationsBuildsCancel, options: MethodOptions): GaxiosPromise[SchemaBuild] = js.native
  def cancel(
    params: ParamsResourceProjectsLocationsBuildsCancel,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBuild]
  ): Unit = js.native
  /**
    * Cancels a build in progress.
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
    *   const res = await cloudbuild.projects.locations.builds.cancel({
    *     // The name of the `Build` to cancel. Format: `projects/{project\}/locations/{location\}/builds/{build\}`
    *     name: 'projects/my-project/locations/my-location/builds/my-build',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "id": "my_id",
    *       //   "name": "my_name",
    *       //   "projectId": "my_projectId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "approval": {},
    *   //   "artifacts": {},
    *   //   "availableSecrets": {},
    *   //   "buildTriggerId": "my_buildTriggerId",
    *   //   "createTime": "my_createTime",
    *   //   "failureInfo": {},
    *   //   "finishTime": "my_finishTime",
    *   //   "id": "my_id",
    *   //   "images": [],
    *   //   "logUrl": "my_logUrl",
    *   //   "logsBucket": "my_logsBucket",
    *   //   "name": "my_name",
    *   //   "options": {},
    *   //   "projectId": "my_projectId",
    *   //   "queueTtl": "my_queueTtl",
    *   //   "results": {},
    *   //   "secrets": [],
    *   //   "serviceAccount": "my_serviceAccount",
    *   //   "source": {},
    *   //   "sourceProvenance": {},
    *   //   "startTime": "my_startTime",
    *   //   "status": "my_status",
    *   //   "statusDetail": "my_statusDetail",
    *   //   "steps": [],
    *   //   "substitutions": {},
    *   //   "tags": [],
    *   //   "timeout": "my_timeout",
    *   //   "timing": {},
    *   //   "warnings": []
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
  def cancel(params: ParamsResourceProjectsLocationsBuildsCancel, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def cancel(
    params: ParamsResourceProjectsLocationsBuildsCancel,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsLocationsBuildsCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsBuildsCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsBuildsCreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsBuildsCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsBuildsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Starts a build with the specified configuration. This method returns a long-running `Operation`, which includes the build ID. Pass the build ID to `GetBuild` to determine the build status (such as `SUCCESS` or `FAILURE`).
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
    *   const res = await cloudbuild.projects.locations.builds.create({
    *     // The parent resource where this build will be created. Format: `projects/{project\}/locations/{location\}`
    *     parent: 'projects/my-project/locations/my-location',
    *     // Required. ID of the project.
    *     projectId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "approval": {},
    *       //   "artifacts": {},
    *       //   "availableSecrets": {},
    *       //   "buildTriggerId": "my_buildTriggerId",
    *       //   "createTime": "my_createTime",
    *       //   "failureInfo": {},
    *       //   "finishTime": "my_finishTime",
    *       //   "id": "my_id",
    *       //   "images": [],
    *       //   "logUrl": "my_logUrl",
    *       //   "logsBucket": "my_logsBucket",
    *       //   "name": "my_name",
    *       //   "options": {},
    *       //   "projectId": "my_projectId",
    *       //   "queueTtl": "my_queueTtl",
    *       //   "results": {},
    *       //   "secrets": [],
    *       //   "serviceAccount": "my_serviceAccount",
    *       //   "source": {},
    *       //   "sourceProvenance": {},
    *       //   "startTime": "my_startTime",
    *       //   "status": "my_status",
    *       //   "statusDetail": "my_statusDetail",
    *       //   "steps": [],
    *       //   "substitutions": {},
    *       //   "tags": [],
    *       //   "timeout": "my_timeout",
    *       //   "timing": {},
    *       //   "warnings": []
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
  def create(params: ParamsResourceProjectsLocationsBuildsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsBuildsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaBuild] = js.native
  def get(callback: BodyResponseCallback[SchemaBuild]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBuild] = js.native
  def get(params: ParamsResourceProjectsLocationsBuildsGet): GaxiosPromise[SchemaBuild] = js.native
  def get(params: ParamsResourceProjectsLocationsBuildsGet, callback: BodyResponseCallback[SchemaBuild]): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsBuildsGet,
    options: BodyResponseCallback[Readable | SchemaBuild],
    callback: BodyResponseCallback[Readable | SchemaBuild]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsBuildsGet, options: MethodOptions): GaxiosPromise[SchemaBuild] = js.native
  def get(
    params: ParamsResourceProjectsLocationsBuildsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBuild]
  ): Unit = js.native
  /**
    * Returns information about a previously requested build. The `Build` that is returned includes its status (such as `SUCCESS`, `FAILURE`, or `WORKING`), and timing information.
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
    *   const res = await cloudbuild.projects.locations.builds.get({
    *     // Required. ID of the build.
    *     id: 'placeholder-value',
    *     // The name of the `Build` to retrieve. Format: `projects/{project\}/locations/{location\}/builds/{build\}`
    *     name: 'projects/my-project/locations/my-location/builds/my-build',
    *     // Required. ID of the project.
    *     projectId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "approval": {},
    *   //   "artifacts": {},
    *   //   "availableSecrets": {},
    *   //   "buildTriggerId": "my_buildTriggerId",
    *   //   "createTime": "my_createTime",
    *   //   "failureInfo": {},
    *   //   "finishTime": "my_finishTime",
    *   //   "id": "my_id",
    *   //   "images": [],
    *   //   "logUrl": "my_logUrl",
    *   //   "logsBucket": "my_logsBucket",
    *   //   "name": "my_name",
    *   //   "options": {},
    *   //   "projectId": "my_projectId",
    *   //   "queueTtl": "my_queueTtl",
    *   //   "results": {},
    *   //   "secrets": [],
    *   //   "serviceAccount": "my_serviceAccount",
    *   //   "source": {},
    *   //   "sourceProvenance": {},
    *   //   "startTime": "my_startTime",
    *   //   "status": "my_status",
    *   //   "statusDetail": "my_statusDetail",
    *   //   "steps": [],
    *   //   "substitutions": {},
    *   //   "tags": [],
    *   //   "timeout": "my_timeout",
    *   //   "timing": {},
    *   //   "warnings": []
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
  def get(params: ParamsResourceProjectsLocationsBuildsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsBuildsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListBuildsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListBuildsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListBuildsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsBuildsList): GaxiosPromise[SchemaListBuildsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsBuildsList,
    callback: BodyResponseCallback[SchemaListBuildsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsBuildsList,
    options: BodyResponseCallback[Readable | SchemaListBuildsResponse],
    callback: BodyResponseCallback[Readable | SchemaListBuildsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsBuildsList, options: MethodOptions): GaxiosPromise[SchemaListBuildsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsBuildsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListBuildsResponse]
  ): Unit = js.native
  /**
    * Lists previously requested builds. Previously requested builds may still be in-progress, or may have finished successfully or unsuccessfully.
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
    *   const res = await cloudbuild.projects.locations.builds.list({
    *     // The raw filter text to constrain the results.
    *     filter: 'placeholder-value',
    *     // Number of results to return in the list.
    *     pageSize: 'placeholder-value',
    *     // The page token for the next page of Builds. If unspecified, the first page of results is returned. If the token is rejected for any reason, INVALID_ARGUMENT will be thrown. In this case, the token should be discarded, and pagination should be restarted from the first page of results. See https://google.aip.dev/158 for more.
    *     pageToken: 'placeholder-value',
    *     // The parent of the collection of `Builds`. Format: `projects/{project\}/locations/{location\}`
    *     parent: 'projects/my-project/locations/my-location',
    *     // Required. ID of the project.
    *     projectId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "builds": [],
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
  def list(params: ParamsResourceProjectsLocationsBuildsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsBuildsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def retry(): GaxiosPromise[SchemaOperation] = js.native
  def retry(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def retry(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def retry(params: ParamsResourceProjectsLocationsBuildsRetry): GaxiosPromise[SchemaOperation] = js.native
  def retry(
    params: ParamsResourceProjectsLocationsBuildsRetry,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def retry(
    params: ParamsResourceProjectsLocationsBuildsRetry,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def retry(params: ParamsResourceProjectsLocationsBuildsRetry, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def retry(
    params: ParamsResourceProjectsLocationsBuildsRetry,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Creates a new build based on the specified build. This method creates a new build using the original build request, which may or may not result in an identical build. For triggered builds: * Triggered builds resolve to a precise revision; therefore a retry of a triggered build will result in a build that uses the same revision. For non-triggered builds that specify `RepoSource`: * If the original build built from the tip of a branch, the retried build will build from the tip of that branch, which may not be the same revision as the original build. * If the original build specified a commit sha or revision ID, the retried build will use the identical source. For builds that specify `StorageSource`: * If the original build pulled source from Google Cloud Storage without specifying the generation of the object, the new build will use the current object, which may be different from the original build source. * If the original build pulled source from Cloud Storage and specified the generation of the object, the new build will attempt to use the same object, which may or may not be available depending on the bucket's lifecycle management settings.
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
    *   const res = await cloudbuild.projects.locations.builds.retry({
    *     // The name of the `Build` to retry. Format: `projects/{project\}/locations/{location\}/builds/{build\}`
    *     name: 'projects/my-project/locations/my-location/builds/my-build',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "id": "my_id",
    *       //   "name": "my_name",
    *       //   "projectId": "my_projectId"
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
  def retry(params: ParamsResourceProjectsLocationsBuildsRetry, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def retry(
    params: ParamsResourceProjectsLocationsBuildsRetry,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
