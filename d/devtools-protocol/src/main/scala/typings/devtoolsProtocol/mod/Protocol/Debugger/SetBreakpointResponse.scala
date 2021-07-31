package typings.devtoolsProtocol.mod.Protocol.Debugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetBreakpointResponse extends StObject {
  
  /**
    * Location this breakpoint resolved into.
    */
  var actualLocation: Location
  
  /**
    * Id of the created breakpoint for further reference.
    */
  var breakpointId: BreakpointId
}
object SetBreakpointResponse {
  
  @scala.inline
  def apply(actualLocation: Location, breakpointId: BreakpointId): SetBreakpointResponse = {
    val __obj = js.Dynamic.literal(actualLocation = actualLocation.asInstanceOf[js.Any], breakpointId = breakpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetBreakpointResponse]
  }
  
  @scala.inline
  implicit class SetBreakpointResponseMutableBuilder[Self <: SetBreakpointResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActualLocation(value: Location): Self = StObject.set(x, "actualLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakpointId(value: BreakpointId): Self = StObject.set(x, "breakpointId", value.asInstanceOf[js.Any])
  }
}
