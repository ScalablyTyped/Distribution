package typings.ethereumjsVm

import org.scalablytyped.runtime.NumberDictionary
import typings.ethereumjsCommon.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object opcodesMod {
  
  @JSImport("ethereumjs-vm/dist/evm/opcodes", "getOpcodesForHF")
  @js.native
  def getOpcodesForHF(common: default): NumberDictionary[Opcode] = js.native
  
  @js.native
  trait Opcode extends StObject {
    
    var fee: Double = js.native
    
    var isAsync: Boolean = js.native
    
    var name: String = js.native
  }
  object Opcode {
    
    @scala.inline
    def apply(fee: Double, isAsync: Boolean, name: String): Opcode = {
      val __obj = js.Dynamic.literal(fee = fee.asInstanceOf[js.Any], isAsync = isAsync.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Opcode]
    }
    
    @scala.inline
    implicit class OpcodeMutableBuilder[Self <: Opcode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFee(value: Double): Self = StObject.set(x, "fee", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAsync(value: Boolean): Self = StObject.set(x, "isAsync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type OpcodeList = NumberDictionary[Opcode]
}
