package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarMembersDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Email or immutable ID of the group
    */
  var groupKey: js.UndefOr[String] = js.native
  /**
    * Whether to list indirect memberships. Default: false.
    */
  var includeDerivedMembership: js.UndefOr[Boolean] = js.native
  /**
    * Maximum number of results to return. Default is 200
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Token to specify next page in the list
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Comma separated role values to filter list results on.
    */
  var roles: js.UndefOr[String] = js.native
}

object ParamsDollarResourceDollarMembersDollarList {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    fields: String = null,
    groupKey: String = null,
    includeDerivedMembership: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    maxResults: Int | Double = null,
    oauth_token: String = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    roles: String = null,
    userIp: String = null
  ): ParamsDollarResourceDollarMembersDollarList = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (groupKey != null) __obj.updateDynamic("groupKey")(groupKey.asInstanceOf[js.Any])
    if (!js.isUndefined(includeDerivedMembership)) __obj.updateDynamic("includeDerivedMembership")(includeDerivedMembership.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (roles != null) __obj.updateDynamic("roles")(roles.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDollarResourceDollarMembersDollarList]
  }
}

