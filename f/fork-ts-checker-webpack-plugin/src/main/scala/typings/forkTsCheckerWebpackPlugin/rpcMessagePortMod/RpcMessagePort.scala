package typings.forkTsCheckerWebpackPlugin.rpcMessagePortMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RpcMessagePort extends js.Object {
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
  implicit class RpcMessagePortOps[Self <: RpcMessagePort] (val x: Self) extends AnyVal {
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
    def setAddErrorListener(value: RpcErrorListener => Unit): Self = this.set("addErrorListener", js.Any.fromFunction1(value))
    @scala.inline
    def setAddMessageListener(value: RpcMessageListener => Unit): Self = this.set("addMessageListener", js.Any.fromFunction1(value))
    @scala.inline
    def setClose(value: () => js.Promise[Unit]): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def setDispatchMessage(value: js.Any => js.Promise[Unit]): Self = this.set("dispatchMessage", js.Any.fromFunction1(value))
    @scala.inline
    def setIsOpen(value: () => Boolean): Self = this.set("isOpen", js.Any.fromFunction0(value))
    @scala.inline
    def setOpen(value: () => js.Promise[Unit]): Self = this.set("open", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveErrorListener(value: RpcErrorListener => Unit): Self = this.set("removeErrorListener", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveMessageListener(value: RpcMessageListener => Unit): Self = this.set("removeMessageListener", js.Any.fromFunction1(value))
  }
  
}

