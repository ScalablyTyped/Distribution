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

@JSImport("googleapis/build/src/apis/cloudiot/v1", "cloudiot_v1.Resource$Projects$Locations$Registries$Devices$States")
@js.native
open class ResourceProjectsLocationsRegistriesDevicesStates protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListDeviceStatesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListDeviceStatesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListDeviceStatesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsRegistriesDevicesStatesList): GaxiosPromise[SchemaListDeviceStatesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRegistriesDevicesStatesList,
    callback: BodyResponseCallback[SchemaListDeviceStatesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsRegistriesDevicesStatesList,
    options: BodyResponseCallback[Readable | SchemaListDeviceStatesResponse],
    callback: BodyResponseCallback[Readable | SchemaListDeviceStatesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsRegistriesDevicesStatesList, options: MethodOptions): GaxiosPromise[SchemaListDeviceStatesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRegistriesDevicesStatesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListDeviceStatesResponse]
  ): Unit = js.native
  /**
    * Lists the last few versions of the device state in descending order (i.e.: newest first).
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
    *   const res = await cloudiot.projects.locations.registries.devices.states.list({
    *     // Required. The name of the device. For example, `projects/p0/locations/us-central1/registries/registry0/devices/device0` or `projects/p0/locations/us-central1/registries/registry0/devices/{num_id\}`.
    *     name: 'projects/my-project/locations/my-location/registries/my-registrie/devices/my-device',
    *     // The number of states to list. States are listed in descending order of update time. The maximum number of states retained is 10. If this value is zero, it will return all the states available.
    *     numStates: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "deviceStates": []
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
  def list(params: ParamsResourceProjectsLocationsRegistriesDevicesStatesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRegistriesDevicesStatesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
