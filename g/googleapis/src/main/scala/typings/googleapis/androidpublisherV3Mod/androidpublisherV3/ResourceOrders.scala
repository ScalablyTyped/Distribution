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

@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Resource$Orders")
@js.native
open class ResourceOrders protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def refund(): GaxiosPromise[Unit] = js.native
  def refund(callback: BodyResponseCallback[Unit]): Unit = js.native
  def refund(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def refund(params: ParamsResourceOrdersRefund): GaxiosPromise[Unit] = js.native
  def refund(params: ParamsResourceOrdersRefund, callback: BodyResponseCallback[Unit]): Unit = js.native
  def refund(
    params: ParamsResourceOrdersRefund,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def refund(params: ParamsResourceOrdersRefund, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def refund(params: ParamsResourceOrdersRefund, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * Refunds a user's subscription or in-app purchase order. Orders older than 1 year cannot be refunded.
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
    *   const res = await androidpublisher.orders.refund({
    *     // The order ID provided to the user when the subscription or in-app order was purchased.
    *     orderId: 'placeholder-value',
    *     // The package name of the application for which this subscription or in-app item was purchased (for example, 'com.some.thing').
    *     packageName: 'placeholder-value',
    *     // Whether to revoke the purchased item. If set to true, access to the subscription or in-app item will be terminated immediately. If the item is a recurring subscription, all future payments will also be terminated. Consumed in-app items need to be handled by developer's app. (optional).
    *     revoke: 'placeholder-value',
    *   });
    *   console.log(res.data);
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
  def refund(params: ParamsResourceOrdersRefund, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def refund(
    params: ParamsResourceOrdersRefund,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
