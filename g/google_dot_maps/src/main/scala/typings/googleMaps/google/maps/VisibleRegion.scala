package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisibleRegion extends StObject {
  
  var farLeft: LatLng
  
  var farRight: LatLng
  
  /**
    * The smallest bounding box that includes the visible region.
    */
  var latLngBounds: LatLngBounds
  
  var nearLeft: LatLng
  
  var nearRight: LatLng
}
object VisibleRegion {
  
  inline def apply(farLeft: LatLng, farRight: LatLng, latLngBounds: LatLngBounds, nearLeft: LatLng, nearRight: LatLng): VisibleRegion = {
    val __obj = js.Dynamic.literal(farLeft = farLeft.asInstanceOf[js.Any], farRight = farRight.asInstanceOf[js.Any], latLngBounds = latLngBounds.asInstanceOf[js.Any], nearLeft = nearLeft.asInstanceOf[js.Any], nearRight = nearRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisibleRegion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VisibleRegion] (val x: Self) extends AnyVal {
    
    inline def setFarLeft(value: LatLng): Self = StObject.set(x, "farLeft", value.asInstanceOf[js.Any])
    
    inline def setFarRight(value: LatLng): Self = StObject.set(x, "farRight", value.asInstanceOf[js.Any])
    
    inline def setLatLngBounds(value: LatLngBounds): Self = StObject.set(x, "latLngBounds", value.asInstanceOf[js.Any])
    
    inline def setNearLeft(value: LatLng): Self = StObject.set(x, "nearLeft", value.asInstanceOf[js.Any])
    
    inline def setNearRight(value: LatLng): Self = StObject.set(x, "nearRight", value.asInstanceOf[js.Any])
  }
}
