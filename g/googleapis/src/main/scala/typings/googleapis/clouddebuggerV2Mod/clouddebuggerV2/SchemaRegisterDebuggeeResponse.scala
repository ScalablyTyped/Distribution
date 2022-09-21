package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRegisterDebuggeeResponse extends StObject {
  
  /**
    * A unique ID generated for the agent. Each RegisterDebuggee request will generate a new agent ID.
    */
  var agentId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Debuggee resource. The field `id` is guaranteed to be set (in addition to the echoed fields). If the field `is_disabled` is set to `true`, the agent should disable itself by removing all breakpoints and detaching from the application. It should however continue to poll `RegisterDebuggee` until reenabled.
    */
  var debuggee: js.UndefOr[SchemaDebuggee] = js.undefined
}
object SchemaRegisterDebuggeeResponse {
  
  inline def apply(): SchemaRegisterDebuggeeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegisterDebuggeeResponse]
  }
  
  extension [Self <: SchemaRegisterDebuggeeResponse](x: Self) {
    
    inline def setAgentId(value: String): Self = StObject.set(x, "agentId", value.asInstanceOf[js.Any])
    
    inline def setAgentIdNull: Self = StObject.set(x, "agentId", null)
    
    inline def setAgentIdUndefined: Self = StObject.set(x, "agentId", js.undefined)
    
    inline def setDebuggee(value: SchemaDebuggee): Self = StObject.set(x, "debuggee", value.asInstanceOf[js.Any])
    
    inline def setDebuggeeUndefined: Self = StObject.set(x, "debuggee", js.undefined)
  }
}
