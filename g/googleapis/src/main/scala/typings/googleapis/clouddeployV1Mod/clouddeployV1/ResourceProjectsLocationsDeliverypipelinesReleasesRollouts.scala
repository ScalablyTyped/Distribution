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

@JSImport("googleapis/build/src/apis/clouddeploy/v1", "clouddeploy_v1.Resource$Projects$Locations$Deliverypipelines$Releases$Rollouts")
@js.native
open class ResourceProjectsLocationsDeliverypipelinesReleasesRollouts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def approve(): GaxiosPromise[SchemaApproveRolloutResponse] = js.native
  def approve(callback: BodyResponseCallback[SchemaApproveRolloutResponse]): Unit = js.native
  def approve(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApproveRolloutResponse] = js.native
  def approve(params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesRolloutsApprove): GaxiosPromise[SchemaApproveRolloutResponse] = js.native
  def approve(
    params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesRolloutsApprove,
    callback: BodyResponseCallback[SchemaApproveRolloutResponse]
  ): Unit = js.native
  def approve(
    params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesRolloutsApprove,
    options: BodyResponseCallback[Readable | SchemaApproveRolloutResponse],
    callback: BodyResponseCallback[Readable | SchemaApproveRolloutResponse]
  ): Unit = js.native
  def approve(
    params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesRolloutsApprove,
    options: MethodOptions
  ): GaxiosPromise[SchemaApproveRolloutResponse] = js.native
  def approve(
    params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesRolloutsApprove,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApproveRolloutResponse]
  ): Unit = js.native
  /**
    * Approves a Rollout.
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
    *     await clouddeploy.projects.locations.deliveryPipelines.releases.rollouts.approve(
    *       {
    *         // Required. Name of the Rollout. Format is projects/{project\}/locations/{location\}/deliveryPipelines/{deliveryPipeline\}/ releases/{release\}/rollouts/{rollout\}.
    *         name: 'projects/my-project/locations/my-location/deliveryPipelines/my-deliveryPipeline/releases/my-release/rollouts/my-rollout',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "approved": false
    *           // }
    *         },
    *       }
    *     );
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
  def approve(
    params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesRolloutsApprove,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def approve(
    params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesRolloutsApprove,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesRolloutsCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesRolloutsCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesRolloutsCreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesRolloutsCreate,
    options: MethodOptions
  ): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesRolloutsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Creates a new Rollout in a given project and location.
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
    *     await clouddeploy.projects.locations.deliveryPipelines.releases.rollouts.create(
    *       {
    *         // Required. The parent collection in which the `Rollout` should be created. Format should be projects/{project_id\}/locations/{location_name\}/deliveryPipelines/{pipeline_name\}/releases/{release_name\}.
    *         parent:
    *           'projects/my-project/locations/my-location/deliveryPipelines/my-deliveryPipeline/releases/my-release',
    *         // Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    *         requestId: 'placeholder-value',
    *         // Required. ID of the `Rollout`.
    *         rolloutId: 'placeholder-value',
    *         // Optional. If set to true, the request is validated and the user is provided with an expected result, but no actual change is made.
    *         validateOnly: 'placeholder-value',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "annotations": {},
    *           //   "approvalState": "my_approvalState",
    *           //   "approveTime": "my_approveTime",
    *           //   "createTime": "my_createTime",
    *           //   "deployEndTime": "my_deployEndTime",
    *           //   "deployFailureCause": "my_deployFailureCause",
    *           //   "deployStartTime": "my_deployStartTime",
    *           //   "deployingBuild": "my_deployingBuild",
    *           //   "description": "my_description",
    *           //   "enqueueTime": "my_enqueueTime",
    *           //   "etag": "my_etag",
    *           //   "failureReason": "my_failureReason",
    *           //   "labels": {},
    *           //   "name": "my_name",
    *           //   "state": "my_state",
    *           //   "targetId": "my_targetId",
    *           //   "uid": "my_uid"
    *           // }
    *         },
    *       }
    *     );
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
    params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesRolloutsCreate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesRolloutsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaRollout] = js.native
  def get(callback: BodyResponseCallback[SchemaRollout]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRollout] = js.native
  def get(params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesRolloutsGet): GaxiosPromise[SchemaRollout] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesRolloutsGet,
    callback: BodyResponseCallback[SchemaRollout]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesRolloutsGet,
    options: BodyResponseCallback[Readable | SchemaRollout],
    callback: BodyResponseCallback[Readable | SchemaRollout]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesRolloutsGet,
    options: MethodOptions
  ): GaxiosPromise[SchemaRollout] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesRolloutsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRollout]
  ): Unit = js.native
  /**
    * Gets details of a single Rollout.
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
    *     await clouddeploy.projects.locations.deliveryPipelines.releases.rollouts.get(
    *       {
    *         // Required. Name of the `Rollout`. Format must be projects/{project_id\}/locations/{location_name\}/deliveryPipelines/{pipeline_name\}/releases/{release_name\}/rollouts/{rollout_name\}.
    *         name: 'projects/my-project/locations/my-location/deliveryPipelines/my-deliveryPipeline/releases/my-release/rollouts/my-rollout',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "annotations": {},
    *   //   "approvalState": "my_approvalState",
    *   //   "approveTime": "my_approveTime",
    *   //   "createTime": "my_createTime",
    *   //   "deployEndTime": "my_deployEndTime",
    *   //   "deployFailureCause": "my_deployFailureCause",
    *   //   "deployStartTime": "my_deployStartTime",
    *   //   "deployingBuild": "my_deployingBuild",
    *   //   "description": "my_description",
    *   //   "enqueueTime": "my_enqueueTime",
    *   //   "etag": "my_etag",
    *   //   "failureReason": "my_failureReason",
    *   //   "labels": {},
    *   //   "name": "my_name",
    *   //   "state": "my_state",
    *   //   "targetId": "my_targetId",
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
  def get(
    params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesRolloutsGet,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesRolloutsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListRolloutsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListRolloutsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListRolloutsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesRolloutsList): GaxiosPromise[SchemaListRolloutsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesRolloutsList,
    callback: BodyResponseCallback[SchemaListRolloutsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesRolloutsList,
    options: BodyResponseCallback[Readable | SchemaListRolloutsResponse],
    callback: BodyResponseCallback[Readable | SchemaListRolloutsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesRolloutsList,
    options: MethodOptions
  ): GaxiosPromise[SchemaListRolloutsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesRolloutsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListRolloutsResponse]
  ): Unit = js.native
  /**
    * Lists Rollouts in a given project and location.
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
    *     await clouddeploy.projects.locations.deliveryPipelines.releases.rollouts.list(
    *       {
    *         // Optional. Filter rollouts to be returned. See https://google.aip.dev/160 for more details.
    *         filter: 'placeholder-value',
    *         // Optional. Field to sort by. See https://google.aip.dev/132#ordering for more details.
    *         orderBy: 'placeholder-value',
    *         // Optional. The maximum number of `Rollout` objects to return. The service may return fewer than this value. If unspecified, at most 50 `Rollout` objects will be returned. The maximum value is 1000; values above 1000 will be set to 1000.
    *         pageSize: 'placeholder-value',
    *         // Optional. A page token, received from a previous `ListRollouts` call. Provide this to retrieve the subsequent page. When paginating, all other provided parameters match the call that provided the page token.
    *         pageToken: 'placeholder-value',
    *         // Required. The `Release` which owns this collection of `Rollout` objects.
    *         parent:
    *           'projects/my-project/locations/my-location/deliveryPipelines/my-deliveryPipeline/releases/my-release',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "rollouts": [],
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
  def list(
    params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesRolloutsList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDeliverypipelinesReleasesRolloutsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
