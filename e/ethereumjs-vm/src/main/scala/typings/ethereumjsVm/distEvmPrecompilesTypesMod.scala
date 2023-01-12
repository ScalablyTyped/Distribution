package typings.ethereumjsVm

import typings.bnJs.mod.^
import typings.ethereumjsCommon.mod.default
import typings.ethereumjsVm.distEvmEvmMod.ExecResult
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEvmPrecompilesTypesMod {
  
  type PrecompileFunc = js.Function1[/* opts */ PrecompileInput, ExecResult]
  
  trait PrecompileInput extends StObject {
    
    var _common: default
    
    var data: Buffer
    
    var gasLimit: ^
  }
  object PrecompileInput {
    
    inline def apply(_common: default, data: Buffer, gasLimit: ^): PrecompileInput = {
      val __obj = js.Dynamic.literal(_common = _common.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], gasLimit = gasLimit.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrecompileInput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrecompileInput] (val x: Self) extends AnyVal {
      
      inline def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setGasLimit(value: ^): Self = StObject.set(x, "gasLimit", value.asInstanceOf[js.Any])
      
      inline def set_common(value: default): Self = StObject.set(x, "_common", value.asInstanceOf[js.Any])
    }
  }
}
