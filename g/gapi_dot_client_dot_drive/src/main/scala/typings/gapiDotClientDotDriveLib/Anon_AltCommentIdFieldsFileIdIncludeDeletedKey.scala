package typings
package gapiDotClientDotDriveLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltCommentIdFieldsFileIdIncludeDeletedKey extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the comment. */
  var commentId: java.lang.String
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the file. */
  var fileId: java.lang.String
  /** Whether to include deleted replies. Deleted replies will not include their original content. */
  var includeDeleted: js.UndefOr[scala.Boolean] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** The maximum number of replies to return per page. */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  /** The token for continuing a previous list request on the next page. This should be set to the value of 'nextPageToken' from the previous response. */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AltCommentIdFieldsFileIdIncludeDeletedKey {
  @scala.inline
  def apply(
    commentId: java.lang.String,
    fileId: java.lang.String,
    alt: java.lang.String = null,
    fields: java.lang.String = null,
    includeDeleted: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String = null,
    oauth_token: java.lang.String = null,
    pageSize: scala.Int | scala.Double = null,
    pageToken: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    userIp: java.lang.String = null
  ): Anon_AltCommentIdFieldsFileIdIncludeDeletedKey = {
    val __obj = js.Dynamic.literal(commentId = commentId, fileId = fileId)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (!js.isUndefined(includeDeleted)) __obj.updateDynamic("includeDeleted")(includeDeleted)
    if (key != null) __obj.updateDynamic("key")(key)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AltCommentIdFieldsFileIdIncludeDeletedKey]
  }
}

