package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestDotExpanderProcessor
  extends StObject
     with IngestProcessorBase {
  
  var field: Field
  
  var path: js.UndefOr[String] = js.undefined
}
object IngestDotExpanderProcessor {
  
  inline def apply(field: Field): IngestDotExpanderProcessor = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestDotExpanderProcessor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IngestDotExpanderProcessor] (val x: Self) extends AnyVal {
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
