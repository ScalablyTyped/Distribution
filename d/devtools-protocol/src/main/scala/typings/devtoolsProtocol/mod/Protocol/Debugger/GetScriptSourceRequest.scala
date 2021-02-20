package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.mod.Protocol.Runtime.ScriptId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetScriptSourceRequest extends StObject {
  
  /**
    * Id of the script to get source for.
    */
  var scriptId: ScriptId = js.native
}
object GetScriptSourceRequest {
  
  @scala.inline
  def apply(scriptId: ScriptId): GetScriptSourceRequest = {
    val __obj = js.Dynamic.literal(scriptId = scriptId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScriptSourceRequest]
  }
  
  @scala.inline
  implicit class GetScriptSourceRequestMutableBuilder[Self <: GetScriptSourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScriptId(value: ScriptId): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
  }
}
