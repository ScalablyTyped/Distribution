package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsIpRangeBucket
  extends StObject
     with AggregationsIpRangeBucketKeys
     with /* property */ StringDictionary[AggregationsAggregate | String | long]
object AggregationsIpRangeBucket {
  
  inline def apply(doc_count: long): AggregationsIpRangeBucket = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsIpRangeBucket]
  }
}
