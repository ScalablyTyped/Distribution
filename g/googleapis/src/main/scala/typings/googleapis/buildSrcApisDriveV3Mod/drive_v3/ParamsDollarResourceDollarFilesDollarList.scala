package typings.googleapis.buildSrcApisDriveV3Mod.drive_v3

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarFilesDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Comma-separated list of bodies of items (files/documents) to which the
    * query applies. Supported bodies are 'user', 'domain', 'teamDrive' and
    * 'allTeamDrives'. 'allTeamDrives' must be combined with 'user'; all other
    * values must be used in isolation. Prefer 'user' or 'teamDrive' to
    * 'allTeamDrives' for efficiency.
    */
  var corpora: js.UndefOr[String] = js.native
  /**
    * The source of files to list. Deprecated: use 'corpora' instead.
    */
  var corpus: js.UndefOr[String] = js.native
  /**
    * Whether Team Drive items should be included in results.
    */
  var includeTeamDriveItems: js.UndefOr[Boolean] = js.native
  /**
    * A comma-separated list of sort keys. Valid keys are 'createdTime',
    * 'folder', 'modifiedByMeTime', 'modifiedTime', 'name', 'name_natural',
    * 'quotaBytesUsed', 'recency', 'sharedWithMeTime', 'starred', and
    * 'viewedByMeTime'. Each key sorts ascending by default, but may be
    * reversed with the 'desc' modifier. Example usage:
    * ?orderBy=folder,modifiedTime desc,name. Please note that there is a
    * current limitation for users with approximately one million files in
    * which the requested sort order is ignored.
    */
  var orderBy: js.UndefOr[String] = js.native
  /**
    * The maximum number of files to return per page. Partial or empty result
    * pages are possible even before the end of the files list has been
    * reached.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The token for continuing a previous list request on the next page. This
    * should be set to the value of 'nextPageToken' from the previous response.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * A query for filtering the file results. See the "Search for Files" guide
    * for supported syntax.
    */
  var q: js.UndefOr[String] = js.native
  /**
    * A comma-separated list of spaces to query within the corpus. Supported
    * values are 'drive', 'appDataFolder' and 'photos'.
    */
  var spaces: js.UndefOr[String] = js.native
  /**
    * Whether the requesting application supports Team Drives.
    */
  var supportsTeamDrives: js.UndefOr[Boolean] = js.native
  /**
    * ID of Team Drive to search.
    */
  var teamDriveId: js.UndefOr[String] = js.native
}

object ParamsDollarResourceDollarFilesDollarList {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    corpora: String = null,
    corpus: String = null,
    fields: String = null,
    includeTeamDriveItems: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    oauth_token: String = null,
    orderBy: String = null,
    pageSize: Int | Double = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    q: String = null,
    quotaUser: String = null,
    spaces: String = null,
    supportsTeamDrives: js.UndefOr[Boolean] = js.undefined,
    teamDriveId: String = null,
    userIp: String = null
  ): ParamsDollarResourceDollarFilesDollarList = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (corpora != null) __obj.updateDynamic("corpora")(corpora.asInstanceOf[js.Any])
    if (corpus != null) __obj.updateDynamic("corpus")(corpus.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(includeTeamDriveItems)) __obj.updateDynamic("includeTeamDriveItems")(includeTeamDriveItems.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (q != null) __obj.updateDynamic("q")(q.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (spaces != null) __obj.updateDynamic("spaces")(spaces.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsTeamDrives)) __obj.updateDynamic("supportsTeamDrives")(supportsTeamDrives.asInstanceOf[js.Any])
    if (teamDriveId != null) __obj.updateDynamic("teamDriveId")(teamDriveId.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDollarResourceDollarFilesDollarList]
  }
}

