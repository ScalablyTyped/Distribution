package typings.googleapis.buildSrcApisProximitybeaconV1beta1Mod.proximitybeacon_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/proximitybeacon/v1beta1", "proximitybeacon_v1beta1.Resource$Beaconinfo")
@js.native
class Resource$Beaconinfo protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * proximitybeacon.beaconinfo.getforobserved
    * @desc Given one or more beacon observations, returns any beacon
    * information and attachments accessible to your application. Authorize by
    * using the [API
    * key](https://developers.google.com/beacons/proximity/get-started#request_a_browser_api_key)
    * for the application.
    * @alias proximitybeacon.beaconinfo.getforobserved
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().GetInfoForObservedBeaconsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getforobserved(): GaxiosPromise[Schema$GetInfoForObservedBeaconsResponse] = js.native
  def getforobserved(callback: BodyResponseCallback[Schema$GetInfoForObservedBeaconsResponse]): Unit = js.native
  def getforobserved(params: ParamsDollarResourceDollarBeaconinfoDollarGetforobserved): GaxiosPromise[Schema$GetInfoForObservedBeaconsResponse] = js.native
  def getforobserved(
    params: ParamsDollarResourceDollarBeaconinfoDollarGetforobserved,
    callback: BodyResponseCallback[Schema$GetInfoForObservedBeaconsResponse]
  ): Unit = js.native
  def getforobserved(
    params: ParamsDollarResourceDollarBeaconinfoDollarGetforobserved,
    options: BodyResponseCallback[Schema$GetInfoForObservedBeaconsResponse],
    callback: BodyResponseCallback[Schema$GetInfoForObservedBeaconsResponse]
  ): Unit = js.native
  def getforobserved(params: ParamsDollarResourceDollarBeaconinfoDollarGetforobserved, options: MethodOptions): GaxiosPromise[Schema$GetInfoForObservedBeaconsResponse] = js.native
  def getforobserved(
    params: ParamsDollarResourceDollarBeaconinfoDollarGetforobserved,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GetInfoForObservedBeaconsResponse]
  ): Unit = js.native
}

