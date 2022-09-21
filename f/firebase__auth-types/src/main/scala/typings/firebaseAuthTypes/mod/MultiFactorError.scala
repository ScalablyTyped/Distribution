package typings.firebaseAuthTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiFactorError
  extends StObject
     with AuthError {
  
  var resolver: MultiFactorResolver
}
object MultiFactorError {
  
  inline def apply(code: String, message: String, name: String, resolver: MultiFactorResolver): MultiFactorError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resolver = resolver.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiFactorError]
  }
  
  extension [Self <: MultiFactorError](x: Self) {
    
    inline def setResolver(value: MultiFactorResolver): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
  }
}
