package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudidentity/v1beta1", "cloudidentity_v1beta1.Resource$Devices")
@js.native
open class ResourceDevices protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def cancelWipe(): GaxiosPromise[SchemaOperation] = js.native
  def cancelWipe(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def cancelWipe(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def cancelWipe(params: ParamsResourceDevicesCancelwipe): GaxiosPromise[SchemaOperation] = js.native
  def cancelWipe(params: ParamsResourceDevicesCancelwipe, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def cancelWipe(
    params: ParamsResourceDevicesCancelwipe,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def cancelWipe(params: ParamsResourceDevicesCancelwipe, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def cancelWipe(
    params: ParamsResourceDevicesCancelwipe,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Cancels an unfinished device wipe. This operation can be used to cancel device wipe in the gap between the wipe operation returning success and the device being wiped.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudidentity.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudidentity = google.cloudidentity('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-identity',
    *       'https://www.googleapis.com/auth/cloud-identity.devices',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudidentity.devices.cancelWipe({
    *     // Required. [Resource name](https://cloud.google.com/apis/design/resource_names) of the Device in format: `devices/{device_id\}`, where device_id is the unique ID assigned to the Device.
    *     name: 'devices/my-device',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
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
  def cancelWipe(params: ParamsResourceDevicesCancelwipe, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def cancelWipe(
    params: ParamsResourceDevicesCancelwipe,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceDevicesCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceDevicesCreate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(
    params: ParamsResourceDevicesCreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceDevicesCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceDevicesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Creates a device. Only company-owned device may be created. **Note**: This method is available only to customers who have one of the following SKUs: Enterprise Standard, Enterprise Plus, Enterprise for Education, and Cloud Identity Premium
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudidentity.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudidentity = google.cloudidentity('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-identity',
    *       'https://www.googleapis.com/auth/cloud-identity.devices',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudidentity.devices.create({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "device": {}
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
  def create(params: ParamsResourceDevicesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceDevicesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceDevicesDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceDevicesDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceDevicesDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceDevicesDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceDevicesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Deletes the specified device.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudidentity.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudidentity = google.cloudidentity('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-identity',
    *       'https://www.googleapis.com/auth/cloud-identity.devices',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudidentity.devices.delete({
    *     // Required. [Resource name](https://cloud.google.com/apis/design/resource_names) of the Device in format: `devices/{device_id\}`, where device_id is the unique ID assigned to the Device.
    *     name: 'devices/my-device',
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
  def delete(params: ParamsResourceDevicesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceDevicesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var deviceUsers: ResourceDevicesDeviceusers = js.native
  
  def get(): GaxiosPromise[SchemaDevice] = js.native
  def get(callback: BodyResponseCallback[SchemaDevice]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDevice] = js.native
  def get(params: ParamsResourceDevicesGet): GaxiosPromise[SchemaDevice] = js.native
  def get(params: ParamsResourceDevicesGet, callback: BodyResponseCallback[SchemaDevice]): Unit = js.native
  def get(
    params: ParamsResourceDevicesGet,
    options: BodyResponseCallback[Readable | SchemaDevice],
    callback: BodyResponseCallback[Readable | SchemaDevice]
  ): Unit = js.native
  def get(params: ParamsResourceDevicesGet, options: MethodOptions): GaxiosPromise[SchemaDevice] = js.native
  def get(
    params: ParamsResourceDevicesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDevice]
  ): Unit = js.native
  /**
    * Retrieves the specified device.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudidentity.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudidentity = google.cloudidentity('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-identity',
    *       'https://www.googleapis.com/auth/cloud-identity.devices',
    *       'https://www.googleapis.com/auth/cloud-identity.devices.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudidentity.devices.get({
    *     // Required. [Resource name](https://cloud.google.com/apis/design/resource_names) of the Device in format: `devices/{device_id\}`, where device_id is the unique ID assigned to the Device.
    *     name: 'devices/my-device',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "androidSpecificAttributes": {},
    *   //   "assetTag": "my_assetTag",
    *   //   "basebandVersion": "my_basebandVersion",
    *   //   "bootloaderVersion": "my_bootloaderVersion",
    *   //   "brand": "my_brand",
    *   //   "buildNumber": "my_buildNumber",
    *   //   "compromisedState": "my_compromisedState",
    *   //   "createTime": "my_createTime",
    *   //   "deviceId": "my_deviceId",
    *   //   "deviceType": "my_deviceType",
    *   //   "enabledDeveloperOptions": false,
    *   //   "enabledUsbDebugging": false,
    *   //   "encryptionState": "my_encryptionState",
    *   //   "endpointVerificationSpecificAttributes": {},
    *   //   "imei": "my_imei",
    *   //   "kernelVersion": "my_kernelVersion",
    *   //   "lastSyncTime": "my_lastSyncTime",
    *   //   "managementState": "my_managementState",
    *   //   "manufacturer": "my_manufacturer",
    *   //   "meid": "my_meid",
    *   //   "model": "my_model",
    *   //   "name": "my_name",
    *   //   "networkOperator": "my_networkOperator",
    *   //   "osVersion": "my_osVersion",
    *   //   "otherAccounts": [],
    *   //   "ownerType": "my_ownerType",
    *   //   "releaseVersion": "my_releaseVersion",
    *   //   "securityPatchTime": "my_securityPatchTime",
    *   //   "serialNumber": "my_serialNumber",
    *   //   "wifiMacAddresses": []
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
  def get(params: ParamsResourceDevicesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceDevicesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListDevicesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListDevicesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListDevicesResponse] = js.native
  def list(params: ParamsResourceDevicesList): GaxiosPromise[SchemaListDevicesResponse] = js.native
  def list(params: ParamsResourceDevicesList, callback: BodyResponseCallback[SchemaListDevicesResponse]): Unit = js.native
  def list(
    params: ParamsResourceDevicesList,
    options: BodyResponseCallback[Readable | SchemaListDevicesResponse],
    callback: BodyResponseCallback[Readable | SchemaListDevicesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceDevicesList, options: MethodOptions): GaxiosPromise[SchemaListDevicesResponse] = js.native
  def list(
    params: ParamsResourceDevicesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListDevicesResponse]
  ): Unit = js.native
  /**
    * Lists/Searches devices.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudidentity.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudidentity = google.cloudidentity('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-identity',
    *       'https://www.googleapis.com/auth/cloud-identity.devices',
    *       'https://www.googleapis.com/auth/cloud-identity.devices.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudidentity.devices.list({
    *     // Optional. Additional restrictions when fetching list of devices. For a list of search fields, refer to [Mobile device search fields](https://developers.google.com/admin-sdk/directory/v1/search-operators). Multiple search fields are separated by the space character.
    *     filter: 'placeholder-value',
    *     // Optional. Order specification for devices in the response. Only one of the following field names may be used to specify the order: `create_time`, `last_sync_time`, `model`, `os_version`, `device_type` and `serial_number`. `desc` may be specified optionally to specify results to be sorted in descending order. Default order is ascending.
    *     orderBy: 'placeholder-value',
    *     // Optional. The maximum number of Devices to return. If unspecified, at most 20 Devices will be returned. The maximum value is 100; values above 100 will be coerced to 100.
    *     pageSize: 'placeholder-value',
    *     // Optional. A page token, received from a previous `ListDevices` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListDevices` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Optional. The view to use for the List request.
    *     view: 'placeholder-value',
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
  def list(params: ParamsResourceDevicesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceDevicesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def wipe(): GaxiosPromise[SchemaOperation] = js.native
  def wipe(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def wipe(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def wipe(params: ParamsResourceDevicesWipe): GaxiosPromise[SchemaOperation] = js.native
  def wipe(params: ParamsResourceDevicesWipe, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def wipe(
    params: ParamsResourceDevicesWipe,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def wipe(params: ParamsResourceDevicesWipe, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def wipe(
    params: ParamsResourceDevicesWipe,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Wipes all data on the specified device.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudidentity.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudidentity = google.cloudidentity('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-identity',
    *       'https://www.googleapis.com/auth/cloud-identity.devices',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudidentity.devices.wipe({
    *     // Required. [Resource name](https://cloud.google.com/apis/design/resource_names) of the Device in format: `devices/{device_id\}/deviceUsers/{device_user_id\}`, where device_id is the unique ID assigned to the Device, and device_user_id is the unique ID assigned to the User.
    *     name: 'devices/my-device',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "removeResetLock": false
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
  def wipe(params: ParamsResourceDevicesWipe, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def wipe(
    params: ParamsResourceDevicesWipe,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
