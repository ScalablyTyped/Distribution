package typings.googleapis.buildSrcApisAndroidpublisherV3Mod.androidpublisher_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Resource$Purchases$Products")
@js.native
class ResourceDollarPurchasesDollarProducts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * androidpublisher.purchases.products.get
    * @desc Checks the purchase and consumption status of an inapp item.
    * @alias androidpublisher.purchases.products.get
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
  def get(): GaxiosPromise[Schema$ProductPurchase] = js.native
  def get(callback: BodyResponseCallback[Schema$ProductPurchase]): Unit = js.native
  def get(params: ParamsDollarResourceDollarPurchasesDollarProductsDollarGet): GaxiosPromise[Schema$ProductPurchase] = js.native
  def get(
    params: ParamsDollarResourceDollarPurchasesDollarProductsDollarGet,
    callback: BodyResponseCallback[Schema$ProductPurchase]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarPurchasesDollarProductsDollarGet,
    options: BodyResponseCallback[Schema$ProductPurchase],
    callback: BodyResponseCallback[Schema$ProductPurchase]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarPurchasesDollarProductsDollarGet, options: MethodOptions): GaxiosPromise[Schema$ProductPurchase] = js.native
  def get(
    params: ParamsDollarResourceDollarPurchasesDollarProductsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ProductPurchase]
  ): Unit = js.native
}

