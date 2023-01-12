package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsVariableWidthHistogramBucketKeys
  extends StObject
     with AggregationsMultiBucketBase {
  
  var key: double
  
  var key_as_string: js.UndefOr[String] = js.undefined
  
  var max: double
  
  var max_as_string: js.UndefOr[String] = js.undefined
  
  var min: double
  
  var min_as_string: js.UndefOr[String] = js.undefined
}
object AggregationsVariableWidthHistogramBucketKeys {
  
  inline def apply(doc_count: long, key: double, max: double, min: double): AggregationsVariableWidthHistogramBucketKeys = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsVariableWidthHistogramBucketKeys]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsVariableWidthHistogramBucketKeys] (val x: Self) extends AnyVal {
    
    inline def setKey(value: double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKey_as_string(value: String): Self = StObject.set(x, "key_as_string", value.asInstanceOf[js.Any])
    
    inline def setKey_as_stringUndefined: Self = StObject.set(x, "key_as_string", js.undefined)
    
    inline def setMax(value: double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMax_as_string(value: String): Self = StObject.set(x, "max_as_string", value.asInstanceOf[js.Any])
    
    inline def setMax_as_stringUndefined: Self = StObject.set(x, "max_as_string", js.undefined)
    
    inline def setMin(value: double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMin_as_string(value: String): Self = StObject.set(x, "min_as_string", value.asInstanceOf[js.Any])
    
    inline def setMin_as_stringUndefined: Self = StObject.set(x, "min_as_string", js.undefined)
  }
}
