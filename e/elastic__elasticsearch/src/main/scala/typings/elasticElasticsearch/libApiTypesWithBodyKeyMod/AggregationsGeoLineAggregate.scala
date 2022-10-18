package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsGeoLineAggregate
  extends StObject
     with AggregationsAggregateBase
     with _AggregationsAggregate {
  
  var geometry: GeoLine
  
  var `type`: String
}
object AggregationsGeoLineAggregate {
  
  inline def apply(geometry: GeoLine, `type`: String): AggregationsGeoLineAggregate = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsGeoLineAggregate]
  }
  
  extension [Self <: AggregationsGeoLineAggregate](x: Self) {
    
    inline def setGeometry(value: GeoLine): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
