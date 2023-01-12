package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchAggregationProfile extends StObject {
  
  var breakdown: SearchAggregationBreakdown
  
  var children: js.UndefOr[js.Array[SearchAggregationProfile]] = js.undefined
  
  var debug: js.UndefOr[SearchAggregationProfileDebug] = js.undefined
  
  var description: String
  
  var time_in_nanos: DurationValue[UnitNanos]
  
  var `type`: String
}
object SearchAggregationProfile {
  
  inline def apply(
    breakdown: SearchAggregationBreakdown,
    description: String,
    time_in_nanos: DurationValue[UnitNanos],
    `type`: String
  ): SearchAggregationProfile = {
    val __obj = js.Dynamic.literal(breakdown = breakdown.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], time_in_nanos = time_in_nanos.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchAggregationProfile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchAggregationProfile] (val x: Self) extends AnyVal {
    
    inline def setBreakdown(value: SearchAggregationBreakdown): Self = StObject.set(x, "breakdown", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: js.Array[SearchAggregationProfile]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: SearchAggregationProfile*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setDebug(value: SearchAggregationProfileDebug): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setTime_in_nanos(value: DurationValue[UnitNanos]): Self = StObject.set(x, "time_in_nanos", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
