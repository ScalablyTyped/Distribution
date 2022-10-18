package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsDoubleTermsBucket
  extends StObject
     with AggregationsDoubleTermsBucketKeys
     with /* property */ StringDictionary[AggregationsAggregate | double | String | long]
object AggregationsDoubleTermsBucket {
  
  inline def apply(doc_count: long, key: double): AggregationsDoubleTermsBucket = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsDoubleTermsBucket]
  }
}
