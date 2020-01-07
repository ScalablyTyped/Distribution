package typings.googleapis.buildSrcApisAndroidpublisherV3Mod.androidpublisher_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Resource$Purchases$Subscriptions")
@js.native
class ResourceDollarPurchasesDollarSubscriptions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * androidpublisher.purchases.subscriptions.cancel
    * @desc Cancels a user's subscription purchase. The subscription remains
    * valid until its expiration time.
    * @alias androidpublisher.purchases.subscriptions.cancel
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
  def cancel(params: ParamsDollarResourceDollarPurchasesDollarSubscriptionsDollarCancel): GaxiosPromise[Unit] = js.native
  def cancel(
    params: ParamsDollarResourceDollarPurchasesDollarSubscriptionsDollarCancel,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def cancel(
    params: ParamsDollarResourceDollarPurchasesDollarSubscriptionsDollarCancel,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def cancel(params: ParamsDollarResourceDollarPurchasesDollarSubscriptionsDollarCancel, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def cancel(
    params: ParamsDollarResourceDollarPurchasesDollarSubscriptionsDollarCancel,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * androidpublisher.purchases.subscriptions.defer
    * @desc Defers a user's subscription purchase until a specified future
    * expiration time.
    * @alias androidpublisher.purchases.subscriptions.defer
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.packageName The package name of the application for which this subscription was purchased (for example, 'com.some.thing').
    * @param {string} params.subscriptionId The purchased subscription ID (for example, 'monthly001').
    * @param {string} params.token The token provided to the user's device when the subscription was purchased.
    * @param {().SubscriptionPurchasesDeferRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def defer(): GaxiosPromise[Schema$SubscriptionPurchasesDeferResponse] = js.native
  def defer(callback: BodyResponseCallback[Schema$SubscriptionPurchasesDeferResponse]): Unit = js.native
  def defer(params: ParamsDollarResourceDollarPurchasesDollarSubscriptionsDollarDefer): GaxiosPromise[Schema$SubscriptionPurchasesDeferResponse] = js.native
  def defer(
    params: ParamsDollarResourceDollarPurchasesDollarSubscriptionsDollarDefer,
    callback: BodyResponseCallback[Schema$SubscriptionPurchasesDeferResponse]
  ): Unit = js.native
  def defer(
    params: ParamsDollarResourceDollarPurchasesDollarSubscriptionsDollarDefer,
    options: BodyResponseCallback[Schema$SubscriptionPurchasesDeferResponse],
    callback: BodyResponseCallback[Schema$SubscriptionPurchasesDeferResponse]
  ): Unit = js.native
  def defer(params: ParamsDollarResourceDollarPurchasesDollarSubscriptionsDollarDefer, options: MethodOptions): GaxiosPromise[Schema$SubscriptionPurchasesDeferResponse] = js.native
  def defer(
    params: ParamsDollarResourceDollarPurchasesDollarSubscriptionsDollarDefer,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SubscriptionPurchasesDeferResponse]
  ): Unit = js.native
  /**
    * androidpublisher.purchases.subscriptions.get
    * @desc Checks whether a user's subscription purchase is valid and returns
    * its expiry time.
    * @alias androidpublisher.purchases.subscriptions.get
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
  def get(): GaxiosPromise[Schema$SubscriptionPurchase] = js.native
  def get(callback: BodyResponseCallback[Schema$SubscriptionPurchase]): Unit = js.native
  def get(params: ParamsDollarResourceDollarPurchasesDollarSubscriptionsDollarGet): GaxiosPromise[Schema$SubscriptionPurchase] = js.native
  def get(
    params: ParamsDollarResourceDollarPurchasesDollarSubscriptionsDollarGet,
    callback: BodyResponseCallback[Schema$SubscriptionPurchase]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarPurchasesDollarSubscriptionsDollarGet,
    options: BodyResponseCallback[Schema$SubscriptionPurchase],
    callback: BodyResponseCallback[Schema$SubscriptionPurchase]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarPurchasesDollarSubscriptionsDollarGet, options: MethodOptions): GaxiosPromise[Schema$SubscriptionPurchase] = js.native
  def get(
    params: ParamsDollarResourceDollarPurchasesDollarSubscriptionsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SubscriptionPurchase]
  ): Unit = js.native
  /**
    * androidpublisher.purchases.subscriptions.refund
    * @desc Refunds a user's subscription purchase, but the subscription
    * remains valid until its expiration time and it will continue to recur.
    * @alias androidpublisher.purchases.subscriptions.refund
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
  def refund(): GaxiosPromise[Unit] = js.native
  def refund(callback: BodyResponseCallback[Unit]): Unit = js.native
  def refund(params: ParamsDollarResourceDollarPurchasesDollarSubscriptionsDollarRefund): GaxiosPromise[Unit] = js.native
  def refund(
    params: ParamsDollarResourceDollarPurchasesDollarSubscriptionsDollarRefund,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def refund(
    params: ParamsDollarResourceDollarPurchasesDollarSubscriptionsDollarRefund,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def refund(params: ParamsDollarResourceDollarPurchasesDollarSubscriptionsDollarRefund, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def refund(
    params: ParamsDollarResourceDollarPurchasesDollarSubscriptionsDollarRefund,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * androidpublisher.purchases.subscriptions.revoke
    * @desc Refunds and immediately revokes a user's subscription purchase.
    * Access to the subscription will be terminated immediately and it will
    * stop recurring.
    * @alias androidpublisher.purchases.subscriptions.revoke
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
  def revoke(): GaxiosPromise[Unit] = js.native
  def revoke(callback: BodyResponseCallback[Unit]): Unit = js.native
  def revoke(params: ParamsDollarResourceDollarPurchasesDollarSubscriptionsDollarRevoke): GaxiosPromise[Unit] = js.native
  def revoke(
    params: ParamsDollarResourceDollarPurchasesDollarSubscriptionsDollarRevoke,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def revoke(
    params: ParamsDollarResourceDollarPurchasesDollarSubscriptionsDollarRevoke,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def revoke(params: ParamsDollarResourceDollarPurchasesDollarSubscriptionsDollarRevoke, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def revoke(
    params: ParamsDollarResourceDollarPurchasesDollarSubscriptionsDollarRevoke,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
}

