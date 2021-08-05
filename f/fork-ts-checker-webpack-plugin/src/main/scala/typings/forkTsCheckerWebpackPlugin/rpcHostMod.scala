package typings.forkTsCheckerWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rpcHostMod {
  
  type RpcDispatcher = js.Function1[/* message */ js.Any, js.Promise[Unit]]
  
  trait RpcHost extends StObject {
    
    def dispatch[TMessage](message: TMessage): js.Promise[Unit]
    @JSName("dispatch")
    var dispatch_Original: RpcDispatcher
    
    def register(dispatch: RpcDispatcher): Unit
  }
  object RpcHost {
    
    inline def apply(dispatch: /* message */ js.Any => js.Promise[Unit], register: RpcDispatcher => Unit): RpcHost = {
      val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), register = js.Any.fromFunction1(register))
      __obj.asInstanceOf[RpcHost]
    }
    
    extension [Self <: RpcHost](x: Self) {
      
      inline def setDispatch(value: /* message */ js.Any => js.Promise[Unit]): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      inline def setRegister(value: RpcDispatcher => Unit): Self = StObject.set(x, "register", js.Any.fromFunction1(value))
    }
  }
}
