package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("X86Instruction")
@js.native
class X86Instruction () extends Instruction {
  /**
    * Array of objects describing each operand.
    */
  var operands: js.Array[X86Operand] = js.native
  /**
    * Registers implicitly read by this instruction.
    */
  var regsRead: js.Array[X86Register] = js.native
  /**
    * Registers implicitly written to by this instruction.
    */
  var regsWritten: js.Array[X86Register] = js.native
}

