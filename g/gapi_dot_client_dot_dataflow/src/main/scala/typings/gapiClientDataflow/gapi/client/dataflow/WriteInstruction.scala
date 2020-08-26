package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteInstruction extends js.Object {
  /** The input. */
  var input: js.UndefOr[InstructionInput] = js.native
  /** The sink to write to. */
  var sink: js.UndefOr[Sink] = js.native
}

object WriteInstruction {
  @scala.inline
  def apply(): WriteInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteInstruction]
  }
  @scala.inline
  implicit class WriteInstructionOps[Self <: WriteInstruction] (val x: Self) extends AnyVal {
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
    def setSink(value: Sink): Self = this.set("sink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSink: Self = this.set("sink", js.undefined)
  }
  
}

