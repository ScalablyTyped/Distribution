package typings.googleapis.buildSrcApisDriveV2Mod.drive_v2

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarChildrenDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The ID of the folder.
    */
  var folderId: js.UndefOr[String] = js.native
  /**
    * Maximum number of children to return.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * A comma-separated list of sort keys. Valid keys are 'createdDate',
    * 'folder', 'lastViewedByMeDate', 'modifiedByMeDate', 'modifiedDate',
    * 'quotaBytesUsed', 'recency', 'sharedWithMeDate', 'starred', and 'title'.
    * Each key sorts ascending by default, but may be reversed with the 'desc'
    * modifier. Example usage: ?orderBy=folder,modifiedDate desc,title. Please
    * note that there is a current limitation for users with approximately one
    * million files in which the requested sort order is ignored.
    */
  var orderBy: js.UndefOr[String] = js.native
  /**
    * Page token for children.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Query string for searching children.
    */
  var q: js.UndefOr[String] = js.native
}

object ParamsDollarResourceDollarChildrenDollarList {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    fields: String = null,
    folderId: String = null,
    key: String = null,
    maxResults: Int | Double = null,
    oauth_token: String = null,
    orderBy: String = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    q: String = null,
    quotaUser: String = null,
    userIp: String = null
  ): ParamsDollarResourceDollarChildrenDollarList = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (folderId != null) __obj.updateDynamic("folderId")(folderId.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (q != null) __obj.updateDynamic("q")(q.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDollarResourceDollarChildrenDollarList]
  }
}

