package typings.getUri

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpErrorMod {
  
  @JSImport("get-uri/dist/http-error", JSImport.Default)
  @js.native
  class default protected () extends HTTPError {
    def this(statusCode: Double) = this()
    def this(statusCode: Double, message: String) = this()
  }
  
  @js.native
  trait HTTPError extends Error {
    
    var code: String = js.native
    
    var statusCode: Double = js.native
  }
  object HTTPError {
    
    @scala.inline
    def apply(code: String, message: String, name: String, statusCode: Double): HTTPError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[HTTPError]
    }
    
    @scala.inline
    implicit class HTTPErrorMutableBuilder[Self <: HTTPError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
}
