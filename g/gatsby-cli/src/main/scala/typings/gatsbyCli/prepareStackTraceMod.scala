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
  class ErrorWithCodeFrame protected ()
    extends StObject
       with Error {
    def this(error: Error) = this()
    
    var codeFrame: String = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @scala.inline
  def prepareStackTrace(error: Error, source: String): js.Promise[ErrorWithCodeFrame] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareStackTrace")(error.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ErrorWithCodeFrame]]
}
