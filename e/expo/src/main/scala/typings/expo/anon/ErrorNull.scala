package typings.expo.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorNull extends StObject {
  
  var error: Null = js.native
}
object ErrorNull {
  
  @scala.inline
  def apply(error: Null): ErrorNull = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorNull]
  }
  
  @scala.inline
  implicit class ErrorNullMutableBuilder[Self <: ErrorNull] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: Null): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
