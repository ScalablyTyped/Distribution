package typings.forkTsCheckerWebpackPlugin

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rpcMessagePortMod {
  
  type RpcErrorListener = js.Function1[/* error */ Error, Unit]
  
  type RpcMessageDispatch = js.Function1[/* message */ js.Any, js.Promise[Unit]]
  
  type RpcMessageListener = RpcMessageDispatch
  
  @js.native
  trait RpcMessagePort extends StObject {
    
    def addErrorListener(listener: RpcErrorListener): Unit = js.native
    
    def addMessageListener(listener: RpcMessageListener): Unit = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    def dispatchMessage[TMessage](message: TMessage): js.Promise[Unit] = js.native
    
    def isOpen(): Boolean = js.native
    
    def open(): js.Promise[Unit] = js.native
    
    def removeErrorListener(listener: RpcErrorListener): Unit = js.native
    
    def removeMessageListener(listener: RpcMessageListener): Unit = js.native
  }
  object RpcMessagePort {
    
    @scala.inline
    def apply(
      addErrorListener: RpcErrorListener => Unit,
      addMessageListener: RpcMessageListener => Unit,
      close: () => js.Promise[Unit],
      dispatchMessage: js.Any => js.Promise[Unit],
      isOpen: () => Boolean,
      open: () => js.Promise[Unit],
      removeErrorListener: RpcErrorListener => Unit,
      removeMessageListener: RpcMessageListener => Unit
    ): RpcMessagePort = {
      val __obj = js.Dynamic.literal(addErrorListener = js.Any.fromFunction1(addErrorListener), addMessageListener = js.Any.fromFunction1(addMessageListener), close = js.Any.fromFunction0(close), dispatchMessage = js.Any.fromFunction1(dispatchMessage), isOpen = js.Any.fromFunction0(isOpen), open = js.Any.fromFunction0(open), removeErrorListener = js.Any.fromFunction1(removeErrorListener), removeMessageListener = js.Any.fromFunction1(removeMessageListener))
      __obj.asInstanceOf[RpcMessagePort]
    }
    
    @scala.inline
    implicit class RpcMessagePortMutableBuilder[Self <: RpcMessagePort] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddErrorListener(value: RpcErrorListener => Unit): Self = StObject.set(x, "addErrorListener", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddMessageListener(value: RpcMessageListener => Unit): Self = StObject.set(x, "addMessageListener", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDispatchMessage(value: js.Any => js.Promise[Unit]): Self = StObject.set(x, "dispatchMessage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsOpen(value: () => Boolean): Self = StObject.set(x, "isOpen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOpen(value: () => js.Promise[Unit]): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveErrorListener(value: RpcErrorListener => Unit): Self = StObject.set(x, "removeErrorListener", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveMessageListener(value: RpcMessageListener => Unit): Self = StObject.set(x, "removeMessageListener", js.Any.fromFunction1(value))
    }
  }
}
