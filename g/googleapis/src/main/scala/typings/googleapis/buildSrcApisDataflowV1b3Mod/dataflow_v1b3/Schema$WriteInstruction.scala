package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instruction that writes records. Takes one input, produces no outputs.
  */
@js.native
trait Schema$WriteInstruction extends js.Object {
  /**
    * The input.
    */
  var input: js.UndefOr[Schema$InstructionInput] = js.native
  /**
    * The sink to write to.
    */
  var sink: js.UndefOr[Schema$Sink] = js.native
}

object Schema$WriteInstruction {
  @scala.inline
  def apply(input: Schema$InstructionInput = null, sink: Schema$Sink = null): Schema$WriteInstruction = {
    val __obj = js.Dynamic.literal()
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (sink != null) __obj.updateDynamic("sink")(sink.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$WriteInstruction]
  }
}

