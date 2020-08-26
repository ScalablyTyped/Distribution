package typings.gapiClientDataflow.gapi.client.dataflow

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParDoInstruction extends js.Object {
  /** The input. */
  var input: js.UndefOr[InstructionInput] = js.native
  /** Information about each of the outputs, if user_fn is a  MultiDoFn. */
  var multiOutputInfos: js.UndefOr[js.Array[MultiOutputInfo]] = js.native
  /** The number of outputs. */
  var numOutputs: js.UndefOr[Double] = js.native
  /** Zero or more side inputs. */
  var sideInputs: js.UndefOr[js.Array[SideInputInfo]] = js.native
  /** The user function to invoke. */
  var userFn: js.UndefOr[Record[String, _]] = js.native
}

object ParDoInstruction {
  @scala.inline
  def apply(): ParDoInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParDoInstruction]
  }
  @scala.inline
  implicit class ParDoInstructionOps[Self <: ParDoInstruction] (val x: Self) extends AnyVal {
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
    def setMultiOutputInfosVarargs(value: MultiOutputInfo*): Self = this.set("multiOutputInfos", js.Array(value :_*))
    @scala.inline
    def setMultiOutputInfos(value: js.Array[MultiOutputInfo]): Self = this.set("multiOutputInfos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiOutputInfos: Self = this.set("multiOutputInfos", js.undefined)
    @scala.inline
    def setNumOutputs(value: Double): Self = this.set("numOutputs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumOutputs: Self = this.set("numOutputs", js.undefined)
    @scala.inline
    def setSideInputsVarargs(value: SideInputInfo*): Self = this.set("sideInputs", js.Array(value :_*))
    @scala.inline
    def setSideInputs(value: js.Array[SideInputInfo]): Self = this.set("sideInputs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSideInputs: Self = this.set("sideInputs", js.undefined)
    @scala.inline
    def setUserFn(value: Record[String, _]): Self = this.set("userFn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserFn: Self = this.set("userFn", js.undefined)
  }
  
}

