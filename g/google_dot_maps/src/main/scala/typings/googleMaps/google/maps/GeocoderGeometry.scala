package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeocoderGeometry extends StObject {
  
  /**
    * The precise bounds of this <code>GeocoderResult</code>, if applicable
    */
  var bounds: js.UndefOr[LatLngBounds] = js.undefined
  
  /**
    * The latitude/longitude coordinates of this result
    */
  var location: LatLng
  
  /**
    * The type of location returned in <code>location</code>
    */
  var location_type: GeocoderLocationType
  
  /**
    * The bounds of the recommended viewport for displaying this
    * <code>GeocoderResult</code>
    */
  var viewport: LatLngBounds
}
object GeocoderGeometry {
  
  inline def apply(location: LatLng, location_type: GeocoderLocationType, viewport: LatLngBounds): GeocoderGeometry = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], location_type = location_type.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocoderGeometry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeocoderGeometry] (val x: Self) extends AnyVal {
    
    inline def setBounds(value: LatLngBounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    inline def setLocation(value: LatLng): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocation_type(value: GeocoderLocationType): Self = StObject.set(x, "location_type", value.asInstanceOf[js.Any])
    
    inline def setViewport(value: LatLngBounds): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
  }
}
