package typings.googleMaps.google.maps

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeocodingLibrary extends StObject {
  
  var Geocoder: Instantiable0[typings.googleMaps.google.maps.Geocoder]
  
  var GeocoderLocationType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.GeocoderLocationType */ Any
  
  var GeocoderStatus: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.GeocoderStatus */ Any
}
object GeocodingLibrary {
  
  inline def apply(
    Geocoder: Instantiable0[Geocoder],
    GeocoderLocationType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.GeocoderLocationType */ Any,
    GeocoderStatus: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.GeocoderStatus */ Any
  ): GeocodingLibrary = {
    val __obj = js.Dynamic.literal(Geocoder = Geocoder.asInstanceOf[js.Any], GeocoderLocationType = GeocoderLocationType.asInstanceOf[js.Any], GeocoderStatus = GeocoderStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocodingLibrary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeocodingLibrary] (val x: Self) extends AnyVal {
    
    inline def setGeocoder(value: Instantiable0[Geocoder]): Self = StObject.set(x, "Geocoder", value.asInstanceOf[js.Any])
    
    inline def setGeocoderLocationType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.GeocoderLocationType */ Any
    ): Self = StObject.set(x, "GeocoderLocationType", value.asInstanceOf[js.Any])
    
    inline def setGeocoderStatus(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.GeocoderStatus */ Any
    ): Self = StObject.set(x, "GeocoderStatus", value.asInstanceOf[js.Any])
  }
}
