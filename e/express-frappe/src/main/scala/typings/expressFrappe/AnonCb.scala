package typings.expressFrappe

import org.scalablytyped.runtime.StringDictionary
import typings.socketIo.mod.Server
import typings.socketIo.mod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCb
  extends /* eventHandler */ StringDictionary[
      js.Function4[/* io */ Server, /* socket */ Socket, /* data */ js.Any, /* cb */ js.Function, Unit]
    ] {
  def onConnect(io: Server, socket: Socket): Unit
  def onDisconnect(io: Server, socket: Socket): Unit
  def use(io: Server, socket: Socket, next: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit
}

object AnonCb {
  @scala.inline
  def apply(
    onConnect: (Server, Socket) => Unit,
    onDisconnect: (Server, Socket) => Unit,
    use: (Server, Socket, js.Function1[/* err */ js.UndefOr[js.Any], Unit]) => Unit,
    StringDictionary: /* eventHandler */ StringDictionary[
      js.Function4[/* io */ Server, /* socket */ Socket, /* data */ js.Any, /* cb */ js.Function, Unit]
    ] = null
  ): AnonCb = {
    val __obj = js.Dynamic.literal(onConnect = js.Any.fromFunction2(onConnect), onDisconnect = js.Any.fromFunction2(onDisconnect), use = js.Any.fromFunction3(use))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonCb]
  }
}

