package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adexchangebuyer2/v2beta1", "adexchangebuyer2_v2beta1.Resource$Accounts$Proposals")
@js.native
class ResourceDollarAccountsDollarProposals protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adexchangebuyer2.accounts.proposals.accept
    * @desc Mark the proposal as accepted at the given revision number. If the
    * number does not match the server's revision number an `ABORTED` error
    * message will be returned. This call updates the proposal_state from
    * `PROPOSED` to `BUYER_ACCEPTED`, or from `SELLER_ACCEPTED` to `FINALIZED`.
    * @alias adexchangebuyer2.accounts.proposals.accept
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID of the buyer.
    * @param {string} params.proposalId The ID of the proposal to accept.
    * @param {().AcceptProposalRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def accept(): GaxiosPromise[Schema$Proposal] = js.native
  def accept(callback: BodyResponseCallback[Schema$Proposal]): Unit = js.native
  def accept(params: ParamsDollarResourceDollarAccountsDollarProposalsDollarAccept): GaxiosPromise[Schema$Proposal] = js.native
  def accept(
    params: ParamsDollarResourceDollarAccountsDollarProposalsDollarAccept,
    callback: BodyResponseCallback[Schema$Proposal]
  ): Unit = js.native
  def accept(
    params: ParamsDollarResourceDollarAccountsDollarProposalsDollarAccept,
    options: BodyResponseCallback[Schema$Proposal],
    callback: BodyResponseCallback[Schema$Proposal]
  ): Unit = js.native
  def accept(params: ParamsDollarResourceDollarAccountsDollarProposalsDollarAccept, options: MethodOptions): GaxiosPromise[Schema$Proposal] = js.native
  def accept(
    params: ParamsDollarResourceDollarAccountsDollarProposalsDollarAccept,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Proposal]
  ): Unit = js.native
  /**
    * adexchangebuyer2.accounts.proposals.addNote
    * @desc Create a new note and attach it to the proposal. The note is
    * assigned a unique ID by the server. The proposal revision number will not
    * increase when associated with a new note.
    * @alias adexchangebuyer2.accounts.proposals.addNote
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID of the buyer.
    * @param {string} params.proposalId The ID of the proposal to attach the note to.
    * @param {().AddNoteRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def addNote(): GaxiosPromise[Schema$Note] = js.native
  def addNote(callback: BodyResponseCallback[Schema$Note]): Unit = js.native
  def addNote(params: ParamsDollarResourceDollarAccountsDollarProposalsDollarAddnote): GaxiosPromise[Schema$Note] = js.native
  def addNote(
    params: ParamsDollarResourceDollarAccountsDollarProposalsDollarAddnote,
    callback: BodyResponseCallback[Schema$Note]
  ): Unit = js.native
  def addNote(
    params: ParamsDollarResourceDollarAccountsDollarProposalsDollarAddnote,
    options: BodyResponseCallback[Schema$Note],
    callback: BodyResponseCallback[Schema$Note]
  ): Unit = js.native
  def addNote(params: ParamsDollarResourceDollarAccountsDollarProposalsDollarAddnote, options: MethodOptions): GaxiosPromise[Schema$Note] = js.native
  def addNote(
    params: ParamsDollarResourceDollarAccountsDollarProposalsDollarAddnote,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Note]
  ): Unit = js.native
  /**
    * adexchangebuyer2.accounts.proposals.cancelNegotiation
    * @desc Cancel an ongoing negotiation on a proposal. This does not cancel
    * or end serving for the deals if the proposal has been finalized, but only
    * cancels a negotiation unilaterally.
    * @alias adexchangebuyer2.accounts.proposals.cancelNegotiation
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID of the buyer.
    * @param {string} params.proposalId The ID of the proposal to cancel negotiation for.
    * @param {().CancelNegotiationRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def cancelNegotiation(): GaxiosPromise[Schema$Proposal] = js.native
  def cancelNegotiation(callback: BodyResponseCallback[Schema$Proposal]): Unit = js.native
  def cancelNegotiation(params: ParamsDollarResourceDollarAccountsDollarProposalsDollarCancelnegotiation): GaxiosPromise[Schema$Proposal] = js.native
  def cancelNegotiation(
    params: ParamsDollarResourceDollarAccountsDollarProposalsDollarCancelnegotiation,
    callback: BodyResponseCallback[Schema$Proposal]
  ): Unit = js.native
  def cancelNegotiation(
    params: ParamsDollarResourceDollarAccountsDollarProposalsDollarCancelnegotiation,
    options: BodyResponseCallback[Schema$Proposal],
    callback: BodyResponseCallback[Schema$Proposal]
  ): Unit = js.native
  def cancelNegotiation(
    params: ParamsDollarResourceDollarAccountsDollarProposalsDollarCancelnegotiation,
    options: MethodOptions
  ): GaxiosPromise[Schema$Proposal] = js.native
  def cancelNegotiation(
    params: ParamsDollarResourceDollarAccountsDollarProposalsDollarCancelnegotiation,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Proposal]
  ): Unit = js.native
  /**
    * adexchangebuyer2.accounts.proposals.completeSetup
    * @desc Update the given proposal to indicate that setup has been
    * completed. This method is called by the buyer when the line items have
    * been created on their end for a finalized proposal and all the required
    * creatives have been uploaded using the creatives API. This call updates
    * the `is_setup_completed` bit on the proposal and also notifies the
    * seller. The server will advance the revision number of the most recent
    * proposal.
    * @alias adexchangebuyer2.accounts.proposals.completeSetup
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID of the buyer.
    * @param {string} params.proposalId The ID of the proposal to mark as setup completed.
    * @param {().CompleteSetupRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def completeSetup(): GaxiosPromise[Schema$Proposal] = js.native
  def completeSetup(callback: BodyResponseCallback[Schema$Proposal]): Unit = js.native
  def completeSetup(params: ParamsDollarResourceDollarAccountsDollarProposalsDollarCompletesetup): GaxiosPromise[Schema$Proposal] = js.native
  def completeSetup(
    params: ParamsDollarResourceDollarAccountsDollarProposalsDollarCompletesetup,
    callback: BodyResponseCallback[Schema$Proposal]
  ): Unit = js.native
  def completeSetup(
    params: ParamsDollarResourceDollarAccountsDollarProposalsDollarCompletesetup,
    options: BodyResponseCallback[Schema$Proposal],
    callback: BodyResponseCallback[Schema$Proposal]
  ): Unit = js.native
  def completeSetup(
    params: ParamsDollarResourceDollarAccountsDollarProposalsDollarCompletesetup,
    options: MethodOptions
  ): GaxiosPromise[Schema$Proposal] = js.native
  def completeSetup(
    params: ParamsDollarResourceDollarAccountsDollarProposalsDollarCompletesetup,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Proposal]
  ): Unit = js.native
  /**
    * adexchangebuyer2.accounts.proposals.create
    * @desc Create the given proposal. Each created proposal and any deals it
    * contains are assigned a unique ID by the server.
    * @alias adexchangebuyer2.accounts.proposals.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID of the buyer.
    * @param {().Proposal} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Proposal] = js.native
  def create(callback: BodyResponseCallback[Schema$Proposal]): Unit = js.native
  def create(params: ParamsDollarResourceDollarAccountsDollarProposalsDollarCreate): GaxiosPromise[Schema$Proposal] = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarProposalsDollarCreate,
    callback: BodyResponseCallback[Schema$Proposal]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarProposalsDollarCreate,
    options: BodyResponseCallback[Schema$Proposal],
    callback: BodyResponseCallback[Schema$Proposal]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarAccountsDollarProposalsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Proposal] = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarProposalsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Proposal]
  ): Unit = js.native
  /**
    * adexchangebuyer2.accounts.proposals.get
    * @desc Gets a proposal given its ID. The proposal is returned at its head
    * revision.
    * @alias adexchangebuyer2.accounts.proposals.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID of the buyer.
    * @param {string} params.proposalId The unique ID of the proposal
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Proposal] = js.native
  def get(callback: BodyResponseCallback[Schema$Proposal]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountsDollarProposalsDollarGet): GaxiosPromise[Schema$Proposal] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarProposalsDollarGet,
    callback: BodyResponseCallback[Schema$Proposal]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarProposalsDollarGet,
    options: BodyResponseCallback[Schema$Proposal],
    callback: BodyResponseCallback[Schema$Proposal]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountsDollarProposalsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Proposal] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarProposalsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Proposal]
  ): Unit = js.native
  /**
    * adexchangebuyer2.accounts.proposals.list
    * @desc List proposals. A filter expression (PQL query) may be specified to
    * filter the results. To retrieve all finalized proposals, regardless if a
    * proposal is being renegotiated, see the FinalizedProposals resource. Note
    * that Bidder/ChildSeat relationships differ from the usual behavior. A
    * Bidder account can only see its child seats' proposals by specifying the
    * ChildSeat's accountId in the request path.
    * @alias adexchangebuyer2.accounts.proposals.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID of the buyer.
    * @param {string=} params.filter An optional PQL filter query used to query for proposals.  Nested repeated fields, such as proposal.deals.targetingCriterion, cannot be filtered.
    * @param {string=} params.filterSyntax Syntax the filter is written in. Current implementation defaults to PQL but in the future it will be LIST_FILTER.
    * @param {integer=} params.pageSize Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default.
    * @param {string=} params.pageToken The page token as returned from ListProposalsResponse.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListProposalsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListProposalsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarProposalsDollarList): GaxiosPromise[Schema$ListProposalsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarProposalsDollarList,
    callback: BodyResponseCallback[Schema$ListProposalsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarProposalsDollarList,
    options: BodyResponseCallback[Schema$ListProposalsResponse],
    callback: BodyResponseCallback[Schema$ListProposalsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarProposalsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListProposalsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarProposalsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListProposalsResponse]
  ): Unit = js.native
  /**
    * adexchangebuyer2.accounts.proposals.pause
    * @desc Update the given proposal to pause serving. This method will set
    * the `DealServingMetadata.DealPauseStatus.has_buyer_paused` bit to true
    * for all deals in the proposal.  It is a no-op to pause an already-paused
    * proposal. It is an error to call PauseProposal for a proposal that is not
    * finalized or renegotiating.
    * @alias adexchangebuyer2.accounts.proposals.pause
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID of the buyer.
    * @param {string} params.proposalId The ID of the proposal to pause.
    * @param {().PauseProposalRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def pause(): GaxiosPromise[Schema$Proposal] = js.native
  def pause(callback: BodyResponseCallback[Schema$Proposal]): Unit = js.native
  def pause(params: ParamsDollarResourceDollarAccountsDollarProposalsDollarPause): GaxiosPromise[Schema$Proposal] = js.native
  def pause(
    params: ParamsDollarResourceDollarAccountsDollarProposalsDollarPause,
    callback: BodyResponseCallback[Schema$Proposal]
  ): Unit = js.native
  def pause(
    params: ParamsDollarResourceDollarAccountsDollarProposalsDollarPause,
    options: BodyResponseCallback[Schema$Proposal],
    callback: BodyResponseCallback[Schema$Proposal]
  ): Unit = js.native
  def pause(params: ParamsDollarResourceDollarAccountsDollarProposalsDollarPause, options: MethodOptions): GaxiosPromise[Schema$Proposal] = js.native
  def pause(
    params: ParamsDollarResourceDollarAccountsDollarProposalsDollarPause,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Proposal]
  ): Unit = js.native
  /**
    * adexchangebuyer2.accounts.proposals.resume
    * @desc Update the given proposal to resume serving. This method will set
    * the `DealServingMetadata.DealPauseStatus.has_buyer_paused` bit to false
    * for all deals in the proposal.  Note that if the `has_seller_paused` bit
    * is also set, serving will not resume until the seller also resumes.  It
    * is a no-op to resume an already-running proposal. It is an error to call
    * ResumeProposal for a proposal that is not finalized or renegotiating.
    * @alias adexchangebuyer2.accounts.proposals.resume
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID of the buyer.
    * @param {string} params.proposalId The ID of the proposal to resume.
    * @param {().ResumeProposalRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resume(): GaxiosPromise[Schema$Proposal] = js.native
  def resume(callback: BodyResponseCallback[Schema$Proposal]): Unit = js.native
  def resume(params: ParamsDollarResourceDollarAccountsDollarProposalsDollarResume): GaxiosPromise[Schema$Proposal] = js.native
  def resume(
    params: ParamsDollarResourceDollarAccountsDollarProposalsDollarResume,
    callback: BodyResponseCallback[Schema$Proposal]
  ): Unit = js.native
  def resume(
    params: ParamsDollarResourceDollarAccountsDollarProposalsDollarResume,
    options: BodyResponseCallback[Schema$Proposal],
    callback: BodyResponseCallback[Schema$Proposal]
  ): Unit = js.native
  def resume(params: ParamsDollarResourceDollarAccountsDollarProposalsDollarResume, options: MethodOptions): GaxiosPromise[Schema$Proposal] = js.native
  def resume(
    params: ParamsDollarResourceDollarAccountsDollarProposalsDollarResume,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Proposal]
  ): Unit = js.native
  /**
    * adexchangebuyer2.accounts.proposals.update
    * @desc Update the given proposal at the client known revision number. If
    * the server revision has advanced since the passed-in
    * `proposal.proposal_revision`, an `ABORTED` error message will be
    * returned. Only the buyer-modifiable fields of the proposal will be
    * updated.  Note that the deals in the proposal will be updated to match
    * the passed-in copy. If a passed-in deal does not have a `deal_id`, the
    * server will assign a new unique ID and create the deal. If passed-in deal
    * has a `deal_id`, it will be updated to match the passed-in copy. Any
    * existing deals not present in the passed-in proposal will be deleted. It
    * is an error to pass in a deal with a `deal_id` not present at head.
    * @alias adexchangebuyer2.accounts.proposals.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID of the buyer.
    * @param {string} params.proposalId The unique ID of the proposal.
    * @param {().Proposal} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Proposal] = js.native
  def update(callback: BodyResponseCallback[Schema$Proposal]): Unit = js.native
  def update(params: ParamsDollarResourceDollarAccountsDollarProposalsDollarUpdate): GaxiosPromise[Schema$Proposal] = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarProposalsDollarUpdate,
    callback: BodyResponseCallback[Schema$Proposal]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarProposalsDollarUpdate,
    options: BodyResponseCallback[Schema$Proposal],
    callback: BodyResponseCallback[Schema$Proposal]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarAccountsDollarProposalsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Proposal] = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarProposalsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Proposal]
  ): Unit = js.native
}

