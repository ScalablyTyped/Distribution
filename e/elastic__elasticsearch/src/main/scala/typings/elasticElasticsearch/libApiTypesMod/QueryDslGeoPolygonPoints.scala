package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslGeoPolygonPoints extends StObject {
  
  var points: js.Array[GeoLocation]
}
object QueryDslGeoPolygonPoints {
  
  inline def apply(points: js.Array[GeoLocation]): QueryDslGeoPolygonPoints = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslGeoPolygonPoints]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryDslGeoPolygonPoints] (val x: Self) extends AnyVal {
    
    inline def setPoints(value: js.Array[GeoLocation]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: GeoLocation*): Self = StObject.set(x, "points", js.Array(value*))
  }
}
