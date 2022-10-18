package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupFieldMetric extends StObject {
  
  var field: Field
  
  var metrics: js.Array[RollupMetric]
}
object RollupFieldMetric {
  
  inline def apply(field: Field, metrics: js.Array[RollupMetric]): RollupFieldMetric = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupFieldMetric]
  }
  
  extension [Self <: RollupFieldMetric](x: Self) {
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setMetrics(value: js.Array[RollupMetric]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsVarargs(value: RollupMetric*): Self = StObject.set(x, "metrics", js.Array(value*))
  }
}
