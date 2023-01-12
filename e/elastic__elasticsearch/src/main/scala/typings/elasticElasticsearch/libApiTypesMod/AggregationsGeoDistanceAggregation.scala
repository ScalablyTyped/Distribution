package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsGeoDistanceAggregation
  extends StObject
     with AggregationsAggregation {
  
  var distance_type: js.UndefOr[GeoDistanceType] = js.undefined
  
  var field: js.UndefOr[Field] = js.undefined
  
  var origin: js.UndefOr[GeoLocation] = js.undefined
  
  var ranges: js.UndefOr[js.Array[AggregationsAggregationRange]] = js.undefined
  
  var unit: js.UndefOr[DistanceUnit] = js.undefined
}
object AggregationsGeoDistanceAggregation {
  
  inline def apply(): AggregationsGeoDistanceAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsGeoDistanceAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsGeoDistanceAggregation] (val x: Self) extends AnyVal {
    
    inline def setDistance_type(value: GeoDistanceType): Self = StObject.set(x, "distance_type", value.asInstanceOf[js.Any])
    
    inline def setDistance_typeUndefined: Self = StObject.set(x, "distance_type", js.undefined)
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setOrigin(value: GeoLocation): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setOriginVarargs(value: double*): Self = StObject.set(x, "origin", js.Array(value*))
    
    inline def setRanges(value: js.Array[AggregationsAggregationRange]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
    
    inline def setRangesVarargs(value: AggregationsAggregationRange*): Self = StObject.set(x, "ranges", js.Array(value*))
    
    inline def setUnit(value: DistanceUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
