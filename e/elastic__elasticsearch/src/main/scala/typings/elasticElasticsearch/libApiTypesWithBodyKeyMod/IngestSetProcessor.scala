package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestSetProcessor
  extends StObject
     with IngestProcessorBase {
  
  var copy_from: js.UndefOr[Field] = js.undefined
  
  var field: Field
  
  var ignore_empty_value: js.UndefOr[Boolean] = js.undefined
  
  var media_type: js.UndefOr[String] = js.undefined
  
  var `override`: js.UndefOr[Boolean] = js.undefined
  
  var value: js.UndefOr[Any] = js.undefined
}
object IngestSetProcessor {
  
  inline def apply(field: Field): IngestSetProcessor = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestSetProcessor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IngestSetProcessor] (val x: Self) extends AnyVal {
    
    inline def setCopy_from(value: Field): Self = StObject.set(x, "copy_from", value.asInstanceOf[js.Any])
    
    inline def setCopy_fromUndefined: Self = StObject.set(x, "copy_from", js.undefined)
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setIgnore_empty_value(value: Boolean): Self = StObject.set(x, "ignore_empty_value", value.asInstanceOf[js.Any])
    
    inline def setIgnore_empty_valueUndefined: Self = StObject.set(x, "ignore_empty_value", js.undefined)
    
    inline def setMedia_type(value: String): Self = StObject.set(x, "media_type", value.asInstanceOf[js.Any])
    
    inline def setMedia_typeUndefined: Self = StObject.set(x, "media_type", js.undefined)
    
    inline def setOverride(value: Boolean): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
    
    inline def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
