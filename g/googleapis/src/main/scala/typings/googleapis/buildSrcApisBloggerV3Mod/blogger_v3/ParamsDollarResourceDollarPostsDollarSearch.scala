package typings.googleapis.buildSrcApisBloggerV3Mod.blogger_v3

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarPostsDollarSearch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * ID of the blog to fetch the post from.
    */
  var blogId: js.UndefOr[String] = js.native
  /**
    * Whether the body content of posts is included (default: true). This
    * should be set to false when the post bodies are not required, to help
    * minimize traffic.
    */
  var fetchBodies: js.UndefOr[Boolean] = js.native
  /**
    * Sort search results
    */
  var orderBy: js.UndefOr[String] = js.native
  /**
    * Query terms to search this blog for matching posts.
    */
  var q: js.UndefOr[String] = js.native
}

object ParamsDollarResourceDollarPostsDollarSearch {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    blogId: String = null,
    fetchBodies: js.UndefOr[Boolean] = js.undefined,
    fields: String = null,
    key: String = null,
    oauth_token: String = null,
    orderBy: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    q: String = null,
    quotaUser: String = null,
    userIp: String = null
  ): ParamsDollarResourceDollarPostsDollarSearch = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (blogId != null) __obj.updateDynamic("blogId")(blogId.asInstanceOf[js.Any])
    if (!js.isUndefined(fetchBodies)) __obj.updateDynamic("fetchBodies")(fetchBodies.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (q != null) __obj.updateDynamic("q")(q.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDollarResourceDollarPostsDollarSearch]
  }
}

