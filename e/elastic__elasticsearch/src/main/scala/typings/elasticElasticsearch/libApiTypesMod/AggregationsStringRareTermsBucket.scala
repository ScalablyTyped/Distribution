package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsStringRareTermsBucket
  extends StObject
     with AggregationsStringRareTermsBucketKeys
     with /* property */ StringDictionary[AggregationsAggregate | String | long]
object AggregationsStringRareTermsBucket {
  
  inline def apply(doc_count: long, key: String): AggregationsStringRareTermsBucket = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsStringRareTermsBucket]
  }
}
