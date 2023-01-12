package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arm64Instruction
  extends StObject
     with Instruction {
  
  /**
    * Array of objects describing each operand.
    */
  var operands: js.Array[Arm64Operand]
  
  /**
    * Registers accessed by this instruction, either implicitly or explicitly.
    */
  var regsAccessed: RegsAccessed[Arm64Register]
  
  /**
    * Registers implicitly read by this instruction.
    */
  var regsRead: js.Array[Arm64Register]
  
  /**
    * Registers implicitly written to by this instruction.
    */
  var regsWritten: js.Array[Arm64Register]
}
object Arm64Instruction {
  
  inline def apply(
    address: NativePointer,
    groups: js.Array[String],
    mnemonic: String,
    next: NativePointer,
    opStr: String,
    operands: js.Array[Arm64Operand],
    regsAccessed: RegsAccessed[Arm64Register],
    regsRead: js.Array[Arm64Register],
    regsWritten: js.Array[Arm64Register],
    size: Double
  ): Arm64Instruction = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], mnemonic = mnemonic.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], opStr = opStr.asInstanceOf[js.Any], operands = operands.asInstanceOf[js.Any], regsAccessed = regsAccessed.asInstanceOf[js.Any], regsRead = regsRead.asInstanceOf[js.Any], regsWritten = regsWritten.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64Instruction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Arm64Instruction] (val x: Self) extends AnyVal {
    
    inline def setOperands(value: js.Array[Arm64Operand]): Self = StObject.set(x, "operands", value.asInstanceOf[js.Any])
    
    inline def setOperandsVarargs(value: Arm64Operand*): Self = StObject.set(x, "operands", js.Array(value*))
    
    inline def setRegsAccessed(value: RegsAccessed[Arm64Register]): Self = StObject.set(x, "regsAccessed", value.asInstanceOf[js.Any])
    
    inline def setRegsRead(value: js.Array[Arm64Register]): Self = StObject.set(x, "regsRead", value.asInstanceOf[js.Any])
    
    inline def setRegsReadVarargs(value: Arm64Register*): Self = StObject.set(x, "regsRead", js.Array(value*))
    
    inline def setRegsWritten(value: js.Array[Arm64Register]): Self = StObject.set(x, "regsWritten", value.asInstanceOf[js.Any])
    
    inline def setRegsWrittenVarargs(value: Arm64Register*): Self = StObject.set(x, "regsWritten", js.Array(value*))
  }
}
