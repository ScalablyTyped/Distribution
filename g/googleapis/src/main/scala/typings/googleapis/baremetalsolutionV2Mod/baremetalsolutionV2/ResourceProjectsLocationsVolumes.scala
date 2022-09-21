package typings.googleapis.baremetalsolutionV2Mod.baremetalsolutionV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/baremetalsolution/v2", "baremetalsolution_v2.Resource$Projects$Locations$Volumes")
@js.native
open class ResourceProjectsLocationsVolumes protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaVolume] = js.native
  def get(callback: BodyResponseCallback[SchemaVolume]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVolume] = js.native
  def get(params: ParamsResourceProjectsLocationsVolumesGet): GaxiosPromise[SchemaVolume] = js.native
  def get(params: ParamsResourceProjectsLocationsVolumesGet, callback: BodyResponseCallback[SchemaVolume]): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsVolumesGet,
    options: BodyResponseCallback[Readable | SchemaVolume],
    callback: BodyResponseCallback[Readable | SchemaVolume]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsVolumesGet, options: MethodOptions): GaxiosPromise[SchemaVolume] = js.native
  def get(
    params: ParamsResourceProjectsLocationsVolumesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVolume]
  ): Unit = js.native
  /**
    * Get details of a single storage volume.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/baremetalsolution.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const baremetalsolution = google.baremetalsolution('v2');
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
    *   const res = await baremetalsolution.projects.locations.volumes.get({
    *     // Required. Name of the resource.
    *     name: 'projects/my-project/locations/my-location/volumes/my-volume',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "autoGrownSizeGib": "my_autoGrownSizeGib",
    *   //   "bootVolume": false,
    *   //   "currentSizeGib": "my_currentSizeGib",
    *   //   "emergencySizeGib": "my_emergencySizeGib",
    *   //   "id": "my_id",
    *   //   "labels": {},
    *   //   "maxSizeGib": "my_maxSizeGib",
    *   //   "name": "my_name",
    *   //   "originallyRequestedSizeGib": "my_originallyRequestedSizeGib",
    *   //   "pod": "my_pod",
    *   //   "protocol": "my_protocol",
    *   //   "remainingSpaceGib": "my_remainingSpaceGib",
    *   //   "requestedSizeGib": "my_requestedSizeGib",
    *   //   "snapshotAutoDeleteBehavior": "my_snapshotAutoDeleteBehavior",
    *   //   "snapshotEnabled": false,
    *   //   "snapshotReservationDetail": {},
    *   //   "snapshotSchedulePolicy": "my_snapshotSchedulePolicy",
    *   //   "state": "my_state",
    *   //   "storageType": "my_storageType"
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
  def get(params: ParamsResourceProjectsLocationsVolumesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsVolumesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListVolumesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListVolumesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListVolumesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsVolumesList): GaxiosPromise[SchemaListVolumesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsVolumesList,
    callback: BodyResponseCallback[SchemaListVolumesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsVolumesList,
    options: BodyResponseCallback[Readable | SchemaListVolumesResponse],
    callback: BodyResponseCallback[Readable | SchemaListVolumesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsVolumesList, options: MethodOptions): GaxiosPromise[SchemaListVolumesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsVolumesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListVolumesResponse]
  ): Unit = js.native
  /**
    * List storage volumes in a given project and location.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/baremetalsolution.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const baremetalsolution = google.baremetalsolution('v2');
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
    *   const res = await baremetalsolution.projects.locations.volumes.list({
    *     // List filter.
    *     filter: 'placeholder-value',
    *     // Requested page size. The server might return fewer items than requested. If unspecified, server will pick an appropriate default.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results from the server.
    *     pageToken: 'placeholder-value',
    *     // Required. Parent value for ListVolumesRequest.
    *     parent: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "unreachable": [],
    *   //   "volumes": []
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
  def list(params: ParamsResourceProjectsLocationsVolumesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsVolumesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var luns: ResourceProjectsLocationsVolumesLuns = js.native
  
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceProjectsLocationsVolumesPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsVolumesPatch,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsVolumesPatch,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsVolumesPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsVolumesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Update details of a single storage volume.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/baremetalsolution.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const baremetalsolution = google.baremetalsolution('v2');
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
    *   const res = await baremetalsolution.projects.locations.volumes.patch({
    *     // Output only. The resource name of this `Volume`. Resource names are schemeless URIs that follow the conventions in https://cloud.google.com/apis/design/resource_names. Format: `projects/{project\}/locations/{location\}/volumes/{volume\}`
    *     name: 'projects/my-project/locations/my-location/volumes/my-volume',
    *     // The list of fields to update. The only currently supported fields are: 'labels'
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "autoGrownSizeGib": "my_autoGrownSizeGib",
    *       //   "bootVolume": false,
    *       //   "currentSizeGib": "my_currentSizeGib",
    *       //   "emergencySizeGib": "my_emergencySizeGib",
    *       //   "id": "my_id",
    *       //   "labels": {},
    *       //   "maxSizeGib": "my_maxSizeGib",
    *       //   "name": "my_name",
    *       //   "originallyRequestedSizeGib": "my_originallyRequestedSizeGib",
    *       //   "pod": "my_pod",
    *       //   "protocol": "my_protocol",
    *       //   "remainingSpaceGib": "my_remainingSpaceGib",
    *       //   "requestedSizeGib": "my_requestedSizeGib",
    *       //   "snapshotAutoDeleteBehavior": "my_snapshotAutoDeleteBehavior",
    *       //   "snapshotEnabled": false,
    *       //   "snapshotReservationDetail": {},
    *       //   "snapshotSchedulePolicy": "my_snapshotSchedulePolicy",
    *       //   "state": "my_state",
    *       //   "storageType": "my_storageType"
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
  def patch(params: ParamsResourceProjectsLocationsVolumesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsVolumesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def resize(): GaxiosPromise[SchemaOperation] = js.native
  def resize(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def resize(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def resize(params: ParamsResourceProjectsLocationsVolumesResize): GaxiosPromise[SchemaOperation] = js.native
  def resize(
    params: ParamsResourceProjectsLocationsVolumesResize,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def resize(
    params: ParamsResourceProjectsLocationsVolumesResize,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def resize(params: ParamsResourceProjectsLocationsVolumesResize, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def resize(
    params: ParamsResourceProjectsLocationsVolumesResize,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Emergency Volume resize.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/baremetalsolution.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const baremetalsolution = google.baremetalsolution('v2');
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
    *   const res = await baremetalsolution.projects.locations.volumes.resize({
    *     // Required. Volume to resize.
    *     volume: 'projects/my-project/locations/my-location/volumes/my-volume',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "sizeGib": "my_sizeGib"
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
  def resize(params: ParamsResourceProjectsLocationsVolumesResize, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def resize(
    params: ParamsResourceProjectsLocationsVolumesResize,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
