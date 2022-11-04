package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsIpPrefixAggregation
  extends StObject
     with AggregationsAggregation {
  
  var append_prefix_length: js.UndefOr[Boolean] = js.undefined
  
  var field: Field
  
  var is_ipv6: js.UndefOr[Boolean] = js.undefined
  
  var keyed: js.UndefOr[Boolean] = js.undefined
  
  var min_doc_count: js.UndefOr[long] = js.undefined
  
  var prefix_length: integer
}
object AggregationsIpPrefixAggregation {
  
  inline def apply(field: Field, prefix_length: integer): AggregationsIpPrefixAggregation = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], prefix_length = prefix_length.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsIpPrefixAggregation]
  }
  
  extension [Self <: AggregationsIpPrefixAggregation](x: Self) {
    
    inline def setAppend_prefix_length(value: Boolean): Self = StObject.set(x, "append_prefix_length", value.asInstanceOf[js.Any])
    
    inline def setAppend_prefix_lengthUndefined: Self = StObject.set(x, "append_prefix_length", js.undefined)
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setIs_ipv6(value: Boolean): Self = StObject.set(x, "is_ipv6", value.asInstanceOf[js.Any])
    
    inline def setIs_ipv6Undefined: Self = StObject.set(x, "is_ipv6", js.undefined)
    
    inline def setKeyed(value: Boolean): Self = StObject.set(x, "keyed", value.asInstanceOf[js.Any])
    
    inline def setKeyedUndefined: Self = StObject.set(x, "keyed", js.undefined)
    
    inline def setMin_doc_count(value: long): Self = StObject.set(x, "min_doc_count", value.asInstanceOf[js.Any])
    
    inline def setMin_doc_countUndefined: Self = StObject.set(x, "min_doc_count", js.undefined)
    
    inline def setPrefix_length(value: integer): Self = StObject.set(x, "prefix_length", value.asInstanceOf[js.Any])
  }
}
