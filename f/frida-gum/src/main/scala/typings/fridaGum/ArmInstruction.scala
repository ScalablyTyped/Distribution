package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArmInstruction
  extends StObject
     with Instruction {
  
  /**
    * Array of objects describing each operand.
    */
  var operands: js.Array[ArmOperand]
  
  /**
    * Registers implicitly read by this instruction.
    */
  var regsRead: js.Array[ArmRegister]
  
  /**
    * Registers implicitly written to by this instruction.
    */
  var regsWritten: js.Array[ArmRegister]
}
object ArmInstruction {
  
  inline def apply(
    address: NativePointer,
    groups: js.Array[String],
    mnemonic: String,
    next: NativePointer,
    opStr: String,
    operands: js.Array[ArmOperand],
    regsRead: js.Array[ArmRegister],
    regsWritten: js.Array[ArmRegister],
    size: Double
  ): ArmInstruction = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], mnemonic = mnemonic.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], opStr = opStr.asInstanceOf[js.Any], operands = operands.asInstanceOf[js.Any], regsRead = regsRead.asInstanceOf[js.Any], regsWritten = regsWritten.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmInstruction]
  }
  
  extension [Self <: ArmInstruction](x: Self) {
    
    inline def setOperands(value: js.Array[ArmOperand]): Self = StObject.set(x, "operands", value.asInstanceOf[js.Any])
    
    inline def setOperandsVarargs(value: ArmOperand*): Self = StObject.set(x, "operands", js.Array(value :_*))
    
    inline def setRegsRead(value: js.Array[ArmRegister]): Self = StObject.set(x, "regsRead", value.asInstanceOf[js.Any])
    
    inline def setRegsReadVarargs(value: ArmRegister*): Self = StObject.set(x, "regsRead", js.Array(value :_*))
    
    inline def setRegsWritten(value: js.Array[ArmRegister]): Self = StObject.set(x, "regsWritten", value.asInstanceOf[js.Any])
    
    inline def setRegsWrittenVarargs(value: ArmRegister*): Self = StObject.set(x, "regsWritten", js.Array(value :_*))
  }
}
