package typings.expressDashWsDashRoutes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressDashWsDashRoutesMod {
  import typings.express.expressMod.NextFunction
  import typings.ws.wsMod.^

  type CbHandler = js.Function1[/* connectHandler */ WebSocketHandler | Boolean, Unit]
  type WebSocketHandler = js.Function1[/* socket */ ^, Unit]
  type WebSocketRouteHandler = js.Function3[/* info */ ClientInfo, /* cb */ CbHandler, /* next */ NextFunction, Unit]
}
