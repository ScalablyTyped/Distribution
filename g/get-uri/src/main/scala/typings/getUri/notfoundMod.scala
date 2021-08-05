package typings.getUri

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notfoundMod {
  
  @JSImport("get-uri/dist/notfound", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with NotFoundError {
    def this(message: String) = this()
    
    /* CompleteClass */
    var code: String = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  trait NotFoundError
    extends StObject
       with Error {
    
    var code: String
  }
  object NotFoundError {
    
    inline def apply(code: String, message: String, name: String): NotFoundError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotFoundError]
    }
    
    extension [Self <: NotFoundError](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
}
