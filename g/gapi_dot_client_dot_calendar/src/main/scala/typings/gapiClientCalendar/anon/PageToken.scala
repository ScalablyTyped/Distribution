package typings.gapiClientCalendar.anon

import typings.gapiClientCalendar.gapi.client.calendar.Channel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageToken extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /**
    * Maximum number of entries returned on one result page. By default the value is 100 entries. The page size can never be larger than 250 entries.
    * Optional.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  /** The minimum access role for the user in the returned entries. Optional. The default is no restriction. */
  var minAccessRole: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Token specifying which result page to return. Optional. */
  var pageToken: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /** An opaque string that represents a user for quota purposes. Must not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** Request body */
  var resource: Channel
  /** Whether to include deleted calendar list entries in the result. Optional. The default is False. */
  var showDeleted: js.UndefOr[Boolean] = js.undefined
  /** Whether to show hidden entries. Optional. The default is False. */
  var showHidden: js.UndefOr[Boolean] = js.undefined
  /**
    * Token obtained from the nextSyncToken field returned on the last page of results from the previous list request. It makes the result of this list
    * request contain only entries that have changed since then. If only read-only fields such as calendar properties or ACLs have changed, the entry won't
    * be returned. All entries deleted and hidden since the previous list request will always be in the result set and it is not allowed to set showDeleted
    * neither showHidden to False.
    * To ensure client state consistency minAccessRole query parameter cannot be specified together with nextSyncToken.
    * If the syncToken expires, the server will respond with a 410 GONE response code and the client should clear its storage and perform a full
    * synchronization without any syncToken.
    * Learn more about incremental synchronization.
    * Optional. The default is to return all entries.
    */
  var syncToken: js.UndefOr[String] = js.undefined
  /** Deprecated. Please use quotaUser instead. */
  var userIp: js.UndefOr[String] = js.undefined
}

object PageToken {
  @scala.inline
  def apply(
    resource: Channel,
    alt: String = null,
    fields: String = null,
    key: String = null,
    maxResults: js.UndefOr[Double] = js.undefined,
    minAccessRole: String = null,
    oauth_token: String = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    showDeleted: js.UndefOr[Boolean] = js.undefined,
    showHidden: js.UndefOr[Boolean] = js.undefined,
    syncToken: String = null,
    userIp: String = null
  ): PageToken = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (minAccessRole != null) __obj.updateDynamic("minAccessRole")(minAccessRole.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (!js.isUndefined(showDeleted)) __obj.updateDynamic("showDeleted")(showDeleted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showHidden)) __obj.updateDynamic("showHidden")(showHidden.get.asInstanceOf[js.Any])
    if (syncToken != null) __obj.updateDynamic("syncToken")(syncToken.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageToken]
  }
}

