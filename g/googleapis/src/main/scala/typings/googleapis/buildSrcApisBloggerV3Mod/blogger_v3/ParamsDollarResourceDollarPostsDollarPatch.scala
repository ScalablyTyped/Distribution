package typings.googleapis.buildSrcApisBloggerV3Mod.blogger_v3

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarPostsDollarPatch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The ID of the Blog.
    */
  var blogId: js.UndefOr[String] = js.native
  /**
    * Whether the body content of the post is included with the result
    * (default: true).
    */
  var fetchBody: js.UndefOr[Boolean] = js.native
  /**
    * Whether image URL metadata for each post is included in the returned
    * result (default: false).
    */
  var fetchImages: js.UndefOr[Boolean] = js.native
  /**
    * Maximum number of comments to retrieve with the returned post.
    */
  var maxComments: js.UndefOr[Double] = js.native
  /**
    * The ID of the Post.
    */
  var postId: js.UndefOr[String] = js.native
  /**
    * Whether a publish action should be performed when the post is updated
    * (default: false).
    */
  var publish: js.UndefOr[Boolean] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$Post] = js.native
  /**
    * Whether a revert action should be performed when the post is updated
    * (default: false).
    */
  var revert: js.UndefOr[Boolean] = js.native
}

object ParamsDollarResourceDollarPostsDollarPatch {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    blogId: String = null,
    fetchBody: js.UndefOr[Boolean] = js.undefined,
    fetchImages: js.UndefOr[Boolean] = js.undefined,
    fields: String = null,
    key: String = null,
    maxComments: Int | Double = null,
    oauth_token: String = null,
    postId: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    publish: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    requestBody: Schema$Post = null,
    revert: js.UndefOr[Boolean] = js.undefined,
    userIp: String = null
  ): ParamsDollarResourceDollarPostsDollarPatch = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (blogId != null) __obj.updateDynamic("blogId")(blogId.asInstanceOf[js.Any])
    if (!js.isUndefined(fetchBody)) __obj.updateDynamic("fetchBody")(fetchBody.asInstanceOf[js.Any])
    if (!js.isUndefined(fetchImages)) __obj.updateDynamic("fetchImages")(fetchImages.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxComments != null) __obj.updateDynamic("maxComments")(maxComments.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (postId != null) __obj.updateDynamic("postId")(postId.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (!js.isUndefined(publish)) __obj.updateDynamic("publish")(publish.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (requestBody != null) __obj.updateDynamic("requestBody")(requestBody.asInstanceOf[js.Any])
    if (!js.isUndefined(revert)) __obj.updateDynamic("revert")(revert.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDollarResourceDollarPostsDollarPatch]
  }
}

