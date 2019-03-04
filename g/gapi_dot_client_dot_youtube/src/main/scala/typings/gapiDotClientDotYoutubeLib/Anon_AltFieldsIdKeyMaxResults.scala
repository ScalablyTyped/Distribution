package typings
package gapiDotClientDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltFieldsIdKeyMaxResults extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The id parameter specifies a comma-separated list of comment IDs for the resources that are being retrieved. In a comment resource, the id property
    * specifies the comment's ID.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The maxResults parameter specifies the maximum number of items that should be returned in the result set.
    *
    * Note: This parameter is not supported for use in conjunction with the id parameter.
    */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken property identifies
    * the next page of the result that can be retrieved.
    *
    * Note: This parameter is not supported for use in conjunction with the id parameter.
    */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The parentId parameter specifies the ID of the comment for which replies should be retrieved.
    *
    * Note: YouTube currently supports replies only for top-level comments. However, replies to replies may be supported in the future.
    */
  var parentId: js.UndefOr[java.lang.String] = js.undefined
  /** The part parameter specifies a comma-separated list of one or more comment resource properties that the API response will include. */
  var part: java.lang.String
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** This parameter indicates whether the API should return comments formatted as HTML or as plain text. */
  var textFormat: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AltFieldsIdKeyMaxResults {
  @scala.inline
  def apply(
    part: java.lang.String,
    alt: java.lang.String = null,
    fields: java.lang.String = null,
    id: java.lang.String = null,
    key: java.lang.String = null,
    maxResults: scala.Int | scala.Double = null,
    oauth_token: java.lang.String = null,
    pageToken: java.lang.String = null,
    parentId: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    textFormat: java.lang.String = null,
    userIp: java.lang.String = null
  ): Anon_AltFieldsIdKeyMaxResults = {
    val __obj = js.Dynamic.literal(part = part)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (id != null) __obj.updateDynamic("id")(id)
    if (key != null) __obj.updateDynamic("key")(key)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (parentId != null) __obj.updateDynamic("parentId")(parentId)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (textFormat != null) __obj.updateDynamic("textFormat")(textFormat)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AltFieldsIdKeyMaxResults]
  }
}

