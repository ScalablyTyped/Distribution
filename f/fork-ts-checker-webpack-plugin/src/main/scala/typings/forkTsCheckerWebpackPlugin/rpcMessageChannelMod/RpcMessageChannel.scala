package typings.forkTsCheckerWebpackPlugin.rpcMessageChannelMod

import typings.forkTsCheckerWebpackPlugin.rpcMessagePortMod.RpcMessagePort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RpcMessageChannel extends js.Object {
  
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
  implicit class RpcMessageChannelOps[Self <: RpcMessageChannel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClientPort(value: RpcMessagePort): Self = this.set("clientPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClose(value: () => js.Promise[Unit]): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsOpen(value: () => Boolean): Self = this.set("isOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpen(value: () => js.Promise[Unit]): Self = this.set("open", js.Any.fromFunction0(value))
    
    @scala.inline
    def setServicePort(value: RpcMessagePort): Self = this.set("servicePort", value.asInstanceOf[js.Any])
  }
}
