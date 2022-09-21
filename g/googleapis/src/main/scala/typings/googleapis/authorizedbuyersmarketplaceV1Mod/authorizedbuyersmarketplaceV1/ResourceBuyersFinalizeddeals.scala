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

@JSImport("googleapis/build/src/apis/authorizedbuyersmarketplace/v1", "authorizedbuyersmarketplace_v1.Resource$Buyers$Finalizeddeals")
@js.native
open class ResourceBuyersFinalizeddeals protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def addCreative(): GaxiosPromise[SchemaFinalizedDeal] = js.native
  def addCreative(callback: BodyResponseCallback[SchemaFinalizedDeal]): Unit = js.native
  def addCreative(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFinalizedDeal] = js.native
  def addCreative(params: ParamsResourceBuyersFinalizeddealsAddcreative): GaxiosPromise[SchemaFinalizedDeal] = js.native
  def addCreative(
    params: ParamsResourceBuyersFinalizeddealsAddcreative,
    callback: BodyResponseCallback[SchemaFinalizedDeal]
  ): Unit = js.native
  def addCreative(
    params: ParamsResourceBuyersFinalizeddealsAddcreative,
    options: BodyResponseCallback[Readable | SchemaFinalizedDeal],
    callback: BodyResponseCallback[Readable | SchemaFinalizedDeal]
  ): Unit = js.native
  def addCreative(params: ParamsResourceBuyersFinalizeddealsAddcreative, options: MethodOptions): GaxiosPromise[SchemaFinalizedDeal] = js.native
  def addCreative(
    params: ParamsResourceBuyersFinalizeddealsAddcreative,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFinalizedDeal]
  ): Unit = js.native
  /**
    * Add creative to be used in the bidding process for a finalized deal. For programmatic guaranteed deals, it's recommended that you associate at least one approved creative with the deal before calling SetReadyToServe, to help reduce the number of bid responses filtered because they don't contain approved creatives. Creatives successfully added to a deal can be found in the Realtime-bidding Creatives API creative.deal_ids. This method only applies to programmatic guaranteed deals. Maximum number of 1000 creatives can be added to a finalized deal.
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
    *     await authorizedbuyersmarketplace.buyers.finalizedDeals.addCreative({
    *       // Required. Name of the finalized deal in the format of: `buyers/{accountId\}/finalizedDeals/{dealId\}`
    *       deal: 'buyers/my-buyer/finalizedDeals/my-finalizedDeal',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "creative": "my_creative"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "deal": {},
    *   //   "dealPausingInfo": {},
    *   //   "dealServingStatus": "my_dealServingStatus",
    *   //   "name": "my_name",
    *   //   "readyToServe": false,
    *   //   "rtbMetrics": {}
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
  def addCreative(params: ParamsResourceBuyersFinalizeddealsAddcreative, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def addCreative(
    params: ParamsResourceBuyersFinalizeddealsAddcreative,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaFinalizedDeal] = js.native
  def get(callback: BodyResponseCallback[SchemaFinalizedDeal]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFinalizedDeal] = js.native
  def get(params: ParamsResourceBuyersFinalizeddealsGet): GaxiosPromise[SchemaFinalizedDeal] = js.native
  def get(params: ParamsResourceBuyersFinalizeddealsGet, callback: BodyResponseCallback[SchemaFinalizedDeal]): Unit = js.native
  def get(
    params: ParamsResourceBuyersFinalizeddealsGet,
    options: BodyResponseCallback[Readable | SchemaFinalizedDeal],
    callback: BodyResponseCallback[Readable | SchemaFinalizedDeal]
  ): Unit = js.native
  def get(params: ParamsResourceBuyersFinalizeddealsGet, options: MethodOptions): GaxiosPromise[SchemaFinalizedDeal] = js.native
  def get(
    params: ParamsResourceBuyersFinalizeddealsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFinalizedDeal]
  ): Unit = js.native
  /**
    * Gets a finalized deal given its name.
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
    *   const res = await authorizedbuyersmarketplace.buyers.finalizedDeals.get({
    *     // Required. Format: `buyers/{accountId\}/finalizedDeals/{dealId\}`
    *     name: 'buyers/my-buyer/finalizedDeals/my-finalizedDeal',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "deal": {},
    *   //   "dealPausingInfo": {},
    *   //   "dealServingStatus": "my_dealServingStatus",
    *   //   "name": "my_name",
    *   //   "readyToServe": false,
    *   //   "rtbMetrics": {}
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
  def get(params: ParamsResourceBuyersFinalizeddealsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceBuyersFinalizeddealsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListFinalizedDealsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListFinalizedDealsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListFinalizedDealsResponse] = js.native
  def list(params: ParamsResourceBuyersFinalizeddealsList): GaxiosPromise[SchemaListFinalizedDealsResponse] = js.native
  def list(
    params: ParamsResourceBuyersFinalizeddealsList,
    callback: BodyResponseCallback[SchemaListFinalizedDealsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceBuyersFinalizeddealsList,
    options: BodyResponseCallback[Readable | SchemaListFinalizedDealsResponse],
    callback: BodyResponseCallback[Readable | SchemaListFinalizedDealsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceBuyersFinalizeddealsList, options: MethodOptions): GaxiosPromise[SchemaListFinalizedDealsResponse] = js.native
  def list(
    params: ParamsResourceBuyersFinalizeddealsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListFinalizedDealsResponse]
  ): Unit = js.native
  /**
    * Lists finalized deals. Use the URL path "/v1/buyers/{accountId\}/finalizedDeals" to list finalized deals for the current buyer and its clients. Bidders can use the URL path "/v1/bidders/{accountId\}/finalizedDeals" to list finalized deals for the bidder, its buyers and all their clients.
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
    *   const res = await authorizedbuyersmarketplace.buyers.finalizedDeals.list({
    *     // Optional query string using the [Cloud API list filtering syntax](https://developers.google.com/authorized-buyers/apis/guides/v2/list-filters) Supported columns for filtering are: * deal.displayName * deal.dealType * deal.createTime * deal.updateTime * deal.flightStartTime * deal.flightEndTime * dealServingStatus
    *     filter: 'placeholder-value',
    *     // An optional query string to sort finalized deals using the [Cloud API sorting syntax](https://cloud.google.com/apis/design/design_patterns#sorting_order). If no sort order is specified, results will be returned in an arbitrary order. Supported columns for sorting are: * deal.displayName * deal.createTime * deal.updateTime * deal.flightStartTime * deal.flightEndTime * rtbMetrics.bidRequests7Days * rtbMetrics.bids7Days * rtbMetrics.adImpressions7Days * rtbMetrics.bidRate7Days * rtbMetrics.filteredBidRate7Days * rtbMetrics.mustBidRateCurrentMonth Example: 'deal.displayName, deal.updateTime desc'
    *     orderBy: 'placeholder-value',
    *     // Requested page size. The server may return fewer results than requested. If requested more than 500, the server will return 500 results per page. If unspecified, the server will pick a default page size of 100.
    *     pageSize: 'placeholder-value',
    *     // The page token as returned from ListFinalizedDealsResponse.
    *     pageToken: 'placeholder-value',
    *     // Required. The buyer to list the finalized deals for, in the format: `buyers/{accountId\}`. When used to list finalized deals for a bidder, its buyers and clients, in the format `bidders/{accountId\}`.
    *     parent: 'buyers/my-buyer',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "finalizedDeals": [],
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
  def list(params: ParamsResourceBuyersFinalizeddealsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceBuyersFinalizeddealsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def pause(): GaxiosPromise[SchemaFinalizedDeal] = js.native
  def pause(callback: BodyResponseCallback[SchemaFinalizedDeal]): Unit = js.native
  def pause(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFinalizedDeal] = js.native
  def pause(params: ParamsResourceBuyersFinalizeddealsPause): GaxiosPromise[SchemaFinalizedDeal] = js.native
  def pause(
    params: ParamsResourceBuyersFinalizeddealsPause,
    callback: BodyResponseCallback[SchemaFinalizedDeal]
  ): Unit = js.native
  def pause(
    params: ParamsResourceBuyersFinalizeddealsPause,
    options: BodyResponseCallback[Readable | SchemaFinalizedDeal],
    callback: BodyResponseCallback[Readable | SchemaFinalizedDeal]
  ): Unit = js.native
  def pause(params: ParamsResourceBuyersFinalizeddealsPause, options: MethodOptions): GaxiosPromise[SchemaFinalizedDeal] = js.native
  def pause(
    params: ParamsResourceBuyersFinalizeddealsPause,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFinalizedDeal]
  ): Unit = js.native
  /**
    * Pauses serving of the given finalized deal. This call only pauses the serving status, and does not affect other fields of the finalized deal. Calling this method for an already paused deal has no effect. This method only applies to programmatic guaranteed deals.
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
    *   const res = await authorizedbuyersmarketplace.buyers.finalizedDeals.pause({
    *     // Required. Format: `buyers/{accountId\}/finalizedDeals/{dealId\}`
    *     name: 'buyers/my-buyer/finalizedDeals/my-finalizedDeal',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "reason": "my_reason"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "deal": {},
    *   //   "dealPausingInfo": {},
    *   //   "dealServingStatus": "my_dealServingStatus",
    *   //   "name": "my_name",
    *   //   "readyToServe": false,
    *   //   "rtbMetrics": {}
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
  def pause(params: ParamsResourceBuyersFinalizeddealsPause, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def pause(
    params: ParamsResourceBuyersFinalizeddealsPause,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def resume(): GaxiosPromise[SchemaFinalizedDeal] = js.native
  def resume(callback: BodyResponseCallback[SchemaFinalizedDeal]): Unit = js.native
  def resume(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFinalizedDeal] = js.native
  def resume(params: ParamsResourceBuyersFinalizeddealsResume): GaxiosPromise[SchemaFinalizedDeal] = js.native
  def resume(
    params: ParamsResourceBuyersFinalizeddealsResume,
    callback: BodyResponseCallback[SchemaFinalizedDeal]
  ): Unit = js.native
  def resume(
    params: ParamsResourceBuyersFinalizeddealsResume,
    options: BodyResponseCallback[Readable | SchemaFinalizedDeal],
    callback: BodyResponseCallback[Readable | SchemaFinalizedDeal]
  ): Unit = js.native
  def resume(params: ParamsResourceBuyersFinalizeddealsResume, options: MethodOptions): GaxiosPromise[SchemaFinalizedDeal] = js.native
  def resume(
    params: ParamsResourceBuyersFinalizeddealsResume,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFinalizedDeal]
  ): Unit = js.native
  /**
    * Resumes serving of the given finalized deal. Calling this method for an running deal has no effect. If a deal is initially paused by the seller, calling this method will not resume serving of the deal until the seller also resumes the deal. This method only applies to programmatic guaranteed deals.
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
    *   const res = await authorizedbuyersmarketplace.buyers.finalizedDeals.resume({
    *     // Required. Format: `buyers/{accountId\}/finalizedDeals/{dealId\}`
    *     name: 'buyers/my-buyer/finalizedDeals/my-finalizedDeal',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "deal": {},
    *   //   "dealPausingInfo": {},
    *   //   "dealServingStatus": "my_dealServingStatus",
    *   //   "name": "my_name",
    *   //   "readyToServe": false,
    *   //   "rtbMetrics": {}
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
  def resume(params: ParamsResourceBuyersFinalizeddealsResume, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def resume(
    params: ParamsResourceBuyersFinalizeddealsResume,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setReadyToServe(): GaxiosPromise[SchemaFinalizedDeal] = js.native
  def setReadyToServe(callback: BodyResponseCallback[SchemaFinalizedDeal]): Unit = js.native
  def setReadyToServe(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFinalizedDeal] = js.native
  def setReadyToServe(params: ParamsResourceBuyersFinalizeddealsSetreadytoserve): GaxiosPromise[SchemaFinalizedDeal] = js.native
  def setReadyToServe(
    params: ParamsResourceBuyersFinalizeddealsSetreadytoserve,
    callback: BodyResponseCallback[SchemaFinalizedDeal]
  ): Unit = js.native
  def setReadyToServe(
    params: ParamsResourceBuyersFinalizeddealsSetreadytoserve,
    options: BodyResponseCallback[Readable | SchemaFinalizedDeal],
    callback: BodyResponseCallback[Readable | SchemaFinalizedDeal]
  ): Unit = js.native
  def setReadyToServe(params: ParamsResourceBuyersFinalizeddealsSetreadytoserve, options: MethodOptions): GaxiosPromise[SchemaFinalizedDeal] = js.native
  def setReadyToServe(
    params: ParamsResourceBuyersFinalizeddealsSetreadytoserve,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFinalizedDeal]
  ): Unit = js.native
  /**
    * Sets the given finalized deal as ready to serve. By default, deals are set as ready to serve as soon as they're finalized. If you want to opt out of the default behavior, and manually indicate that deals are ready to serve, ask your Technical Account Manager to add you to the allowlist. If you choose to use this method, finalized deals belonging to the bidder and its child seats don't start serving until after you call `setReadyToServe`, and after the deals become active. For example, you can use this method to delay receiving bid requests until your creative is ready. This method only applies to programmatic guaranteed deals.
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
    *     await authorizedbuyersmarketplace.buyers.finalizedDeals.setReadyToServe({
    *       // Required. Format: `buyers/{accountId\}/finalizedDeals/{dealId\}`
    *       deal: 'buyers/my-buyer/finalizedDeals/my-finalizedDeal',
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
    *   //   "deal": {},
    *   //   "dealPausingInfo": {},
    *   //   "dealServingStatus": "my_dealServingStatus",
    *   //   "name": "my_name",
    *   //   "readyToServe": false,
    *   //   "rtbMetrics": {}
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
  def setReadyToServe(params: ParamsResourceBuyersFinalizeddealsSetreadytoserve, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setReadyToServe(
    params: ParamsResourceBuyersFinalizeddealsSetreadytoserve,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
