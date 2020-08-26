package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParallelInstruction extends js.Object {
  /** Additional information for Flatten instructions. */
  var flatten: js.UndefOr[FlattenInstruction] = js.native
  /** User-provided name of this operation. */
  var name: js.UndefOr[String] = js.native
  /** System-defined name for the operation in the original workflow graph. */
  var originalName: js.UndefOr[String] = js.native
  /** Describes the outputs of the instruction. */
  var outputs: js.UndefOr[js.Array[InstructionOutput]] = js.native
  /** Additional information for ParDo instructions. */
  var parDo: js.UndefOr[ParDoInstruction] = js.native
  /** Additional information for PartialGroupByKey instructions. */
  var partialGroupByKey: js.UndefOr[PartialGroupByKeyInstruction] = js.native
  /** Additional information for Read instructions. */
  var read: js.UndefOr[ReadInstruction] = js.native
  /**
    * System-defined name of this operation.
    * Unique across the workflow.
    */
  var systemName: js.UndefOr[String] = js.native
  /** Additional information for Write instructions. */
  var write: js.UndefOr[WriteInstruction] = js.native
}

object ParallelInstruction {
  @scala.inline
  def apply(): ParallelInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParallelInstruction]
  }
  @scala.inline
  implicit class ParallelInstructionOps[Self <: ParallelInstruction] (val x: Self) extends AnyVal {
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
    def setFlatten(value: FlattenInstruction): Self = this.set("flatten", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlatten: Self = this.set("flatten", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOriginalName(value: String): Self = this.set("originalName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalName: Self = this.set("originalName", js.undefined)
    @scala.inline
    def setOutputsVarargs(value: InstructionOutput*): Self = this.set("outputs", js.Array(value :_*))
    @scala.inline
    def setOutputs(value: js.Array[InstructionOutput]): Self = this.set("outputs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputs: Self = this.set("outputs", js.undefined)
    @scala.inline
    def setParDo(value: ParDoInstruction): Self = this.set("parDo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParDo: Self = this.set("parDo", js.undefined)
    @scala.inline
    def setPartialGroupByKey(value: PartialGroupByKeyInstruction): Self = this.set("partialGroupByKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartialGroupByKey: Self = this.set("partialGroupByKey", js.undefined)
    @scala.inline
    def setRead(value: ReadInstruction): Self = this.set("read", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRead: Self = this.set("read", js.undefined)
    @scala.inline
    def setSystemName(value: String): Self = this.set("systemName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSystemName: Self = this.set("systemName", js.undefined)
    @scala.inline
    def setWrite(value: WriteInstruction): Self = this.set("write", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrite: Self = this.set("write", js.undefined)
  }
  
}

