package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsHistogramBucket
  extends StObject
     with AggregationsHistogramBucketKeys
     with /* property */ StringDictionary[AggregationsAggregate | String | double | long]
object AggregationsHistogramBucket {
  
  inline def apply(doc_count: long, key: double): AggregationsHistogramBucket = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsHistogramBucket]
  }
}
