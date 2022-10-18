package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsTopMetrics extends StObject {
  
  var metrics: Record[String, FieldValue | Null]
  
  var sort: js.Array[FieldValue | Null]
}
object AggregationsTopMetrics {
  
  inline def apply(metrics: Record[String, FieldValue | Null], sort: js.Array[FieldValue | Null]): AggregationsTopMetrics = {
    val __obj = js.Dynamic.literal(metrics = metrics.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsTopMetrics]
  }
  
  extension [Self <: AggregationsTopMetrics](x: Self) {
    
    inline def setMetrics(value: Record[String, FieldValue | Null]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setSort(value: js.Array[FieldValue | Null]): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortVarargs(value: (FieldValue | Null)*): Self = StObject.set(x, "sort", js.Array(value*))
  }
}
