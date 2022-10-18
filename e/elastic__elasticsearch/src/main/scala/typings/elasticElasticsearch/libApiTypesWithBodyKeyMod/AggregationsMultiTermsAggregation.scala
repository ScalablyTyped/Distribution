package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsMultiTermsAggregation
  extends StObject
     with AggregationsAggregation {
  
  var collect_mode: js.UndefOr[AggregationsTermsAggregationCollectMode] = js.undefined
  
  var min_doc_count: js.UndefOr[long] = js.undefined
  
  var order: js.UndefOr[AggregationsAggregateOrder] = js.undefined
  
  var shard_min_doc_count: js.UndefOr[long] = js.undefined
  
  var shard_size: js.UndefOr[integer] = js.undefined
  
  var show_term_doc_count_error: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[integer] = js.undefined
  
  var terms: js.Array[AggregationsMultiTermLookup]
}
object AggregationsMultiTermsAggregation {
  
  inline def apply(terms: js.Array[AggregationsMultiTermLookup]): AggregationsMultiTermsAggregation = {
    val __obj = js.Dynamic.literal(terms = terms.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsMultiTermsAggregation]
  }
  
  extension [Self <: AggregationsMultiTermsAggregation](x: Self) {
    
    inline def setCollect_mode(value: AggregationsTermsAggregationCollectMode): Self = StObject.set(x, "collect_mode", value.asInstanceOf[js.Any])
    
    inline def setCollect_modeUndefined: Self = StObject.set(x, "collect_mode", js.undefined)
    
    inline def setMin_doc_count(value: long): Self = StObject.set(x, "min_doc_count", value.asInstanceOf[js.Any])
    
    inline def setMin_doc_countUndefined: Self = StObject.set(x, "min_doc_count", js.undefined)
    
    inline def setOrder(value: AggregationsAggregateOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setOrderVarargs(value: (Partial[Record[Field, SortOrder]])*): Self = StObject.set(x, "order", js.Array(value*))
    
    inline def setShard_min_doc_count(value: long): Self = StObject.set(x, "shard_min_doc_count", value.asInstanceOf[js.Any])
    
    inline def setShard_min_doc_countUndefined: Self = StObject.set(x, "shard_min_doc_count", js.undefined)
    
    inline def setShard_size(value: integer): Self = StObject.set(x, "shard_size", value.asInstanceOf[js.Any])
    
    inline def setShard_sizeUndefined: Self = StObject.set(x, "shard_size", js.undefined)
    
    inline def setShow_term_doc_count_error(value: Boolean): Self = StObject.set(x, "show_term_doc_count_error", value.asInstanceOf[js.Any])
    
    inline def setShow_term_doc_count_errorUndefined: Self = StObject.set(x, "show_term_doc_count_error", js.undefined)
    
    inline def setSize(value: integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTerms(value: js.Array[AggregationsMultiTermLookup]): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
    
    inline def setTermsVarargs(value: AggregationsMultiTermLookup*): Self = StObject.set(x, "terms", js.Array(value*))
  }
}
