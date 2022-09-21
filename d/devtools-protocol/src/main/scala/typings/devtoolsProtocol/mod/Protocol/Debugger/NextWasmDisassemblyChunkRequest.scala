package typings.devtoolsProtocol.mod.Protocol.Debugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NextWasmDisassemblyChunkRequest extends StObject {
  
  var streamId: String
}
object NextWasmDisassemblyChunkRequest {
  
  inline def apply(streamId: String): NextWasmDisassemblyChunkRequest = {
    val __obj = js.Dynamic.literal(streamId = streamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextWasmDisassemblyChunkRequest]
  }
  
  extension [Self <: NextWasmDisassemblyChunkRequest](x: Self) {
    
    inline def setStreamId(value: String): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
  }
}
