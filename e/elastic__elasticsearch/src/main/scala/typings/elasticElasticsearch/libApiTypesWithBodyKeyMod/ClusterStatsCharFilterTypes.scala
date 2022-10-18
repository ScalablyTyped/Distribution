package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterStatsCharFilterTypes extends StObject {
  
  var analyzer_types: js.Array[ClusterStatsFieldTypes]
  
  var built_in_analyzers: js.Array[ClusterStatsFieldTypes]
  
  var built_in_char_filters: js.Array[ClusterStatsFieldTypes]
  
  var built_in_filters: js.Array[ClusterStatsFieldTypes]
  
  var built_in_tokenizers: js.Array[ClusterStatsFieldTypes]
  
  var char_filter_types: js.Array[ClusterStatsFieldTypes]
  
  var filter_types: js.Array[ClusterStatsFieldTypes]
  
  var tokenizer_types: js.Array[ClusterStatsFieldTypes]
}
object ClusterStatsCharFilterTypes {
  
  inline def apply(
    analyzer_types: js.Array[ClusterStatsFieldTypes],
    built_in_analyzers: js.Array[ClusterStatsFieldTypes],
    built_in_char_filters: js.Array[ClusterStatsFieldTypes],
    built_in_filters: js.Array[ClusterStatsFieldTypes],
    built_in_tokenizers: js.Array[ClusterStatsFieldTypes],
    char_filter_types: js.Array[ClusterStatsFieldTypes],
    filter_types: js.Array[ClusterStatsFieldTypes],
    tokenizer_types: js.Array[ClusterStatsFieldTypes]
  ): ClusterStatsCharFilterTypes = {
    val __obj = js.Dynamic.literal(analyzer_types = analyzer_types.asInstanceOf[js.Any], built_in_analyzers = built_in_analyzers.asInstanceOf[js.Any], built_in_char_filters = built_in_char_filters.asInstanceOf[js.Any], built_in_filters = built_in_filters.asInstanceOf[js.Any], built_in_tokenizers = built_in_tokenizers.asInstanceOf[js.Any], char_filter_types = char_filter_types.asInstanceOf[js.Any], filter_types = filter_types.asInstanceOf[js.Any], tokenizer_types = tokenizer_types.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterStatsCharFilterTypes]
  }
  
  extension [Self <: ClusterStatsCharFilterTypes](x: Self) {
    
    inline def setAnalyzer_types(value: js.Array[ClusterStatsFieldTypes]): Self = StObject.set(x, "analyzer_types", value.asInstanceOf[js.Any])
    
    inline def setAnalyzer_typesVarargs(value: ClusterStatsFieldTypes*): Self = StObject.set(x, "analyzer_types", js.Array(value*))
    
    inline def setBuilt_in_analyzers(value: js.Array[ClusterStatsFieldTypes]): Self = StObject.set(x, "built_in_analyzers", value.asInstanceOf[js.Any])
    
    inline def setBuilt_in_analyzersVarargs(value: ClusterStatsFieldTypes*): Self = StObject.set(x, "built_in_analyzers", js.Array(value*))
    
    inline def setBuilt_in_char_filters(value: js.Array[ClusterStatsFieldTypes]): Self = StObject.set(x, "built_in_char_filters", value.asInstanceOf[js.Any])
    
    inline def setBuilt_in_char_filtersVarargs(value: ClusterStatsFieldTypes*): Self = StObject.set(x, "built_in_char_filters", js.Array(value*))
    
    inline def setBuilt_in_filters(value: js.Array[ClusterStatsFieldTypes]): Self = StObject.set(x, "built_in_filters", value.asInstanceOf[js.Any])
    
    inline def setBuilt_in_filtersVarargs(value: ClusterStatsFieldTypes*): Self = StObject.set(x, "built_in_filters", js.Array(value*))
    
    inline def setBuilt_in_tokenizers(value: js.Array[ClusterStatsFieldTypes]): Self = StObject.set(x, "built_in_tokenizers", value.asInstanceOf[js.Any])
    
    inline def setBuilt_in_tokenizersVarargs(value: ClusterStatsFieldTypes*): Self = StObject.set(x, "built_in_tokenizers", js.Array(value*))
    
    inline def setChar_filter_types(value: js.Array[ClusterStatsFieldTypes]): Self = StObject.set(x, "char_filter_types", value.asInstanceOf[js.Any])
    
    inline def setChar_filter_typesVarargs(value: ClusterStatsFieldTypes*): Self = StObject.set(x, "char_filter_types", js.Array(value*))
    
    inline def setFilter_types(value: js.Array[ClusterStatsFieldTypes]): Self = StObject.set(x, "filter_types", value.asInstanceOf[js.Any])
    
    inline def setFilter_typesVarargs(value: ClusterStatsFieldTypes*): Self = StObject.set(x, "filter_types", js.Array(value*))
    
    inline def setTokenizer_types(value: js.Array[ClusterStatsFieldTypes]): Self = StObject.set(x, "tokenizer_types", value.asInstanceOf[js.Any])
    
    inline def setTokenizer_typesVarargs(value: ClusterStatsFieldTypes*): Self = StObject.set(x, "tokenizer_types", js.Array(value*))
  }
}
