package typings.gapiClientMonitoring.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregationalignmentPeriod extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.undefined
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.undefined
  /**
    * The alignment period for per-time series alignment. If present, alignmentPeriod must be at least 60 seconds. After per-time series alignment, each time
    * series will contain data points only on the period boundaries. If perSeriesAligner is not specified or equals ALIGN_NONE, then this field is ignored.
    * If perSeriesAligner is specified and does not equal ALIGN_NONE, then this field must be defined; otherwise an error is returned.
    */
  @JSName("aggregation.alignmentPeriod")
  var aggregationDotalignmentPeriod: js.UndefOr[String] = js.undefined
  /**
    * The approach to be used to combine time series. Not all reducer functions may be applied to all time series, depending on the metric type and the value
    * type of the original time series. Reduction may change the metric type of value type of the time series.Time series data must be aligned in order to
    * perform cross-time series reduction. If crossSeriesReducer is specified, then perSeriesAligner must be specified and not equal ALIGN_NONE and
    * alignmentPeriod must be specified; otherwise, an error is returned.
    */
  @JSName("aggregation.crossSeriesReducer")
  var aggregationDotcrossSeriesReducer: js.UndefOr[String] = js.undefined
  /**
    * The set of fields to preserve when crossSeriesReducer is specified. The groupByFields determine how the time series are partitioned into subsets prior
    * to applying the aggregation function. Each subset contains time series that have the same value for each of the grouping fields. Each individual time
    * series is a member of exactly one subset. The crossSeriesReducer is applied to each subset of time series. It is not possible to reduce across
    * different resource types, so this field implicitly contains resource.type. Fields not specified in groupByFields are aggregated away. If groupByFields
    * is not specified and all the time series have the same resource type, then the time series are aggregated into a single output time series. If
    * crossSeriesReducer is not defined, this field is ignored.
    */
  @JSName("aggregation.groupByFields")
  var aggregationDotgroupByFields: js.UndefOr[String] = js.undefined
  /**
    * The approach to be used to align individual time series. Not all alignment functions may be applied to all time series, depending on the metric type
    * and value type of the original time series. Alignment may change the metric type or the value type of the time series.Time series data must be aligned
    * in order to perform cross-time series reduction. If crossSeriesReducer is specified, then perSeriesAligner must be specified and not equal ALIGN_NONE
    * and alignmentPeriod must be specified; otherwise, an error is returned.
    */
  @JSName("aggregation.perSeriesAligner")
  var aggregationDotperSeriesAligner: js.UndefOr[String] = js.undefined
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.undefined
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[String] = js.undefined
  /** JSONP */
  var callback: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /**
    * A monitoring filter that specifies which time series should be returned. The filter must specify a single metric type, and can additionally specify
    * metric labels and other information. For example:
    * metric.type = "compute.googleapis.com/instance/cpu/usage_time" AND
    * metric.label.instance_name = "my-instance-name"
    */
  var filter: js.UndefOr[String] = js.undefined
  /** Required. The end of the time interval. */
  @JSName("interval.endTime")
  var intervalDotendTime: js.UndefOr[String] = js.undefined
  /** Optional. The beginning of the time interval. The default value for the start time is the end time. The start time must not be later than the end time. */
  @JSName("interval.startTime")
  var intervalDotstartTime: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** The project on which to execute the request. The format is "projects/{project_id_or_number}". */
  var name: String
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /**
    * Specifies the order in which the points of the time series should be returned. By default, results are not ordered. Currently, this field must be left
    * blank.
    */
  var orderBy: js.UndefOr[String] = js.undefined
  /**
    * A positive number that is the maximum number of results to return. When view field sets to FULL, it limits the number of Points server will return; if
    * view field is HEADERS, it limits the number of TimeSeries server will return.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  /**
    * If this field is not empty then it must contain the nextPageToken value returned by a previous call to this method. Using this field causes the method
    * to return additional results from the previous method call.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  /** Pretty-print response. */
  var pp: js.UndefOr[Boolean] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.undefined
  /** Specifies which information is returned about the time series. */
  var view: js.UndefOr[String] = js.undefined
}

object AggregationalignmentPeriod {
  @scala.inline
  def apply(
    name: String,
    $Dotxgafv: String = null,
    access_token: String = null,
    aggregationDotalignmentPeriod: String = null,
    aggregationDotcrossSeriesReducer: String = null,
    aggregationDotgroupByFields: String = null,
    aggregationDotperSeriesAligner: String = null,
    alt: String = null,
    bearer_token: String = null,
    callback: String = null,
    fields: String = null,
    filter: String = null,
    intervalDotendTime: String = null,
    intervalDotstartTime: String = null,
    key: String = null,
    oauth_token: String = null,
    orderBy: String = null,
    pageSize: js.UndefOr[Double] = js.undefined,
    pageToken: String = null,
    pp: js.UndefOr[Boolean] = js.undefined,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    uploadType: String = null,
    upload_protocol: String = null,
    view: String = null
  ): AggregationalignmentPeriod = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if ($Dotxgafv != null) __obj.updateDynamic("$.xgafv")($Dotxgafv.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (aggregationDotalignmentPeriod != null) __obj.updateDynamic("aggregation.alignmentPeriod")(aggregationDotalignmentPeriod.asInstanceOf[js.Any])
    if (aggregationDotcrossSeriesReducer != null) __obj.updateDynamic("aggregation.crossSeriesReducer")(aggregationDotcrossSeriesReducer.asInstanceOf[js.Any])
    if (aggregationDotgroupByFields != null) __obj.updateDynamic("aggregation.groupByFields")(aggregationDotgroupByFields.asInstanceOf[js.Any])
    if (aggregationDotperSeriesAligner != null) __obj.updateDynamic("aggregation.perSeriesAligner")(aggregationDotperSeriesAligner.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (bearer_token != null) __obj.updateDynamic("bearer_token")(bearer_token.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (intervalDotendTime != null) __obj.updateDynamic("interval.endTime")(intervalDotendTime.asInstanceOf[js.Any])
    if (intervalDotstartTime != null) __obj.updateDynamic("interval.startTime")(intervalDotstartTime.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(pp)) __obj.updateDynamic("pp")(pp.get.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationalignmentPeriod]
  }
}

