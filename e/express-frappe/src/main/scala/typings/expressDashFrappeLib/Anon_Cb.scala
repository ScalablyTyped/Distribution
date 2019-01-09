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

