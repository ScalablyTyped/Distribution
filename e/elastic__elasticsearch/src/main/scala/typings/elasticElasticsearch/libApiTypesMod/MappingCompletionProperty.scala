package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.completion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingCompletionProperty
  extends StObject
     with MappingDocValuesPropertyBase
     with MappingProperty {
  
  var analyzer: js.UndefOr[String] = js.undefined
  
  var contexts: js.UndefOr[js.Array[MappingSuggestContext]] = js.undefined
  
  var max_input_length: js.UndefOr[integer] = js.undefined
  
  var preserve_position_increments: js.UndefOr[Boolean] = js.undefined
  
  var preserve_separators: js.UndefOr[Boolean] = js.undefined
  
  var search_analyzer: js.UndefOr[String] = js.undefined
  
  var `type`: completion
}
object MappingCompletionProperty {
  
  inline def apply(): MappingCompletionProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("completion")
    __obj.asInstanceOf[MappingCompletionProperty]
  }
  
  extension [Self <: MappingCompletionProperty](x: Self) {
    
    inline def setAnalyzer(value: String): Self = StObject.set(x, "analyzer", value.asInstanceOf[js.Any])
    
    inline def setAnalyzerUndefined: Self = StObject.set(x, "analyzer", js.undefined)
    
    inline def setContexts(value: js.Array[MappingSuggestContext]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
    
    inline def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
    
    inline def setContextsVarargs(value: MappingSuggestContext*): Self = StObject.set(x, "contexts", js.Array(value*))
    
    inline def setMax_input_length(value: integer): Self = StObject.set(x, "max_input_length", value.asInstanceOf[js.Any])
    
    inline def setMax_input_lengthUndefined: Self = StObject.set(x, "max_input_length", js.undefined)
    
    inline def setPreserve_position_increments(value: Boolean): Self = StObject.set(x, "preserve_position_increments", value.asInstanceOf[js.Any])
    
    inline def setPreserve_position_incrementsUndefined: Self = StObject.set(x, "preserve_position_increments", js.undefined)
    
    inline def setPreserve_separators(value: Boolean): Self = StObject.set(x, "preserve_separators", value.asInstanceOf[js.Any])
    
    inline def setPreserve_separatorsUndefined: Self = StObject.set(x, "preserve_separators", js.undefined)
    
    inline def setSearch_analyzer(value: String): Self = StObject.set(x, "search_analyzer", value.asInstanceOf[js.Any])
    
    inline def setSearch_analyzerUndefined: Self = StObject.set(x, "search_analyzer", js.undefined)
    
    inline def setType(value: completion): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
