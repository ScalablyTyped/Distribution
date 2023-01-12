package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.mod.Protocol.Runtime.ScriptId
import typings.devtoolsProtocol.mod.Protocol.Runtime.UniqueDebuggerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdScriptId extends StObject {
  
  /**
    * Id of adScriptId's debugger.
    */
  var debuggerId: UniqueDebuggerId
  
  /**
    * Script Id of the bottom-most script which caused the frame to be labelled
    * as an ad.
    */
  var scriptId: ScriptId
}
object AdScriptId {
  
  inline def apply(debuggerId: UniqueDebuggerId, scriptId: ScriptId): AdScriptId = {
    val __obj = js.Dynamic.literal(debuggerId = debuggerId.asInstanceOf[js.Any], scriptId = scriptId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdScriptId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdScriptId] (val x: Self) extends AnyVal {
    
    inline def setDebuggerId(value: UniqueDebuggerId): Self = StObject.set(x, "debuggerId", value.asInstanceOf[js.Any])
    
    inline def setScriptId(value: ScriptId): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
  }
}
