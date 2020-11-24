package typings.expressRouters

import typings.express.mod.Router
import typings.expressRouters.expressRoutersMod.RouteConfig
import typings.expressRouters.expressRoutersMod.RouteConfigAlternative
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("express-routers", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def createRouter(routeConfig: js.Array[RouteConfig]): Router = js.native
  def createRouter(routeConfig: RouteConfigAlternative): Router = js.native
}
