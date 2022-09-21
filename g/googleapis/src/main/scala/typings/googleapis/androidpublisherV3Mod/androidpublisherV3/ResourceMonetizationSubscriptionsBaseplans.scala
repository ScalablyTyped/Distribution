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

@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Resource$Monetization$Subscriptions$Baseplans")
@js.native
open class ResourceMonetizationSubscriptionsBaseplans protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def activate(): GaxiosPromise[SchemaSubscription] = js.native
  def activate(callback: BodyResponseCallback[SchemaSubscription]): Unit = js.native
  def activate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSubscription] = js.native
  def activate(params: ParamsResourceMonetizationSubscriptionsBaseplansActivate): GaxiosPromise[SchemaSubscription] = js.native
  def activate(
    params: ParamsResourceMonetizationSubscriptionsBaseplansActivate,
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  def activate(
    params: ParamsResourceMonetizationSubscriptionsBaseplansActivate,
    options: BodyResponseCallback[Readable | SchemaSubscription],
    callback: BodyResponseCallback[Readable | SchemaSubscription]
  ): Unit = js.native
  def activate(params: ParamsResourceMonetizationSubscriptionsBaseplansActivate, options: MethodOptions): GaxiosPromise[SchemaSubscription] = js.native
  def activate(
    params: ParamsResourceMonetizationSubscriptionsBaseplansActivate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  /**
    * Activates a base plan. Once activated, base plans will be available to new subscribers.
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
    *     await androidpublisher.monetization.subscriptions.basePlans.activate({
    *       // Required. The unique base plan ID of the base plan to activate.
    *       basePlanId: 'placeholder-value',
    *       // Required. The parent app (package name) of the base plan to activate.
    *       packageName: 'placeholder-value',
    *       // Required. The parent subscription (ID) of the base plan to activate.
    *       productId: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {}
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "archived": false,
    *   //   "basePlans": [],
    *   //   "listings": [],
    *   //   "packageName": "my_packageName",
    *   //   "productId": "my_productId",
    *   //   "taxAndComplianceSettings": {}
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
  def activate(params: ParamsResourceMonetizationSubscriptionsBaseplansActivate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def activate(
    params: ParamsResourceMonetizationSubscriptionsBaseplansActivate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def deactivate(): GaxiosPromise[SchemaSubscription] = js.native
  def deactivate(callback: BodyResponseCallback[SchemaSubscription]): Unit = js.native
  def deactivate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSubscription] = js.native
  def deactivate(params: ParamsResourceMonetizationSubscriptionsBaseplansDeactivate): GaxiosPromise[SchemaSubscription] = js.native
  def deactivate(
    params: ParamsResourceMonetizationSubscriptionsBaseplansDeactivate,
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  def deactivate(
    params: ParamsResourceMonetizationSubscriptionsBaseplansDeactivate,
    options: BodyResponseCallback[Readable | SchemaSubscription],
    callback: BodyResponseCallback[Readable | SchemaSubscription]
  ): Unit = js.native
  def deactivate(params: ParamsResourceMonetizationSubscriptionsBaseplansDeactivate, options: MethodOptions): GaxiosPromise[SchemaSubscription] = js.native
  def deactivate(
    params: ParamsResourceMonetizationSubscriptionsBaseplansDeactivate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  /**
    * Deactivates a base plan. Once deactivated, the base plan will become unavailable to new subscribers, but existing subscribers will maintain their subscription
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
    *     await androidpublisher.monetization.subscriptions.basePlans.deactivate({
    *       // Required. The unique base plan ID of the base plan to deactivate.
    *       basePlanId: 'placeholder-value',
    *       // Required. The parent app (package name) of the base plan to deactivate.
    *       packageName: 'placeholder-value',
    *       // Required. The parent subscription (ID) of the base plan to deactivate.
    *       productId: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {}
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "archived": false,
    *   //   "basePlans": [],
    *   //   "listings": [],
    *   //   "packageName": "my_packageName",
    *   //   "productId": "my_productId",
    *   //   "taxAndComplianceSettings": {}
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
  def deactivate(params: ParamsResourceMonetizationSubscriptionsBaseplansDeactivate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def deactivate(
    params: ParamsResourceMonetizationSubscriptionsBaseplansDeactivate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceMonetizationSubscriptionsBaseplansDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceMonetizationSubscriptionsBaseplansDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsResourceMonetizationSubscriptionsBaseplansDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceMonetizationSubscriptionsBaseplansDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceMonetizationSubscriptionsBaseplansDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes a base plan. Can only be done for draft base plans. This action is irreversible.
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
    *     await androidpublisher.monetization.subscriptions.basePlans.delete({
    *       // Required. The unique offer ID of the base plan to delete.
    *       basePlanId: 'placeholder-value',
    *       // Required. The parent app (package name) of the base plan to delete.
    *       packageName: 'placeholder-value',
    *       // Required. The parent subscription (ID) of the base plan to delete.
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
  def delete(params: ParamsResourceMonetizationSubscriptionsBaseplansDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceMonetizationSubscriptionsBaseplansDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def migratePrices(): GaxiosPromise[SchemaMigrateBasePlanPricesResponse] = js.native
  def migratePrices(callback: BodyResponseCallback[SchemaMigrateBasePlanPricesResponse]): Unit = js.native
  def migratePrices(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMigrateBasePlanPricesResponse] = js.native
  def migratePrices(params: ParamsResourceMonetizationSubscriptionsBaseplansMigrateprices): GaxiosPromise[SchemaMigrateBasePlanPricesResponse] = js.native
  def migratePrices(
    params: ParamsResourceMonetizationSubscriptionsBaseplansMigrateprices,
    callback: BodyResponseCallback[SchemaMigrateBasePlanPricesResponse]
  ): Unit = js.native
  def migratePrices(
    params: ParamsResourceMonetizationSubscriptionsBaseplansMigrateprices,
    options: BodyResponseCallback[Readable | SchemaMigrateBasePlanPricesResponse],
    callback: BodyResponseCallback[Readable | SchemaMigrateBasePlanPricesResponse]
  ): Unit = js.native
  def migratePrices(params: ParamsResourceMonetizationSubscriptionsBaseplansMigrateprices, options: MethodOptions): GaxiosPromise[SchemaMigrateBasePlanPricesResponse] = js.native
  def migratePrices(
    params: ParamsResourceMonetizationSubscriptionsBaseplansMigrateprices,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMigrateBasePlanPricesResponse]
  ): Unit = js.native
  /**
    * Migrates subscribers who are receiving an historical subscription price to the currently-offered price for the specified region. Requests will cause price change notifications to be sent to users who are currently receiving an historical price older than the supplied timestamp. Subscribers who do not agree to the new price will have their subscription ended at the next renewal.
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
    *     await androidpublisher.monetization.subscriptions.basePlans.migratePrices({
    *       // Required. The unique base plan ID of the base plan to update prices on.
    *       basePlanId: 'placeholder-value',
    *       // Required. Package name of the parent app. Must be equal to the package_name field on the Subscription resource.
    *       packageName: 'placeholder-value',
    *       // Required. The ID of the subscription to update. Must be equal to the product_id field on the Subscription resource.
    *       productId: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "regionalPriceMigrations": [],
    *         //   "regionsVersion": {}
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
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
  def migratePrices(
    params: ParamsResourceMonetizationSubscriptionsBaseplansMigrateprices,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def migratePrices(
    params: ParamsResourceMonetizationSubscriptionsBaseplansMigrateprices,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var offers: ResourceMonetizationSubscriptionsBaseplansOffers = js.native
}
