package typings.forkTsCheckerWebpackPlugin.reporterRpcServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReporterRpcService extends js.Object {
  def close(): js.Promise[Unit] = js.native
  def isOpen(): Boolean = js.native
  def open(): js.Promise[Unit] = js.native
}

object ReporterRpcService {
  @scala.inline
  def apply(close: () => js.Promise[Unit], isOpen: () => Boolean, open: () => js.Promise[Unit]): ReporterRpcService = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), isOpen = js.Any.fromFunction0(isOpen), open = js.Any.fromFunction0(open))
    __obj.asInstanceOf[ReporterRpcService]
  }
  @scala.inline
  implicit class ReporterRpcServiceOps[Self <: ReporterRpcService] (val x: Self) extends AnyVal {
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
    def setClose(value: () => js.Promise[Unit]): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def setIsOpen(value: () => Boolean): Self = this.set("isOpen", js.Any.fromFunction0(value))
    @scala.inline
    def setOpen(value: () => js.Promise[Unit]): Self = this.set("open", js.Any.fromFunction0(value))
  }
  
}

