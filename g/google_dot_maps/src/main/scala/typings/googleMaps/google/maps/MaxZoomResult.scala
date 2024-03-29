package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxZoomResult extends StObject {
  
  /**
    * Status of the request. This property is only defined when using callbacks
    * with {@link google.maps.MaxZoomService.getMaxZoomAtLatLng} (it is not
    * defined when using Promises).
    */
  var status: Null | MaxZoomStatus
  
  /**
    * The maximum zoom level found at the given <code>LatLng</code>.
    */
  var zoom: Double
}
object MaxZoomResult {
  
  inline def apply(zoom: Double): MaxZoomResult = {
    val __obj = js.Dynamic.literal(zoom = zoom.asInstanceOf[js.Any], status = null)
    __obj.asInstanceOf[MaxZoomResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaxZoomResult] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: MaxZoomStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
