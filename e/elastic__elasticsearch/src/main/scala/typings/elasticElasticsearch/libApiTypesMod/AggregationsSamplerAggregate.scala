package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsSamplerAggregate
  extends StObject
     with AggregationsSingleBucketAggregateBase
     with /* property */ StringDictionary[AggregationsAggregate | long | Metadata]
     with _AggregationsAggregate
object AggregationsSamplerAggregate {
  
  inline def apply(doc_count: long): AggregationsSamplerAggregate = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsSamplerAggregate]
  }
}
