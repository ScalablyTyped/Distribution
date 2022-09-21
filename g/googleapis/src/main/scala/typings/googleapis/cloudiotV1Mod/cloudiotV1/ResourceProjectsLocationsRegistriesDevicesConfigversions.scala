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

@JSImport("googleapis/build/src/apis/cloudiot/v1", "cloudiot_v1.Resource$Projects$Locations$Registries$Devices$Configversions")
@js.native
open class ResourceProjectsLocationsRegistriesDevicesConfigversions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListDeviceConfigVersionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListDeviceConfigVersionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListDeviceConfigVersionsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsRegistriesDevicesConfigversionsList): GaxiosPromise[SchemaListDeviceConfigVersionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRegistriesDevicesConfigversionsList,
    callback: BodyResponseCallback[SchemaListDeviceConfigVersionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsRegistriesDevicesConfigversionsList,
    options: BodyResponseCallback[Readable | SchemaListDeviceConfigVersionsResponse],
    callback: BodyResponseCallback[Readable | SchemaListDeviceConfigVersionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsRegistriesDevicesConfigversionsList, options: MethodOptions): GaxiosPromise[SchemaListDeviceConfigVersionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRegistriesDevicesConfigversionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListDeviceConfigVersionsResponse]
  ): Unit = js.native
  /**
    * Lists the last few versions of the device configuration in descending order (i.e.: newest first).
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
    *     await cloudiot.projects.locations.registries.devices.configVersions.list({
    *       // Required. The name of the device. For example, `projects/p0/locations/us-central1/registries/registry0/devices/device0` or `projects/p0/locations/us-central1/registries/registry0/devices/{num_id\}`.
    *       name: 'projects/my-project/locations/my-location/registries/my-registrie/devices/my-device',
    *       // The number of versions to list. Versions are listed in decreasing order of the version number. The maximum number of versions retained is 10. If this value is zero, it will return all the versions available.
    *       numVersions: 'placeholder-value',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "deviceConfigs": []
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
  def list(
    params: ParamsResourceProjectsLocationsRegistriesDevicesConfigversionsList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRegistriesDevicesConfigversionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
