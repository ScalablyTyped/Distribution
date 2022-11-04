package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsIpPrefixBucket
  extends StObject
     with AggregationsIpPrefixBucketKeys
     with /* property */ StringDictionary[AggregationsAggregate | Boolean | String | integer | long]
object AggregationsIpPrefixBucket {
  
  inline def apply(doc_count: long, is_ipv6: Boolean, key: String, prefix_length: integer): AggregationsIpPrefixBucket = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any], is_ipv6 = is_ipv6.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], prefix_length = prefix_length.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsIpPrefixBucket]
  }
}
