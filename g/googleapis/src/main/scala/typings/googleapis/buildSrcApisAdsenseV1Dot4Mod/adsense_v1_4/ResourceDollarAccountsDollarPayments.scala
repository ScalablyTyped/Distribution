package typings.googleapis.buildSrcApisAdsenseV1Dot4Mod.adsense_v1_4

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adsense/v1.4", "adsense_v1_4.Resource$Accounts$Payments")
@js.native
class ResourceDollarAccountsDollarPayments protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adsense.accounts.payments.list
    * @desc List the payments for the specified AdSense account.
    * @alias adsense.accounts.payments.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account for which to retrieve the payments.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$Payments] = js.native
  def list(callback: BodyResponseCallback[Schema$Payments]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarPaymentsDollarList): GaxiosPromise[Schema$Payments] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarPaymentsDollarList,
    callback: BodyResponseCallback[Schema$Payments]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarPaymentsDollarList,
    options: BodyResponseCallback[Schema$Payments],
    callback: BodyResponseCallback[Schema$Payments]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarPaymentsDollarList, options: MethodOptions): GaxiosPromise[Schema$Payments] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarPaymentsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Payments]
  ): Unit = js.native
}

