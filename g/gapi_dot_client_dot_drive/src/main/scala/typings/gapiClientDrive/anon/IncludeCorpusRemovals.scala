package typings.gapiClientDrive.anon

import typings.gapiClientDrive.gapi.client.drive.Channel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncludeCorpusRemovals extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /**
    * The shared drive from which changes are returned. If specified the change IDs will be reflective of the shared drive; use the combined drive ID and
    * change ID as an identifier.
    */
  var driveId: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /**
    * Whether changes should include the file resource if the file is still accessible by the user at the time of the request, even when a file was removed
    * from the list of changes and there will be no further change entries for this file.
    */
  var includeCorpusRemovals: js.UndefOr[Boolean] = js.undefined
  /** Whether both My Drive and shared drive items should be included in results. */
  var includeItemsFromAllDrives: js.UndefOr[Boolean] = js.undefined
  /** Whether to include changes indicating that items have been removed from the list of changes, for example by deletion or loss of access. */
  var includeRemoved: js.UndefOr[Boolean] = js.undefined
  /** Deprecated use includeItemsFromAllDrives instead. */
  var includeTeamDriveItems: js.UndefOr[Boolean] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** The maximum number of changes to return per page. */
  var pageSize: js.UndefOr[Double] = js.undefined
  /**
    * The token for continuing a previous list request on the next page. This should be set to the value of 'nextPageToken' from the previous response or to
    * the response from the getStartPageToken method.
    */
  var pageToken: String
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /** An opaque string that represents a user for quota purposes. Must not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** Request body */
  var resource: Channel
  /**
    * Whether to restrict the results to changes inside the My Drive hierarchy. This omits changes to files such as those in the Application Data folder or
    * shared files which have not been added to My Drive.
    */
  var restrictToMyDrive: js.UndefOr[Boolean] = js.undefined
  /** A comma-separated list of spaces to query within the user corpus. Supported values are 'drive', 'appDataFolder' and 'photos'. */
  var spaces: js.UndefOr[String] = js.undefined
  /** Whether the requesting application supports both My Drives and shared drives. */
  var supportsAllDrives: js.UndefOr[Boolean] = js.undefined
  /** Deprecated use supportsAllDrives instead. */
  var supportsTeamDrives: js.UndefOr[Boolean] = js.undefined
  /** Deprecated use driveId instead. */
  var teamDriveId: js.UndefOr[String] = js.undefined
  /** Deprecated. Please use quotaUser instead. */
  var userIp: js.UndefOr[String] = js.undefined
}

object IncludeCorpusRemovals {
  @scala.inline
  def apply(
    pageToken: String,
    resource: Channel,
    alt: String = null,
    driveId: String = null,
    fields: String = null,
    includeCorpusRemovals: js.UndefOr[Boolean] = js.undefined,
    includeItemsFromAllDrives: js.UndefOr[Boolean] = js.undefined,
    includeRemoved: js.UndefOr[Boolean] = js.undefined,
    includeTeamDriveItems: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    oauth_token: String = null,
    pageSize: js.UndefOr[Double] = js.undefined,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    restrictToMyDrive: js.UndefOr[Boolean] = js.undefined,
    spaces: String = null,
    supportsAllDrives: js.UndefOr[Boolean] = js.undefined,
    supportsTeamDrives: js.UndefOr[Boolean] = js.undefined,
    teamDriveId: String = null,
    userIp: String = null
  ): IncludeCorpusRemovals = {
    val __obj = js.Dynamic.literal(pageToken = pageToken.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (driveId != null) __obj.updateDynamic("driveId")(driveId.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(includeCorpusRemovals)) __obj.updateDynamic("includeCorpusRemovals")(includeCorpusRemovals.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeItemsFromAllDrives)) __obj.updateDynamic("includeItemsFromAllDrives")(includeItemsFromAllDrives.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeRemoved)) __obj.updateDynamic("includeRemoved")(includeRemoved.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeTeamDriveItems)) __obj.updateDynamic("includeTeamDriveItems")(includeTeamDriveItems.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (!js.isUndefined(restrictToMyDrive)) __obj.updateDynamic("restrictToMyDrive")(restrictToMyDrive.get.asInstanceOf[js.Any])
    if (spaces != null) __obj.updateDynamic("spaces")(spaces.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsAllDrives)) __obj.updateDynamic("supportsAllDrives")(supportsAllDrives.get.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsTeamDrives)) __obj.updateDynamic("supportsTeamDrives")(supportsTeamDrives.get.asInstanceOf[js.Any])
    if (teamDriveId != null) __obj.updateDynamic("teamDriveId")(teamDriveId.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeCorpusRemovals]
  }
}

