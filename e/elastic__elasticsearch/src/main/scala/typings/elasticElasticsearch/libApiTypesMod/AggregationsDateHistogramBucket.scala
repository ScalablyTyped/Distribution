package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsDateHistogramBucket
  extends StObject
     with AggregationsDateHistogramBucketKeys
     with /* property */ StringDictionary[AggregationsAggregate | String | EpochTime[UnitMillis] | long]
object AggregationsDateHistogramBucket {
  
  inline def apply(doc_count: long, key: EpochTime[UnitMillis]): AggregationsDateHistogramBucket = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsDateHistogramBucket]
  }
}
