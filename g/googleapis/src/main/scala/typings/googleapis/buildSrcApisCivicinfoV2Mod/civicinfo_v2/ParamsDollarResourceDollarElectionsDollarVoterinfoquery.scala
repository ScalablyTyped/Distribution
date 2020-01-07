package typings.googleapis.buildSrcApisCivicinfoV2Mod.civicinfo_v2

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarElectionsDollarVoterinfoquery extends StandardParameters {
  /**
    * The registered address of the voter to look up.
    */
  var address: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The unique ID of the election to look up. A list of election IDs can be
    * obtained at https://www.googleapis.com/civicinfo/{version}/electionsIf no
    * election ID is specified in the query and there is more than one election
    * with data for the given voter, the additional elections are provided in
    * the otherElections response field.
    */
  var electionId: js.UndefOr[String] = js.native
  /**
    * If set to true, only data from official state sources will be returned.
    */
  var officialOnly: js.UndefOr[Boolean] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$VoterInfoRequest] = js.native
  /**
    * If set to true, the query will return the success codeand include any
    * partial information when it is unable to determine a matching address or
    * unable to determine the election for electionId=0 queries.
    */
  var returnAllAvailableData: js.UndefOr[Boolean] = js.native
}

object ParamsDollarResourceDollarElectionsDollarVoterinfoquery {
  @scala.inline
  def apply(
    address: String = null,
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    electionId: String = null,
    fields: String = null,
    key: String = null,
    oauth_token: String = null,
    officialOnly: js.UndefOr[Boolean] = js.undefined,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    requestBody: Schema$VoterInfoRequest = null,
    returnAllAvailableData: js.UndefOr[Boolean] = js.undefined,
    userIp: String = null
  ): ParamsDollarResourceDollarElectionsDollarVoterinfoquery = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (electionId != null) __obj.updateDynamic("electionId")(electionId.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(officialOnly)) __obj.updateDynamic("officialOnly")(officialOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (requestBody != null) __obj.updateDynamic("requestBody")(requestBody.asInstanceOf[js.Any])
    if (!js.isUndefined(returnAllAvailableData)) __obj.updateDynamic("returnAllAvailableData")(returnAllAvailableData.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDollarResourceDollarElectionsDollarVoterinfoquery]
  }
}

