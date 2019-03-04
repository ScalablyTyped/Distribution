package typings
package gapiDotClientDotBloggerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltBlogIdCommentIdFields extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** ID of the blog to containing the comment. */
  var blogId: java.lang.String
  /** The ID of the comment to get. */
  var commentId: java.lang.String
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** ID of the post to fetch posts from. */
  var postId: java.lang.String
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Access level for the requested comment (default: READER). Note that some comments will require elevated permissions, for example comments where the
    * parent posts which is in a draft state, or comments that are pending moderation.
    */
  var view: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AltBlogIdCommentIdFields {
  @scala.inline
  def apply(
    blogId: java.lang.String,
    commentId: java.lang.String,
    postId: java.lang.String,
    alt: java.lang.String = null,
    fields: java.lang.String = null,
    key: java.lang.String = null,
    oauth_token: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    userIp: java.lang.String = null,
    view: java.lang.String = null
  ): Anon_AltBlogIdCommentIdFields = {
    val __obj = js.Dynamic.literal(blogId = blogId, commentId = commentId, postId = postId)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (key != null) __obj.updateDynamic("key")(key)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[Anon_AltBlogIdCommentIdFields]
  }
}

