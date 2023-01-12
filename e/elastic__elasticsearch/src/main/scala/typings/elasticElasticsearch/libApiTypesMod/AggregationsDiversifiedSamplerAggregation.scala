package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsDiversifiedSamplerAggregation
  extends StObject
     with AggregationsAggregation {
  
  var execution_hint: js.UndefOr[AggregationsSamplerAggregationExecutionHint] = js.undefined
  
  var field: js.UndefOr[Field] = js.undefined
  
  var max_docs_per_value: js.UndefOr[integer] = js.undefined
  
  var script: js.UndefOr[Script] = js.undefined
  
  var shard_size: js.UndefOr[integer] = js.undefined
}
object AggregationsDiversifiedSamplerAggregation {
  
  inline def apply(): AggregationsDiversifiedSamplerAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsDiversifiedSamplerAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsDiversifiedSamplerAggregation] (val x: Self) extends AnyVal {
    
    inline def setExecution_hint(value: AggregationsSamplerAggregationExecutionHint): Self = StObject.set(x, "execution_hint", value.asInstanceOf[js.Any])
    
    inline def setExecution_hintUndefined: Self = StObject.set(x, "execution_hint", js.undefined)
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setMax_docs_per_value(value: integer): Self = StObject.set(x, "max_docs_per_value", value.asInstanceOf[js.Any])
    
    inline def setMax_docs_per_valueUndefined: Self = StObject.set(x, "max_docs_per_value", js.undefined)
    
    inline def setScript(value: Script): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
    
    inline def setShard_size(value: integer): Self = StObject.set(x, "shard_size", value.asInstanceOf[js.Any])
    
    inline def setShard_sizeUndefined: Self = StObject.set(x, "shard_size", js.undefined)
  }
}
