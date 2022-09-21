package typings.googleapis.civicinfoV2Mod.civicinfoV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/civicinfo/v2", "civicinfo_v2.Resource$Elections")
@js.native
open class ResourceElections protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def electionQuery(): GaxiosPromise[SchemaElectionsQueryResponse] = js.native
  def electionQuery(callback: BodyResponseCallback[SchemaElectionsQueryResponse]): Unit = js.native
  def electionQuery(params: Unit, options: MethodOptions): GaxiosPromise[SchemaElectionsQueryResponse] = js.native
  def electionQuery(params: ParamsResourceElectionsElectionquery): GaxiosPromise[SchemaElectionsQueryResponse] = js.native
  def electionQuery(
    params: ParamsResourceElectionsElectionquery,
    callback: BodyResponseCallback[SchemaElectionsQueryResponse]
  ): Unit = js.native
  def electionQuery(
    params: ParamsResourceElectionsElectionquery,
    options: BodyResponseCallback[Readable | SchemaElectionsQueryResponse],
    callback: BodyResponseCallback[Readable | SchemaElectionsQueryResponse]
  ): Unit = js.native
  def electionQuery(params: ParamsResourceElectionsElectionquery, options: MethodOptions): GaxiosPromise[SchemaElectionsQueryResponse] = js.native
  def electionQuery(
    params: ParamsResourceElectionsElectionquery,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaElectionsQueryResponse]
  ): Unit = js.native
  /**
    * List of available elections to query.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/civicinfo.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const civicinfo = google.civicinfo('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await civicinfo.elections.electionQuery({});
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "elections": [],
    *   //   "kind": "my_kind"
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
  def electionQuery(params: ParamsResourceElectionsElectionquery, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def electionQuery(
    params: ParamsResourceElectionsElectionquery,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def voterInfoQuery(): GaxiosPromise[SchemaVoterInfoResponse] = js.native
  def voterInfoQuery(callback: BodyResponseCallback[SchemaVoterInfoResponse]): Unit = js.native
  def voterInfoQuery(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVoterInfoResponse] = js.native
  def voterInfoQuery(params: ParamsResourceElectionsVoterinfoquery): GaxiosPromise[SchemaVoterInfoResponse] = js.native
  def voterInfoQuery(
    params: ParamsResourceElectionsVoterinfoquery,
    callback: BodyResponseCallback[SchemaVoterInfoResponse]
  ): Unit = js.native
  def voterInfoQuery(
    params: ParamsResourceElectionsVoterinfoquery,
    options: BodyResponseCallback[Readable | SchemaVoterInfoResponse],
    callback: BodyResponseCallback[Readable | SchemaVoterInfoResponse]
  ): Unit = js.native
  def voterInfoQuery(params: ParamsResourceElectionsVoterinfoquery, options: MethodOptions): GaxiosPromise[SchemaVoterInfoResponse] = js.native
  def voterInfoQuery(
    params: ParamsResourceElectionsVoterinfoquery,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVoterInfoResponse]
  ): Unit = js.native
  /**
    * Looks up information relevant to a voter based on the voter's registered address.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/civicinfo.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const civicinfo = google.civicinfo('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await civicinfo.elections.voterInfoQuery({
    *     // The registered address of the voter to look up.
    *     address: 'placeholder-value',
    *     // The unique ID of the election to look up. A list of election IDs can be obtained at https://www.googleapis.com/civicinfo/{version\}/elections. If no election ID is specified in the query and there is more than one election with data for the given voter, the additional elections are provided in the otherElections response field.
    *     electionId: 'placeholder-value',
    *     // If set to true, only data from official state sources will be returned.
    *     officialOnly: 'placeholder-value',
    *     // If set to true, the query will return the success code and include any partial information when it is unable to determine a matching address or unable to determine the election for electionId=0 queries.
    *     returnAllAvailableData: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "contests": [],
    *   //   "dropOffLocations": [],
    *   //   "earlyVoteSites": [],
    *   //   "election": {},
    *   //   "kind": "my_kind",
    *   //   "mailOnly": false,
    *   //   "normalizedInput": {},
    *   //   "otherElections": [],
    *   //   "pollingLocations": [],
    *   //   "precinctId": "my_precinctId",
    *   //   "precincts": [],
    *   //   "state": []
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
  def voterInfoQuery(params: ParamsResourceElectionsVoterinfoquery, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def voterInfoQuery(
    params: ParamsResourceElectionsVoterinfoquery,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
