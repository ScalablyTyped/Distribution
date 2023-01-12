package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsHistogramBucketKeys
  extends StObject
     with AggregationsMultiBucketBase {
  
  var key: double
  
  var key_as_string: js.UndefOr[String] = js.undefined
}
object AggregationsHistogramBucketKeys {
  
  inline def apply(doc_count: long, key: double): AggregationsHistogramBucketKeys = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsHistogramBucketKeys]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsHistogramBucketKeys] (val x: Self) extends AnyVal {
    
    inline def setKey(value: double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKey_as_string(value: String): Self = StObject.set(x, "key_as_string", value.asInstanceOf[js.Any])
    
    inline def setKey_as_stringUndefined: Self = StObject.set(x, "key_as_string", js.undefined)
  }
}
