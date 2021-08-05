package typings.expressFrappe

import org.scalablytyped.runtime.StringDictionary
import typings.cors.mod.CorsOptions
import typings.express.mod.ErrorRequestHandler
import typings.express.mod.RequestHandler
import typings.expressFrappe.anon.Json
import typings.expressFrappe.anon.Options
import typings.expressFrappe.anon.PartialuseioServersocketS
import typings.expressRouters.expressRoutersMod.RouteConfig
import typings.expressRouters.expressRoutersMod.RouteConfigAlternative
import typings.expressServeStaticCore.mod.Express
import typings.expressServeStaticCore.mod.NextFunction
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.Response
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import typings.qs.mod.ParsedQs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expressFrappeMod {
  
  @JSImport("express-frappe/dist/express-frappe", "ExpressFrappe")
  @js.native
  class ExpressFrappe protected () extends StObject {
    def this(config: ExpressFrappeConfig) = this()
    
    /**
      * Express instance itself is a request handler, which could be invoked without
      * third argument.
      */
    def app(req: Request[ParamsDictionary, js.Any, js.Any, ParsedQs], res: Response[js.Any, Double]): js.Any = js.native
    def app(req: Request[ParamsDictionary, js.Any, js.Any, ParsedQs], res: ServerResponse): js.Any = js.native
    def app(req: IncomingMessage, res: Response[js.Any, Double]): js.Any = js.native
    def app(req: IncomingMessage, res: ServerResponse): js.Any = js.native
    @JSName("app")
    var app_Original: Express = js.native
    
    var server: Server = js.native
  }
  
  trait ExpressFrappeConfig extends StObject {
    
    var bodyParser: js.UndefOr[Boolean | Json] = js.undefined
    
    var cors: js.UndefOr[Boolean | CorsOptions] = js.undefined
    
    var errorHandler: js.UndefOr[ErrorRequestHandler[ParamsDictionary, js.Any, js.Any, Query]] = js.undefined
    
    var io: js.UndefOr[ExpressFrappeSocketIOConfig] = js.undefined
    
    var middleware: js.UndefOr[js.Array[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]] = js.undefined
    
    var morgan: js.UndefOr[Boolean] = js.undefined
    
    var routes: js.UndefOr[js.Array[RouteConfig] | RouteConfigAlternative] = js.undefined
    
    var static: js.UndefOr[String | Options] = js.undefined
  }
  object ExpressFrappeConfig {
    
    inline def apply(): ExpressFrappeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpressFrappeConfig]
    }
    
    extension [Self <: ExpressFrappeConfig](x: Self) {
      
      inline def setBodyParser(value: Boolean | Json): Self = StObject.set(x, "bodyParser", value.asInstanceOf[js.Any])
      
      inline def setBodyParserUndefined: Self = StObject.set(x, "bodyParser", js.undefined)
      
      inline def setCors(value: Boolean | CorsOptions): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
      
      inline def setCorsUndefined: Self = StObject.set(x, "cors", js.undefined)
      
      inline def setErrorHandler(
        value: (/* err */ js.Any, /* req */ Request[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response[js.Any, Double], /* next */ NextFunction) => js.Any
      ): Self = StObject.set(x, "errorHandler", js.Any.fromFunction4(value))
      
      inline def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
      
      inline def setIo(value: ExpressFrappeSocketIOConfig): Self = StObject.set(x, "io", value.asInstanceOf[js.Any])
      
      inline def setIoUndefined: Self = StObject.set(x, "io", js.undefined)
      
      inline def setMiddleware(value: js.Array[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]): Self = StObject.set(x, "middleware", value.asInstanceOf[js.Any])
      
      inline def setMiddlewareUndefined: Self = StObject.set(x, "middleware", js.undefined)
      
      inline def setMiddlewareVarargs(value: (RequestHandler[ParamsDictionary, js.Any, js.Any, Query])*): Self = StObject.set(x, "middleware", js.Array(value :_*))
      
      inline def setMorgan(value: Boolean): Self = StObject.set(x, "morgan", value.asInstanceOf[js.Any])
      
      inline def setMorganUndefined: Self = StObject.set(x, "morgan", js.undefined)
      
      inline def setRoutes(value: js.Array[RouteConfig] | RouteConfigAlternative): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
      
      inline def setRoutesVarargs(value: RouteConfig*): Self = StObject.set(x, "routes", js.Array(value :_*))
      
      inline def setStatic(value: String | Options): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
      
      inline def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
    }
  }
  
  type ExpressFrappeSocketIOConfig = StringDictionary[PartialuseioServersocketS]
}
