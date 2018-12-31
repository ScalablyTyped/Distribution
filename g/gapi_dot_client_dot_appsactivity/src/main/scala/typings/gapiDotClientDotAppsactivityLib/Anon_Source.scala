package typings
package gapiDotClientDotAppsactivityLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Source extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies the Drive folder containing the items for which to return activities. */
  var `drive.ancestorId`: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies the Drive item to return activities for. */
  var `drive.fileId`: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates the strategy to use when grouping singleEvents items in the associated combinedEvent object. */
  var groupingStrategy: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** The maximum number of events to return on a page. The response includes a continuation token if there are more events. */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  /** A token to retrieve a specific page of results. */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Google service from which to return activities. Possible values of source are:
    * - drive.google.com
    */
  var source: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates the user to return activity for. Use the special value me to indicate the currently authenticated user. */
  var userId: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

