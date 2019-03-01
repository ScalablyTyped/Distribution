package typings
package gapiDotClientDotAdexchangesellerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccountIdAltDimension extends js.Object {
  /** Account which owns the generated report. */
  var accountId: java.lang.String
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
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
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AccountIdAltDimension {
  @scala.inline
  def apply(
    accountId: java.lang.String,
    endDate: java.lang.String,
    startDate: java.lang.String,
    alt: java.lang.String = null,
    dimension: java.lang.String = null,
    fields: java.lang.String = null,
    filter: java.lang.String = null,
    key: java.lang.String = null,
    locale: java.lang.String = null,
    maxResults: scala.Int | scala.Double = null,
    metric: java.lang.String = null,
    oauth_token: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    sort: java.lang.String = null,
    startIndex: scala.Int | scala.Double = null,
    userIp: java.lang.String = null
  ): Anon_AccountIdAltDimension = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accountId")(accountId)
    __obj.updateDynamic("endDate")(endDate)
    __obj.updateDynamic("startDate")(startDate)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (dimension != null) __obj.updateDynamic("dimension")(dimension)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (key != null) __obj.updateDynamic("key")(key)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (metric != null) __obj.updateDynamic("metric")(metric)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AccountIdAltDimension]
  }
}

