package typings.forgeDi

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distErrorsConfigurationErrorMod {
  
  @JSImport("forge-di/dist/errors/ConfigurationError", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ConfigurationError {
    def this(name: String, message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  trait ConfigurationError
    extends StObject
       with Error
  object ConfigurationError {
    
    inline def apply(message: String, name: String): ConfigurationError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigurationError]
    }
  }
}
