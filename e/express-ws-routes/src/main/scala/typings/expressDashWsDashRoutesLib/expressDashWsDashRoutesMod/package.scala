package typings
package expressDashWsDashRoutesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressDashWsDashRoutesMod {
  type CbHandler = js.Function1[/* connectHandler */ WebSocketHandler | scala.Boolean, scala.Unit]
  type WebSocketHandler = js.Function1[/* socket */ wsLib.wsMod.^, scala.Unit]
  type WebSocketRouteHandler = js.Function3[
    /* info */ ClientInfo, 
    /* cb */ CbHandler, 
    /* next */ expressLib.expressMod.NextFunction, 
    scala.Unit
  ]
}
