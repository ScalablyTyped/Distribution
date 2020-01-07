package typings.googleapis.buildSrcApisAndroidpublisherV1Dot1Mod.androidpublisher_v1_1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidpublisher/v1.1", "androidpublisher_v1_1.Resource$Inapppurchases")
@js.native
class Resource$Inapppurchases protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * androidpublisher.inapppurchases.get
    * @desc Checks the purchase and consumption status of an inapp item.
    * @alias androidpublisher.inapppurchases.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.packageName The package name of the application the inapp product was sold in (for example, 'com.some.thing').
    * @param {string} params.productId The inapp product SKU (for example, 'com.some.thing.inapp1').
    * @param {string} params.token The token provided to the user's device when the inapp product was purchased.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$InappPurchase] = js.native
  def get(callback: BodyResponseCallback[Schema$InappPurchase]): Unit = js.native
  def get(params: ParamsDollarResourceDollarInapppurchasesDollarGet): GaxiosPromise[Schema$InappPurchase] = js.native
  def get(
    params: ParamsDollarResourceDollarInapppurchasesDollarGet,
    callback: BodyResponseCallback[Schema$InappPurchase]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarInapppurchasesDollarGet,
    options: BodyResponseCallback[Schema$InappPurchase],
    callback: BodyResponseCallback[Schema$InappPurchase]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarInapppurchasesDollarGet, options: MethodOptions): GaxiosPromise[Schema$InappPurchase] = js.native
  def get(
    params: ParamsDollarResourceDollarInapppurchasesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$InappPurchase]
  ): Unit = js.native
}

