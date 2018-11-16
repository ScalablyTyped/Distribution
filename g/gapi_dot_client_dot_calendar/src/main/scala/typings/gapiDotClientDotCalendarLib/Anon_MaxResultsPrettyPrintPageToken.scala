package typings
package gapiDotClientDotCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_MaxResultsPrettyPrintPageToken extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * Maximum number of entries returned on one result page. By default the value is 100 entries. The page size can never be larger than 250 entries.
                   * Optional.
                   */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /** The minimum access role for the user in the returned entries. Optional. The default is no restriction. */
  var minAccessRole: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Token specifying which result page to return. Optional. */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
                   * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
                   * Overrides userIp if both are provided.
                   */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** Whether to include deleted calendar list entries in the result. Optional. The default is False. */
  var showDeleted: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether to show hidden entries. Optional. The default is False. */
  var showHidden: js.UndefOr[scala.Boolean] = js.undefined
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
  var syncToken: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

