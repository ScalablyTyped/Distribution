package typings
package expressDashFrappeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cb
  extends /* eventHandler */ org.scalablytyped.runtime.StringDictionary[
      js.Function4[
        /* io */ socketDotIoLib.socketDotIoMod.SocketIONs.Server, 
        /* socket */ socketDotIoLib.socketDotIoMod.SocketIONs.Socket, 
        /* data */ js.Any, 
        /* cb */ js.Function, 
        scala.Unit
      ]
    ] {
  def onConnect(
    io: socketDotIoLib.socketDotIoMod.SocketIONs.Server,
    socket: socketDotIoLib.socketDotIoMod.SocketIONs.Socket
  ): scala.Unit
  def onDisconnect(
    io: socketDotIoLib.socketDotIoMod.SocketIONs.Server,
    socket: socketDotIoLib.socketDotIoMod.SocketIONs.Socket
  ): scala.Unit
  def use(
    io: socketDotIoLib.socketDotIoMod.SocketIONs.Server,
    socket: socketDotIoLib.socketDotIoMod.SocketIONs.Socket,
    next: js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit
}

object Anon_Cb {
  @scala.inline
  def apply(
    onConnect: (socketDotIoLib.socketDotIoMod.SocketIONs.Server, socketDotIoLib.socketDotIoMod.SocketIONs.Socket) => scala.Unit,
    onDisconnect: (socketDotIoLib.socketDotIoMod.SocketIONs.Server, socketDotIoLib.socketDotIoMod.SocketIONs.Socket) => scala.Unit,
    use: (socketDotIoLib.socketDotIoMod.SocketIONs.Server, socketDotIoLib.socketDotIoMod.SocketIONs.Socket, js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]) => scala.Unit,
    StringDictionary: /* eventHandler */ org.scalablytyped.runtime.StringDictionary[
      js.Function4[
        /* io */ socketDotIoLib.socketDotIoMod.SocketIONs.Server, 
        /* socket */ socketDotIoLib.socketDotIoMod.SocketIONs.Socket, 
        /* data */ js.Any, 
        /* cb */ js.Function, 
        scala.Unit
      ]
    ] = null
  ): Anon_Cb = {
    val __obj = js.Dynamic.literal(onConnect = js.Any.fromFunction2(onConnect), onDisconnect = js.Any.fromFunction2(onDisconnect), use = js.Any.fromFunction3(use))
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Cb]
  }
}

