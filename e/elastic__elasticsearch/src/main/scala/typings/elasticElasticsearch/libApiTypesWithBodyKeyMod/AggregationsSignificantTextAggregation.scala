package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsSignificantTextAggregation
  extends StObject
     with AggregationsAggregation {
  
  var background_filter: js.UndefOr[QueryDslQueryContainer] = js.undefined
  
  var chi_square: js.UndefOr[AggregationsChiSquareHeuristic] = js.undefined
  
  var exclude: js.UndefOr[AggregationsTermsExclude] = js.undefined
  
  var execution_hint: js.UndefOr[AggregationsTermsAggregationExecutionHint] = js.undefined
  
  var field: js.UndefOr[Field] = js.undefined
  
  var filter_duplicate_text: js.UndefOr[Boolean] = js.undefined
  
  var gnd: js.UndefOr[AggregationsGoogleNormalizedDistanceHeuristic] = js.undefined
  
  var include: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var jlh: js.UndefOr[EmptyObject] = js.undefined
  
  var min_doc_count: js.UndefOr[long] = js.undefined
  
  var mutual_information: js.UndefOr[AggregationsMutualInformationHeuristic] = js.undefined
  
  var percentage: js.UndefOr[AggregationsPercentageScoreHeuristic] = js.undefined
  
  var script_heuristic: js.UndefOr[AggregationsScriptedHeuristic] = js.undefined
  
  var shard_min_doc_count: js.UndefOr[long] = js.undefined
  
  var shard_size: js.UndefOr[integer] = js.undefined
  
  var size: js.UndefOr[integer] = js.undefined
  
  var source_fields: js.UndefOr[Fields] = js.undefined
}
object AggregationsSignificantTextAggregation {
  
  inline def apply(): AggregationsSignificantTextAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsSignificantTextAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsSignificantTextAggregation] (val x: Self) extends AnyVal {
    
    inline def setBackground_filter(value: QueryDslQueryContainer): Self = StObject.set(x, "background_filter", value.asInstanceOf[js.Any])
    
    inline def setBackground_filterUndefined: Self = StObject.set(x, "background_filter", js.undefined)
    
    inline def setChi_square(value: AggregationsChiSquareHeuristic): Self = StObject.set(x, "chi_square", value.asInstanceOf[js.Any])
    
    inline def setChi_squareUndefined: Self = StObject.set(x, "chi_square", js.undefined)
    
    inline def setExclude(value: AggregationsTermsExclude): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setExecution_hint(value: AggregationsTermsAggregationExecutionHint): Self = StObject.set(x, "execution_hint", value.asInstanceOf[js.Any])
    
    inline def setExecution_hintUndefined: Self = StObject.set(x, "execution_hint", js.undefined)
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setFilter_duplicate_text(value: Boolean): Self = StObject.set(x, "filter_duplicate_text", value.asInstanceOf[js.Any])
    
    inline def setFilter_duplicate_textUndefined: Self = StObject.set(x, "filter_duplicate_text", js.undefined)
    
    inline def setGnd(value: AggregationsGoogleNormalizedDistanceHeuristic): Self = StObject.set(x, "gnd", value.asInstanceOf[js.Any])
    
    inline def setGndUndefined: Self = StObject.set(x, "gnd", js.undefined)
    
    inline def setInclude(value: String | js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value*))
    
    inline def setJlh(value: EmptyObject): Self = StObject.set(x, "jlh", value.asInstanceOf[js.Any])
    
    inline def setJlhUndefined: Self = StObject.set(x, "jlh", js.undefined)
    
    inline def setMin_doc_count(value: long): Self = StObject.set(x, "min_doc_count", value.asInstanceOf[js.Any])
    
    inline def setMin_doc_countUndefined: Self = StObject.set(x, "min_doc_count", js.undefined)
    
    inline def setMutual_information(value: AggregationsMutualInformationHeuristic): Self = StObject.set(x, "mutual_information", value.asInstanceOf[js.Any])
    
    inline def setMutual_informationUndefined: Self = StObject.set(x, "mutual_information", js.undefined)
    
    inline def setPercentage(value: AggregationsPercentageScoreHeuristic): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
    
    inline def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
    
    inline def setScript_heuristic(value: AggregationsScriptedHeuristic): Self = StObject.set(x, "script_heuristic", value.asInstanceOf[js.Any])
    
    inline def setScript_heuristicUndefined: Self = StObject.set(x, "script_heuristic", js.undefined)
    
    inline def setShard_min_doc_count(value: long): Self = StObject.set(x, "shard_min_doc_count", value.asInstanceOf[js.Any])
    
    inline def setShard_min_doc_countUndefined: Self = StObject.set(x, "shard_min_doc_count", js.undefined)
    
    inline def setShard_size(value: integer): Self = StObject.set(x, "shard_size", value.asInstanceOf[js.Any])
    
    inline def setShard_sizeUndefined: Self = StObject.set(x, "shard_size", js.undefined)
    
    inline def setSize(value: integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSource_fields(value: Fields): Self = StObject.set(x, "source_fields", value.asInstanceOf[js.Any])
    
    inline def setSource_fieldsUndefined: Self = StObject.set(x, "source_fields", js.undefined)
    
    inline def setSource_fieldsVarargs(value: Field*): Self = StObject.set(x, "source_fields", js.Array(value*))
  }
}
