package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsMissingAggregate
  extends StObject
     with AggregationsSingleBucketAggregateBase
     with /* property */ StringDictionary[AggregationsAggregate | long | Metadata]
     with _AggregationsAggregate
object AggregationsMissingAggregate {
  
  inline def apply(doc_count: long): AggregationsMissingAggregate = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsMissingAggregate]
  }
}
