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
    onConnect: js.Function2[
      socketDotIoLib.socketDotIoMod.SocketIONs.Server, 
      socketDotIoLib.socketDotIoMod.SocketIONs.Socket, 
      scala.Unit
    ],
    onDisconnect: js.Function2[
      socketDotIoLib.socketDotIoMod.SocketIONs.Server, 
      socketDotIoLib.socketDotIoMod.SocketIONs.Socket, 
      scala.Unit
    ],
    use: js.Function3[
      socketDotIoLib.socketDotIoMod.SocketIONs.Server, 
      socketDotIoLib.socketDotIoMod.SocketIONs.Socket, 
      js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ],
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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onConnect")(onConnect)
    __obj.updateDynamic("onDisconnect")(onDisconnect)
    __obj.updateDynamic("use")(use)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Cb]
  }
}

