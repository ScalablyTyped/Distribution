package typings.esbuildWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnEndResult extends StObject {
  
  var errors: js.UndefOr[js.Array[PartialMessage]] = js.undefined
  
  var warnings: js.UndefOr[js.Array[PartialMessage]] = js.undefined
}
object OnEndResult {
  
  inline def apply(): OnEndResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnEndResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnEndResult] (val x: Self) extends AnyVal {
    
    inline def setErrors(value: js.Array[PartialMessage]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: PartialMessage*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setWarnings(value: js.Array[PartialMessage]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: PartialMessage*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
