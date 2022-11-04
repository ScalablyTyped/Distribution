package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsMultiTermsBucket
  extends StObject
     with AggregationsMultiTermsBucketKeys
     with /* property */ StringDictionary[AggregationsAggregate | js.Array[FieldValue] | String | long]
object AggregationsMultiTermsBucket {
  
  inline def apply(doc_count: long, key: js.Array[FieldValue]): AggregationsMultiTermsBucket = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsMultiTermsBucket]
  }
}
