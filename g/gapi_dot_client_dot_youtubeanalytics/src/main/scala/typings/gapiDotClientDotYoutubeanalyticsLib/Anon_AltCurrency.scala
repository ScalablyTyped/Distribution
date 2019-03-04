package typings
package gapiDotClientDotYoutubeanalyticsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltCurrency extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The currency to which financial metrics should be converted. The default is US Dollar (USD). If the result contains no financial metrics, this flag
    * will be ignored. Responds with an error if the specified currency is not recognized.
    */
  var currency: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A comma-separated list of YouTube Analytics dimensions, such as views or ageGroup,gender. See the Available Reports document for a list of the reports
    * that you can retrieve and the dimensions used for those reports. Also see the Dimensions document for definitions of those dimensions.
    */
  var dimensions: js.UndefOr[java.lang.String] = js.undefined
  /** The end date for fetching YouTube Analytics data. The value should be in YYYY-MM-DD format. */
  var `end-date`: java.lang.String
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A list of filters that should be applied when retrieving YouTube Analytics data. The Available Reports document identifies the dimensions that can be
    * used to filter each report, and the Dimensions document defines those dimensions. If a request uses multiple filters, join them together with a
    * semicolon (;), and the returned result table will satisfy both filters. For example, a filters parameter value of video==dMH0bHeiRNg;country==IT
    * restricts the result set to include data for the given video in Italy.
    */
  var filters: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Identifies the YouTube channel or content owner for which you are retrieving YouTube Analytics data.
    * - To request data for a YouTube user, set the ids parameter value to channel==CHANNEL_ID, where CHANNEL_ID specifies the unique YouTube channel ID.
    * - To request data for a YouTube CMS content owner, set the ids parameter value to contentOwner==OWNER_NAME, where OWNER_NAME is the CMS name of the
    * content owner.
    */
  var ids: java.lang.String
  /** If set to true historical data (i.e. channel data from before the linking of the channel to the content owner) will be retrieved. */
  var `include-historical-channel-data`: js.UndefOr[scala.Boolean] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** The maximum number of rows to include in the response. */
  var `max-results`: js.UndefOr[scala.Double] = js.undefined
  /**
    * A comma-separated list of YouTube Analytics metrics, such as views or likes,dislikes. See the Available Reports document for a list of the reports that
    * you can retrieve and the metrics available in each report, and see the Metrics document for definitions of those metrics.
    */
  var metrics: java.lang.String
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
    * A comma-separated list of dimensions or metrics that determine the sort order for YouTube Analytics data. By default the sort order is ascending. The
    * '-' prefix causes descending sort order.
    */
  var sort: js.UndefOr[java.lang.String] = js.undefined
  /** The start date for fetching YouTube Analytics data. The value should be in YYYY-MM-DD format. */
  var `start-date`: java.lang.String
  /** An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter (one-based, inclusive). */
  var `start-index`: js.UndefOr[scala.Double] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AltCurrency {
  @scala.inline
  def apply(
    `end-date`: java.lang.String,
    ids: java.lang.String,
    metrics: java.lang.String,
    `start-date`: java.lang.String,
    alt: java.lang.String = null,
    currency: java.lang.String = null,
    dimensions: java.lang.String = null,
    fields: java.lang.String = null,
    filters: java.lang.String = null,
    `include-historical-channel-data`: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String = null,
    `max-results`: scala.Int | scala.Double = null,
    oauth_token: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    sort: java.lang.String = null,
    `start-index`: scala.Int | scala.Double = null,
    userIp: java.lang.String = null
  ): Anon_AltCurrency = {
    val __obj = js.Dynamic.literal(ids = ids, metrics = metrics)
    __obj.updateDynamic("end-date")(`end-date`)
    __obj.updateDynamic("start-date")(`start-date`)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (!js.isUndefined(`include-historical-channel-data`)) __obj.updateDynamic("include-historical-channel-data")(`include-historical-channel-data`)
    if (key != null) __obj.updateDynamic("key")(key)
    if (`max-results` != null) __obj.updateDynamic("max-results")(`max-results`.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (`start-index` != null) __obj.updateDynamic("start-index")(`start-index`.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AltCurrency]
  }
}

