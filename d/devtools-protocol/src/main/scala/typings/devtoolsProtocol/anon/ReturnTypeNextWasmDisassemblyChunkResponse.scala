package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Debugger.NextWasmDisassemblyChunkRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.NextWasmDisassemblyChunkResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeNextWasmDisassemblyChunkResponse extends StObject {
  
  var paramsType: js.Array[NextWasmDisassemblyChunkRequest]
  
  var returnType: NextWasmDisassemblyChunkResponse
}
object ReturnTypeNextWasmDisassemblyChunkResponse {
  
  inline def apply(
    paramsType: js.Array[NextWasmDisassemblyChunkRequest],
    returnType: NextWasmDisassemblyChunkResponse
  ): ReturnTypeNextWasmDisassemblyChunkResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeNextWasmDisassemblyChunkResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnTypeNextWasmDisassemblyChunkResponse] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[NextWasmDisassemblyChunkRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: NextWasmDisassemblyChunkRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: NextWasmDisassemblyChunkResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
