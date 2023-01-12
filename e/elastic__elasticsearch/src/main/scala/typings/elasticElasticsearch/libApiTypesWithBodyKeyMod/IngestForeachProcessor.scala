package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestForeachProcessor
  extends StObject
     with IngestProcessorBase {
  
  var field: Field
  
  var ignore_missing: js.UndefOr[Boolean] = js.undefined
  
  var processor: IngestProcessorContainer
}
object IngestForeachProcessor {
  
  inline def apply(field: Field, processor: IngestProcessorContainer): IngestForeachProcessor = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], processor = processor.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestForeachProcessor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IngestForeachProcessor] (val x: Self) extends AnyVal {
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setIgnore_missing(value: Boolean): Self = StObject.set(x, "ignore_missing", value.asInstanceOf[js.Any])
    
    inline def setIgnore_missingUndefined: Self = StObject.set(x, "ignore_missing", js.undefined)
    
    inline def setProcessor(value: IngestProcessorContainer): Self = StObject.set(x, "processor", value.asInstanceOf[js.Any])
  }
}
