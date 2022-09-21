package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/authorizedbuyersmarketplace/v1", "authorizedbuyersmarketplace_v1.Resource$Buyers$Auctionpackages")
@js.native
open class ResourceBuyersAuctionpackages protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaAuctionPackage] = js.native
  def get(callback: BodyResponseCallback[SchemaAuctionPackage]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAuctionPackage] = js.native
  def get(params: ParamsResourceBuyersAuctionpackagesGet): GaxiosPromise[SchemaAuctionPackage] = js.native
  def get(
    params: ParamsResourceBuyersAuctionpackagesGet,
    callback: BodyResponseCallback[SchemaAuctionPackage]
  ): Unit = js.native
  def get(
    params: ParamsResourceBuyersAuctionpackagesGet,
    options: BodyResponseCallback[Readable | SchemaAuctionPackage],
    callback: BodyResponseCallback[Readable | SchemaAuctionPackage]
  ): Unit = js.native
  def get(params: ParamsResourceBuyersAuctionpackagesGet, options: MethodOptions): GaxiosPromise[SchemaAuctionPackage] = js.native
  def get(
    params: ParamsResourceBuyersAuctionpackagesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAuctionPackage]
  ): Unit = js.native
  /**
    * Gets an auction package given its name.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/authorizedbuyersmarketplace.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const authorizedbuyersmarketplace = google.authorizedbuyersmarketplace('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/authorized-buyers-marketplace'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await authorizedbuyersmarketplace.buyers.auctionPackages.get({
    *     // Required. Name of auction package to get. Format: `buyers/{accountId\}/auctionPackages/{auctionPackageId\}`
    *     name: 'buyers/my-buyer/auctionPackages/my-auctionPackage',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "creator": "my_creator",
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "subscribedClients": [],
    *   //   "updateTime": "my_updateTime"
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
  def get(params: ParamsResourceBuyersAuctionpackagesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceBuyersAuctionpackagesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListAuctionPackagesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAuctionPackagesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListAuctionPackagesResponse] = js.native
  def list(params: ParamsResourceBuyersAuctionpackagesList): GaxiosPromise[SchemaListAuctionPackagesResponse] = js.native
  def list(
    params: ParamsResourceBuyersAuctionpackagesList,
    callback: BodyResponseCallback[SchemaListAuctionPackagesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceBuyersAuctionpackagesList,
    options: BodyResponseCallback[Readable | SchemaListAuctionPackagesResponse],
    callback: BodyResponseCallback[Readable | SchemaListAuctionPackagesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceBuyersAuctionpackagesList, options: MethodOptions): GaxiosPromise[SchemaListAuctionPackagesResponse] = js.native
  def list(
    params: ParamsResourceBuyersAuctionpackagesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAuctionPackagesResponse]
  ): Unit = js.native
  /**
    * List the auction packages subscribed by a buyer and its clients.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/authorizedbuyersmarketplace.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const authorizedbuyersmarketplace = google.authorizedbuyersmarketplace('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/authorized-buyers-marketplace'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await authorizedbuyersmarketplace.buyers.auctionPackages.list({
    *     // Requested page size. The server may return fewer results than requested. Max allowed page size is 500.
    *     pageSize: 'placeholder-value',
    *     // The page token as returned. ListAuctionPackagesResponse.nextPageToken
    *     pageToken: 'placeholder-value',
    *     // Required. Name of the parent buyer that can access the auction package. Format: `buyers/{accountId\}`
    *     parent: 'buyers/my-buyer',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "auctionPackages": [],
    *   //   "nextPageToken": "my_nextPageToken"
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
  def list(params: ParamsResourceBuyersAuctionpackagesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceBuyersAuctionpackagesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def subscribe(): GaxiosPromise[SchemaAuctionPackage] = js.native
  def subscribe(callback: BodyResponseCallback[SchemaAuctionPackage]): Unit = js.native
  def subscribe(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAuctionPackage] = js.native
  def subscribe(params: ParamsResourceBuyersAuctionpackagesSubscribe): GaxiosPromise[SchemaAuctionPackage] = js.native
  def subscribe(
    params: ParamsResourceBuyersAuctionpackagesSubscribe,
    callback: BodyResponseCallback[SchemaAuctionPackage]
  ): Unit = js.native
  def subscribe(
    params: ParamsResourceBuyersAuctionpackagesSubscribe,
    options: BodyResponseCallback[Readable | SchemaAuctionPackage],
    callback: BodyResponseCallback[Readable | SchemaAuctionPackage]
  ): Unit = js.native
  def subscribe(params: ParamsResourceBuyersAuctionpackagesSubscribe, options: MethodOptions): GaxiosPromise[SchemaAuctionPackage] = js.native
  def subscribe(
    params: ParamsResourceBuyersAuctionpackagesSubscribe,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAuctionPackage]
  ): Unit = js.native
  /**
    * Subscribe to the auction package for the specified buyer. Once subscribed, the bidder will receive a call out for inventory matching the auction package targeting criteria with the auction package deal ID and the specified buyer.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/authorizedbuyersmarketplace.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const authorizedbuyersmarketplace = google.authorizedbuyersmarketplace('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/authorized-buyers-marketplace'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await authorizedbuyersmarketplace.buyers.auctionPackages.subscribe({
    *       // Required. Name of the auction package. Format: `buyers/{accountId\}/auctionPackages/{auctionPackageId\}`
    *       name: 'buyers/my-buyer/auctionPackages/my-auctionPackage',
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
    *   //   "createTime": "my_createTime",
    *   //   "creator": "my_creator",
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "subscribedClients": [],
    *   //   "updateTime": "my_updateTime"
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
  def subscribe(params: ParamsResourceBuyersAuctionpackagesSubscribe, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def subscribe(
    params: ParamsResourceBuyersAuctionpackagesSubscribe,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def subscribeClients(): GaxiosPromise[SchemaAuctionPackage] = js.native
  def subscribeClients(callback: BodyResponseCallback[SchemaAuctionPackage]): Unit = js.native
  def subscribeClients(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAuctionPackage] = js.native
  def subscribeClients(params: ParamsResourceBuyersAuctionpackagesSubscribeclients): GaxiosPromise[SchemaAuctionPackage] = js.native
  def subscribeClients(
    params: ParamsResourceBuyersAuctionpackagesSubscribeclients,
    callback: BodyResponseCallback[SchemaAuctionPackage]
  ): Unit = js.native
  def subscribeClients(
    params: ParamsResourceBuyersAuctionpackagesSubscribeclients,
    options: BodyResponseCallback[Readable | SchemaAuctionPackage],
    callback: BodyResponseCallback[Readable | SchemaAuctionPackage]
  ): Unit = js.native
  def subscribeClients(params: ParamsResourceBuyersAuctionpackagesSubscribeclients, options: MethodOptions): GaxiosPromise[SchemaAuctionPackage] = js.native
  def subscribeClients(
    params: ParamsResourceBuyersAuctionpackagesSubscribeclients,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAuctionPackage]
  ): Unit = js.native
  /**
    * Subscribe the specified clients of the buyer to the auction package. If a client in the list does not belong to the buyer, an error response will be returned, and all of the following clients in the list will not be subscribed. Subscribing an already subscribed client will have no effect.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/authorizedbuyersmarketplace.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const authorizedbuyersmarketplace = google.authorizedbuyersmarketplace('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/authorized-buyers-marketplace'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await authorizedbuyersmarketplace.buyers.auctionPackages.subscribeClients({
    *       // Required. Name of the auction package. Format: `buyers/{accountId\}/auctionPackages/{auctionPackageId\}`
    *       auctionPackage: 'buyers/my-buyer/auctionPackages/my-auctionPackage',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "clients": []
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "creator": "my_creator",
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "subscribedClients": [],
    *   //   "updateTime": "my_updateTime"
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
  def subscribeClients(params: ParamsResourceBuyersAuctionpackagesSubscribeclients, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def subscribeClients(
    params: ParamsResourceBuyersAuctionpackagesSubscribeclients,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def unsubscribe(): GaxiosPromise[SchemaAuctionPackage] = js.native
  def unsubscribe(callback: BodyResponseCallback[SchemaAuctionPackage]): Unit = js.native
  def unsubscribe(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAuctionPackage] = js.native
  def unsubscribe(params: ParamsResourceBuyersAuctionpackagesUnsubscribe): GaxiosPromise[SchemaAuctionPackage] = js.native
  def unsubscribe(
    params: ParamsResourceBuyersAuctionpackagesUnsubscribe,
    callback: BodyResponseCallback[SchemaAuctionPackage]
  ): Unit = js.native
  def unsubscribe(
    params: ParamsResourceBuyersAuctionpackagesUnsubscribe,
    options: BodyResponseCallback[Readable | SchemaAuctionPackage],
    callback: BodyResponseCallback[Readable | SchemaAuctionPackage]
  ): Unit = js.native
  def unsubscribe(params: ParamsResourceBuyersAuctionpackagesUnsubscribe, options: MethodOptions): GaxiosPromise[SchemaAuctionPackage] = js.native
  def unsubscribe(
    params: ParamsResourceBuyersAuctionpackagesUnsubscribe,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAuctionPackage]
  ): Unit = js.native
  /**
    * Unsubscribe from the auction package for the specified buyer. Once unsubscribed, the bidder will no longer receive a call out for the auction package deal ID and the specified buyer.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/authorizedbuyersmarketplace.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const authorizedbuyersmarketplace = google.authorizedbuyersmarketplace('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/authorized-buyers-marketplace'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await authorizedbuyersmarketplace.buyers.auctionPackages.unsubscribe({
    *       // Required. Name of the auction package. Format: `buyers/{accountId\}/auctionPackages/{auctionPackageId\}`
    *       name: 'buyers/my-buyer/auctionPackages/my-auctionPackage',
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
    *   //   "createTime": "my_createTime",
    *   //   "creator": "my_creator",
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "subscribedClients": [],
    *   //   "updateTime": "my_updateTime"
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
  def unsubscribe(params: ParamsResourceBuyersAuctionpackagesUnsubscribe, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def unsubscribe(
    params: ParamsResourceBuyersAuctionpackagesUnsubscribe,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def unsubscribeClients(): GaxiosPromise[SchemaAuctionPackage] = js.native
  def unsubscribeClients(callback: BodyResponseCallback[SchemaAuctionPackage]): Unit = js.native
  def unsubscribeClients(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAuctionPackage] = js.native
  def unsubscribeClients(params: ParamsResourceBuyersAuctionpackagesUnsubscribeclients): GaxiosPromise[SchemaAuctionPackage] = js.native
  def unsubscribeClients(
    params: ParamsResourceBuyersAuctionpackagesUnsubscribeclients,
    callback: BodyResponseCallback[SchemaAuctionPackage]
  ): Unit = js.native
  def unsubscribeClients(
    params: ParamsResourceBuyersAuctionpackagesUnsubscribeclients,
    options: BodyResponseCallback[Readable | SchemaAuctionPackage],
    callback: BodyResponseCallback[Readable | SchemaAuctionPackage]
  ): Unit = js.native
  def unsubscribeClients(params: ParamsResourceBuyersAuctionpackagesUnsubscribeclients, options: MethodOptions): GaxiosPromise[SchemaAuctionPackage] = js.native
  def unsubscribeClients(
    params: ParamsResourceBuyersAuctionpackagesUnsubscribeclients,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAuctionPackage]
  ): Unit = js.native
  /**
    * Unsubscribe from the auction package for the specified clients of the buyer. Unsubscribing a client that is not subscribed will have no effect.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/authorizedbuyersmarketplace.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const authorizedbuyersmarketplace = google.authorizedbuyersmarketplace('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/authorized-buyers-marketplace'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await authorizedbuyersmarketplace.buyers.auctionPackages.unsubscribeClients(
    *       {
    *         // Required. Name of the auction package. Format: `buyers/{accountId\}/auctionPackages/{auctionPackageId\}`
    *         auctionPackage: 'buyers/my-buyer/auctionPackages/my-auctionPackage',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "clients": []
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "creator": "my_creator",
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "subscribedClients": [],
    *   //   "updateTime": "my_updateTime"
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
  def unsubscribeClients(params: ParamsResourceBuyersAuctionpackagesUnsubscribeclients, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def unsubscribeClients(
    params: ParamsResourceBuyersAuctionpackagesUnsubscribeclients,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
