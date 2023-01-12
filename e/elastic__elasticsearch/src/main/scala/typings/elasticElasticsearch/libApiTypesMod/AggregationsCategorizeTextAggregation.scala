package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsCategorizeTextAggregation
  extends StObject
     with AggregationsAggregation {
  
  var categorization_analyzer: js.UndefOr[AggregationsCategorizeTextAnalyzer] = js.undefined
  
  var categorization_filters: js.UndefOr[js.Array[String]] = js.undefined
  
  var field: Field
  
  var max_matched_tokens: js.UndefOr[integer] = js.undefined
  
  var max_unique_tokens: js.UndefOr[integer] = js.undefined
  
  var min_doc_count: js.UndefOr[integer] = js.undefined
  
  var shard_min_doc_count: js.UndefOr[integer] = js.undefined
  
  var shard_size: js.UndefOr[integer] = js.undefined
  
  var similarity_threshold: js.UndefOr[integer] = js.undefined
  
  var size: js.UndefOr[integer] = js.undefined
}
object AggregationsCategorizeTextAggregation {
  
  inline def apply(field: Field): AggregationsCategorizeTextAggregation = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsCategorizeTextAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsCategorizeTextAggregation] (val x: Self) extends AnyVal {
    
    inline def setCategorization_analyzer(value: AggregationsCategorizeTextAnalyzer): Self = StObject.set(x, "categorization_analyzer", value.asInstanceOf[js.Any])
    
    inline def setCategorization_analyzerUndefined: Self = StObject.set(x, "categorization_analyzer", js.undefined)
    
    inline def setCategorization_filters(value: js.Array[String]): Self = StObject.set(x, "categorization_filters", value.asInstanceOf[js.Any])
    
    inline def setCategorization_filtersUndefined: Self = StObject.set(x, "categorization_filters", js.undefined)
    
    inline def setCategorization_filtersVarargs(value: String*): Self = StObject.set(x, "categorization_filters", js.Array(value*))
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setMax_matched_tokens(value: integer): Self = StObject.set(x, "max_matched_tokens", value.asInstanceOf[js.Any])
    
    inline def setMax_matched_tokensUndefined: Self = StObject.set(x, "max_matched_tokens", js.undefined)
    
    inline def setMax_unique_tokens(value: integer): Self = StObject.set(x, "max_unique_tokens", value.asInstanceOf[js.Any])
    
    inline def setMax_unique_tokensUndefined: Self = StObject.set(x, "max_unique_tokens", js.undefined)
    
    inline def setMin_doc_count(value: integer): Self = StObject.set(x, "min_doc_count", value.asInstanceOf[js.Any])
    
    inline def setMin_doc_countUndefined: Self = StObject.set(x, "min_doc_count", js.undefined)
    
    inline def setShard_min_doc_count(value: integer): Self = StObject.set(x, "shard_min_doc_count", value.asInstanceOf[js.Any])
    
    inline def setShard_min_doc_countUndefined: Self = StObject.set(x, "shard_min_doc_count", js.undefined)
    
    inline def setShard_size(value: integer): Self = StObject.set(x, "shard_size", value.asInstanceOf[js.Any])
    
    inline def setShard_sizeUndefined: Self = StObject.set(x, "shard_size", js.undefined)
    
    inline def setSimilarity_threshold(value: integer): Self = StObject.set(x, "similarity_threshold", value.asInstanceOf[js.Any])
    
    inline def setSimilarity_thresholdUndefined: Self = StObject.set(x, "similarity_threshold", js.undefined)
    
    inline def setSize(value: integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
