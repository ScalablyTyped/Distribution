package typings.fridaGum.global

import typings.fridaGum.NativePointerValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Instruction")
@js.native
open class Instruction ()
  extends StObject
     with typings.fridaGum.Instruction {
  
  /**
    * Address (EIP) of this instruction.
    */
  /* CompleteClass */
  var address: typings.fridaGum.NativePointer = js.native
  
  /**
    * Group names that this instruction belongs to.
    */
  /* CompleteClass */
  var groups: js.Array[String] = js.native
  
  /**
    * Instruction mnemonic.
    */
  /* CompleteClass */
  var mnemonic: String = js.native
  
  /**
    * Pointer to the next instruction, so you can `parse()` it.
    */
  /* CompleteClass */
  var next: typings.fridaGum.NativePointer = js.native
  
  /**
    * String representation of instruction operands.
    */
  /* CompleteClass */
  var opStr: String = js.native
  
  /**
    * Size of this instruction.
    */
  /* CompleteClass */
  var size: Double = js.native
}
object Instruction {
  
  @JSGlobal("Instruction")
  @js.native
  val ^ : js.Any = js.native
  
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
  /* static member */
  inline def parse(target: NativePointerValue): typings.fridaGum.Instruction | typings.fridaGum.X86Instruction | typings.fridaGum.ArmInstruction | typings.fridaGum.Arm64Instruction | typings.fridaGum.MipsInstruction = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(target.asInstanceOf[js.Any]).asInstanceOf[typings.fridaGum.Instruction | typings.fridaGum.X86Instruction | typings.fridaGum.ArmInstruction | typings.fridaGum.Arm64Instruction | typings.fridaGum.MipsInstruction]
}
