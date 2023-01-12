package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestDateIndexNameProcessor
  extends StObject
     with IngestProcessorBase {
  
  var date_formats: js.Array[String]
  
  var date_rounding: String
  
  var field: Field
  
  var index_name_format: js.UndefOr[String] = js.undefined
  
  var index_name_prefix: js.UndefOr[String] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
  
  var timezone: js.UndefOr[String] = js.undefined
}
object IngestDateIndexNameProcessor {
  
  inline def apply(date_formats: js.Array[String], date_rounding: String, field: Field): IngestDateIndexNameProcessor = {
    val __obj = js.Dynamic.literal(date_formats = date_formats.asInstanceOf[js.Any], date_rounding = date_rounding.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestDateIndexNameProcessor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IngestDateIndexNameProcessor] (val x: Self) extends AnyVal {
    
    inline def setDate_formats(value: js.Array[String]): Self = StObject.set(x, "date_formats", value.asInstanceOf[js.Any])
    
    inline def setDate_formatsVarargs(value: String*): Self = StObject.set(x, "date_formats", js.Array(value*))
    
    inline def setDate_rounding(value: String): Self = StObject.set(x, "date_rounding", value.asInstanceOf[js.Any])
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setIndex_name_format(value: String): Self = StObject.set(x, "index_name_format", value.asInstanceOf[js.Any])
    
    inline def setIndex_name_formatUndefined: Self = StObject.set(x, "index_name_format", js.undefined)
    
    inline def setIndex_name_prefix(value: String): Self = StObject.set(x, "index_name_prefix", value.asInstanceOf[js.Any])
    
    inline def setIndex_name_prefixUndefined: Self = StObject.set(x, "index_name_prefix", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
  }
}
