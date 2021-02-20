package typings.firebaseAuthTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiFactorError extends AuthError {
  
  var resolver: MultiFactorResolver = js.native
}
object MultiFactorError {
  
  @scala.inline
  def apply(code: String, message: String, resolver: MultiFactorResolver): MultiFactorError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], resolver = resolver.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiFactorError]
  }
  
  @scala.inline
  implicit class MultiFactorErrorMutableBuilder[Self <: MultiFactorError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResolver(value: MultiFactorResolver): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
  }
}
