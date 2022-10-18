package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.elasticElasticsearch.libApiTypesMod.CoordsGeoBounds
  - typings.elasticElasticsearch.libApiTypesMod.TopLeftBottomRightGeoBounds
  - typings.elasticElasticsearch.libApiTypesMod.TopRightBottomLeftGeoBounds
  - typings.elasticElasticsearch.libApiTypesMod.WktGeoBounds
*/
trait GeoBounds extends StObject
object GeoBounds {
  
  inline def CoordsGeoBounds(bottom: double, left: double, right: double, top: double): typings.elasticElasticsearch.libApiTypesMod.CoordsGeoBounds = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.CoordsGeoBounds]
  }
  
  inline def TopLeftBottomRightGeoBounds(bottom_right: GeoLocation, top_left: GeoLocation): typings.elasticElasticsearch.libApiTypesMod.TopLeftBottomRightGeoBounds = {
    val __obj = js.Dynamic.literal(bottom_right = bottom_right.asInstanceOf[js.Any], top_left = top_left.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.TopLeftBottomRightGeoBounds]
  }
  
  inline def TopRightBottomLeftGeoBounds(bottom_left: GeoLocation, top_right: GeoLocation): typings.elasticElasticsearch.libApiTypesMod.TopRightBottomLeftGeoBounds = {
    val __obj = js.Dynamic.literal(bottom_left = bottom_left.asInstanceOf[js.Any], top_right = top_right.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.TopRightBottomLeftGeoBounds]
  }
  
  inline def WktGeoBounds(wkt: String): typings.elasticElasticsearch.libApiTypesMod.WktGeoBounds = {
    val __obj = js.Dynamic.literal(wkt = wkt.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.WktGeoBounds]
  }
}
