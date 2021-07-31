package typings.gaeaModel.FitGaea

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MouseHoverComponentEvent extends StObject {
  
  var mapUniqueKey: String
  
  var `type`: String
}
object MouseHoverComponentEvent {
  
  @scala.inline
  def apply(mapUniqueKey: String, `type`: String): MouseHoverComponentEvent = {
    val __obj = js.Dynamic.literal(mapUniqueKey = mapUniqueKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseHoverComponentEvent]
  }
  
  @scala.inline
  implicit class MouseHoverComponentEventMutableBuilder[Self <: MouseHoverComponentEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMapUniqueKey(value: String): Self = StObject.set(x, "mapUniqueKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
