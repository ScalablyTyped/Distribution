package typings.googleapis.buildSrcApisAdsenseV1Dot4Mod.adsense_v1_4

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarAccountsDollarReportsDollarGenerate extends StandardParameters {
  /**
    * Account upon which to report.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Optional currency to use when reporting on monetary metrics. Defaults to
    * the account's currency if not set.
    */
  var currency: js.UndefOr[String] = js.native
  /**
    * Dimensions to base the report on.
    */
  var dimension: js.UndefOr[js.Array[String]] = js.native
  /**
    * End of the date range to report on in "YYYY-MM-DD" format, inclusive.
    */
  var endDate: js.UndefOr[String] = js.native
  /**
    * Filters to be run on the report.
    */
  var filter: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional locale to use for translating report output to a local language.
    * Defaults to "en_US" if not specified.
    */
  var locale: js.UndefOr[String] = js.native
  /**
    * The maximum number of rows of report data to return.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Numeric columns to include in the report.
    */
  var metric: js.UndefOr[js.Array[String]] = js.native
  /**
    * The name of a dimension or metric to sort the resulting report on,
    * optionally prefixed with "+" to sort ascending or "-" to sort descending.
    * If no prefix is specified, the column is sorted ascending.
    */
  var sort: js.UndefOr[js.Array[String]] = js.native
  /**
    * Start of the date range to report on in "YYYY-MM-DD" format, inclusive.
    */
  var startDate: js.UndefOr[String] = js.native
  /**
    * Index of the first row of report data to return.
    */
  var startIndex: js.UndefOr[Double] = js.native
  /**
    * Whether the report should be generated in the AdSense account's local
    * timezone. If false default PST/PDT timezone will be used.
    */
  var useTimezoneReporting: js.UndefOr[Boolean] = js.native
}

object ParamsDollarResourceDollarAccountsDollarReportsDollarGenerate {
  @scala.inline
  def apply(
    accountId: String = null,
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    currency: String = null,
    dimension: js.Array[String] = null,
    endDate: String = null,
    fields: String = null,
    filter: js.Array[String] = null,
    key: String = null,
    locale: String = null,
    maxResults: Int | Double = null,
    metric: js.Array[String] = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    sort: js.Array[String] = null,
    startDate: String = null,
    startIndex: Int | Double = null,
    useTimezoneReporting: js.UndefOr[Boolean] = js.undefined,
    userIp: String = null
  ): ParamsDollarResourceDollarAccountsDollarReportsDollarGenerate = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (dimension != null) __obj.updateDynamic("dimension")(dimension.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (metric != null) __obj.updateDynamic("metric")(metric.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(useTimezoneReporting)) __obj.updateDynamic("useTimezoneReporting")(useTimezoneReporting.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDollarResourceDollarAccountsDollarReportsDollarGenerate]
  }
}

