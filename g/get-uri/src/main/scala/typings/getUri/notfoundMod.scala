package typings.getUri

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notfoundMod {
  
  @JSImport("get-uri/dist/notfound", JSImport.Default)
  @js.native
  class default () extends NotFoundError {
    def this(message: String) = this()
  }
  
  @js.native
  trait NotFoundError extends Error {
    
    var code: String = js.native
  }
  object NotFoundError {
    
    @scala.inline
    def apply(code: String, message: String, name: String): NotFoundError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotFoundError]
    }
    
    @scala.inline
    implicit class NotFoundErrorMutableBuilder[Self <: NotFoundError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
}
