package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.mod.Protocol.Runtime.ScriptId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassembleWasmModuleRequest extends StObject {
  
  /**
    * Id of the script to disassemble
    */
  var scriptId: ScriptId
}
object DisassembleWasmModuleRequest {
  
  inline def apply(scriptId: ScriptId): DisassembleWasmModuleRequest = {
    val __obj = js.Dynamic.literal(scriptId = scriptId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassembleWasmModuleRequest]
  }
  
  extension [Self <: DisassembleWasmModuleRequest](x: Self) {
    
    inline def setScriptId(value: ScriptId): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
  }
}
