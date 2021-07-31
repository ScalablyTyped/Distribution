package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.mod.Protocol.Network.MonotonicTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomContentEventFiredEvent extends StObject {
  
  var timestamp: MonotonicTime
}
object DomContentEventFiredEvent {
  
  @scala.inline
  def apply(timestamp: MonotonicTime): DomContentEventFiredEvent = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomContentEventFiredEvent]
  }
  
  @scala.inline
  implicit class DomContentEventFiredEventMutableBuilder[Self <: DomContentEventFiredEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimestamp(value: MonotonicTime): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
