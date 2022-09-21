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

@JSImport("googleapis/build/src/apis/baremetalsolution/v2", "baremetalsolution_v2.Resource$Projects$Locations$Nfsshares")
@js.native
open class ResourceProjectsLocationsNfsshares protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaNfsShare] = js.native
  def get(callback: BodyResponseCallback[SchemaNfsShare]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaNfsShare] = js.native
  def get(params: ParamsResourceProjectsLocationsNfssharesGet): GaxiosPromise[SchemaNfsShare] = js.native
  def get(
    params: ParamsResourceProjectsLocationsNfssharesGet,
    callback: BodyResponseCallback[SchemaNfsShare]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsNfssharesGet,
    options: BodyResponseCallback[Readable | SchemaNfsShare],
    callback: BodyResponseCallback[Readable | SchemaNfsShare]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsNfssharesGet, options: MethodOptions): GaxiosPromise[SchemaNfsShare] = js.native
  def get(
    params: ParamsResourceProjectsLocationsNfssharesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNfsShare]
  ): Unit = js.native
  /**
    * Get details of a single NFS share.
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
    *   const res = await baremetalsolution.projects.locations.nfsShares.get({
    *     // Required. Name of the resource.
    *     name: 'projects/my-project/locations/my-location/nfsShares/my-nfsShare',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "allowedClients": [],
    *   //   "id": "my_id",
    *   //   "labels": {},
    *   //   "name": "my_name",
    *   //   "nfsShareId": "my_nfsShareId",
    *   //   "requestedSizeGib": "my_requestedSizeGib",
    *   //   "state": "my_state",
    *   //   "volume": "my_volume"
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
  def get(params: ParamsResourceProjectsLocationsNfssharesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsNfssharesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListNfsSharesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListNfsSharesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListNfsSharesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsNfssharesList): GaxiosPromise[SchemaListNfsSharesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsNfssharesList,
    callback: BodyResponseCallback[SchemaListNfsSharesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsNfssharesList,
    options: BodyResponseCallback[Readable | SchemaListNfsSharesResponse],
    callback: BodyResponseCallback[Readable | SchemaListNfsSharesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsNfssharesList, options: MethodOptions): GaxiosPromise[SchemaListNfsSharesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsNfssharesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListNfsSharesResponse]
  ): Unit = js.native
  /**
    * List NFS shares.
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
    *   const res = await baremetalsolution.projects.locations.nfsShares.list({
    *     // List filter.
    *     filter: 'placeholder-value',
    *     // Requested page size. The server might return fewer items than requested. If unspecified, server will pick an appropriate default.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results from the server.
    *     pageToken: 'placeholder-value',
    *     // Required. Parent value for ListNfsSharesRequest.
    *     parent: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "nfsShares": [],
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
  def list(params: ParamsResourceProjectsLocationsNfssharesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsNfssharesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceProjectsLocationsNfssharesPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsNfssharesPatch,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsNfssharesPatch,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsNfssharesPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsNfssharesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Update details of a single NFS share.
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
    *   const res = await baremetalsolution.projects.locations.nfsShares.patch({
    *     // Output only. The name of the NFS share.
    *     name: 'projects/my-project/locations/my-location/nfsShares/my-nfsShare',
    *     // The list of fields to update. The only currently supported fields are: `labels`
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "allowedClients": [],
    *       //   "id": "my_id",
    *       //   "labels": {},
    *       //   "name": "my_name",
    *       //   "nfsShareId": "my_nfsShareId",
    *       //   "requestedSizeGib": "my_requestedSizeGib",
    *       //   "state": "my_state",
    *       //   "volume": "my_volume"
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
  def patch(params: ParamsResourceProjectsLocationsNfssharesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsNfssharesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
