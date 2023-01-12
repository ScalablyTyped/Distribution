package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestAppendProcessor
  extends StObject
     with IngestProcessorBase {
  
  var allow_duplicates: js.UndefOr[Boolean] = js.undefined
  
  var field: Field
  
  var value: js.Array[Any]
}
object IngestAppendProcessor {
  
  inline def apply(field: Field, value: js.Array[Any]): IngestAppendProcessor = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestAppendProcessor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IngestAppendProcessor] (val x: Self) extends AnyVal {
    
    inline def setAllow_duplicates(value: Boolean): Self = StObject.set(x, "allow_duplicates", value.asInstanceOf[js.Any])
    
    inline def setAllow_duplicatesUndefined: Self = StObject.set(x, "allow_duplicates", js.undefined)
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Array[Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: Any*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
