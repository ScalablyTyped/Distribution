package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComputationTopology extends js.Object {
  /** The ID of the computation. */
  var computationId: js.UndefOr[String] = js.native
  /** The inputs to the computation. */
  var inputs: js.UndefOr[js.Array[StreamLocation]] = js.native
  /** The key ranges processed by the computation. */
  var keyRanges: js.UndefOr[js.Array[KeyRangeLocation]] = js.native
  /** The outputs from the computation. */
  var outputs: js.UndefOr[js.Array[StreamLocation]] = js.native
  /** The state family values. */
  var stateFamilies: js.UndefOr[js.Array[StateFamilyConfig]] = js.native
  /** The system stage name. */
  var systemStageName: js.UndefOr[String] = js.native
}

object ComputationTopology {
  @scala.inline
  def apply(): ComputationTopology = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComputationTopology]
  }
  @scala.inline
  implicit class ComputationTopologyOps[Self <: ComputationTopology] (val x: Self) extends AnyVal {
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
    def setComputationId(value: String): Self = this.set("computationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComputationId: Self = this.set("computationId", js.undefined)
    @scala.inline
    def setInputsVarargs(value: StreamLocation*): Self = this.set("inputs", js.Array(value :_*))
    @scala.inline
    def setInputs(value: js.Array[StreamLocation]): Self = this.set("inputs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputs: Self = this.set("inputs", js.undefined)
    @scala.inline
    def setKeyRangesVarargs(value: KeyRangeLocation*): Self = this.set("keyRanges", js.Array(value :_*))
    @scala.inline
    def setKeyRanges(value: js.Array[KeyRangeLocation]): Self = this.set("keyRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyRanges: Self = this.set("keyRanges", js.undefined)
    @scala.inline
    def setOutputsVarargs(value: StreamLocation*): Self = this.set("outputs", js.Array(value :_*))
    @scala.inline
    def setOutputs(value: js.Array[StreamLocation]): Self = this.set("outputs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputs: Self = this.set("outputs", js.undefined)
    @scala.inline
    def setStateFamiliesVarargs(value: StateFamilyConfig*): Self = this.set("stateFamilies", js.Array(value :_*))
    @scala.inline
    def setStateFamilies(value: js.Array[StateFamilyConfig]): Self = this.set("stateFamilies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateFamilies: Self = this.set("stateFamilies", js.undefined)
    @scala.inline
    def setSystemStageName(value: String): Self = this.set("systemStageName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSystemStageName: Self = this.set("systemStageName", js.undefined)
  }
  
}

