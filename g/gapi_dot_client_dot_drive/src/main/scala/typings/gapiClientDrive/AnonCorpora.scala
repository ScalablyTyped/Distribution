package typings.gapiClientDrive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCorpora extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /**
    * Comma-separated list of bodies of items (files/documents) to which the query applies. Supported bodies are 'user', 'domain', 'teamDrive' and
    * 'allTeamDrives'. 'allTeamDrives' must be combined with 'user'; all other values must be used in isolation. Prefer 'user' or 'teamDrive' to
    * 'allTeamDrives' for efficiency.
    */
  var corpora: js.UndefOr[String] = js.undefined
  /** The source of files to list. Deprecated: use 'corpora' instead. */
  var corpus: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** Whether Team Drive items should be included in results. */
  var includeTeamDriveItems: js.UndefOr[Boolean] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /**
    * A comma-separated list of sort keys. Valid keys are 'createdTime', 'folder', 'modifiedByMeTime', 'modifiedTime', 'name', 'name_natural',
    * 'quotaBytesUsed', 'recency', 'sharedWithMeTime', 'starred', and 'viewedByMeTime'. Each key sorts ascending by default, but may be reversed with the
    * 'desc' modifier. Example usage: ?orderBy=folder,modifiedTime desc,name. Please note that there is a current limitation for users with approximately one
    * million files in which the requested sort order is ignored.
    */
  var orderBy: js.UndefOr[String] = js.undefined
  /** The maximum number of files to return per page. Partial or empty result pages are possible even before the end of the files list has been reached. */
  var pageSize: js.UndefOr[Double] = js.undefined
  /** The token for continuing a previous list request on the next page. This should be set to the value of 'nextPageToken' from the previous response. */
  var pageToken: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /** A query for filtering the file results. See the "Search for Files" guide for supported syntax. */
  var q: js.UndefOr[String] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** A comma-separated list of spaces to query within the corpus. Supported values are 'drive', 'appDataFolder' and 'photos'. */
  var spaces: js.UndefOr[String] = js.undefined
  /** Whether the requesting application supports Team Drives. */
  var supportsTeamDrives: js.UndefOr[Boolean] = js.undefined
  /** ID of Team Drive to search. */
  var teamDriveId: js.UndefOr[String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
}

object AnonCorpora {
  @scala.inline
  def apply(
    alt: String = null,
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
  ): AnonCorpora = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[AnonCorpora]
  }
}

