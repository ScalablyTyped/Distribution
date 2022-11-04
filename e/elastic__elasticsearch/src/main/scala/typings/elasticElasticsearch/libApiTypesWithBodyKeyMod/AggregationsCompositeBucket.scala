package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsCompositeBucket
  extends StObject
     with AggregationsCompositeBucketKeys
     with /* property */ StringDictionary[AggregationsAggregate | AggregationsCompositeAggregateKey | long]
object AggregationsCompositeBucket {
  
  inline def apply(doc_count: long, key: AggregationsCompositeAggregateKey): AggregationsCompositeBucket = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsCompositeBucket]
  }
}
