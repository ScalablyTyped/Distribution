package typings.devtoolsProtocol.mod.Protocol.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InspectRequestedEvent extends StObject {
  
  var hints: js.Any = js.native
  
  var `object`: RemoteObject = js.native
}
object InspectRequestedEvent {
  
  @scala.inline
  def apply(hints: js.Any, `object`: RemoteObject): InspectRequestedEvent = {
    val __obj = js.Dynamic.literal(hints = hints.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectRequestedEvent]
  }
  
  @scala.inline
  implicit class InspectRequestedEventMutableBuilder[Self <: InspectRequestedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHints(value: js.Any): Self = StObject.set(x, "hints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: RemoteObject): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
