package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsWeightedAverageValue extends StObject {
  
  var field: js.UndefOr[Field] = js.undefined
  
  var missing: js.UndefOr[double] = js.undefined
  
  var script: js.UndefOr[Script] = js.undefined
}
object AggregationsWeightedAverageValue {
  
  inline def apply(): AggregationsWeightedAverageValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsWeightedAverageValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsWeightedAverageValue] (val x: Self) extends AnyVal {
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setMissing(value: double): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
    
    inline def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
    
    inline def setScript(value: Script): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
  }
}
