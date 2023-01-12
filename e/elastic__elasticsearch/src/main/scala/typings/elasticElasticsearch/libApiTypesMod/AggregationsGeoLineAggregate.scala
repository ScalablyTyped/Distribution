package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsGeoLineAggregate
  extends StObject
     with AggregationsAggregateBase
     with _AggregationsAggregate {
  
  var geometry: GeoLine
  
  var properties: Any
  
  var `type`: String
}
object AggregationsGeoLineAggregate {
  
  inline def apply(geometry: GeoLine, properties: Any, `type`: String): AggregationsGeoLineAggregate = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsGeoLineAggregate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsGeoLineAggregate] (val x: Self) extends AnyVal {
    
    inline def setGeometry(value: GeoLine): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
