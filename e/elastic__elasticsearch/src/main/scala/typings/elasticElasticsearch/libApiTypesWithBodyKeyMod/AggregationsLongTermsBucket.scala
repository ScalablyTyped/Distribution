package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsLongTermsBucket
  extends StObject
     with AggregationsLongTermsBucketKeys
     with /* property */ StringDictionary[AggregationsAggregate | long | String]
object AggregationsLongTermsBucket {
  
  inline def apply(doc_count: long, key: long): AggregationsLongTermsBucket = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsLongTermsBucket]
  }
}
