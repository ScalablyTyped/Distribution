package typings.googleapis.buildSrcApisAnalyticsV3Mod.analytics_v3

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarDataDollarRealtimeDollarGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * A comma-separated list of real time dimensions. E.g.,
    * 'rt:medium,rt:city'.
    */
  var dimensions: js.UndefOr[String] = js.native
  /**
    * A comma-separated list of dimension or metric filters to be applied to
    * real time data.
    */
  var filters: js.UndefOr[String] = js.native
  /**
    * Unique table ID for retrieving real time data. Table ID is of the form
    * ga:XXXX, where XXXX is the Analytics view (profile) ID.
    */
  var ids: js.UndefOr[String] = js.native
  /**
    * The maximum number of entries to include in this feed.
    */
  var `max-results`: js.UndefOr[Double] = js.native
  /**
    * A comma-separated list of real time metrics. E.g., 'rt:activeUsers'. At
    * least one metric must be specified.
    */
  var metrics: js.UndefOr[String] = js.native
  /**
    * A comma-separated list of dimensions or metrics that determine the sort
    * order for real time data.
    */
  var sort: js.UndefOr[String] = js.native
}

object ParamsDollarResourceDollarDataDollarRealtimeDollarGet {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    dimensions: String = null,
    fields: String = null,
    filters: String = null,
    ids: String = null,
    key: String = null,
    `max-results`: Int | Double = null,
    metrics: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    sort: String = null,
    userIp: String = null
  ): ParamsDollarResourceDollarDataDollarRealtimeDollarGet = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (`max-results` != null) __obj.updateDynamic("max-results")(`max-results`.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDollarResourceDollarDataDollarRealtimeDollarGet]
  }
}

