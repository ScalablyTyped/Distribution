package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsVariableWidthHistogramBucket
  extends StObject
     with AggregationsVariableWidthHistogramBucketKeys
     with /* property */ StringDictionary[AggregationsAggregate | double | String | long]
object AggregationsVariableWidthHistogramBucket {
  
  inline def apply(doc_count: long, key: double, max: double, min: double): AggregationsVariableWidthHistogramBucket = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsVariableWidthHistogramBucket]
  }
}
