package typings.forkTsCheckerWebpackPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fork-ts-checker-webpack-plugin/lib/rpc/RpcHost", JSImport.Namespace)
@js.native
object rpcHostMod extends js.Object {
  
  @js.native
  trait RpcHost extends js.Object {
    
    def dispatch[TMessage](message: TMessage): js.Promise[Unit] = js.native
    @JSName("dispatch")
    var dispatch_Original: RpcDispatcher = js.native
    
    def register(dispatch: RpcDispatcher): Unit = js.native
  }
  
  type RpcDispatcher = js.Function1[/* message */ js.Any, js.Promise[Unit]]
}
