package typings.googleapis.buildSrcApisCloudiotV1Mod.cloudiot_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudiot/v1", "cloudiot_v1.Resource$Projects$Locations$Registries$Groups$Devices$Configversions")
@js.native
class ResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarDevicesDollarConfigversions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * cloudiot.projects.locations.registries.groups.devices.configVersions.list
    * @desc Lists the last few versions of the device configuration in
    * descending order (i.e.: newest first).
    * @alias
    * cloudiot.projects.locations.registries.groups.devices.configVersions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the device. For example, `projects/p0/locations/us-central1/registries/registry0/devices/device0` or `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`.
    * @param {integer=} params.numVersions The number of versions to list. Versions are listed in decreasing order of the version number. The maximum number of versions retained is 10. If this value is zero, it will return all the versions available.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListDeviceConfigVersionsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListDeviceConfigVersionsResponse]): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarDevicesDollarConfigversionsDollarList
  ): GaxiosPromise[Schema$ListDeviceConfigVersionsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarDevicesDollarConfigversionsDollarList,
    callback: BodyResponseCallback[Schema$ListDeviceConfigVersionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarDevicesDollarConfigversionsDollarList,
    options: BodyResponseCallback[Schema$ListDeviceConfigVersionsResponse],
    callback: BodyResponseCallback[Schema$ListDeviceConfigVersionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarDevicesDollarConfigversionsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListDeviceConfigVersionsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarDevicesDollarConfigversionsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListDeviceConfigVersionsResponse]
  ): Unit = js.native
}

