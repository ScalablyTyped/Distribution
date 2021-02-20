package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.rpcMessagePortMod.RpcMessagePort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rpcMessageChannelMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/rpc/RpcMessageChannel", "createRpcMessageChannel")
  @js.native
  def createRpcMessageChannel(servicePort: RpcMessagePort, clientPort: RpcMessagePort): RpcMessageChannel = js.native
  @JSImport("fork-ts-checker-webpack-plugin/lib/rpc/RpcMessageChannel", "createRpcMessageChannel")
  @js.native
  def createRpcMessageChannel(
    servicePort: RpcMessagePort,
    clientPort: RpcMessagePort,
    linkPorts: js.UndefOr[scala.Nothing],
    unlinkPorts: js.Function0[js.Promise[Unit]]
  ): RpcMessageChannel = js.native
  @JSImport("fork-ts-checker-webpack-plugin/lib/rpc/RpcMessageChannel", "createRpcMessageChannel")
  @js.native
  def createRpcMessageChannel(servicePort: RpcMessagePort, clientPort: RpcMessagePort, linkPorts: js.Function0[js.Promise[Unit]]): RpcMessageChannel = js.native
  @JSImport("fork-ts-checker-webpack-plugin/lib/rpc/RpcMessageChannel", "createRpcMessageChannel")
  @js.native
  def createRpcMessageChannel(
    servicePort: RpcMessagePort,
    clientPort: RpcMessagePort,
    linkPorts: js.Function0[js.Promise[Unit]],
    unlinkPorts: js.Function0[js.Promise[Unit]]
  ): RpcMessageChannel = js.native
  
  @js.native
  trait RpcMessageChannel extends StObject {
    
    val clientPort: RpcMessagePort = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    def isOpen(): Boolean = js.native
    
    def open(): js.Promise[Unit] = js.native
    
    val servicePort: RpcMessagePort = js.native
  }
  object RpcMessageChannel {
    
    @scala.inline
    def apply(
      clientPort: RpcMessagePort,
      close: () => js.Promise[Unit],
      isOpen: () => Boolean,
      open: () => js.Promise[Unit],
      servicePort: RpcMessagePort
    ): RpcMessageChannel = {
      val __obj = js.Dynamic.literal(clientPort = clientPort.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), isOpen = js.Any.fromFunction0(isOpen), open = js.Any.fromFunction0(open), servicePort = servicePort.asInstanceOf[js.Any])
      __obj.asInstanceOf[RpcMessageChannel]
    }
    
    @scala.inline
    implicit class RpcMessageChannelMutableBuilder[Self <: RpcMessageChannel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientPort(value: RpcMessagePort): Self = StObject.set(x, "clientPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsOpen(value: () => Boolean): Self = StObject.set(x, "isOpen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOpen(value: () => js.Promise[Unit]): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
      
      @scala.inline
      def setServicePort(value: RpcMessagePort): Self = StObject.set(x, "servicePort", value.asInstanceOf[js.Any])
    }
  }
}
