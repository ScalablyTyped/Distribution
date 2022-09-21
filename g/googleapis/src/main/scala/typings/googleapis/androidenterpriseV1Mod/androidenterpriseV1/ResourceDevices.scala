package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androidenterprise/v1", "androidenterprise_v1.Resource$Devices")
@js.native
open class ResourceDevices protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def forceReportUpload(): GaxiosPromise[Unit] = js.native
  def forceReportUpload(callback: BodyResponseCallback[Unit]): Unit = js.native
  def forceReportUpload(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def forceReportUpload(params: ParamsResourceDevicesForcereportupload): GaxiosPromise[Unit] = js.native
  def forceReportUpload(params: ParamsResourceDevicesForcereportupload, callback: BodyResponseCallback[Unit]): Unit = js.native
  def forceReportUpload(
    params: ParamsResourceDevicesForcereportupload,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def forceReportUpload(params: ParamsResourceDevicesForcereportupload, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def forceReportUpload(
    params: ParamsResourceDevicesForcereportupload,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Uploads a report containing any changes in app states on the device since the last report was generated. You can call this method up to 3 times every 24 hours for a given device. If you exceed the quota, then the Google Play EMM API returns HTTP 429 Too Many Requests.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidenterprise.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidenterprise = google.androidenterprise('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidenterprise'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidenterprise.devices.forceReportUpload({
    *     // The ID of the device.
    *     deviceId: 'placeholder-value',
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *     // The ID of the user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
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
  def forceReportUpload(params: ParamsResourceDevicesForcereportupload, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def forceReportUpload(
    params: ParamsResourceDevicesForcereportupload,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
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
    * Retrieves the details of a device.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidenterprise.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidenterprise = google.androidenterprise('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidenterprise'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidenterprise.devices.get({
    *     // The ID of the device.
    *     deviceId: 'placeholder-value',
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *     // The ID of the user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "androidId": "my_androidId",
    *   //   "managementType": "my_managementType",
    *   //   "policy": {},
    *   //   "report": {}
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
  
  def getState(): GaxiosPromise[SchemaDeviceState] = js.native
  def getState(callback: BodyResponseCallback[SchemaDeviceState]): Unit = js.native
  def getState(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDeviceState] = js.native
  def getState(params: ParamsResourceDevicesGetstate): GaxiosPromise[SchemaDeviceState] = js.native
  def getState(params: ParamsResourceDevicesGetstate, callback: BodyResponseCallback[SchemaDeviceState]): Unit = js.native
  def getState(
    params: ParamsResourceDevicesGetstate,
    options: BodyResponseCallback[Readable | SchemaDeviceState],
    callback: BodyResponseCallback[Readable | SchemaDeviceState]
  ): Unit = js.native
  def getState(params: ParamsResourceDevicesGetstate, options: MethodOptions): GaxiosPromise[SchemaDeviceState] = js.native
  def getState(
    params: ParamsResourceDevicesGetstate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDeviceState]
  ): Unit = js.native
  /**
    * Retrieves whether a device's access to Google services is enabled or disabled. The device state takes effect only if enforcing EMM policies on Android devices is enabled in the Google Admin Console. Otherwise, the device state is ignored and all devices are allowed access to Google services. This is only supported for Google-managed users.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidenterprise.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidenterprise = google.androidenterprise('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidenterprise'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidenterprise.devices.getState({
    *     // The ID of the device.
    *     deviceId: 'placeholder-value',
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *     // The ID of the user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountState": "my_accountState"
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
  def getState(params: ParamsResourceDevicesGetstate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getState(
    params: ParamsResourceDevicesGetstate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaDevicesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaDevicesListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDevicesListResponse] = js.native
  def list(params: ParamsResourceDevicesList): GaxiosPromise[SchemaDevicesListResponse] = js.native
  def list(params: ParamsResourceDevicesList, callback: BodyResponseCallback[SchemaDevicesListResponse]): Unit = js.native
  def list(
    params: ParamsResourceDevicesList,
    options: BodyResponseCallback[Readable | SchemaDevicesListResponse],
    callback: BodyResponseCallback[Readable | SchemaDevicesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceDevicesList, options: MethodOptions): GaxiosPromise[SchemaDevicesListResponse] = js.native
  def list(
    params: ParamsResourceDevicesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDevicesListResponse]
  ): Unit = js.native
  /**
    * Retrieves the IDs of all of a user's devices.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidenterprise.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidenterprise = google.androidenterprise('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidenterprise'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidenterprise.devices.list({
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *     // The ID of the user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "device": []
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
  
  def setState(): GaxiosPromise[SchemaDeviceState] = js.native
  def setState(callback: BodyResponseCallback[SchemaDeviceState]): Unit = js.native
  def setState(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDeviceState] = js.native
  def setState(params: ParamsResourceDevicesSetstate): GaxiosPromise[SchemaDeviceState] = js.native
  def setState(params: ParamsResourceDevicesSetstate, callback: BodyResponseCallback[SchemaDeviceState]): Unit = js.native
  def setState(
    params: ParamsResourceDevicesSetstate,
    options: BodyResponseCallback[Readable | SchemaDeviceState],
    callback: BodyResponseCallback[Readable | SchemaDeviceState]
  ): Unit = js.native
  def setState(params: ParamsResourceDevicesSetstate, options: MethodOptions): GaxiosPromise[SchemaDeviceState] = js.native
  def setState(
    params: ParamsResourceDevicesSetstate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDeviceState]
  ): Unit = js.native
  /**
    * Sets whether a device's access to Google services is enabled or disabled. The device state takes effect only if enforcing EMM policies on Android devices is enabled in the Google Admin Console. Otherwise, the device state is ignored and all devices are allowed access to Google services. This is only supported for Google-managed users.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidenterprise.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidenterprise = google.androidenterprise('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidenterprise'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidenterprise.devices.setState({
    *     // The ID of the device.
    *     deviceId: 'placeholder-value',
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *     // The ID of the user.
    *     userId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountState": "my_accountState"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountState": "my_accountState"
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
  def setState(params: ParamsResourceDevicesSetstate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setState(
    params: ParamsResourceDevicesSetstate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaDevice] = js.native
  def update(callback: BodyResponseCallback[SchemaDevice]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDevice] = js.native
  def update(params: ParamsResourceDevicesUpdate): GaxiosPromise[SchemaDevice] = js.native
  def update(params: ParamsResourceDevicesUpdate, callback: BodyResponseCallback[SchemaDevice]): Unit = js.native
  def update(
    params: ParamsResourceDevicesUpdate,
    options: BodyResponseCallback[Readable | SchemaDevice],
    callback: BodyResponseCallback[Readable | SchemaDevice]
  ): Unit = js.native
  def update(params: ParamsResourceDevicesUpdate, options: MethodOptions): GaxiosPromise[SchemaDevice] = js.native
  def update(
    params: ParamsResourceDevicesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDevice]
  ): Unit = js.native
  /**
    * Updates the device policy. To ensure the policy is properly enforced, you need to prevent unmanaged accounts from accessing Google Play by setting the allowed_accounts in the managed configuration for the Google Play package. See restrict accounts in Google Play. When provisioning a new device, you should set the device policy using this method before adding the managed Google Play Account to the device, otherwise the policy will not be applied for a short period of time after adding the account to the device.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidenterprise.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidenterprise = google.androidenterprise('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidenterprise'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidenterprise.devices.update({
    *     // The ID of the device.
    *     deviceId: 'placeholder-value',
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *     // Mask that identifies which fields to update. If not set, all modifiable fields will be modified. When set in a query parameter, this field should be specified as updateMask=<field1\>,<field2\>,...
    *     updateMask: 'placeholder-value',
    *     // The ID of the user.
    *     userId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "androidId": "my_androidId",
    *       //   "managementType": "my_managementType",
    *       //   "policy": {},
    *       //   "report": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "androidId": "my_androidId",
    *   //   "managementType": "my_managementType",
    *   //   "policy": {},
    *   //   "report": {}
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
  def update(params: ParamsResourceDevicesUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceDevicesUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
