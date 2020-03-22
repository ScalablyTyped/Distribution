package typings.gapiClientBlogger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQuotaUser extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** The ID of the Blog. */
  var blogId: String
  /** Whether the body content of the post is included with the result (default: true). */
  var fetchBody: js.UndefOr[Boolean] = js.undefined
  /** Whether image URL metadata for each post is included in the returned result (default: false). */
  var fetchImages: js.UndefOr[Boolean] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** Maximum number of comments to retrieve with the returned post. */
  var maxComments: js.UndefOr[Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** The ID of the Post. */
  var postId: String
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /** Whether a publish action should be performed when the post is updated (default: false). */
  var publish: js.UndefOr[Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** Whether a revert action should be performed when the post is updated (default: false). */
  var revert: js.UndefOr[Boolean] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
}

object AnonQuotaUser {
  @scala.inline
  def apply(
    blogId: String,
    postId: String,
    alt: String = null,
    fetchBody: js.UndefOr[Boolean] = js.undefined,
    fetchImages: js.UndefOr[Boolean] = js.undefined,
    fields: String = null,
    key: String = null,
    maxComments: Int | Double = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    publish: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    revert: js.UndefOr[Boolean] = js.undefined,
    userIp: String = null
  ): AnonQuotaUser = {
    val __obj = js.Dynamic.literal(blogId = blogId.asInstanceOf[js.Any], postId = postId.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (!js.isUndefined(fetchBody)) __obj.updateDynamic("fetchBody")(fetchBody.asInstanceOf[js.Any])
    if (!js.isUndefined(fetchImages)) __obj.updateDynamic("fetchImages")(fetchImages.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxComments != null) __obj.updateDynamic("maxComments")(maxComments.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (!js.isUndefined(publish)) __obj.updateDynamic("publish")(publish.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (!js.isUndefined(revert)) __obj.updateDynamic("revert")(revert.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQuotaUser]
  }
}

