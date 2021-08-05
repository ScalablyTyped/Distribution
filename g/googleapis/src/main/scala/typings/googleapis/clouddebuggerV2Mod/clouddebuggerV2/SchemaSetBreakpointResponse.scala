package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for setting a breakpoint.
  */
trait SchemaSetBreakpointResponse extends StObject {
  
  /**
    * Breakpoint resource. The field `id` is guaranteed to be set (in addition
    * to the echoed fileds).
    */
  var breakpoint: js.UndefOr[SchemaBreakpoint] = js.undefined
}
object SchemaSetBreakpointResponse {
  
  inline def apply(): SchemaSetBreakpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSetBreakpointResponse]
  }
  
  extension [Self <: SchemaSetBreakpointResponse](x: Self) {
    
    inline def setBreakpoint(value: SchemaBreakpoint): Self = StObject.set(x, "breakpoint", value.asInstanceOf[js.Any])
    
    inline def setBreakpointUndefined: Self = StObject.set(x, "breakpoint", js.undefined)
  }
}
