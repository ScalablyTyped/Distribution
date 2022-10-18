package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformSource extends StObject {
  
  var index: Indices
  
  var query: js.UndefOr[QueryDslQueryContainer] = js.undefined
  
  var runtime_mappings: js.UndefOr[MappingRuntimeFields] = js.undefined
}
object TransformSource {
  
  inline def apply(index: Indices): TransformSource = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformSource]
  }
  
  extension [Self <: TransformSource](x: Self) {
    
    inline def setIndex(value: Indices): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexVarargs(value: IndexName*): Self = StObject.set(x, "index", js.Array(value*))
    
    inline def setQuery(value: QueryDslQueryContainer): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setRuntime_mappings(value: MappingRuntimeFields): Self = StObject.set(x, "runtime_mappings", value.asInstanceOf[js.Any])
    
    inline def setRuntime_mappingsUndefined: Self = StObject.set(x, "runtime_mappings", js.undefined)
  }
}
