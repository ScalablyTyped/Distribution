package typings.esbuildWasm.browserMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnStartResult extends StObject {
  
  var errors: js.UndefOr[js.Array[PartialMessage]] = js.undefined
  
  var warnings: js.UndefOr[js.Array[PartialMessage]] = js.undefined
}
object OnStartResult {
  
  inline def apply(): OnStartResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnStartResult]
  }
  
  extension [Self <: OnStartResult](x: Self) {
    
    inline def setErrors(value: js.Array[PartialMessage]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: PartialMessage*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setWarnings(value: js.Array[PartialMessage]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: PartialMessage*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
