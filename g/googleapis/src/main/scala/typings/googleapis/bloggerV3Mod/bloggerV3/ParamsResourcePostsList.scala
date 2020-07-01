package typings.googleapis.bloggerV3Mod.bloggerV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourcePostsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * ID of the blog to fetch posts from.
    */
  var blogId: js.UndefOr[String] = js.native
  /**
    * Latest post date to fetch, a date-time with RFC 3339 formatting.
    */
  var endDate: js.UndefOr[String] = js.native
  /**
    * Whether the body content of posts is included (default: true). This
    * should be set to false when the post bodies are not required, to help
    * minimize traffic.
    */
  var fetchBodies: js.UndefOr[Boolean] = js.native
  /**
    * Whether image URL metadata for each post is included.
    */
  var fetchImages: js.UndefOr[Boolean] = js.native
  /**
    * Comma-separated list of labels to search for.
    */
  var labels: js.UndefOr[String] = js.native
  /**
    * Maximum number of posts to fetch.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Sort search results
    */
  var orderBy: js.UndefOr[String] = js.native
  /**
    * Continuation token if the request is paged.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Earliest post date to fetch, a date-time with RFC 3339 formatting.
    */
  var startDate: js.UndefOr[String] = js.native
  /**
    * Statuses to include in the results.
    */
  var status: js.UndefOr[js.Array[String]] = js.native
  /**
    * Access level with which to view the returned result. Note that some
    * fields require escalated access.
    */
  var view: js.UndefOr[String] = js.native
}

object ParamsResourcePostsList {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    blogId: String = null,
    endDate: String = null,
    fetchBodies: js.UndefOr[Boolean] = js.undefined,
    fetchImages: js.UndefOr[Boolean] = js.undefined,
    fields: String = null,
    key: String = null,
    labels: String = null,
    maxResults: js.UndefOr[Double] = js.undefined,
    oauth_token: String = null,
    orderBy: String = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    startDate: String = null,
    status: js.Array[String] = null,
    userIp: String = null,
    view: String = null
  ): ParamsResourcePostsList = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (blogId != null) __obj.updateDynamic("blogId")(blogId.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (!js.isUndefined(fetchBodies)) __obj.updateDynamic("fetchBodies")(fetchBodies.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fetchImages)) __obj.updateDynamic("fetchImages")(fetchImages.get.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourcePostsList]
  }
}

