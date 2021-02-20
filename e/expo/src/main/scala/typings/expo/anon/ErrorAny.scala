package typings.expo.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorAny extends StObject {
  
  var error: js.Any = js.native
}
object ErrorAny {
  
  @scala.inline
  def apply(error: js.Any): ErrorAny = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorAny]
  }
  
  @scala.inline
  implicit class ErrorAnyMutableBuilder[Self <: ErrorAny] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
