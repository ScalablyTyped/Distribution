package typings.googleapis.buildSrcApisYoutubeAnalyticsV1beta1Mod.youtubeAnalytics_v1beta1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarReportsDollarQuery extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The currency to which financial metrics should be converted. The default
    * is US Dollar (USD). If the result contains no financial metrics, this
    * flag will be ignored. Responds with an error if the specified currency is
    * not recognized.
    */
  var currency: js.UndefOr[String] = js.native
  /**
    * A comma-separated list of YouTube Analytics dimensions, such as views or
    * ageGroup,gender. See the Available Reports document for a list of the
    * reports that you can retrieve and the dimensions used for those reports.
    * Also see the Dimensions document for definitions of those dimensions.
    */
  var dimensions: js.UndefOr[String] = js.native
  /**
    * The end date for fetching YouTube Analytics data. The value should be in
    * YYYY-MM-DD format.
    */
  var `end-date`: js.UndefOr[String] = js.native
  /**
    * A list of filters that should be applied when retrieving YouTube
    * Analytics data. The Available Reports document identifies the dimensions
    * that can be used to filter each report, and the Dimensions document
    * defines those dimensions. If a request uses multiple filters, join them
    * together with a semicolon (;), and the returned result table will satisfy
    * both filters. For example, a filters parameter value of
    * video==dMH0bHeiRNg;country==IT restricts the result set to include data
    * for the given video in Italy.
    */
  var filters: js.UndefOr[String] = js.native
  /**
    * Identifies the YouTube channel or content owner for which you are
    * retrieving YouTube Analytics data. - To request data for a YouTube user,
    * set the ids parameter value to channel==CHANNEL_ID, where CHANNEL_ID
    * specifies the unique YouTube channel ID. - To request data for a YouTube
    * CMS content owner, set the ids parameter value to
    * contentOwner==OWNER_NAME, where OWNER_NAME is the CMS name of the content
    * owner.
    */
  var ids: js.UndefOr[String] = js.native
  /**
    * If set to true historical data (i.e. channel data from before the linking
    * of the channel to the content owner) will be retrieved.
    */
  var `include-historical-channel-data`: js.UndefOr[Boolean] = js.native
  /**
    * The maximum number of rows to include in the response.
    */
  var `max-results`: js.UndefOr[Double] = js.native
  /**
    * A comma-separated list of YouTube Analytics metrics, such as views or
    * likes,dislikes. See the Available Reports document for a list of the
    * reports that you can retrieve and the metrics available in each report,
    * and see the Metrics document for definitions of those metrics.
    */
  var metrics: js.UndefOr[String] = js.native
  /**
    * A comma-separated list of dimensions or metrics that determine the sort
    * order for YouTube Analytics data. By default the sort order is ascending.
    * The '-' prefix causes descending sort order.
    */
  var sort: js.UndefOr[String] = js.native
  /**
    * The start date for fetching YouTube Analytics data. The value should be
    * in YYYY-MM-DD format.
    */
  var `start-date`: js.UndefOr[String] = js.native
  /**
    * An index of the first entity to retrieve. Use this parameter as a
    * pagination mechanism along with the max-results parameter (one-based,
    * inclusive).
    */
  var `start-index`: js.UndefOr[Double] = js.native
}

object ParamsDollarResourceDollarReportsDollarQuery {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    currency: String = null,
    dimensions: String = null,
    `end-date`: String = null,
    fields: String = null,
    filters: String = null,
    ids: String = null,
    `include-historical-channel-data`: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    `max-results`: Int | Double = null,
    metrics: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    sort: String = null,
    `start-date`: String = null,
    `start-index`: Int | Double = null,
    userIp: String = null
  ): ParamsDollarResourceDollarReportsDollarQuery = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (`end-date` != null) __obj.updateDynamic("end-date")(`end-date`.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (!js.isUndefined(`include-historical-channel-data`)) __obj.updateDynamic("include-historical-channel-data")(`include-historical-channel-data`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (`max-results` != null) __obj.updateDynamic("max-results")(`max-results`.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (`start-date` != null) __obj.updateDynamic("start-date")(`start-date`.asInstanceOf[js.Any])
    if (`start-index` != null) __obj.updateDynamic("start-index")(`start-index`.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDollarResourceDollarReportsDollarQuery]
  }
}

