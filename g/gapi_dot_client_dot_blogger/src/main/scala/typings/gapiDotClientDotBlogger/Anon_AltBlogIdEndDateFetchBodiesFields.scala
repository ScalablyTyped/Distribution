package typings.gapiDotClientDotBlogger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltBlogIdEndDateFetchBodiesFields extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** ID of the blog to fetch posts from. */
  var blogId: String
  /** Latest post date to fetch, a date-time with RFC 3339 formatting. */
  var endDate: js.UndefOr[String] = js.undefined
  /** Whether the body content of posts is included. Default is false. */
  var fetchBodies: js.UndefOr[Boolean] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** Comma-separated list of labels to search for. */
  var labels: js.UndefOr[String] = js.undefined
  /** Maximum number of posts to fetch. */
  var maxResults: js.UndefOr[Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Sort order applied to search results. Default is published. */
  var orderBy: js.UndefOr[String] = js.undefined
  /** Continuation token if the request is paged. */
  var pageToken: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** Earliest post date to fetch, a date-time with RFC 3339 formatting. */
  var startDate: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  /** ID of the user for the per-user information to be fetched. Either the word 'self' (sans quote marks) or the user's profile identifier. */
  var userId: String
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
  /** Access level with which to view the returned result. Note that some fields require elevated access. */
  var view: js.UndefOr[String] = js.undefined
}

object Anon_AltBlogIdEndDateFetchBodiesFields {
  @scala.inline
  def apply(
    blogId: String,
    userId: String,
    alt: String = null,
    endDate: String = null,
    fetchBodies: js.UndefOr[Boolean] = js.undefined,
    fields: String = null,
    key: String = null,
    labels: String = null,
    maxResults: Int | Double = null,
    oauth_token: String = null,
    orderBy: String = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    startDate: String = null,
    status: String = null,
    userIp: String = null,
    view: String = null
  ): Anon_AltBlogIdEndDateFetchBodiesFields = {
    val __obj = js.Dynamic.literal(blogId = blogId.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (!js.isUndefined(fetchBodies)) __obj.updateDynamic("fetchBodies")(fetchBodies.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AltBlogIdEndDateFetchBodiesFields]
  }
}

