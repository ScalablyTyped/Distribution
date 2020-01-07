package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the state of a metric.
  */
@js.native
trait Schema$MetricUpdate extends js.Object {
  /**
    * True if this metric is reported as the total cumulative aggregate value
    * accumulated since the worker started working on this WorkItem. By default
    * this is false, indicating that this metric is reported as a delta that is
    * not associated with any WorkItem.
    */
  var cumulative: js.UndefOr[Boolean] = js.native
  /**
    * A struct value describing properties of a distribution of numeric values.
    */
  var distribution: js.UndefOr[js.Any] = js.native
  /**
    * A struct value describing properties of a Gauge. Metrics of gauge type
    * show the value of a metric across time, and is aggregated based on the
    * newest value.
    */
  var gauge: js.UndefOr[js.Any] = js.native
  /**
    * Worker-computed aggregate value for internal use by the Dataflow service.
    */
  var internal: js.UndefOr[js.Any] = js.native
  /**
    * Metric aggregation kind.  The possible metric aggregation kinds are
    * &quot;Sum&quot;, &quot;Max&quot;, &quot;Min&quot;, &quot;Mean&quot;,
    * &quot;Set&quot;, &quot;And&quot;, &quot;Or&quot;, and
    * &quot;Distribution&quot;. The specified aggregation kind is
    * case-insensitive.  If omitted, this is not an aggregated value but
    * instead a single metric sample value.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Worker-computed aggregate value for the &quot;Mean&quot; aggregation
    * kind. This holds the count of the aggregated values and is used in
    * combination with mean_sum above to obtain the actual mean aggregate
    * value. The only possible value type is Long.
    */
  var meanCount: js.UndefOr[js.Any] = js.native
  /**
    * Worker-computed aggregate value for the &quot;Mean&quot; aggregation
    * kind. This holds the sum of the aggregated values and is used in
    * combination with mean_count below to obtain the actual mean aggregate
    * value. The only possible value types are Long and Double.
    */
  var meanSum: js.UndefOr[js.Any] = js.native
  /**
    * Name of the metric.
    */
  var name: js.UndefOr[Schema$MetricStructuredName] = js.native
  /**
    * Worker-computed aggregate value for aggregation kinds &quot;Sum&quot;,
    * &quot;Max&quot;, &quot;Min&quot;, &quot;And&quot;, and &quot;Or&quot;.
    * The possible value types are Long, Double, and Boolean.
    */
  var scalar: js.UndefOr[js.Any] = js.native
  /**
    * Worker-computed aggregate value for the &quot;Set&quot; aggregation kind.
    * The only possible value type is a list of Values whose type can be Long,
    * Double, or String, according to the metric&#39;s type.  All Values in the
    * list must be of the same type.
    */
  var set: js.UndefOr[js.Any] = js.native
  /**
    * Timestamp associated with the metric value. Optional when workers are
    * reporting work progress; it will be filled in responses from the metrics
    * API.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object Schema$MetricUpdate {
  @scala.inline
  def apply(
    cumulative: js.UndefOr[Boolean] = js.undefined,
    distribution: js.Any = null,
    gauge: js.Any = null,
    internal: js.Any = null,
    kind: String = null,
    meanCount: js.Any = null,
    meanSum: js.Any = null,
    name: Schema$MetricStructuredName = null,
    scalar: js.Any = null,
    set: js.Any = null,
    updateTime: String = null
  ): Schema$MetricUpdate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cumulative)) __obj.updateDynamic("cumulative")(cumulative.asInstanceOf[js.Any])
    if (distribution != null) __obj.updateDynamic("distribution")(distribution.asInstanceOf[js.Any])
    if (gauge != null) __obj.updateDynamic("gauge")(gauge.asInstanceOf[js.Any])
    if (internal != null) __obj.updateDynamic("internal")(internal.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (meanCount != null) __obj.updateDynamic("meanCount")(meanCount.asInstanceOf[js.Any])
    if (meanSum != null) __obj.updateDynamic("meanSum")(meanSum.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (scalar != null) __obj.updateDynamic("scalar")(scalar.asInstanceOf[js.Any])
    if (set != null) __obj.updateDynamic("set")(set.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MetricUpdate]
  }
}

