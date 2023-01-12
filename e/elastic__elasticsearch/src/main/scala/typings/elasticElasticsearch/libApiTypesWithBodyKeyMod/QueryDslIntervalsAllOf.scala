package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslIntervalsAllOf extends StObject {
  
  var filter: js.UndefOr[QueryDslIntervalsFilter] = js.undefined
  
  var intervals: js.Array[QueryDslIntervalsContainer]
  
  var max_gaps: js.UndefOr[integer] = js.undefined
  
  var ordered: js.UndefOr[Boolean] = js.undefined
}
object QueryDslIntervalsAllOf {
  
  inline def apply(intervals: js.Array[QueryDslIntervalsContainer]): QueryDslIntervalsAllOf = {
    val __obj = js.Dynamic.literal(intervals = intervals.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslIntervalsAllOf]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryDslIntervalsAllOf] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: QueryDslIntervalsFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setIntervals(value: js.Array[QueryDslIntervalsContainer]): Self = StObject.set(x, "intervals", value.asInstanceOf[js.Any])
    
    inline def setIntervalsVarargs(value: QueryDslIntervalsContainer*): Self = StObject.set(x, "intervals", js.Array(value*))
    
    inline def setMax_gaps(value: integer): Self = StObject.set(x, "max_gaps", value.asInstanceOf[js.Any])
    
    inline def setMax_gapsUndefined: Self = StObject.set(x, "max_gaps", js.undefined)
    
    inline def setOrdered(value: Boolean): Self = StObject.set(x, "ordered", value.asInstanceOf[js.Any])
    
    inline def setOrderedUndefined: Self = StObject.set(x, "ordered", js.undefined)
  }
}
