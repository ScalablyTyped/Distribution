package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestSetProcessor
  extends StObject
     with IngestProcessorBase {
  
  var field: Field
  
  var `override`: js.UndefOr[Boolean] = js.undefined
  
  var value: Any
}
object IngestSetProcessor {
  
  inline def apply(field: Field, value: Any): IngestSetProcessor = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestSetProcessor]
  }
  
  extension [Self <: IngestSetProcessor](x: Self) {
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setOverride(value: Boolean): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
    
    inline def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
