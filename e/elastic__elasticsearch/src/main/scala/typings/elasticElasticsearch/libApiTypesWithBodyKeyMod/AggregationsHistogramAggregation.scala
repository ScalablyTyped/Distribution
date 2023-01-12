package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsHistogramAggregation
  extends StObject
     with AggregationsAggregation {
  
  var extended_bounds: js.UndefOr[AggregationsExtendedBounds[double]] = js.undefined
  
  var field: js.UndefOr[Field] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var hard_bounds: js.UndefOr[AggregationsExtendedBounds[double]] = js.undefined
  
  var interval: js.UndefOr[double] = js.undefined
  
  var keyed: js.UndefOr[Boolean] = js.undefined
  
  var min_doc_count: js.UndefOr[integer] = js.undefined
  
  var missing: js.UndefOr[double] = js.undefined
  
  var offset: js.UndefOr[double] = js.undefined
  
  var order: js.UndefOr[AggregationsAggregateOrder] = js.undefined
  
  var script: js.UndefOr[Script] = js.undefined
}
object AggregationsHistogramAggregation {
  
  inline def apply(): AggregationsHistogramAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsHistogramAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsHistogramAggregation] (val x: Self) extends AnyVal {
    
    inline def setExtended_bounds(value: AggregationsExtendedBounds[double]): Self = StObject.set(x, "extended_bounds", value.asInstanceOf[js.Any])
    
    inline def setExtended_boundsUndefined: Self = StObject.set(x, "extended_bounds", js.undefined)
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setHard_bounds(value: AggregationsExtendedBounds[double]): Self = StObject.set(x, "hard_bounds", value.asInstanceOf[js.Any])
    
    inline def setHard_boundsUndefined: Self = StObject.set(x, "hard_bounds", js.undefined)
    
    inline def setInterval(value: double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setKeyed(value: Boolean): Self = StObject.set(x, "keyed", value.asInstanceOf[js.Any])
    
    inline def setKeyedUndefined: Self = StObject.set(x, "keyed", js.undefined)
    
    inline def setMin_doc_count(value: integer): Self = StObject.set(x, "min_doc_count", value.asInstanceOf[js.Any])
    
    inline def setMin_doc_countUndefined: Self = StObject.set(x, "min_doc_count", js.undefined)
    
    inline def setMissing(value: double): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
    
    inline def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
    
    inline def setOffset(value: double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOrder(value: AggregationsAggregateOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setOrderVarargs(value: (Partial[Record[Field, SortOrder]])*): Self = StObject.set(x, "order", js.Array(value*))
    
    inline def setScript(value: Script): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
  }
}
