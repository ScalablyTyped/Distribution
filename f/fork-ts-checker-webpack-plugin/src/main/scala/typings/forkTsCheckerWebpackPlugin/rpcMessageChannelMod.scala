package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.rpcMessagePortMod.RpcMessagePort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rpcMessageChannelMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/rpc/RpcMessageChannel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createRpcMessageChannel(servicePort: RpcMessagePort, clientPort: RpcMessagePort): RpcMessageChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("createRpcMessageChannel")(servicePort.asInstanceOf[js.Any], clientPort.asInstanceOf[js.Any])).asInstanceOf[RpcMessageChannel]
  inline def createRpcMessageChannel(servicePort: RpcMessagePort, clientPort: RpcMessagePort, linkPorts: js.Function0[js.Promise[Unit]]): RpcMessageChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("createRpcMessageChannel")(servicePort.asInstanceOf[js.Any], clientPort.asInstanceOf[js.Any], linkPorts.asInstanceOf[js.Any])).asInstanceOf[RpcMessageChannel]
  inline def createRpcMessageChannel(
    servicePort: RpcMessagePort,
    clientPort: RpcMessagePort,
    linkPorts: js.Function0[js.Promise[Unit]],
    unlinkPorts: js.Function0[js.Promise[Unit]]
  ): RpcMessageChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("createRpcMessageChannel")(servicePort.asInstanceOf[js.Any], clientPort.asInstanceOf[js.Any], linkPorts.asInstanceOf[js.Any], unlinkPorts.asInstanceOf[js.Any])).asInstanceOf[RpcMessageChannel]
  inline def createRpcMessageChannel(
    servicePort: RpcMessagePort,
    clientPort: RpcMessagePort,
    linkPorts: Unit,
    unlinkPorts: js.Function0[js.Promise[Unit]]
  ): RpcMessageChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("createRpcMessageChannel")(servicePort.asInstanceOf[js.Any], clientPort.asInstanceOf[js.Any], linkPorts.asInstanceOf[js.Any], unlinkPorts.asInstanceOf[js.Any])).asInstanceOf[RpcMessageChannel]
  
  trait RpcMessageChannel extends StObject {
    
    val clientPort: RpcMessagePort
    
    def close(): js.Promise[Unit]
    
    def isOpen(): Boolean
    
    def open(): js.Promise[Unit]
    
    val servicePort: RpcMessagePort
  }
  object RpcMessageChannel {
    
    inline def apply(
      clientPort: RpcMessagePort,
      close: () => js.Promise[Unit],
      isOpen: () => Boolean,
      open: () => js.Promise[Unit],
      servicePort: RpcMessagePort
    ): RpcMessageChannel = {
      val __obj = js.Dynamic.literal(clientPort = clientPort.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), isOpen = js.Any.fromFunction0(isOpen), open = js.Any.fromFunction0(open), servicePort = servicePort.asInstanceOf[js.Any])
      __obj.asInstanceOf[RpcMessageChannel]
    }
    
    extension [Self <: RpcMessageChannel](x: Self) {
      
      inline def setClientPort(value: RpcMessagePort): Self = StObject.set(x, "clientPort", value.asInstanceOf[js.Any])
      
      inline def setClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setIsOpen(value: () => Boolean): Self = StObject.set(x, "isOpen", js.Any.fromFunction0(value))
      
      inline def setOpen(value: () => js.Promise[Unit]): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
      
      inline def setServicePort(value: RpcMessagePort): Self = StObject.set(x, "servicePort", value.asInstanceOf[js.Any])
    }
  }
}
