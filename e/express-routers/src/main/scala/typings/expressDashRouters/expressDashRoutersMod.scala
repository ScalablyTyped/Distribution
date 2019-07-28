package typings.expressDashRouters

import typings.express.expressMod.Router
import typings.expressDashRouters.distExpressDashRoutersMod.RouteConfig
import typings.expressDashRouters.distExpressDashRoutersMod.RouteConfigAlternative
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-routers", JSImport.Namespace)
@js.native
object expressDashRoutersMod extends js.Object {
  def createRouter(routeConfig: js.Array[RouteConfig]): Router = js.native
  def createRouter(routeConfig: RouteConfigAlternative): Router = js.native
}

