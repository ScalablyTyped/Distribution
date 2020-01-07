package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An update to a Counter sent from a worker.
  */
@js.native
trait Schema$CounterUpdate extends js.Object {
  /**
    * Boolean value for And, Or.
    */
  var boolean: js.UndefOr[Boolean] = js.native
  /**
    * True if this counter is reported as the total cumulative aggregate value
    * accumulated since the worker started working on this WorkItem. By default
    * this is false, indicating that this counter is reported as a delta.
    */
  var cumulative: js.UndefOr[Boolean] = js.native
  /**
    * Distribution data
    */
  var distribution: js.UndefOr[Schema$DistributionUpdate] = js.native
  /**
    * Floating point value for Sum, Max, Min.
    */
  var floatingPoint: js.UndefOr[Double] = js.native
  /**
    * List of floating point numbers, for Set.
    */
  var floatingPointList: js.UndefOr[Schema$FloatingPointList] = js.native
  /**
    * Floating point mean aggregation value for Mean.
    */
  var floatingPointMean: js.UndefOr[Schema$FloatingPointMean] = js.native
  /**
    * Integer value for Sum, Max, Min.
    */
  var integer: js.UndefOr[Schema$SplitInt64] = js.native
  /**
    * Gauge data
    */
  var integerGauge: js.UndefOr[Schema$IntegerGauge] = js.native
  /**
    * List of integers, for Set.
    */
  var integerList: js.UndefOr[Schema$IntegerList] = js.native
  /**
    * Integer mean aggregation value for Mean.
    */
  var integerMean: js.UndefOr[Schema$IntegerMean] = js.native
  /**
    * Value for internally-defined counters used by the Dataflow service.
    */
  var internal: js.UndefOr[js.Any] = js.native
  /**
    * Counter name and aggregation type.
    */
  var nameAndKind: js.UndefOr[Schema$NameAndKind] = js.native
  /**
    * The service-generated short identifier for this counter. The short_id
    * -&gt; (name, metadata) mapping is constant for the lifetime of a job.
    */
  var shortId: js.UndefOr[String] = js.native
  /**
    * List of strings, for Set.
    */
  var stringList: js.UndefOr[Schema$StringList] = js.native
  /**
    * Counter structured name and metadata.
    */
  var structuredNameAndMetadata: js.UndefOr[Schema$CounterStructuredNameAndMetadata] = js.native
}

object Schema$CounterUpdate {
  @scala.inline
  def apply(
    boolean: js.UndefOr[Boolean] = js.undefined,
    cumulative: js.UndefOr[Boolean] = js.undefined,
    distribution: Schema$DistributionUpdate = null,
    floatingPoint: Int | Double = null,
    floatingPointList: Schema$FloatingPointList = null,
    floatingPointMean: Schema$FloatingPointMean = null,
    integer: Schema$SplitInt64 = null,
    integerGauge: Schema$IntegerGauge = null,
    integerList: Schema$IntegerList = null,
    integerMean: Schema$IntegerMean = null,
    internal: js.Any = null,
    nameAndKind: Schema$NameAndKind = null,
    shortId: String = null,
    stringList: Schema$StringList = null,
    structuredNameAndMetadata: Schema$CounterStructuredNameAndMetadata = null
  ): Schema$CounterUpdate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(boolean)) __obj.updateDynamic("boolean")(boolean.asInstanceOf[js.Any])
    if (!js.isUndefined(cumulative)) __obj.updateDynamic("cumulative")(cumulative.asInstanceOf[js.Any])
    if (distribution != null) __obj.updateDynamic("distribution")(distribution.asInstanceOf[js.Any])
    if (floatingPoint != null) __obj.updateDynamic("floatingPoint")(floatingPoint.asInstanceOf[js.Any])
    if (floatingPointList != null) __obj.updateDynamic("floatingPointList")(floatingPointList.asInstanceOf[js.Any])
    if (floatingPointMean != null) __obj.updateDynamic("floatingPointMean")(floatingPointMean.asInstanceOf[js.Any])
    if (integer != null) __obj.updateDynamic("integer")(integer.asInstanceOf[js.Any])
    if (integerGauge != null) __obj.updateDynamic("integerGauge")(integerGauge.asInstanceOf[js.Any])
    if (integerList != null) __obj.updateDynamic("integerList")(integerList.asInstanceOf[js.Any])
    if (integerMean != null) __obj.updateDynamic("integerMean")(integerMean.asInstanceOf[js.Any])
    if (internal != null) __obj.updateDynamic("internal")(internal.asInstanceOf[js.Any])
    if (nameAndKind != null) __obj.updateDynamic("nameAndKind")(nameAndKind.asInstanceOf[js.Any])
    if (shortId != null) __obj.updateDynamic("shortId")(shortId.asInstanceOf[js.Any])
    if (stringList != null) __obj.updateDynamic("stringList")(stringList.asInstanceOf[js.Any])
    if (structuredNameAndMetadata != null) __obj.updateDynamic("structuredNameAndMetadata")(structuredNameAndMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CounterUpdate]
  }
}

