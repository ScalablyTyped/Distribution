package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LatLngLiteral
  extends StObject
     with _LatLng {
  
  var lat: Double
  
  var lng: Double
}
object LatLngLiteral {
  
  @scala.inline
  def apply(lat: Double, lng: Double): LatLngLiteral = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
    __obj.asInstanceOf[LatLngLiteral]
  }
  
  @scala.inline
  implicit class LatLngLiteralMutableBuilder[Self <: LatLngLiteral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLng(value: Double): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
  }
}
