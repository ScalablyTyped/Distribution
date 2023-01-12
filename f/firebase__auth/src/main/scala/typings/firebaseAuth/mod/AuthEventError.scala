package typings.firebaseAuth.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Excluded from this release type: AuthErrorParams */
/* Excluded from this release type: AuthEvent */
/* Excluded from this release type: AuthEventConsumer */
trait AuthEventError
  extends StObject
     with Error {
  
  var code: String
}
object AuthEventError {
  
  inline def apply(code: String, message: String, name: String): AuthEventError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthEventError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthEventError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
  }
}
