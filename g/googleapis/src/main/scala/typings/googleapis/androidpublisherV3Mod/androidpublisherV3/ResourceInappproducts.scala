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

@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Resource$Inappproducts")
@js.native
open class ResourceInappproducts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceInappproductsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceInappproductsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceInappproductsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceInappproductsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceInappproductsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes an in-app product (i.e. a managed product or a subscriptions).
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
    *   const res = await androidpublisher.inappproducts.delete({
    *     // Package name of the app.
    *     packageName: 'placeholder-value',
    *     // Unique identifier for the in-app product.
    *     sku: 'placeholder-value',
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
  def delete(params: ParamsResourceInappproductsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceInappproductsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaInAppProduct] = js.native
  def get(callback: BodyResponseCallback[SchemaInAppProduct]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaInAppProduct] = js.native
  def get(params: ParamsResourceInappproductsGet): GaxiosPromise[SchemaInAppProduct] = js.native
  def get(params: ParamsResourceInappproductsGet, callback: BodyResponseCallback[SchemaInAppProduct]): Unit = js.native
  def get(
    params: ParamsResourceInappproductsGet,
    options: BodyResponseCallback[Readable | SchemaInAppProduct],
    callback: BodyResponseCallback[Readable | SchemaInAppProduct]
  ): Unit = js.native
  def get(params: ParamsResourceInappproductsGet, options: MethodOptions): GaxiosPromise[SchemaInAppProduct] = js.native
  def get(
    params: ParamsResourceInappproductsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInAppProduct]
  ): Unit = js.native
  /**
    * Gets an in-app product, which can be a managed product or a subscription.
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
    *   const res = await androidpublisher.inappproducts.get({
    *     // Package name of the app.
    *     packageName: 'placeholder-value',
    *     // Unique identifier for the in-app product.
    *     sku: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "defaultLanguage": "my_defaultLanguage",
    *   //   "defaultPrice": {},
    *   //   "gracePeriod": "my_gracePeriod",
    *   //   "listings": {},
    *   //   "managedProductTaxesAndComplianceSettings": {},
    *   //   "packageName": "my_packageName",
    *   //   "prices": {},
    *   //   "purchaseType": "my_purchaseType",
    *   //   "sku": "my_sku",
    *   //   "status": "my_status",
    *   //   "subscriptionPeriod": "my_subscriptionPeriod",
    *   //   "subscriptionTaxesAndComplianceSettings": {},
    *   //   "trialPeriod": "my_trialPeriod"
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
  def get(params: ParamsResourceInappproductsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceInappproductsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaInAppProduct] = js.native
  def insert(callback: BodyResponseCallback[SchemaInAppProduct]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaInAppProduct] = js.native
  def insert(params: ParamsResourceInappproductsInsert): GaxiosPromise[SchemaInAppProduct] = js.native
  def insert(params: ParamsResourceInappproductsInsert, callback: BodyResponseCallback[SchemaInAppProduct]): Unit = js.native
  def insert(
    params: ParamsResourceInappproductsInsert,
    options: BodyResponseCallback[Readable | SchemaInAppProduct],
    callback: BodyResponseCallback[Readable | SchemaInAppProduct]
  ): Unit = js.native
  def insert(params: ParamsResourceInappproductsInsert, options: MethodOptions): GaxiosPromise[SchemaInAppProduct] = js.native
  def insert(
    params: ParamsResourceInappproductsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInAppProduct]
  ): Unit = js.native
  /**
    * Creates an in-app product (i.e. a managed product or a subscriptions).
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
    *   const res = await androidpublisher.inappproducts.insert({
    *     // If true the prices for all regions targeted by the parent app that don't have a price specified for this in-app product will be auto converted to the target currency based on the default price. Defaults to false.
    *     autoConvertMissingPrices: 'placeholder-value',
    *     // Package name of the app.
    *     packageName: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "defaultLanguage": "my_defaultLanguage",
    *       //   "defaultPrice": {},
    *       //   "gracePeriod": "my_gracePeriod",
    *       //   "listings": {},
    *       //   "managedProductTaxesAndComplianceSettings": {},
    *       //   "packageName": "my_packageName",
    *       //   "prices": {},
    *       //   "purchaseType": "my_purchaseType",
    *       //   "sku": "my_sku",
    *       //   "status": "my_status",
    *       //   "subscriptionPeriod": "my_subscriptionPeriod",
    *       //   "subscriptionTaxesAndComplianceSettings": {},
    *       //   "trialPeriod": "my_trialPeriod"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "defaultLanguage": "my_defaultLanguage",
    *   //   "defaultPrice": {},
    *   //   "gracePeriod": "my_gracePeriod",
    *   //   "listings": {},
    *   //   "managedProductTaxesAndComplianceSettings": {},
    *   //   "packageName": "my_packageName",
    *   //   "prices": {},
    *   //   "purchaseType": "my_purchaseType",
    *   //   "sku": "my_sku",
    *   //   "status": "my_status",
    *   //   "subscriptionPeriod": "my_subscriptionPeriod",
    *   //   "subscriptionTaxesAndComplianceSettings": {},
    *   //   "trialPeriod": "my_trialPeriod"
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
  def insert(params: ParamsResourceInappproductsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceInappproductsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaInappproductsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaInappproductsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaInappproductsListResponse] = js.native
  def list(params: ParamsResourceInappproductsList): GaxiosPromise[SchemaInappproductsListResponse] = js.native
  def list(
    params: ParamsResourceInappproductsList,
    callback: BodyResponseCallback[SchemaInappproductsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceInappproductsList,
    options: BodyResponseCallback[Readable | SchemaInappproductsListResponse],
    callback: BodyResponseCallback[Readable | SchemaInappproductsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceInappproductsList, options: MethodOptions): GaxiosPromise[SchemaInappproductsListResponse] = js.native
  def list(
    params: ParamsResourceInappproductsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInappproductsListResponse]
  ): Unit = js.native
  /**
    * Lists all in-app products - both managed products and subscriptions. If an app has a large number of in-app products, the response may be paginated. In this case the response field `tokenPagination.nextPageToken` will be set and the caller should provide its value as a `token` request parameter to retrieve the next page.
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
    *   const res = await androidpublisher.inappproducts.list({
    *     // Deprecated and ignored. The page size is determined by the server.
    *     maxResults: 'placeholder-value',
    *     // Package name of the app.
    *     packageName: 'placeholder-value',
    *     // Deprecated and ignored. Set the `token` parameter to rertieve the next page.
    *     startIndex: 'placeholder-value',
    *     // Pagination token. If empty, list starts at the first product.
    *     token: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "inappproduct": [],
    *   //   "kind": "my_kind",
    *   //   "pageInfo": {},
    *   //   "tokenPagination": {}
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
  def list(params: ParamsResourceInappproductsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceInappproductsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaInAppProduct] = js.native
  def patch(callback: BodyResponseCallback[SchemaInAppProduct]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaInAppProduct] = js.native
  def patch(params: ParamsResourceInappproductsPatch): GaxiosPromise[SchemaInAppProduct] = js.native
  def patch(params: ParamsResourceInappproductsPatch, callback: BodyResponseCallback[SchemaInAppProduct]): Unit = js.native
  def patch(
    params: ParamsResourceInappproductsPatch,
    options: BodyResponseCallback[Readable | SchemaInAppProduct],
    callback: BodyResponseCallback[Readable | SchemaInAppProduct]
  ): Unit = js.native
  def patch(params: ParamsResourceInappproductsPatch, options: MethodOptions): GaxiosPromise[SchemaInAppProduct] = js.native
  def patch(
    params: ParamsResourceInappproductsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInAppProduct]
  ): Unit = js.native
  /**
    * Patches an in-app product (i.e. a managed product or a subscriptions).
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
    *   const res = await androidpublisher.inappproducts.patch({
    *     // If true the prices for all regions targeted by the parent app that don't have a price specified for this in-app product will be auto converted to the target currency based on the default price. Defaults to false.
    *     autoConvertMissingPrices: 'placeholder-value',
    *     // Package name of the app.
    *     packageName: 'placeholder-value',
    *     // Unique identifier for the in-app product.
    *     sku: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "defaultLanguage": "my_defaultLanguage",
    *       //   "defaultPrice": {},
    *       //   "gracePeriod": "my_gracePeriod",
    *       //   "listings": {},
    *       //   "managedProductTaxesAndComplianceSettings": {},
    *       //   "packageName": "my_packageName",
    *       //   "prices": {},
    *       //   "purchaseType": "my_purchaseType",
    *       //   "sku": "my_sku",
    *       //   "status": "my_status",
    *       //   "subscriptionPeriod": "my_subscriptionPeriod",
    *       //   "subscriptionTaxesAndComplianceSettings": {},
    *       //   "trialPeriod": "my_trialPeriod"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "defaultLanguage": "my_defaultLanguage",
    *   //   "defaultPrice": {},
    *   //   "gracePeriod": "my_gracePeriod",
    *   //   "listings": {},
    *   //   "managedProductTaxesAndComplianceSettings": {},
    *   //   "packageName": "my_packageName",
    *   //   "prices": {},
    *   //   "purchaseType": "my_purchaseType",
    *   //   "sku": "my_sku",
    *   //   "status": "my_status",
    *   //   "subscriptionPeriod": "my_subscriptionPeriod",
    *   //   "subscriptionTaxesAndComplianceSettings": {},
    *   //   "trialPeriod": "my_trialPeriod"
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
  def patch(params: ParamsResourceInappproductsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceInappproductsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaInAppProduct] = js.native
  def update(callback: BodyResponseCallback[SchemaInAppProduct]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaInAppProduct] = js.native
  def update(params: ParamsResourceInappproductsUpdate): GaxiosPromise[SchemaInAppProduct] = js.native
  def update(params: ParamsResourceInappproductsUpdate, callback: BodyResponseCallback[SchemaInAppProduct]): Unit = js.native
  def update(
    params: ParamsResourceInappproductsUpdate,
    options: BodyResponseCallback[Readable | SchemaInAppProduct],
    callback: BodyResponseCallback[Readable | SchemaInAppProduct]
  ): Unit = js.native
  def update(params: ParamsResourceInappproductsUpdate, options: MethodOptions): GaxiosPromise[SchemaInAppProduct] = js.native
  def update(
    params: ParamsResourceInappproductsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInAppProduct]
  ): Unit = js.native
  /**
    * Updates an in-app product (i.e. a managed product or a subscriptions).
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
    *   const res = await androidpublisher.inappproducts.update({
    *     // If set to true, and the in-app product with the given package_name and sku doesn't exist, the in-app product will be created.
    *     allowMissing: 'placeholder-value',
    *     // If true the prices for all regions targeted by the parent app that don't have a price specified for this in-app product will be auto converted to the target currency based on the default price. Defaults to false.
    *     autoConvertMissingPrices: 'placeholder-value',
    *     // Package name of the app.
    *     packageName: 'placeholder-value',
    *     // Unique identifier for the in-app product.
    *     sku: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "defaultLanguage": "my_defaultLanguage",
    *       //   "defaultPrice": {},
    *       //   "gracePeriod": "my_gracePeriod",
    *       //   "listings": {},
    *       //   "managedProductTaxesAndComplianceSettings": {},
    *       //   "packageName": "my_packageName",
    *       //   "prices": {},
    *       //   "purchaseType": "my_purchaseType",
    *       //   "sku": "my_sku",
    *       //   "status": "my_status",
    *       //   "subscriptionPeriod": "my_subscriptionPeriod",
    *       //   "subscriptionTaxesAndComplianceSettings": {},
    *       //   "trialPeriod": "my_trialPeriod"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "defaultLanguage": "my_defaultLanguage",
    *   //   "defaultPrice": {},
    *   //   "gracePeriod": "my_gracePeriod",
    *   //   "listings": {},
    *   //   "managedProductTaxesAndComplianceSettings": {},
    *   //   "packageName": "my_packageName",
    *   //   "prices": {},
    *   //   "purchaseType": "my_purchaseType",
    *   //   "sku": "my_sku",
    *   //   "status": "my_status",
    *   //   "subscriptionPeriod": "my_subscriptionPeriod",
    *   //   "subscriptionTaxesAndComplianceSettings": {},
    *   //   "trialPeriod": "my_trialPeriod"
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
  def update(params: ParamsResourceInappproductsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceInappproductsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
