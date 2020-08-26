package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TcpListener
  extends BaseListener
     with SocketListener {
  /**
    * IP port being listened on.
    */
  var port: Double = js.native
}

object TcpListener {
  @scala.inline
  def apply(accept: () => js.Promise[SocketConnection], close: () => js.Promise[Unit], port: Double): TcpListener = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction0(accept), close = js.Any.fromFunction0(close), port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[TcpListener]
  }
  @scala.inline
  implicit class TcpListenerOps[Self <: TcpListener] (val x: Self) extends AnyVal {
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
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
  }
  
}

