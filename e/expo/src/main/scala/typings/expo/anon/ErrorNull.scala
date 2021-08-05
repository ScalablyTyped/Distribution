package typings.expo.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorNull extends StObject {
  
  var error: Null
}
object ErrorNull {
  
  inline def apply(error: Null): ErrorNull = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorNull]
  }
  
  extension [Self <: ErrorNull](x: Self) {
    
    inline def setError(value: Null): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
