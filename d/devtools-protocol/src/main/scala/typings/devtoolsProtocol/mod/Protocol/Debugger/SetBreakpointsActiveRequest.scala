package typings.devtoolsProtocol.mod.Protocol.Debugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetBreakpointsActiveRequest extends StObject {
  
  /**
    * New value for breakpoints active state.
    */
  var active: Boolean
}
object SetBreakpointsActiveRequest {
  
  inline def apply(active: Boolean): SetBreakpointsActiveRequest = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetBreakpointsActiveRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetBreakpointsActiveRequest] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
  }
}
