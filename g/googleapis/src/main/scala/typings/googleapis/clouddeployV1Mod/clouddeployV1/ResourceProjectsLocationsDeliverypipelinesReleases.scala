package typings.googleapis.clouddeployV1Mod.clouddeployV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/clouddeploy/v1", "clouddeploy_v1.Resource$Projects$Locations$Deliverypipelines$Releases")
@js.native
open class ResourceProjectsLocationsDeliverypipelinesReleases protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def abandon(): GaxiosPromise[SchemaAbandonReleaseResponse] = js.native
  def abandon(callback: BodyResponseCallback[SchemaAbandonReleaseResponse]): Unit = js.native
  def abandon(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAbandonReleaseResponse] = js.native
  def abandon(params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesAbandon): GaxiosPromise[SchemaAbandonReleaseResponse] = js.native
  def abandon(
    params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesAbandon,
    callback: BodyResponseCallback[SchemaAbandonReleaseResponse]
  ): Unit = js.native
  def abandon(
    params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesAbandon,
    options: BodyResponseCallback[Readable | SchemaAbandonReleaseResponse],
    callback: BodyResponseCallback[Readable | SchemaAbandonReleaseResponse]
  ): Unit = js.native
  def abandon(params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesAbandon, options: MethodOptions): GaxiosPromise[SchemaAbandonReleaseResponse] = js.native
  def abandon(
    params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesAbandon,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAbandonReleaseResponse]
  ): Unit = js.native
  /**
    * Abandons a Release in the Delivery Pipeline.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/clouddeploy.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const clouddeploy = google.clouddeploy('v1');
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
    *   const res =
    *     await clouddeploy.projects.locations.deliveryPipelines.releases.abandon({
    *       // Required. Name of the Release. Format is projects/{project\}/locations/{location\}/deliveryPipelines/{deliveryPipeline\}/ releases/{release\}.
    *       name: 'projects/my-project/locations/my-location/deliveryPipelines/my-deliveryPipeline/releases/my-release',
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
  def abandon(
    params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesAbandon,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def abandon(
    params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesAbandon,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesCreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Creates a new Release in a given project and location.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/clouddeploy.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const clouddeploy = google.clouddeploy('v1');
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
    *   const res =
    *     await clouddeploy.projects.locations.deliveryPipelines.releases.create({
    *       // Required. The parent collection in which the `Release` should be created. Format should be projects/{project_id\}/locations/{location_name\}/deliveryPipelines/{pipeline_name\}.
    *       parent:
    *         'projects/my-project/locations/my-location/deliveryPipelines/my-deliveryPipeline',
    *       // Required. ID of the `Release`.
    *       releaseId: 'placeholder-value',
    *       // Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    *       requestId: 'placeholder-value',
    *       // Optional. If set to true, the request is validated and the user is provided with an expected result, but no actual change is made.
    *       validateOnly: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "abandoned": false,
    *         //   "annotations": {},
    *         //   "buildArtifacts": [],
    *         //   "createTime": "my_createTime",
    *         //   "deliveryPipelineSnapshot": {},
    *         //   "description": "my_description",
    *         //   "etag": "my_etag",
    *         //   "labels": {},
    *         //   "name": "my_name",
    *         //   "renderEndTime": "my_renderEndTime",
    *         //   "renderStartTime": "my_renderStartTime",
    *         //   "renderState": "my_renderState",
    *         //   "skaffoldConfigPath": "my_skaffoldConfigPath",
    *         //   "skaffoldConfigUri": "my_skaffoldConfigUri",
    *         //   "skaffoldVersion": "my_skaffoldVersion",
    *         //   "targetArtifacts": {},
    *         //   "targetRenders": {},
    *         //   "targetSnapshots": [],
    *         //   "uid": "my_uid"
    *         // }
    *       },
    *     });
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
  def create(
    params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesCreate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaRelease] = js.native
  def get(callback: BodyResponseCallback[SchemaRelease]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRelease] = js.native
  def get(params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesGet): GaxiosPromise[SchemaRelease] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesGet,
    callback: BodyResponseCallback[SchemaRelease]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesGet,
    options: BodyResponseCallback[Readable | SchemaRelease],
    callback: BodyResponseCallback[Readable | SchemaRelease]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesGet, options: MethodOptions): GaxiosPromise[SchemaRelease] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRelease]
  ): Unit = js.native
  /**
    * Gets details of a single Release.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/clouddeploy.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const clouddeploy = google.clouddeploy('v1');
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
    *   const res =
    *     await clouddeploy.projects.locations.deliveryPipelines.releases.get({
    *       // Required. Name of the `Release`. Format must be projects/{project_id\}/locations/{location_name\}/deliveryPipelines/{pipeline_name\}/releases/{release_name\}.
    *       name: 'projects/my-project/locations/my-location/deliveryPipelines/my-deliveryPipeline/releases/my-release',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "abandoned": false,
    *   //   "annotations": {},
    *   //   "buildArtifacts": [],
    *   //   "createTime": "my_createTime",
    *   //   "deliveryPipelineSnapshot": {},
    *   //   "description": "my_description",
    *   //   "etag": "my_etag",
    *   //   "labels": {},
    *   //   "name": "my_name",
    *   //   "renderEndTime": "my_renderEndTime",
    *   //   "renderStartTime": "my_renderStartTime",
    *   //   "renderState": "my_renderState",
    *   //   "skaffoldConfigPath": "my_skaffoldConfigPath",
    *   //   "skaffoldConfigUri": "my_skaffoldConfigUri",
    *   //   "skaffoldVersion": "my_skaffoldVersion",
    *   //   "targetArtifacts": {},
    *   //   "targetRenders": {},
    *   //   "targetSnapshots": [],
    *   //   "uid": "my_uid"
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
  def get(params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListReleasesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListReleasesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListReleasesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesList): GaxiosPromise[SchemaListReleasesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesList,
    callback: BodyResponseCallback[SchemaListReleasesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesList,
    options: BodyResponseCallback[Readable | SchemaListReleasesResponse],
    callback: BodyResponseCallback[Readable | SchemaListReleasesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesList, options: MethodOptions): GaxiosPromise[SchemaListReleasesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListReleasesResponse]
  ): Unit = js.native
  /**
    * Lists Releases in a given project and location.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/clouddeploy.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const clouddeploy = google.clouddeploy('v1');
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
    *   const res =
    *     await clouddeploy.projects.locations.deliveryPipelines.releases.list({
    *       // Optional. Filter releases to be returned. See https://google.aip.dev/160 for more details.
    *       filter: 'placeholder-value',
    *       // Optional. Field to sort by. See https://google.aip.dev/132#ordering for more details.
    *       orderBy: 'placeholder-value',
    *       // Optional. The maximum number of `Release` objects to return. The service may return fewer than this value. If unspecified, at most 50 `Release` objects will be returned. The maximum value is 1000; values above 1000 will be set to 1000.
    *       pageSize: 'placeholder-value',
    *       // Optional. A page token, received from a previous `ListReleases` call. Provide this to retrieve the subsequent page. When paginating, all other provided parameters match the call that provided the page token.
    *       pageToken: 'placeholder-value',
    *       // Required. The `DeliveryPipeline` which owns this collection of `Release` objects.
    *       parent:
    *         'projects/my-project/locations/my-location/deliveryPipelines/my-deliveryPipeline',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "releases": [],
    *   //   "unreachable": []
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
  def list(params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var rollouts: ResourceProjectsLocationsDeliverypipelinesReleasesRollouts = js.native
}
