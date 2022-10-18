package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsParentAggregate
  extends StObject
     with AggregationsSingleBucketAggregateBase
     with /* property */ StringDictionary[AggregationsAggregate | long | Metadata]
     with _AggregationsAggregate
object AggregationsParentAggregate {
  
  inline def apply(doc_count: long): AggregationsParentAggregate = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsParentAggregate]
  }
}
