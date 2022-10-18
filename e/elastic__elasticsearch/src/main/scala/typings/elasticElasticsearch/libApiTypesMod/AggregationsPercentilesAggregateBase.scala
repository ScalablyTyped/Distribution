package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsPercentilesAggregateBase
  extends StObject
     with AggregationsAggregateBase {
  
  var values: AggregationsPercentiles
}
object AggregationsPercentilesAggregateBase {
  
  inline def apply(values: AggregationsPercentiles): AggregationsPercentilesAggregateBase = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsPercentilesAggregateBase]
  }
  
  extension [Self <: AggregationsPercentilesAggregateBase](x: Self) {
    
    inline def setValues(value: AggregationsPercentiles): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: AggregationsArrayPercentilesItem*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
