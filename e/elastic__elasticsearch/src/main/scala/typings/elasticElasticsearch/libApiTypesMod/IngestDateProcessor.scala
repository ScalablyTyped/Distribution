package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestDateProcessor
  extends StObject
     with IngestProcessorBase {
  
  var field: Field
  
  var formats: js.Array[String]
  
  var locale: js.UndefOr[String] = js.undefined
  
  var target_field: js.UndefOr[Field] = js.undefined
  
  var timezone: js.UndefOr[String] = js.undefined
}
object IngestDateProcessor {
  
  inline def apply(field: Field, formats: js.Array[String]): IngestDateProcessor = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], formats = formats.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestDateProcessor]
  }
  
  extension [Self <: IngestDateProcessor](x: Self) {
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFormats(value: js.Array[String]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    inline def setFormatsVarargs(value: String*): Self = StObject.set(x, "formats", js.Array(value*))
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setTarget_field(value: Field): Self = StObject.set(x, "target_field", value.asInstanceOf[js.Any])
    
    inline def setTarget_fieldUndefined: Self = StObject.set(x, "target_field", js.undefined)
    
    inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
  }
}
