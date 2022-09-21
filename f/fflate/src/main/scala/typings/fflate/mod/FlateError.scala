package typings.fflate.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlateError
  extends StObject
     with Error {
  
  /**
    * The code associated with this error
    */
  var code: Double
}
object FlateError {
  
  inline def apply(code: Double, message: String, name: String): FlateError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlateError]
  }
  
  extension [Self <: FlateError](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
  }
}
