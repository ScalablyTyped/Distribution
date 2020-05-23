package typings.gapiClientCloudmonitoring.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Aggregator extends js.Object {
  /**
    * The aggregation function that will reduce the data points in each window to a single point. This parameter is only valid for non-cumulative metrics
    * with a value type of INT64 or DOUBLE.
    */
  var aggregator: js.UndefOr[String] = js.undefined
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** Maximum number of time series descriptors per page. Used for pagination. If not specified, count = 100. */
  var count: js.UndefOr[Double] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /**
    * A collection of labels for the matching time series, which are represented as:
    * - key==value: key equals the value
    * - key=~value: key regex matches the value
    * - key!=value: key does not equal the value
    * - key!~value: key regex does not match the value  For example, to list all of the time series descriptors for the region us-central1, you could
    * specify:
    * label=cloud.googleapis.com%2Flocation=~us-central1.&#42;
    */
  var labels: js.UndefOr[String] = js.undefined
  /** Metric names are protocol-free URLs as listed in the Supported Metrics page. For example, compute.googleapis.com/instance/disk/read_ops_count. */
  var metric: String
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /**
    * Start of the time interval (exclusive), which is expressed as an RFC 3339 timestamp. If neither oldest nor timespan is specified, the default time
    * interval will be (youngest - 4 hours, youngest]
    */
  var oldest: js.UndefOr[String] = js.undefined
  /**
    * The pagination token, which is used to page through large result sets. Set this value to the value of the nextPageToken to retrieve the next page of
    * results.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /** The project ID to which this time series belongs. The value can be the numeric project ID or string-based project name. */
  var project: String
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /**
    * Length of the time interval to query, which is an alternative way to declare the interval: (youngest - timespan, youngest]. The timespan and oldest
    * parameters should not be used together. Units:
    * - s: second
    * - m: minute
    * - h: hour
    * - d: day
    * - w: week  Examples: 2s, 3m, 4w. Only one unit is allowed, for example: 2w3d is not allowed; you should use 17d instead.
    *
    * If neither oldest nor timespan is specified, the default time interval will be (youngest - 4 hours, youngest].
    */
  var timespan: js.UndefOr[String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
  /**
    * The sampling window. At most one data point will be returned for each window in the requested time interval. This parameter is only valid for
    * non-cumulative metric types. Units:
    * - m: minute
    * - h: hour
    * - d: day
    * - w: week  Examples: 3m, 4w. Only one unit is allowed, for example: 2w3d is not allowed; you should use 17d instead.
    */
  var window: js.UndefOr[String] = js.undefined
  /** End of the time interval (inclusive), which is expressed as an RFC 3339 timestamp. */
  var youngest: String
}

object Aggregator {
  @scala.inline
  def apply(
    metric: String,
    project: String,
    youngest: String,
    aggregator: String = null,
    alt: String = null,
    count: js.UndefOr[Double] = js.undefined,
    fields: String = null,
    key: String = null,
    labels: String = null,
    oauth_token: String = null,
    oldest: String = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    timespan: String = null,
    userIp: String = null,
    window: String = null
  ): Aggregator = {
    val __obj = js.Dynamic.literal(metric = metric.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], youngest = youngest.asInstanceOf[js.Any])
    if (aggregator != null) __obj.updateDynamic("aggregator")(aggregator.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (oldest != null) __obj.updateDynamic("oldest")(oldest.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (timespan != null) __obj.updateDynamic("timespan")(timespan.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aggregator]
  }
}

