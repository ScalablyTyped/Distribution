package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingTextProperty
  extends StObject
     with MappingCorePropertyBase
     with MappingProperty {
  
  var analyzer: js.UndefOr[String] = js.undefined
  
  var boost: js.UndefOr[double] = js.undefined
  
  var eager_global_ordinals: js.UndefOr[Boolean] = js.undefined
  
  var fielddata: js.UndefOr[Boolean] = js.undefined
  
  var fielddata_frequency_filter: js.UndefOr[IndicesFielddataFrequencyFilter] = js.undefined
  
  var index: js.UndefOr[Boolean] = js.undefined
  
  var index_options: js.UndefOr[MappingIndexOptions] = js.undefined
  
  var index_phrases: js.UndefOr[Boolean] = js.undefined
  
  var index_prefixes: js.UndefOr[MappingTextIndexPrefixes] = js.undefined
  
  var norms: js.UndefOr[Boolean] = js.undefined
  
  var position_increment_gap: js.UndefOr[integer] = js.undefined
  
  var search_analyzer: js.UndefOr[String] = js.undefined
  
  var search_quote_analyzer: js.UndefOr[String] = js.undefined
  
  var term_vector: js.UndefOr[MappingTermVectorOption] = js.undefined
  
  var `type`: text
}
object MappingTextProperty {
  
  inline def apply(): MappingTextProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("text")
    __obj.asInstanceOf[MappingTextProperty]
  }
  
  extension [Self <: MappingTextProperty](x: Self) {
    
    inline def setAnalyzer(value: String): Self = StObject.set(x, "analyzer", value.asInstanceOf[js.Any])
    
    inline def setAnalyzerUndefined: Self = StObject.set(x, "analyzer", js.undefined)
    
    inline def setBoost(value: double): Self = StObject.set(x, "boost", value.asInstanceOf[js.Any])
    
    inline def setBoostUndefined: Self = StObject.set(x, "boost", js.undefined)
    
    inline def setEager_global_ordinals(value: Boolean): Self = StObject.set(x, "eager_global_ordinals", value.asInstanceOf[js.Any])
    
    inline def setEager_global_ordinalsUndefined: Self = StObject.set(x, "eager_global_ordinals", js.undefined)
    
    inline def setFielddata(value: Boolean): Self = StObject.set(x, "fielddata", value.asInstanceOf[js.Any])
    
    inline def setFielddataUndefined: Self = StObject.set(x, "fielddata", js.undefined)
    
    inline def setFielddata_frequency_filter(value: IndicesFielddataFrequencyFilter): Self = StObject.set(x, "fielddata_frequency_filter", value.asInstanceOf[js.Any])
    
    inline def setFielddata_frequency_filterUndefined: Self = StObject.set(x, "fielddata_frequency_filter", js.undefined)
    
    inline def setIndex(value: Boolean): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIndex_options(value: MappingIndexOptions): Self = StObject.set(x, "index_options", value.asInstanceOf[js.Any])
    
    inline def setIndex_optionsUndefined: Self = StObject.set(x, "index_options", js.undefined)
    
    inline def setIndex_phrases(value: Boolean): Self = StObject.set(x, "index_phrases", value.asInstanceOf[js.Any])
    
    inline def setIndex_phrasesUndefined: Self = StObject.set(x, "index_phrases", js.undefined)
    
    inline def setIndex_prefixes(value: MappingTextIndexPrefixes): Self = StObject.set(x, "index_prefixes", value.asInstanceOf[js.Any])
    
    inline def setIndex_prefixesUndefined: Self = StObject.set(x, "index_prefixes", js.undefined)
    
    inline def setNorms(value: Boolean): Self = StObject.set(x, "norms", value.asInstanceOf[js.Any])
    
    inline def setNormsUndefined: Self = StObject.set(x, "norms", js.undefined)
    
    inline def setPosition_increment_gap(value: integer): Self = StObject.set(x, "position_increment_gap", value.asInstanceOf[js.Any])
    
    inline def setPosition_increment_gapUndefined: Self = StObject.set(x, "position_increment_gap", js.undefined)
    
    inline def setSearch_analyzer(value: String): Self = StObject.set(x, "search_analyzer", value.asInstanceOf[js.Any])
    
    inline def setSearch_analyzerUndefined: Self = StObject.set(x, "search_analyzer", js.undefined)
    
    inline def setSearch_quote_analyzer(value: String): Self = StObject.set(x, "search_quote_analyzer", value.asInstanceOf[js.Any])
    
    inline def setSearch_quote_analyzerUndefined: Self = StObject.set(x, "search_quote_analyzer", js.undefined)
    
    inline def setTerm_vector(value: MappingTermVectorOption): Self = StObject.set(x, "term_vector", value.asInstanceOf[js.Any])
    
    inline def setTerm_vectorUndefined: Self = StObject.set(x, "term_vector", js.undefined)
    
    inline def setType(value: text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
