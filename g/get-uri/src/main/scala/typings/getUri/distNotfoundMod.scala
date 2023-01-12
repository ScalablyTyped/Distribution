package typings.getUri

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNotfoundMod {
  
  @JSImport("get-uri/dist/notfound", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with NotFoundError {
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NotFoundError] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
}
