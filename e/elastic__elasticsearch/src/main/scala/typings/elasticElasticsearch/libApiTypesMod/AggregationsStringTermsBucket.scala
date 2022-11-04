package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsStringTermsBucket
  extends StObject
     with AggregationsStringTermsBucketKeys
     with /* property */ StringDictionary[AggregationsAggregate | FieldValue | long]
object AggregationsStringTermsBucket {
  
  inline def apply(doc_count: long): AggregationsStringTermsBucket = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any], key = null)
    __obj.asInstanceOf[AggregationsStringTermsBucket]
  }
}
