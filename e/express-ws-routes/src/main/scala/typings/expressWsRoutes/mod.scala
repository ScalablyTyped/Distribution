package typings.expressWsRoutes

import org.scalablytyped.runtime.Instantiable1
import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.IRouter
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.nodeColonnetMod.Socket
import typings.std.Record
import typings.ws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Express = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Express]
  
  @JSImport("express-ws-routes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type CbHandler = js.Function1[/* connectHandler */ WebSocketHandler | Boolean, Unit]
  
  trait ClientInfo extends StObject {
    
    var origin: String
    
    var req: Request_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ]
    
    var secure: Boolean
  }
  object ClientInfo {
    
    inline def apply(
      origin: String,
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      secure: Boolean
    ): ClientInfo = {
      val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientInfo]
    }
    
    extension [Self <: ClientInfo](x: Self) {
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setReq(
        value: Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ]
      ): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Express
    extends typings.expressServeStaticCore.mod.Express {
    
    def websocket(route: String, handler: WebSocketRouteHandler): Express = js.native
  }
  
  @js.native
  trait Router extends IRouter {
    
    def websocket(route: String, handler: WebSocketRouteHandler): Router = js.native
  }
  
  @js.native
  trait Server
    extends typings.node.httpMod.Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ] {
    
    var wsServer: typings.ws.mod.Server[WebSocket] = js.native
  }
  
  type WebSocketHandler = js.Function1[/* socket */ WebSocket, Unit]
  
  type WebSocketRouteHandler = js.Function3[/* info */ ClientInfo, /* cb */ CbHandler, /* next */ NextFunction, Unit]
}
