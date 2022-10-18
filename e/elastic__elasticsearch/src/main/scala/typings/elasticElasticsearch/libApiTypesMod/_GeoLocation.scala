package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _GeoLocation extends StObject
object _GeoLocation {
  
  inline def GeoHashLocation(geohash: GeoHash): typings.elasticElasticsearch.libApiTypesMod.GeoHashLocation = {
    val __obj = js.Dynamic.literal(geohash = geohash.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.GeoHashLocation]
  }
  
  inline def LatLonGeoLocation(lat: double, lon: double): typings.elasticElasticsearch.libApiTypesMod.LatLonGeoLocation = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.LatLonGeoLocation]
  }
}
