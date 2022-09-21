package typings.devtoolsProtocol.mod.Protocol.Debugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NextWasmDisassemblyChunkResponse extends StObject {
  
  /**
    * The next chunk of disassembly.
    */
  var chunk: WasmDisassemblyChunk
}
object NextWasmDisassemblyChunkResponse {
  
  inline def apply(chunk: WasmDisassemblyChunk): NextWasmDisassemblyChunkResponse = {
    val __obj = js.Dynamic.literal(chunk = chunk.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextWasmDisassemblyChunkResponse]
  }
  
  extension [Self <: NextWasmDisassemblyChunkResponse](x: Self) {
    
    inline def setChunk(value: WasmDisassemblyChunk): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
  }
}
