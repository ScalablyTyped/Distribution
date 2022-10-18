package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.multiplexer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisMultiplexerTokenFilter
  extends StObject
     with AnalysisTokenFilterBase
     with AnalysisTokenFilterDefinition {
  
  var filters: js.Array[String]
  
  var preserve_original: js.UndefOr[Boolean] = js.undefined
  
  var `type`: multiplexer
}
object AnalysisMultiplexerTokenFilter {
  
  inline def apply(filters: js.Array[String]): AnalysisMultiplexerTokenFilter = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("multiplexer")
    __obj.asInstanceOf[AnalysisMultiplexerTokenFilter]
  }
  
  extension [Self <: AnalysisMultiplexerTokenFilter](x: Self) {
    
    inline def setFilters(value: js.Array[String]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersVarargs(value: String*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setPreserve_original(value: Boolean): Self = StObject.set(x, "preserve_original", value.asInstanceOf[js.Any])
    
    inline def setPreserve_originalUndefined: Self = StObject.set(x, "preserve_original", js.undefined)
    
    inline def setType(value: multiplexer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
