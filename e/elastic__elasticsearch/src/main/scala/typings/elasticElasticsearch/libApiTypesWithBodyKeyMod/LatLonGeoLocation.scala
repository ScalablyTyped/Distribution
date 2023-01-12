package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LatLonGeoLocation
  extends StObject
     with _GeoLocation {
  
  var lat: double
  
  var lon: double
}
object LatLonGeoLocation {
  
  inline def apply(lat: double, lon: double): LatLonGeoLocation = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
    __obj.asInstanceOf[LatLonGeoLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LatLonGeoLocation] (val x: Self) extends AnyVal {
    
    inline def setLat(value: double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
    
    inline def setLon(value: double): Self = StObject.set(x, "lon", value.asInstanceOf[js.Any])
  }
}
