package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CounterStructuredName extends js.Object {
  /** Name of the optimized step being executed by the workers. */
  var componentStepName: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the stage. An execution step contains multiple component steps. */
  var executionStepName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Counter name. Not necessarily globally-unique, but unique within the
    * context of the other fields.
    * Required.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** One of the standard Origins defined above. */
  var origin: js.UndefOr[java.lang.String] = js.undefined
  /** A string containing a more specific namespace of the counter's origin. */
  var originNamespace: js.UndefOr[java.lang.String] = js.undefined
  /** The GroupByKey step name from the original graph. */
  var originalShuffleStepName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * System generated name of the original step in the user's graph, before
    * optimization.
    */
  var originalStepName: js.UndefOr[java.lang.String] = js.undefined
  /** Portion of this counter, either key or value. */
  var portion: js.UndefOr[java.lang.String] = js.undefined
  /**
    * ID of a side input being read from/written to. Side inputs are identified
    * by a pair of (reader, input_index). The reader is usually equal to the
    * original name, but it may be different, if a ParDo emits it's Iterator /
    * Map side input object.
    */
  var sideInput: js.UndefOr[SideInputId] = js.undefined
  /** ID of a particular worker. */
  var workerId: js.UndefOr[java.lang.String] = js.undefined
}

