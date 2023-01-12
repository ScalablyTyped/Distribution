package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsWeightedAverageAggregation
  extends StObject
     with AggregationsAggregation {
  
  var format: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[AggregationsWeightedAverageValue] = js.undefined
  
  var value_type: js.UndefOr[AggregationsValueType] = js.undefined
  
  var weight: js.UndefOr[AggregationsWeightedAverageValue] = js.undefined
}
object AggregationsWeightedAverageAggregation {
  
  inline def apply(): AggregationsWeightedAverageAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsWeightedAverageAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsWeightedAverageAggregation] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setValue(value: AggregationsWeightedAverageValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValue_type(value: AggregationsValueType): Self = StObject.set(x, "value_type", value.asInstanceOf[js.Any])
    
    inline def setValue_typeUndefined: Self = StObject.set(x, "value_type", js.undefined)
    
    inline def setWeight(value: AggregationsWeightedAverageValue): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
