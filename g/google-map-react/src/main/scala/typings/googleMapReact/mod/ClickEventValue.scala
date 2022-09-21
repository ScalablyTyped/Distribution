package typings.googleMapReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClickEventValue
  extends StObject
     with Point
     with Coords {
  
  var event: Any
}
object ClickEventValue {
  
  inline def apply(event: Any, lat: Double, lng: Double, x: Double, y: Double): ClickEventValue = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickEventValue]
  }
  
  extension [Self <: ClickEventValue](x: Self) {
    
    inline def setEvent(value: Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
