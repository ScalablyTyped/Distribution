package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MipsInstruction")
@js.native
class MipsInstruction () extends Instruction {
  /**
    * Array of objects describing each operand.
    */
  var operands: js.Array[MipsOperand] = js.native
  /**
    * Registers implicitly read by this instruction.
    */
  var regsRead: js.Array[MipsRegister] = js.native
  /**
    * Registers implicitly written to by this instruction.
    */
  var regsWritten: js.Array[MipsRegister] = js.native
}

