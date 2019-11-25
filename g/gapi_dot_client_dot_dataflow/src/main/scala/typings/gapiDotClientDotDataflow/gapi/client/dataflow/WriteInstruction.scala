package typings.gapiDotClientDotDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteInstruction extends js.Object {
  /** The input. */
  var input: js.UndefOr[InstructionInput] = js.undefined
  /** The sink to write to. */
  var sink: js.UndefOr[Sink] = js.undefined
}

object WriteInstruction {
  @scala.inline
  def apply(input: InstructionInput = null, sink: Sink = null): WriteInstruction = {
    val __obj = js.Dynamic.literal()
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (sink != null) __obj.updateDynamic("sink")(sink.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteInstruction]
  }
}

