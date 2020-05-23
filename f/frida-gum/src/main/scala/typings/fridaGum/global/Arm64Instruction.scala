package typings.fridaGum.global

import typings.fridaGum.Arm64Operand
import typings.fridaGum.Arm64Register
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Arm64Instruction")
@js.native
class Arm64Instruction ()
  extends typings.fridaGum.Arm64Instruction {
  /**
    * Address (EIP) of this instruction.
    */
  /* CompleteClass */
  override var address: typings.fridaGum.NativePointer = js.native
  /**
    * Group names that this instruction belongs to.
    */
  /* CompleteClass */
  override var groups: js.Array[String] = js.native
  /**
    * Instruction mnemonic.
    */
  /* CompleteClass */
  override var mnemonic: String = js.native
  /**
    * Pointer to the next instruction, so you can `parse()` it.
    */
  /* CompleteClass */
  override var next: typings.fridaGum.NativePointer = js.native
  /**
    * String representation of instruction operands.
    */
  /* CompleteClass */
  override var opStr: String = js.native
  /**
    * Array of objects describing each operand.
    */
  /* CompleteClass */
  override var operands: js.Array[Arm64Operand] = js.native
  /**
    * Registers implicitly read by this instruction.
    */
  /* CompleteClass */
  override var regsRead: js.Array[Arm64Register] = js.native
  /**
    * Registers implicitly written to by this instruction.
    */
  /* CompleteClass */
  override var regsWritten: js.Array[Arm64Register] = js.native
  /**
    * Size of this instruction.
    */
  /* CompleteClass */
  override var size: Double = js.native
}

