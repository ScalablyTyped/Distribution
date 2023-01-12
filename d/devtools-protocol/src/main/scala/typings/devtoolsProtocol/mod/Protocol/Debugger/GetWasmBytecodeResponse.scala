package typings.devtoolsProtocol.mod.Protocol.Debugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWasmBytecodeResponse extends StObject {
  
  /**
    * Script source. (Encoded as a base64 string when passed over JSON)
    */
  var bytecode: String
}
object GetWasmBytecodeResponse {
  
  inline def apply(bytecode: String): GetWasmBytecodeResponse = {
    val __obj = js.Dynamic.literal(bytecode = bytecode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWasmBytecodeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetWasmBytecodeResponse] (val x: Self) extends AnyVal {
    
    inline def setBytecode(value: String): Self = StObject.set(x, "bytecode", value.asInstanceOf[js.Any])
  }
}
