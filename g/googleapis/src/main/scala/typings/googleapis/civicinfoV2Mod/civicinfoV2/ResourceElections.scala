package typings.googleapis.civicinfoV2Mod.civicinfoV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/civicinfo/v2", "civicinfo_v2.Resource$Elections")
@js.native
class ResourceElections protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * civicinfo.elections.electionQuery
    * @desc List of available elections to query.
    * @alias civicinfo.elections.electionQuery
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().ElectionsQueryRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def electionQuery(): GaxiosPromise[SchemaElectionsQueryResponse] = js.native
  def electionQuery(callback: BodyResponseCallback[SchemaElectionsQueryResponse]): Unit = js.native
  def electionQuery(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaElectionsQueryResponse] = js.native
  def electionQuery(params: ParamsResourceElectionsElectionquery): GaxiosPromise[SchemaElectionsQueryResponse] = js.native
  def electionQuery(
    params: ParamsResourceElectionsElectionquery,
    callback: BodyResponseCallback[SchemaElectionsQueryResponse]
  ): Unit = js.native
  def electionQuery(
    params: ParamsResourceElectionsElectionquery,
    options: BodyResponseCallback[SchemaElectionsQueryResponse],
    callback: BodyResponseCallback[SchemaElectionsQueryResponse]
  ): Unit = js.native
  def electionQuery(params: ParamsResourceElectionsElectionquery, options: MethodOptions): GaxiosPromise[SchemaElectionsQueryResponse] = js.native
  def electionQuery(
    params: ParamsResourceElectionsElectionquery,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaElectionsQueryResponse]
  ): Unit = js.native
  /**
    * civicinfo.elections.voterInfoQuery
    * @desc Looks up information relevant to a voter based on the voter's
    * registered address.
    * @alias civicinfo.elections.voterInfoQuery
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.address The registered address of the voter to look up.
    * @param {string=} params.electionId The unique ID of the election to look up. A list of election IDs can be obtained at https://www.googleapis.com/civicinfo/{version}/electionsIf no election ID is specified in the query and there is more than one election with data for the given voter, the additional elections are provided in the otherElections response field.
    * @param {boolean=} params.officialOnly If set to true, only data from official state sources will be returned.
    * @param {boolean=} params.returnAllAvailableData If set to true, the query will return the success codeand include any partial information when it is unable to determine a matching address or unable to determine the election for electionId=0 queries.
    * @param {().VoterInfoRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def voterInfoQuery(): GaxiosPromise[SchemaVoterInfoResponse] = js.native
  def voterInfoQuery(callback: BodyResponseCallback[SchemaVoterInfoResponse]): Unit = js.native
  def voterInfoQuery(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaVoterInfoResponse] = js.native
  def voterInfoQuery(params: ParamsResourceElectionsVoterinfoquery): GaxiosPromise[SchemaVoterInfoResponse] = js.native
  def voterInfoQuery(
    params: ParamsResourceElectionsVoterinfoquery,
    callback: BodyResponseCallback[SchemaVoterInfoResponse]
  ): Unit = js.native
  def voterInfoQuery(
    params: ParamsResourceElectionsVoterinfoquery,
    options: BodyResponseCallback[SchemaVoterInfoResponse],
    callback: BodyResponseCallback[SchemaVoterInfoResponse]
  ): Unit = js.native
  def voterInfoQuery(params: ParamsResourceElectionsVoterinfoquery, options: MethodOptions): GaxiosPromise[SchemaVoterInfoResponse] = js.native
  def voterInfoQuery(
    params: ParamsResourceElectionsVoterinfoquery,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVoterInfoResponse]
  ): Unit = js.native
}

