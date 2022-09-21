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

@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Resource$Purchases$Products")
@js.native
open class ResourcePurchasesProducts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def acknowledge(): GaxiosPromise[Unit] = js.native
  def acknowledge(callback: BodyResponseCallback[Unit]): Unit = js.native
  def acknowledge(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def acknowledge(params: ParamsResourcePurchasesProductsAcknowledge): GaxiosPromise[Unit] = js.native
  def acknowledge(params: ParamsResourcePurchasesProductsAcknowledge, callback: BodyResponseCallback[Unit]): Unit = js.native
  def acknowledge(
    params: ParamsResourcePurchasesProductsAcknowledge,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def acknowledge(params: ParamsResourcePurchasesProductsAcknowledge, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def acknowledge(
    params: ParamsResourcePurchasesProductsAcknowledge,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Acknowledges a purchase of an inapp item.
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
    *   const res = await androidpublisher.purchases.products.acknowledge({
    *     // The package name of the application the inapp product was sold in (for example, 'com.some.thing').
    *     packageName: 'placeholder-value',
    *     // The inapp product SKU (for example, 'com.some.thing.inapp1').
    *     productId: 'placeholder-value',
    *     // The token provided to the user's device when the inapp product was purchased.
    *     token: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "developerPayload": "my_developerPayload"
    *       // }
    *     },
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
  def acknowledge(params: ParamsResourcePurchasesProductsAcknowledge, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def acknowledge(
    params: ParamsResourcePurchasesProductsAcknowledge,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaProductPurchase] = js.native
  def get(callback: BodyResponseCallback[SchemaProductPurchase]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProductPurchase] = js.native
  def get(params: ParamsResourcePurchasesProductsGet): GaxiosPromise[SchemaProductPurchase] = js.native
  def get(params: ParamsResourcePurchasesProductsGet, callback: BodyResponseCallback[SchemaProductPurchase]): Unit = js.native
  def get(
    params: ParamsResourcePurchasesProductsGet,
    options: BodyResponseCallback[Readable | SchemaProductPurchase],
    callback: BodyResponseCallback[Readable | SchemaProductPurchase]
  ): Unit = js.native
  def get(params: ParamsResourcePurchasesProductsGet, options: MethodOptions): GaxiosPromise[SchemaProductPurchase] = js.native
  def get(
    params: ParamsResourcePurchasesProductsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProductPurchase]
  ): Unit = js.native
  /**
    * Checks the purchase and consumption status of an inapp item.
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
    *   const res = await androidpublisher.purchases.products.get({
    *     // The package name of the application the inapp product was sold in (for example, 'com.some.thing').
    *     packageName: 'placeholder-value',
    *     // The inapp product SKU (for example, 'com.some.thing.inapp1').
    *     productId: 'placeholder-value',
    *     // The token provided to the user's device when the inapp product was purchased.
    *     token: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "acknowledgementState": 0,
    *   //   "consumptionState": 0,
    *   //   "developerPayload": "my_developerPayload",
    *   //   "kind": "my_kind",
    *   //   "obfuscatedExternalAccountId": "my_obfuscatedExternalAccountId",
    *   //   "obfuscatedExternalProfileId": "my_obfuscatedExternalProfileId",
    *   //   "orderId": "my_orderId",
    *   //   "productId": "my_productId",
    *   //   "purchaseState": 0,
    *   //   "purchaseTimeMillis": "my_purchaseTimeMillis",
    *   //   "purchaseToken": "my_purchaseToken",
    *   //   "purchaseType": 0,
    *   //   "quantity": 0,
    *   //   "regionCode": "my_regionCode"
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
  def get(params: ParamsResourcePurchasesProductsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourcePurchasesProductsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
