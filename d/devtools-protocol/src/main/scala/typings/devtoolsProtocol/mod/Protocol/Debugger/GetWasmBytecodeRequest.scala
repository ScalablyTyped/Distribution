package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.mod.Protocol.Runtime.ScriptId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWasmBytecodeRequest extends StObject {
  
  /**
    * Id of the Wasm script to get source for.
    */
  var scriptId: ScriptId
}
object GetWasmBytecodeRequest {
  
  @scala.inline
  def apply(scriptId: ScriptId): GetWasmBytecodeRequest = {
    val __obj = js.Dynamic.literal(scriptId = scriptId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWasmBytecodeRequest]
  }
  
  @scala.inline
  implicit class GetWasmBytecodeRequestMutableBuilder[Self <: GetWasmBytecodeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScriptId(value: ScriptId): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
  }
}
