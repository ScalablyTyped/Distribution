package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsRangeBucket
  extends StObject
     with AggregationsRangeBucketKeys
     with /* property */ StringDictionary[AggregationsAggregate | double | String | long]
object AggregationsRangeBucket {
  
  inline def apply(doc_count: long): AggregationsRangeBucket = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsRangeBucket]
  }
}
