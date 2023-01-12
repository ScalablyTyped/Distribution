package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestDissectProcessor
  extends StObject
     with IngestProcessorBase {
  
  var append_separator: js.UndefOr[String] = js.undefined
  
  var field: Field
  
  var ignore_missing: js.UndefOr[Boolean] = js.undefined
  
  var pattern: String
}
object IngestDissectProcessor {
  
  inline def apply(field: Field, pattern: String): IngestDissectProcessor = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestDissectProcessor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IngestDissectProcessor] (val x: Self) extends AnyVal {
    
    inline def setAppend_separator(value: String): Self = StObject.set(x, "append_separator", value.asInstanceOf[js.Any])
    
    inline def setAppend_separatorUndefined: Self = StObject.set(x, "append_separator", js.undefined)
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setIgnore_missing(value: Boolean): Self = StObject.set(x, "ignore_missing", value.asInstanceOf[js.Any])
    
    inline def setIgnore_missingUndefined: Self = StObject.set(x, "ignore_missing", js.undefined)
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
  }
}
