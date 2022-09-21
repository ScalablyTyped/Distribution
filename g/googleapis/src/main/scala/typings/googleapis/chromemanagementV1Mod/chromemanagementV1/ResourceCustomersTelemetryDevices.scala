package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/chromemanagement/v1", "chromemanagement_v1.Resource$Customers$Telemetry$Devices")
@js.native
open class ResourceCustomersTelemetryDevices protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaGoogleChromeManagementV1TelemetryDevice] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleChromeManagementV1TelemetryDevice]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleChromeManagementV1TelemetryDevice] = js.native
  def get(params: ParamsResourceCustomersTelemetryDevicesGet): GaxiosPromise[SchemaGoogleChromeManagementV1TelemetryDevice] = js.native
  def get(
    params: ParamsResourceCustomersTelemetryDevicesGet,
    callback: BodyResponseCallback[SchemaGoogleChromeManagementV1TelemetryDevice]
  ): Unit = js.native
  def get(
    params: ParamsResourceCustomersTelemetryDevicesGet,
    options: BodyResponseCallback[Readable | SchemaGoogleChromeManagementV1TelemetryDevice],
    callback: BodyResponseCallback[Readable | SchemaGoogleChromeManagementV1TelemetryDevice]
  ): Unit = js.native
  def get(params: ParamsResourceCustomersTelemetryDevicesGet, options: MethodOptions): GaxiosPromise[SchemaGoogleChromeManagementV1TelemetryDevice] = js.native
  def get(
    params: ParamsResourceCustomersTelemetryDevicesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleChromeManagementV1TelemetryDevice]
  ): Unit = js.native
  /**
    * Get telemetry device.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/chromemanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const chromemanagement = google.chromemanagement('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/chrome.management.telemetry.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await chromemanagement.customers.telemetry.devices.get({
    *     // Required. Name of the `TelemetryDevice` to return.
    *     name: 'customers/my-customer/telemetry/devices/my-device',
    *     // Required. Read mask to specify which fields to return.
    *     readMask: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "audioStatusReport": [],
    *   //   "batteryInfo": [],
    *   //   "batteryStatusReport": [],
    *   //   "cpuInfo": [],
    *   //   "cpuStatusReport": [],
    *   //   "customer": "my_customer",
    *   //   "deviceId": "my_deviceId",
    *   //   "graphicsInfo": {},
    *   //   "graphicsStatusReport": [],
    *   //   "memoryInfo": {},
    *   //   "memoryStatusReport": [],
    *   //   "name": "my_name",
    *   //   "networkDiagnosticsReport": [],
    *   //   "networkInfo": {},
    *   //   "networkStatusReport": [],
    *   //   "orgUnitId": "my_orgUnitId",
    *   //   "osUpdateStatus": [],
    *   //   "serialNumber": "my_serialNumber",
    *   //   "storageInfo": {},
    *   //   "storageStatusReport": [],
    *   //   "thunderboltInfo": []
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
  def get(params: ParamsResourceCustomersTelemetryDevicesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceCustomersTelemetryDevicesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleChromeManagementV1ListTelemetryDevicesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleChromeManagementV1ListTelemetryDevicesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleChromeManagementV1ListTelemetryDevicesResponse] = js.native
  def list(params: ParamsResourceCustomersTelemetryDevicesList): GaxiosPromise[SchemaGoogleChromeManagementV1ListTelemetryDevicesResponse] = js.native
  def list(
    params: ParamsResourceCustomersTelemetryDevicesList,
    callback: BodyResponseCallback[SchemaGoogleChromeManagementV1ListTelemetryDevicesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCustomersTelemetryDevicesList,
    options: BodyResponseCallback[Readable | SchemaGoogleChromeManagementV1ListTelemetryDevicesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleChromeManagementV1ListTelemetryDevicesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCustomersTelemetryDevicesList, options: MethodOptions): GaxiosPromise[SchemaGoogleChromeManagementV1ListTelemetryDevicesResponse] = js.native
  def list(
    params: ParamsResourceCustomersTelemetryDevicesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleChromeManagementV1ListTelemetryDevicesResponse]
  ): Unit = js.native
  /**
    * List all telemetry devices.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/chromemanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const chromemanagement = google.chromemanagement('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/chrome.management.telemetry.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await chromemanagement.customers.telemetry.devices.list({
    *     // Optional. Only include resources that match the filter. Supported filter fields: - org_unit_id - serial_number - device_id
    *     filter: 'placeholder-value',
    *     // Maximum number of results to return. Default value is 100. Maximum value is 1000.
    *     pageSize: 'placeholder-value',
    *     // Token to specify next page in the list.
    *     pageToken: 'placeholder-value',
    *     // Required. Customer id or "my_customer" to use the customer associated to the account making the request.
    *     parent: 'customers/my-customer',
    *     // Required. Read mask to specify which fields to return.
    *     readMask: 'placeholder-value',
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
  def list(params: ParamsResourceCustomersTelemetryDevicesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCustomersTelemetryDevicesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
