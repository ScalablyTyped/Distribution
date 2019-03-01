package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CounterUpdate extends js.Object {
  /** Boolean value for And, Or. */
  var boolean: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * True if this counter is reported as the total cumulative aggregate
    * value accumulated since the worker started working on this WorkItem.
    * By default this is false, indicating that this counter is reported
    * as a delta.
    */
  var cumulative: js.UndefOr[scala.Boolean] = js.undefined
  /** Distribution data */
  var distribution: js.UndefOr[DistributionUpdate] = js.undefined
  /** Floating point value for Sum, Max, Min. */
  var floatingPoint: js.UndefOr[scala.Double] = js.undefined
  /** List of floating point numbers, for Set. */
  var floatingPointList: js.UndefOr[FloatingPointList] = js.undefined
  /** Floating point mean aggregation value for Mean. */
  var floatingPointMean: js.UndefOr[FloatingPointMean] = js.undefined
  /** Integer value for Sum, Max, Min. */
  var integer: js.UndefOr[SplitInt64] = js.undefined
  /** List of integers, for Set. */
  var integerList: js.UndefOr[IntegerList] = js.undefined
  /** Integer mean aggregation value for Mean. */
  var integerMean: js.UndefOr[IntegerMean] = js.undefined
  /** Value for internally-defined counters used by the Dataflow service. */
  var internal: js.UndefOr[js.Any] = js.undefined
  /** Counter name and aggregation type. */
  var nameAndKind: js.UndefOr[NameAndKind] = js.undefined
  /**
    * The service-generated short identifier for this counter.
    * The short_id -> (name, metadata) mapping is constant for the lifetime of
    * a job.
    */
  var shortId: js.UndefOr[java.lang.String] = js.undefined
  /** List of strings, for Set. */
  var stringList: js.UndefOr[StringList] = js.undefined
  /** Counter structured name and metadata. */
  var structuredNameAndMetadata: js.UndefOr[CounterStructuredNameAndMetadata] = js.undefined
}

object CounterUpdate {
  @scala.inline
  def apply(
    boolean: js.UndefOr[scala.Boolean] = js.undefined,
    cumulative: js.UndefOr[scala.Boolean] = js.undefined,
    distribution: DistributionUpdate = null,
    floatingPoint: scala.Int | scala.Double = null,
    floatingPointList: FloatingPointList = null,
    floatingPointMean: FloatingPointMean = null,
    integer: SplitInt64 = null,
    integerList: IntegerList = null,
    integerMean: IntegerMean = null,
    internal: js.Any = null,
    nameAndKind: NameAndKind = null,
    shortId: java.lang.String = null,
    stringList: StringList = null,
    structuredNameAndMetadata: CounterStructuredNameAndMetadata = null
  ): CounterUpdate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(boolean)) __obj.updateDynamic("boolean")(boolean)
    if (!js.isUndefined(cumulative)) __obj.updateDynamic("cumulative")(cumulative)
    if (distribution != null) __obj.updateDynamic("distribution")(distribution)
    if (floatingPoint != null) __obj.updateDynamic("floatingPoint")(floatingPoint.asInstanceOf[js.Any])
    if (floatingPointList != null) __obj.updateDynamic("floatingPointList")(floatingPointList)
    if (floatingPointMean != null) __obj.updateDynamic("floatingPointMean")(floatingPointMean)
    if (integer != null) __obj.updateDynamic("integer")(integer)
    if (integerList != null) __obj.updateDynamic("integerList")(integerList)
    if (integerMean != null) __obj.updateDynamic("integerMean")(integerMean)
    if (internal != null) __obj.updateDynamic("internal")(internal)
    if (nameAndKind != null) __obj.updateDynamic("nameAndKind")(nameAndKind)
    if (shortId != null) __obj.updateDynamic("shortId")(shortId)
    if (stringList != null) __obj.updateDynamic("stringList")(stringList)
    if (structuredNameAndMetadata != null) __obj.updateDynamic("structuredNameAndMetadata")(structuredNameAndMetadata)
    __obj.asInstanceOf[CounterUpdate]
  }
}

