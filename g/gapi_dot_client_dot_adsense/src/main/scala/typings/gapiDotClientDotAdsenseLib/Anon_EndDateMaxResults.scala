package typings
package gapiDotClientDotAdsenseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_EndDateMaxResults extends js.Object {
  /** Accounts upon which to report. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Optional currency to use when reporting on monetary metrics. Defaults to the account's currency if not set. */
  var currency: js.UndefOr[java.lang.String] = js.undefined
  /** Dimensions to base the report on. */
  var dimension: js.UndefOr[java.lang.String] = js.undefined
  /** End of the date range to report on in "YYYY-MM-DD" format, inclusive. */
  var endDate: java.lang.String
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** Filters to be run on the report. */
  var filter: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** Optional locale to use for translating report output to a local language. Defaults to "en_US" if not specified. */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** The maximum number of rows of report data to return. */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /** Numeric columns to include in the report. */
  var metric: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
                   * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
                   * Overrides userIp if both are provided.
                   */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * The name of a dimension or metric to sort the resulting report on, optionally prefixed with "+" to sort ascending or "-" to sort descending. If no
                   * prefix is specified, the column is sorted ascending.
                   */
  var sort: js.UndefOr[java.lang.String] = js.undefined
  /** Start of the date range to report on in "YYYY-MM-DD" format, inclusive. */
  var startDate: java.lang.String
  /** Index of the first row of report data to return. */
  var startIndex: js.UndefOr[scala.Double] = js.undefined
  /** Whether the report should be generated in the AdSense account's local timezone. If false default PST/PDT timezone will be used. */
  var useTimezoneReporting: js.UndefOr[scala.Boolean] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

