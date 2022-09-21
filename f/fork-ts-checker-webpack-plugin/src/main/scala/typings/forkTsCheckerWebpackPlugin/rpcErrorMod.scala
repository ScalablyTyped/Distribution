package typings.forkTsCheckerWebpackPlugin

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rpcErrorMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/rpc/rpc-error", "RpcExitError")
  @js.native
  open class RpcExitError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    def this(message: String, code: String) = this()
    def this(message: String, code: Double) = this()
    def this(message: String, code: String, signal: String) = this()
    def this(message: String, code: Double, signal: String) = this()
    def this(message: String, code: Null, signal: String) = this()
    def this(message: String, code: Unit, signal: String) = this()
    
    val code: js.UndefOr[String | Double | Null] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    val signal: js.UndefOr[String | Null] = js.native
  }
}
