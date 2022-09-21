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

@JSImport("googleapis/build/src/apis/baremetalsolution/v2", "baremetalsolution_v2.Resource$Projects$Locations$Volumes$Luns")
@js.native
open class ResourceProjectsLocationsVolumesLuns protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaLun] = js.native
  def get(callback: BodyResponseCallback[SchemaLun]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLun] = js.native
  def get(params: ParamsResourceProjectsLocationsVolumesLunsGet): GaxiosPromise[SchemaLun] = js.native
  def get(params: ParamsResourceProjectsLocationsVolumesLunsGet, callback: BodyResponseCallback[SchemaLun]): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsVolumesLunsGet,
    options: BodyResponseCallback[Readable | SchemaLun],
    callback: BodyResponseCallback[Readable | SchemaLun]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsVolumesLunsGet, options: MethodOptions): GaxiosPromise[SchemaLun] = js.native
  def get(
    params: ParamsResourceProjectsLocationsVolumesLunsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLun]
  ): Unit = js.native
  /**
    * Get details of a single storage logical unit number(LUN).
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
    *   const res = await baremetalsolution.projects.locations.volumes.luns.get({
    *     // Required. Name of the resource.
    *     name: 'projects/my-project/locations/my-location/volumes/my-volume/luns/my-lun',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bootLun": false,
    *   //   "id": "my_id",
    *   //   "multiprotocolType": "my_multiprotocolType",
    *   //   "name": "my_name",
    *   //   "shareable": false,
    *   //   "sizeGb": "my_sizeGb",
    *   //   "state": "my_state",
    *   //   "storageType": "my_storageType",
    *   //   "storageVolume": "my_storageVolume",
    *   //   "wwid": "my_wwid"
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
  def get(params: ParamsResourceProjectsLocationsVolumesLunsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsVolumesLunsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListLunsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListLunsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListLunsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsVolumesLunsList): GaxiosPromise[SchemaListLunsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsVolumesLunsList,
    callback: BodyResponseCallback[SchemaListLunsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsVolumesLunsList,
    options: BodyResponseCallback[Readable | SchemaListLunsResponse],
    callback: BodyResponseCallback[Readable | SchemaListLunsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsVolumesLunsList, options: MethodOptions): GaxiosPromise[SchemaListLunsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsVolumesLunsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListLunsResponse]
  ): Unit = js.native
  /**
    * List storage volume luns for given storage volume.
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
    *   const res = await baremetalsolution.projects.locations.volumes.luns.list({
    *     // Requested page size. The server might return fewer items than requested. If unspecified, server will pick an appropriate default.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results from the server.
    *     pageToken: 'placeholder-value',
    *     // Required. Parent value for ListLunsRequest.
    *     parent: 'projects/my-project/locations/my-location/volumes/my-volume',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "luns": [],
    *   //   "nextPageToken": "my_nextPageToken",
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
  def list(params: ParamsResourceProjectsLocationsVolumesLunsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsVolumesLunsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
