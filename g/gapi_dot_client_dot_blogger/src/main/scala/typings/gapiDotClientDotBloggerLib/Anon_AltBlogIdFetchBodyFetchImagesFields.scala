package typings
package gapiDotClientDotBloggerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltBlogIdFetchBodyFetchImagesFields extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the Blog. */
  var blogId: java.lang.String
  /** Whether the body content of the post is included with the result (default: true). */
  var fetchBody: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether image URL metadata for each post is included in the returned result (default: false). */
  var fetchImages: js.UndefOr[scala.Boolean] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** Maximum number of comments to retrieve with the returned post. */
  var maxComments: js.UndefOr[scala.Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the Post. */
  var postId: java.lang.String
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether a publish action should be performed when the post is updated (default: false). */
  var publish: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** Whether a revert action should be performed when the post is updated (default: false). */
  var revert: js.UndefOr[scala.Boolean] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AltBlogIdFetchBodyFetchImagesFields {
  @scala.inline
  def apply(
    blogId: java.lang.String,
    postId: java.lang.String,
    alt: java.lang.String = null,
    fetchBody: js.UndefOr[scala.Boolean] = js.undefined,
    fetchImages: js.UndefOr[scala.Boolean] = js.undefined,
    fields: java.lang.String = null,
    key: java.lang.String = null,
    maxComments: scala.Int | scala.Double = null,
    oauth_token: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    publish: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    revert: js.UndefOr[scala.Boolean] = js.undefined,
    userIp: java.lang.String = null
  ): Anon_AltBlogIdFetchBodyFetchImagesFields = {
    val __obj = js.Dynamic.literal(blogId = blogId, postId = postId)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (!js.isUndefined(fetchBody)) __obj.updateDynamic("fetchBody")(fetchBody)
    if (!js.isUndefined(fetchImages)) __obj.updateDynamic("fetchImages")(fetchImages)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (key != null) __obj.updateDynamic("key")(key)
    if (maxComments != null) __obj.updateDynamic("maxComments")(maxComments.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (!js.isUndefined(publish)) __obj.updateDynamic("publish")(publish)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (!js.isUndefined(revert)) __obj.updateDynamic("revert")(revert)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AltBlogIdFetchBodyFetchImagesFields]
  }
}

