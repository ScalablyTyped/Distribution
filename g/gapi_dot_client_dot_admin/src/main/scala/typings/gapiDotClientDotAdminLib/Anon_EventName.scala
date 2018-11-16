package typings
package gapiDotClientDotAdminLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_EventName extends js.Object {
  /** IP Address of host where the event was performed. Supports both IPv4 and IPv6 addresses. */
  var actorIpAddress: js.UndefOr[java.lang.String] = js.undefined
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Application name for which the events are to be retrieved. */
  var applicationName: java.lang.String
  /** Represents the customer for which the data is to be fetched. */
  var customerId: js.UndefOr[java.lang.String] = js.undefined
  /** Return events which occurred at or before this time. */
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the event being queried. */
  var eventName: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** Event parameters in the form [parameter1 name][operator][parameter1 value],[parameter2 name][operator][parameter2 value],... */
  var filters: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** Number of activity records to be shown in each page. */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Token to specify next page. */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
                   * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
                   * Overrides userIp if both are provided.
                   */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** Return events which occurred at or after this time. */
  var startTime: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * Represents the profile id or the user email for which the data should be filtered. When 'all' is specified as the userKey, it returns usageReports for
                   * all users.
                   */
  var userKey: java.lang.String
}

