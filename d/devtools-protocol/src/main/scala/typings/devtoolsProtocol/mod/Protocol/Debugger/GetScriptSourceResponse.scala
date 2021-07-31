package typings.devtoolsProtocol.mod.Protocol.Debugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetScriptSourceResponse extends StObject {
  
  /**
    * Wasm bytecode.
    */
  var bytecode: js.UndefOr[String] = js.undefined
  
  /**
    * Script source (empty in case of Wasm bytecode).
    */
  var scriptSource: String
}
object GetScriptSourceResponse {
  
  @scala.inline
  def apply(scriptSource: String): GetScriptSourceResponse = {
    val __obj = js.Dynamic.literal(scriptSource = scriptSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScriptSourceResponse]
  }
  
  @scala.inline
  implicit class GetScriptSourceResponseMutableBuilder[Self <: GetScriptSourceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytecode(value: String): Self = StObject.set(x, "bytecode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytecodeUndefined: Self = StObject.set(x, "bytecode", js.undefined)
    
    @scala.inline
    def setScriptSource(value: String): Self = StObject.set(x, "scriptSource", value.asInstanceOf[js.Any])
  }
}
