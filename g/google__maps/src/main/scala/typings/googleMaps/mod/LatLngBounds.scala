package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LatLngBounds extends StObject {
  
  var northeast: LatLngLiteral
  
  var southwest: LatLngLiteral
}
object LatLngBounds {
  
  @scala.inline
  def apply(northeast: LatLngLiteral, southwest: LatLngLiteral): LatLngBounds = {
    val __obj = js.Dynamic.literal(northeast = northeast.asInstanceOf[js.Any], southwest = southwest.asInstanceOf[js.Any])
    __obj.asInstanceOf[LatLngBounds]
  }
  
  @scala.inline
  implicit class LatLngBoundsMutableBuilder[Self <: LatLngBounds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNortheast(value: LatLngLiteral): Self = StObject.set(x, "northeast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSouthwest(value: LatLngLiteral): Self = StObject.set(x, "southwest", value.asInstanceOf[js.Any])
  }
}
