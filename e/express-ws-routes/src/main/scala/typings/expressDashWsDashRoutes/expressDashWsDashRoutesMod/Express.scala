package typings.expressDashWsDashRoutes.expressDashWsDashRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Express
  extends typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Express {
  def websocket(route: String, handler: WebSocketRouteHandler): Express = js.native
}

