package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsStringTermsBucket
  extends StObject
     with AggregationsStringTermsBucketKeys
     with /* property */ StringDictionary[AggregationsAggregate | String | long]
object AggregationsStringTermsBucket {
  
  inline def apply(doc_count: long, key: String): AggregationsStringTermsBucket = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsStringTermsBucket]
  }
}
