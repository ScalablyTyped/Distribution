package typings.gaeaModel.FitGaea

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MouseHoverComponentEvent extends StObject {
  
  var mapUniqueKey: String
  
  var `type`: String
}
object MouseHoverComponentEvent {
  
  inline def apply(mapUniqueKey: String, `type`: String): MouseHoverComponentEvent = {
    val __obj = js.Dynamic.literal(mapUniqueKey = mapUniqueKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseHoverComponentEvent]
  }
  
  extension [Self <: MouseHoverComponentEvent](x: Self) {
    
    inline def setMapUniqueKey(value: String): Self = StObject.set(x, "mapUniqueKey", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
