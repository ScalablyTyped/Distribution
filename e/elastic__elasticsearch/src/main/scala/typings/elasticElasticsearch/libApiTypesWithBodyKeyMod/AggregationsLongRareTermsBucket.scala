package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsLongRareTermsBucket
  extends StObject
     with AggregationsLongRareTermsBucketKeys
     with /* property */ StringDictionary[AggregationsAggregate | long | String]
object AggregationsLongRareTermsBucket {
  
  inline def apply(doc_count: long, key: long): AggregationsLongRareTermsBucket = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsLongRareTermsBucket]
  }
}
