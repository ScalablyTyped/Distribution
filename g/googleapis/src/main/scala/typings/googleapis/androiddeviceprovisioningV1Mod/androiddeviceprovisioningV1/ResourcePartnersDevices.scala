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

@JSImport("googleapis/build/src/apis/androiddeviceprovisioning/v1", "androiddeviceprovisioning_v1.Resource$Partners$Devices")
@js.native
open class ResourcePartnersDevices protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def claim(): GaxiosPromise[SchemaClaimDeviceResponse] = js.native
  def claim(callback: BodyResponseCallback[SchemaClaimDeviceResponse]): Unit = js.native
  def claim(params: Unit, options: MethodOptions): GaxiosPromise[SchemaClaimDeviceResponse] = js.native
  def claim(params: ParamsResourcePartnersDevicesClaim): GaxiosPromise[SchemaClaimDeviceResponse] = js.native
  def claim(
    params: ParamsResourcePartnersDevicesClaim,
    callback: BodyResponseCallback[SchemaClaimDeviceResponse]
  ): Unit = js.native
  def claim(
    params: ParamsResourcePartnersDevicesClaim,
    options: BodyResponseCallback[Readable | SchemaClaimDeviceResponse],
    callback: BodyResponseCallback[Readable | SchemaClaimDeviceResponse]
  ): Unit = js.native
  def claim(params: ParamsResourcePartnersDevicesClaim, options: MethodOptions): GaxiosPromise[SchemaClaimDeviceResponse] = js.native
  def claim(
    params: ParamsResourcePartnersDevicesClaim,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaClaimDeviceResponse]
  ): Unit = js.native
  /**
    * Claims a device for a customer and adds it to zero-touch enrollment. If the device is already claimed by another customer, the call returns an error.
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
    *   const res = await androiddeviceprovisioning.partners.devices.claim({
    *     // Required. The ID of the reseller partner.
    *     partnerId: '[^/]+',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "customerId": "my_customerId",
    *       //   "deviceIdentifier": {},
    *       //   "deviceMetadata": {},
    *       //   "sectionType": "my_sectionType"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "deviceId": "my_deviceId",
    *   //   "deviceName": "my_deviceName"
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
  def claim(params: ParamsResourcePartnersDevicesClaim, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def claim(
    params: ParamsResourcePartnersDevicesClaim,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def claimAsync(): GaxiosPromise[SchemaOperation] = js.native
  def claimAsync(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def claimAsync(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def claimAsync(params: ParamsResourcePartnersDevicesClaimasync): GaxiosPromise[SchemaOperation] = js.native
  def claimAsync(params: ParamsResourcePartnersDevicesClaimasync, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def claimAsync(
    params: ParamsResourcePartnersDevicesClaimasync,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def claimAsync(params: ParamsResourcePartnersDevicesClaimasync, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def claimAsync(
    params: ParamsResourcePartnersDevicesClaimasync,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Claims a batch of devices for a customer asynchronously. Adds the devices to zero-touch enrollment. To learn more, read [Long‑running batch operations](/zero-touch/guides/how-it-works#operations).
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
    *   const res = await androiddeviceprovisioning.partners.devices.claimAsync({
    *     // Required. The ID of the reseller partner.
    *     partnerId: '[^/]+',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "claims": []
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
  def claimAsync(params: ParamsResourcePartnersDevicesClaimasync, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def claimAsync(
    params: ParamsResourcePartnersDevicesClaimasync,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def findByIdentifier(): GaxiosPromise[SchemaFindDevicesByDeviceIdentifierResponse] = js.native
  def findByIdentifier(callback: BodyResponseCallback[SchemaFindDevicesByDeviceIdentifierResponse]): Unit = js.native
  def findByIdentifier(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFindDevicesByDeviceIdentifierResponse] = js.native
  def findByIdentifier(params: ParamsResourcePartnersDevicesFindbyidentifier): GaxiosPromise[SchemaFindDevicesByDeviceIdentifierResponse] = js.native
  def findByIdentifier(
    params: ParamsResourcePartnersDevicesFindbyidentifier,
    callback: BodyResponseCallback[SchemaFindDevicesByDeviceIdentifierResponse]
  ): Unit = js.native
  def findByIdentifier(
    params: ParamsResourcePartnersDevicesFindbyidentifier,
    options: BodyResponseCallback[Readable | SchemaFindDevicesByDeviceIdentifierResponse],
    callback: BodyResponseCallback[Readable | SchemaFindDevicesByDeviceIdentifierResponse]
  ): Unit = js.native
  def findByIdentifier(params: ParamsResourcePartnersDevicesFindbyidentifier, options: MethodOptions): GaxiosPromise[SchemaFindDevicesByDeviceIdentifierResponse] = js.native
  def findByIdentifier(
    params: ParamsResourcePartnersDevicesFindbyidentifier,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFindDevicesByDeviceIdentifierResponse]
  ): Unit = js.native
  /**
    * Finds devices by hardware identifiers, such as IMEI.
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
    *   const res = await androiddeviceprovisioning.partners.devices.findByIdentifier(
    *     {
    *       // Required. The ID of the reseller partner.
    *       partnerId: '[^/]+',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "deviceIdentifier": {},
    *         //   "limit": "my_limit",
    *         //   "pageToken": "my_pageToken"
    *         // }
    *       },
    *     }
    *   );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "devices": [],
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "totalSize": 0
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
  def findByIdentifier(params: ParamsResourcePartnersDevicesFindbyidentifier, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def findByIdentifier(
    params: ParamsResourcePartnersDevicesFindbyidentifier,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def findByOwner(): GaxiosPromise[SchemaFindDevicesByOwnerResponse] = js.native
  def findByOwner(callback: BodyResponseCallback[SchemaFindDevicesByOwnerResponse]): Unit = js.native
  def findByOwner(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFindDevicesByOwnerResponse] = js.native
  def findByOwner(params: ParamsResourcePartnersDevicesFindbyowner): GaxiosPromise[SchemaFindDevicesByOwnerResponse] = js.native
  def findByOwner(
    params: ParamsResourcePartnersDevicesFindbyowner,
    callback: BodyResponseCallback[SchemaFindDevicesByOwnerResponse]
  ): Unit = js.native
  def findByOwner(
    params: ParamsResourcePartnersDevicesFindbyowner,
    options: BodyResponseCallback[Readable | SchemaFindDevicesByOwnerResponse],
    callback: BodyResponseCallback[Readable | SchemaFindDevicesByOwnerResponse]
  ): Unit = js.native
  def findByOwner(params: ParamsResourcePartnersDevicesFindbyowner, options: MethodOptions): GaxiosPromise[SchemaFindDevicesByOwnerResponse] = js.native
  def findByOwner(
    params: ParamsResourcePartnersDevicesFindbyowner,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFindDevicesByOwnerResponse]
  ): Unit = js.native
  /**
    * Finds devices claimed for customers. The results only contain devices registered to the reseller that's identified by the `partnerId` argument. The customer's devices purchased from other resellers don't appear in the results.
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
    *   const res = await androiddeviceprovisioning.partners.devices.findByOwner({
    *     // Required. The ID of the reseller partner.
    *     partnerId: '[^/]+',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "customerId": [],
    *       //   "limit": "my_limit",
    *       //   "pageToken": "my_pageToken",
    *       //   "sectionType": "my_sectionType"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "devices": [],
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "totalSize": 0
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
  def findByOwner(params: ParamsResourcePartnersDevicesFindbyowner, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def findByOwner(
    params: ParamsResourcePartnersDevicesFindbyowner,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaDevice] = js.native
  def get(callback: BodyResponseCallback[SchemaDevice]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDevice] = js.native
  def get(params: ParamsResourcePartnersDevicesGet): GaxiosPromise[SchemaDevice] = js.native
  def get(params: ParamsResourcePartnersDevicesGet, callback: BodyResponseCallback[SchemaDevice]): Unit = js.native
  def get(
    params: ParamsResourcePartnersDevicesGet,
    options: BodyResponseCallback[Readable | SchemaDevice],
    callback: BodyResponseCallback[Readable | SchemaDevice]
  ): Unit = js.native
  def get(params: ParamsResourcePartnersDevicesGet, options: MethodOptions): GaxiosPromise[SchemaDevice] = js.native
  def get(
    params: ParamsResourcePartnersDevicesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDevice]
  ): Unit = js.native
  /**
    * Gets a device.
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
    *   const res = await androiddeviceprovisioning.partners.devices.get({
    *     // Required. The device API resource name in the format `partners/[PARTNER_ID]/devices/[DEVICE_ID]`.
    *     name: 'partners/my-partner/devices/my-device',
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
  def get(params: ParamsResourcePartnersDevicesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourcePartnersDevicesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def metadata(): GaxiosPromise[SchemaDeviceMetadata] = js.native
  def metadata(callback: BodyResponseCallback[SchemaDeviceMetadata]): Unit = js.native
  def metadata(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDeviceMetadata] = js.native
  def metadata(params: ParamsResourcePartnersDevicesMetadata): GaxiosPromise[SchemaDeviceMetadata] = js.native
  def metadata(
    params: ParamsResourcePartnersDevicesMetadata,
    callback: BodyResponseCallback[SchemaDeviceMetadata]
  ): Unit = js.native
  def metadata(
    params: ParamsResourcePartnersDevicesMetadata,
    options: BodyResponseCallback[Readable | SchemaDeviceMetadata],
    callback: BodyResponseCallback[Readable | SchemaDeviceMetadata]
  ): Unit = js.native
  def metadata(params: ParamsResourcePartnersDevicesMetadata, options: MethodOptions): GaxiosPromise[SchemaDeviceMetadata] = js.native
  def metadata(
    params: ParamsResourcePartnersDevicesMetadata,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDeviceMetadata]
  ): Unit = js.native
  /**
    * Updates reseller metadata associated with the device.
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
    *   const res = await androiddeviceprovisioning.partners.devices.metadata({
    *     // Required. The ID of the device.
    *     deviceId: '[^/]+',
    *     // Required. The owner of the newly set metadata. Set this to the partner ID.
    *     metadataOwnerId: '[^/]+',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "deviceMetadata": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "entries": {}
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
  def metadata(params: ParamsResourcePartnersDevicesMetadata, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def metadata(
    params: ParamsResourcePartnersDevicesMetadata,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def unclaim(): GaxiosPromise[SchemaEmpty] = js.native
  def unclaim(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def unclaim(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def unclaim(params: ParamsResourcePartnersDevicesUnclaim): GaxiosPromise[SchemaEmpty] = js.native
  def unclaim(params: ParamsResourcePartnersDevicesUnclaim, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def unclaim(
    params: ParamsResourcePartnersDevicesUnclaim,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def unclaim(params: ParamsResourcePartnersDevicesUnclaim, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def unclaim(
    params: ParamsResourcePartnersDevicesUnclaim,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Unclaims a device from a customer and removes it from zero-touch enrollment.
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
    *   const res = await androiddeviceprovisioning.partners.devices.unclaim({
    *     // Required. The ID of the reseller partner.
    *     partnerId: '[^/]+',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "deviceId": "my_deviceId",
    *       //   "deviceIdentifier": {},
    *       //   "sectionType": "my_sectionType",
    *       //   "vacationModeDays": 0,
    *       //   "vacationModeExpireTime": "my_vacationModeExpireTime"
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
  def unclaim(params: ParamsResourcePartnersDevicesUnclaim, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def unclaim(
    params: ParamsResourcePartnersDevicesUnclaim,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def unclaimAsync(): GaxiosPromise[SchemaOperation] = js.native
  def unclaimAsync(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def unclaimAsync(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def unclaimAsync(params: ParamsResourcePartnersDevicesUnclaimasync): GaxiosPromise[SchemaOperation] = js.native
  def unclaimAsync(params: ParamsResourcePartnersDevicesUnclaimasync, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def unclaimAsync(
    params: ParamsResourcePartnersDevicesUnclaimasync,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def unclaimAsync(params: ParamsResourcePartnersDevicesUnclaimasync, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def unclaimAsync(
    params: ParamsResourcePartnersDevicesUnclaimasync,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Unclaims a batch of devices for a customer asynchronously. Removes the devices from zero-touch enrollment. To learn more, read [Long‑running batch operations](/zero-touch/guides/how-it-works#operations).
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
    *   const res = await androiddeviceprovisioning.partners.devices.unclaimAsync({
    *     // Required. The reseller partner ID.
    *     partnerId: '[^/]+',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "unclaims": []
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
  def unclaimAsync(params: ParamsResourcePartnersDevicesUnclaimasync, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def unclaimAsync(
    params: ParamsResourcePartnersDevicesUnclaimasync,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateMetadataAsync(): GaxiosPromise[SchemaOperation] = js.native
  def updateMetadataAsync(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def updateMetadataAsync(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def updateMetadataAsync(params: ParamsResourcePartnersDevicesUpdatemetadataasync): GaxiosPromise[SchemaOperation] = js.native
  def updateMetadataAsync(
    params: ParamsResourcePartnersDevicesUpdatemetadataasync,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def updateMetadataAsync(
    params: ParamsResourcePartnersDevicesUpdatemetadataasync,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def updateMetadataAsync(params: ParamsResourcePartnersDevicesUpdatemetadataasync, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def updateMetadataAsync(
    params: ParamsResourcePartnersDevicesUpdatemetadataasync,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Updates the reseller metadata attached to a batch of devices. This method updates devices asynchronously and returns an `Operation` that can be used to track progress. Read [Long‑running batch operations](/zero-touch/guides/how-it-works#operations).
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
    *     await androiddeviceprovisioning.partners.devices.updateMetadataAsync({
    *       // Required. The reseller partner ID.
    *       partnerId: '[^/]+',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "updates": []
    *         // }
    *       },
    *     });
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
  def updateMetadataAsync(params: ParamsResourcePartnersDevicesUpdatemetadataasync, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateMetadataAsync(
    params: ParamsResourcePartnersDevicesUpdatemetadataasync,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
