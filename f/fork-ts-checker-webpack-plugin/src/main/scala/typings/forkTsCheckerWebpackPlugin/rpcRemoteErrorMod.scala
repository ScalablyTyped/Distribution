package typings.forkTsCheckerWebpackPlugin

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rpcRemoteErrorMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/rpc/error/RpcRemoteError", "RpcRemoteError")
  @js.native
  class RpcRemoteError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    def this(message: String, stack: String) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
}
