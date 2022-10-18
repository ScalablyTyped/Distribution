package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsAdjacencyMatrixBucket
  extends StObject
     with AggregationsMultiBucketBase
     with /* property */ StringDictionary[AggregationsAggregate | long]
object AggregationsAdjacencyMatrixBucket {
  
  inline def apply(doc_count: long): AggregationsAdjacencyMatrixBucket = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsAdjacencyMatrixBucket]
  }
}
