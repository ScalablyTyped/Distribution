package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsGeoCentroidAggregate
  extends StObject
     with AggregationsAggregateBase
     with _AggregationsAggregate {
  
  var count: long
  
  var location: js.UndefOr[GeoLocation] = js.undefined
}
object AggregationsGeoCentroidAggregate {
  
  inline def apply(count: long): AggregationsGeoCentroidAggregate = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsGeoCentroidAggregate]
  }
  
  extension [Self <: AggregationsGeoCentroidAggregate](x: Self) {
    
    inline def setCount(value: long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: GeoLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setLocationVarargs(value: double*): Self = StObject.set(x, "location", js.Array(value*))
  }
}
