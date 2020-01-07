package typings.googleapis.buildSrcApisProximitybeaconV1beta1Mod.proximitybeacon_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/proximitybeacon/v1beta1", "proximitybeacon_v1beta1.Resource$V1beta1")
@js.native
class Resource$V1beta1 protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * proximitybeacon.getEidparams
    * @desc Gets the Proximity Beacon API's current public key and associated
    * parameters used to initiate the Diffie-Hellman key exchange required to
    * register a beacon that broadcasts the Eddystone-EID format. This key
    * changes periodically; clients may cache it and re-use the same public key
    * to provision and register multiple beacons. However, clients should be
    * prepared to refresh this key when they encounter an error registering an
    * Eddystone-EID beacon.
    * @alias proximitybeacon.getEidparams
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getEidparams(): GaxiosPromise[Schema$EphemeralIdRegistrationParams] = js.native
  def getEidparams(callback: BodyResponseCallback[Schema$EphemeralIdRegistrationParams]): Unit = js.native
  def getEidparams(params: ParamsDollarResourceDollarV1beta1DollarGeteidparams): GaxiosPromise[Schema$EphemeralIdRegistrationParams] = js.native
  def getEidparams(
    params: ParamsDollarResourceDollarV1beta1DollarGeteidparams,
    callback: BodyResponseCallback[Schema$EphemeralIdRegistrationParams]
  ): Unit = js.native
  def getEidparams(
    params: ParamsDollarResourceDollarV1beta1DollarGeteidparams,
    options: BodyResponseCallback[Schema$EphemeralIdRegistrationParams],
    callback: BodyResponseCallback[Schema$EphemeralIdRegistrationParams]
  ): Unit = js.native
  def getEidparams(params: ParamsDollarResourceDollarV1beta1DollarGeteidparams, options: MethodOptions): GaxiosPromise[Schema$EphemeralIdRegistrationParams] = js.native
  def getEidparams(
    params: ParamsDollarResourceDollarV1beta1DollarGeteidparams,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$EphemeralIdRegistrationParams]
  ): Unit = js.native
}

