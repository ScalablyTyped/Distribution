package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestProcessorBase extends StObject {
  
  var `if`: js.UndefOr[String] = js.undefined
  
  var ignore_failure: js.UndefOr[Boolean] = js.undefined
  
  var on_failure: js.UndefOr[js.Array[IngestProcessorContainer]] = js.undefined
  
  var tag: js.UndefOr[String] = js.undefined
}
object IngestProcessorBase {
  
  inline def apply(): IngestProcessorBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IngestProcessorBase]
  }
  
  extension [Self <: IngestProcessorBase](x: Self) {
    
    inline def setIf(value: String): Self = StObject.set(x, "if", value.asInstanceOf[js.Any])
    
    inline def setIfUndefined: Self = StObject.set(x, "if", js.undefined)
    
    inline def setIgnore_failure(value: Boolean): Self = StObject.set(x, "ignore_failure", value.asInstanceOf[js.Any])
    
    inline def setIgnore_failureUndefined: Self = StObject.set(x, "ignore_failure", js.undefined)
    
    inline def setOn_failure(value: js.Array[IngestProcessorContainer]): Self = StObject.set(x, "on_failure", value.asInstanceOf[js.Any])
    
    inline def setOn_failureUndefined: Self = StObject.set(x, "on_failure", js.undefined)
    
    inline def setOn_failureVarargs(value: IngestProcessorContainer*): Self = StObject.set(x, "on_failure", js.Array(value*))
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
