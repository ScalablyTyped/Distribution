package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsGeoCentroidAggregation
  extends StObject
     with AggregationsMetricAggregationBase {
  
  var count: js.UndefOr[long] = js.undefined
  
  var location: js.UndefOr[GeoLocation] = js.undefined
}
object AggregationsGeoCentroidAggregation {
  
  inline def apply(): AggregationsGeoCentroidAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsGeoCentroidAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsGeoCentroidAggregation] (val x: Self) extends AnyVal {
    
    inline def setCount(value: long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setLocation(value: GeoLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setLocationVarargs(value: double*): Self = StObject.set(x, "location", js.Array(value*))
  }
}
