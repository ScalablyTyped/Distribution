package typings.expo.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorAny extends StObject {
  
  var error: js.Any
}
object ErrorAny {
  
  inline def apply(error: js.Any): ErrorAny = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorAny]
  }
  
  extension [Self <: ErrorAny](x: Self) {
    
    inline def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
