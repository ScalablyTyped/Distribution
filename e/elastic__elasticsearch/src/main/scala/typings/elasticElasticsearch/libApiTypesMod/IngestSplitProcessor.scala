package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestSplitProcessor
  extends StObject
     with IngestProcessorBase {
  
  var field: Field
  
  var ignore_missing: js.UndefOr[Boolean] = js.undefined
  
  var preserve_trailing: js.UndefOr[Boolean] = js.undefined
  
  var separator: String
  
  var target_field: js.UndefOr[Field] = js.undefined
}
object IngestSplitProcessor {
  
  inline def apply(field: Field, separator: String): IngestSplitProcessor = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestSplitProcessor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IngestSplitProcessor] (val x: Self) extends AnyVal {
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setIgnore_missing(value: Boolean): Self = StObject.set(x, "ignore_missing", value.asInstanceOf[js.Any])
    
    inline def setIgnore_missingUndefined: Self = StObject.set(x, "ignore_missing", js.undefined)
    
    inline def setPreserve_trailing(value: Boolean): Self = StObject.set(x, "preserve_trailing", value.asInstanceOf[js.Any])
    
    inline def setPreserve_trailingUndefined: Self = StObject.set(x, "preserve_trailing", js.undefined)
    
    inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setTarget_field(value: Field): Self = StObject.set(x, "target_field", value.asInstanceOf[js.Any])
    
    inline def setTarget_fieldUndefined: Self = StObject.set(x, "target_field", js.undefined)
  }
}
