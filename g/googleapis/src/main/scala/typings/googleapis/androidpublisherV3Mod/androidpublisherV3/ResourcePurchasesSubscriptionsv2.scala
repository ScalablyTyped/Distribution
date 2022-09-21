package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Resource$Purchases$Subscriptionsv2")
@js.native
open class ResourcePurchasesSubscriptionsv2 protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaSubscriptionPurchaseV2] = js.native
  def get(callback: BodyResponseCallback[SchemaSubscriptionPurchaseV2]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSubscriptionPurchaseV2] = js.native
  def get(params: ParamsResourcePurchasesSubscriptionsv2Get): GaxiosPromise[SchemaSubscriptionPurchaseV2] = js.native
  def get(
    params: ParamsResourcePurchasesSubscriptionsv2Get,
    callback: BodyResponseCallback[SchemaSubscriptionPurchaseV2]
  ): Unit = js.native
  def get(
    params: ParamsResourcePurchasesSubscriptionsv2Get,
    options: BodyResponseCallback[Readable | SchemaSubscriptionPurchaseV2],
    callback: BodyResponseCallback[Readable | SchemaSubscriptionPurchaseV2]
  ): Unit = js.native
  def get(params: ParamsResourcePurchasesSubscriptionsv2Get, options: MethodOptions): GaxiosPromise[SchemaSubscriptionPurchaseV2] = js.native
  def get(
    params: ParamsResourcePurchasesSubscriptionsv2Get,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubscriptionPurchaseV2]
  ): Unit = js.native
  /**
    * Get metadata about a subscription
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidpublisher.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidpublisher = google.androidpublisher('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidpublisher'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidpublisher.purchases.subscriptionsv2.get({
    *     // The package of the application for which this subscription was purchased (for example, 'com.some.thing').
    *     packageName: 'placeholder-value',
    *     // Required. The token provided to the user's device when the subscription was purchased.
    *     token: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "acknowledgementState": "my_acknowledgementState",
    *   //   "canceledStateContext": {},
    *   //   "externalAccountIdentifiers": {},
    *   //   "kind": "my_kind",
    *   //   "latestOrderId": "my_latestOrderId",
    *   //   "lineItems": [],
    *   //   "linkedPurchaseToken": "my_linkedPurchaseToken",
    *   //   "pausedStateContext": {},
    *   //   "regionCode": "my_regionCode",
    *   //   "startTime": "my_startTime",
    *   //   "subscribeWithGoogleInfo": {},
    *   //   "subscriptionState": "my_subscriptionState",
    *   //   "testPurchase": {}
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def get(params: ParamsResourcePurchasesSubscriptionsv2Get, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourcePurchasesSubscriptionsv2Get,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
