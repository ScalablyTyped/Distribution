package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslSpanQuery extends StObject {
  
  var field_masking_span: js.UndefOr[QueryDslSpanFieldMaskingQuery] = js.undefined
  
  var span_containing: js.UndefOr[QueryDslSpanContainingQuery] = js.undefined
  
  var span_first: js.UndefOr[QueryDslSpanFirstQuery] = js.undefined
  
  var span_gap: js.UndefOr[QueryDslSpanGapQuery] = js.undefined
  
  var span_multi: js.UndefOr[QueryDslSpanMultiTermQuery] = js.undefined
  
  var span_near: js.UndefOr[QueryDslSpanNearQuery] = js.undefined
  
  var span_not: js.UndefOr[QueryDslSpanNotQuery] = js.undefined
  
  var span_or: js.UndefOr[QueryDslSpanOrQuery] = js.undefined
  
  var span_term: js.UndefOr[Partial[Record[Field, QueryDslSpanTermQuery | String]]] = js.undefined
  
  var span_within: js.UndefOr[QueryDslSpanWithinQuery] = js.undefined
}
object QueryDslSpanQuery {
  
  inline def apply(): QueryDslSpanQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryDslSpanQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryDslSpanQuery] (val x: Self) extends AnyVal {
    
    inline def setField_masking_span(value: QueryDslSpanFieldMaskingQuery): Self = StObject.set(x, "field_masking_span", value.asInstanceOf[js.Any])
    
    inline def setField_masking_spanUndefined: Self = StObject.set(x, "field_masking_span", js.undefined)
    
    inline def setSpan_containing(value: QueryDslSpanContainingQuery): Self = StObject.set(x, "span_containing", value.asInstanceOf[js.Any])
    
    inline def setSpan_containingUndefined: Self = StObject.set(x, "span_containing", js.undefined)
    
    inline def setSpan_first(value: QueryDslSpanFirstQuery): Self = StObject.set(x, "span_first", value.asInstanceOf[js.Any])
    
    inline def setSpan_firstUndefined: Self = StObject.set(x, "span_first", js.undefined)
    
    inline def setSpan_gap(value: QueryDslSpanGapQuery): Self = StObject.set(x, "span_gap", value.asInstanceOf[js.Any])
    
    inline def setSpan_gapUndefined: Self = StObject.set(x, "span_gap", js.undefined)
    
    inline def setSpan_multi(value: QueryDslSpanMultiTermQuery): Self = StObject.set(x, "span_multi", value.asInstanceOf[js.Any])
    
    inline def setSpan_multiUndefined: Self = StObject.set(x, "span_multi", js.undefined)
    
    inline def setSpan_near(value: QueryDslSpanNearQuery): Self = StObject.set(x, "span_near", value.asInstanceOf[js.Any])
    
    inline def setSpan_nearUndefined: Self = StObject.set(x, "span_near", js.undefined)
    
    inline def setSpan_not(value: QueryDslSpanNotQuery): Self = StObject.set(x, "span_not", value.asInstanceOf[js.Any])
    
    inline def setSpan_notUndefined: Self = StObject.set(x, "span_not", js.undefined)
    
    inline def setSpan_or(value: QueryDslSpanOrQuery): Self = StObject.set(x, "span_or", value.asInstanceOf[js.Any])
    
    inline def setSpan_orUndefined: Self = StObject.set(x, "span_or", js.undefined)
    
    inline def setSpan_term(value: Partial[Record[Field, QueryDslSpanTermQuery | String]]): Self = StObject.set(x, "span_term", value.asInstanceOf[js.Any])
    
    inline def setSpan_termUndefined: Self = StObject.set(x, "span_term", js.undefined)
    
    inline def setSpan_within(value: QueryDslSpanWithinQuery): Self = StObject.set(x, "span_within", value.asInstanceOf[js.Any])
    
    inline def setSpan_withinUndefined: Self = StObject.set(x, "span_within", js.undefined)
  }
}
