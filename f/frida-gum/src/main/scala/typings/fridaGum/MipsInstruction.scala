package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MipsInstruction extends Instruction {
  
  /**
    * Array of objects describing each operand.
    */
  var operands: js.Array[MipsOperand] = js.native
  
  /**
    * Registers implicitly read by this instruction.
    */
  var regsRead: js.Array[MipsRegister] = js.native
  
  /**
    * Registers implicitly written to by this instruction.
    */
  var regsWritten: js.Array[MipsRegister] = js.native
}
object MipsInstruction {
  
  @scala.inline
  def apply(
    address: NativePointer,
    groups: js.Array[String],
    mnemonic: String,
    next: NativePointer,
    opStr: String,
    operands: js.Array[MipsOperand],
    regsRead: js.Array[MipsRegister],
    regsWritten: js.Array[MipsRegister],
    size: Double
  ): MipsInstruction = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], mnemonic = mnemonic.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], opStr = opStr.asInstanceOf[js.Any], operands = operands.asInstanceOf[js.Any], regsRead = regsRead.asInstanceOf[js.Any], regsWritten = regsWritten.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[MipsInstruction]
  }
  
  @scala.inline
  implicit class MipsInstructionMutableBuilder[Self <: MipsInstruction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperands(value: js.Array[MipsOperand]): Self = StObject.set(x, "operands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperandsVarargs(value: MipsOperand*): Self = StObject.set(x, "operands", js.Array(value :_*))
    
    @scala.inline
    def setRegsRead(value: js.Array[MipsRegister]): Self = StObject.set(x, "regsRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegsReadVarargs(value: MipsRegister*): Self = StObject.set(x, "regsRead", js.Array(value :_*))
    
    @scala.inline
    def setRegsWritten(value: js.Array[MipsRegister]): Self = StObject.set(x, "regsWritten", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegsWrittenVarargs(value: MipsRegister*): Self = StObject.set(x, "regsWritten", js.Array(value :_*))
  }
}
