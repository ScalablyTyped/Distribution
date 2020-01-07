package typings.googleapis.buildSrcApisCloudiotV1Mod.cloudiot_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudiot/v1", "cloudiot_v1.Resource$Projects$Locations$Registries$Devices$States")
@js.native
class ResourceDollarProjectsDollarLocationsDollarRegistriesDollarDevicesDollarStates protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * cloudiot.projects.locations.registries.devices.states.list
    * @desc Lists the last few versions of the device state in descending order
    * (i.e.: newest first).
    * @alias cloudiot.projects.locations.registries.devices.states.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the device. For example, `projects/p0/locations/us-central1/registries/registry0/devices/device0` or `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`.
    * @param {integer=} params.numStates The number of states to list. States are listed in descending order of update time. The maximum number of states retained is 10. If this value is zero, it will return all the states available.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListDeviceStatesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListDeviceStatesResponse]): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarDevicesDollarStatesDollarList
  ): GaxiosPromise[Schema$ListDeviceStatesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarDevicesDollarStatesDollarList,
    callback: BodyResponseCallback[Schema$ListDeviceStatesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarDevicesDollarStatesDollarList,
    options: BodyResponseCallback[Schema$ListDeviceStatesResponse],
    callback: BodyResponseCallback[Schema$ListDeviceStatesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarDevicesDollarStatesDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListDeviceStatesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarDevicesDollarStatesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListDeviceStatesResponse]
  ): Unit = js.native
}

