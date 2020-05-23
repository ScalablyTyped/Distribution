package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instruction extends js.Object {
  /**
    * Address (EIP) of this instruction.
    */
  var address: NativePointer
  /**
    * Group names that this instruction belongs to.
    */
  var groups: js.Array[String]
  /**
    * Instruction mnemonic.
    */
  var mnemonic: String
  /**
    * Pointer to the next instruction, so you can `parse()` it.
    */
  var next: NativePointer
  /**
    * String representation of instruction operands.
    */
  var opStr: String
  /**
    * Size of this instruction.
    */
  var size: Double
}

object Instruction {
  @scala.inline
  def apply(
    address: NativePointer,
    groups: js.Array[String],
    mnemonic: String,
    next: NativePointer,
    opStr: String,
    size: Double
  ): Instruction = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], mnemonic = mnemonic.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], opStr = opStr.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instruction]
  }
}

