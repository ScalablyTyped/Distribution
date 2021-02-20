package typings.googleMapReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClickEventValue
  extends Point
     with Coords {
  
  var event: js.Any = js.native
}
object ClickEventValue {
  
  @scala.inline
  def apply(event: js.Any, lat: Double, lng: Double, x: Double, y: Double): ClickEventValue = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickEventValue]
  }
  
  @scala.inline
  implicit class ClickEventValueMutableBuilder[Self <: ClickEventValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
