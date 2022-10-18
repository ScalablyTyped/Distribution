package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsSignificantLongTermsBucket
  extends StObject
     with AggregationsSignificantLongTermsBucketKeys
     with /* property */ StringDictionary[AggregationsAggregate | long | String | double]
object AggregationsSignificantLongTermsBucket {
  
  inline def apply(bg_count: long, doc_count: long, key: long, score: double): AggregationsSignificantLongTermsBucket = {
    val __obj = js.Dynamic.literal(bg_count = bg_count.asInstanceOf[js.Any], doc_count = doc_count.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsSignificantLongTermsBucket]
  }
}
