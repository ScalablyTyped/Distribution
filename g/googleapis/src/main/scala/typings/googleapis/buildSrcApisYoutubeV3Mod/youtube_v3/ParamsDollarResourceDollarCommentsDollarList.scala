package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarCommentsDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The id parameter specifies a comma-separated list of comment IDs for the
    * resources that are being retrieved. In a comment resource, the id
    * property specifies the comment's ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The maxResults parameter specifies the maximum number of items that
    * should be returned in the result set.  Note: This parameter is not
    * supported for use in conjunction with the id parameter.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * The pageToken parameter identifies a specific page in the result set that
    * should be returned. In an API response, the nextPageToken property
    * identifies the next page of the result that can be retrieved.  Note: This
    * parameter is not supported for use in conjunction with the id parameter.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The parentId parameter specifies the ID of the comment for which replies
    * should be retrieved.  Note: YouTube currently supports replies only for
    * top-level comments. However, replies to replies may be supported in the
    * future.
    */
  var parentId: js.UndefOr[String] = js.native
  /**
    * The part parameter specifies a comma-separated list of one or more
    * comment resource properties that the API response will include.
    */
  var part: js.UndefOr[String] = js.native
  /**
    * This parameter indicates whether the API should return comments formatted
    * as HTML or as plain text.
    */
  var textFormat: js.UndefOr[String] = js.native
}

object ParamsDollarResourceDollarCommentsDollarList {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    fields: String = null,
    id: String = null,
    key: String = null,
    maxResults: Int | Double = null,
    oauth_token: String = null,
    pageToken: String = null,
    parentId: String = null,
    part: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    textFormat: String = null,
    userIp: String = null
  ): ParamsDollarResourceDollarCommentsDollarList = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (parentId != null) __obj.updateDynamic("parentId")(parentId.asInstanceOf[js.Any])
    if (part != null) __obj.updateDynamic("part")(part.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (textFormat != null) __obj.updateDynamic("textFormat")(textFormat.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDollarResourceDollarCommentsDollarList]
  }
}

