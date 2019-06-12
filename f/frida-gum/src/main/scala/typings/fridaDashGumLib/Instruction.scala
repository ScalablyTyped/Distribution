package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Instruction")
@js.native
class Instruction () extends js.Object {
  /**
    * Address (EIP) of this instruction.
    */
  var address: NativePointer = js.native
  /**
    * Group names that this instruction belongs to.
    */
  var groups: js.Array[java.lang.String] = js.native
  /**
    * Instruction mnemonic.
    */
  var mnemonic: java.lang.String = js.native
  /**
    * Pointer to the next instruction, so you can `parse()` it.
    */
  var next: NativePointer = js.native
  /**
    * String representation of instruction operands.
    */
  var opStr: java.lang.String = js.native
  /**
    * Size of this instruction.
    */
  var size: scala.Double = js.native
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
  def parse(target: fridaDashGumLib.NativePointerValue): fridaDashGumLib.Instruction | fridaDashGumLib.X86Instruction | fridaDashGumLib.ArmInstruction | fridaDashGumLib.Arm64Instruction | fridaDashGumLib.MipsInstruction = js.native
}

