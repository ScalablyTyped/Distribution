package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait X86Instruction extends Instruction {
  
  /**
    * Array of objects describing each operand.
    */
  var operands: js.Array[X86Operand] = js.native
  
  /**
    * Registers implicitly read by this instruction.
    */
  var regsRead: js.Array[X86Register] = js.native
  
  /**
    * Registers implicitly written to by this instruction.
    */
  var regsWritten: js.Array[X86Register] = js.native
}
object X86Instruction {
  
  @scala.inline
  def apply(
    address: NativePointer,
    groups: js.Array[String],
    mnemonic: String,
    next: NativePointer,
    opStr: String,
    operands: js.Array[X86Operand],
    regsRead: js.Array[X86Register],
    regsWritten: js.Array[X86Register],
    size: Double
  ): X86Instruction = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], mnemonic = mnemonic.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], opStr = opStr.asInstanceOf[js.Any], operands = operands.asInstanceOf[js.Any], regsRead = regsRead.asInstanceOf[js.Any], regsWritten = regsWritten.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[X86Instruction]
  }
  
  @scala.inline
  implicit class X86InstructionOps[Self <: X86Instruction] (val x: Self) extends AnyVal {
    
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
    def setOperandsVarargs(value: X86Operand*): Self = this.set("operands", js.Array(value :_*))
    
    @scala.inline
    def setOperands(value: js.Array[X86Operand]): Self = this.set("operands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegsReadVarargs(value: X86Register*): Self = this.set("regsRead", js.Array(value :_*))
    
    @scala.inline
    def setRegsRead(value: js.Array[X86Register]): Self = this.set("regsRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegsWrittenVarargs(value: X86Register*): Self = this.set("regsWritten", js.Array(value :_*))
    
    @scala.inline
    def setRegsWritten(value: js.Array[X86Register]): Self = this.set("regsWritten", value.asInstanceOf[js.Any])
  }
}
