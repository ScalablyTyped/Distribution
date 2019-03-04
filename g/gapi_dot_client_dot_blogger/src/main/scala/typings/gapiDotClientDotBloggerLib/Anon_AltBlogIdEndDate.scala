package typings
package gapiDotClientDotBloggerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltBlogIdEndDate extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** ID of the blog to fetch comments from. */
  var blogId: java.lang.String
  /** Latest date of comment to fetch, a date-time with RFC 3339 formatting. */
  var endDate: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the body content of the comments is included. */
  var fetchBodies: js.UndefOr[scala.Boolean] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** Maximum number of comments to include in the result. */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Continuation token if request is paged. */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** ID of the post to fetch posts from. */
  var postId: java.lang.String
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** Earliest date of comment to fetch, a date-time with RFC 3339 formatting. */
  var startDate: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
  /** Access level with which to view the returned result. Note that some fields require elevated access. */
  var view: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AltBlogIdEndDate {
  @scala.inline
  def apply(
    blogId: java.lang.String,
    postId: java.lang.String,
    alt: java.lang.String = null,
    endDate: java.lang.String = null,
    fetchBodies: js.UndefOr[scala.Boolean] = js.undefined,
    fields: java.lang.String = null,
    key: java.lang.String = null,
    maxResults: scala.Int | scala.Double = null,
    oauth_token: java.lang.String = null,
    pageToken: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    startDate: java.lang.String = null,
    status: java.lang.String = null,
    userIp: java.lang.String = null,
    view: java.lang.String = null
  ): Anon_AltBlogIdEndDate = {
    val __obj = js.Dynamic.literal(blogId = blogId, postId = postId)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (endDate != null) __obj.updateDynamic("endDate")(endDate)
    if (!js.isUndefined(fetchBodies)) __obj.updateDynamic("fetchBodies")(fetchBodies)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (key != null) __obj.updateDynamic("key")(key)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (startDate != null) __obj.updateDynamic("startDate")(startDate)
    if (status != null) __obj.updateDynamic("status")(status)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[Anon_AltBlogIdEndDate]
  }
}

