package typings.gapiDotClientDotDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlattenInstruction extends js.Object {
  /** Describes the inputs to the flatten instruction. */
  var inputs: js.UndefOr[js.Array[InstructionInput]] = js.undefined
}

object FlattenInstruction {
  @scala.inline
  def apply(inputs: js.Array[InstructionInput] = null): FlattenInstruction = {
    val __obj = js.Dynamic.literal()
    if (inputs != null) __obj.updateDynamic("inputs")(inputs)
    __obj.asInstanceOf[FlattenInstruction]
  }
}

