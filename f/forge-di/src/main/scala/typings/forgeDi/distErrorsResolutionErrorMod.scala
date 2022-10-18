package typings.forgeDi

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distErrorsResolutionErrorMod {
  
  @JSImport("forge-di/dist/errors/ResolutionError", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ResolutionError {
    def this(name: String, hint: Any, context: typings.forgeDi.distFrameworkContextMod.default, message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  trait ResolutionError
    extends StObject
       with Error
  object ResolutionError {
    
    inline def apply(message: String, name: String): ResolutionError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolutionError]
    }
  }
}
