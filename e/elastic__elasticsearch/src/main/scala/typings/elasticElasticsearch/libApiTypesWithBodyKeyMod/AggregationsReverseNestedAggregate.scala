package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsReverseNestedAggregate
  extends StObject
     with AggregationsSingleBucketAggregateBase
     with /* property */ StringDictionary[AggregationsAggregate | long | Metadata]
     with _AggregationsAggregate
object AggregationsReverseNestedAggregate {
  
  inline def apply(doc_count: long): AggregationsReverseNestedAggregate = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsReverseNestedAggregate]
  }
}
