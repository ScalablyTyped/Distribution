package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsRangeAggregation
  extends StObject
     with AggregationsAggregation {
  
  var field: js.UndefOr[Field] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var keyed: js.UndefOr[Boolean] = js.undefined
  
  var missing: js.UndefOr[integer] = js.undefined
  
  var ranges: js.UndefOr[js.Array[AggregationsAggregationRange]] = js.undefined
  
  var script: js.UndefOr[Script] = js.undefined
}
object AggregationsRangeAggregation {
  
  inline def apply(): AggregationsRangeAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsRangeAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsRangeAggregation] (val x: Self) extends AnyVal {
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setKeyed(value: Boolean): Self = StObject.set(x, "keyed", value.asInstanceOf[js.Any])
    
    inline def setKeyedUndefined: Self = StObject.set(x, "keyed", js.undefined)
    
    inline def setMissing(value: integer): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
    
    inline def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
    
    inline def setRanges(value: js.Array[AggregationsAggregationRange]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
    
    inline def setRangesVarargs(value: AggregationsAggregationRange*): Self = StObject.set(x, "ranges", js.Array(value*))
    
    inline def setScript(value: Script): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
  }
}
