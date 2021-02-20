package typings.getUri

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notmodifiedMod {
  
  @JSImport("get-uri/dist/notmodified", JSImport.Default)
  @js.native
  class default () extends NotModifiedError {
    def this(message: String) = this()
  }
  
  @js.native
  trait NotModifiedError extends Error {
    
    var code: String = js.native
  }
  object NotModifiedError {
    
    @scala.inline
    def apply(code: String, message: String, name: String): NotModifiedError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotModifiedError]
    }
    
    @scala.inline
    implicit class NotModifiedErrorMutableBuilder[Self <: NotModifiedError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
}
