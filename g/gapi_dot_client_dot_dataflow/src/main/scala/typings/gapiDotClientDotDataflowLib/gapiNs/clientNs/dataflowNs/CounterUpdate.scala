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

