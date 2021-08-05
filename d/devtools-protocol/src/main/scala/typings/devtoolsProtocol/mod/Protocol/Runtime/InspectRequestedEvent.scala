package typings.devtoolsProtocol.mod.Protocol.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InspectRequestedEvent extends StObject {
  
  var hints: js.Any
  
  var `object`: RemoteObject
}
object InspectRequestedEvent {
  
  inline def apply(hints: js.Any, `object`: RemoteObject): InspectRequestedEvent = {
    val __obj = js.Dynamic.literal(hints = hints.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectRequestedEvent]
  }
  
  extension [Self <: InspectRequestedEvent](x: Self) {
    
    inline def setHints(value: js.Any): Self = StObject.set(x, "hints", value.asInstanceOf[js.Any])
    
    inline def setObject(value: RemoteObject): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
