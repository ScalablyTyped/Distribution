package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ArmInstruction")
@js.native
class ArmInstruction () extends Instruction {
  /**
    * Array of objects describing each operand.
    */
  var operands: js.Array[ArmOperand] = js.native
  /**
    * Registers implicitly read by this instruction.
    */
  var regsRead: js.Array[ArmRegister] = js.native
  /**
    * Registers implicitly written to by this instruction.
    */
  var regsWritten: js.Array[ArmRegister] = js.native
}

