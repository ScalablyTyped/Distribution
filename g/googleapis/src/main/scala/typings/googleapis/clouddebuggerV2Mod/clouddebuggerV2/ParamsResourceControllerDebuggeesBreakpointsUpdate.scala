package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceControllerDebuggeesBreakpointsUpdate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Identifies the debuggee being debugged.
    */
  var debuggeeId: js.UndefOr[String] = js.undefined
  
  /**
    * Breakpoint identifier, unique in the scope of the debuggee.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaUpdateActiveBreakpointRequest] = js.undefined
}
object ParamsResourceControllerDebuggeesBreakpointsUpdate {
  
  inline def apply(): ParamsResourceControllerDebuggeesBreakpointsUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceControllerDebuggeesBreakpointsUpdate]
  }
  
  extension [Self <: ParamsResourceControllerDebuggeesBreakpointsUpdate](x: Self) {
    
    inline def setDebuggeeId(value: String): Self = StObject.set(x, "debuggeeId", value.asInstanceOf[js.Any])
    
    inline def setDebuggeeIdUndefined: Self = StObject.set(x, "debuggeeId", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setRequestBody(value: SchemaUpdateActiveBreakpointRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
