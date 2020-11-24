package typings.fridaGum.global

import typings.fridaGum.NativePointerValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Instruction")
@js.native
class Instruction ()
  extends typings.fridaGum.Instruction
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
