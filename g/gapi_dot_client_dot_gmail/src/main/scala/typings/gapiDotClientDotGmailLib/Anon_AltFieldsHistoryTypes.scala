package typings
package gapiDotClientDotGmailLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltFieldsHistoryTypes extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** History types to be returned by the function */
  var historyTypes: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** Only return messages with a label matching the ID. */
  var labelId: js.UndefOr[java.lang.String] = js.undefined
  /** The maximum number of history records to return. */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Page token to retrieve a specific page of results in the list. */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Required. Returns history records after the specified startHistoryId. The supplied startHistoryId should be obtained from the historyId of a message,
    * thread, or previous list response. History IDs increase chronologically but are not contiguous with random gaps in between valid IDs. Supplying an
    * invalid or out of date startHistoryId typically returns an HTTP 404 error code. A historyId is typically valid for at least a week, but in some rare
    * circumstances may be valid for only a few hours. If you receive an HTTP 404 error response, your application should perform a full sync. If you receive
    * no nextPageToken in the response, there are no updates to retrieve and you can store the returned historyId for a future request.
    */
  var startHistoryId: js.UndefOr[java.lang.String] = js.undefined
  /** The user's email address. The special value me can be used to indicate the authenticated user. */
  var userId: java.lang.String
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AltFieldsHistoryTypes {
  @scala.inline
  def apply(
    userId: java.lang.String,
    alt: java.lang.String = null,
    fields: java.lang.String = null,
    historyTypes: java.lang.String = null,
    key: java.lang.String = null,
    labelId: java.lang.String = null,
    maxResults: scala.Int | scala.Double = null,
    oauth_token: java.lang.String = null,
    pageToken: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    startHistoryId: java.lang.String = null,
    userIp: java.lang.String = null
  ): Anon_AltFieldsHistoryTypes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("userId")(userId)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (historyTypes != null) __obj.updateDynamic("historyTypes")(historyTypes)
    if (key != null) __obj.updateDynamic("key")(key)
    if (labelId != null) __obj.updateDynamic("labelId")(labelId)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (startHistoryId != null) __obj.updateDynamic("startHistoryId")(startHistoryId)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AltFieldsHistoryTypes]
  }
}

