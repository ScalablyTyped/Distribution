package typings.expressWsRoutes.mod

import typings.expressServeStaticCore.mod.IRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Router extends IRouter {
  def websocket(route: String, handler: WebSocketRouteHandler): Router = js.native
}

