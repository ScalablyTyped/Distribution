package typings.googleapis.buildSrcApisAndroidpublisherV3Mod.androidpublisher_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Resource$Orders")
@js.native
class Resource$Orders protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * androidpublisher.orders.refund
    * @desc Refund a user's subscription or in-app purchase order.
    * @alias androidpublisher.orders.refund
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.orderId The order ID provided to the user when the subscription or in-app order was purchased.
    * @param {string} params.packageName The package name of the application for which this subscription or in-app item was purchased (for example, 'com.some.thing').
    * @param {boolean=} params.revoke Whether to revoke the purchased item. If set to true, access to the subscription or in-app item will be terminated immediately. If the item is a recurring subscription, all future payments will also be terminated. Consumed in-app items need to be handled by developer's app. (optional)
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def refund(): GaxiosPromise[Unit] = js.native
  def refund(callback: BodyResponseCallback[Unit]): Unit = js.native
  def refund(params: ParamsDollarResourceDollarOrdersDollarRefund): GaxiosPromise[Unit] = js.native
  def refund(params: ParamsDollarResourceDollarOrdersDollarRefund, callback: BodyResponseCallback[Unit]): Unit = js.native
  def refund(
    params: ParamsDollarResourceDollarOrdersDollarRefund,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def refund(params: ParamsDollarResourceDollarOrdersDollarRefund, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def refund(
    params: ParamsDollarResourceDollarOrdersDollarRefund,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
}

