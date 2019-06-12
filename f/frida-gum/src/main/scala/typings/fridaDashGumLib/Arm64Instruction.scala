package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Arm64Instruction")
@js.native
class Arm64Instruction () extends Instruction {
  /**
    * Array of objects describing each operand.
    */
  var operands: js.Array[Arm64Operand] = js.native
  /**
    * Registers implicitly read by this instruction.
    */
  var regsRead: js.Array[Arm64Register] = js.native
  /**
    * Registers implicitly written to by this instruction.
    */
  var regsWritten: js.Array[Arm64Register] = js.native
}

