package typings
package expressDashFrappeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_EventHandler
  extends /* eventHandler */ org.scalablytyped.runtime.StringDictionary[
      js.Function4[
        /* io */ socketDotIoLib.socketDotIoMod.SocketIONs.Server, 
        /* socket */ socketDotIoLib.socketDotIoMod.SocketIONs.Socket, 
        /* data */ js.Any, 
        /* cb */ js.Function, 
        scala.Unit
      ]
    ] {
  var onConnect: js.Function2[
    /* io */ socketDotIoLib.socketDotIoMod.SocketIONs.Server, 
    /* socket */ socketDotIoLib.socketDotIoMod.SocketIONs.Socket, 
    scala.Unit
  ]
  var onDisconnect: js.Function2[
    /* io */ socketDotIoLib.socketDotIoMod.SocketIONs.Server, 
    /* socket */ socketDotIoLib.socketDotIoMod.SocketIONs.Socket, 
    scala.Unit
  ]
  var use: js.Function3[
    /* io */ socketDotIoLib.socketDotIoMod.SocketIONs.Server, 
    /* socket */ socketDotIoLib.socketDotIoMod.SocketIONs.Socket, 
    /* next */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], 
    scala.Unit
  ]
}

