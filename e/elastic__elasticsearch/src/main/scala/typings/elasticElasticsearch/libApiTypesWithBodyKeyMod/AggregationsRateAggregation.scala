package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsRateAggregation
  extends StObject
     with AggregationsFormatMetricAggregationBase {
  
  var mode: js.UndefOr[AggregationsRateMode] = js.undefined
  
  var unit: js.UndefOr[AggregationsCalendarInterval] = js.undefined
}
object AggregationsRateAggregation {
  
  inline def apply(): AggregationsRateAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsRateAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsRateAggregation] (val x: Self) extends AnyVal {
    
    inline def setMode(value: AggregationsRateMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setUnit(value: AggregationsCalendarInterval): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
