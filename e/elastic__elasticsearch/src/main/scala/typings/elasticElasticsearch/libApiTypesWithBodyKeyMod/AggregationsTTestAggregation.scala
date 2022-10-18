package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsTTestAggregation
  extends StObject
     with AggregationsAggregation {
  
  var a: js.UndefOr[AggregationsTestPopulation] = js.undefined
  
  var b: js.UndefOr[AggregationsTestPopulation] = js.undefined
  
  var `type`: js.UndefOr[AggregationsTTestType] = js.undefined
}
object AggregationsTTestAggregation {
  
  inline def apply(): AggregationsTTestAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsTTestAggregation]
  }
  
  extension [Self <: AggregationsTTestAggregation](x: Self) {
    
    inline def setA(value: AggregationsTestPopulation): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setAUndefined: Self = StObject.set(x, "a", js.undefined)
    
    inline def setB(value: AggregationsTestPopulation): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setBUndefined: Self = StObject.set(x, "b", js.undefined)
    
    inline def setType(value: AggregationsTTestType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
