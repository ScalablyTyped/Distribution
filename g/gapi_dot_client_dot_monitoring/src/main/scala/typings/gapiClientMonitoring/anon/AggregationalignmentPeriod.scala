package typings.gapiClientMonitoring.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AggregationalignmentPeriod extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.native
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.native
  /**
    * The alignment period for per-time series alignment. If present, alignmentPeriod must be at least 60 seconds. After per-time series alignment, each time
    * series will contain data points only on the period boundaries. If perSeriesAligner is not specified or equals ALIGN_NONE, then this field is ignored.
    * If perSeriesAligner is specified and does not equal ALIGN_NONE, then this field must be defined; otherwise an error is returned.
    */
  @JSName("aggregation.alignmentPeriod")
  var aggregationDotalignmentPeriod: js.UndefOr[String] = js.native
  /**
    * The approach to be used to combine time series. Not all reducer functions may be applied to all time series, depending on the metric type and the value
    * type of the original time series. Reduction may change the metric type of value type of the time series.Time series data must be aligned in order to
    * perform cross-time series reduction. If crossSeriesReducer is specified, then perSeriesAligner must be specified and not equal ALIGN_NONE and
    * alignmentPeriod must be specified; otherwise, an error is returned.
    */
  @JSName("aggregation.crossSeriesReducer")
  var aggregationDotcrossSeriesReducer: js.UndefOr[String] = js.native
  /**
    * The set of fields to preserve when crossSeriesReducer is specified. The groupByFields determine how the time series are partitioned into subsets prior
    * to applying the aggregation function. Each subset contains time series that have the same value for each of the grouping fields. Each individual time
    * series is a member of exactly one subset. The crossSeriesReducer is applied to each subset of time series. It is not possible to reduce across
    * different resource types, so this field implicitly contains resource.type. Fields not specified in groupByFields are aggregated away. If groupByFields
    * is not specified and all the time series have the same resource type, then the time series are aggregated into a single output time series. If
    * crossSeriesReducer is not defined, this field is ignored.
    */
  @JSName("aggregation.groupByFields")
  var aggregationDotgroupByFields: js.UndefOr[String] = js.native
  /**
    * The approach to be used to align individual time series. Not all alignment functions may be applied to all time series, depending on the metric type
    * and value type of the original time series. Alignment may change the metric type or the value type of the time series.Time series data must be aligned
    * in order to perform cross-time series reduction. If crossSeriesReducer is specified, then perSeriesAligner must be specified and not equal ALIGN_NONE
    * and alignmentPeriod must be specified; otherwise, an error is returned.
    */
  @JSName("aggregation.perSeriesAligner")
  var aggregationDotperSeriesAligner: js.UndefOr[String] = js.native
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.native
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[String] = js.native
  /** JSONP */
  var callback: js.UndefOr[String] = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /**
    * A monitoring filter that specifies which time series should be returned. The filter must specify a single metric type, and can additionally specify
    * metric labels and other information. For example:
    * metric.type = "compute.googleapis.com/instance/cpu/usage_time" AND
    * metric.label.instance_name = "my-instance-name"
    */
  var filter: js.UndefOr[String] = js.native
  /** Required. The end of the time interval. */
  @JSName("interval.endTime")
  var intervalDotendTime: js.UndefOr[String] = js.native
  /** Optional. The beginning of the time interval. The default value for the start time is the end time. The start time must not be later than the end time. */
  @JSName("interval.startTime")
  var intervalDotstartTime: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /** The project on which to execute the request. The format is "projects/{project_id_or_number}". */
  var name: String = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /**
    * Specifies the order in which the points of the time series should be returned. By default, results are not ordered. Currently, this field must be left
    * blank.
    */
  var orderBy: js.UndefOr[String] = js.native
  /**
    * A positive number that is the maximum number of results to return. When view field sets to FULL, it limits the number of Points server will return; if
    * view field is HEADERS, it limits the number of TimeSeries server will return.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * If this field is not empty then it must contain the nextPageToken value returned by a previous call to this method. Using this field causes the method
    * to return additional results from the previous method call.
    */
  var pageToken: js.UndefOr[String] = js.native
  /** Pretty-print response. */
  var pp: js.UndefOr[Boolean] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
  /** Specifies which information is returned about the time series. */
  var view: js.UndefOr[String] = js.native
}

object AggregationalignmentPeriod {
  @scala.inline
  def apply(name: String): AggregationalignmentPeriod = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationalignmentPeriod]
  }
  @scala.inline
  implicit class AggregationalignmentPeriodOps[Self <: AggregationalignmentPeriod] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def set$Dotxgafv(value: String): Self = this.set("$.xgafv", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$Dotxgafv: Self = this.set("$.xgafv", js.undefined)
    @scala.inline
    def setAccess_token(value: String): Self = this.set("access_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccess_token: Self = this.set("access_token", js.undefined)
    @scala.inline
    def setAggregationDotalignmentPeriod(value: String): Self = this.set("aggregation.alignmentPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggregationDotalignmentPeriod: Self = this.set("aggregation.alignmentPeriod", js.undefined)
    @scala.inline
    def setAggregationDotcrossSeriesReducer(value: String): Self = this.set("aggregation.crossSeriesReducer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggregationDotcrossSeriesReducer: Self = this.set("aggregation.crossSeriesReducer", js.undefined)
    @scala.inline
    def setAggregationDotgroupByFields(value: String): Self = this.set("aggregation.groupByFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggregationDotgroupByFields: Self = this.set("aggregation.groupByFields", js.undefined)
    @scala.inline
    def setAggregationDotperSeriesAligner(value: String): Self = this.set("aggregation.perSeriesAligner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggregationDotperSeriesAligner: Self = this.set("aggregation.perSeriesAligner", js.undefined)
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    @scala.inline
    def setBearer_token(value: String): Self = this.set("bearer_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBearer_token: Self = this.set("bearer_token", js.undefined)
    @scala.inline
    def setCallback(value: String): Self = this.set("callback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setIntervalDotendTime(value: String): Self = this.set("interval.endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntervalDotendTime: Self = this.set("interval.endTime", js.undefined)
    @scala.inline
    def setIntervalDotstartTime(value: String): Self = this.set("interval.startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntervalDotstartTime: Self = this.set("interval.startTime", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setOauth_token(value: String): Self = this.set("oauth_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOauth_token: Self = this.set("oauth_token", js.undefined)
    @scala.inline
    def setOrderBy(value: String): Self = this.set("orderBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderBy: Self = this.set("orderBy", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setPp(value: Boolean): Self = this.set("pp", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePp: Self = this.set("pp", js.undefined)
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
    @scala.inline
    def setQuotaUser(value: String): Self = this.set("quotaUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotaUser: Self = this.set("quotaUser", js.undefined)
    @scala.inline
    def setUploadType(value: String): Self = this.set("uploadType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadType: Self = this.set("uploadType", js.undefined)
    @scala.inline
    def setUpload_protocol(value: String): Self = this.set("upload_protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpload_protocol: Self = this.set("upload_protocol", js.undefined)
    @scala.inline
    def setView(value: String): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
  
}

