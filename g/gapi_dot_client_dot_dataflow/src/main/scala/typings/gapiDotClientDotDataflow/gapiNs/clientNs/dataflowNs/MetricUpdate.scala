package typings.gapiDotClientDotDataflow.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricUpdate extends js.Object {
  /**
    * True if this metric is reported as the total cumulative aggregate
    * value accumulated since the worker started working on this WorkItem.
    * By default this is false, indicating that this metric is reported
    * as a delta that is not associated with any WorkItem.
    */
  var cumulative: js.UndefOr[Boolean] = js.undefined
  /** A struct value describing properties of a distribution of numeric values. */
  var distribution: js.UndefOr[js.Any] = js.undefined
  /**
    * Worker-computed aggregate value for internal use by the Dataflow
    * service.
    */
  var internal: js.UndefOr[js.Any] = js.undefined
  /**
    * Metric aggregation kind.  The possible metric aggregation kinds are
    * "Sum", "Max", "Min", "Mean", "Set", "And", "Or", and "Distribution".
    * The specified aggregation kind is case-insensitive.
    *
    * If omitted, this is not an aggregated value but instead
    * a single metric sample value.
    */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * Worker-computed aggregate value for the "Mean" aggregation kind.
    * This holds the count of the aggregated values and is used in combination
    * with mean_sum above to obtain the actual mean aggregate value.
    * The only possible value type is Long.
    */
  var meanCount: js.UndefOr[js.Any] = js.undefined
  /**
    * Worker-computed aggregate value for the "Mean" aggregation kind.
    * This holds the sum of the aggregated values and is used in combination
    * with mean_count below to obtain the actual mean aggregate value.
    * The only possible value types are Long and Double.
    */
  var meanSum: js.UndefOr[js.Any] = js.undefined
  /** Name of the metric. */
  var name: js.UndefOr[MetricStructuredName] = js.undefined
  /**
    * Worker-computed aggregate value for aggregation kinds "Sum", "Max", "Min",
    * "And", and "Or".  The possible value types are Long, Double, and Boolean.
    */
  var scalar: js.UndefOr[js.Any] = js.undefined
  /**
    * Worker-computed aggregate value for the "Set" aggregation kind.  The only
    * possible value type is a list of Values whose type can be Long, Double,
    * or String, according to the metric's type.  All Values in the list must
    * be of the same type.
    */
  var set: js.UndefOr[js.Any] = js.undefined
  /**
    * Timestamp associated with the metric value. Optional when workers are
    * reporting work progress; it will be filled in responses from the
    * metrics API.
    */
  var updateTime: js.UndefOr[String] = js.undefined
}

object MetricUpdate {
  @scala.inline
  def apply(
    cumulative: js.UndefOr[Boolean] = js.undefined,
    distribution: js.Any = null,
    internal: js.Any = null,
    kind: String = null,
    meanCount: js.Any = null,
    meanSum: js.Any = null,
    name: MetricStructuredName = null,
    scalar: js.Any = null,
    set: js.Any = null,
    updateTime: String = null
  ): MetricUpdate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cumulative)) __obj.updateDynamic("cumulative")(cumulative)
    if (distribution != null) __obj.updateDynamic("distribution")(distribution)
    if (internal != null) __obj.updateDynamic("internal")(internal)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (meanCount != null) __obj.updateDynamic("meanCount")(meanCount)
    if (meanSum != null) __obj.updateDynamic("meanSum")(meanSum)
    if (name != null) __obj.updateDynamic("name")(name)
    if (scalar != null) __obj.updateDynamic("scalar")(scalar)
    if (set != null) __obj.updateDynamic("set")(set)
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime)
    __obj.asInstanceOf[MetricUpdate]
  }
}

