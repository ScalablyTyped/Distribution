package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsTestPopulation extends StObject {
  
  var field: Field
  
  var filter: js.UndefOr[QueryDslQueryContainer] = js.undefined
  
  var script: js.UndefOr[Script] = js.undefined
}
object AggregationsTestPopulation {
  
  inline def apply(field: Field): AggregationsTestPopulation = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsTestPopulation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsTestPopulation] (val x: Self) extends AnyVal {
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: QueryDslQueryContainer): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setScript(value: Script): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
  }
}
