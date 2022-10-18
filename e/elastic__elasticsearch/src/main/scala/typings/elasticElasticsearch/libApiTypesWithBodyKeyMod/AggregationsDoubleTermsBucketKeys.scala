package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsDoubleTermsBucketKeys
  extends StObject
     with AggregationsTermsBucketBase {
  
  var key: double
  
  var key_as_string: js.UndefOr[String] = js.undefined
}
object AggregationsDoubleTermsBucketKeys {
  
  inline def apply(doc_count: long, key: double): AggregationsDoubleTermsBucketKeys = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsDoubleTermsBucketKeys]
  }
  
  extension [Self <: AggregationsDoubleTermsBucketKeys](x: Self) {
    
    inline def setKey(value: double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKey_as_string(value: String): Self = StObject.set(x, "key_as_string", value.asInstanceOf[js.Any])
    
    inline def setKey_as_stringUndefined: Self = StObject.set(x, "key_as_string", js.undefined)
  }
}
