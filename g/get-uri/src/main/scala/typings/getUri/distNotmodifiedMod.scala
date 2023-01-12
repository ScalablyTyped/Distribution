package typings.getUri

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNotmodifiedMod {
  
  @JSImport("get-uri/dist/notmodified", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with NotModifiedError {
    def this(message: String) = this()
    
    /* CompleteClass */
    var code: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  trait NotModifiedError
    extends StObject
       with Error {
    
    var code: String
  }
  object NotModifiedError {
    
    inline def apply(code: String, message: String, name: String): NotModifiedError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotModifiedError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NotModifiedError] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
}
