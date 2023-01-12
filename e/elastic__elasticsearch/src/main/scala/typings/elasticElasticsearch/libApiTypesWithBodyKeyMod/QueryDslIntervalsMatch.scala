package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslIntervalsMatch extends StObject {
  
  var analyzer: js.UndefOr[String] = js.undefined
  
  var filter: js.UndefOr[QueryDslIntervalsFilter] = js.undefined
  
  var max_gaps: js.UndefOr[integer] = js.undefined
  
  var ordered: js.UndefOr[Boolean] = js.undefined
  
  var query: String
  
  var use_field: js.UndefOr[Field] = js.undefined
}
object QueryDslIntervalsMatch {
  
  inline def apply(query: String): QueryDslIntervalsMatch = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslIntervalsMatch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryDslIntervalsMatch] (val x: Self) extends AnyVal {
    
    inline def setAnalyzer(value: String): Self = StObject.set(x, "analyzer", value.asInstanceOf[js.Any])
    
    inline def setAnalyzerUndefined: Self = StObject.set(x, "analyzer", js.undefined)
    
    inline def setFilter(value: QueryDslIntervalsFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setMax_gaps(value: integer): Self = StObject.set(x, "max_gaps", value.asInstanceOf[js.Any])
    
    inline def setMax_gapsUndefined: Self = StObject.set(x, "max_gaps", js.undefined)
    
    inline def setOrdered(value: Boolean): Self = StObject.set(x, "ordered", value.asInstanceOf[js.Any])
    
    inline def setOrderedUndefined: Self = StObject.set(x, "ordered", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setUse_field(value: Field): Self = StObject.set(x, "use_field", value.asInstanceOf[js.Any])
    
    inline def setUse_fieldUndefined: Self = StObject.set(x, "use_field", js.undefined)
  }
}
