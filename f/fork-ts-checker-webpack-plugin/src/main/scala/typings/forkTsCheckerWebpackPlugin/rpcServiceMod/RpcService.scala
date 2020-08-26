package typings.forkTsCheckerWebpackPlugin.rpcServiceMod

import typings.forkTsCheckerWebpackPlugin.rpcProcedureMod.RpcProcedure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RpcService extends js.Object {
  def addCallHandler[TPayload, TResult](procedure: RpcProcedure[TPayload, TResult], handler: RpcCallHandler[TPayload, TResult]): Unit = js.native
  def close(): js.Promise[Unit] = js.native
  def isOpen(): Boolean = js.native
  def open(): js.Promise[Unit] = js.native
  def removeCallHandler[TPayload, TResult](procedure: RpcProcedure[TPayload, TResult]): Unit = js.native
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
  implicit class RpcServiceOps[Self <: RpcService] (val x: Self) extends AnyVal {
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
    def setAddCallHandler(value: (RpcProcedure[js.Any, js.Any], RpcCallHandler[js.Any, js.Any]) => Unit): Self = this.set("addCallHandler", js.Any.fromFunction2(value))
    @scala.inline
    def setClose(value: () => js.Promise[Unit]): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def setIsOpen(value: () => Boolean): Self = this.set("isOpen", js.Any.fromFunction0(value))
    @scala.inline
    def setOpen(value: () => js.Promise[Unit]): Self = this.set("open", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveCallHandler(value: RpcProcedure[js.Any, js.Any] => Unit): Self = this.set("removeCallHandler", js.Any.fromFunction1(value))
  }
  
}

