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

@JSImport("googleapis/build/src/apis/authorizedbuyersmarketplace/v1", "authorizedbuyersmarketplace_v1.Resource$Buyers$Proposals$Deals")
@js.native
open class ResourceBuyersProposalsDeals protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def batchUpdate(): GaxiosPromise[SchemaBatchUpdateDealsResponse] = js.native
  def batchUpdate(callback: BodyResponseCallback[SchemaBatchUpdateDealsResponse]): Unit = js.native
  def batchUpdate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBatchUpdateDealsResponse] = js.native
  def batchUpdate(params: ParamsResourceBuyersProposalsDealsBatchupdate): GaxiosPromise[SchemaBatchUpdateDealsResponse] = js.native
  def batchUpdate(
    params: ParamsResourceBuyersProposalsDealsBatchupdate,
    callback: BodyResponseCallback[SchemaBatchUpdateDealsResponse]
  ): Unit = js.native
  def batchUpdate(
    params: ParamsResourceBuyersProposalsDealsBatchupdate,
    options: BodyResponseCallback[Readable | SchemaBatchUpdateDealsResponse],
    callback: BodyResponseCallback[Readable | SchemaBatchUpdateDealsResponse]
  ): Unit = js.native
  def batchUpdate(params: ParamsResourceBuyersProposalsDealsBatchupdate, options: MethodOptions): GaxiosPromise[SchemaBatchUpdateDealsResponse] = js.native
  def batchUpdate(
    params: ParamsResourceBuyersProposalsDealsBatchupdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchUpdateDealsResponse]
  ): Unit = js.native
  /**
    * Batch updates multiple deals in the same proposal.
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
    *     await authorizedbuyersmarketplace.buyers.proposals.deals.batchUpdate({
    *       // Required. The name of the proposal containing the deals to batch update. Format: buyers/{accountId\}/proposals/{proposalId\}
    *       parent: 'buyers/my-buyer/proposals/my-proposal',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "requests": []
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "deals": []
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
  def batchUpdate(params: ParamsResourceBuyersProposalsDealsBatchupdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchUpdate(
    params: ParamsResourceBuyersProposalsDealsBatchupdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaDeal] = js.native
  def get(callback: BodyResponseCallback[SchemaDeal]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDeal] = js.native
  def get(params: ParamsResourceBuyersProposalsDealsGet): GaxiosPromise[SchemaDeal] = js.native
  def get(params: ParamsResourceBuyersProposalsDealsGet, callback: BodyResponseCallback[SchemaDeal]): Unit = js.native
  def get(
    params: ParamsResourceBuyersProposalsDealsGet,
    options: BodyResponseCallback[Readable | SchemaDeal],
    callback: BodyResponseCallback[Readable | SchemaDeal]
  ): Unit = js.native
  def get(params: ParamsResourceBuyersProposalsDealsGet, options: MethodOptions): GaxiosPromise[SchemaDeal] = js.native
  def get(
    params: ParamsResourceBuyersProposalsDealsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDeal]
  ): Unit = js.native
  /**
    * Gets a deal given its name. The deal is returned at its head revision.
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
    *   const res = await authorizedbuyersmarketplace.buyers.proposals.deals.get({
    *     // Required. Format: buyers/{accountId\}/proposals/{proposalId\}/deals/{dealId\}
    *     name: 'buyers/my-buyer/proposals/my-proposal/deals/my-deal',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "billedBuyer": "my_billedBuyer",
    *   //   "buyer": "my_buyer",
    *   //   "client": "my_client",
    *   //   "createTime": "my_createTime",
    *   //   "creativeRequirements": {},
    *   //   "dealType": "my_dealType",
    *   //   "deliveryControl": {},
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "estimatedGrossSpend": {},
    *   //   "flightEndTime": "my_flightEndTime",
    *   //   "flightStartTime": "my_flightStartTime",
    *   //   "name": "my_name",
    *   //   "preferredDealTerms": {},
    *   //   "privateAuctionTerms": {},
    *   //   "programmaticGuaranteedTerms": {},
    *   //   "proposalRevision": "my_proposalRevision",
    *   //   "publisherProfile": "my_publisherProfile",
    *   //   "sellerTimeZone": {},
    *   //   "targeting": {},
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
  def get(params: ParamsResourceBuyersProposalsDealsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceBuyersProposalsDealsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListDealsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListDealsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListDealsResponse] = js.native
  def list(params: ParamsResourceBuyersProposalsDealsList): GaxiosPromise[SchemaListDealsResponse] = js.native
  def list(
    params: ParamsResourceBuyersProposalsDealsList,
    callback: BodyResponseCallback[SchemaListDealsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceBuyersProposalsDealsList,
    options: BodyResponseCallback[Readable | SchemaListDealsResponse],
    callback: BodyResponseCallback[Readable | SchemaListDealsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceBuyersProposalsDealsList, options: MethodOptions): GaxiosPromise[SchemaListDealsResponse] = js.native
  def list(
    params: ParamsResourceBuyersProposalsDealsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListDealsResponse]
  ): Unit = js.native
  /**
    * Lists all deals in a proposal. To retrieve only the finalized revision deals regardless if a deal is being renegotiated, see the FinalizedDeals resource.
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
    *   const res = await authorizedbuyersmarketplace.buyers.proposals.deals.list({
    *     // Requested page size. The server may return fewer results than requested. If requested more than 500, the server will return 500 results per page. If unspecified, the server will pick a default page size of 100.
    *     pageSize: 'placeholder-value',
    *     // The page token as returned from ListDealsResponse.
    *     pageToken: 'placeholder-value',
    *     // Required. The name of the proposal containing the deals to retrieve. Format: buyers/{accountId\}/proposals/{proposalId\}
    *     parent: 'buyers/my-buyer/proposals/my-proposal',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "deals": [],
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
  def list(params: ParamsResourceBuyersProposalsDealsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceBuyersProposalsDealsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaDeal] = js.native
  def patch(callback: BodyResponseCallback[SchemaDeal]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDeal] = js.native
  def patch(params: ParamsResourceBuyersProposalsDealsPatch): GaxiosPromise[SchemaDeal] = js.native
  def patch(params: ParamsResourceBuyersProposalsDealsPatch, callback: BodyResponseCallback[SchemaDeal]): Unit = js.native
  def patch(
    params: ParamsResourceBuyersProposalsDealsPatch,
    options: BodyResponseCallback[Readable | SchemaDeal],
    callback: BodyResponseCallback[Readable | SchemaDeal]
  ): Unit = js.native
  def patch(params: ParamsResourceBuyersProposalsDealsPatch, options: MethodOptions): GaxiosPromise[SchemaDeal] = js.native
  def patch(
    params: ParamsResourceBuyersProposalsDealsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDeal]
  ): Unit = js.native
  /**
    * Updates the given deal at the buyer known revision number. If the server revision has advanced since the passed-in proposal.proposal_revision an ABORTED error message will be returned. The revision number is incremented by the server whenever the proposal or its constituent deals are updated. Note: The revision number is kept at a proposal level. The buyer of the API is expected to keep track of the revision number after the last update operation and send it in as part of the next update request. This way, if there are further changes on the server (for example, seller making new updates), then the server can detect conflicts and reject the proposed changes.
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
    *   const res = await authorizedbuyersmarketplace.buyers.proposals.deals.patch({
    *     // Immutable. The unique identifier of the deal. Auto-generated by the server when a deal is created. Format: buyers/{accountId\}/proposals/{proposalId\}/deals/{dealId\}
    *     name: 'buyers/my-buyer/proposals/my-proposal/deals/my-deal',
    *     // List of fields to be updated. If empty or unspecified, the service will update all fields populated in the update request excluding the output only fields and primitive fields with default value. Note that explicit field mask is required in order to reset a primitive field back to its default value, for example, false for boolean fields, 0 for integer fields. A special field mask consisting of a single path "*" can be used to indicate full replacement(the equivalent of PUT method), updatable fields unset or unspecified in the input will be cleared or set to default value. Output only fields will be ignored regardless of the value of updateMask.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "billedBuyer": "my_billedBuyer",
    *       //   "buyer": "my_buyer",
    *       //   "client": "my_client",
    *       //   "createTime": "my_createTime",
    *       //   "creativeRequirements": {},
    *       //   "dealType": "my_dealType",
    *       //   "deliveryControl": {},
    *       //   "description": "my_description",
    *       //   "displayName": "my_displayName",
    *       //   "estimatedGrossSpend": {},
    *       //   "flightEndTime": "my_flightEndTime",
    *       //   "flightStartTime": "my_flightStartTime",
    *       //   "name": "my_name",
    *       //   "preferredDealTerms": {},
    *       //   "privateAuctionTerms": {},
    *       //   "programmaticGuaranteedTerms": {},
    *       //   "proposalRevision": "my_proposalRevision",
    *       //   "publisherProfile": "my_publisherProfile",
    *       //   "sellerTimeZone": {},
    *       //   "targeting": {},
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "billedBuyer": "my_billedBuyer",
    *   //   "buyer": "my_buyer",
    *   //   "client": "my_client",
    *   //   "createTime": "my_createTime",
    *   //   "creativeRequirements": {},
    *   //   "dealType": "my_dealType",
    *   //   "deliveryControl": {},
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "estimatedGrossSpend": {},
    *   //   "flightEndTime": "my_flightEndTime",
    *   //   "flightStartTime": "my_flightStartTime",
    *   //   "name": "my_name",
    *   //   "preferredDealTerms": {},
    *   //   "privateAuctionTerms": {},
    *   //   "programmaticGuaranteedTerms": {},
    *   //   "proposalRevision": "my_proposalRevision",
    *   //   "publisherProfile": "my_publisherProfile",
    *   //   "sellerTimeZone": {},
    *   //   "targeting": {},
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
  def patch(params: ParamsResourceBuyersProposalsDealsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceBuyersProposalsDealsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
