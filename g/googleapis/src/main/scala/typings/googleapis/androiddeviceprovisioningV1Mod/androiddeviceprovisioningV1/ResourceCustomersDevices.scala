package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androiddeviceprovisioning/v1", "androiddeviceprovisioning_v1.Resource$Customers$Devices")
@js.native
open class ResourceCustomersDevices protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def applyConfiguration(): GaxiosPromise[SchemaEmpty] = js.native
  def applyConfiguration(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def applyConfiguration(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def applyConfiguration(params: ParamsResourceCustomersDevicesApplyconfiguration): GaxiosPromise[SchemaEmpty] = js.native
  def applyConfiguration(
    params: ParamsResourceCustomersDevicesApplyconfiguration,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def applyConfiguration(
    params: ParamsResourceCustomersDevicesApplyconfiguration,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def applyConfiguration(params: ParamsResourceCustomersDevicesApplyconfiguration, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def applyConfiguration(
    params: ParamsResourceCustomersDevicesApplyconfiguration,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Applies a Configuration to the device to register the device for zero-touch enrollment. After applying a configuration to a device, the device automatically provisions itself on first boot, or next factory reset.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androiddeviceprovisioning.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androiddeviceprovisioning = google.androiddeviceprovisioning('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await androiddeviceprovisioning.customers.devices.applyConfiguration({
    *       // Required. The customer managing the device. An API resource name in the format `customers/[CUSTOMER_ID]`.
    *       parent: 'customers/my-customer',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "configuration": "my_configuration",
    *         //   "device": {}
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
  def applyConfiguration(params: ParamsResourceCustomersDevicesApplyconfiguration, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def applyConfiguration(
    params: ParamsResourceCustomersDevicesApplyconfiguration,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaDevice] = js.native
  def get(callback: BodyResponseCallback[SchemaDevice]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDevice] = js.native
  def get(params: ParamsResourceCustomersDevicesGet): GaxiosPromise[SchemaDevice] = js.native
  def get(params: ParamsResourceCustomersDevicesGet, callback: BodyResponseCallback[SchemaDevice]): Unit = js.native
  def get(
    params: ParamsResourceCustomersDevicesGet,
    options: BodyResponseCallback[Readable | SchemaDevice],
    callback: BodyResponseCallback[Readable | SchemaDevice]
  ): Unit = js.native
  def get(params: ParamsResourceCustomersDevicesGet, options: MethodOptions): GaxiosPromise[SchemaDevice] = js.native
  def get(
    params: ParamsResourceCustomersDevicesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDevice]
  ): Unit = js.native
  /**
    * Gets the details of a device.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androiddeviceprovisioning.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androiddeviceprovisioning = google.androiddeviceprovisioning('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androiddeviceprovisioning.customers.devices.get({
    *     // Required. The device to get. An API resource name in the format `customers/[CUSTOMER_ID]/devices/[DEVICE_ID]`.
    *     name: 'customers/my-customer/devices/my-device',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "claims": [],
    *   //   "configuration": "my_configuration",
    *   //   "deviceId": "my_deviceId",
    *   //   "deviceIdentifier": {},
    *   //   "deviceMetadata": {},
    *   //   "name": "my_name"
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
  def get(params: ParamsResourceCustomersDevicesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceCustomersDevicesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaCustomerListDevicesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaCustomerListDevicesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomerListDevicesResponse] = js.native
  def list(params: ParamsResourceCustomersDevicesList): GaxiosPromise[SchemaCustomerListDevicesResponse] = js.native
  def list(
    params: ParamsResourceCustomersDevicesList,
    callback: BodyResponseCallback[SchemaCustomerListDevicesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCustomersDevicesList,
    options: BodyResponseCallback[Readable | SchemaCustomerListDevicesResponse],
    callback: BodyResponseCallback[Readable | SchemaCustomerListDevicesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCustomersDevicesList, options: MethodOptions): GaxiosPromise[SchemaCustomerListDevicesResponse] = js.native
  def list(
    params: ParamsResourceCustomersDevicesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomerListDevicesResponse]
  ): Unit = js.native
  /**
    * Lists a customer's devices.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androiddeviceprovisioning.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androiddeviceprovisioning = google.androiddeviceprovisioning('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androiddeviceprovisioning.customers.devices.list({
    *     // The maximum number of devices to show in a page of results. Must be between 1 and 100 inclusive.
    *     pageSize: 'placeholder-value',
    *     // A token specifying which result page to return.
    *     pageToken: 'placeholder-value',
    *     // Required. The customer managing the devices. An API resource name in the format `customers/[CUSTOMER_ID]`.
    *     parent: 'customers/my-customer',
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
  def list(params: ParamsResourceCustomersDevicesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCustomersDevicesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def removeConfiguration(): GaxiosPromise[SchemaEmpty] = js.native
  def removeConfiguration(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def removeConfiguration(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def removeConfiguration(params: ParamsResourceCustomersDevicesRemoveconfiguration): GaxiosPromise[SchemaEmpty] = js.native
  def removeConfiguration(
    params: ParamsResourceCustomersDevicesRemoveconfiguration,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def removeConfiguration(
    params: ParamsResourceCustomersDevicesRemoveconfiguration,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def removeConfiguration(params: ParamsResourceCustomersDevicesRemoveconfiguration, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def removeConfiguration(
    params: ParamsResourceCustomersDevicesRemoveconfiguration,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Removes a configuration from device.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androiddeviceprovisioning.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androiddeviceprovisioning = google.androiddeviceprovisioning('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await androiddeviceprovisioning.customers.devices.removeConfiguration({
    *       // Required. The customer managing the device in the format `customers/[CUSTOMER_ID]`.
    *       parent: 'customers/my-customer',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "device": {}
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
  def removeConfiguration(params: ParamsResourceCustomersDevicesRemoveconfiguration, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def removeConfiguration(
    params: ParamsResourceCustomersDevicesRemoveconfiguration,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def unclaim(): GaxiosPromise[SchemaEmpty] = js.native
  def unclaim(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def unclaim(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def unclaim(params: ParamsResourceCustomersDevicesUnclaim): GaxiosPromise[SchemaEmpty] = js.native
  def unclaim(params: ParamsResourceCustomersDevicesUnclaim, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def unclaim(
    params: ParamsResourceCustomersDevicesUnclaim,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def unclaim(params: ParamsResourceCustomersDevicesUnclaim, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def unclaim(
    params: ParamsResourceCustomersDevicesUnclaim,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Unclaims a device from a customer and removes it from zero-touch enrollment. After removing a device, a customer must contact their reseller to register the device into zero-touch enrollment again.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androiddeviceprovisioning.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androiddeviceprovisioning = google.androiddeviceprovisioning('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androiddeviceprovisioning.customers.devices.unclaim({
    *     // Required. The customer managing the device. An API resource name in the format `customers/[CUSTOMER_ID]`.
    *     parent: 'customers/my-customer',
    *
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
  def unclaim(params: ParamsResourceCustomersDevicesUnclaim, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def unclaim(
    params: ParamsResourceCustomersDevicesUnclaim,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
