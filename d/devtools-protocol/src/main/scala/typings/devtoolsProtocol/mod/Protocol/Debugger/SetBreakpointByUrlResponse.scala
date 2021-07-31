package typings.devtoolsProtocol.mod.Protocol.Debugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetBreakpointByUrlResponse extends StObject {
  
  /**
    * Id of the created breakpoint for further reference.
    */
  var breakpointId: BreakpointId
  
  /**
    * List of the locations this breakpoint resolved into upon addition.
    */
  var locations: js.Array[Location]
}
object SetBreakpointByUrlResponse {
  
  @scala.inline
  def apply(breakpointId: BreakpointId, locations: js.Array[Location]): SetBreakpointByUrlResponse = {
    val __obj = js.Dynamic.literal(breakpointId = breakpointId.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetBreakpointByUrlResponse]
  }
  
  @scala.inline
  implicit class SetBreakpointByUrlResponseMutableBuilder[Self <: SetBreakpointByUrlResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBreakpointId(value: BreakpointId): Self = StObject.set(x, "breakpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocations(value: js.Array[Location]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationsVarargs(value: Location*): Self = StObject.set(x, "locations", js.Array(value :_*))
  }
}
