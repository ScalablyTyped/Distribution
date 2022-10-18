package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestKeyValueProcessor
  extends StObject
     with IngestProcessorBase {
  
  var exclude_keys: js.UndefOr[js.Array[String]] = js.undefined
  
  var field: Field
  
  var field_split: String
  
  var ignore_missing: js.UndefOr[Boolean] = js.undefined
  
  var include_keys: js.UndefOr[js.Array[String]] = js.undefined
  
  var prefix: js.UndefOr[String] = js.undefined
  
  var strip_brackets: js.UndefOr[Boolean] = js.undefined
  
  var target_field: js.UndefOr[Field] = js.undefined
  
  var trim_key: js.UndefOr[String] = js.undefined
  
  var trim_value: js.UndefOr[String] = js.undefined
  
  var value_split: String
}
object IngestKeyValueProcessor {
  
  inline def apply(field: Field, field_split: String, value_split: String): IngestKeyValueProcessor = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], field_split = field_split.asInstanceOf[js.Any], value_split = value_split.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestKeyValueProcessor]
  }
  
  extension [Self <: IngestKeyValueProcessor](x: Self) {
    
    inline def setExclude_keys(value: js.Array[String]): Self = StObject.set(x, "exclude_keys", value.asInstanceOf[js.Any])
    
    inline def setExclude_keysUndefined: Self = StObject.set(x, "exclude_keys", js.undefined)
    
    inline def setExclude_keysVarargs(value: String*): Self = StObject.set(x, "exclude_keys", js.Array(value*))
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setField_split(value: String): Self = StObject.set(x, "field_split", value.asInstanceOf[js.Any])
    
    inline def setIgnore_missing(value: Boolean): Self = StObject.set(x, "ignore_missing", value.asInstanceOf[js.Any])
    
    inline def setIgnore_missingUndefined: Self = StObject.set(x, "ignore_missing", js.undefined)
    
    inline def setInclude_keys(value: js.Array[String]): Self = StObject.set(x, "include_keys", value.asInstanceOf[js.Any])
    
    inline def setInclude_keysUndefined: Self = StObject.set(x, "include_keys", js.undefined)
    
    inline def setInclude_keysVarargs(value: String*): Self = StObject.set(x, "include_keys", js.Array(value*))
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setStrip_brackets(value: Boolean): Self = StObject.set(x, "strip_brackets", value.asInstanceOf[js.Any])
    
    inline def setStrip_bracketsUndefined: Self = StObject.set(x, "strip_brackets", js.undefined)
    
    inline def setTarget_field(value: Field): Self = StObject.set(x, "target_field", value.asInstanceOf[js.Any])
    
    inline def setTarget_fieldUndefined: Self = StObject.set(x, "target_field", js.undefined)
    
    inline def setTrim_key(value: String): Self = StObject.set(x, "trim_key", value.asInstanceOf[js.Any])
    
    inline def setTrim_keyUndefined: Self = StObject.set(x, "trim_key", js.undefined)
    
    inline def setTrim_value(value: String): Self = StObject.set(x, "trim_value", value.asInstanceOf[js.Any])
    
    inline def setTrim_valueUndefined: Self = StObject.set(x, "trim_value", js.undefined)
    
    inline def setValue_split(value: String): Self = StObject.set(x, "value_split", value.asInstanceOf[js.Any])
  }
}
