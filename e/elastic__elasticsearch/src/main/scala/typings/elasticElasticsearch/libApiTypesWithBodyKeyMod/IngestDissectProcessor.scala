package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestDissectProcessor
  extends StObject
     with IngestProcessorBase {
  
  var append_separator: String
  
  var field: Field
  
  var ignore_missing: Boolean
  
  var pattern: String
}
object IngestDissectProcessor {
  
  inline def apply(append_separator: String, field: Field, ignore_missing: Boolean, pattern: String): IngestDissectProcessor = {
    val __obj = js.Dynamic.literal(append_separator = append_separator.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], ignore_missing = ignore_missing.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestDissectProcessor]
  }
  
  extension [Self <: IngestDissectProcessor](x: Self) {
    
    inline def setAppend_separator(value: String): Self = StObject.set(x, "append_separator", value.asInstanceOf[js.Any])
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setIgnore_missing(value: Boolean): Self = StObject.set(x, "ignore_missing", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
  }
}
