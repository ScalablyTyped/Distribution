package typings.googleapis.buildSrcApisAdsenseV1Dot4Mod.adsense_v1_4

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adsense/v1.4", "adsense_v1_4.Resource$Alerts")
@js.native
class Resource$Alerts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adsense.alerts.delete
    * @desc Dismiss (delete) the specified alert from the publisher's AdSense
    * account.
    * @alias adsense.alerts.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.alertId Alert to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarAlertsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarAlertsDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAlertsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarAlertsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarAlertsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * adsense.alerts.list
    * @desc List the alerts for this AdSense account.
    * @alias adsense.alerts.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.locale The locale to use for translating alert messages. The account locale will be used if this is not supplied. The AdSense default (English) will be used if the supplied locale is invalid or unsupported.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$Alerts] = js.native
  def list(callback: BodyResponseCallback[Schema$Alerts]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAlertsDollarList): GaxiosPromise[Schema$Alerts] = js.native
  def list(params: ParamsDollarResourceDollarAlertsDollarList, callback: BodyResponseCallback[Schema$Alerts]): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAlertsDollarList,
    options: BodyResponseCallback[Schema$Alerts],
    callback: BodyResponseCallback[Schema$Alerts]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarAlertsDollarList, options: MethodOptions): GaxiosPromise[Schema$Alerts] = js.native
  def list(
    params: ParamsDollarResourceDollarAlertsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Alerts]
  ): Unit = js.native
}

