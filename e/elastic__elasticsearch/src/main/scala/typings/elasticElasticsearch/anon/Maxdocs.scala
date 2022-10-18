package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.QueryDslQueryContainer
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlicedScroll
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Maxdocs extends StObject {
  
  var max_docs: js.UndefOr[long] = js.undefined
  
  var query: js.UndefOr[QueryDslQueryContainer] = js.undefined
  
  var slice: js.UndefOr[SlicedScroll] = js.undefined
}
object Maxdocs {
  
  inline def apply(): Maxdocs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Maxdocs]
  }
  
  extension [Self <: Maxdocs](x: Self) {
    
    inline def setMax_docs(value: long): Self = StObject.set(x, "max_docs", value.asInstanceOf[js.Any])
    
    inline def setMax_docsUndefined: Self = StObject.set(x, "max_docs", js.undefined)
    
    inline def setQuery(value: QueryDslQueryContainer): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setSlice(value: SlicedScroll): Self = StObject.set(x, "slice", value.asInstanceOf[js.Any])
    
    inline def setSliceUndefined: Self = StObject.set(x, "slice", js.undefined)
  }
}
