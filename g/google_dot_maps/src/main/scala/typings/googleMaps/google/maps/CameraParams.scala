package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CameraParams
  extends StObject
     with CameraOptions {
  
  @JSName("center")
  var center_CameraParams: LatLng
  
  @JSName("heading")
  var heading_CameraParams: Double
  
  @JSName("tilt")
  var tilt_CameraParams: Double
  
  @JSName("zoom")
  var zoom_CameraParams: Double
}
object CameraParams {
  
  inline def apply(center: LatLng, heading: Double, tilt: Double, zoom: Double): CameraParams = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], tilt = tilt.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CameraParams] (val x: Self) extends AnyVal {
    
    inline def setCenter(value: LatLng): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setTilt(value: Double): Self = StObject.set(x, "tilt", value.asInstanceOf[js.Any])
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
