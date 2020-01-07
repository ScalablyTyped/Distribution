package typings.googleapis.buildSrcApisFitnessV1Mod.fitness_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarUsersDollarSessionsDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * An RFC3339 timestamp. Only sessions ending between the start and end
    * times will be included in the response.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * If true, deleted sessions will be returned. When set to true, sessions
    * returned in this response will only have an ID and will not have any
    * other fields.
    */
  var includeDeleted: js.UndefOr[Boolean] = js.native
  /**
    * The continuation token, which is used for incremental syncing. To get the
    * next batch of changes, set this parameter to the value of nextPageToken
    * from the previous response. This token is treated as a timestamp (in
    * millis since epoch). If specified, the API returns sessions modified
    * since this time. The page token is ignored if either start or end time is
    * specified. If none of start time, end time, and the page token is
    * specified, sessions modified in the last 30 days are returned.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * An RFC3339 timestamp. Only sessions ending between the start and end
    * times will be included in the response.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * List sessions for the person identified. Use me to indicate the
    * authenticated user. Only me is supported at this time.
    */
  var userId: js.UndefOr[String] = js.native
}

object ParamsDollarResourceDollarUsersDollarSessionsDollarList {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    endTime: String = null,
    fields: String = null,
    includeDeleted: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    oauth_token: String = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    startTime: String = null,
    userId: String = null,
    userIp: String = null
  ): ParamsDollarResourceDollarUsersDollarSessionsDollarList = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(includeDeleted)) __obj.updateDynamic("includeDeleted")(includeDeleted.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDollarResourceDollarUsersDollarSessionsDollarList]
  }
}

