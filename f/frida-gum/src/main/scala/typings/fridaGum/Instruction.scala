package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instruction extends js.Object {
  
  /**
    * Address (EIP) of this instruction.
    */
  var address: NativePointer = js.native
  
  /**
    * Group names that this instruction belongs to.
    */
  var groups: js.Array[String] = js.native
  
  /**
    * Instruction mnemonic.
    */
  var mnemonic: String = js.native
  
  /**
    * Pointer to the next instruction, so you can `parse()` it.
    */
  var next: NativePointer = js.native
  
  /**
    * String representation of instruction operands.
    */
  var opStr: String = js.native
  
  /**
    * Size of this instruction.
    */
  var size: Double = js.native
}
object Instruction {
  
  @scala.inline
  def apply(
    address: NativePointer,
    groups: js.Array[String],
    mnemonic: String,
    next: NativePointer,
    opStr: String,
    size: Double
  ): Instruction = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], mnemonic = mnemonic.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], opStr = opStr.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instruction]
  }
  
  @scala.inline
  implicit class InstructionOps[Self <: Instruction] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: NativePointer): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsVarargs(value: String*): Self = this.set("groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: js.Array[String]): Self = this.set("groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMnemonic(value: String): Self = this.set("mnemonic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: NativePointer): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpStr(value: String): Self = this.set("opStr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
}
