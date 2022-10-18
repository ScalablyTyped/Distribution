package typings.expoConfig

import typings.expoConfig.buildConfigDottypesMod.ConfigErrorCode
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildErrorsMod {
  
  @JSImport("@expo/config/build/Errors", "ConfigError")
  @js.native
  open class ConfigError protected ()
    extends StObject
       with Error {
    def this(message: String, code: ConfigErrorCode) = this()
    def this(message: String, code: ConfigErrorCode, cause: js.Error) = this()
    
    @JSName("cause")
    var cause_ConfigError: js.UndefOr[js.Error] = js.native
    
    var code: ConfigErrorCode = js.native
    
    val isConfigError: /* true */ Boolean = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
}
