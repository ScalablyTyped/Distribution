package typings.devtoolsProtocol.mod.Protocol.Debugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetScriptSourceResponse extends StObject {
  
  /**
    * Wasm bytecode. (Encoded as a base64 string when passed over JSON)
    */
  var bytecode: js.UndefOr[String] = js.undefined
  
  /**
    * Script source (empty in case of Wasm bytecode).
    */
  var scriptSource: String
}
object GetScriptSourceResponse {
  
  inline def apply(scriptSource: String): GetScriptSourceResponse = {
    val __obj = js.Dynamic.literal(scriptSource = scriptSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScriptSourceResponse]
  }
  
  extension [Self <: GetScriptSourceResponse](x: Self) {
    
    inline def setBytecode(value: String): Self = StObject.set(x, "bytecode", value.asInstanceOf[js.Any])
    
    inline def setBytecodeUndefined: Self = StObject.set(x, "bytecode", js.undefined)
    
    inline def setScriptSource(value: String): Self = StObject.set(x, "scriptSource", value.asInstanceOf[js.Any])
  }
}
