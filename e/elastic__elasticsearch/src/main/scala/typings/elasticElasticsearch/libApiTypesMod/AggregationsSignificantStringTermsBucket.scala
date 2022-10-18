package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsSignificantStringTermsBucket
  extends StObject
     with AggregationsSignificantStringTermsBucketKeys
     with /* property */ StringDictionary[AggregationsAggregate | String | double | long]
object AggregationsSignificantStringTermsBucket {
  
  inline def apply(bg_count: long, doc_count: long, key: String, score: double): AggregationsSignificantStringTermsBucket = {
    val __obj = js.Dynamic.literal(bg_count = bg_count.asInstanceOf[js.Any], doc_count = doc_count.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsSignificantStringTermsBucket]
  }
}
