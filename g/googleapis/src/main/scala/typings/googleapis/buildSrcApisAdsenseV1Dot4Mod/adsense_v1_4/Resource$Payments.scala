package typings.googleapis.buildSrcApisAdsenseV1Dot4Mod.adsense_v1_4

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adsense/v1.4", "adsense_v1_4.Resource$Payments")
@js.native
class Resource$Payments protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adsense.payments.list
    * @desc List the payments for this AdSense account.
    * @alias adsense.payments.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$Payments] = js.native
  def list(callback: BodyResponseCallback[Schema$Payments]): Unit = js.native
  def list(params: ParamsDollarResourceDollarPaymentsDollarList): GaxiosPromise[Schema$Payments] = js.native
  def list(
    params: ParamsDollarResourceDollarPaymentsDollarList,
    callback: BodyResponseCallback[Schema$Payments]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarPaymentsDollarList,
    options: BodyResponseCallback[Schema$Payments],
    callback: BodyResponseCallback[Schema$Payments]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarPaymentsDollarList, options: MethodOptions): GaxiosPromise[Schema$Payments] = js.native
  def list(
    params: ParamsDollarResourceDollarPaymentsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Payments]
  ): Unit = js.native
}

