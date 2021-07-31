package typings.fridaGum.global

import typings.fridaGum.MipsOperand
import typings.fridaGum.MipsRegister
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("MipsInstruction")
@js.native
class MipsInstruction ()
  extends StObject
     with typings.fridaGum.MipsInstruction {
  
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
  var operands: js.Array[MipsOperand] = js.native
  
  /**
    * Registers implicitly read by this instruction.
    */
  /* CompleteClass */
  var regsRead: js.Array[MipsRegister] = js.native
  
  /**
    * Registers implicitly written to by this instruction.
    */
  /* CompleteClass */
  var regsWritten: js.Array[MipsRegister] = js.native
  
  /**
    * Size of this instruction.
    */
  /* CompleteClass */
  var size: Double = js.native
}
