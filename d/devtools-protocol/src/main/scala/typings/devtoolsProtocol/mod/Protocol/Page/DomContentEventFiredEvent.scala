package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.mod.Protocol.Network.MonotonicTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomContentEventFiredEvent extends StObject {
  
  var timestamp: MonotonicTime
}
object DomContentEventFiredEvent {
  
  inline def apply(timestamp: MonotonicTime): DomContentEventFiredEvent = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomContentEventFiredEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DomContentEventFiredEvent] (val x: Self) extends AnyVal {
    
    inline def setTimestamp(value: MonotonicTime): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
