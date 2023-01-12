package typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.mod.Protocol.EventBreakpoints.RemoveInstrumentationBreakpointRequest
import typings.devtoolsProtocol.mod.Protocol.EventBreakpoints.SetInstrumentationBreakpointRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventBreakpointsApi extends StObject {
  
  /**
    * Removes breakpoint on particular native event.
    */
  def removeInstrumentationBreakpoint(params: RemoveInstrumentationBreakpointRequest): js.Promise[Unit]
  
  /**
    * Sets breakpoint on particular native event.
    */
  def setInstrumentationBreakpoint(params: SetInstrumentationBreakpointRequest): js.Promise[Unit]
}
object EventBreakpointsApi {
  
  inline def apply(
    removeInstrumentationBreakpoint: RemoveInstrumentationBreakpointRequest => js.Promise[Unit],
    setInstrumentationBreakpoint: SetInstrumentationBreakpointRequest => js.Promise[Unit]
  ): EventBreakpointsApi = {
    val __obj = js.Dynamic.literal(removeInstrumentationBreakpoint = js.Any.fromFunction1(removeInstrumentationBreakpoint), setInstrumentationBreakpoint = js.Any.fromFunction1(setInstrumentationBreakpoint))
    __obj.asInstanceOf[EventBreakpointsApi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventBreakpointsApi] (val x: Self) extends AnyVal {
    
    inline def setRemoveInstrumentationBreakpoint(value: RemoveInstrumentationBreakpointRequest => js.Promise[Unit]): Self = StObject.set(x, "removeInstrumentationBreakpoint", js.Any.fromFunction1(value))
    
    inline def setSetInstrumentationBreakpoint(value: SetInstrumentationBreakpointRequest => js.Promise[Unit]): Self = StObject.set(x, "setInstrumentationBreakpoint", js.Any.fromFunction1(value))
  }
}
