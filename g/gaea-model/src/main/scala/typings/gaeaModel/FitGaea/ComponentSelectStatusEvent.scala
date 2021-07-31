package typings.gaeaModel.FitGaea

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentSelectStatusEvent extends StObject {
  
  var mapUniqueKey: String
  
  var selected: Boolean
}
object ComponentSelectStatusEvent {
  
  @scala.inline
  def apply(mapUniqueKey: String, selected: Boolean): ComponentSelectStatusEvent = {
    val __obj = js.Dynamic.literal(mapUniqueKey = mapUniqueKey.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentSelectStatusEvent]
  }
  
  @scala.inline
  implicit class ComponentSelectStatusEventMutableBuilder[Self <: ComponentSelectStatusEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMapUniqueKey(value: String): Self = StObject.set(x, "mapUniqueKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
  }
}
