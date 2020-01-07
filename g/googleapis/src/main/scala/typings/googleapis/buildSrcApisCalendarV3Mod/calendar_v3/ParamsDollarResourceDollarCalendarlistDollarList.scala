package typings.googleapis.buildSrcApisCalendarV3Mod.calendar_v3

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarCalendarlistDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Maximum number of entries returned on one result page. By default the
    * value is 100 entries. The page size can never be larger than 250 entries.
    * Optional.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * The minimum access role for the user in the returned entries. Optional.
    * The default is no restriction.
    */
  var minAccessRole: js.UndefOr[String] = js.native
  /**
    * Token specifying which result page to return. Optional.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Whether to include deleted calendar list entries in the result. Optional.
    * The default is False.
    */
  var showDeleted: js.UndefOr[Boolean] = js.native
  /**
    * Whether to show hidden entries. Optional. The default is False.
    */
  var showHidden: js.UndefOr[Boolean] = js.native
  /**
    * Token obtained from the nextSyncToken field returned on the last page of
    * results from the previous list request. It makes the result of this list
    * request contain only entries that have changed since then. If only
    * read-only fields such as calendar properties or ACLs have changed, the
    * entry won't be returned. All entries deleted and hidden since the
    * previous list request will always be in the result set and it is not
    * allowed to set showDeleted neither showHidden to False. To ensure client
    * state consistency minAccessRole query parameter cannot be specified
    * together with nextSyncToken. If the syncToken expires, the server will
    * respond with a 410 GONE response code and the client should clear its
    * storage and perform a full synchronization without any syncToken. Learn
    * more about incremental synchronization. Optional. The default is to
    * return all entries.
    */
  var syncToken: js.UndefOr[String] = js.native
}

object ParamsDollarResourceDollarCalendarlistDollarList {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    fields: String = null,
    key: String = null,
    maxResults: Int | Double = null,
    minAccessRole: String = null,
    oauth_token: String = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    showDeleted: js.UndefOr[Boolean] = js.undefined,
    showHidden: js.UndefOr[Boolean] = js.undefined,
    syncToken: String = null,
    userIp: String = null
  ): ParamsDollarResourceDollarCalendarlistDollarList = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (minAccessRole != null) __obj.updateDynamic("minAccessRole")(minAccessRole.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (!js.isUndefined(showDeleted)) __obj.updateDynamic("showDeleted")(showDeleted.asInstanceOf[js.Any])
    if (!js.isUndefined(showHidden)) __obj.updateDynamic("showHidden")(showHidden.asInstanceOf[js.Any])
    if (syncToken != null) __obj.updateDynamic("syncToken")(syncToken.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDollarResourceDollarCalendarlistDollarList]
  }
}

