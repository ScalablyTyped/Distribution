package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Resource$Applications$Devicetierconfigs")
@js.native
open class ResourceApplicationsDevicetierconfigs protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaDeviceTierConfig] = js.native
  def create(callback: BodyResponseCallback[SchemaDeviceTierConfig]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDeviceTierConfig] = js.native
  def create(params: ParamsResourceApplicationsDevicetierconfigsCreate): GaxiosPromise[SchemaDeviceTierConfig] = js.native
  def create(
    params: ParamsResourceApplicationsDevicetierconfigsCreate,
    callback: BodyResponseCallback[SchemaDeviceTierConfig]
  ): Unit = js.native
  def create(
    params: ParamsResourceApplicationsDevicetierconfigsCreate,
    options: BodyResponseCallback[Readable | SchemaDeviceTierConfig],
    callback: BodyResponseCallback[Readable | SchemaDeviceTierConfig]
  ): Unit = js.native
  def create(params: ParamsResourceApplicationsDevicetierconfigsCreate, options: MethodOptions): GaxiosPromise[SchemaDeviceTierConfig] = js.native
  def create(
    params: ParamsResourceApplicationsDevicetierconfigsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDeviceTierConfig]
  ): Unit = js.native
  /**
    * Creates a new device tier config for an app.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidpublisher.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidpublisher = google.androidpublisher('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidpublisher'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidpublisher.applications.deviceTierConfigs.create({
    *     // Whether the service should accept device IDs that are unknown to Play's device catalog.
    *     allowUnknownDevices: 'placeholder-value',
    *     // Package name of the app.
    *     packageName: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "deviceGroups": [],
    *       //   "deviceTierConfigId": "my_deviceTierConfigId",
    *       //   "deviceTierSet": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "deviceGroups": [],
    *   //   "deviceTierConfigId": "my_deviceTierConfigId",
    *   //   "deviceTierSet": {}
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
  def create(params: ParamsResourceApplicationsDevicetierconfigsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceApplicationsDevicetierconfigsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaDeviceTierConfig] = js.native
  def get(callback: BodyResponseCallback[SchemaDeviceTierConfig]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDeviceTierConfig] = js.native
  def get(params: ParamsResourceApplicationsDevicetierconfigsGet): GaxiosPromise[SchemaDeviceTierConfig] = js.native
  def get(
    params: ParamsResourceApplicationsDevicetierconfigsGet,
    callback: BodyResponseCallback[SchemaDeviceTierConfig]
  ): Unit = js.native
  def get(
    params: ParamsResourceApplicationsDevicetierconfigsGet,
    options: BodyResponseCallback[Readable | SchemaDeviceTierConfig],
    callback: BodyResponseCallback[Readable | SchemaDeviceTierConfig]
  ): Unit = js.native
  def get(params: ParamsResourceApplicationsDevicetierconfigsGet, options: MethodOptions): GaxiosPromise[SchemaDeviceTierConfig] = js.native
  def get(
    params: ParamsResourceApplicationsDevicetierconfigsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDeviceTierConfig]
  ): Unit = js.native
  /**
    * Returns a particular device tier config.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidpublisher.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidpublisher = google.androidpublisher('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidpublisher'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidpublisher.applications.deviceTierConfigs.get({
    *     // Required. Id of an existing device tier config.
    *     deviceTierConfigId: 'placeholder-value',
    *     // Package name of the app.
    *     packageName: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "deviceGroups": [],
    *   //   "deviceTierConfigId": "my_deviceTierConfigId",
    *   //   "deviceTierSet": {}
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
  def get(params: ParamsResourceApplicationsDevicetierconfigsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceApplicationsDevicetierconfigsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListDeviceTierConfigsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListDeviceTierConfigsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListDeviceTierConfigsResponse] = js.native
  def list(params: ParamsResourceApplicationsDevicetierconfigsList): GaxiosPromise[SchemaListDeviceTierConfigsResponse] = js.native
  def list(
    params: ParamsResourceApplicationsDevicetierconfigsList,
    callback: BodyResponseCallback[SchemaListDeviceTierConfigsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceApplicationsDevicetierconfigsList,
    options: BodyResponseCallback[Readable | SchemaListDeviceTierConfigsResponse],
    callback: BodyResponseCallback[Readable | SchemaListDeviceTierConfigsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceApplicationsDevicetierconfigsList, options: MethodOptions): GaxiosPromise[SchemaListDeviceTierConfigsResponse] = js.native
  def list(
    params: ParamsResourceApplicationsDevicetierconfigsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListDeviceTierConfigsResponse]
  ): Unit = js.native
  /**
    * Returns created device tier configs, ordered by descending creation time.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidpublisher.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidpublisher = google.androidpublisher('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidpublisher'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidpublisher.applications.deviceTierConfigs.list({
    *     // Package name of the app.
    *     packageName: 'placeholder-value',
    *     // The maximum number of device tier configs to return. The service may return fewer than this value. If unspecified, at most 10 device tier configs will be returned. The maximum value for this field is 100; values above 100 will be coerced to 100. Device tier configs will be ordered by descending creation time.
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous `ListDeviceTierConfigs` call. Provide this to retrieve the subsequent page.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "deviceTierConfigs": [],
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
  def list(params: ParamsResourceApplicationsDevicetierconfigsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceApplicationsDevicetierconfigsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
