package typings
package expressDashWsDashRoutesLib.expressDashWsDashRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressWsRoutesNs {
  type CbHandler = js.Function1[/* connectHandler */ WebSocketHandler | scala.Boolean, scala.Unit]
  type WebSocketHandler = js.Function1[/* socket */ wsLib.wsMod.namespaced, scala.Unit]
  type WebSocketRouteHandler = js.Function3[
    /* info */ ClientInfo, 
    /* cb */ CbHandler, 
    /* next */ expressLib.expressMod.eNs.NextFunction, 
    scala.Unit
  ]
}
