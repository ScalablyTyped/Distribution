package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsMovingPercentilesAggregation
  extends StObject
     with AggregationsPipelineAggregationBase {
  
  var keyed: js.UndefOr[Boolean] = js.undefined
  
  var shift: js.UndefOr[integer] = js.undefined
  
  var window: js.UndefOr[integer] = js.undefined
}
object AggregationsMovingPercentilesAggregation {
  
  inline def apply(): AggregationsMovingPercentilesAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsMovingPercentilesAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsMovingPercentilesAggregation] (val x: Self) extends AnyVal {
    
    inline def setKeyed(value: Boolean): Self = StObject.set(x, "keyed", value.asInstanceOf[js.Any])
    
    inline def setKeyedUndefined: Self = StObject.set(x, "keyed", js.undefined)
    
    inline def setShift(value: integer): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
    
    inline def setShiftUndefined: Self = StObject.set(x, "shift", js.undefined)
    
    inline def setWindow(value: integer): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    
    inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
  }
}
