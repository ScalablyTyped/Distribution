package typings.gapiClientBlogger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFetchUserInfo extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** Whether the response is a list of blogs with per-user information instead of just blogs. */
  var fetchUserInfo: js.UndefOr[Boolean] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /**
    * User access types for blogs to include in the results, e.g. AUTHOR will return blogs where the user has author level access. If no roles are specified,
    * defaults to ADMIN and AUTHOR roles.
    */
  var role: js.UndefOr[String] = js.undefined
  /** Blog statuses to include in the result (default: Live blogs only). Note that ADMIN access is required to view deleted blogs. */
  var status: js.UndefOr[String] = js.undefined
  /** ID of the user whose blogs are to be fetched. Either the word 'self' (sans quote marks) or the user's profile identifier. */
  var userId: String
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
  /** Access level with which to view the blogs. Note that some fields require elevated access. */
  var view: js.UndefOr[String] = js.undefined
}

object AnonFetchUserInfo {
  @scala.inline
  def apply(
    userId: String,
    alt: String = null,
    fetchUserInfo: js.UndefOr[Boolean] = js.undefined,
    fields: String = null,
    key: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    role: String = null,
    status: String = null,
    userIp: String = null,
    view: String = null
  ): AnonFetchUserInfo = {
    val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (!js.isUndefined(fetchUserInfo)) __obj.updateDynamic("fetchUserInfo")(fetchUserInfo.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFetchUserInfo]
  }
}

