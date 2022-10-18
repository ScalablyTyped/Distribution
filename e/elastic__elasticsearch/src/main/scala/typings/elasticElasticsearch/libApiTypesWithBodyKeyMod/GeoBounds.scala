package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CoordsGeoBounds
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TopLeftBottomRightGeoBounds
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TopRightBottomLeftGeoBounds
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WktGeoBounds
*/
trait GeoBounds extends StObject
object GeoBounds {
  
  inline def CoordsGeoBounds(bottom: double, left: double, right: double, top: double): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CoordsGeoBounds = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CoordsGeoBounds]
  }
  
  inline def TopLeftBottomRightGeoBounds(bottom_right: GeoLocation, top_left: GeoLocation): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TopLeftBottomRightGeoBounds = {
    val __obj = js.Dynamic.literal(bottom_right = bottom_right.asInstanceOf[js.Any], top_left = top_left.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TopLeftBottomRightGeoBounds]
  }
  
  inline def TopRightBottomLeftGeoBounds(bottom_left: GeoLocation, top_right: GeoLocation): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TopRightBottomLeftGeoBounds = {
    val __obj = js.Dynamic.literal(bottom_left = bottom_left.asInstanceOf[js.Any], top_right = top_right.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TopRightBottomLeftGeoBounds]
  }
  
  inline def WktGeoBounds(wkt: String): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WktGeoBounds = {
    val __obj = js.Dynamic.literal(wkt = wkt.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WktGeoBounds]
  }
}
