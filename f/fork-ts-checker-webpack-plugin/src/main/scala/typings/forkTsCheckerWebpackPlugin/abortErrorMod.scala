package typings.forkTsCheckerWebpackPlugin

import typings.nodeAbortController.mod.AbortSignal
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object abortErrorMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/utils/async/abort-error", "AbortError")
  @js.native
  open class AbortError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  object AbortError {
    
    @JSImport("fork-ts-checker-webpack-plugin/lib/utils/async/abort-error", "AbortError")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def throwIfAborted(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("throwIfAborted")().asInstanceOf[Unit]
    inline def throwIfAborted(signal: AbortSignal): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("throwIfAborted")(signal.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
