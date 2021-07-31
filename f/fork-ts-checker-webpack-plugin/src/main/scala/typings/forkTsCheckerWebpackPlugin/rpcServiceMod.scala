package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.rpcMessagePortMod.RpcMessagePort
import typings.forkTsCheckerWebpackPlugin.rpcProcedureMod.RpcProcedure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rpcServiceMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/rpc/RpcService", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createRpcService(port: RpcMessagePort): RpcService = ^.asInstanceOf[js.Dynamic].applyDynamic("createRpcService")(port.asInstanceOf[js.Any]).asInstanceOf[RpcService]
  
  type RpcCallHandler[TPayload, TResult] = js.Function1[/* payload */ TPayload, js.Promise[TResult]]
  
  trait RpcService extends StObject {
    
    def addCallHandler[TPayload, TResult](procedure: RpcProcedure[TPayload, TResult], handler: RpcCallHandler[TPayload, TResult]): Unit
    
    def close(): js.Promise[Unit]
    
    def isOpen(): Boolean
    
    def open(): js.Promise[Unit]
    
    def removeCallHandler[TPayload, TResult](procedure: RpcProcedure[TPayload, TResult]): Unit
  }
  object RpcService {
    
    @scala.inline
    def apply(
      addCallHandler: (RpcProcedure[js.Any, js.Any], RpcCallHandler[js.Any, js.Any]) => Unit,
      close: () => js.Promise[Unit],
      isOpen: () => Boolean,
      open: () => js.Promise[Unit],
      removeCallHandler: RpcProcedure[js.Any, js.Any] => Unit
    ): RpcService = {
      val __obj = js.Dynamic.literal(addCallHandler = js.Any.fromFunction2(addCallHandler), close = js.Any.fromFunction0(close), isOpen = js.Any.fromFunction0(isOpen), open = js.Any.fromFunction0(open), removeCallHandler = js.Any.fromFunction1(removeCallHandler))
      __obj.asInstanceOf[RpcService]
    }
    
    @scala.inline
    implicit class RpcServiceMutableBuilder[Self <: RpcService] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddCallHandler(value: (RpcProcedure[js.Any, js.Any], RpcCallHandler[js.Any, js.Any]) => Unit): Self = StObject.set(x, "addCallHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsOpen(value: () => Boolean): Self = StObject.set(x, "isOpen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOpen(value: () => js.Promise[Unit]): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveCallHandler(value: RpcProcedure[js.Any, js.Any] => Unit): Self = StObject.set(x, "removeCallHandler", js.Any.fromFunction1(value))
    }
  }
}
