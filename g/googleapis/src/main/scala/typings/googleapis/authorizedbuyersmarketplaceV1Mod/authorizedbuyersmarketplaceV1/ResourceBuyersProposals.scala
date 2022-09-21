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

@JSImport("googleapis/build/src/apis/authorizedbuyersmarketplace/v1", "authorizedbuyersmarketplace_v1.Resource$Buyers$Proposals")
@js.native
open class ResourceBuyersProposals protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def accept(): GaxiosPromise[SchemaProposal] = js.native
  def accept(callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def accept(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def accept(params: ParamsResourceBuyersProposalsAccept): GaxiosPromise[SchemaProposal] = js.native
  def accept(params: ParamsResourceBuyersProposalsAccept, callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def accept(
    params: ParamsResourceBuyersProposalsAccept,
    options: BodyResponseCallback[Readable | SchemaProposal],
    callback: BodyResponseCallback[Readable | SchemaProposal]
  ): Unit = js.native
  def accept(params: ParamsResourceBuyersProposalsAccept, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def accept(
    params: ParamsResourceBuyersProposalsAccept,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProposal]
  ): Unit = js.native
  /**
    * Accepts the proposal at the given revision number. If the revision number in the request is behind the latest from the server, an error message will be returned. This call updates the Proposal.state from `BUYER_ACCEPTANCE_REQUESTED` to `FINALIZED`; it has no side effect if the Proposal.state is already `FINALIZED` and throws exception if the Proposal.state is not either `BUYER_ACCEPTANCE_REQUESTED` or `FINALIZED`. Accepting a proposal means the buyer understands and accepts the Proposal.terms_and_conditions proposed by the seller.
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
    *   const res = await authorizedbuyersmarketplace.buyers.proposals.accept({
    *     // Name of the proposal. Format: `buyers/{accountId\}/proposals/{proposalId\}`
    *     name: 'buyers/my-buyer/proposals/my-proposal',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "proposalRevision": "my_proposalRevision"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "billedBuyer": "my_billedBuyer",
    *   //   "buyer": "my_buyer",
    *   //   "buyerContacts": [],
    *   //   "buyerPrivateData": {},
    *   //   "client": "my_client",
    *   //   "dealType": "my_dealType",
    *   //   "displayName": "my_displayName",
    *   //   "isRenegotiating": false,
    *   //   "lastUpdaterOrCommentorRole": "my_lastUpdaterOrCommentorRole",
    *   //   "name": "my_name",
    *   //   "notes": [],
    *   //   "originatorRole": "my_originatorRole",
    *   //   "pausingConsented": false,
    *   //   "proposalRevision": "my_proposalRevision",
    *   //   "publisherProfile": "my_publisherProfile",
    *   //   "sellerContacts": [],
    *   //   "state": "my_state",
    *   //   "termsAndConditions": "my_termsAndConditions",
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
  def accept(params: ParamsResourceBuyersProposalsAccept, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def accept(
    params: ParamsResourceBuyersProposalsAccept,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def addNote(): GaxiosPromise[SchemaProposal] = js.native
  def addNote(callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def addNote(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def addNote(params: ParamsResourceBuyersProposalsAddnote): GaxiosPromise[SchemaProposal] = js.native
  def addNote(params: ParamsResourceBuyersProposalsAddnote, callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def addNote(
    params: ParamsResourceBuyersProposalsAddnote,
    options: BodyResponseCallback[Readable | SchemaProposal],
    callback: BodyResponseCallback[Readable | SchemaProposal]
  ): Unit = js.native
  def addNote(params: ParamsResourceBuyersProposalsAddnote, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def addNote(
    params: ParamsResourceBuyersProposalsAddnote,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProposal]
  ): Unit = js.native
  /**
    * Creates a note for this proposal and sends to the seller.
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
    *   const res = await authorizedbuyersmarketplace.buyers.proposals.addNote({
    *     // Name of the proposal. Format: `buyers/{accountId\}/proposals/{proposalId\}`
    *     proposal: 'buyers/my-buyer/proposals/my-proposal',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "note": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "billedBuyer": "my_billedBuyer",
    *   //   "buyer": "my_buyer",
    *   //   "buyerContacts": [],
    *   //   "buyerPrivateData": {},
    *   //   "client": "my_client",
    *   //   "dealType": "my_dealType",
    *   //   "displayName": "my_displayName",
    *   //   "isRenegotiating": false,
    *   //   "lastUpdaterOrCommentorRole": "my_lastUpdaterOrCommentorRole",
    *   //   "name": "my_name",
    *   //   "notes": [],
    *   //   "originatorRole": "my_originatorRole",
    *   //   "pausingConsented": false,
    *   //   "proposalRevision": "my_proposalRevision",
    *   //   "publisherProfile": "my_publisherProfile",
    *   //   "sellerContacts": [],
    *   //   "state": "my_state",
    *   //   "termsAndConditions": "my_termsAndConditions",
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
  def addNote(params: ParamsResourceBuyersProposalsAddnote, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def addNote(
    params: ParamsResourceBuyersProposalsAddnote,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def cancelNegotiation(): GaxiosPromise[SchemaProposal] = js.native
  def cancelNegotiation(callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def cancelNegotiation(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def cancelNegotiation(params: ParamsResourceBuyersProposalsCancelnegotiation): GaxiosPromise[SchemaProposal] = js.native
  def cancelNegotiation(
    params: ParamsResourceBuyersProposalsCancelnegotiation,
    callback: BodyResponseCallback[SchemaProposal]
  ): Unit = js.native
  def cancelNegotiation(
    params: ParamsResourceBuyersProposalsCancelnegotiation,
    options: BodyResponseCallback[Readable | SchemaProposal],
    callback: BodyResponseCallback[Readable | SchemaProposal]
  ): Unit = js.native
  def cancelNegotiation(params: ParamsResourceBuyersProposalsCancelnegotiation, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def cancelNegotiation(
    params: ParamsResourceBuyersProposalsCancelnegotiation,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProposal]
  ): Unit = js.native
  /**
    * Cancels an ongoing negotiation on a proposal. This does not cancel or end serving for the deals if the proposal has been finalized. If the proposal has not been finalized before, calling this method will set the Proposal.state to `TERMINATED` and increment the Proposal.proposal_revision. If the proposal has been finalized before and is under renegotiation now, calling this method will reset the Proposal.state to `FINALIZED` and increment the Proposal.proposal_revision. This method does not support private auction proposals whose Proposal.deal_type is 'PRIVATE_AUCTION'.
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
    *     await authorizedbuyersmarketplace.buyers.proposals.cancelNegotiation({
    *       // Name of the proposal. Format: `buyers/{accountId\}/proposals/{proposalId\}`
    *       proposal: 'buyers/my-buyer/proposals/my-proposal',
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
    *   //   "billedBuyer": "my_billedBuyer",
    *   //   "buyer": "my_buyer",
    *   //   "buyerContacts": [],
    *   //   "buyerPrivateData": {},
    *   //   "client": "my_client",
    *   //   "dealType": "my_dealType",
    *   //   "displayName": "my_displayName",
    *   //   "isRenegotiating": false,
    *   //   "lastUpdaterOrCommentorRole": "my_lastUpdaterOrCommentorRole",
    *   //   "name": "my_name",
    *   //   "notes": [],
    *   //   "originatorRole": "my_originatorRole",
    *   //   "pausingConsented": false,
    *   //   "proposalRevision": "my_proposalRevision",
    *   //   "publisherProfile": "my_publisherProfile",
    *   //   "sellerContacts": [],
    *   //   "state": "my_state",
    *   //   "termsAndConditions": "my_termsAndConditions",
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
  def cancelNegotiation(params: ParamsResourceBuyersProposalsCancelnegotiation, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def cancelNegotiation(
    params: ParamsResourceBuyersProposalsCancelnegotiation,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  var deals: ResourceBuyersProposalsDeals = js.native
  
  def get(): GaxiosPromise[SchemaProposal] = js.native
  def get(callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def get(params: ParamsResourceBuyersProposalsGet): GaxiosPromise[SchemaProposal] = js.native
  def get(params: ParamsResourceBuyersProposalsGet, callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def get(
    params: ParamsResourceBuyersProposalsGet,
    options: BodyResponseCallback[Readable | SchemaProposal],
    callback: BodyResponseCallback[Readable | SchemaProposal]
  ): Unit = js.native
  def get(params: ParamsResourceBuyersProposalsGet, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def get(
    params: ParamsResourceBuyersProposalsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProposal]
  ): Unit = js.native
  /**
    * Gets a proposal using its name. The proposal is returned at most recent revision. revision.
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
    *   const res = await authorizedbuyersmarketplace.buyers.proposals.get({
    *     // Required. Name of the proposal. Format: `buyers/{accountId\}/proposals/{proposalId\}`
    *     name: 'buyers/my-buyer/proposals/my-proposal',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "billedBuyer": "my_billedBuyer",
    *   //   "buyer": "my_buyer",
    *   //   "buyerContacts": [],
    *   //   "buyerPrivateData": {},
    *   //   "client": "my_client",
    *   //   "dealType": "my_dealType",
    *   //   "displayName": "my_displayName",
    *   //   "isRenegotiating": false,
    *   //   "lastUpdaterOrCommentorRole": "my_lastUpdaterOrCommentorRole",
    *   //   "name": "my_name",
    *   //   "notes": [],
    *   //   "originatorRole": "my_originatorRole",
    *   //   "pausingConsented": false,
    *   //   "proposalRevision": "my_proposalRevision",
    *   //   "publisherProfile": "my_publisherProfile",
    *   //   "sellerContacts": [],
    *   //   "state": "my_state",
    *   //   "termsAndConditions": "my_termsAndConditions",
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
  def get(params: ParamsResourceBuyersProposalsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceBuyersProposalsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListProposalsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListProposalsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListProposalsResponse] = js.native
  def list(params: ParamsResourceBuyersProposalsList): GaxiosPromise[SchemaListProposalsResponse] = js.native
  def list(
    params: ParamsResourceBuyersProposalsList,
    callback: BodyResponseCallback[SchemaListProposalsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceBuyersProposalsList,
    options: BodyResponseCallback[Readable | SchemaListProposalsResponse],
    callback: BodyResponseCallback[Readable | SchemaListProposalsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceBuyersProposalsList, options: MethodOptions): GaxiosPromise[SchemaListProposalsResponse] = js.native
  def list(
    params: ParamsResourceBuyersProposalsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListProposalsResponse]
  ): Unit = js.native
  /**
    * Lists proposals. A filter expression (list filter syntax) may be specified to filter the results. This will not list finalized versions of proposals that are being renegotiated; to retrieve these use the finalizedProposals resource.
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
    *   const res = await authorizedbuyersmarketplace.buyers.proposals.list({
    *     // Optional query string using the [Cloud API list filtering syntax](https://developers.google.com/authorized-buyers/apis/guides/v2/list-filters) Supported columns for filtering are: * displayName * dealType * updateTime * state
    *     filter: 'placeholder-value',
    *     // Requested page size. The server may return fewer results than requested. If unspecified, the server will put a size of 500.
    *     pageSize: 'placeholder-value',
    *     // The page token as returned from ListProposalsResponse.
    *     pageToken: 'placeholder-value',
    *     // Required. Parent that owns the collection of proposals Format: `buyers/{accountId\}`
    *     parent: 'buyers/my-buyer',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "proposals": []
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
  def list(params: ParamsResourceBuyersProposalsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceBuyersProposalsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaProposal] = js.native
  def patch(callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def patch(params: ParamsResourceBuyersProposalsPatch): GaxiosPromise[SchemaProposal] = js.native
  def patch(params: ParamsResourceBuyersProposalsPatch, callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def patch(
    params: ParamsResourceBuyersProposalsPatch,
    options: BodyResponseCallback[Readable | SchemaProposal],
    callback: BodyResponseCallback[Readable | SchemaProposal]
  ): Unit = js.native
  def patch(params: ParamsResourceBuyersProposalsPatch, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def patch(
    params: ParamsResourceBuyersProposalsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProposal]
  ): Unit = js.native
  /**
    * Updates the proposal at the given revision number. If the revision number in the request is behind the latest from the server, an error message will be returned. See FieldMask for how to use FieldMask. Only fields specified in the UpdateProposalRequest.update_mask will be updated; Fields noted as 'Immutable' or 'Output only' yet specified in the UpdateProposalRequest.update_mask will be ignored and left unchanged. Updating a private auction proposal is not allowed and will result in an error.
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
    *   const res = await authorizedbuyersmarketplace.buyers.proposals.patch({
    *     // Immutable. The name of the proposal serving as a unique identifier. Format: buyers/{accountId\}/proposals/{proposalId\}
    *     name: 'buyers/my-buyer/proposals/my-proposal',
    *     // List of fields to be updated. If empty or unspecified, the service will update all fields populated in the update request excluding the output only fields and primitive fields with default value. Note that explicit field mask is required in order to reset a primitive field back to its default value, for example, false for boolean fields, 0 for integer fields. A special field mask consisting of a single path "*" can be used to indicate full replacement(the equivalent of PUT method), updatable fields unset or unspecified in the input will be cleared or set to default value. Output only fields will be ignored regardless of the value of updateMask.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "billedBuyer": "my_billedBuyer",
    *       //   "buyer": "my_buyer",
    *       //   "buyerContacts": [],
    *       //   "buyerPrivateData": {},
    *       //   "client": "my_client",
    *       //   "dealType": "my_dealType",
    *       //   "displayName": "my_displayName",
    *       //   "isRenegotiating": false,
    *       //   "lastUpdaterOrCommentorRole": "my_lastUpdaterOrCommentorRole",
    *       //   "name": "my_name",
    *       //   "notes": [],
    *       //   "originatorRole": "my_originatorRole",
    *       //   "pausingConsented": false,
    *       //   "proposalRevision": "my_proposalRevision",
    *       //   "publisherProfile": "my_publisherProfile",
    *       //   "sellerContacts": [],
    *       //   "state": "my_state",
    *       //   "termsAndConditions": "my_termsAndConditions",
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
    *   //   "buyerContacts": [],
    *   //   "buyerPrivateData": {},
    *   //   "client": "my_client",
    *   //   "dealType": "my_dealType",
    *   //   "displayName": "my_displayName",
    *   //   "isRenegotiating": false,
    *   //   "lastUpdaterOrCommentorRole": "my_lastUpdaterOrCommentorRole",
    *   //   "name": "my_name",
    *   //   "notes": [],
    *   //   "originatorRole": "my_originatorRole",
    *   //   "pausingConsented": false,
    *   //   "proposalRevision": "my_proposalRevision",
    *   //   "publisherProfile": "my_publisherProfile",
    *   //   "sellerContacts": [],
    *   //   "state": "my_state",
    *   //   "termsAndConditions": "my_termsAndConditions",
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
  def patch(params: ParamsResourceBuyersProposalsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceBuyersProposalsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def sendRfp(): GaxiosPromise[SchemaProposal] = js.native
  def sendRfp(callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def sendRfp(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def sendRfp(params: ParamsResourceBuyersProposalsSendrfp): GaxiosPromise[SchemaProposal] = js.native
  def sendRfp(params: ParamsResourceBuyersProposalsSendrfp, callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def sendRfp(
    params: ParamsResourceBuyersProposalsSendrfp,
    options: BodyResponseCallback[Readable | SchemaProposal],
    callback: BodyResponseCallback[Readable | SchemaProposal]
  ): Unit = js.native
  def sendRfp(params: ParamsResourceBuyersProposalsSendrfp, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def sendRfp(
    params: ParamsResourceBuyersProposalsSendrfp,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProposal]
  ): Unit = js.native
  /**
    * Sends a request for proposal (RFP) to a publisher to initiate the negotiation regarding certain inventory. In the RFP, buyers can specify the deal type, deal terms, start and end dates, targeting, and a message to the publisher. Once the RFP is sent, a proposal in `SELLER_REVIEW_REQUESTED` state will be created and returned in the response. The publisher may review your request and respond with detailed deals in the proposal.
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
    *   const res = await authorizedbuyersmarketplace.buyers.proposals.sendRfp({
    *     // Required. The current buyer who is sending the RFP in the format: `buyers/{accountId\}`.
    *     buyer: 'buyers/my-buyer',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "buyerContacts": [],
    *       //   "client": "my_client",
    *       //   "displayName": "my_displayName",
    *       //   "estimatedGrossSpend": {},
    *       //   "flightEndTime": "my_flightEndTime",
    *       //   "flightStartTime": "my_flightStartTime",
    *       //   "geoTargeting": {},
    *       //   "inventorySizeTargeting": {},
    *       //   "note": "my_note",
    *       //   "preferredDealTerms": {},
    *       //   "programmaticGuaranteedTerms": {},
    *       //   "publisherProfile": "my_publisherProfile"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "billedBuyer": "my_billedBuyer",
    *   //   "buyer": "my_buyer",
    *   //   "buyerContacts": [],
    *   //   "buyerPrivateData": {},
    *   //   "client": "my_client",
    *   //   "dealType": "my_dealType",
    *   //   "displayName": "my_displayName",
    *   //   "isRenegotiating": false,
    *   //   "lastUpdaterOrCommentorRole": "my_lastUpdaterOrCommentorRole",
    *   //   "name": "my_name",
    *   //   "notes": [],
    *   //   "originatorRole": "my_originatorRole",
    *   //   "pausingConsented": false,
    *   //   "proposalRevision": "my_proposalRevision",
    *   //   "publisherProfile": "my_publisherProfile",
    *   //   "sellerContacts": [],
    *   //   "state": "my_state",
    *   //   "termsAndConditions": "my_termsAndConditions",
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
  def sendRfp(params: ParamsResourceBuyersProposalsSendrfp, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def sendRfp(
    params: ParamsResourceBuyersProposalsSendrfp,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
