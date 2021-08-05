package typings.devtoolsProtocol.mod.Protocol.Debugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BreakpointResolvedEvent extends StObject {
  
  /**
    * Breakpoint unique identifier.
    */
  var breakpointId: BreakpointId
  
  /**
    * Actual breakpoint location.
    */
  var location: Location
}
object BreakpointResolvedEvent {
  
  inline def apply(breakpointId: BreakpointId, location: Location): BreakpointResolvedEvent = {
    val __obj = js.Dynamic.literal(breakpointId = breakpointId.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreakpointResolvedEvent]
  }
  
  extension [Self <: BreakpointResolvedEvent](x: Self) {
    
    inline def setBreakpointId(value: BreakpointId): Self = StObject.set(x, "breakpointId", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
  }
}
