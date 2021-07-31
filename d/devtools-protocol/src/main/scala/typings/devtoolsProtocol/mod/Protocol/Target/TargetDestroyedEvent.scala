package typings.devtoolsProtocol.mod.Protocol.Target

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetDestroyedEvent extends StObject {
  
  var targetId: TargetID
}
object TargetDestroyedEvent {
  
  @scala.inline
  def apply(targetId: TargetID): TargetDestroyedEvent = {
    val __obj = js.Dynamic.literal(targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetDestroyedEvent]
  }
  
  @scala.inline
  implicit class TargetDestroyedEventMutableBuilder[Self <: TargetDestroyedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetId(value: TargetID): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
  }
}
