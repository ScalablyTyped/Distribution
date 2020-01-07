package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot4Mod.adexchangebuyer_v1_4

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adexchangebuyer/v1.4", "adexchangebuyer_v1_4.Resource$Proposals")
@js.native
class Resource$Proposals protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adexchangebuyer.proposals.get
    * @desc Get a proposal given its id
    * @alias adexchangebuyer.proposals.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.proposalId Id of the proposal to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Proposal] = js.native
  def get(callback: BodyResponseCallback[Schema$Proposal]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProposalsDollarGet): GaxiosPromise[Schema$Proposal] = js.native
  def get(
    params: ParamsDollarResourceDollarProposalsDollarGet,
    callback: BodyResponseCallback[Schema$Proposal]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProposalsDollarGet,
    options: BodyResponseCallback[Schema$Proposal],
    callback: BodyResponseCallback[Schema$Proposal]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarProposalsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Proposal] = js.native
  def get(
    params: ParamsDollarResourceDollarProposalsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Proposal]
  ): Unit = js.native
  /**
    * adexchangebuyer.proposals.insert
    * @desc Create the given list of proposals
    * @alias adexchangebuyer.proposals.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().CreateOrdersRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$CreateOrdersResponse] = js.native
  def insert(callback: BodyResponseCallback[Schema$CreateOrdersResponse]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarProposalsDollarInsert): GaxiosPromise[Schema$CreateOrdersResponse] = js.native
  def insert(
    params: ParamsDollarResourceDollarProposalsDollarInsert,
    callback: BodyResponseCallback[Schema$CreateOrdersResponse]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarProposalsDollarInsert,
    options: BodyResponseCallback[Schema$CreateOrdersResponse],
    callback: BodyResponseCallback[Schema$CreateOrdersResponse]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarProposalsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$CreateOrdersResponse] = js.native
  def insert(
    params: ParamsDollarResourceDollarProposalsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CreateOrdersResponse]
  ): Unit = js.native
  /**
    * adexchangebuyer.proposals.patch
    * @desc Update the given proposal. This method supports patch semantics.
    * @alias adexchangebuyer.proposals.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.proposalId The proposal id to update.
    * @param {string} params.revisionNumber The last known revision number to update. If the head revision in the marketplace database has since changed, an error will be thrown. The caller should then fetch the latest proposal at head revision and retry the update at that revision.
    * @param {string} params.updateAction The proposed action to take on the proposal. This field is required and it must be set when updating a proposal.
    * @param {().Proposal} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Proposal] = js.native
  def patch(callback: BodyResponseCallback[Schema$Proposal]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProposalsDollarPatch): GaxiosPromise[Schema$Proposal] = js.native
  def patch(
    params: ParamsDollarResourceDollarProposalsDollarPatch,
    callback: BodyResponseCallback[Schema$Proposal]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProposalsDollarPatch,
    options: BodyResponseCallback[Schema$Proposal],
    callback: BodyResponseCallback[Schema$Proposal]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProposalsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Proposal] = js.native
  def patch(
    params: ParamsDollarResourceDollarProposalsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Proposal]
  ): Unit = js.native
  /**
    * adexchangebuyer.proposals.search
    * @desc Search for proposals using pql query
    * @alias adexchangebuyer.proposals.search
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.pqlQuery Query string to retrieve specific proposals.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def search(): GaxiosPromise[Schema$GetOrdersResponse] = js.native
  def search(callback: BodyResponseCallback[Schema$GetOrdersResponse]): Unit = js.native
  def search(params: ParamsDollarResourceDollarProposalsDollarSearch): GaxiosPromise[Schema$GetOrdersResponse] = js.native
  def search(
    params: ParamsDollarResourceDollarProposalsDollarSearch,
    callback: BodyResponseCallback[Schema$GetOrdersResponse]
  ): Unit = js.native
  def search(
    params: ParamsDollarResourceDollarProposalsDollarSearch,
    options: BodyResponseCallback[Schema$GetOrdersResponse],
    callback: BodyResponseCallback[Schema$GetOrdersResponse]
  ): Unit = js.native
  def search(params: ParamsDollarResourceDollarProposalsDollarSearch, options: MethodOptions): GaxiosPromise[Schema$GetOrdersResponse] = js.native
  def search(
    params: ParamsDollarResourceDollarProposalsDollarSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GetOrdersResponse]
  ): Unit = js.native
  /**
    * adexchangebuyer.proposals.setupcomplete
    * @desc Update the given proposal to indicate that setup has been
    * completed.
    * @alias adexchangebuyer.proposals.setupcomplete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.proposalId The proposal id for which the setup is complete
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setupcomplete(): GaxiosPromise[Unit] = js.native
  def setupcomplete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def setupcomplete(params: ParamsDollarResourceDollarProposalsDollarSetupcomplete): GaxiosPromise[Unit] = js.native
  def setupcomplete(
    params: ParamsDollarResourceDollarProposalsDollarSetupcomplete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def setupcomplete(
    params: ParamsDollarResourceDollarProposalsDollarSetupcomplete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def setupcomplete(params: ParamsDollarResourceDollarProposalsDollarSetupcomplete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def setupcomplete(
    params: ParamsDollarResourceDollarProposalsDollarSetupcomplete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * adexchangebuyer.proposals.update
    * @desc Update the given proposal
    * @alias adexchangebuyer.proposals.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.proposalId The proposal id to update.
    * @param {string} params.revisionNumber The last known revision number to update. If the head revision in the marketplace database has since changed, an error will be thrown. The caller should then fetch the latest proposal at head revision and retry the update at that revision.
    * @param {string} params.updateAction The proposed action to take on the proposal. This field is required and it must be set when updating a proposal.
    * @param {().Proposal} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Proposal] = js.native
  def update(callback: BodyResponseCallback[Schema$Proposal]): Unit = js.native
  def update(params: ParamsDollarResourceDollarProposalsDollarUpdate): GaxiosPromise[Schema$Proposal] = js.native
  def update(
    params: ParamsDollarResourceDollarProposalsDollarUpdate,
    callback: BodyResponseCallback[Schema$Proposal]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarProposalsDollarUpdate,
    options: BodyResponseCallback[Schema$Proposal],
    callback: BodyResponseCallback[Schema$Proposal]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarProposalsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Proposal] = js.native
  def update(
    params: ParamsDollarResourceDollarProposalsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Proposal]
  ): Unit = js.native
}

