package typings.googleapis.buildSrcApisBloggerV3Mod.blogger_v3

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarBlogsDollarListbyuser extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Whether the response is a list of blogs with per-user information instead
    * of just blogs.
    */
  var fetchUserInfo: js.UndefOr[Boolean] = js.native
  /**
    * User access types for blogs to include in the results, e.g. AUTHOR will
    * return blogs where the user has author level access. If no roles are
    * specified, defaults to ADMIN and AUTHOR roles.
    */
  var role: js.UndefOr[js.Array[String]] = js.native
  /**
    * Blog statuses to include in the result (default: Live blogs only). Note
    * that ADMIN access is required to view deleted blogs.
    */
  var status: js.UndefOr[js.Array[String]] = js.native
  /**
    * ID of the user whose blogs are to be fetched. Either the word 'self'
    * (sans quote marks) or the user's profile identifier.
    */
  var userId: js.UndefOr[String] = js.native
  /**
    * Access level with which to view the blogs. Note that some fields require
    * elevated access.
    */
  var view: js.UndefOr[String] = js.native
}

object ParamsDollarResourceDollarBlogsDollarListbyuser {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    fetchUserInfo: js.UndefOr[Boolean] = js.undefined,
    fields: String = null,
    key: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    role: js.Array[String] = null,
    status: js.Array[String] = null,
    userId: String = null,
    userIp: String = null,
    view: String = null
  ): ParamsDollarResourceDollarBlogsDollarListbyuser = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (!js.isUndefined(fetchUserInfo)) __obj.updateDynamic("fetchUserInfo")(fetchUserInfo.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDollarResourceDollarBlogsDollarListbyuser]
  }
}

