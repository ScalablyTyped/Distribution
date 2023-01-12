package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslIntervalsAnyOf extends StObject {
  
  var filter: js.UndefOr[QueryDslIntervalsFilter] = js.undefined
  
  var intervals: js.Array[QueryDslIntervalsContainer]
}
object QueryDslIntervalsAnyOf {
  
  inline def apply(intervals: js.Array[QueryDslIntervalsContainer]): QueryDslIntervalsAnyOf = {
    val __obj = js.Dynamic.literal(intervals = intervals.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslIntervalsAnyOf]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryDslIntervalsAnyOf] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: QueryDslIntervalsFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setIntervals(value: js.Array[QueryDslIntervalsContainer]): Self = StObject.set(x, "intervals", value.asInstanceOf[js.Any])
    
    inline def setIntervalsVarargs(value: QueryDslIntervalsContainer*): Self = StObject.set(x, "intervals", js.Array(value*))
  }
}
