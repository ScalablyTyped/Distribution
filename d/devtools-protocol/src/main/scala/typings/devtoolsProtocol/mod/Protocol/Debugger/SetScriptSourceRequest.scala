package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.mod.Protocol.Runtime.ScriptId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetScriptSourceRequest extends StObject {
  
  /**
    * If true the change will not actually be applied. Dry run may be used to get result
    * description without actually modifying the code.
    */
  var dryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Id of the script to edit.
    */
  var scriptId: ScriptId
  
  /**
    * New content of the script.
    */
  var scriptSource: String
}
object SetScriptSourceRequest {
  
  @scala.inline
  def apply(scriptId: ScriptId, scriptSource: String): SetScriptSourceRequest = {
    val __obj = js.Dynamic.literal(scriptId = scriptId.asInstanceOf[js.Any], scriptSource = scriptSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetScriptSourceRequest]
  }
  
  @scala.inline
  implicit class SetScriptSourceRequestMutableBuilder[Self <: SetScriptSourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
    
    @scala.inline
    def setScriptId(value: ScriptId): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptSource(value: String): Self = StObject.set(x, "scriptSource", value.asInstanceOf[js.Any])
  }
}
