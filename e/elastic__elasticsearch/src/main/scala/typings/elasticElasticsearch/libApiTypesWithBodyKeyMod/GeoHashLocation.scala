package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoHashLocation
  extends StObject
     with _GeoLocation {
  
  var geohash: GeoHash
}
object GeoHashLocation {
  
  inline def apply(geohash: GeoHash): GeoHashLocation = {
    val __obj = js.Dynamic.literal(geohash = geohash.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoHashLocation]
  }
  
  extension [Self <: GeoHashLocation](x: Self) {
    
    inline def setGeohash(value: GeoHash): Self = StObject.set(x, "geohash", value.asInstanceOf[js.Any])
  }
}
