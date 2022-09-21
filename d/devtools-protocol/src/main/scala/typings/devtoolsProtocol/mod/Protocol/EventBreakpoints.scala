package typings.devtoolsProtocol.mod.Protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EventBreakpoints {
  
  trait RemoveInstrumentationBreakpointRequest extends StObject {
    
    /**
      * Instrumentation name to stop on.
      */
    var eventName: String
  }
  object RemoveInstrumentationBreakpointRequest {
    
    inline def apply(eventName: String): RemoveInstrumentationBreakpointRequest = {
      val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveInstrumentationBreakpointRequest]
    }
    
    extension [Self <: RemoveInstrumentationBreakpointRequest](x: Self) {
      
      inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    }
  }
  
  trait SetInstrumentationBreakpointRequest extends StObject {
    
    /**
      * Instrumentation name to stop on.
      */
    var eventName: String
  }
  object SetInstrumentationBreakpointRequest {
    
    inline def apply(eventName: String): SetInstrumentationBreakpointRequest = {
      val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetInstrumentationBreakpointRequest]
    }
    
    extension [Self <: SetInstrumentationBreakpointRequest](x: Self) {
      
      inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    }
  }
}
