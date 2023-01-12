package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.mapping
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisMappingCharFilter
  extends StObject
     with AnalysisCharFilterBase
     with AnalysisCharFilterDefinition {
  
  var mappings: js.UndefOr[js.Array[String]] = js.undefined
  
  var mappings_path: js.UndefOr[String] = js.undefined
  
  var `type`: mapping
}
object AnalysisMappingCharFilter {
  
  inline def apply(): AnalysisMappingCharFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("mapping")
    __obj.asInstanceOf[AnalysisMappingCharFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisMappingCharFilter] (val x: Self) extends AnyVal {
    
    inline def setMappings(value: js.Array[String]): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
    
    inline def setMappingsUndefined: Self = StObject.set(x, "mappings", js.undefined)
    
    inline def setMappingsVarargs(value: String*): Self = StObject.set(x, "mappings", js.Array(value*))
    
    inline def setMappings_path(value: String): Self = StObject.set(x, "mappings_path", value.asInstanceOf[js.Any])
    
    inline def setMappings_pathUndefined: Self = StObject.set(x, "mappings_path", js.undefined)
    
    inline def setType(value: mapping): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
