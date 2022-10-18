package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsTermsAggregation
  extends StObject
     with AggregationsAggregation {
  
  var collect_mode: js.UndefOr[AggregationsTermsAggregationCollectMode] = js.undefined
  
  var exclude: js.UndefOr[AggregationsTermsExclude] = js.undefined
  
  var execution_hint: js.UndefOr[AggregationsTermsAggregationExecutionHint] = js.undefined
  
  var field: js.UndefOr[Field] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var include: js.UndefOr[AggregationsTermsInclude] = js.undefined
  
  var min_doc_count: js.UndefOr[integer] = js.undefined
  
  var missing: js.UndefOr[AggregationsMissing] = js.undefined
  
  var missing_bucket: js.UndefOr[Boolean] = js.undefined
  
  var missing_order: js.UndefOr[AggregationsMissingOrder] = js.undefined
  
  var order: js.UndefOr[AggregationsAggregateOrder] = js.undefined
  
  var script: js.UndefOr[Script] = js.undefined
  
  var shard_size: js.UndefOr[integer] = js.undefined
  
  var show_term_doc_count_error: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[integer] = js.undefined
  
  var value_type: js.UndefOr[String] = js.undefined
}
object AggregationsTermsAggregation {
  
  inline def apply(): AggregationsTermsAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsTermsAggregation]
  }
  
  extension [Self <: AggregationsTermsAggregation](x: Self) {
    
    inline def setCollect_mode(value: AggregationsTermsAggregationCollectMode): Self = StObject.set(x, "collect_mode", value.asInstanceOf[js.Any])
    
    inline def setCollect_modeUndefined: Self = StObject.set(x, "collect_mode", js.undefined)
    
    inline def setExclude(value: AggregationsTermsExclude): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setExecution_hint(value: AggregationsTermsAggregationExecutionHint): Self = StObject.set(x, "execution_hint", value.asInstanceOf[js.Any])
    
    inline def setExecution_hintUndefined: Self = StObject.set(x, "execution_hint", js.undefined)
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setInclude(value: AggregationsTermsInclude): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value*))
    
    inline def setMin_doc_count(value: integer): Self = StObject.set(x, "min_doc_count", value.asInstanceOf[js.Any])
    
    inline def setMin_doc_countUndefined: Self = StObject.set(x, "min_doc_count", js.undefined)
    
    inline def setMissing(value: AggregationsMissing): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
    
    inline def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
    
    inline def setMissing_bucket(value: Boolean): Self = StObject.set(x, "missing_bucket", value.asInstanceOf[js.Any])
    
    inline def setMissing_bucketUndefined: Self = StObject.set(x, "missing_bucket", js.undefined)
    
    inline def setMissing_order(value: AggregationsMissingOrder): Self = StObject.set(x, "missing_order", value.asInstanceOf[js.Any])
    
    inline def setMissing_orderUndefined: Self = StObject.set(x, "missing_order", js.undefined)
    
    inline def setOrder(value: AggregationsAggregateOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setOrderVarargs(value: (Partial[Record[Field, SortOrder]])*): Self = StObject.set(x, "order", js.Array(value*))
    
    inline def setScript(value: Script): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
    
    inline def setShard_size(value: integer): Self = StObject.set(x, "shard_size", value.asInstanceOf[js.Any])
    
    inline def setShard_sizeUndefined: Self = StObject.set(x, "shard_size", js.undefined)
    
    inline def setShow_term_doc_count_error(value: Boolean): Self = StObject.set(x, "show_term_doc_count_error", value.asInstanceOf[js.Any])
    
    inline def setShow_term_doc_count_errorUndefined: Self = StObject.set(x, "show_term_doc_count_error", js.undefined)
    
    inline def setSize(value: integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setValue_type(value: String): Self = StObject.set(x, "value_type", value.asInstanceOf[js.Any])
    
    inline def setValue_typeUndefined: Self = StObject.set(x, "value_type", js.undefined)
  }
}
