package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CounterStructuredName extends js.Object {
  /** Name of the optimized step being executed by the workers. */
  var componentStepName: js.UndefOr[String] = js.native
  /** Name of the stage. An execution step contains multiple component steps. */
  var executionStepName: js.UndefOr[String] = js.native
  /**
    * Counter name. Not necessarily globally-unique, but unique within the
    * context of the other fields.
    * Required.
    */
  var name: js.UndefOr[String] = js.native
  /** One of the standard Origins defined above. */
  var origin: js.UndefOr[String] = js.native
  /** A string containing a more specific namespace of the counter's origin. */
  var originNamespace: js.UndefOr[String] = js.native
  /** The GroupByKey step name from the original graph. */
  var originalShuffleStepName: js.UndefOr[String] = js.native
  /**
    * System generated name of the original step in the user's graph, before
    * optimization.
    */
  var originalStepName: js.UndefOr[String] = js.native
  /** Portion of this counter, either key or value. */
  var portion: js.UndefOr[String] = js.native
  /**
    * ID of a side input being read from/written to. Side inputs are identified
    * by a pair of (reader, input_index). The reader is usually equal to the
    * original name, but it may be different, if a ParDo emits it's Iterator /
    * Map side input object.
    */
  var sideInput: js.UndefOr[SideInputId] = js.native
  /** ID of a particular worker. */
  var workerId: js.UndefOr[String] = js.native
}

object CounterStructuredName {
  @scala.inline
  def apply(): CounterStructuredName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CounterStructuredName]
  }
  @scala.inline
  implicit class CounterStructuredNameOps[Self <: CounterStructuredName] (val x: Self) extends AnyVal {
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
    def setComponentStepName(value: String): Self = this.set("componentStepName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentStepName: Self = this.set("componentStepName", js.undefined)
    @scala.inline
    def setExecutionStepName(value: String): Self = this.set("executionStepName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionStepName: Self = this.set("executionStepName", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    @scala.inline
    def setOriginNamespace(value: String): Self = this.set("originNamespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginNamespace: Self = this.set("originNamespace", js.undefined)
    @scala.inline
    def setOriginalShuffleStepName(value: String): Self = this.set("originalShuffleStepName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalShuffleStepName: Self = this.set("originalShuffleStepName", js.undefined)
    @scala.inline
    def setOriginalStepName(value: String): Self = this.set("originalStepName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalStepName: Self = this.set("originalStepName", js.undefined)
    @scala.inline
    def setPortion(value: String): Self = this.set("portion", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePortion: Self = this.set("portion", js.undefined)
    @scala.inline
    def setSideInput(value: SideInputId): Self = this.set("sideInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSideInput: Self = this.set("sideInput", js.undefined)
    @scala.inline
    def setWorkerId(value: String): Self = this.set("workerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkerId: Self = this.set("workerId", js.undefined)
  }
  
}

