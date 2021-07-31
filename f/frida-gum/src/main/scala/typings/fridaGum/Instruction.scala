package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Instruction extends StObject {
  
  /**
    * Address (EIP) of this instruction.
    */
  var address: NativePointer
  
  /**
    * Group names that this instruction belongs to.
    */
  var groups: js.Array[String]
  
  /**
    * Instruction mnemonic.
    */
  var mnemonic: String
  
  /**
    * Pointer to the next instruction, so you can `parse()` it.
    */
  var next: NativePointer
  
  /**
    * String representation of instruction operands.
    */
  var opStr: String
  
  /**
    * Size of this instruction.
    */
  var size: Double
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
  implicit class InstructionMutableBuilder[Self <: Instruction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: NativePointer): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
    @scala.inline
    def setMnemonic(value: String): Self = StObject.set(x, "mnemonic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: NativePointer): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpStr(value: String): Self = StObject.set(x, "opStr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
