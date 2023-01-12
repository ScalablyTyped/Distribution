package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestAttachmentProcessor
  extends StObject
     with IngestProcessorBase {
  
  var field: Field
  
  var ignore_missing: js.UndefOr[Boolean] = js.undefined
  
  var indexed_chars: js.UndefOr[long] = js.undefined
  
  var indexed_chars_field: js.UndefOr[Field] = js.undefined
  
  var properties: js.UndefOr[js.Array[String]] = js.undefined
  
  var resource_name: js.UndefOr[String] = js.undefined
  
  var target_field: js.UndefOr[Field] = js.undefined
}
object IngestAttachmentProcessor {
  
  inline def apply(field: Field): IngestAttachmentProcessor = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestAttachmentProcessor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IngestAttachmentProcessor] (val x: Self) extends AnyVal {
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setIgnore_missing(value: Boolean): Self = StObject.set(x, "ignore_missing", value.asInstanceOf[js.Any])
    
    inline def setIgnore_missingUndefined: Self = StObject.set(x, "ignore_missing", js.undefined)
    
    inline def setIndexed_chars(value: long): Self = StObject.set(x, "indexed_chars", value.asInstanceOf[js.Any])
    
    inline def setIndexed_charsUndefined: Self = StObject.set(x, "indexed_chars", js.undefined)
    
    inline def setIndexed_chars_field(value: Field): Self = StObject.set(x, "indexed_chars_field", value.asInstanceOf[js.Any])
    
    inline def setIndexed_chars_fieldUndefined: Self = StObject.set(x, "indexed_chars_field", js.undefined)
    
    inline def setProperties(value: js.Array[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(value: String*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setResource_name(value: String): Self = StObject.set(x, "resource_name", value.asInstanceOf[js.Any])
    
    inline def setResource_nameUndefined: Self = StObject.set(x, "resource_name", js.undefined)
    
    inline def setTarget_field(value: Field): Self = StObject.set(x, "target_field", value.asInstanceOf[js.Any])
    
    inline def setTarget_fieldUndefined: Self = StObject.set(x, "target_field", js.undefined)
  }
}
