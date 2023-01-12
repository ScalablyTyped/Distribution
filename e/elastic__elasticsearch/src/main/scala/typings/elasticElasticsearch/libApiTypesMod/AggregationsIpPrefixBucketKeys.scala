package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsIpPrefixBucketKeys
  extends StObject
     with AggregationsMultiBucketBase {
  
  var is_ipv6: Boolean
  
  var key: String
  
  var netmask: js.UndefOr[String] = js.undefined
  
  var prefix_length: integer
}
object AggregationsIpPrefixBucketKeys {
  
  inline def apply(doc_count: long, is_ipv6: Boolean, key: String, prefix_length: integer): AggregationsIpPrefixBucketKeys = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any], is_ipv6 = is_ipv6.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], prefix_length = prefix_length.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsIpPrefixBucketKeys]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsIpPrefixBucketKeys] (val x: Self) extends AnyVal {
    
    inline def setIs_ipv6(value: Boolean): Self = StObject.set(x, "is_ipv6", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setNetmask(value: String): Self = StObject.set(x, "netmask", value.asInstanceOf[js.Any])
    
    inline def setNetmaskUndefined: Self = StObject.set(x, "netmask", js.undefined)
    
    inline def setPrefix_length(value: integer): Self = StObject.set(x, "prefix_length", value.asInstanceOf[js.Any])
  }
}
