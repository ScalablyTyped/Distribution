package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListActiveBreakpointsResponse extends StObject {
  
  /**
    * List of all active breakpoints. The fields `id` and `location` are guaranteed to be set on each breakpoint.
    */
  var breakpoints: js.UndefOr[js.Array[SchemaBreakpoint]] = js.undefined
  
  /**
    * A token that can be used in the next method call to block until the list of breakpoints changes.
    */
  var nextWaitToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If set to `true`, indicates that there is no change to the list of active breakpoints and the server-selected timeout has expired. The `breakpoints` field would be empty and should be ignored.
    */
  var waitExpired: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaListActiveBreakpointsResponse {
  
  inline def apply(): SchemaListActiveBreakpointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListActiveBreakpointsResponse]
  }
  
  extension [Self <: SchemaListActiveBreakpointsResponse](x: Self) {
    
    inline def setBreakpoints(value: js.Array[SchemaBreakpoint]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
    
    inline def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
    
    inline def setBreakpointsVarargs(value: SchemaBreakpoint*): Self = StObject.set(x, "breakpoints", js.Array(value*))
    
    inline def setNextWaitToken(value: String): Self = StObject.set(x, "nextWaitToken", value.asInstanceOf[js.Any])
    
    inline def setNextWaitTokenNull: Self = StObject.set(x, "nextWaitToken", null)
    
    inline def setNextWaitTokenUndefined: Self = StObject.set(x, "nextWaitToken", js.undefined)
    
    inline def setWaitExpired(value: Boolean): Self = StObject.set(x, "waitExpired", value.asInstanceOf[js.Any])
    
    inline def setWaitExpiredNull: Self = StObject.set(x, "waitExpired", null)
    
    inline def setWaitExpiredUndefined: Self = StObject.set(x, "waitExpired", js.undefined)
  }
}
