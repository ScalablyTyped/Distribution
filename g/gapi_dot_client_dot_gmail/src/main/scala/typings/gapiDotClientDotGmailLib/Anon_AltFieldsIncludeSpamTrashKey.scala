package typings
package gapiDotClientDotGmailLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltFieldsIncludeSpamTrashKey extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** Include threads from SPAM and TRASH in the results. */
  var includeSpamTrash: js.UndefOr[scala.Boolean] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** Only return threads with labels that match all of the specified label IDs. */
  var labelIds: js.UndefOr[java.lang.String] = js.undefined
  /** Maximum number of threads to return. */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Page token to retrieve a specific page of results in the list. */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Only return threads matching the specified query. Supports the same query format as the Gmail search box. For example, "from:someuser@example.com
    * rfc822msgid: is:unread". Parameter cannot be used when accessing the api using the gmail.metadata scope.
    */
  var q: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** The user's email address. The special value me can be used to indicate the authenticated user. */
  var userId: java.lang.String
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AltFieldsIncludeSpamTrashKey {
  @scala.inline
  def apply(
    userId: java.lang.String,
    alt: java.lang.String = null,
    fields: java.lang.String = null,
    includeSpamTrash: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String = null,
    labelIds: java.lang.String = null,
    maxResults: scala.Int | scala.Double = null,
    oauth_token: java.lang.String = null,
    pageToken: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    q: java.lang.String = null,
    quotaUser: java.lang.String = null,
    userIp: java.lang.String = null
  ): Anon_AltFieldsIncludeSpamTrashKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("userId")(userId)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (!js.isUndefined(includeSpamTrash)) __obj.updateDynamic("includeSpamTrash")(includeSpamTrash)
    if (key != null) __obj.updateDynamic("key")(key)
    if (labelIds != null) __obj.updateDynamic("labelIds")(labelIds)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (q != null) __obj.updateDynamic("q")(q)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AltFieldsIncludeSpamTrashKey]
  }
}

