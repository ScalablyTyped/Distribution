package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchQueryProfile extends StObject {
  
  var breakdown: SearchQueryBreakdown
  
  var children: js.UndefOr[js.Array[SearchQueryProfile]] = js.undefined
  
  var description: String
  
  var time_in_nanos: DurationValue[UnitNanos]
  
  var `type`: String
}
object SearchQueryProfile {
  
  inline def apply(
    breakdown: SearchQueryBreakdown,
    description: String,
    time_in_nanos: DurationValue[UnitNanos],
    `type`: String
  ): SearchQueryProfile = {
    val __obj = js.Dynamic.literal(breakdown = breakdown.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], time_in_nanos = time_in_nanos.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchQueryProfile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchQueryProfile] (val x: Self) extends AnyVal {
    
    inline def setBreakdown(value: SearchQueryBreakdown): Self = StObject.set(x, "breakdown", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: js.Array[SearchQueryProfile]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: SearchQueryProfile*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setTime_in_nanos(value: DurationValue[UnitNanos]): Self = StObject.set(x, "time_in_nanos", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
