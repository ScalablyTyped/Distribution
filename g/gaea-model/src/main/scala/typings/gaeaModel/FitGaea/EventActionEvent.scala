package typings.gaeaModel.FitGaea

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventActionEvent extends StObject {
  
  var emit: js.UndefOr[String] = js.undefined
}
object EventActionEvent {
  
  inline def apply(): EventActionEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventActionEvent]
  }
  
  extension [Self <: EventActionEvent](x: Self) {
    
    inline def setEmit(value: String): Self = StObject.set(x, "emit", value.asInstanceOf[js.Any])
    
    inline def setEmitUndefined: Self = StObject.set(x, "emit", js.undefined)
  }
}
