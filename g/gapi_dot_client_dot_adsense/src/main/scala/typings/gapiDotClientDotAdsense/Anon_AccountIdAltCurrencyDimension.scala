package typings.gapiDotClientDotAdsense

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccountIdAltCurrencyDimension extends js.Object {
  /** Accounts upon which to report. */
  var accountId: js.UndefOr[String] = js.undefined
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** Optional currency to use when reporting on monetary metrics. Defaults to the account's currency if not set. */
  var currency: js.UndefOr[String] = js.undefined
  /** Dimensions to base the report on. */
  var dimension: js.UndefOr[String] = js.undefined
  /** End of the date range to report on in "YYYY-MM-DD" format, inclusive. */
  var endDate: String
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** Filters to be run on the report. */
  var filter: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** Optional locale to use for translating report output to a local language. Defaults to "en_US" if not specified. */
  var locale: js.UndefOr[String] = js.undefined
  /** The maximum number of rows of report data to return. */
  var maxResults: js.UndefOr[Double] = js.undefined
  /** Numeric columns to include in the report. */
  var metric: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /**
    * The name of a dimension or metric to sort the resulting report on, optionally prefixed with "+" to sort ascending or "-" to sort descending. If no
    * prefix is specified, the column is sorted ascending.
    */
  var sort: js.UndefOr[String] = js.undefined
  /** Start of the date range to report on in "YYYY-MM-DD" format, inclusive. */
  var startDate: String
  /** Index of the first row of report data to return. */
  var startIndex: js.UndefOr[Double] = js.undefined
  /** Whether the report should be generated in the AdSense account's local timezone. If false default PST/PDT timezone will be used. */
  var useTimezoneReporting: js.UndefOr[Boolean] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
}

object Anon_AccountIdAltCurrencyDimension {
  @scala.inline
  def apply(
    endDate: String,
    startDate: String,
    accountId: String = null,
    alt: String = null,
    currency: String = null,
    dimension: String = null,
    fields: String = null,
    filter: String = null,
    key: String = null,
    locale: String = null,
    maxResults: Int | Double = null,
    metric: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    sort: String = null,
    startIndex: Int | Double = null,
    useTimezoneReporting: js.UndefOr[Boolean] = js.undefined,
    userIp: String = null
  ): Anon_AccountIdAltCurrencyDimension = {
    val __obj = js.Dynamic.literal(endDate = endDate, startDate = startDate)
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (currency != null) __obj.updateDynamic("currency")(currency)
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
    if (!js.isUndefined(useTimezoneReporting)) __obj.updateDynamic("useTimezoneReporting")(useTimezoneReporting)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AccountIdAltCurrencyDimension]
  }
}

