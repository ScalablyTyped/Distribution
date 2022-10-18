package typings.ethereumjsVm

import org.scalablytyped.runtime.NumberDictionary
import typings.ethereumjsCommon.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEvmOpcodesMod {
  
  @JSImport("ethereumjs-vm/dist/evm/opcodes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getOpcodesForHF(common: default): NumberDictionary[Opcode] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOpcodesForHF")(common.asInstanceOf[js.Any]).asInstanceOf[NumberDictionary[Opcode]]
  
  trait Opcode extends StObject {
    
    var fee: Double
    
    var isAsync: Boolean
    
    var name: String
  }
  object Opcode {
    
    inline def apply(fee: Double, isAsync: Boolean, name: String): Opcode = {
      val __obj = js.Dynamic.literal(fee = fee.asInstanceOf[js.Any], isAsync = isAsync.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Opcode]
    }
    
    extension [Self <: Opcode](x: Self) {
      
      inline def setFee(value: Double): Self = StObject.set(x, "fee", value.asInstanceOf[js.Any])
      
      inline def setIsAsync(value: Boolean): Self = StObject.set(x, "isAsync", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type OpcodeList = NumberDictionary[Opcode]
}
