package typings.devtoolsProtocol.mod.Protocol.Debugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPossibleBreakpointsResponse extends StObject {
  
  /**
    * List of the possible breakpoint locations.
    */
  var locations: js.Array[BreakLocation] = js.native
}
object GetPossibleBreakpointsResponse {
  
  @scala.inline
  def apply(locations: js.Array[BreakLocation]): GetPossibleBreakpointsResponse = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPossibleBreakpointsResponse]
  }
  
  @scala.inline
  implicit class GetPossibleBreakpointsResponseMutableBuilder[Self <: GetPossibleBreakpointsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocations(value: js.Array[BreakLocation]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationsVarargs(value: BreakLocation*): Self = StObject.set(x, "locations", js.Array(value :_*))
  }
}
