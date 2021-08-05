package typings.devtoolsProtocol.mod.Protocol.Debugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWasmBytecodeResponse extends StObject {
  
  /**
    * Script source.
    */
  var bytecode: String
}
object GetWasmBytecodeResponse {
  
  inline def apply(bytecode: String): GetWasmBytecodeResponse = {
    val __obj = js.Dynamic.literal(bytecode = bytecode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWasmBytecodeResponse]
  }
  
  extension [Self <: GetWasmBytecodeResponse](x: Self) {
    
    inline def setBytecode(value: String): Self = StObject.set(x, "bytecode", value.asInstanceOf[js.Any])
  }
}
