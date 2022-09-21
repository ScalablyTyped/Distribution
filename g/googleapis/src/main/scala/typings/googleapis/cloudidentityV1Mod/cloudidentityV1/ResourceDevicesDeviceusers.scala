package typings.googleapis.cloudidentityV1Mod.cloudidentityV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudidentity/v1", "cloudidentity_v1.Resource$Devices$Deviceusers")
@js.native
open class ResourceDevicesDeviceusers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def approve(): GaxiosPromise[SchemaOperation] = js.native
  def approve(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def approve(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def approve(params: ParamsResourceDevicesDeviceusersApprove): GaxiosPromise[SchemaOperation] = js.native
  def approve(params: ParamsResourceDevicesDeviceusersApprove, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def approve(
    params: ParamsResourceDevicesDeviceusersApprove,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def approve(params: ParamsResourceDevicesDeviceusersApprove, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def approve(
    params: ParamsResourceDevicesDeviceusersApprove,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Approves device to access user data.
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
    * const cloudidentity = google.cloudidentity('v1');
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
    *   const res = await cloudidentity.devices.deviceUsers.approve({
    *     // Required. [Resource name](https://cloud.google.com/apis/design/resource_names) of the Device in format: `devices/{device\}/deviceUsers/{device_user\}`, where device is the unique ID assigned to the Device, and device_user is the unique ID assigned to the User.
    *     name: 'devices/my-device/deviceUsers/my-deviceUser',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "customer": "my_customer"
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
  def approve(params: ParamsResourceDevicesDeviceusersApprove, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def approve(
    params: ParamsResourceDevicesDeviceusersApprove,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def block(): GaxiosPromise[SchemaOperation] = js.native
  def block(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def block(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def block(params: ParamsResourceDevicesDeviceusersBlock): GaxiosPromise[SchemaOperation] = js.native
  def block(params: ParamsResourceDevicesDeviceusersBlock, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def block(
    params: ParamsResourceDevicesDeviceusersBlock,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def block(params: ParamsResourceDevicesDeviceusersBlock, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def block(
    params: ParamsResourceDevicesDeviceusersBlock,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Blocks device from accessing user data
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
    * const cloudidentity = google.cloudidentity('v1');
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
    *   const res = await cloudidentity.devices.deviceUsers.block({
    *     // Required. [Resource name](https://cloud.google.com/apis/design/resource_names) of the Device in format: `devices/{device\}/deviceUsers/{device_user\}`, where device is the unique ID assigned to the Device, and device_user is the unique ID assigned to the User.
    *     name: 'devices/my-device/deviceUsers/my-deviceUser',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "customer": "my_customer"
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
  def block(params: ParamsResourceDevicesDeviceusersBlock, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def block(
    params: ParamsResourceDevicesDeviceusersBlock,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def cancelWipe(): GaxiosPromise[SchemaOperation] = js.native
  def cancelWipe(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def cancelWipe(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def cancelWipe(params: ParamsResourceDevicesDeviceusersCancelwipe): GaxiosPromise[SchemaOperation] = js.native
  def cancelWipe(
    params: ParamsResourceDevicesDeviceusersCancelwipe,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def cancelWipe(
    params: ParamsResourceDevicesDeviceusersCancelwipe,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def cancelWipe(params: ParamsResourceDevicesDeviceusersCancelwipe, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def cancelWipe(
    params: ParamsResourceDevicesDeviceusersCancelwipe,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Cancels an unfinished user account wipe. This operation can be used to cancel device wipe in the gap between the wipe operation returning success and the device being wiped.
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
    * const cloudidentity = google.cloudidentity('v1');
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
    *   const res = await cloudidentity.devices.deviceUsers.cancelWipe({
    *     // Required. [Resource name](https://cloud.google.com/apis/design/resource_names) of the Device in format: `devices/{device\}/deviceUsers/{device_user\}`, where device is the unique ID assigned to the Device, and device_user is the unique ID assigned to the User.
    *     name: 'devices/my-device/deviceUsers/my-deviceUser',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "customer": "my_customer"
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
  def cancelWipe(params: ParamsResourceDevicesDeviceusersCancelwipe, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def cancelWipe(
    params: ParamsResourceDevicesDeviceusersCancelwipe,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var clientStates: ResourceDevicesDeviceusersClientstates = js.native
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceDevicesDeviceusersDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceDevicesDeviceusersDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceDevicesDeviceusersDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceDevicesDeviceusersDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceDevicesDeviceusersDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Deletes the specified DeviceUser. This also revokes the user's access to device data.
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
    * const cloudidentity = google.cloudidentity('v1');
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
    *   const res = await cloudidentity.devices.deviceUsers.delete({
    *     // Optional. [Resource name](https://cloud.google.com/apis/design/resource_names) of the customer. If you're using this API for your own organization, use `customers/my_customer` If you're using this API to manage another organization, use `customers/{customer\}`, where customer is the customer to whom the device belongs.
    *     customer: 'placeholder-value',
    *     // Required. [Resource name](https://cloud.google.com/apis/design/resource_names) of the Device in format: `devices/{device\}/deviceUsers/{device_user\}`, where device is the unique ID assigned to the Device, and device_user is the unique ID assigned to the User.
    *     name: 'devices/my-device/deviceUsers/my-deviceUser',
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
  def delete(params: ParamsResourceDevicesDeviceusersDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceDevicesDeviceusersDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleAppsCloudidentityDevicesV1DeviceUser] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleAppsCloudidentityDevicesV1DeviceUser]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAppsCloudidentityDevicesV1DeviceUser] = js.native
  def get(params: ParamsResourceDevicesDeviceusersGet): GaxiosPromise[SchemaGoogleAppsCloudidentityDevicesV1DeviceUser] = js.native
  def get(
    params: ParamsResourceDevicesDeviceusersGet,
    callback: BodyResponseCallback[SchemaGoogleAppsCloudidentityDevicesV1DeviceUser]
  ): Unit = js.native
  def get(
    params: ParamsResourceDevicesDeviceusersGet,
    options: BodyResponseCallback[Readable | SchemaGoogleAppsCloudidentityDevicesV1DeviceUser],
    callback: BodyResponseCallback[Readable | SchemaGoogleAppsCloudidentityDevicesV1DeviceUser]
  ): Unit = js.native
  def get(params: ParamsResourceDevicesDeviceusersGet, options: MethodOptions): GaxiosPromise[SchemaGoogleAppsCloudidentityDevicesV1DeviceUser] = js.native
  def get(
    params: ParamsResourceDevicesDeviceusersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAppsCloudidentityDevicesV1DeviceUser]
  ): Unit = js.native
  /**
    * Retrieves the specified DeviceUser
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
    * const cloudidentity = google.cloudidentity('v1');
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
    *   const res = await cloudidentity.devices.deviceUsers.get({
    *     // Optional. [Resource name](https://cloud.google.com/apis/design/resource_names) of the customer. If you're using this API for your own organization, use `customers/my_customer` If you're using this API to manage another organization, use `customers/{customer\}`, where customer is the customer to whom the device belongs.
    *     customer: 'placeholder-value',
    *     // Required. [Resource name](https://cloud.google.com/apis/design/resource_names) of the Device in format: `devices/{device\}/deviceUsers/{device_user\}`, where device is the unique ID assigned to the Device, and device_user is the unique ID assigned to the User.
    *     name: 'devices/my-device/deviceUsers/my-deviceUser',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "compromisedState": "my_compromisedState",
    *   //   "createTime": "my_createTime",
    *   //   "firstSyncTime": "my_firstSyncTime",
    *   //   "languageCode": "my_languageCode",
    *   //   "lastSyncTime": "my_lastSyncTime",
    *   //   "managementState": "my_managementState",
    *   //   "name": "my_name",
    *   //   "passwordState": "my_passwordState",
    *   //   "userAgent": "my_userAgent",
    *   //   "userEmail": "my_userEmail"
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
  def get(params: ParamsResourceDevicesDeviceusersGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceDevicesDeviceusersGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleAppsCloudidentityDevicesV1ListDeviceUsersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleAppsCloudidentityDevicesV1ListDeviceUsersResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAppsCloudidentityDevicesV1ListDeviceUsersResponse] = js.native
  def list(params: ParamsResourceDevicesDeviceusersList): GaxiosPromise[SchemaGoogleAppsCloudidentityDevicesV1ListDeviceUsersResponse] = js.native
  def list(
    params: ParamsResourceDevicesDeviceusersList,
    callback: BodyResponseCallback[SchemaGoogleAppsCloudidentityDevicesV1ListDeviceUsersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceDevicesDeviceusersList,
    options: BodyResponseCallback[Readable | SchemaGoogleAppsCloudidentityDevicesV1ListDeviceUsersResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleAppsCloudidentityDevicesV1ListDeviceUsersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceDevicesDeviceusersList, options: MethodOptions): GaxiosPromise[SchemaGoogleAppsCloudidentityDevicesV1ListDeviceUsersResponse] = js.native
  def list(
    params: ParamsResourceDevicesDeviceusersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAppsCloudidentityDevicesV1ListDeviceUsersResponse]
  ): Unit = js.native
  /**
    * Lists/Searches DeviceUsers.
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
    * const cloudidentity = google.cloudidentity('v1');
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
    *   const res = await cloudidentity.devices.deviceUsers.list({
    *     // Optional. [Resource name](https://cloud.google.com/apis/design/resource_names) of the customer. If you're using this API for your own organization, use `customers/my_customer` If you're using this API to manage another organization, use `customers/{customer\}`, where customer is the customer to whom the device belongs.
    *     customer: 'placeholder-value',
    *     // Optional. Additional restrictions when fetching list of devices. For a list of search fields, refer to [Mobile device search fields](https://developers.google.com/admin-sdk/directory/v1/search-operators). Multiple search fields are separated by the space character.
    *     filter: 'placeholder-value',
    *     // Optional. Order specification for devices in the response.
    *     orderBy: 'placeholder-value',
    *     // Optional. The maximum number of DeviceUsers to return. If unspecified, at most 5 DeviceUsers will be returned. The maximum value is 20; values above 20 will be coerced to 20.
    *     pageSize: 'placeholder-value',
    *     // Optional. A page token, received from a previous `ListDeviceUsers` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListBooks` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. To list all DeviceUsers, set this to "devices/-". To list all DeviceUsers owned by a device, set this to the resource name of the device. Format: devices/{device\}
    *     parent: 'devices/my-device',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "deviceUsers": [],
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
  def list(params: ParamsResourceDevicesDeviceusersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceDevicesDeviceusersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def lookup(): GaxiosPromise[SchemaGoogleAppsCloudidentityDevicesV1LookupSelfDeviceUsersResponse] = js.native
  def lookup(
    callback: BodyResponseCallback[SchemaGoogleAppsCloudidentityDevicesV1LookupSelfDeviceUsersResponse]
  ): Unit = js.native
  def lookup(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAppsCloudidentityDevicesV1LookupSelfDeviceUsersResponse] = js.native
  def lookup(params: ParamsResourceDevicesDeviceusersLookup): GaxiosPromise[SchemaGoogleAppsCloudidentityDevicesV1LookupSelfDeviceUsersResponse] = js.native
  def lookup(
    params: ParamsResourceDevicesDeviceusersLookup,
    callback: BodyResponseCallback[SchemaGoogleAppsCloudidentityDevicesV1LookupSelfDeviceUsersResponse]
  ): Unit = js.native
  def lookup(
    params: ParamsResourceDevicesDeviceusersLookup,
    options: BodyResponseCallback[Readable | SchemaGoogleAppsCloudidentityDevicesV1LookupSelfDeviceUsersResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleAppsCloudidentityDevicesV1LookupSelfDeviceUsersResponse]
  ): Unit = js.native
  def lookup(params: ParamsResourceDevicesDeviceusersLookup, options: MethodOptions): GaxiosPromise[SchemaGoogleAppsCloudidentityDevicesV1LookupSelfDeviceUsersResponse] = js.native
  def lookup(
    params: ParamsResourceDevicesDeviceusersLookup,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAppsCloudidentityDevicesV1LookupSelfDeviceUsersResponse]
  ): Unit = js.native
  /**
    * Looks up resource names of the DeviceUsers associated with the caller's credentials, as well as the properties provided in the request. This method must be called with end-user credentials with the scope: https://www.googleapis.com/auth/cloud-identity.devices.lookup If multiple properties are provided, only DeviceUsers having all of these properties are considered as matches - i.e. the query behaves like an AND. Different platforms require different amounts of information from the caller to ensure that the DeviceUser is uniquely identified. - iOS: No properties need to be passed, the caller's credentials are sufficient to identify the corresponding DeviceUser. - Android: Specifying the 'android_id' field is required. - Desktop: Specifying the 'raw_resource_id' field is required.
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
    * const cloudidentity = google.cloudidentity('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-identity.devices.lookup'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudidentity.devices.deviceUsers.lookup({
    *     // Android Id returned by [Settings.Secure#ANDROID_ID](https://developer.android.com/reference/android/provider/Settings.Secure.html#ANDROID_ID).
    *     androidId: 'placeholder-value',
    *     // The maximum number of DeviceUsers to return. If unspecified, at most 20 DeviceUsers will be returned. The maximum value is 20; values above 20 will be coerced to 20.
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous `LookupDeviceUsers` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `LookupDeviceUsers` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Must be set to "devices/-/deviceUsers" to search across all DeviceUser belonging to the user.
    *     parent: 'devices/my-device/deviceUsers',
    *     // Raw Resource Id used by Google Endpoint Verification. If the user is enrolled into Google Endpoint Verification, this id will be saved as the 'device_resource_id' field in the following platform dependent files. Mac: ~/.secureConnect/context_aware_config.json Windows: C:\Users\%USERPROFILE%\.secureConnect\context_aware_config.json Linux: ~/.secureConnect/context_aware_config.json
    *     rawResourceId: 'placeholder-value',
    *     // The user whose DeviceUser's resource name will be fetched. Must be set to 'me' to fetch the DeviceUser's resource name for the calling user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "customer": "my_customer",
    *   //   "names": [],
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
  def lookup(params: ParamsResourceDevicesDeviceusersLookup, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def lookup(
    params: ParamsResourceDevicesDeviceusersLookup,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def wipe(): GaxiosPromise[SchemaOperation] = js.native
  def wipe(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def wipe(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def wipe(params: ParamsResourceDevicesDeviceusersWipe): GaxiosPromise[SchemaOperation] = js.native
  def wipe(params: ParamsResourceDevicesDeviceusersWipe, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def wipe(
    params: ParamsResourceDevicesDeviceusersWipe,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def wipe(params: ParamsResourceDevicesDeviceusersWipe, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def wipe(
    params: ParamsResourceDevicesDeviceusersWipe,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Wipes the user's account on a device. Other data on the device that is not associated with the user's work account is not affected. For example, if a Gmail app is installed on a device that is used for personal and work purposes, and the user is logged in to the Gmail app with their personal account as well as their work account, wiping the "deviceUser" by their work administrator will not affect their personal account within Gmail or other apps such as Photos.
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
    * const cloudidentity = google.cloudidentity('v1');
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
    *   const res = await cloudidentity.devices.deviceUsers.wipe({
    *     // Required. [Resource name](https://cloud.google.com/apis/design/resource_names) of the Device in format: `devices/{device\}/deviceUsers/{device_user\}`, where device is the unique ID assigned to the Device, and device_user is the unique ID assigned to the User.
    *     name: 'devices/my-device/deviceUsers/my-deviceUser',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "customer": "my_customer"
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
  def wipe(params: ParamsResourceDevicesDeviceusersWipe, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def wipe(
    params: ParamsResourceDevicesDeviceusersWipe,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
