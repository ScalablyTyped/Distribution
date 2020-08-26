package typings.gapiClientDataflow.gapi.client.dataflow

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartialGroupByKeyInstruction extends js.Object {
  /** Describes the input to the partial group-by-key instruction. */
  var input: js.UndefOr[InstructionInput] = js.native
  /** The codec to use for interpreting an element in the input PTable. */
  var inputElementCodec: js.UndefOr[Record[String, _]] = js.native
  /**
    * If this instruction includes a combining function this is the name of the
    * intermediate store between the GBK and the CombineValues.
    */
  var originalCombineValuesInputStoreName: js.UndefOr[String] = js.native
  /**
    * If this instruction includes a combining function, this is the name of the
    * CombineValues instruction lifted into this instruction.
    */
  var originalCombineValuesStepName: js.UndefOr[String] = js.native
  /** Zero or more side inputs. */
  var sideInputs: js.UndefOr[js.Array[SideInputInfo]] = js.native
  /** The value combining function to invoke. */
  var valueCombiningFn: js.UndefOr[Record[String, _]] = js.native
}

object PartialGroupByKeyInstruction {
  @scala.inline
  def apply(): PartialGroupByKeyInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialGroupByKeyInstruction]
  }
  @scala.inline
  implicit class PartialGroupByKeyInstructionOps[Self <: PartialGroupByKeyInstruction] (val x: Self) extends AnyVal {
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
    def setInput(value: InstructionInput): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setInputElementCodec(value: Record[String, _]): Self = this.set("inputElementCodec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputElementCodec: Self = this.set("inputElementCodec", js.undefined)
    @scala.inline
    def setOriginalCombineValuesInputStoreName(value: String): Self = this.set("originalCombineValuesInputStoreName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalCombineValuesInputStoreName: Self = this.set("originalCombineValuesInputStoreName", js.undefined)
    @scala.inline
    def setOriginalCombineValuesStepName(value: String): Self = this.set("originalCombineValuesStepName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalCombineValuesStepName: Self = this.set("originalCombineValuesStepName", js.undefined)
    @scala.inline
    def setSideInputsVarargs(value: SideInputInfo*): Self = this.set("sideInputs", js.Array(value :_*))
    @scala.inline
    def setSideInputs(value: js.Array[SideInputInfo]): Self = this.set("sideInputs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSideInputs: Self = this.set("sideInputs", js.undefined)
    @scala.inline
    def setValueCombiningFn(value: Record[String, _]): Self = this.set("valueCombiningFn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueCombiningFn: Self = this.set("valueCombiningFn", js.undefined)
  }
  
}

