package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MipsInstruction extends Instruction {
  /**
    * Array of objects describing each operand.
    */
  var operands: js.Array[MipsOperand]
  /**
    * Registers implicitly read by this instruction.
    */
  var regsRead: js.Array[MipsRegister]
  /**
    * Registers implicitly written to by this instruction.
    */
  var regsWritten: js.Array[MipsRegister]
}

object MipsInstruction {
  @scala.inline
  def apply(
    address: NativePointer,
    groups: js.Array[String],
    mnemonic: String,
    next: NativePointer,
    opStr: String,
    operands: js.Array[MipsOperand],
    regsRead: js.Array[MipsRegister],
    regsWritten: js.Array[MipsRegister],
    size: Double
  ): MipsInstruction = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], mnemonic = mnemonic.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], opStr = opStr.asInstanceOf[js.Any], operands = operands.asInstanceOf[js.Any], regsRead = regsRead.asInstanceOf[js.Any], regsWritten = regsWritten.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[MipsInstruction]
  }
}

