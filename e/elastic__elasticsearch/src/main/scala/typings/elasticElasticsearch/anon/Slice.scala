package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.QueryDslQueryContainer
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlicedScroll
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Slice extends StObject {
  
  var conflicts: js.UndefOr[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Conflicts] = js.undefined
  
  var max_docs: js.UndefOr[long] = js.undefined
  
  var query: js.UndefOr[QueryDslQueryContainer] = js.undefined
  
  var script: js.UndefOr[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Script] = js.undefined
  
  var slice: js.UndefOr[SlicedScroll] = js.undefined
}
object Slice {
  
  inline def apply(): Slice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Slice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Slice] (val x: Self) extends AnyVal {
    
    inline def setConflicts(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Conflicts): Self = StObject.set(x, "conflicts", value.asInstanceOf[js.Any])
    
    inline def setConflictsUndefined: Self = StObject.set(x, "conflicts", js.undefined)
    
    inline def setMax_docs(value: long): Self = StObject.set(x, "max_docs", value.asInstanceOf[js.Any])
    
    inline def setMax_docsUndefined: Self = StObject.set(x, "max_docs", js.undefined)
    
    inline def setQuery(value: QueryDslQueryContainer): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setScript(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Script): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
    
    inline def setSlice(value: SlicedScroll): Self = StObject.set(x, "slice", value.asInstanceOf[js.Any])
    
    inline def setSliceUndefined: Self = StObject.set(x, "slice", js.undefined)
  }
}
