package typings.devtoolsProtocol.mod.Protocol.Debugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPossibleBreakpointsResponse extends StObject {
  
  /**
    * List of the possible breakpoint locations.
    */
  var locations: js.Array[BreakLocation]
}
object GetPossibleBreakpointsResponse {
  
  inline def apply(locations: js.Array[BreakLocation]): GetPossibleBreakpointsResponse = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPossibleBreakpointsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPossibleBreakpointsResponse] (val x: Self) extends AnyVal {
    
    inline def setLocations(value: js.Array[BreakLocation]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsVarargs(value: BreakLocation*): Self = StObject.set(x, "locations", js.Array(value*))
  }
}
