package typings.googleapis.buildSrcApisMonitoringV3Mod.monitoring_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A condition type that checks that monitored resources are reporting data.
  * The configuration defines a metric and a set of monitored resources. The
  * predicate is considered in violation when a time series for the specified
  * metric of a monitored resource does not include any data in the specified
  * duration.
  */
@js.native
trait Schema$MetricAbsence extends js.Object {
  /**
    * Specifies the alignment of data points in individual time series as well
    * as how to combine the retrieved time series together (such as when
    * aggregating multiple streams on each resource to a single stream for each
    * resource or when aggregating streams across all members of a group of
    * resrouces). Multiple aggregations are applied in the order specified.This
    * field is similar to the one in the MetricService.ListTimeSeries request.
    * It is advisable to use the ListTimeSeries method when debugging this
    * field.
    */
  var aggregations: js.UndefOr[js.Array[Schema$Aggregation]] = js.native
  /**
    * The amount of time that a time series must fail to report new data to be
    * considered failing. Currently, only values that are a multiple of a
    * minute--e.g. 60, 120, or 300 seconds--are supported. If an invalid value
    * is given, an error will be returned. The Duration.nanos field is ignored.
    */
  var duration: js.UndefOr[String] = js.native
  /**
    * A filter that identifies which time series should be compared with the
    * threshold.The filter is similar to the one that is specified in the
    * MetricService.ListTimeSeries request (that call is useful to verify the
    * time series that will be retrieved / processed) and must specify the
    * metric type and optionally may contain restrictions on resource type,
    * resource labels, and metric labels. This field may not exceed 2048
    * Unicode characters in length.
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * The number/percent of time series for which the comparison must hold in
    * order for the condition to trigger. If unspecified, then the condition
    * will trigger if the comparison is true for any of the time series that
    * have been identified by filter and aggregations.
    */
  var trigger: js.UndefOr[Schema$Trigger] = js.native
}

object Schema$MetricAbsence {
  @scala.inline
  def apply(
    aggregations: js.Array[Schema$Aggregation] = null,
    duration: String = null,
    filter: String = null,
    trigger: Schema$Trigger = null
  ): Schema$MetricAbsence = {
    val __obj = js.Dynamic.literal()
    if (aggregations != null) __obj.updateDynamic("aggregations")(aggregations.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MetricAbsence]
  }
}

