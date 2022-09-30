package typings.gatsbyCli

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prepareStackTraceMod {
  
  @JSImport("gatsby-cli/lib/reporter/prepare-stack-trace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("gatsby-cli/lib/reporter/prepare-stack-trace", "ErrorWithCodeFrame")
  @js.native
  open class ErrorWithCodeFrame protected ()
    extends StObject
       with Error {
    def this(error: js.Error) = this()
    
    var codeFrame: js.UndefOr[String] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def prepareStackTrace(error: js.Error, sourceOfMainMap: String): ErrorWithCodeFrame = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareStackTrace")(error.asInstanceOf[js.Any], sourceOfMainMap.asInstanceOf[js.Any])).asInstanceOf[ErrorWithCodeFrame]
}
