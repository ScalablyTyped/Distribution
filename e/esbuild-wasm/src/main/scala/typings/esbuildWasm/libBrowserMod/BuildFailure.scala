package typings.esbuildWasm.libBrowserMod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildFailure
  extends StObject
     with Error {
  
  var errors: js.Array[Message]
  
  var warnings: js.Array[Message]
}
object BuildFailure {
  
  inline def apply(errors: js.Array[Message], message: String, name: String, warnings: js.Array[Message]): BuildFailure = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildFailure]
  }
  
  extension [Self <: BuildFailure](x: Self) {
    
    inline def setErrors(value: js.Array[Message]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: Message*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setWarnings(value: js.Array[Message]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsVarargs(value: Message*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
