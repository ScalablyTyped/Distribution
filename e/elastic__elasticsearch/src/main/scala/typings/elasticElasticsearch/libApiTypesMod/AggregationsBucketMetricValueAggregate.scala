package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsBucketMetricValueAggregate
  extends StObject
     with AggregationsSingleMetricAggregateBase
     with _AggregationsAggregate {
  
  var keys: js.Array[String]
}
object AggregationsBucketMetricValueAggregate {
  
  inline def apply(keys: js.Array[String]): AggregationsBucketMetricValueAggregate = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any], value = null)
    __obj.asInstanceOf[AggregationsBucketMetricValueAggregate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsBucketMetricValueAggregate] (val x: Self) extends AnyVal {
    
    inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
  }
}
