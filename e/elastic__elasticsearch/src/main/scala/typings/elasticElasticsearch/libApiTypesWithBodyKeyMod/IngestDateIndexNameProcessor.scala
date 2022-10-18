package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestDateIndexNameProcessor
  extends StObject
     with IngestProcessorBase {
  
  var date_formats: js.Array[String]
  
  var date_rounding: String
  
  var field: Field
  
  var index_name_format: String
  
  var index_name_prefix: String
  
  var locale: String
  
  var timezone: String
}
object IngestDateIndexNameProcessor {
  
  inline def apply(
    date_formats: js.Array[String],
    date_rounding: String,
    field: Field,
    index_name_format: String,
    index_name_prefix: String,
    locale: String,
    timezone: String
  ): IngestDateIndexNameProcessor = {
    val __obj = js.Dynamic.literal(date_formats = date_formats.asInstanceOf[js.Any], date_rounding = date_rounding.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], index_name_format = index_name_format.asInstanceOf[js.Any], index_name_prefix = index_name_prefix.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestDateIndexNameProcessor]
  }
  
  extension [Self <: IngestDateIndexNameProcessor](x: Self) {
    
    inline def setDate_formats(value: js.Array[String]): Self = StObject.set(x, "date_formats", value.asInstanceOf[js.Any])
    
    inline def setDate_formatsVarargs(value: String*): Self = StObject.set(x, "date_formats", js.Array(value*))
    
    inline def setDate_rounding(value: String): Self = StObject.set(x, "date_rounding", value.asInstanceOf[js.Any])
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setIndex_name_format(value: String): Self = StObject.set(x, "index_name_format", value.asInstanceOf[js.Any])
    
    inline def setIndex_name_prefix(value: String): Self = StObject.set(x, "index_name_prefix", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
  }
}
