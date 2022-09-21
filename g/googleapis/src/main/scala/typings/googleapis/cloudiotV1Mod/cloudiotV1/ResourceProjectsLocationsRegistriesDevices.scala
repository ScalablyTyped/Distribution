package typings.googleapis.cloudiotV1Mod.cloudiotV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudiot/v1", "cloudiot_v1.Resource$Projects$Locations$Registries$Devices")
@js.native
open class ResourceProjectsLocationsRegistriesDevices protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var configVersions: ResourceProjectsLocationsRegistriesDevicesConfigversions = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaDevice] = js.native
  def create(callback: BodyResponseCallback[SchemaDevice]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDevice] = js.native
  def create(params: ParamsResourceProjectsLocationsRegistriesDevicesCreate): GaxiosPromise[SchemaDevice] = js.native
  def create(
    params: ParamsResourceProjectsLocationsRegistriesDevicesCreate,
    callback: BodyResponseCallback[SchemaDevice]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsRegistriesDevicesCreate,
    options: BodyResponseCallback[Readable | SchemaDevice],
    callback: BodyResponseCallback[Readable | SchemaDevice]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsRegistriesDevicesCreate, options: MethodOptions): GaxiosPromise[SchemaDevice] = js.native
  def create(
    params: ParamsResourceProjectsLocationsRegistriesDevicesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDevice]
  ): Unit = js.native
  /**
    * Creates a device in a device registry.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudiot.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudiot = google.cloudiot('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloudiot',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudiot.projects.locations.registries.devices.create({
    *     // Required. The name of the device registry where this device should be created. For example, `projects/example-project/locations/us-central1/registries/my-registry`.
    *     parent: 'projects/my-project/locations/my-location/registries/my-registrie',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "blocked": false,
    *       //   "config": {},
    *       //   "credentials": [],
    *       //   "gatewayConfig": {},
    *       //   "id": "my_id",
    *       //   "lastConfigAckTime": "my_lastConfigAckTime",
    *       //   "lastConfigSendTime": "my_lastConfigSendTime",
    *       //   "lastErrorStatus": {},
    *       //   "lastErrorTime": "my_lastErrorTime",
    *       //   "lastEventTime": "my_lastEventTime",
    *       //   "lastHeartbeatTime": "my_lastHeartbeatTime",
    *       //   "lastStateTime": "my_lastStateTime",
    *       //   "logLevel": "my_logLevel",
    *       //   "metadata": {},
    *       //   "name": "my_name",
    *       //   "numId": "my_numId",
    *       //   "state": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "blocked": false,
    *   //   "config": {},
    *   //   "credentials": [],
    *   //   "gatewayConfig": {},
    *   //   "id": "my_id",
    *   //   "lastConfigAckTime": "my_lastConfigAckTime",
    *   //   "lastConfigSendTime": "my_lastConfigSendTime",
    *   //   "lastErrorStatus": {},
    *   //   "lastErrorTime": "my_lastErrorTime",
    *   //   "lastEventTime": "my_lastEventTime",
    *   //   "lastHeartbeatTime": "my_lastHeartbeatTime",
    *   //   "lastStateTime": "my_lastStateTime",
    *   //   "logLevel": "my_logLevel",
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "numId": "my_numId",
    *   //   "state": {}
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
  def create(params: ParamsResourceProjectsLocationsRegistriesDevicesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsRegistriesDevicesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsRegistriesDevicesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsRegistriesDevicesDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsRegistriesDevicesDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsRegistriesDevicesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsRegistriesDevicesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a device.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudiot.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudiot = google.cloudiot('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloudiot',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudiot.projects.locations.registries.devices.delete({
    *     // Required. The name of the device. For example, `projects/p0/locations/us-central1/registries/registry0/devices/device0` or `projects/p0/locations/us-central1/registries/registry0/devices/{num_id\}`.
    *     name: 'projects/my-project/locations/my-location/registries/my-registrie/devices/my-device',
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
  def delete(params: ParamsResourceProjectsLocationsRegistriesDevicesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsRegistriesDevicesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaDevice] = js.native
  def get(callback: BodyResponseCallback[SchemaDevice]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDevice] = js.native
  def get(params: ParamsResourceProjectsLocationsRegistriesDevicesGet): GaxiosPromise[SchemaDevice] = js.native
  def get(
    params: ParamsResourceProjectsLocationsRegistriesDevicesGet,
    callback: BodyResponseCallback[SchemaDevice]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsRegistriesDevicesGet,
    options: BodyResponseCallback[Readable | SchemaDevice],
    callback: BodyResponseCallback[Readable | SchemaDevice]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsRegistriesDevicesGet, options: MethodOptions): GaxiosPromise[SchemaDevice] = js.native
  def get(
    params: ParamsResourceProjectsLocationsRegistriesDevicesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDevice]
  ): Unit = js.native
  /**
    * Gets details about a device.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudiot.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudiot = google.cloudiot('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloudiot',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudiot.projects.locations.registries.devices.get({
    *     // The fields of the `Device` resource to be returned in the response. If the field mask is unset or empty, all fields are returned. Fields have to be provided in snake_case format, for example: `last_heartbeat_time`.
    *     fieldMask: 'placeholder-value',
    *     // Required. The name of the device. For example, `projects/p0/locations/us-central1/registries/registry0/devices/device0` or `projects/p0/locations/us-central1/registries/registry0/devices/{num_id\}`.
    *     name: 'projects/my-project/locations/my-location/registries/my-registrie/devices/my-device',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "blocked": false,
    *   //   "config": {},
    *   //   "credentials": [],
    *   //   "gatewayConfig": {},
    *   //   "id": "my_id",
    *   //   "lastConfigAckTime": "my_lastConfigAckTime",
    *   //   "lastConfigSendTime": "my_lastConfigSendTime",
    *   //   "lastErrorStatus": {},
    *   //   "lastErrorTime": "my_lastErrorTime",
    *   //   "lastEventTime": "my_lastEventTime",
    *   //   "lastHeartbeatTime": "my_lastHeartbeatTime",
    *   //   "lastStateTime": "my_lastStateTime",
    *   //   "logLevel": "my_logLevel",
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "numId": "my_numId",
    *   //   "state": {}
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
  def get(params: ParamsResourceProjectsLocationsRegistriesDevicesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsRegistriesDevicesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListDevicesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListDevicesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListDevicesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsRegistriesDevicesList): GaxiosPromise[SchemaListDevicesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRegistriesDevicesList,
    callback: BodyResponseCallback[SchemaListDevicesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsRegistriesDevicesList,
    options: BodyResponseCallback[Readable | SchemaListDevicesResponse],
    callback: BodyResponseCallback[Readable | SchemaListDevicesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsRegistriesDevicesList, options: MethodOptions): GaxiosPromise[SchemaListDevicesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRegistriesDevicesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListDevicesResponse]
  ): Unit = js.native
  /**
    * List devices in a device registry.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudiot.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudiot = google.cloudiot('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloudiot',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudiot.projects.locations.registries.devices.list({
    *     // A list of device string IDs. For example, `['device0', 'device12']`. If empty, this field is ignored. Maximum IDs: 10,000
    *     deviceIds: 'placeholder-value',
    *     // A list of device numeric IDs. If empty, this field is ignored. Maximum IDs: 10,000.
    *     deviceNumIds: 'placeholder-value',
    *     // The fields of the `Device` resource to be returned in the response. The fields `id` and `num_id` are always returned, along with any other fields specified in snake_case format, for example: `last_heartbeat_time`.
    *     fieldMask: 'placeholder-value',
    *     // If set, returns only the gateways with which the specified device is associated. The device ID can be numeric (`num_id`) or the user-defined string (`id`). For example, if `456` is specified, returns only the gateways to which the device with `num_id` 456 is bound.
    *     'gatewayListOptions.associationsDeviceId': 'placeholder-value',
    *     // If set, only devices associated with the specified gateway are returned. The gateway ID can be numeric (`num_id`) or the user-defined string (`id`). For example, if `123` is specified, only devices bound to the gateway with `num_id` 123 are returned.
    *     'gatewayListOptions.associationsGatewayId': 'placeholder-value',
    *     // If `GATEWAY` is specified, only gateways are returned. If `NON_GATEWAY` is specified, only non-gateway devices are returned. If `GATEWAY_TYPE_UNSPECIFIED` is specified, all devices are returned.
    *     'gatewayListOptions.gatewayType': 'placeholder-value',
    *     // The maximum number of devices to return in the response. If this value is zero, the service will select a default size. A call may return fewer objects than requested. A non-empty `next_page_token` in the response indicates that more data is available.
    *     pageSize: 'placeholder-value',
    *     // The value returned by the last `ListDevicesResponse`; indicates that this is a continuation of a prior `ListDevices` call and the system should return the next page of data.
    *     pageToken: 'placeholder-value',
    *     // Required. The device registry path. Required. For example, `projects/my-project/locations/us-central1/registries/my-registry`.
    *     parent: 'projects/my-project/locations/my-location/registries/my-registrie',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "devices": [],
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
  def list(params: ParamsResourceProjectsLocationsRegistriesDevicesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRegistriesDevicesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def modifyCloudToDeviceConfig(): GaxiosPromise[SchemaDeviceConfig] = js.native
  def modifyCloudToDeviceConfig(callback: BodyResponseCallback[SchemaDeviceConfig]): Unit = js.native
  def modifyCloudToDeviceConfig(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDeviceConfig] = js.native
  def modifyCloudToDeviceConfig(params: ParamsResourceProjectsLocationsRegistriesDevicesModifycloudtodeviceconfig): GaxiosPromise[SchemaDeviceConfig] = js.native
  def modifyCloudToDeviceConfig(
    params: ParamsResourceProjectsLocationsRegistriesDevicesModifycloudtodeviceconfig,
    callback: BodyResponseCallback[SchemaDeviceConfig]
  ): Unit = js.native
  def modifyCloudToDeviceConfig(
    params: ParamsResourceProjectsLocationsRegistriesDevicesModifycloudtodeviceconfig,
    options: BodyResponseCallback[Readable | SchemaDeviceConfig],
    callback: BodyResponseCallback[Readable | SchemaDeviceConfig]
  ): Unit = js.native
  def modifyCloudToDeviceConfig(
    params: ParamsResourceProjectsLocationsRegistriesDevicesModifycloudtodeviceconfig,
    options: MethodOptions
  ): GaxiosPromise[SchemaDeviceConfig] = js.native
  def modifyCloudToDeviceConfig(
    params: ParamsResourceProjectsLocationsRegistriesDevicesModifycloudtodeviceconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDeviceConfig]
  ): Unit = js.native
  /**
    * Modifies the configuration for the device, which is eventually sent from the Cloud IoT Core servers. Returns the modified configuration version and its metadata.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudiot.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudiot = google.cloudiot('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloudiot',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await cloudiot.projects.locations.registries.devices.modifyCloudToDeviceConfig(
    *       {
    *         // Required. The name of the device. For example, `projects/p0/locations/us-central1/registries/registry0/devices/device0` or `projects/p0/locations/us-central1/registries/registry0/devices/{num_id\}`.
    *         name: 'projects/my-project/locations/my-location/registries/my-registrie/devices/my-device',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "binaryData": "my_binaryData",
    *           //   "versionToUpdate": "my_versionToUpdate"
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "binaryData": "my_binaryData",
    *   //   "cloudUpdateTime": "my_cloudUpdateTime",
    *   //   "deviceAckTime": "my_deviceAckTime",
    *   //   "version": "my_version"
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
  def modifyCloudToDeviceConfig(
    params: ParamsResourceProjectsLocationsRegistriesDevicesModifycloudtodeviceconfig,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def modifyCloudToDeviceConfig(
    params: ParamsResourceProjectsLocationsRegistriesDevicesModifycloudtodeviceconfig,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaDevice] = js.native
  def patch(callback: BodyResponseCallback[SchemaDevice]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDevice] = js.native
  def patch(params: ParamsResourceProjectsLocationsRegistriesDevicesPatch): GaxiosPromise[SchemaDevice] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsRegistriesDevicesPatch,
    callback: BodyResponseCallback[SchemaDevice]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsRegistriesDevicesPatch,
    options: BodyResponseCallback[Readable | SchemaDevice],
    callback: BodyResponseCallback[Readable | SchemaDevice]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsRegistriesDevicesPatch, options: MethodOptions): GaxiosPromise[SchemaDevice] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsRegistriesDevicesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDevice]
  ): Unit = js.native
  /**
    * Updates a device.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudiot.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudiot = google.cloudiot('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloudiot',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudiot.projects.locations.registries.devices.patch({
    *     // The resource path name. For example, `projects/p1/locations/us-central1/registries/registry0/devices/dev0` or `projects/p1/locations/us-central1/registries/registry0/devices/{num_id\}`. When `name` is populated as a response from the service, it always ends in the device numeric ID.
    *     name: 'projects/my-project/locations/my-location/registries/my-registrie/devices/my-device',
    *     // Required. Only updates the `device` fields indicated by this mask. The field mask must not be empty, and it must not contain fields that are immutable or only set by the server. Mutable top-level fields: `credentials`, `blocked`, and `metadata`
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "blocked": false,
    *       //   "config": {},
    *       //   "credentials": [],
    *       //   "gatewayConfig": {},
    *       //   "id": "my_id",
    *       //   "lastConfigAckTime": "my_lastConfigAckTime",
    *       //   "lastConfigSendTime": "my_lastConfigSendTime",
    *       //   "lastErrorStatus": {},
    *       //   "lastErrorTime": "my_lastErrorTime",
    *       //   "lastEventTime": "my_lastEventTime",
    *       //   "lastHeartbeatTime": "my_lastHeartbeatTime",
    *       //   "lastStateTime": "my_lastStateTime",
    *       //   "logLevel": "my_logLevel",
    *       //   "metadata": {},
    *       //   "name": "my_name",
    *       //   "numId": "my_numId",
    *       //   "state": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "blocked": false,
    *   //   "config": {},
    *   //   "credentials": [],
    *   //   "gatewayConfig": {},
    *   //   "id": "my_id",
    *   //   "lastConfigAckTime": "my_lastConfigAckTime",
    *   //   "lastConfigSendTime": "my_lastConfigSendTime",
    *   //   "lastErrorStatus": {},
    *   //   "lastErrorTime": "my_lastErrorTime",
    *   //   "lastEventTime": "my_lastEventTime",
    *   //   "lastHeartbeatTime": "my_lastHeartbeatTime",
    *   //   "lastStateTime": "my_lastStateTime",
    *   //   "logLevel": "my_logLevel",
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "numId": "my_numId",
    *   //   "state": {}
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
  def patch(params: ParamsResourceProjectsLocationsRegistriesDevicesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsRegistriesDevicesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def sendCommandToDevice(): GaxiosPromise[SchemaSendCommandToDeviceResponse] = js.native
  def sendCommandToDevice(callback: BodyResponseCallback[SchemaSendCommandToDeviceResponse]): Unit = js.native
  def sendCommandToDevice(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSendCommandToDeviceResponse] = js.native
  def sendCommandToDevice(params: ParamsResourceProjectsLocationsRegistriesDevicesSendcommandtodevice): GaxiosPromise[SchemaSendCommandToDeviceResponse] = js.native
  def sendCommandToDevice(
    params: ParamsResourceProjectsLocationsRegistriesDevicesSendcommandtodevice,
    callback: BodyResponseCallback[SchemaSendCommandToDeviceResponse]
  ): Unit = js.native
  def sendCommandToDevice(
    params: ParamsResourceProjectsLocationsRegistriesDevicesSendcommandtodevice,
    options: BodyResponseCallback[Readable | SchemaSendCommandToDeviceResponse],
    callback: BodyResponseCallback[Readable | SchemaSendCommandToDeviceResponse]
  ): Unit = js.native
  def sendCommandToDevice(
    params: ParamsResourceProjectsLocationsRegistriesDevicesSendcommandtodevice,
    options: MethodOptions
  ): GaxiosPromise[SchemaSendCommandToDeviceResponse] = js.native
  def sendCommandToDevice(
    params: ParamsResourceProjectsLocationsRegistriesDevicesSendcommandtodevice,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSendCommandToDeviceResponse]
  ): Unit = js.native
  /**
    * Sends a command to the specified device. In order for a device to be able to receive commands, it must: 1) be connected to Cloud IoT Core using the MQTT protocol, and 2) be subscribed to the group of MQTT topics specified by /devices/{device-id\}/commands/#. This subscription will receive commands at the top-level topic /devices/{device-id\}/commands as well as commands for subfolders, like /devices/{device-id\}/commands/subfolder. Note that subscribing to specific subfolders is not supported. If the command could not be delivered to the device, this method will return an error; in particular, if the device is not subscribed, this method will return FAILED_PRECONDITION. Otherwise, this method will return OK. If the subscription is QoS 1, at least once delivery will be guaranteed; for QoS 0, no acknowledgment will be expected from the device.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudiot.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudiot = google.cloudiot('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloudiot',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await cloudiot.projects.locations.registries.devices.sendCommandToDevice({
    *       // Required. The name of the device. For example, `projects/p0/locations/us-central1/registries/registry0/devices/device0` or `projects/p0/locations/us-central1/registries/registry0/devices/{num_id\}`.
    *       name: 'projects/my-project/locations/my-location/registries/my-registrie/devices/my-device',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "binaryData": "my_binaryData",
    *         //   "subfolder": "my_subfolder"
    *         // }
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
  def sendCommandToDevice(
    params: ParamsResourceProjectsLocationsRegistriesDevicesSendcommandtodevice,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def sendCommandToDevice(
    params: ParamsResourceProjectsLocationsRegistriesDevicesSendcommandtodevice,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var states: ResourceProjectsLocationsRegistriesDevicesStates = js.native
}
