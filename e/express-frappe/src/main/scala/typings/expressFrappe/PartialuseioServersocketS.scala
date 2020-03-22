package typings.expressFrappe

import typings.socketIo.mod.Server
import typings.socketIo.mod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{use (io : socket.io.socket.io.Server, socket : socket.io.socket.io.Socket, next : (err ? : any): void): void, onConnect (io : socket.io.socket.io.Server, socket : socket.io.socket.io.Socket): void, onDisconnect (io : socket.io.socket.io.Server, socket : socket.io.socket.io.Socket): void, [eventHandler: string] : (io : socket.io.socket.io.Server, socket : socket.io.socket.io.Socket, data : any, cb : std.Function): void}> */
trait PartialuseioServersocketS extends js.Object {
  var onConnect: js.UndefOr[js.Function2[/* io */ Server, /* socket */ Socket, Unit]] = js.undefined
  var onDisconnect: js.UndefOr[js.Function2[/* io */ Server, /* socket */ Socket, Unit]] = js.undefined
  var use: js.UndefOr[
    js.Function3[
      /* io */ Server, 
      /* socket */ Socket, 
      /* next */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ] = js.undefined
}

object PartialuseioServersocketS {
  @scala.inline
  def apply(
    onConnect: (/* io */ Server, /* socket */ Socket) => Unit = null,
    onDisconnect: (/* io */ Server, /* socket */ Socket) => Unit = null,
    use: (/* io */ Server, /* socket */ Socket, /* next */ js.Function1[/* err */ js.UndefOr[js.Any], Unit]) => Unit = null
  ): PartialuseioServersocketS = {
    val __obj = js.Dynamic.literal()
    if (onConnect != null) __obj.updateDynamic("onConnect")(js.Any.fromFunction2(onConnect))
    if (onDisconnect != null) __obj.updateDynamic("onDisconnect")(js.Any.fromFunction2(onDisconnect))
    if (use != null) __obj.updateDynamic("use")(js.Any.fromFunction3(use))
    __obj.asInstanceOf[PartialuseioServersocketS]
  }
}

