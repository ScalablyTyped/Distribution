package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instruction that copies its inputs (zero or more) to its (single)
  * output.
  */
@js.native
trait Schema$FlattenInstruction extends js.Object {
  /**
    * Describes the inputs to the flatten instruction.
    */
  var inputs: js.UndefOr[js.Array[Schema$InstructionInput]] = js.native
}

object Schema$FlattenInstruction {
  @scala.inline
  def apply(inputs: js.Array[Schema$InstructionInput] = null): Schema$FlattenInstruction = {
    val __obj = js.Dynamic.literal()
    if (inputs != null) __obj.updateDynamic("inputs")(inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FlattenInstruction]
  }
}

