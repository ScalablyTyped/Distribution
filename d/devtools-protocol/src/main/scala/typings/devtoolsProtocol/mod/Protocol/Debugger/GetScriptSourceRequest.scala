package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.mod.Protocol.Runtime.ScriptId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetScriptSourceRequest extends StObject {
  
  /**
    * Id of the script to get source for.
    */
  var scriptId: ScriptId
}
object GetScriptSourceRequest {
  
  inline def apply(scriptId: ScriptId): GetScriptSourceRequest = {
    val __obj = js.Dynamic.literal(scriptId = scriptId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScriptSourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetScriptSourceRequest] (val x: Self) extends AnyVal {
    
    inline def setScriptId(value: ScriptId): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
  }
}
