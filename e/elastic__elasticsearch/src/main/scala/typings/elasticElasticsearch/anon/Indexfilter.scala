package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingRuntimeFields
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.QueryDslQueryContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Indexfilter extends StObject {
  
  var index_filter: js.UndefOr[QueryDslQueryContainer] = js.undefined
  
  var runtime_mappings: js.UndefOr[MappingRuntimeFields] = js.undefined
}
object Indexfilter {
  
  inline def apply(): Indexfilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Indexfilter]
  }
  
  extension [Self <: Indexfilter](x: Self) {
    
    inline def setIndex_filter(value: QueryDslQueryContainer): Self = StObject.set(x, "index_filter", value.asInstanceOf[js.Any])
    
    inline def setIndex_filterUndefined: Self = StObject.set(x, "index_filter", js.undefined)
    
    inline def setRuntime_mappings(value: MappingRuntimeFields): Self = StObject.set(x, "runtime_mappings", value.asInstanceOf[js.Any])
    
    inline def setRuntime_mappingsUndefined: Self = StObject.set(x, "runtime_mappings", js.undefined)
  }
}
