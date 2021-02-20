package typings.forkTsCheckerWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rpcHostMod {
  
  type RpcDispatcher = js.Function1[/* message */ js.Any, js.Promise[Unit]]
  
  @js.native
  trait RpcHost extends StObject {
    
    def dispatch[TMessage](message: TMessage): js.Promise[Unit] = js.native
    @JSName("dispatch")
    var dispatch_Original: RpcDispatcher = js.native
    
    def register(dispatch: RpcDispatcher): Unit = js.native
  }
}
