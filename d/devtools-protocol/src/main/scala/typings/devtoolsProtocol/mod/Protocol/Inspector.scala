package typings.devtoolsProtocol.mod.Protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Inspector {
  
  trait DetachedEvent extends StObject {
    
    /**
      * The reason why connection has been terminated.
      */
    var reason: String
  }
  object DetachedEvent {
    
    inline def apply(reason: String): DetachedEvent = {
      val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[DetachedEvent]
    }
    
    extension [Self <: DetachedEvent](x: Self) {
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    }
  }
}
