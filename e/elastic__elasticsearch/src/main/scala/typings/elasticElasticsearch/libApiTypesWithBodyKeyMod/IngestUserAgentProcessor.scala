package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestUserAgentProcessor
  extends StObject
     with IngestProcessorBase {
  
  var field: Field
  
  var ignore_missing: Boolean
  
  var options: js.Array[IngestUserAgentProperty]
  
  var regex_file: String
  
  var target_field: Field
}
object IngestUserAgentProcessor {
  
  inline def apply(
    field: Field,
    ignore_missing: Boolean,
    options: js.Array[IngestUserAgentProperty],
    regex_file: String,
    target_field: Field
  ): IngestUserAgentProcessor = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], ignore_missing = ignore_missing.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], regex_file = regex_file.asInstanceOf[js.Any], target_field = target_field.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestUserAgentProcessor]
  }
  
  extension [Self <: IngestUserAgentProcessor](x: Self) {
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setIgnore_missing(value: Boolean): Self = StObject.set(x, "ignore_missing", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: js.Array[IngestUserAgentProperty]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: IngestUserAgentProperty*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setRegex_file(value: String): Self = StObject.set(x, "regex_file", value.asInstanceOf[js.Any])
    
    inline def setTarget_field(value: Field): Self = StObject.set(x, "target_field", value.asInstanceOf[js.Any])
  }
}
