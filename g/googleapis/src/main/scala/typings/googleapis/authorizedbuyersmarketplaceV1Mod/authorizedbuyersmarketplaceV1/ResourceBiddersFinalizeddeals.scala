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

@JSImport("googleapis/build/src/apis/authorizedbuyersmarketplace/v1", "authorizedbuyersmarketplace_v1.Resource$Bidders$Finalizeddeals")
@js.native
open class ResourceBiddersFinalizeddeals protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListFinalizedDealsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListFinalizedDealsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListFinalizedDealsResponse] = js.native
  def list(params: ParamsResourceBiddersFinalizeddealsList): GaxiosPromise[SchemaListFinalizedDealsResponse] = js.native
  def list(
    params: ParamsResourceBiddersFinalizeddealsList,
    callback: BodyResponseCallback[SchemaListFinalizedDealsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceBiddersFinalizeddealsList,
    options: BodyResponseCallback[Readable | SchemaListFinalizedDealsResponse],
    callback: BodyResponseCallback[Readable | SchemaListFinalizedDealsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceBiddersFinalizeddealsList, options: MethodOptions): GaxiosPromise[SchemaListFinalizedDealsResponse] = js.native
  def list(
    params: ParamsResourceBiddersFinalizeddealsList,
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
    *   const res = await authorizedbuyersmarketplace.bidders.finalizedDeals.list({
    *     // Optional query string using the [Cloud API list filtering syntax](https://developers.google.com/authorized-buyers/apis/guides/v2/list-filters) Supported columns for filtering are: * deal.displayName * deal.dealType * deal.createTime * deal.updateTime * deal.flightStartTime * deal.flightEndTime * dealServingStatus
    *     filter: 'placeholder-value',
    *     // An optional query string to sort finalized deals using the [Cloud API sorting syntax](https://cloud.google.com/apis/design/design_patterns#sorting_order). If no sort order is specified, results will be returned in an arbitrary order. Supported columns for sorting are: * deal.displayName * deal.createTime * deal.updateTime * deal.flightStartTime * deal.flightEndTime * rtbMetrics.bidRequests7Days * rtbMetrics.bids7Days * rtbMetrics.adImpressions7Days * rtbMetrics.bidRate7Days * rtbMetrics.filteredBidRate7Days * rtbMetrics.mustBidRateCurrentMonth Example: 'deal.displayName, deal.updateTime desc'
    *     orderBy: 'placeholder-value',
    *     // Requested page size. The server may return fewer results than requested. If requested more than 500, the server will return 500 results per page. If unspecified, the server will pick a default page size of 100.
    *     pageSize: 'placeholder-value',
    *     // The page token as returned from ListFinalizedDealsResponse.
    *     pageToken: 'placeholder-value',
    *     // Required. The buyer to list the finalized deals for, in the format: `buyers/{accountId\}`. When used to list finalized deals for a bidder, its buyers and clients, in the format `bidders/{accountId\}`.
    *     parent: 'bidders/my-bidder',
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
  def list(params: ParamsResourceBiddersFinalizeddealsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceBiddersFinalizeddealsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
