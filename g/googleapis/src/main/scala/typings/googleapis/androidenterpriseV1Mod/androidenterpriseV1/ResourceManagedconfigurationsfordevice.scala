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

@JSImport("googleapis/build/src/apis/androidenterprise/v1", "androidenterprise_v1.Resource$Managedconfigurationsfordevice")
@js.native
open class ResourceManagedconfigurationsfordevice protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceManagedconfigurationsfordeviceDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceManagedconfigurationsfordeviceDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceManagedconfigurationsfordeviceDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceManagedconfigurationsfordeviceDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceManagedconfigurationsfordeviceDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Removes a per-device managed configuration for an app for the specified device.
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
    *   const res = await androidenterprise.managedconfigurationsfordevice.delete({
    *     // The Android ID of the device.
    *     deviceId: 'placeholder-value',
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *     // The ID of the managed configuration (a product ID), e.g. "app:com.google.android.gm".
    *     managedConfigurationForDeviceId: 'placeholder-value',
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
  def delete(params: ParamsResourceManagedconfigurationsfordeviceDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceManagedconfigurationsfordeviceDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaManagedConfiguration] = js.native
  def get(callback: BodyResponseCallback[SchemaManagedConfiguration]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaManagedConfiguration] = js.native
  def get(params: ParamsResourceManagedconfigurationsfordeviceGet): GaxiosPromise[SchemaManagedConfiguration] = js.native
  def get(
    params: ParamsResourceManagedconfigurationsfordeviceGet,
    callback: BodyResponseCallback[SchemaManagedConfiguration]
  ): Unit = js.native
  def get(
    params: ParamsResourceManagedconfigurationsfordeviceGet,
    options: BodyResponseCallback[Readable | SchemaManagedConfiguration],
    callback: BodyResponseCallback[Readable | SchemaManagedConfiguration]
  ): Unit = js.native
  def get(params: ParamsResourceManagedconfigurationsfordeviceGet, options: MethodOptions): GaxiosPromise[SchemaManagedConfiguration] = js.native
  def get(
    params: ParamsResourceManagedconfigurationsfordeviceGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaManagedConfiguration]
  ): Unit = js.native
  /**
    * Retrieves details of a per-device managed configuration.
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
    *   const res = await androidenterprise.managedconfigurationsfordevice.get({
    *     // The Android ID of the device.
    *     deviceId: 'placeholder-value',
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *     // The ID of the managed configuration (a product ID), e.g. "app:com.google.android.gm".
    *     managedConfigurationForDeviceId: 'placeholder-value',
    *     // The ID of the user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "configurationVariables": {},
    *   //   "kind": "my_kind",
    *   //   "managedProperty": [],
    *   //   "productId": "my_productId"
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
  def get(params: ParamsResourceManagedconfigurationsfordeviceGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceManagedconfigurationsfordeviceGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaManagedConfigurationsForDeviceListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaManagedConfigurationsForDeviceListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaManagedConfigurationsForDeviceListResponse] = js.native
  def list(params: ParamsResourceManagedconfigurationsfordeviceList): GaxiosPromise[SchemaManagedConfigurationsForDeviceListResponse] = js.native
  def list(
    params: ParamsResourceManagedconfigurationsfordeviceList,
    callback: BodyResponseCallback[SchemaManagedConfigurationsForDeviceListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceManagedconfigurationsfordeviceList,
    options: BodyResponseCallback[Readable | SchemaManagedConfigurationsForDeviceListResponse],
    callback: BodyResponseCallback[Readable | SchemaManagedConfigurationsForDeviceListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceManagedconfigurationsfordeviceList, options: MethodOptions): GaxiosPromise[SchemaManagedConfigurationsForDeviceListResponse] = js.native
  def list(
    params: ParamsResourceManagedconfigurationsfordeviceList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaManagedConfigurationsForDeviceListResponse]
  ): Unit = js.native
  /**
    * Lists all the per-device managed configurations for the specified device. Only the ID is set.
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
    *   const res = await androidenterprise.managedconfigurationsfordevice.list({
    *     // The Android ID of the device.
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
    *   //   "managedConfigurationForDevice": []
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
  def list(params: ParamsResourceManagedconfigurationsfordeviceList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceManagedconfigurationsfordeviceList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaManagedConfiguration] = js.native
  def update(callback: BodyResponseCallback[SchemaManagedConfiguration]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaManagedConfiguration] = js.native
  def update(params: ParamsResourceManagedconfigurationsfordeviceUpdate): GaxiosPromise[SchemaManagedConfiguration] = js.native
  def update(
    params: ParamsResourceManagedconfigurationsfordeviceUpdate,
    callback: BodyResponseCallback[SchemaManagedConfiguration]
  ): Unit = js.native
  def update(
    params: ParamsResourceManagedconfigurationsfordeviceUpdate,
    options: BodyResponseCallback[Readable | SchemaManagedConfiguration],
    callback: BodyResponseCallback[Readable | SchemaManagedConfiguration]
  ): Unit = js.native
  def update(params: ParamsResourceManagedconfigurationsfordeviceUpdate, options: MethodOptions): GaxiosPromise[SchemaManagedConfiguration] = js.native
  def update(
    params: ParamsResourceManagedconfigurationsfordeviceUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaManagedConfiguration]
  ): Unit = js.native
  /**
    * Adds or updates a per-device managed configuration for an app for the specified device.
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
    *   const res = await androidenterprise.managedconfigurationsfordevice.update({
    *     // The Android ID of the device.
    *     deviceId: 'placeholder-value',
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *     // The ID of the managed configuration (a product ID), e.g. "app:com.google.android.gm".
    *     managedConfigurationForDeviceId: 'placeholder-value',
    *     // The ID of the user.
    *     userId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "configurationVariables": {},
    *       //   "kind": "my_kind",
    *       //   "managedProperty": [],
    *       //   "productId": "my_productId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "configurationVariables": {},
    *   //   "kind": "my_kind",
    *   //   "managedProperty": [],
    *   //   "productId": "my_productId"
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
  def update(params: ParamsResourceManagedconfigurationsfordeviceUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceManagedconfigurationsfordeviceUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
