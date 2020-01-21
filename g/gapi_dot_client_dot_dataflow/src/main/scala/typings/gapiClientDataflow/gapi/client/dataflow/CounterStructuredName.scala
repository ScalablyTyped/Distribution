package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CounterStructuredName extends js.Object {
  /** Name of the optimized step being executed by the workers. */
  var componentStepName: js.UndefOr[String] = js.undefined
  /** Name of the stage. An execution step contains multiple component steps. */
  var executionStepName: js.UndefOr[String] = js.undefined
  /**
    * Counter name. Not necessarily globally-unique, but unique within the
    * context of the other fields.
    * Required.
    */
  var name: js.UndefOr[String] = js.undefined
  /** One of the standard Origins defined above. */
  var origin: js.UndefOr[String] = js.undefined
  /** A string containing a more specific namespace of the counter's origin. */
  var originNamespace: js.UndefOr[String] = js.undefined
  /** The GroupByKey step name from the original graph. */
  var originalShuffleStepName: js.UndefOr[String] = js.undefined
  /**
    * System generated name of the original step in the user's graph, before
    * optimization.
    */
  var originalStepName: js.UndefOr[String] = js.undefined
  /** Portion of this counter, either key or value. */
  var portion: js.UndefOr[String] = js.undefined
  /**
    * ID of a side input being read from/written to. Side inputs are identified
    * by a pair of (reader, input_index). The reader is usually equal to the
    * original name, but it may be different, if a ParDo emits it's Iterator /
    * Map side input object.
    */
  var sideInput: js.UndefOr[SideInputId] = js.undefined
  /** ID of a particular worker. */
  var workerId: js.UndefOr[String] = js.undefined
}

object CounterStructuredName {
  @scala.inline
  def apply(
    componentStepName: String = null,
    executionStepName: String = null,
    name: String = null,
    origin: String = null,
    originNamespace: String = null,
    originalShuffleStepName: String = null,
    originalStepName: String = null,
    portion: String = null,
    sideInput: SideInputId = null,
    workerId: String = null
  ): CounterStructuredName = {
    val __obj = js.Dynamic.literal()
    if (componentStepName != null) __obj.updateDynamic("componentStepName")(componentStepName.asInstanceOf[js.Any])
    if (executionStepName != null) __obj.updateDynamic("executionStepName")(executionStepName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (originNamespace != null) __obj.updateDynamic("originNamespace")(originNamespace.asInstanceOf[js.Any])
    if (originalShuffleStepName != null) __obj.updateDynamic("originalShuffleStepName")(originalShuffleStepName.asInstanceOf[js.Any])
    if (originalStepName != null) __obj.updateDynamic("originalStepName")(originalStepName.asInstanceOf[js.Any])
    if (portion != null) __obj.updateDynamic("portion")(portion.asInstanceOf[js.Any])
    if (sideInput != null) __obj.updateDynamic("sideInput")(sideInput.asInstanceOf[js.Any])
    if (workerId != null) __obj.updateDynamic("workerId")(workerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CounterStructuredName]
  }
}

