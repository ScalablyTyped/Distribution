package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.search_as_you_type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingSearchAsYouTypeProperty
  extends StObject
     with MappingCorePropertyBase
     with MappingProperty {
  
  var analyzer: js.UndefOr[String] = js.undefined
  
  var index: js.UndefOr[Boolean] = js.undefined
  
  var index_options: js.UndefOr[MappingIndexOptions] = js.undefined
  
  var max_shingle_size: js.UndefOr[integer] = js.undefined
  
  var norms: js.UndefOr[Boolean] = js.undefined
  
  var search_analyzer: js.UndefOr[String] = js.undefined
  
  var search_quote_analyzer: js.UndefOr[String] = js.undefined
  
  var term_vector: js.UndefOr[MappingTermVectorOption] = js.undefined
  
  var `type`: search_as_you_type
}
object MappingSearchAsYouTypeProperty {
  
  inline def apply(): MappingSearchAsYouTypeProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("search_as_you_type")
    __obj.asInstanceOf[MappingSearchAsYouTypeProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MappingSearchAsYouTypeProperty] (val x: Self) extends AnyVal {
    
    inline def setAnalyzer(value: String): Self = StObject.set(x, "analyzer", value.asInstanceOf[js.Any])
    
    inline def setAnalyzerUndefined: Self = StObject.set(x, "analyzer", js.undefined)
    
    inline def setIndex(value: Boolean): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIndex_options(value: MappingIndexOptions): Self = StObject.set(x, "index_options", value.asInstanceOf[js.Any])
    
    inline def setIndex_optionsUndefined: Self = StObject.set(x, "index_options", js.undefined)
    
    inline def setMax_shingle_size(value: integer): Self = StObject.set(x, "max_shingle_size", value.asInstanceOf[js.Any])
    
    inline def setMax_shingle_sizeUndefined: Self = StObject.set(x, "max_shingle_size", js.undefined)
    
    inline def setNorms(value: Boolean): Self = StObject.set(x, "norms", value.asInstanceOf[js.Any])
    
    inline def setNormsUndefined: Self = StObject.set(x, "norms", js.undefined)
    
    inline def setSearch_analyzer(value: String): Self = StObject.set(x, "search_analyzer", value.asInstanceOf[js.Any])
    
    inline def setSearch_analyzerUndefined: Self = StObject.set(x, "search_analyzer", js.undefined)
    
    inline def setSearch_quote_analyzer(value: String): Self = StObject.set(x, "search_quote_analyzer", value.asInstanceOf[js.Any])
    
    inline def setSearch_quote_analyzerUndefined: Self = StObject.set(x, "search_quote_analyzer", js.undefined)
    
    inline def setTerm_vector(value: MappingTermVectorOption): Self = StObject.set(x, "term_vector", value.asInstanceOf[js.Any])
    
    inline def setTerm_vectorUndefined: Self = StObject.set(x, "term_vector", js.undefined)
    
    inline def setType(value: search_as_you_type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
