package typings.fridaGum.global

import typings.fridaGum.ArmOperand
import typings.fridaGum.ArmRegister
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ArmInstruction")
@js.native
class ArmInstruction ()
  extends StObject
     with typings.fridaGum.ArmInstruction {
  
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
    * Array of objects describing each operand.
    */
  /* CompleteClass */
  var operands: js.Array[ArmOperand] = js.native
  
  /**
    * Registers implicitly read by this instruction.
    */
  /* CompleteClass */
  var regsRead: js.Array[ArmRegister] = js.native
  
  /**
    * Registers implicitly written to by this instruction.
    */
  /* CompleteClass */
  var regsWritten: js.Array[ArmRegister] = js.native
  
  /**
    * Size of this instruction.
    */
  /* CompleteClass */
  var size: Double = js.native
}
