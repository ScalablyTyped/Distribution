package typings.expressWsRoutes

import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.IRouter
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): Express = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Express]
  
  @JSImport("express-ws-routes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type CbHandler = js.Function1[/* connectHandler */ WebSocketHandler | Boolean, Unit]
  
  trait ClientInfo extends StObject {
    
    var origin: String
    
    var req: Request_[ParamsDictionary, js.Any, js.Any, Query]
    
    var secure: Boolean
  }
  object ClientInfo {
    
    @scala.inline
    def apply(origin: String, req: Request_[ParamsDictionary, js.Any, js.Any, Query], secure: Boolean): ClientInfo = {
      val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientInfo]
    }
    
    @scala.inline
    implicit class ClientInfoMutableBuilder[Self <: ClientInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReq(value: Request_[ParamsDictionary, js.Any, js.Any, Query]): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
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
    extends typings.node.httpMod.Server {
    
    var wsServer: typings.ws.mod.Server = js.native
  }
  
  type WebSocketHandler = js.Function1[/* socket */ typings.ws.mod.^, Unit]
  
  type WebSocketRouteHandler = js.Function3[/* info */ ClientInfo, /* cb */ CbHandler, /* next */ NextFunction, Unit]
}
