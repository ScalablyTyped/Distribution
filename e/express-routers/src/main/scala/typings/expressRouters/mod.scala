package typings.expressRouters

import typings.express.mod.Router
import typings.expressRouters.distExpressRoutersMod.RouteConfig
import typings.expressRouters.distExpressRoutersMod.RouteConfigAlternative
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-routers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createRouter(routeConfig: js.Array[RouteConfig]): Router = ^.asInstanceOf[js.Dynamic].applyDynamic("createRouter")(routeConfig.asInstanceOf[js.Any]).asInstanceOf[Router]
  inline def createRouter(routeConfig: RouteConfigAlternative): Router = ^.asInstanceOf[js.Dynamic].applyDynamic("createRouter")(routeConfig.asInstanceOf[js.Any]).asInstanceOf[Router]
}
