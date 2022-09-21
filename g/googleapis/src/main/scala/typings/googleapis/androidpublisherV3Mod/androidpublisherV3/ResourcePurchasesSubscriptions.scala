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

@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Resource$Purchases$Subscriptions")
@js.native
open class ResourcePurchasesSubscriptions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def acknowledge(): GaxiosPromise[Unit] = js.native
  def acknowledge(callback: BodyResponseCallback[Unit]): Unit = js.native
  def acknowledge(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def acknowledge(params: ParamsResourcePurchasesSubscriptionsAcknowledge): GaxiosPromise[Unit] = js.native
  def acknowledge(params: ParamsResourcePurchasesSubscriptionsAcknowledge, callback: BodyResponseCallback[Unit]): Unit = js.native
  def acknowledge(
    params: ParamsResourcePurchasesSubscriptionsAcknowledge,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def acknowledge(params: ParamsResourcePurchasesSubscriptionsAcknowledge, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def acknowledge(
    params: ParamsResourcePurchasesSubscriptionsAcknowledge,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Acknowledges a subscription purchase.
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
    *   const res = await androidpublisher.purchases.subscriptions.acknowledge({
    *     // The package name of the application for which this subscription was purchased (for example, 'com.some.thing').
    *     packageName: 'placeholder-value',
    *     // The purchased subscription ID (for example, 'monthly001').
    *     subscriptionId: 'placeholder-value',
    *     // The token provided to the user's device when the subscription was purchased.
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
  def acknowledge(params: ParamsResourcePurchasesSubscriptionsAcknowledge, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def acknowledge(
    params: ParamsResourcePurchasesSubscriptionsAcknowledge,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def cancel(): GaxiosPromise[Unit] = js.native
  def cancel(callback: BodyResponseCallback[Unit]): Unit = js.native
  def cancel(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def cancel(params: ParamsResourcePurchasesSubscriptionsCancel): GaxiosPromise[Unit] = js.native
  def cancel(params: ParamsResourcePurchasesSubscriptionsCancel, callback: BodyResponseCallback[Unit]): Unit = js.native
  def cancel(
    params: ParamsResourcePurchasesSubscriptionsCancel,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def cancel(params: ParamsResourcePurchasesSubscriptionsCancel, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def cancel(
    params: ParamsResourcePurchasesSubscriptionsCancel,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Cancels a user's subscription purchase. The subscription remains valid until its expiration time.
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
    *   const res = await androidpublisher.purchases.subscriptions.cancel({
    *     // The package name of the application for which this subscription was purchased (for example, 'com.some.thing').
    *     packageName: 'placeholder-value',
    *     // The purchased subscription ID (for example, 'monthly001').
    *     subscriptionId: 'placeholder-value',
    *     // The token provided to the user's device when the subscription was purchased.
    *     token: 'placeholder-value',
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
  def cancel(params: ParamsResourcePurchasesSubscriptionsCancel, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def cancel(
    params: ParamsResourcePurchasesSubscriptionsCancel,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def defer(): GaxiosPromise[SchemaSubscriptionPurchasesDeferResponse] = js.native
  def defer(callback: BodyResponseCallback[SchemaSubscriptionPurchasesDeferResponse]): Unit = js.native
  def defer(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSubscriptionPurchasesDeferResponse] = js.native
  def defer(params: ParamsResourcePurchasesSubscriptionsDefer): GaxiosPromise[SchemaSubscriptionPurchasesDeferResponse] = js.native
  def defer(
    params: ParamsResourcePurchasesSubscriptionsDefer,
    callback: BodyResponseCallback[SchemaSubscriptionPurchasesDeferResponse]
  ): Unit = js.native
  def defer(
    params: ParamsResourcePurchasesSubscriptionsDefer,
    options: BodyResponseCallback[Readable | SchemaSubscriptionPurchasesDeferResponse],
    callback: BodyResponseCallback[Readable | SchemaSubscriptionPurchasesDeferResponse]
  ): Unit = js.native
  def defer(params: ParamsResourcePurchasesSubscriptionsDefer, options: MethodOptions): GaxiosPromise[SchemaSubscriptionPurchasesDeferResponse] = js.native
  def defer(
    params: ParamsResourcePurchasesSubscriptionsDefer,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubscriptionPurchasesDeferResponse]
  ): Unit = js.native
  /**
    * Defers a user's subscription purchase until a specified future expiration time.
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
    *   const res = await androidpublisher.purchases.subscriptions.defer({
    *     // The package name of the application for which this subscription was purchased (for example, 'com.some.thing').
    *     packageName: 'placeholder-value',
    *     // The purchased subscription ID (for example, 'monthly001').
    *     subscriptionId: 'placeholder-value',
    *     // The token provided to the user's device when the subscription was purchased.
    *     token: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "deferralInfo": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "newExpiryTimeMillis": "my_newExpiryTimeMillis"
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
  def defer(params: ParamsResourcePurchasesSubscriptionsDefer, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def defer(
    params: ParamsResourcePurchasesSubscriptionsDefer,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaSubscriptionPurchase] = js.native
  def get(callback: BodyResponseCallback[SchemaSubscriptionPurchase]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSubscriptionPurchase] = js.native
  def get(params: ParamsResourcePurchasesSubscriptionsGet): GaxiosPromise[SchemaSubscriptionPurchase] = js.native
  def get(
    params: ParamsResourcePurchasesSubscriptionsGet,
    callback: BodyResponseCallback[SchemaSubscriptionPurchase]
  ): Unit = js.native
  def get(
    params: ParamsResourcePurchasesSubscriptionsGet,
    options: BodyResponseCallback[Readable | SchemaSubscriptionPurchase],
    callback: BodyResponseCallback[Readable | SchemaSubscriptionPurchase]
  ): Unit = js.native
  def get(params: ParamsResourcePurchasesSubscriptionsGet, options: MethodOptions): GaxiosPromise[SchemaSubscriptionPurchase] = js.native
  def get(
    params: ParamsResourcePurchasesSubscriptionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubscriptionPurchase]
  ): Unit = js.native
  /**
    * Checks whether a user's subscription purchase is valid and returns its expiry time.
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
    *   const res = await androidpublisher.purchases.subscriptions.get({
    *     // The package name of the application for which this subscription was purchased (for example, 'com.some.thing').
    *     packageName: 'placeholder-value',
    *     // The purchased subscription ID (for example, 'monthly001').
    *     subscriptionId: 'placeholder-value',
    *     // The token provided to the user's device when the subscription was purchased.
    *     token: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "acknowledgementState": 0,
    *   //   "autoRenewing": false,
    *   //   "autoResumeTimeMillis": "my_autoResumeTimeMillis",
    *   //   "cancelReason": 0,
    *   //   "cancelSurveyResult": {},
    *   //   "countryCode": "my_countryCode",
    *   //   "developerPayload": "my_developerPayload",
    *   //   "emailAddress": "my_emailAddress",
    *   //   "expiryTimeMillis": "my_expiryTimeMillis",
    *   //   "externalAccountId": "my_externalAccountId",
    *   //   "familyName": "my_familyName",
    *   //   "givenName": "my_givenName",
    *   //   "introductoryPriceInfo": {},
    *   //   "kind": "my_kind",
    *   //   "linkedPurchaseToken": "my_linkedPurchaseToken",
    *   //   "obfuscatedExternalAccountId": "my_obfuscatedExternalAccountId",
    *   //   "obfuscatedExternalProfileId": "my_obfuscatedExternalProfileId",
    *   //   "orderId": "my_orderId",
    *   //   "paymentState": 0,
    *   //   "priceAmountMicros": "my_priceAmountMicros",
    *   //   "priceChange": {},
    *   //   "priceCurrencyCode": "my_priceCurrencyCode",
    *   //   "profileId": "my_profileId",
    *   //   "profileName": "my_profileName",
    *   //   "promotionCode": "my_promotionCode",
    *   //   "promotionType": 0,
    *   //   "purchaseType": 0,
    *   //   "startTimeMillis": "my_startTimeMillis",
    *   //   "userCancellationTimeMillis": "my_userCancellationTimeMillis"
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
  def get(params: ParamsResourcePurchasesSubscriptionsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourcePurchasesSubscriptionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def refund(): GaxiosPromise[Unit] = js.native
  def refund(callback: BodyResponseCallback[Unit]): Unit = js.native
  def refund(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def refund(params: ParamsResourcePurchasesSubscriptionsRefund): GaxiosPromise[Unit] = js.native
  def refund(params: ParamsResourcePurchasesSubscriptionsRefund, callback: BodyResponseCallback[Unit]): Unit = js.native
  def refund(
    params: ParamsResourcePurchasesSubscriptionsRefund,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def refund(params: ParamsResourcePurchasesSubscriptionsRefund, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def refund(
    params: ParamsResourcePurchasesSubscriptionsRefund,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Refunds a user's subscription purchase, but the subscription remains valid until its expiration time and it will continue to recur.
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
    *   const res = await androidpublisher.purchases.subscriptions.refund({
    *     // The package name of the application for which this subscription was purchased (for example, 'com.some.thing').
    *     packageName: 'placeholder-value',
    *     // "The purchased subscription ID (for example, 'monthly001').
    *     subscriptionId: 'placeholder-value',
    *     // The token provided to the user's device when the subscription was purchased.
    *     token: 'placeholder-value',
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
  def refund(params: ParamsResourcePurchasesSubscriptionsRefund, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def refund(
    params: ParamsResourcePurchasesSubscriptionsRefund,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def revoke(): GaxiosPromise[Unit] = js.native
  def revoke(callback: BodyResponseCallback[Unit]): Unit = js.native
  def revoke(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def revoke(params: ParamsResourcePurchasesSubscriptionsRevoke): GaxiosPromise[Unit] = js.native
  def revoke(params: ParamsResourcePurchasesSubscriptionsRevoke, callback: BodyResponseCallback[Unit]): Unit = js.native
  def revoke(
    params: ParamsResourcePurchasesSubscriptionsRevoke,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def revoke(params: ParamsResourcePurchasesSubscriptionsRevoke, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def revoke(
    params: ParamsResourcePurchasesSubscriptionsRevoke,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Refunds and immediately revokes a user's subscription purchase. Access to the subscription will be terminated immediately and it will stop recurring.
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
    *   const res = await androidpublisher.purchases.subscriptions.revoke({
    *     // The package name of the application for which this subscription was purchased (for example, 'com.some.thing').
    *     packageName: 'placeholder-value',
    *     // The purchased subscription ID (for example, 'monthly001').
    *     subscriptionId: 'placeholder-value',
    *     // The token provided to the user's device when the subscription was purchased.
    *     token: 'placeholder-value',
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
  def revoke(params: ParamsResourcePurchasesSubscriptionsRevoke, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def revoke(
    params: ParamsResourcePurchasesSubscriptionsRevoke,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
