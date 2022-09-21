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

@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Resource$Monetization$Subscriptions$Baseplans$Offers")
@js.native
open class ResourceMonetizationSubscriptionsBaseplansOffers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def activate(): GaxiosPromise[SchemaSubscriptionOffer] = js.native
  def activate(callback: BodyResponseCallback[SchemaSubscriptionOffer]): Unit = js.native
  def activate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSubscriptionOffer] = js.native
  def activate(params: ParamsResourceMonetizationSubscriptionsBaseplansOffersActivate): GaxiosPromise[SchemaSubscriptionOffer] = js.native
  def activate(
    params: ParamsResourceMonetizationSubscriptionsBaseplansOffersActivate,
    callback: BodyResponseCallback[SchemaSubscriptionOffer]
  ): Unit = js.native
  def activate(
    params: ParamsResourceMonetizationSubscriptionsBaseplansOffersActivate,
    options: BodyResponseCallback[Readable | SchemaSubscriptionOffer],
    callback: BodyResponseCallback[Readable | SchemaSubscriptionOffer]
  ): Unit = js.native
  def activate(params: ParamsResourceMonetizationSubscriptionsBaseplansOffersActivate, options: MethodOptions): GaxiosPromise[SchemaSubscriptionOffer] = js.native
  def activate(
    params: ParamsResourceMonetizationSubscriptionsBaseplansOffersActivate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubscriptionOffer]
  ): Unit = js.native
  /**
    * Activates a subscription offer. Once activated, subscription offers will be available to new subscribers.
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
    *   const res =
    *     await androidpublisher.monetization.subscriptions.basePlans.offers.activate(
    *       {
    *         // Required. The parent base plan (ID) of the offer to activate.
    *         basePlanId: 'placeholder-value',
    *         // Required. The unique offer ID of the offer to activate.
    *         offerId: 'placeholder-value',
    *         // Required. The parent app (package name) of the offer to activate.
    *         packageName: 'placeholder-value',
    *         // Required. The parent subscription (ID) of the offer to activate.
    *         productId: 'placeholder-value',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {}
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "basePlanId": "my_basePlanId",
    *   //   "offerId": "my_offerId",
    *   //   "offerTags": [],
    *   //   "otherRegionsConfig": {},
    *   //   "packageName": "my_packageName",
    *   //   "phases": [],
    *   //   "productId": "my_productId",
    *   //   "regionalConfigs": [],
    *   //   "state": "my_state",
    *   //   "targeting": {}
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
  def activate(
    params: ParamsResourceMonetizationSubscriptionsBaseplansOffersActivate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def activate(
    params: ParamsResourceMonetizationSubscriptionsBaseplansOffersActivate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaSubscriptionOffer] = js.native
  def create(callback: BodyResponseCallback[SchemaSubscriptionOffer]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSubscriptionOffer] = js.native
  def create(params: ParamsResourceMonetizationSubscriptionsBaseplansOffersCreate): GaxiosPromise[SchemaSubscriptionOffer] = js.native
  def create(
    params: ParamsResourceMonetizationSubscriptionsBaseplansOffersCreate,
    callback: BodyResponseCallback[SchemaSubscriptionOffer]
  ): Unit = js.native
  def create(
    params: ParamsResourceMonetizationSubscriptionsBaseplansOffersCreate,
    options: BodyResponseCallback[Readable | SchemaSubscriptionOffer],
    callback: BodyResponseCallback[Readable | SchemaSubscriptionOffer]
  ): Unit = js.native
  def create(params: ParamsResourceMonetizationSubscriptionsBaseplansOffersCreate, options: MethodOptions): GaxiosPromise[SchemaSubscriptionOffer] = js.native
  def create(
    params: ParamsResourceMonetizationSubscriptionsBaseplansOffersCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubscriptionOffer]
  ): Unit = js.native
  /**
    * Creates a new subscription offer. Only auto-renewing base plans can have subscription offers. The offer state will be DRAFT until it is activated.
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
    *   const res =
    *     await androidpublisher.monetization.subscriptions.basePlans.offers.create({
    *       // Required. The parent base plan (ID) for which the offer should be created. Must be equal to the base_plan_id field on the SubscriptionOffer resource.
    *       basePlanId: 'placeholder-value',
    *       // Required. The ID to use for the offer. For the requirements on this format, see the documentation of the offer_id field on the SubscriptionOffer resource.
    *       offerId: 'placeholder-value',
    *       // Required. The parent app (package name) for which the offer should be created. Must be equal to the package_name field on the Subscription resource.
    *       packageName: 'placeholder-value',
    *       // Required. The parent subscription (ID) for which the offer should be created. Must be equal to the product_id field on the SubscriptionOffer resource.
    *       productId: 'placeholder-value',
    *       // Required. A string representing version of the available regions being used for the specified resource. The current version is 2022/01.
    *       'regionsVersion.version': 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "basePlanId": "my_basePlanId",
    *         //   "offerId": "my_offerId",
    *         //   "offerTags": [],
    *         //   "otherRegionsConfig": {},
    *         //   "packageName": "my_packageName",
    *         //   "phases": [],
    *         //   "productId": "my_productId",
    *         //   "regionalConfigs": [],
    *         //   "state": "my_state",
    *         //   "targeting": {}
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "basePlanId": "my_basePlanId",
    *   //   "offerId": "my_offerId",
    *   //   "offerTags": [],
    *   //   "otherRegionsConfig": {},
    *   //   "packageName": "my_packageName",
    *   //   "phases": [],
    *   //   "productId": "my_productId",
    *   //   "regionalConfigs": [],
    *   //   "state": "my_state",
    *   //   "targeting": {}
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
  def create(params: ParamsResourceMonetizationSubscriptionsBaseplansOffersCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceMonetizationSubscriptionsBaseplansOffersCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def deactivate(): GaxiosPromise[SchemaSubscriptionOffer] = js.native
  def deactivate(callback: BodyResponseCallback[SchemaSubscriptionOffer]): Unit = js.native
  def deactivate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSubscriptionOffer] = js.native
  def deactivate(params: ParamsResourceMonetizationSubscriptionsBaseplansOffersDeactivate): GaxiosPromise[SchemaSubscriptionOffer] = js.native
  def deactivate(
    params: ParamsResourceMonetizationSubscriptionsBaseplansOffersDeactivate,
    callback: BodyResponseCallback[SchemaSubscriptionOffer]
  ): Unit = js.native
  def deactivate(
    params: ParamsResourceMonetizationSubscriptionsBaseplansOffersDeactivate,
    options: BodyResponseCallback[Readable | SchemaSubscriptionOffer],
    callback: BodyResponseCallback[Readable | SchemaSubscriptionOffer]
  ): Unit = js.native
  def deactivate(params: ParamsResourceMonetizationSubscriptionsBaseplansOffersDeactivate, options: MethodOptions): GaxiosPromise[SchemaSubscriptionOffer] = js.native
  def deactivate(
    params: ParamsResourceMonetizationSubscriptionsBaseplansOffersDeactivate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubscriptionOffer]
  ): Unit = js.native
  /**
    * Deactivates a subscription offer. Once deactivated, existing subscribers will maintain their subscription, but the offer will become unavailable to new subscribers.
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
    *   const res =
    *     await androidpublisher.monetization.subscriptions.basePlans.offers.deactivate(
    *       {
    *         // Required. The parent base plan (ID) of the offer to deactivate.
    *         basePlanId: 'placeholder-value',
    *         // Required. The unique offer ID of the offer to deactivate.
    *         offerId: 'placeholder-value',
    *         // Required. The parent app (package name) of the offer to deactivate.
    *         packageName: 'placeholder-value',
    *         // Required. The parent subscription (ID) of the offer to deactivate.
    *         productId: 'placeholder-value',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {}
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "basePlanId": "my_basePlanId",
    *   //   "offerId": "my_offerId",
    *   //   "offerTags": [],
    *   //   "otherRegionsConfig": {},
    *   //   "packageName": "my_packageName",
    *   //   "phases": [],
    *   //   "productId": "my_productId",
    *   //   "regionalConfigs": [],
    *   //   "state": "my_state",
    *   //   "targeting": {}
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
  def deactivate(
    params: ParamsResourceMonetizationSubscriptionsBaseplansOffersDeactivate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def deactivate(
    params: ParamsResourceMonetizationSubscriptionsBaseplansOffersDeactivate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceMonetizationSubscriptionsBaseplansOffersDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceMonetizationSubscriptionsBaseplansOffersDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsResourceMonetizationSubscriptionsBaseplansOffersDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceMonetizationSubscriptionsBaseplansOffersDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceMonetizationSubscriptionsBaseplansOffersDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes a subscription offer. Can only be done for draft offers. This action is irreversible.
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
    *   const res =
    *     await androidpublisher.monetization.subscriptions.basePlans.offers.delete({
    *       // Required. The parent base plan (ID) of the offer to delete.
    *       basePlanId: 'placeholder-value',
    *       // Required. The unique offer ID of the offer to delete.
    *       offerId: 'placeholder-value',
    *       // Required. The parent app (package name) of the offer to delete.
    *       packageName: 'placeholder-value',
    *       // Required. The parent subscription (ID) of the offer to delete.
    *       productId: 'placeholder-value',
    *     });
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
  def delete(params: ParamsResourceMonetizationSubscriptionsBaseplansOffersDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceMonetizationSubscriptionsBaseplansOffersDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaSubscriptionOffer] = js.native
  def get(callback: BodyResponseCallback[SchemaSubscriptionOffer]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSubscriptionOffer] = js.native
  def get(params: ParamsResourceMonetizationSubscriptionsBaseplansOffersGet): GaxiosPromise[SchemaSubscriptionOffer] = js.native
  def get(
    params: ParamsResourceMonetizationSubscriptionsBaseplansOffersGet,
    callback: BodyResponseCallback[SchemaSubscriptionOffer]
  ): Unit = js.native
  def get(
    params: ParamsResourceMonetizationSubscriptionsBaseplansOffersGet,
    options: BodyResponseCallback[Readable | SchemaSubscriptionOffer],
    callback: BodyResponseCallback[Readable | SchemaSubscriptionOffer]
  ): Unit = js.native
  def get(params: ParamsResourceMonetizationSubscriptionsBaseplansOffersGet, options: MethodOptions): GaxiosPromise[SchemaSubscriptionOffer] = js.native
  def get(
    params: ParamsResourceMonetizationSubscriptionsBaseplansOffersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubscriptionOffer]
  ): Unit = js.native
  /**
    * Reads a single offer
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
    *   const res =
    *     await androidpublisher.monetization.subscriptions.basePlans.offers.get({
    *       // Required. The parent base plan (ID) of the offer to get.
    *       basePlanId: 'placeholder-value',
    *       // Required. The unique offer ID of the offer to get.
    *       offerId: 'placeholder-value',
    *       // Required. The parent app (package name) of the offer to get.
    *       packageName: 'placeholder-value',
    *       // Required. The parent subscription (ID) of the offer to get.
    *       productId: 'placeholder-value',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "basePlanId": "my_basePlanId",
    *   //   "offerId": "my_offerId",
    *   //   "offerTags": [],
    *   //   "otherRegionsConfig": {},
    *   //   "packageName": "my_packageName",
    *   //   "phases": [],
    *   //   "productId": "my_productId",
    *   //   "regionalConfigs": [],
    *   //   "state": "my_state",
    *   //   "targeting": {}
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
  def get(params: ParamsResourceMonetizationSubscriptionsBaseplansOffersGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceMonetizationSubscriptionsBaseplansOffersGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListSubscriptionOffersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListSubscriptionOffersResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListSubscriptionOffersResponse] = js.native
  def list(params: ParamsResourceMonetizationSubscriptionsBaseplansOffersList): GaxiosPromise[SchemaListSubscriptionOffersResponse] = js.native
  def list(
    params: ParamsResourceMonetizationSubscriptionsBaseplansOffersList,
    callback: BodyResponseCallback[SchemaListSubscriptionOffersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceMonetizationSubscriptionsBaseplansOffersList,
    options: BodyResponseCallback[Readable | SchemaListSubscriptionOffersResponse],
    callback: BodyResponseCallback[Readable | SchemaListSubscriptionOffersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceMonetizationSubscriptionsBaseplansOffersList, options: MethodOptions): GaxiosPromise[SchemaListSubscriptionOffersResponse] = js.native
  def list(
    params: ParamsResourceMonetizationSubscriptionsBaseplansOffersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListSubscriptionOffersResponse]
  ): Unit = js.native
  /**
    * Lists all offers under a given subscription.
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
    *   const res =
    *     await androidpublisher.monetization.subscriptions.basePlans.offers.list({
    *       // Required. The parent base plan (ID) for which the offers should be read. May be specified as '-' to read all offers under a subscription.
    *       basePlanId: 'placeholder-value',
    *       // Required. The parent app (package name) for which the subscriptions should be read.
    *       packageName: 'placeholder-value',
    *       // The maximum number of subscriptions to return. The service may return fewer than this value. If unspecified, at most 50 subscriptions will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
    *       pageSize: 'placeholder-value',
    *       // A page token, received from a previous `ListSubscriptionsOffers` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListSubscriptionOffers` must match the call that provided the page token.
    *       pageToken: 'placeholder-value',
    *       // Required. The parent subscription (ID) for which the offers should be read.
    *       productId: 'placeholder-value',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "subscriptionOffers": []
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
  def list(params: ParamsResourceMonetizationSubscriptionsBaseplansOffersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceMonetizationSubscriptionsBaseplansOffersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaSubscriptionOffer] = js.native
  def patch(callback: BodyResponseCallback[SchemaSubscriptionOffer]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSubscriptionOffer] = js.native
  def patch(params: ParamsResourceMonetizationSubscriptionsBaseplansOffersPatch): GaxiosPromise[SchemaSubscriptionOffer] = js.native
  def patch(
    params: ParamsResourceMonetizationSubscriptionsBaseplansOffersPatch,
    callback: BodyResponseCallback[SchemaSubscriptionOffer]
  ): Unit = js.native
  def patch(
    params: ParamsResourceMonetizationSubscriptionsBaseplansOffersPatch,
    options: BodyResponseCallback[Readable | SchemaSubscriptionOffer],
    callback: BodyResponseCallback[Readable | SchemaSubscriptionOffer]
  ): Unit = js.native
  def patch(params: ParamsResourceMonetizationSubscriptionsBaseplansOffersPatch, options: MethodOptions): GaxiosPromise[SchemaSubscriptionOffer] = js.native
  def patch(
    params: ParamsResourceMonetizationSubscriptionsBaseplansOffersPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubscriptionOffer]
  ): Unit = js.native
  /**
    * Updates an existing subscription offer.
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
    *   const res =
    *     await androidpublisher.monetization.subscriptions.basePlans.offers.patch({
    *       // Required. Immutable. The ID of the base plan to which this offer is an extension.
    *       basePlanId: 'placeholder-value',
    *       // Required. Immutable. Unique ID of this subscription offer. Must be unique within the base plan.
    *       offerId: 'placeholder-value',
    *       // Required. Immutable. The package name of the app the parent subscription belongs to.
    *       packageName: 'placeholder-value',
    *       // Required. Immutable. The ID of the parent subscription this offer belongs to.
    *       productId: 'placeholder-value',
    *       // Required. A string representing version of the available regions being used for the specified resource. The current version is 2022/01.
    *       'regionsVersion.version': 'placeholder-value',
    *       // Required. The list of fields to be updated.
    *       updateMask: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "basePlanId": "my_basePlanId",
    *         //   "offerId": "my_offerId",
    *         //   "offerTags": [],
    *         //   "otherRegionsConfig": {},
    *         //   "packageName": "my_packageName",
    *         //   "phases": [],
    *         //   "productId": "my_productId",
    *         //   "regionalConfigs": [],
    *         //   "state": "my_state",
    *         //   "targeting": {}
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "basePlanId": "my_basePlanId",
    *   //   "offerId": "my_offerId",
    *   //   "offerTags": [],
    *   //   "otherRegionsConfig": {},
    *   //   "packageName": "my_packageName",
    *   //   "phases": [],
    *   //   "productId": "my_productId",
    *   //   "regionalConfigs": [],
    *   //   "state": "my_state",
    *   //   "targeting": {}
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
  def patch(params: ParamsResourceMonetizationSubscriptionsBaseplansOffersPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceMonetizationSubscriptionsBaseplansOffersPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
