package typings
package gapiDotClientDotMonitoringLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_NameAccesstokenAggregationgroupByFields extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var `$.xgafv`: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth access token. */
  var access_token: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * The alignment period for per-time series alignment. If present, alignmentPeriod must be at least 60 seconds. After per-time series alignment, each time
                   * series will contain data points only on the period boundaries. If perSeriesAligner is not specified or equals ALIGN_NONE, then this field is ignored.
                   * If perSeriesAligner is specified and does not equal ALIGN_NONE, then this field must be defined; otherwise an error is returned.
                   */
  var `aggregation.alignmentPeriod`: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * The approach to be used to combine time series. Not all reducer functions may be applied to all time series, depending on the metric type and the value
                   * type of the original time series. Reduction may change the metric type of value type of the time series.Time series data must be aligned in order to
                   * perform cross-time series reduction. If crossSeriesReducer is specified, then perSeriesAligner must be specified and not equal ALIGN_NONE and
                   * alignmentPeriod must be specified; otherwise, an error is returned.
                   */
  var `aggregation.crossSeriesReducer`: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * The set of fields to preserve when crossSeriesReducer is specified. The groupByFields determine how the time series are partitioned into subsets prior
                   * to applying the aggregation function. Each subset contains time series that have the same value for each of the grouping fields. Each individual time
                   * series is a member of exactly one subset. The crossSeriesReducer is applied to each subset of time series. It is not possible to reduce across
                   * different resource types, so this field implicitly contains resource.type. Fields not specified in groupByFields are aggregated away. If groupByFields
                   * is not specified and all the time series have the same resource type, then the time series are aggregated into a single output time series. If
                   * crossSeriesReducer is not defined, this field is ignored.
                   */
  var `aggregation.groupByFields`: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * The approach to be used to align individual time series. Not all alignment functions may be applied to all time series, depending on the metric type
                   * and value type of the original time series. Alignment may change the metric type or the value type of the time series.Time series data must be aligned
                   * in order to perform cross-time series reduction. If crossSeriesReducer is specified, then perSeriesAligner must be specified and not equal ALIGN_NONE
                   * and alignmentPeriod must be specified; otherwise, an error is returned.
                   */
  var `aggregation.perSeriesAligner`: js.UndefOr[java.lang.String] = js.undefined
  /** Data format for response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[java.lang.String] = js.undefined
  /** JSONP */
  var callback: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * A monitoring filter that specifies which time series should be returned. The filter must specify a single metric type, and can additionally specify
                   * metric labels and other information. For example:
                   * metric.type = "compute.googleapis.com/instance/cpu/usage_time" AND
                   * metric.label.instance_name = "my-instance-name"
                   */
  var filter: js.UndefOr[java.lang.String] = js.undefined
  /** Required. The end of the time interval. */
  var `interval.endTime`: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. The beginning of the time interval. The default value for the start time is the end time. The start time must not be later than the end time. */
  var `interval.startTime`: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** The project on which to execute the request. The format is "projects/{project_id_or_number}". */
  var name: java.lang.String
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * Specifies the order in which the points of the time series should be returned. By default, results are not ordered. Currently, this field must be left
                   * blank.
                   */
  var orderBy: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * A positive number that is the maximum number of results to return. When view field sets to FULL, it limits the number of Points server will return; if
                   * view field is HEADERS, it limits the number of TimeSeries server will return.
                   */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  /**
                   * If this field is not empty then it must contain the nextPageToken value returned by a previous call to this method. Using this field causes the method
                   * to return additional results from the previous method call.
                   */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Pretty-print response. */
  var pp: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[java.lang.String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies which information is returned about the time series. */
  var view: js.UndefOr[java.lang.String] = js.undefined
}

