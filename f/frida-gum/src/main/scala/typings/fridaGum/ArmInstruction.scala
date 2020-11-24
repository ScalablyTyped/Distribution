package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArmInstruction extends Instruction {
  
  /**
    * Array of objects describing each operand.
    */
  var operands: js.Array[ArmOperand] = js.native
  
  /**
    * Registers implicitly read by this instruction.
    */
  var regsRead: js.Array[ArmRegister] = js.native
  
  /**
    * Registers implicitly written to by this instruction.
    */
  var regsWritten: js.Array[ArmRegister] = js.native
}
object ArmInstruction {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ArmInstructionOps[Self <: ArmInstruction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOperandsVarargs(value: ArmOperand*): Self = this.set("operands", js.Array(value :_*))
    
    @scala.inline
    def setOperands(value: js.Array[ArmOperand]): Self = this.set("operands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegsReadVarargs(value: ArmRegister*): Self = this.set("regsRead", js.Array(value :_*))
    
    @scala.inline
    def setRegsRead(value: js.Array[ArmRegister]): Self = this.set("regsRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegsWrittenVarargs(value: ArmRegister*): Self = this.set("regsWritten", js.Array(value :_*))
    
    @scala.inline
    def setRegsWritten(value: js.Array[ArmRegister]): Self = this.set("regsWritten", value.asInstanceOf[js.Any])
  }
}
