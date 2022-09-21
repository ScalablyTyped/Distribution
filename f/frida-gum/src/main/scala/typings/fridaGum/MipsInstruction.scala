package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MipsInstruction
  extends StObject
     with Instruction {
  
  /**
    * Array of objects describing each operand.
    */
  var operands: js.Array[MipsOperand]
  
  /**
    * Registers accessed by this instruction, either implicitly or explicitly.
    */
  var regsAccessed: RegsAccessed[MipsRegister]
  
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
  
  inline def apply(
    address: NativePointer,
    groups: js.Array[String],
    mnemonic: String,
    next: NativePointer,
    opStr: String,
    operands: js.Array[MipsOperand],
    regsAccessed: RegsAccessed[MipsRegister],
    regsRead: js.Array[MipsRegister],
    regsWritten: js.Array[MipsRegister],
    size: Double
  ): MipsInstruction = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], mnemonic = mnemonic.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], opStr = opStr.asInstanceOf[js.Any], operands = operands.asInstanceOf[js.Any], regsAccessed = regsAccessed.asInstanceOf[js.Any], regsRead = regsRead.asInstanceOf[js.Any], regsWritten = regsWritten.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[MipsInstruction]
  }
  
  extension [Self <: MipsInstruction](x: Self) {
    
    inline def setOperands(value: js.Array[MipsOperand]): Self = StObject.set(x, "operands", value.asInstanceOf[js.Any])
    
    inline def setOperandsVarargs(value: MipsOperand*): Self = StObject.set(x, "operands", js.Array(value*))
    
    inline def setRegsAccessed(value: RegsAccessed[MipsRegister]): Self = StObject.set(x, "regsAccessed", value.asInstanceOf[js.Any])
    
    inline def setRegsRead(value: js.Array[MipsRegister]): Self = StObject.set(x, "regsRead", value.asInstanceOf[js.Any])
    
    inline def setRegsReadVarargs(value: MipsRegister*): Self = StObject.set(x, "regsRead", js.Array(value*))
    
    inline def setRegsWritten(value: js.Array[MipsRegister]): Self = StObject.set(x, "regsWritten", value.asInstanceOf[js.Any])
    
    inline def setRegsWrittenVarargs(value: MipsRegister*): Self = StObject.set(x, "regsWritten", js.Array(value*))
  }
}
