package typings.googleapis.buildSrcApisBloggerV3Mod.blogger_v3

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarPostsDollarInsert extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * ID of the blog to add the post to.
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
    * Whether to create the post as a draft (default: false).
    */
  var isDraft: js.UndefOr[Boolean] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$Post] = js.native
}

object ParamsDollarResourceDollarPostsDollarInsert {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    blogId: String = null,
    fetchBody: js.UndefOr[Boolean] = js.undefined,
    fetchImages: js.UndefOr[Boolean] = js.undefined,
    fields: String = null,
    isDraft: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    requestBody: Schema$Post = null,
    userIp: String = null
  ): ParamsDollarResourceDollarPostsDollarInsert = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (blogId != null) __obj.updateDynamic("blogId")(blogId.asInstanceOf[js.Any])
    if (!js.isUndefined(fetchBody)) __obj.updateDynamic("fetchBody")(fetchBody.asInstanceOf[js.Any])
    if (!js.isUndefined(fetchImages)) __obj.updateDynamic("fetchImages")(fetchImages.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(isDraft)) __obj.updateDynamic("isDraft")(isDraft.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (requestBody != null) __obj.updateDynamic("requestBody")(requestBody.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDollarResourceDollarPostsDollarInsert]
  }
}

