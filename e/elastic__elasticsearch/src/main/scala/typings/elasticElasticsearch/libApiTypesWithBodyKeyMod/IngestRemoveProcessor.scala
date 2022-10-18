package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestRemoveProcessor
  extends StObject
     with IngestProcessorBase {
  
  var field: Fields
  
  var ignore_missing: js.UndefOr[Boolean] = js.undefined
}
object IngestRemoveProcessor {
  
  inline def apply(field: Fields): IngestRemoveProcessor = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestRemoveProcessor]
  }
  
  extension [Self <: IngestRemoveProcessor](x: Self) {
    
    inline def setField(value: Fields): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldVarargs(value: Field*): Self = StObject.set(x, "field", js.Array(value*))
    
    inline def setIgnore_missing(value: Boolean): Self = StObject.set(x, "ignore_missing", value.asInstanceOf[js.Any])
    
    inline def setIgnore_missingUndefined: Self = StObject.set(x, "ignore_missing", js.undefined)
  }
}
