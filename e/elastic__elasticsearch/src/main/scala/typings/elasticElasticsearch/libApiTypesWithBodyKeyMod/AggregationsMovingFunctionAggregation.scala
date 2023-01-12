package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsMovingFunctionAggregation
  extends StObject
     with AggregationsPipelineAggregationBase {
  
  var script: js.UndefOr[String] = js.undefined
  
  var shift: js.UndefOr[integer] = js.undefined
  
  var window: js.UndefOr[integer] = js.undefined
}
object AggregationsMovingFunctionAggregation {
  
  inline def apply(): AggregationsMovingFunctionAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsMovingFunctionAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsMovingFunctionAggregation] (val x: Self) extends AnyVal {
    
    inline def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
    
    inline def setShift(value: integer): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
    
    inline def setShiftUndefined: Self = StObject.set(x, "shift", js.undefined)
    
    inline def setWindow(value: integer): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    
    inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
  }
}
