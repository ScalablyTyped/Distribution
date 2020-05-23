package typings.fridaGum.global

import typings.fridaGum.NativePointerValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Instruction")
@js.native
class Instruction ()
  extends typings.fridaGum.Instruction {
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
    * Size of this instruction.
    */
  /* CompleteClass */
  override var size: Double = js.native
}

/* static members */
@JSGlobal("Instruction")
@js.native
object Instruction extends js.Object {
  /**
    * Parses the instruction at the `target` address in memory.
    *
    * Note that on 32-bit ARM this address must have its least significant bit
    * set to 0 for ARM functions, and 1 for Thumb functions. Frida takes care
    * of this detail for you if you get the address from a Frida API, for
    * example `Module.getExportByName()`.
    *
    * @param target Memory location containing instruction to parse.
    */
  def parse(target: NativePointerValue): typings.fridaGum.Instruction | typings.fridaGum.X86Instruction | typings.fridaGum.ArmInstruction | typings.fridaGum.Arm64Instruction | typings.fridaGum.MipsInstruction = js.native
}

