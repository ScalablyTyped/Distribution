package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchFetchProfile extends StObject {
  
  var breakdown: SearchFetchProfileBreakdown
  
  var children: js.UndefOr[js.Array[SearchFetchProfile]] = js.undefined
  
  var debug: js.UndefOr[SearchFetchProfileDebug] = js.undefined
  
  var description: String
  
  var time_in_nanos: DurationValue[UnitNanos]
  
  var `type`: String
}
object SearchFetchProfile {
  
  inline def apply(
    breakdown: SearchFetchProfileBreakdown,
    description: String,
    time_in_nanos: DurationValue[UnitNanos],
    `type`: String
  ): SearchFetchProfile = {
    val __obj = js.Dynamic.literal(breakdown = breakdown.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], time_in_nanos = time_in_nanos.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchFetchProfile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchFetchProfile] (val x: Self) extends AnyVal {
    
    inline def setBreakdown(value: SearchFetchProfileBreakdown): Self = StObject.set(x, "breakdown", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: js.Array[SearchFetchProfile]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: SearchFetchProfile*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setDebug(value: SearchFetchProfileDebug): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setTime_in_nanos(value: DurationValue[UnitNanos]): Self = StObject.set(x, "time_in_nanos", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
