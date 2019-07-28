package typings.gapiDotClientDotGmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltFieldsIncludeSpamTrashKey extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** Include threads from SPAM and TRASH in the results. */
  var includeSpamTrash: js.UndefOr[Boolean] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** Only return threads with labels that match all of the specified label IDs. */
  var labelIds: js.UndefOr[String] = js.undefined
  /** Maximum number of threads to return. */
  var maxResults: js.UndefOr[Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Page token to retrieve a specific page of results in the list. */
  var pageToken: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /**
    * Only return threads matching the specified query. Supports the same query format as the Gmail search box. For example, "from:someuser@example.com
    * rfc822msgid: is:unread". Parameter cannot be used when accessing the api using the gmail.metadata scope.
    */
  var q: js.UndefOr[String] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** The user's email address. The special value me can be used to indicate the authenticated user. */
  var userId: String
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
}

object Anon_AltFieldsIncludeSpamTrashKey {
  @scala.inline
  def apply(
    userId: String,
    alt: String = null,
    fields: String = null,
    includeSpamTrash: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    labelIds: String = null,
    maxResults: Int | Double = null,
    oauth_token: String = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    q: String = null,
    quotaUser: String = null,
    userIp: String = null
  ): Anon_AltFieldsIncludeSpamTrashKey = {
    val __obj = js.Dynamic.literal(userId = userId)
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

