package typings.googleapis.cloudiotV1Mod.cloudiotV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudiot/v1", "cloudiot_v1.Resource$Projects$Locations$Registries$Devices$Configversions")
@js.native
class ResourceProjectsLocationsRegistriesDevicesConfigversions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * cloudiot.projects.locations.registries.devices.configVersions.list
    * @desc Lists the last few versions of the device configuration in
    * descending order (i.e.: newest first).
    * @alias cloudiot.projects.locations.registries.devices.configVersions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the device. For example, `projects/p0/locations/us-central1/registries/registry0/devices/device0` or `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`.
    * @param {integer=} params.numVersions The number of versions to list. Versions are listed in decreasing order of the version number. The maximum number of versions retained is 10. If this value is zero, it will return all the versions available.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListDeviceConfigVersionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListDeviceConfigVersionsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListDeviceConfigVersionsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsRegistriesDevicesConfigversionsList): GaxiosPromise[SchemaListDeviceConfigVersionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRegistriesDevicesConfigversionsList,
    callback: BodyResponseCallback[SchemaListDeviceConfigVersionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsRegistriesDevicesConfigversionsList,
    options: BodyResponseCallback[SchemaListDeviceConfigVersionsResponse],
    callback: BodyResponseCallback[SchemaListDeviceConfigVersionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsRegistriesDevicesConfigversionsList, options: MethodOptions): GaxiosPromise[SchemaListDeviceConfigVersionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRegistriesDevicesConfigversionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListDeviceConfigVersionsResponse]
  ): Unit = js.native
}
