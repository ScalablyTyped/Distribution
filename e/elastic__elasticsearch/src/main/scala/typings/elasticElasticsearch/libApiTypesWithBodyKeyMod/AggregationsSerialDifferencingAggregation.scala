package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsSerialDifferencingAggregation
  extends StObject
     with AggregationsPipelineAggregationBase {
  
  var lag: js.UndefOr[integer] = js.undefined
}
object AggregationsSerialDifferencingAggregation {
  
  inline def apply(): AggregationsSerialDifferencingAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsSerialDifferencingAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsSerialDifferencingAggregation] (val x: Self) extends AnyVal {
    
    inline def setLag(value: integer): Self = StObject.set(x, "lag", value.asInstanceOf[js.Any])
    
    inline def setLagUndefined: Self = StObject.set(x, "lag", js.undefined)
  }
}
