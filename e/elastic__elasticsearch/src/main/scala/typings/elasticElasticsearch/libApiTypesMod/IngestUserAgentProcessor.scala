package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestUserAgentProcessor
  extends StObject
     with IngestProcessorBase {
  
  var field: Field
  
  var ignore_missing: js.UndefOr[Boolean] = js.undefined
  
  var options: js.UndefOr[js.Array[IngestUserAgentProperty]] = js.undefined
  
  var regex_file: js.UndefOr[String] = js.undefined
  
  var target_field: js.UndefOr[Field] = js.undefined
}
object IngestUserAgentProcessor {
  
  inline def apply(field: Field): IngestUserAgentProcessor = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestUserAgentProcessor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IngestUserAgentProcessor] (val x: Self) extends AnyVal {
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setIgnore_missing(value: Boolean): Self = StObject.set(x, "ignore_missing", value.asInstanceOf[js.Any])
    
    inline def setIgnore_missingUndefined: Self = StObject.set(x, "ignore_missing", js.undefined)
    
    inline def setOptions(value: js.Array[IngestUserAgentProperty]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: IngestUserAgentProperty*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setRegex_file(value: String): Self = StObject.set(x, "regex_file", value.asInstanceOf[js.Any])
    
    inline def setRegex_fileUndefined: Self = StObject.set(x, "regex_file", js.undefined)
    
    inline def setTarget_field(value: Field): Self = StObject.set(x, "target_field", value.asInstanceOf[js.Any])
    
    inline def setTarget_fieldUndefined: Self = StObject.set(x, "target_field", js.undefined)
  }
}
