package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsBoxPlotAggregate
  extends StObject
     with AggregationsAggregateBase
     with _AggregationsAggregate {
  
  var lower: double
  
  var lower_as_string: js.UndefOr[String] = js.undefined
  
  var max: double
  
  var max_as_string: js.UndefOr[String] = js.undefined
  
  var min: double
  
  var min_as_string: js.UndefOr[String] = js.undefined
  
  var q1: double
  
  var q1_as_string: js.UndefOr[String] = js.undefined
  
  var q2: double
  
  var q2_as_string: js.UndefOr[String] = js.undefined
  
  var q3: double
  
  var q3_as_string: js.UndefOr[String] = js.undefined
  
  var upper: double
  
  var upper_as_string: js.UndefOr[String] = js.undefined
}
object AggregationsBoxPlotAggregate {
  
  inline def apply(lower: double, max: double, min: double, q1: double, q2: double, q3: double, upper: double): AggregationsBoxPlotAggregate = {
    val __obj = js.Dynamic.literal(lower = lower.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], q1 = q1.asInstanceOf[js.Any], q2 = q2.asInstanceOf[js.Any], q3 = q3.asInstanceOf[js.Any], upper = upper.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsBoxPlotAggregate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsBoxPlotAggregate] (val x: Self) extends AnyVal {
    
    inline def setLower(value: double): Self = StObject.set(x, "lower", value.asInstanceOf[js.Any])
    
    inline def setLower_as_string(value: String): Self = StObject.set(x, "lower_as_string", value.asInstanceOf[js.Any])
    
    inline def setLower_as_stringUndefined: Self = StObject.set(x, "lower_as_string", js.undefined)
    
    inline def setMax(value: double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMax_as_string(value: String): Self = StObject.set(x, "max_as_string", value.asInstanceOf[js.Any])
    
    inline def setMax_as_stringUndefined: Self = StObject.set(x, "max_as_string", js.undefined)
    
    inline def setMin(value: double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMin_as_string(value: String): Self = StObject.set(x, "min_as_string", value.asInstanceOf[js.Any])
    
    inline def setMin_as_stringUndefined: Self = StObject.set(x, "min_as_string", js.undefined)
    
    inline def setQ1(value: double): Self = StObject.set(x, "q1", value.asInstanceOf[js.Any])
    
    inline def setQ1_as_string(value: String): Self = StObject.set(x, "q1_as_string", value.asInstanceOf[js.Any])
    
    inline def setQ1_as_stringUndefined: Self = StObject.set(x, "q1_as_string", js.undefined)
    
    inline def setQ2(value: double): Self = StObject.set(x, "q2", value.asInstanceOf[js.Any])
    
    inline def setQ2_as_string(value: String): Self = StObject.set(x, "q2_as_string", value.asInstanceOf[js.Any])
    
    inline def setQ2_as_stringUndefined: Self = StObject.set(x, "q2_as_string", js.undefined)
    
    inline def setQ3(value: double): Self = StObject.set(x, "q3", value.asInstanceOf[js.Any])
    
    inline def setQ3_as_string(value: String): Self = StObject.set(x, "q3_as_string", value.asInstanceOf[js.Any])
    
    inline def setQ3_as_stringUndefined: Self = StObject.set(x, "q3_as_string", js.undefined)
    
    inline def setUpper(value: double): Self = StObject.set(x, "upper", value.asInstanceOf[js.Any])
    
    inline def setUpper_as_string(value: String): Self = StObject.set(x, "upper_as_string", value.asInstanceOf[js.Any])
    
    inline def setUpper_as_stringUndefined: Self = StObject.set(x, "upper_as_string", js.undefined)
  }
}
