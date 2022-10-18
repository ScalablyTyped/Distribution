package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsMissingAggregation
  extends StObject
     with AggregationsAggregation {
  
  var field: js.UndefOr[Field] = js.undefined
  
  var missing: js.UndefOr[AggregationsMissing] = js.undefined
}
object AggregationsMissingAggregation {
  
  inline def apply(): AggregationsMissingAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsMissingAggregation]
  }
  
  extension [Self <: AggregationsMissingAggregation](x: Self) {
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setMissing(value: AggregationsMissing): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
    
    inline def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
  }
}
