package typings.forkTsCheckerWebpackPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/rpc/RpcHost", JSImport.Namespace)
@js.native
object rpcHostMod extends js.Object {
  @js.native
  trait RpcHost extends js.Object {
    @JSName("dispatch")
    var dispatch_Original: RpcDispatcher = js.native
    def dispatch[TMessage](message: TMessage): js.Promise[Unit] = js.native
    def register(dispatch: RpcDispatcher): Unit = js.native
  }
  
  type RpcDispatcher = js.Function1[/* message */ js.Any, js.Promise[Unit]]
}

