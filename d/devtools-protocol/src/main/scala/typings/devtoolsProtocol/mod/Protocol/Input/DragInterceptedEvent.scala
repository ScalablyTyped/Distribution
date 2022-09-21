package typings.devtoolsProtocol.mod.Protocol.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragInterceptedEvent extends StObject {
  
  var data: DragData
}
object DragInterceptedEvent {
  
  inline def apply(data: DragData): DragInterceptedEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragInterceptedEvent]
  }
  
  extension [Self <: DragInterceptedEvent](x: Self) {
    
    inline def setData(value: DragData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
