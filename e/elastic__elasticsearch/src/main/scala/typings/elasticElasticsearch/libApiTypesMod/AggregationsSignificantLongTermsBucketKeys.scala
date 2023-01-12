package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsSignificantLongTermsBucketKeys
  extends StObject
     with AggregationsSignificantTermsBucketBase {
  
  var key: long
  
  var key_as_string: js.UndefOr[String] = js.undefined
}
object AggregationsSignificantLongTermsBucketKeys {
  
  inline def apply(bg_count: long, doc_count: long, key: long, score: double): AggregationsSignificantLongTermsBucketKeys = {
    val __obj = js.Dynamic.literal(bg_count = bg_count.asInstanceOf[js.Any], doc_count = doc_count.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsSignificantLongTermsBucketKeys]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsSignificantLongTermsBucketKeys] (val x: Self) extends AnyVal {
    
    inline def setKey(value: long): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKey_as_string(value: String): Self = StObject.set(x, "key_as_string", value.asInstanceOf[js.Any])
    
    inline def setKey_as_stringUndefined: Self = StObject.set(x, "key_as_string", js.undefined)
  }
}
