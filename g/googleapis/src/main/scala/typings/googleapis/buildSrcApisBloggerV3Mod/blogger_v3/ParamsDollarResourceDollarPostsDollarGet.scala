package typings.googleapis.buildSrcApisBloggerV3Mod.blogger_v3

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarPostsDollarGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * ID of the blog to fetch the post from.
    */
  var blogId: js.UndefOr[String] = js.native
  /**
    * Whether the body content of the post is included (default: true). This
    * should be set to false when the post bodies are not required, to help
    * minimize traffic.
    */
  var fetchBody: js.UndefOr[Boolean] = js.native
  /**
    * Whether image URL metadata for each post is included (default: false).
    */
  var fetchImages: js.UndefOr[Boolean] = js.native
  /**
    * Maximum number of comments to pull back on a post.
    */
  var maxComments: js.UndefOr[Double] = js.native
  /**
    * The ID of the post
    */
  var postId: js.UndefOr[String] = js.native
  /**
    * Access level with which to view the returned result. Note that some
    * fields require elevated access.
    */
  var view: js.UndefOr[String] = js.native
}

object ParamsDollarResourceDollarPostsDollarGet {
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
    quotaUser: String = null,
    userIp: String = null,
    view: String = null
  ): ParamsDollarResourceDollarPostsDollarGet = {
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
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDollarResourceDollarPostsDollarGet]
  }
}

