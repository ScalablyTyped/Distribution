package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LatLngLiteralVerbose
  extends StObject
     with _LatLng {
  
  var latitude: Double
  
  var longitude: Double
}
object LatLngLiteralVerbose {
  
  @scala.inline
  def apply(latitude: Double, longitude: Double): LatLngLiteralVerbose = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[LatLngLiteralVerbose]
  }
  
  @scala.inline
  implicit class LatLngLiteralVerboseMutableBuilder[Self <: LatLngLiteralVerbose] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
  }
}
