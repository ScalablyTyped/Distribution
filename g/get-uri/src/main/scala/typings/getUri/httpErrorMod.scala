package typings.getUri

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpErrorMod {
  
  @JSImport("get-uri/dist/http-error", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with HTTPError {
    def this(statusCode: Double) = this()
    def this(statusCode: Double, message: String) = this()
    
    /* CompleteClass */
    var code: String = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var statusCode: Double = js.native
  }
  
  trait HTTPError
    extends StObject
       with Error {
    
    var code: String
    
    var statusCode: Double
  }
  object HTTPError {
    
    inline def apply(code: String, message: String, name: String, statusCode: Double): HTTPError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[HTTPError]
    }
    
    extension [Self <: HTTPError](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
}
