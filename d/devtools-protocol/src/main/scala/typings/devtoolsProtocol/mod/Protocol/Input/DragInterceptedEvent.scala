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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DragInterceptedEvent] (val x: Self) extends AnyVal {
    
    inline def setData(value: DragData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
