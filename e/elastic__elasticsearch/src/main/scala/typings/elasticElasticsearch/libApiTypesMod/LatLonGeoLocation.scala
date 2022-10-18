package typings.elasticElasticsearch.libApiTypesMod

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
  
  extension [Self <: LatLonGeoLocation](x: Self) {
    
    inline def setLat(value: double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
    
    inline def setLon(value: double): Self = StObject.set(x, "lon", value.asInstanceOf[js.Any])
  }
}
