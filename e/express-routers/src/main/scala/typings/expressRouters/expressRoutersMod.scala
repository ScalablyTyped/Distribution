package typings.expressRouters

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.RequestHandler
import typings.express.mod.Router
import typings.expressServeStaticCore.mod.NextFunction
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expressRoutersMod {
  
  @JSImport("express-routers/dist/express-routers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createRouter(routeConfig: js.Array[RouteConfig]): Router = ^.asInstanceOf[js.Dynamic].applyDynamic("createRouter")(routeConfig.asInstanceOf[js.Any]).asInstanceOf[Router]
  inline def createRouter(routeConfig: RouteConfigAlternative): Router = ^.asInstanceOf[js.Dynamic].applyDynamic("createRouter")(routeConfig.asInstanceOf[js.Any]).asInstanceOf[Router]
  
  trait RouteConfig extends StObject {
    
    var handler: (RequestHandler[ParamsDictionary, js.Any, js.Any, Query]) | (js.Array[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]])
    
    var method: RouteConfigMethod
    
    var path: String
  }
  object RouteConfig {
    
    inline def apply(
      handler: (RequestHandler[ParamsDictionary, js.Any, js.Any, Query]) | (js.Array[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]),
      method: RouteConfigMethod,
      path: String
    ): RouteConfig = {
      val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteConfig]
    }
    
    extension [Self <: RouteConfig](x: Self) {
      
      inline def setHandler(
        value: (RequestHandler[ParamsDictionary, js.Any, js.Any, Query]) | (js.Array[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]])
      ): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      inline def setHandlerFunction3(
        value: (/* req */ Request[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response[js.Any, Double], /* next */ NextFunction) => js.Any
      ): Self = StObject.set(x, "handler", js.Any.fromFunction3(value))
      
      inline def setHandlerVarargs(value: (RequestHandler[ParamsDictionary, js.Any, js.Any, Query])*): Self = StObject.set(x, "handler", js.Array(value :_*))
      
      inline def setMethod(value: RouteConfigMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  type RouteConfigAlternative = StringDictionary[
    (RequestHandler[ParamsDictionary, js.Any, js.Any, Query]) | (js.Array[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]])
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.expressRouters.expressRoutersStrings.GET
    - typings.expressRouters.expressRoutersStrings.POST
    - typings.expressRouters.expressRoutersStrings.PUT
    - typings.expressRouters.expressRoutersStrings.PATCH
    - typings.expressRouters.expressRoutersStrings.DELETE
  */
  trait RouteConfigMethod extends StObject
  object RouteConfigMethod {
    
    inline def DELETE: typings.expressRouters.expressRoutersStrings.DELETE = "DELETE".asInstanceOf[typings.expressRouters.expressRoutersStrings.DELETE]
    
    inline def GET: typings.expressRouters.expressRoutersStrings.GET = "GET".asInstanceOf[typings.expressRouters.expressRoutersStrings.GET]
    
    inline def PATCH: typings.expressRouters.expressRoutersStrings.PATCH = "PATCH".asInstanceOf[typings.expressRouters.expressRoutersStrings.PATCH]
    
    inline def POST: typings.expressRouters.expressRoutersStrings.POST = "POST".asInstanceOf[typings.expressRouters.expressRoutersStrings.POST]
    
    inline def PUT: typings.expressRouters.expressRoutersStrings.PUT = "PUT".asInstanceOf[typings.expressRouters.expressRoutersStrings.PUT]
  }
}
