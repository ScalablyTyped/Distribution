package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslIntervalsFilter extends StObject {
  
  var after: js.UndefOr[QueryDslIntervalsContainer] = js.undefined
  
  var before: js.UndefOr[QueryDslIntervalsContainer] = js.undefined
  
  var contained_by: js.UndefOr[QueryDslIntervalsContainer] = js.undefined
  
  var containing: js.UndefOr[QueryDslIntervalsContainer] = js.undefined
  
  var not_contained_by: js.UndefOr[QueryDslIntervalsContainer] = js.undefined
  
  var not_containing: js.UndefOr[QueryDslIntervalsContainer] = js.undefined
  
  var not_overlapping: js.UndefOr[QueryDslIntervalsContainer] = js.undefined
  
  var overlapping: js.UndefOr[QueryDslIntervalsContainer] = js.undefined
  
  var script: js.UndefOr[Script] = js.undefined
}
object QueryDslIntervalsFilter {
  
  inline def apply(): QueryDslIntervalsFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryDslIntervalsFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryDslIntervalsFilter] (val x: Self) extends AnyVal {
    
    inline def setAfter(value: QueryDslIntervalsContainer): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    inline def setBefore(value: QueryDslIntervalsContainer): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    inline def setContained_by(value: QueryDslIntervalsContainer): Self = StObject.set(x, "contained_by", value.asInstanceOf[js.Any])
    
    inline def setContained_byUndefined: Self = StObject.set(x, "contained_by", js.undefined)
    
    inline def setContaining(value: QueryDslIntervalsContainer): Self = StObject.set(x, "containing", value.asInstanceOf[js.Any])
    
    inline def setContainingUndefined: Self = StObject.set(x, "containing", js.undefined)
    
    inline def setNot_contained_by(value: QueryDslIntervalsContainer): Self = StObject.set(x, "not_contained_by", value.asInstanceOf[js.Any])
    
    inline def setNot_contained_byUndefined: Self = StObject.set(x, "not_contained_by", js.undefined)
    
    inline def setNot_containing(value: QueryDslIntervalsContainer): Self = StObject.set(x, "not_containing", value.asInstanceOf[js.Any])
    
    inline def setNot_containingUndefined: Self = StObject.set(x, "not_containing", js.undefined)
    
    inline def setNot_overlapping(value: QueryDslIntervalsContainer): Self = StObject.set(x, "not_overlapping", value.asInstanceOf[js.Any])
    
    inline def setNot_overlappingUndefined: Self = StObject.set(x, "not_overlapping", js.undefined)
    
    inline def setOverlapping(value: QueryDslIntervalsContainer): Self = StObject.set(x, "overlapping", value.asInstanceOf[js.Any])
    
    inline def setOverlappingUndefined: Self = StObject.set(x, "overlapping", js.undefined)
    
    inline def setScript(value: Script): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
  }
}
