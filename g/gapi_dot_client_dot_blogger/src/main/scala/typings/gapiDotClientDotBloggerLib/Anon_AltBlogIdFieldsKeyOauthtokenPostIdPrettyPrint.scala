package typings
package gapiDotClientDotBloggerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltBlogIdFieldsKeyOauthtokenPostIdPrettyPrint extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the Blog. */
  var blogId: java.lang.String
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the Post. */
  var postId: java.lang.String
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional date and time to schedule the publishing of the Blog. If no publishDate parameter is given, the post is either published at the a previously
    * saved schedule date (if present), or the current time. If a future date is given, the post will be scheduled to be published.
    */
  var publishDate: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AltBlogIdFieldsKeyOauthtokenPostIdPrettyPrint {
  @scala.inline
  def apply(
    blogId: java.lang.String,
    postId: java.lang.String,
    alt: java.lang.String = null,
    fields: java.lang.String = null,
    key: java.lang.String = null,
    oauth_token: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    publishDate: java.lang.String = null,
    quotaUser: java.lang.String = null,
    userIp: java.lang.String = null
  ): Anon_AltBlogIdFieldsKeyOauthtokenPostIdPrettyPrint = {
    val __obj = js.Dynamic.literal(blogId = blogId, postId = postId)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (key != null) __obj.updateDynamic("key")(key)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (publishDate != null) __obj.updateDynamic("publishDate")(publishDate)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AltBlogIdFieldsKeyOauthtokenPostIdPrettyPrint]
  }
}

