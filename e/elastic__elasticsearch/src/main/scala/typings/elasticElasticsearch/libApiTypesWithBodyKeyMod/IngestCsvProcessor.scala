package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestCsvProcessor
  extends StObject
     with IngestProcessorBase {
  
  var description: js.UndefOr[String] = js.undefined
  
  var empty_value: Any
  
  var field: Field
  
  var ignore_missing: js.UndefOr[Boolean] = js.undefined
  
  var quote: js.UndefOr[String] = js.undefined
  
  var separator: js.UndefOr[String] = js.undefined
  
  var target_fields: Fields
  
  var trim: Boolean
}
object IngestCsvProcessor {
  
  inline def apply(empty_value: Any, field: Field, target_fields: Fields, trim: Boolean): IngestCsvProcessor = {
    val __obj = js.Dynamic.literal(empty_value = empty_value.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], target_fields = target_fields.asInstanceOf[js.Any], trim = trim.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestCsvProcessor]
  }
  
  extension [Self <: IngestCsvProcessor](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEmpty_value(value: Any): Self = StObject.set(x, "empty_value", value.asInstanceOf[js.Any])
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setIgnore_missing(value: Boolean): Self = StObject.set(x, "ignore_missing", value.asInstanceOf[js.Any])
    
    inline def setIgnore_missingUndefined: Self = StObject.set(x, "ignore_missing", js.undefined)
    
    inline def setQuote(value: String): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
    
    inline def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
    
    inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    
    inline def setTarget_fields(value: Fields): Self = StObject.set(x, "target_fields", value.asInstanceOf[js.Any])
    
    inline def setTarget_fieldsVarargs(value: Field*): Self = StObject.set(x, "target_fields", js.Array(value*))
    
    inline def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
  }
}
