package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsNormalizeAggregation
  extends StObject
     with AggregationsPipelineAggregationBase {
  
  var method: js.UndefOr[AggregationsNormalizeMethod] = js.undefined
}
object AggregationsNormalizeAggregation {
  
  inline def apply(): AggregationsNormalizeAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsNormalizeAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsNormalizeAggregation] (val x: Self) extends AnyVal {
    
    inline def setMethod(value: AggregationsNormalizeMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
  }
}
