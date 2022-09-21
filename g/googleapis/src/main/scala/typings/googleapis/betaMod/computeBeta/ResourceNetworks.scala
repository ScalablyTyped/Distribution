package typings.googleapis.betaMod.computeBeta

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/compute/beta", "compute_beta.Resource$Networks")
@js.native
open class ResourceNetworks protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def addPeering(): GaxiosPromise[SchemaOperation] = js.native
  def addPeering(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def addPeering(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def addPeering(params: ParamsResourceNetworksAddpeering): GaxiosPromise[SchemaOperation] = js.native
  def addPeering(params: ParamsResourceNetworksAddpeering, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def addPeering(
    params: ParamsResourceNetworksAddpeering,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def addPeering(params: ParamsResourceNetworksAddpeering, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def addPeering(
    params: ParamsResourceNetworksAddpeering,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Adds a peering to the specified network.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/compute.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const compute = google.compute('beta');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await compute.networks.addPeering({
    *     // Name of the network resource to add peering to.
    *     network: '[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?|[1-9][0-9]{0,19}',
    *     // Project ID for this request.
    *     project:
    *       '(?:(?:[-a-z0-9]{1,63}.)*(?:[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?):)?(?:[0-9]{1,19}|(?:[a-z0-9](?:[-a-z0-9]{0,61}[a-z0-9])?))',
    *     // An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
    *     requestId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "autoCreateRoutes": false,
    *       //   "name": "my_name",
    *       //   "networkPeering": {},
    *       //   "peerNetwork": "my_peerNetwork"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientOperationId": "my_clientOperationId",
    *   //   "creationTimestamp": "my_creationTimestamp",
    *   //   "description": "my_description",
    *   //   "endTime": "my_endTime",
    *   //   "error": {},
    *   //   "httpErrorMessage": "my_httpErrorMessage",
    *   //   "httpErrorStatusCode": 0,
    *   //   "id": "my_id",
    *   //   "insertTime": "my_insertTime",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "operationGroupId": "my_operationGroupId",
    *   //   "operationType": "my_operationType",
    *   //   "progress": 0,
    *   //   "region": "my_region",
    *   //   "selfLink": "my_selfLink",
    *   //   "startTime": "my_startTime",
    *   //   "status": "my_status",
    *   //   "statusMessage": "my_statusMessage",
    *   //   "targetId": "my_targetId",
    *   //   "targetLink": "my_targetLink",
    *   //   "user": "my_user",
    *   //   "warnings": [],
    *   //   "zone": "my_zone"
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
  def addPeering(params: ParamsResourceNetworksAddpeering, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def addPeering(
    params: ParamsResourceNetworksAddpeering,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceNetworksDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceNetworksDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceNetworksDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceNetworksDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceNetworksDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Deletes the specified network.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/compute.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const compute = google.compute('beta');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await compute.networks.delete({
    *     // Name of the network to delete.
    *     network: '[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?|[1-9][0-9]{0,19}',
    *     // Project ID for this request.
    *     project:
    *       '(?:(?:[-a-z0-9]{1,63}.)*(?:[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?):)?(?:[0-9]{1,19}|(?:[a-z0-9](?:[-a-z0-9]{0,61}[a-z0-9])?))',
    *     // An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
    *     requestId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientOperationId": "my_clientOperationId",
    *   //   "creationTimestamp": "my_creationTimestamp",
    *   //   "description": "my_description",
    *   //   "endTime": "my_endTime",
    *   //   "error": {},
    *   //   "httpErrorMessage": "my_httpErrorMessage",
    *   //   "httpErrorStatusCode": 0,
    *   //   "id": "my_id",
    *   //   "insertTime": "my_insertTime",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "operationGroupId": "my_operationGroupId",
    *   //   "operationType": "my_operationType",
    *   //   "progress": 0,
    *   //   "region": "my_region",
    *   //   "selfLink": "my_selfLink",
    *   //   "startTime": "my_startTime",
    *   //   "status": "my_status",
    *   //   "statusMessage": "my_statusMessage",
    *   //   "targetId": "my_targetId",
    *   //   "targetLink": "my_targetLink",
    *   //   "user": "my_user",
    *   //   "warnings": [],
    *   //   "zone": "my_zone"
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
  def delete(params: ParamsResourceNetworksDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceNetworksDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaNetwork] = js.native
  def get(callback: BodyResponseCallback[SchemaNetwork]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaNetwork] = js.native
  def get(params: ParamsResourceNetworksGet): GaxiosPromise[SchemaNetwork] = js.native
  def get(params: ParamsResourceNetworksGet, callback: BodyResponseCallback[SchemaNetwork]): Unit = js.native
  def get(
    params: ParamsResourceNetworksGet,
    options: BodyResponseCallback[Readable | SchemaNetwork],
    callback: BodyResponseCallback[Readable | SchemaNetwork]
  ): Unit = js.native
  def get(params: ParamsResourceNetworksGet, options: MethodOptions): GaxiosPromise[SchemaNetwork] = js.native
  def get(
    params: ParamsResourceNetworksGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNetwork]
  ): Unit = js.native
  /**
    * Returns the specified network. Gets a list of available networks by making a list() request.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/compute.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const compute = google.compute('beta');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *       'https://www.googleapis.com/auth/compute.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await compute.networks.get({
    *     // Name of the network to return.
    *     network: '[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?|[1-9][0-9]{0,19}',
    *     // Project ID for this request.
    *     project:
    *       '(?:(?:[-a-z0-9]{1,63}.)*(?:[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?):)?(?:[0-9]{1,19}|(?:[a-z0-9](?:[-a-z0-9]{0,61}[a-z0-9])?))',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "IPv4Range": "my_IPv4Range",
    *   //   "autoCreateSubnetworks": false,
    *   //   "creationTimestamp": "my_creationTimestamp",
    *   //   "description": "my_description",
    *   //   "enableUlaInternalIpv6": false,
    *   //   "firewallPolicy": "my_firewallPolicy",
    *   //   "gatewayIPv4": "my_gatewayIPv4",
    *   //   "id": "my_id",
    *   //   "internalIpv6Range": "my_internalIpv6Range",
    *   //   "kind": "my_kind",
    *   //   "mtu": 0,
    *   //   "name": "my_name",
    *   //   "networkFirewallPolicyEnforcementOrder": "my_networkFirewallPolicyEnforcementOrder",
    *   //   "peerings": [],
    *   //   "routingConfig": {},
    *   //   "selfLink": "my_selfLink",
    *   //   "selfLinkWithId": "my_selfLinkWithId",
    *   //   "subnetworks": []
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
  def get(params: ParamsResourceNetworksGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceNetworksGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getEffectiveFirewalls(): GaxiosPromise[SchemaNetworksGetEffectiveFirewallsResponse] = js.native
  def getEffectiveFirewalls(callback: BodyResponseCallback[SchemaNetworksGetEffectiveFirewallsResponse]): Unit = js.native
  def getEffectiveFirewalls(params: Unit, options: MethodOptions): GaxiosPromise[SchemaNetworksGetEffectiveFirewallsResponse] = js.native
  def getEffectiveFirewalls(params: ParamsResourceNetworksGeteffectivefirewalls): GaxiosPromise[SchemaNetworksGetEffectiveFirewallsResponse] = js.native
  def getEffectiveFirewalls(
    params: ParamsResourceNetworksGeteffectivefirewalls,
    callback: BodyResponseCallback[SchemaNetworksGetEffectiveFirewallsResponse]
  ): Unit = js.native
  def getEffectiveFirewalls(
    params: ParamsResourceNetworksGeteffectivefirewalls,
    options: BodyResponseCallback[Readable | SchemaNetworksGetEffectiveFirewallsResponse],
    callback: BodyResponseCallback[Readable | SchemaNetworksGetEffectiveFirewallsResponse]
  ): Unit = js.native
  def getEffectiveFirewalls(params: ParamsResourceNetworksGeteffectivefirewalls, options: MethodOptions): GaxiosPromise[SchemaNetworksGetEffectiveFirewallsResponse] = js.native
  def getEffectiveFirewalls(
    params: ParamsResourceNetworksGeteffectivefirewalls,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNetworksGetEffectiveFirewallsResponse]
  ): Unit = js.native
  /**
    * Returns the effective firewalls on a given network.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/compute.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const compute = google.compute('beta');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *       'https://www.googleapis.com/auth/compute.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await compute.networks.getEffectiveFirewalls({
    *     // Name of the network for this request.
    *     network: '[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?',
    *     // Project ID for this request.
    *     project:
    *       '(?:(?:[-a-z0-9]{1,63}.)*(?:[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?):)?(?:[0-9]{1,19}|(?:[a-z0-9](?:[-a-z0-9]{0,61}[a-z0-9])?))',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "firewallPolicys": [],
    *   //   "firewalls": [],
    *   //   "organizationFirewalls": []
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
  def getEffectiveFirewalls(params: ParamsResourceNetworksGeteffectivefirewalls, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getEffectiveFirewalls(
    params: ParamsResourceNetworksGeteffectivefirewalls,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaOperation] = js.native
  def insert(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceNetworksInsert): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceNetworksInsert, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(
    params: ParamsResourceNetworksInsert,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def insert(params: ParamsResourceNetworksInsert, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(
    params: ParamsResourceNetworksInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Creates a network in the specified project using the data included in the request.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/compute.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const compute = google.compute('beta');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await compute.networks.insert({
    *     // Project ID for this request.
    *     project:
    *       '(?:(?:[-a-z0-9]{1,63}.)*(?:[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?):)?(?:[0-9]{1,19}|(?:[a-z0-9](?:[-a-z0-9]{0,61}[a-z0-9])?))',
    *     // An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
    *     requestId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "IPv4Range": "my_IPv4Range",
    *       //   "autoCreateSubnetworks": false,
    *       //   "creationTimestamp": "my_creationTimestamp",
    *       //   "description": "my_description",
    *       //   "enableUlaInternalIpv6": false,
    *       //   "firewallPolicy": "my_firewallPolicy",
    *       //   "gatewayIPv4": "my_gatewayIPv4",
    *       //   "id": "my_id",
    *       //   "internalIpv6Range": "my_internalIpv6Range",
    *       //   "kind": "my_kind",
    *       //   "mtu": 0,
    *       //   "name": "my_name",
    *       //   "networkFirewallPolicyEnforcementOrder": "my_networkFirewallPolicyEnforcementOrder",
    *       //   "peerings": [],
    *       //   "routingConfig": {},
    *       //   "selfLink": "my_selfLink",
    *       //   "selfLinkWithId": "my_selfLinkWithId",
    *       //   "subnetworks": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientOperationId": "my_clientOperationId",
    *   //   "creationTimestamp": "my_creationTimestamp",
    *   //   "description": "my_description",
    *   //   "endTime": "my_endTime",
    *   //   "error": {},
    *   //   "httpErrorMessage": "my_httpErrorMessage",
    *   //   "httpErrorStatusCode": 0,
    *   //   "id": "my_id",
    *   //   "insertTime": "my_insertTime",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "operationGroupId": "my_operationGroupId",
    *   //   "operationType": "my_operationType",
    *   //   "progress": 0,
    *   //   "region": "my_region",
    *   //   "selfLink": "my_selfLink",
    *   //   "startTime": "my_startTime",
    *   //   "status": "my_status",
    *   //   "statusMessage": "my_statusMessage",
    *   //   "targetId": "my_targetId",
    *   //   "targetLink": "my_targetLink",
    *   //   "user": "my_user",
    *   //   "warnings": [],
    *   //   "zone": "my_zone"
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
  def insert(params: ParamsResourceNetworksInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceNetworksInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaNetworkList] = js.native
  def list(callback: BodyResponseCallback[SchemaNetworkList]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaNetworkList] = js.native
  def list(params: ParamsResourceNetworksList): GaxiosPromise[SchemaNetworkList] = js.native
  def list(params: ParamsResourceNetworksList, callback: BodyResponseCallback[SchemaNetworkList]): Unit = js.native
  def list(
    params: ParamsResourceNetworksList,
    options: BodyResponseCallback[Readable | SchemaNetworkList],
    callback: BodyResponseCallback[Readable | SchemaNetworkList]
  ): Unit = js.native
  def list(params: ParamsResourceNetworksList, options: MethodOptions): GaxiosPromise[SchemaNetworkList] = js.native
  def list(
    params: ParamsResourceNetworksList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNetworkList]
  ): Unit = js.native
  /**
    * Retrieves the list of networks available to the specified project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/compute.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const compute = google.compute('beta');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *       'https://www.googleapis.com/auth/compute.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await compute.networks.list({
    *     // A filter expression that filters resources listed in the response. Most Compute resources support two types of filter expressions: expressions that support regular expressions and expressions that follow API improvement proposal AIP-160. If you want to use AIP-160, your expression must specify the field name, an operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The operator must be either `=`, `!=`, `\>`, `<`, `<=`, `\>=` or `:`. For example, if you are filtering Compute Engine instances, you can exclude instances named `example-instance` by specifying `name != example-instance`. The `:` operator can be used with string fields to match substrings. For non-string fields it is equivalent to the `=` operator. The `:*` comparison can be used to test whether a key has been defined. For example, to find all objects with `owner` label use: ``` labels.owner:* ``` You can also filter nested fields. For example, you could specify `scheduling.automaticRestart = false` to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels. To filter on multiple expressions, provide each separate expression within parentheses. For example: ``` (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake") ``` By default, each expression is an `AND` expression. However, you can include `AND` and `OR` expressions explicitly. For example: ``` (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true) ``` If you want to use a regular expression, use the `eq` (equal) or `ne` (not equal) operator against a single un-parenthesized expression with or without quotes or against multiple parenthesized expressions. Examples: `fieldname eq unquoted literal` `fieldname eq 'single quoted literal'` `fieldname eq "double quoted literal"` `(fieldname1 eq literal) (fieldname2 ne "literal")` The literal value is interpreted as a regular expression using Google RE2 library syntax. The literal value must match the entire field. For example, to filter for instances that do not end with name "instance", you would use `name ne .*instance`.
    *     filter: 'placeholder-value',
    *     // The maximum number of results per page that should be returned. If the number of available results is larger than `maxResults`, Compute Engine returns a `nextPageToken` that can be used to get the next page of results in subsequent list requests. Acceptable values are `0` to `500`, inclusive. (Default: `500`)
    *     maxResults: 'placeholder-value',
    *     // Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name. You can also sort results in descending order based on the creation timestamp using `orderBy="creationTimestamp desc"`. This sorts results based on the `creationTimestamp` field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first. Currently, only sorting by `name` or `creationTimestamp desc` is supported.
    *     orderBy: 'placeholder-value',
    *     // Specifies a page token to use. Set `pageToken` to the `nextPageToken` returned by a previous list request to get the next page of results.
    *     pageToken: 'placeholder-value',
    *     // Project ID for this request.
    *     project:
    *       '(?:(?:[-a-z0-9]{1,63}.)*(?:[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?):)?(?:[0-9]{1,19}|(?:[a-z0-9](?:[-a-z0-9]{0,61}[a-z0-9])?))',
    *     // Opt-in for partial success behavior which provides partial results in case of failure. The default value is false.
    *     returnPartialSuccess: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "id": "my_id",
    *   //   "items": [],
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "selfLink": "my_selfLink",
    *   //   "warning": {}
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
  def list(params: ParamsResourceNetworksList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceNetworksList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def listPeeringRoutes(): GaxiosPromise[SchemaExchangedPeeringRoutesList] = js.native
  def listPeeringRoutes(callback: BodyResponseCallback[SchemaExchangedPeeringRoutesList]): Unit = js.native
  def listPeeringRoutes(params: Unit, options: MethodOptions): GaxiosPromise[SchemaExchangedPeeringRoutesList] = js.native
  def listPeeringRoutes(params: ParamsResourceNetworksListpeeringroutes): GaxiosPromise[SchemaExchangedPeeringRoutesList] = js.native
  def listPeeringRoutes(
    params: ParamsResourceNetworksListpeeringroutes,
    callback: BodyResponseCallback[SchemaExchangedPeeringRoutesList]
  ): Unit = js.native
  def listPeeringRoutes(
    params: ParamsResourceNetworksListpeeringroutes,
    options: BodyResponseCallback[Readable | SchemaExchangedPeeringRoutesList],
    callback: BodyResponseCallback[Readable | SchemaExchangedPeeringRoutesList]
  ): Unit = js.native
  def listPeeringRoutes(params: ParamsResourceNetworksListpeeringroutes, options: MethodOptions): GaxiosPromise[SchemaExchangedPeeringRoutesList] = js.native
  def listPeeringRoutes(
    params: ParamsResourceNetworksListpeeringroutes,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaExchangedPeeringRoutesList]
  ): Unit = js.native
  /**
    * Lists the peering routes exchanged over peering connection.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/compute.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const compute = google.compute('beta');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *       'https://www.googleapis.com/auth/compute.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await compute.networks.listPeeringRoutes({
    *     // The direction of the exchanged routes.
    *     direction: 'placeholder-value',
    *     // A filter expression that filters resources listed in the response. Most Compute resources support two types of filter expressions: expressions that support regular expressions and expressions that follow API improvement proposal AIP-160. If you want to use AIP-160, your expression must specify the field name, an operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The operator must be either `=`, `!=`, `\>`, `<`, `<=`, `\>=` or `:`. For example, if you are filtering Compute Engine instances, you can exclude instances named `example-instance` by specifying `name != example-instance`. The `:` operator can be used with string fields to match substrings. For non-string fields it is equivalent to the `=` operator. The `:*` comparison can be used to test whether a key has been defined. For example, to find all objects with `owner` label use: ``` labels.owner:* ``` You can also filter nested fields. For example, you could specify `scheduling.automaticRestart = false` to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels. To filter on multiple expressions, provide each separate expression within parentheses. For example: ``` (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake") ``` By default, each expression is an `AND` expression. However, you can include `AND` and `OR` expressions explicitly. For example: ``` (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true) ``` If you want to use a regular expression, use the `eq` (equal) or `ne` (not equal) operator against a single un-parenthesized expression with or without quotes or against multiple parenthesized expressions. Examples: `fieldname eq unquoted literal` `fieldname eq 'single quoted literal'` `fieldname eq "double quoted literal"` `(fieldname1 eq literal) (fieldname2 ne "literal")` The literal value is interpreted as a regular expression using Google RE2 library syntax. The literal value must match the entire field. For example, to filter for instances that do not end with name "instance", you would use `name ne .*instance`.
    *     filter: 'placeholder-value',
    *     // The maximum number of results per page that should be returned. If the number of available results is larger than `maxResults`, Compute Engine returns a `nextPageToken` that can be used to get the next page of results in subsequent list requests. Acceptable values are `0` to `500`, inclusive. (Default: `500`)
    *     maxResults: 'placeholder-value',
    *     // Name of the network for this request.
    *     network: '[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?',
    *     // Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name. You can also sort results in descending order based on the creation timestamp using `orderBy="creationTimestamp desc"`. This sorts results based on the `creationTimestamp` field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first. Currently, only sorting by `name` or `creationTimestamp desc` is supported.
    *     orderBy: 'placeholder-value',
    *     // Specifies a page token to use. Set `pageToken` to the `nextPageToken` returned by a previous list request to get the next page of results.
    *     pageToken: 'placeholder-value',
    *     // The response will show routes exchanged over the given peering connection.
    *     peeringName: 'placeholder-value',
    *     // Project ID for this request.
    *     project:
    *       '(?:(?:[-a-z0-9]{1,63}.)*(?:[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?):)?(?:[0-9]{1,19}|(?:[a-z0-9](?:[-a-z0-9]{0,61}[a-z0-9])?))',
    *     // The region of the request. The response will include all subnet routes, static routes and dynamic routes in the region.
    *     region: 'placeholder-value',
    *     // Opt-in for partial success behavior which provides partial results in case of failure. The default value is false.
    *     returnPartialSuccess: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "id": "my_id",
    *   //   "items": [],
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "selfLink": "my_selfLink",
    *   //   "warning": {}
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
  def listPeeringRoutes(params: ParamsResourceNetworksListpeeringroutes, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def listPeeringRoutes(
    params: ParamsResourceNetworksListpeeringroutes,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceNetworksPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceNetworksPatch, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(
    params: ParamsResourceNetworksPatch,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceNetworksPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceNetworksPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Patches the specified network with the data included in the request. Only the following fields can be modified: routingConfig.routingMode.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/compute.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const compute = google.compute('beta');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await compute.networks.patch({
    *     // Name of the network to update.
    *     network: '[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?|[1-9][0-9]{0,19}',
    *     // Project ID for this request.
    *     project:
    *       '(?:(?:[-a-z0-9]{1,63}.)*(?:[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?):)?(?:[0-9]{1,19}|(?:[a-z0-9](?:[-a-z0-9]{0,61}[a-z0-9])?))',
    *     // An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
    *     requestId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "IPv4Range": "my_IPv4Range",
    *       //   "autoCreateSubnetworks": false,
    *       //   "creationTimestamp": "my_creationTimestamp",
    *       //   "description": "my_description",
    *       //   "enableUlaInternalIpv6": false,
    *       //   "firewallPolicy": "my_firewallPolicy",
    *       //   "gatewayIPv4": "my_gatewayIPv4",
    *       //   "id": "my_id",
    *       //   "internalIpv6Range": "my_internalIpv6Range",
    *       //   "kind": "my_kind",
    *       //   "mtu": 0,
    *       //   "name": "my_name",
    *       //   "networkFirewallPolicyEnforcementOrder": "my_networkFirewallPolicyEnforcementOrder",
    *       //   "peerings": [],
    *       //   "routingConfig": {},
    *       //   "selfLink": "my_selfLink",
    *       //   "selfLinkWithId": "my_selfLinkWithId",
    *       //   "subnetworks": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientOperationId": "my_clientOperationId",
    *   //   "creationTimestamp": "my_creationTimestamp",
    *   //   "description": "my_description",
    *   //   "endTime": "my_endTime",
    *   //   "error": {},
    *   //   "httpErrorMessage": "my_httpErrorMessage",
    *   //   "httpErrorStatusCode": 0,
    *   //   "id": "my_id",
    *   //   "insertTime": "my_insertTime",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "operationGroupId": "my_operationGroupId",
    *   //   "operationType": "my_operationType",
    *   //   "progress": 0,
    *   //   "region": "my_region",
    *   //   "selfLink": "my_selfLink",
    *   //   "startTime": "my_startTime",
    *   //   "status": "my_status",
    *   //   "statusMessage": "my_statusMessage",
    *   //   "targetId": "my_targetId",
    *   //   "targetLink": "my_targetLink",
    *   //   "user": "my_user",
    *   //   "warnings": [],
    *   //   "zone": "my_zone"
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
  def patch(params: ParamsResourceNetworksPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceNetworksPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def removePeering(): GaxiosPromise[SchemaOperation] = js.native
  def removePeering(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def removePeering(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def removePeering(params: ParamsResourceNetworksRemovepeering): GaxiosPromise[SchemaOperation] = js.native
  def removePeering(params: ParamsResourceNetworksRemovepeering, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def removePeering(
    params: ParamsResourceNetworksRemovepeering,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def removePeering(params: ParamsResourceNetworksRemovepeering, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def removePeering(
    params: ParamsResourceNetworksRemovepeering,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Removes a peering from the specified network.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/compute.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const compute = google.compute('beta');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await compute.networks.removePeering({
    *     // Name of the network resource to remove peering from.
    *     network: '[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?|[1-9][0-9]{0,19}',
    *     // Project ID for this request.
    *     project:
    *       '(?:(?:[-a-z0-9]{1,63}.)*(?:[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?):)?(?:[0-9]{1,19}|(?:[a-z0-9](?:[-a-z0-9]{0,61}[a-z0-9])?))',
    *     // An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
    *     requestId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientOperationId": "my_clientOperationId",
    *   //   "creationTimestamp": "my_creationTimestamp",
    *   //   "description": "my_description",
    *   //   "endTime": "my_endTime",
    *   //   "error": {},
    *   //   "httpErrorMessage": "my_httpErrorMessage",
    *   //   "httpErrorStatusCode": 0,
    *   //   "id": "my_id",
    *   //   "insertTime": "my_insertTime",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "operationGroupId": "my_operationGroupId",
    *   //   "operationType": "my_operationType",
    *   //   "progress": 0,
    *   //   "region": "my_region",
    *   //   "selfLink": "my_selfLink",
    *   //   "startTime": "my_startTime",
    *   //   "status": "my_status",
    *   //   "statusMessage": "my_statusMessage",
    *   //   "targetId": "my_targetId",
    *   //   "targetLink": "my_targetLink",
    *   //   "user": "my_user",
    *   //   "warnings": [],
    *   //   "zone": "my_zone"
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
  def removePeering(params: ParamsResourceNetworksRemovepeering, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def removePeering(
    params: ParamsResourceNetworksRemovepeering,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def switchToCustomMode(): GaxiosPromise[SchemaOperation] = js.native
  def switchToCustomMode(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def switchToCustomMode(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def switchToCustomMode(params: ParamsResourceNetworksSwitchtocustommode): GaxiosPromise[SchemaOperation] = js.native
  def switchToCustomMode(params: ParamsResourceNetworksSwitchtocustommode, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def switchToCustomMode(
    params: ParamsResourceNetworksSwitchtocustommode,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def switchToCustomMode(params: ParamsResourceNetworksSwitchtocustommode, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def switchToCustomMode(
    params: ParamsResourceNetworksSwitchtocustommode,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Switches the network mode from auto subnet mode to custom subnet mode.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/compute.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const compute = google.compute('beta');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await compute.networks.switchToCustomMode({
    *     // Name of the network to be updated.
    *     network: '[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?|[1-9][0-9]{0,19}',
    *     // Project ID for this request.
    *     project:
    *       '(?:(?:[-a-z0-9]{1,63}.)*(?:[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?):)?(?:[0-9]{1,19}|(?:[a-z0-9](?:[-a-z0-9]{0,61}[a-z0-9])?))',
    *     // An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
    *     requestId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientOperationId": "my_clientOperationId",
    *   //   "creationTimestamp": "my_creationTimestamp",
    *   //   "description": "my_description",
    *   //   "endTime": "my_endTime",
    *   //   "error": {},
    *   //   "httpErrorMessage": "my_httpErrorMessage",
    *   //   "httpErrorStatusCode": 0,
    *   //   "id": "my_id",
    *   //   "insertTime": "my_insertTime",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "operationGroupId": "my_operationGroupId",
    *   //   "operationType": "my_operationType",
    *   //   "progress": 0,
    *   //   "region": "my_region",
    *   //   "selfLink": "my_selfLink",
    *   //   "startTime": "my_startTime",
    *   //   "status": "my_status",
    *   //   "statusMessage": "my_statusMessage",
    *   //   "targetId": "my_targetId",
    *   //   "targetLink": "my_targetLink",
    *   //   "user": "my_user",
    *   //   "warnings": [],
    *   //   "zone": "my_zone"
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
  def switchToCustomMode(params: ParamsResourceNetworksSwitchtocustommode, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def switchToCustomMode(
    params: ParamsResourceNetworksSwitchtocustommode,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def testIamPermissions(): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceNetworksTestiampermissions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceNetworksTestiampermissions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceNetworksTestiampermissions,
    options: BodyResponseCallback[Readable | SchemaTestPermissionsResponse],
    callback: BodyResponseCallback[Readable | SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceNetworksTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceNetworksTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  /**
    * Returns permissions that a caller has on the specified resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/compute.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const compute = google.compute('beta');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *       'https://www.googleapis.com/auth/compute.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await compute.networks.testIamPermissions({
    *     // Project ID for this request.
    *     project:
    *       '(?:(?:[-a-z0-9]{1,63}.)*(?:[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?):)?(?:[0-9]{1,19}|(?:[a-z0-9](?:[-a-z0-9]{0,61}[a-z0-9])?))',
    *     // Name or id of the resource for this request.
    *     resource: '[a-z](?:[-a-z0-9_]{0,61}[a-z0-9])?|[1-9][0-9]{0,19}',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "permissions": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "permissions": []
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
  def testIamPermissions(params: ParamsResourceNetworksTestiampermissions, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def testIamPermissions(
    params: ParamsResourceNetworksTestiampermissions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updatePeering(): GaxiosPromise[SchemaOperation] = js.native
  def updatePeering(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def updatePeering(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def updatePeering(params: ParamsResourceNetworksUpdatepeering): GaxiosPromise[SchemaOperation] = js.native
  def updatePeering(params: ParamsResourceNetworksUpdatepeering, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def updatePeering(
    params: ParamsResourceNetworksUpdatepeering,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def updatePeering(params: ParamsResourceNetworksUpdatepeering, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def updatePeering(
    params: ParamsResourceNetworksUpdatepeering,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Updates the specified network peering with the data included in the request. You can only modify the NetworkPeering.export_custom_routes field and the NetworkPeering.import_custom_routes field.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/compute.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const compute = google.compute('beta');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await compute.networks.updatePeering({
    *     // Name of the network resource which the updated peering is belonging to.
    *     network: '[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?|[1-9][0-9]{0,19}',
    *     // Project ID for this request.
    *     project:
    *       '(?:(?:[-a-z0-9]{1,63}.)*(?:[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?):)?(?:[0-9]{1,19}|(?:[a-z0-9](?:[-a-z0-9]{0,61}[a-z0-9])?))',
    *     // An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
    *     requestId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "networkPeering": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientOperationId": "my_clientOperationId",
    *   //   "creationTimestamp": "my_creationTimestamp",
    *   //   "description": "my_description",
    *   //   "endTime": "my_endTime",
    *   //   "error": {},
    *   //   "httpErrorMessage": "my_httpErrorMessage",
    *   //   "httpErrorStatusCode": 0,
    *   //   "id": "my_id",
    *   //   "insertTime": "my_insertTime",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "operationGroupId": "my_operationGroupId",
    *   //   "operationType": "my_operationType",
    *   //   "progress": 0,
    *   //   "region": "my_region",
    *   //   "selfLink": "my_selfLink",
    *   //   "startTime": "my_startTime",
    *   //   "status": "my_status",
    *   //   "statusMessage": "my_statusMessage",
    *   //   "targetId": "my_targetId",
    *   //   "targetLink": "my_targetLink",
    *   //   "user": "my_user",
    *   //   "warnings": [],
    *   //   "zone": "my_zone"
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
  def updatePeering(params: ParamsResourceNetworksUpdatepeering, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updatePeering(
    params: ParamsResourceNetworksUpdatepeering,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
