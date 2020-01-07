package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarCommentsDollarSetmoderationstatus extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The banAuthor parameter lets you indicate that you want to automatically
    * reject any additional comments written by the comment's author. Set the
    * parameter value to true to ban the author.  Note: This parameter is only
    * valid if the moderationStatus parameter is also set to rejected.
    */
  var banAuthor: js.UndefOr[Boolean] = js.native
  /**
    * The id parameter specifies a comma-separated list of IDs that identify
    * the comments for which you are updating the moderation status.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies the new moderation status of the specified comments.
    */
  var moderationStatus: js.UndefOr[String] = js.native
}

object ParamsDollarResourceDollarCommentsDollarSetmoderationstatus {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    banAuthor: js.UndefOr[Boolean] = js.undefined,
    fields: String = null,
    id: String = null,
    key: String = null,
    moderationStatus: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    userIp: String = null
  ): ParamsDollarResourceDollarCommentsDollarSetmoderationstatus = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (!js.isUndefined(banAuthor)) __obj.updateDynamic("banAuthor")(banAuthor.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (moderationStatus != null) __obj.updateDynamic("moderationStatus")(moderationStatus.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDollarResourceDollarCommentsDollarSetmoderationstatus]
  }
}

