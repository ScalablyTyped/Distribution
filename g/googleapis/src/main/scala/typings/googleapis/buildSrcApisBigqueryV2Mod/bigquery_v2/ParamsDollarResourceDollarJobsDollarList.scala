package typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarJobsDollarList extends StandardParameters {
  /**
    * Whether to display jobs owned by all users in the project. Default false
    */
  var allUsers: js.UndefOr[Boolean] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Max value for job creation time, in milliseconds since the POSIX epoch.
    * If set, only jobs created before or at this timestamp are returned
    */
  var maxCreationTime: js.UndefOr[String] = js.native
  /**
    * Maximum number of results to return
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Min value for job creation time, in milliseconds since the POSIX epoch.
    * If set, only jobs created after or at this timestamp are returned
    */
  var minCreationTime: js.UndefOr[String] = js.native
  /**
    * Page token, returned by a previous call, to request the next page of
    * results
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Project ID of the jobs to list
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Restrict information returned to a set of selected fields
    */
  var projection: js.UndefOr[String] = js.native
  /**
    * Filter for job state
    */
  var stateFilter: js.UndefOr[js.Array[String]] = js.native
}

object ParamsDollarResourceDollarJobsDollarList {
  @scala.inline
  def apply(
    allUsers: js.UndefOr[Boolean] = js.undefined,
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    fields: String = null,
    key: String = null,
    maxCreationTime: String = null,
    maxResults: Int | Double = null,
    minCreationTime: String = null,
    oauth_token: String = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    projectId: String = null,
    projection: String = null,
    quotaUser: String = null,
    stateFilter: js.Array[String] = null,
    userIp: String = null
  ): ParamsDollarResourceDollarJobsDollarList = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allUsers)) __obj.updateDynamic("allUsers")(allUsers.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxCreationTime != null) __obj.updateDynamic("maxCreationTime")(maxCreationTime.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (minCreationTime != null) __obj.updateDynamic("minCreationTime")(minCreationTime.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (stateFilter != null) __obj.updateDynamic("stateFilter")(stateFilter.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDollarResourceDollarJobsDollarList]
  }
}

