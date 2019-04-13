package typings
package expressDashFrappeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cb
  extends /* eventHandler */ org.scalablytyped.runtime.StringDictionary[
      js.Function4[
        /* io */ socketDotIoLib.socketDotIoMod.Server, 
        /* socket */ socketDotIoLib.socketDotIoMod.Socket, 
        /* data */ js.Any, 
        /* cb */ js.Function, 
        scala.Unit
      ]
    ] {
  def onConnect(io: socketDotIoLib.socketDotIoMod.Server, socket: socketDotIoLib.socketDotIoMod.Socket): scala.Unit
  def onDisconnect(io: socketDotIoLib.socketDotIoMod.Server, socket: socketDotIoLib.socketDotIoMod.Socket): scala.Unit
  def use(
    io: socketDotIoLib.socketDotIoMod.Server,
    socket: socketDotIoLib.socketDotIoMod.Socket,
    next: js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit
}

object Anon_Cb {
  @scala.inline
  def apply(
    onConnect: (socketDotIoLib.socketDotIoMod.Server, socketDotIoLib.socketDotIoMod.Socket) => scala.Unit,
    onDisconnect: (socketDotIoLib.socketDotIoMod.Server, socketDotIoLib.socketDotIoMod.Socket) => scala.Unit,
    use: (socketDotIoLib.socketDotIoMod.Server, socketDotIoLib.socketDotIoMod.Socket, js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]) => scala.Unit,
    StringDictionary: /* eventHandler */ org.scalablytyped.runtime.StringDictionary[
      js.Function4[
        /* io */ socketDotIoLib.socketDotIoMod.Server, 
        /* socket */ socketDotIoLib.socketDotIoMod.Socket, 
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

