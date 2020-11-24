package typings.expressWsRoutes.mod

import typings.expressServeStaticCore.mod.IRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Router extends IRouter {
  
  def websocket(route: String, handler: WebSocketRouteHandler): Router = js.native
}
