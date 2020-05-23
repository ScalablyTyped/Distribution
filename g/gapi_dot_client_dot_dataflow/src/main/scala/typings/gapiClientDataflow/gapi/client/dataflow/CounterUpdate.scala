package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CounterUpdate extends js.Object {
  /** Boolean value for And, Or. */
  var boolean: js.UndefOr[Boolean] = js.undefined
  /**
    * True if this counter is reported as the total cumulative aggregate
    * value accumulated since the worker started working on this WorkItem.
    * By default this is false, indicating that this counter is reported
    * as a delta.
    */
  var cumulative: js.UndefOr[Boolean] = js.undefined
  /** Distribution data */
  var distribution: js.UndefOr[DistributionUpdate] = js.undefined
  /** Floating point value for Sum, Max, Min. */
  var floatingPoint: js.UndefOr[Double] = js.undefined
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
  var shortId: js.UndefOr[String] = js.undefined
  /** List of strings, for Set. */
  var stringList: js.UndefOr[StringList] = js.undefined
  /** Counter structured name and metadata. */
  var structuredNameAndMetadata: js.UndefOr[CounterStructuredNameAndMetadata] = js.undefined
}

object CounterUpdate {
  @scala.inline
  def apply(
    boolean: js.UndefOr[Boolean] = js.undefined,
    cumulative: js.UndefOr[Boolean] = js.undefined,
    distribution: DistributionUpdate = null,
    floatingPoint: js.UndefOr[Double] = js.undefined,
    floatingPointList: FloatingPointList = null,
    floatingPointMean: FloatingPointMean = null,
    integer: SplitInt64 = null,
    integerList: IntegerList = null,
    integerMean: IntegerMean = null,
    internal: js.Any = null,
    nameAndKind: NameAndKind = null,
    shortId: String = null,
    stringList: StringList = null,
    structuredNameAndMetadata: CounterStructuredNameAndMetadata = null
  ): CounterUpdate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(boolean)) __obj.updateDynamic("boolean")(boolean.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cumulative)) __obj.updateDynamic("cumulative")(cumulative.get.asInstanceOf[js.Any])
    if (distribution != null) __obj.updateDynamic("distribution")(distribution.asInstanceOf[js.Any])
    if (!js.isUndefined(floatingPoint)) __obj.updateDynamic("floatingPoint")(floatingPoint.get.asInstanceOf[js.Any])
    if (floatingPointList != null) __obj.updateDynamic("floatingPointList")(floatingPointList.asInstanceOf[js.Any])
    if (floatingPointMean != null) __obj.updateDynamic("floatingPointMean")(floatingPointMean.asInstanceOf[js.Any])
    if (integer != null) __obj.updateDynamic("integer")(integer.asInstanceOf[js.Any])
    if (integerList != null) __obj.updateDynamic("integerList")(integerList.asInstanceOf[js.Any])
    if (integerMean != null) __obj.updateDynamic("integerMean")(integerMean.asInstanceOf[js.Any])
    if (internal != null) __obj.updateDynamic("internal")(internal.asInstanceOf[js.Any])
    if (nameAndKind != null) __obj.updateDynamic("nameAndKind")(nameAndKind.asInstanceOf[js.Any])
    if (shortId != null) __obj.updateDynamic("shortId")(shortId.asInstanceOf[js.Any])
    if (stringList != null) __obj.updateDynamic("stringList")(stringList.asInstanceOf[js.Any])
    if (structuredNameAndMetadata != null) __obj.updateDynamic("structuredNameAndMetadata")(structuredNameAndMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[CounterUpdate]
  }
}

