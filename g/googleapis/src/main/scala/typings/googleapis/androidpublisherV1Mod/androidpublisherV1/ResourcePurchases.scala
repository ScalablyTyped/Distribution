package typings.googleapis.androidpublisherV1Mod.androidpublisherV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidpublisher/v1", "androidpublisher_v1.Resource$Purchases")
@js.native
class ResourcePurchases protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * androidpublisher.purchases.cancel
    * @desc Cancels a user's subscription purchase. The subscription remains
    * valid until its expiration time.
    * @alias androidpublisher.purchases.cancel
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.packageName The package name of the application for which this subscription was purchased (for example, 'com.some.thing').
    * @param {string} params.subscriptionId The purchased subscription ID (for example, 'monthly001').
    * @param {string} params.token The token provided to the user's device when the subscription was purchased.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def cancel(): GaxiosPromise[Unit] = js.native
  def cancel(callback: BodyResponseCallback[Unit]): Unit = js.native
  def cancel(params: ParamsResourcePurchasesCancel): GaxiosPromise[Unit] = js.native
  def cancel(params: ParamsResourcePurchasesCancel, callback: BodyResponseCallback[Unit]): Unit = js.native
  def cancel(
    params: ParamsResourcePurchasesCancel,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def cancel(params: ParamsResourcePurchasesCancel, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def cancel(
    params: ParamsResourcePurchasesCancel,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * androidpublisher.purchases.get
    * @desc Checks whether a user's subscription purchase is valid and returns
    * its expiry time.
    * @alias androidpublisher.purchases.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.packageName The package name of the application for which this subscription was purchased (for example, 'com.some.thing').
    * @param {string} params.subscriptionId The purchased subscription ID (for example, 'monthly001').
    * @param {string} params.token The token provided to the user's device when the subscription was purchased.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaSubscriptionPurchase] = js.native
  def get(callback: BodyResponseCallback[SchemaSubscriptionPurchase]): Unit = js.native
  def get(params: ParamsResourcePurchasesGet): GaxiosPromise[SchemaSubscriptionPurchase] = js.native
  def get(params: ParamsResourcePurchasesGet, callback: BodyResponseCallback[SchemaSubscriptionPurchase]): Unit = js.native
  def get(
    params: ParamsResourcePurchasesGet,
    options: BodyResponseCallback[SchemaSubscriptionPurchase],
    callback: BodyResponseCallback[SchemaSubscriptionPurchase]
  ): Unit = js.native
  def get(params: ParamsResourcePurchasesGet, options: MethodOptions): GaxiosPromise[SchemaSubscriptionPurchase] = js.native
  def get(
    params: ParamsResourcePurchasesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubscriptionPurchase]
  ): Unit = js.native
}

