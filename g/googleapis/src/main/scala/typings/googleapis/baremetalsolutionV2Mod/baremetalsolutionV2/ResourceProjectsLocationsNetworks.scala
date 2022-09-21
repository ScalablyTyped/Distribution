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

@JSImport("googleapis/build/src/apis/baremetalsolution/v2", "baremetalsolution_v2.Resource$Projects$Locations$Networks")
@js.native
open class ResourceProjectsLocationsNetworks protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaNetwork] = js.native
  def get(callback: BodyResponseCallback[SchemaNetwork]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaNetwork] = js.native
  def get(params: ParamsResourceProjectsLocationsNetworksGet): GaxiosPromise[SchemaNetwork] = js.native
  def get(params: ParamsResourceProjectsLocationsNetworksGet, callback: BodyResponseCallback[SchemaNetwork]): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsNetworksGet,
    options: BodyResponseCallback[Readable | SchemaNetwork],
    callback: BodyResponseCallback[Readable | SchemaNetwork]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsNetworksGet, options: MethodOptions): GaxiosPromise[SchemaNetwork] = js.native
  def get(
    params: ParamsResourceProjectsLocationsNetworksGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNetwork]
  ): Unit = js.native
  /**
    * Get details of a single network.
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
    *   const res = await baremetalsolution.projects.locations.networks.get({
    *     // Required. Name of the resource.
    *     name: 'projects/my-project/locations/my-location/networks/my-network',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cidr": "my_cidr",
    *   //   "id": "my_id",
    *   //   "ipAddress": "my_ipAddress",
    *   //   "labels": {},
    *   //   "macAddress": [],
    *   //   "name": "my_name",
    *   //   "reservations": [],
    *   //   "servicesCidr": "my_servicesCidr",
    *   //   "state": "my_state",
    *   //   "type": "my_type",
    *   //   "vlanId": "my_vlanId",
    *   //   "vrf": {}
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
  def get(params: ParamsResourceProjectsLocationsNetworksGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsNetworksGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListNetworksResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListNetworksResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListNetworksResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsNetworksList): GaxiosPromise[SchemaListNetworksResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsNetworksList,
    callback: BodyResponseCallback[SchemaListNetworksResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsNetworksList,
    options: BodyResponseCallback[Readable | SchemaListNetworksResponse],
    callback: BodyResponseCallback[Readable | SchemaListNetworksResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsNetworksList, options: MethodOptions): GaxiosPromise[SchemaListNetworksResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsNetworksList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListNetworksResponse]
  ): Unit = js.native
  /**
    * List network in a given project and location.
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
    *   const res = await baremetalsolution.projects.locations.networks.list({
    *     // List filter.
    *     filter: 'placeholder-value',
    *     // Requested page size. The server might return fewer items than requested. If unspecified, server will pick an appropriate default.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results from the server.
    *     pageToken: 'placeholder-value',
    *     // Required. Parent value for ListNetworksRequest.
    *     parent: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "networks": [],
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
  def list(params: ParamsResourceProjectsLocationsNetworksList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsNetworksList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def listNetworkUsage(): GaxiosPromise[SchemaListNetworkUsageResponse] = js.native
  def listNetworkUsage(callback: BodyResponseCallback[SchemaListNetworkUsageResponse]): Unit = js.native
  def listNetworkUsage(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListNetworkUsageResponse] = js.native
  def listNetworkUsage(params: ParamsResourceProjectsLocationsNetworksListnetworkusage): GaxiosPromise[SchemaListNetworkUsageResponse] = js.native
  def listNetworkUsage(
    params: ParamsResourceProjectsLocationsNetworksListnetworkusage,
    callback: BodyResponseCallback[SchemaListNetworkUsageResponse]
  ): Unit = js.native
  def listNetworkUsage(
    params: ParamsResourceProjectsLocationsNetworksListnetworkusage,
    options: BodyResponseCallback[Readable | SchemaListNetworkUsageResponse],
    callback: BodyResponseCallback[Readable | SchemaListNetworkUsageResponse]
  ): Unit = js.native
  def listNetworkUsage(params: ParamsResourceProjectsLocationsNetworksListnetworkusage, options: MethodOptions): GaxiosPromise[SchemaListNetworkUsageResponse] = js.native
  def listNetworkUsage(
    params: ParamsResourceProjectsLocationsNetworksListnetworkusage,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListNetworkUsageResponse]
  ): Unit = js.native
  /**
    * List all Networks (and used IPs for each Network) in the vendor account associated with the specified project.
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
    *   const res =
    *     await baremetalsolution.projects.locations.networks.listNetworkUsage({
    *       // Required. Parent value (project and location).
    *       location: 'projects/my-project/locations/my-location',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "networks": []
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
  def listNetworkUsage(params: ParamsResourceProjectsLocationsNetworksListnetworkusage, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def listNetworkUsage(
    params: ParamsResourceProjectsLocationsNetworksListnetworkusage,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceProjectsLocationsNetworksPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsNetworksPatch,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsNetworksPatch,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsNetworksPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsNetworksPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Update details of a single network.
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
    *   const res = await baremetalsolution.projects.locations.networks.patch({
    *     // Output only. The resource name of this `Network`. Resource names are schemeless URIs that follow the conventions in https://cloud.google.com/apis/design/resource_names. Format: `projects/{project\}/locations/{location\}/networks/{network\}`
    *     name: 'projects/my-project/locations/my-location/networks/my-network',
    *     // The list of fields to update. The only currently supported fields are: `labels`, `reservations`
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "cidr": "my_cidr",
    *       //   "id": "my_id",
    *       //   "ipAddress": "my_ipAddress",
    *       //   "labels": {},
    *       //   "macAddress": [],
    *       //   "name": "my_name",
    *       //   "reservations": [],
    *       //   "servicesCidr": "my_servicesCidr",
    *       //   "state": "my_state",
    *       //   "type": "my_type",
    *       //   "vlanId": "my_vlanId",
    *       //   "vrf": {}
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
  def patch(params: ParamsResourceProjectsLocationsNetworksPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsNetworksPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
