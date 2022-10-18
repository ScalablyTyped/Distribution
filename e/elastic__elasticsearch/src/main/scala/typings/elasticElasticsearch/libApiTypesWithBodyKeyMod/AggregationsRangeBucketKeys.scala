package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsRangeBucketKeys
  extends StObject
     with AggregationsMultiBucketBase {
  
  var from: js.UndefOr[double] = js.undefined
  
  var from_as_string: js.UndefOr[String] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var to: js.UndefOr[double] = js.undefined
  
  var to_as_string: js.UndefOr[String] = js.undefined
}
object AggregationsRangeBucketKeys {
  
  inline def apply(doc_count: long): AggregationsRangeBucketKeys = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsRangeBucketKeys]
  }
  
  extension [Self <: AggregationsRangeBucketKeys](x: Self) {
    
    inline def setFrom(value: double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setFrom_as_string(value: String): Self = StObject.set(x, "from_as_string", value.asInstanceOf[js.Any])
    
    inline def setFrom_as_stringUndefined: Self = StObject.set(x, "from_as_string", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setTo(value: double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    inline def setTo_as_string(value: String): Self = StObject.set(x, "to_as_string", value.asInstanceOf[js.Any])
    
    inline def setTo_as_stringUndefined: Self = StObject.set(x, "to_as_string", js.undefined)
  }
}
