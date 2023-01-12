package typings.expressWs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.Application_
import typings.express.mod.IRouterMatcher
import typings.express.mod.Request_
import typings.express.mod.RouterOptions
import typings.expressServeStaticCore.mod.IRouter
import typings.expressServeStaticCore.mod.NextFunction
import typings.expressServeStaticCore.mod.PathParams
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.RequestHandler
import typings.expressServeStaticCore.mod.RequestHandlerParams
import typings.expressServeStaticCore.mod.Response
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import typings.node.nodeColonnetMod.Socket
import typings.std.Record
import typings.ws.mod.ServerOptions
import typings.ws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(app: Application_): Instance = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[Instance]
  inline def apply(app: Application_, server: Unit, options: Options): Instance = (^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any], server.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Instance]
  inline def apply(
    app: Application_,
    server: Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ]
  ): Instance = (^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any], server.asInstanceOf[js.Any])).asInstanceOf[Instance]
  inline def apply(
    app: Application_,
    server: Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ],
    options: Options
  ): Instance = (^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any], server.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Instance]
  inline def apply(
    app: Application_,
    server: typings.node.httpsMod.Server[
      Instantiable1[/* socket */ Socket, typings.node.nodeColonhttpMod.IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
      ]
    ]
  ): Instance = (^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any], server.asInstanceOf[js.Any])).asInstanceOf[Instance]
  inline def apply(
    app: Application_,
    server: typings.node.httpsMod.Server[
      Instantiable1[/* socket */ Socket, typings.node.nodeColonhttpMod.IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
      ]
    ],
    options: Options
  ): Instance = (^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any], server.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Instance]
  
  @JSImport("express-ws", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* augmented module */
  object expressAugmentingMod {
    
    @JSImport("express", JSImport.Namespace)
    @js.native
    val ^ : js.Any = js.native
    
    inline def Router(options: js.UndefOr[RouterOptions]): typings.express.mod.Router = ^.asInstanceOf[js.Dynamic].applyDynamic("Router")(options.asInstanceOf[js.Any]).asInstanceOf[typings.express.mod.Router]
  }
  
  @js.native
  trait Application
    extends typings.expressServeStaticCore.mod.Application
       with WithWebsocketMethod {
    
    /* InferMemberOverrides */
    override def apply(arg1: /* req */ Request, arg2: /* res */ Response, arg3: /* next */ js.UndefOr[NextFunction]): Any = js.native
  }
  
  trait Instance extends StObject {
    
    var app: Application
    
    def applyTo(target: RouterLike): Unit
    
    def getWss(): typings.ws.mod.Server[WebSocket]
  }
  object Instance {
    
    inline def apply(app: Application, applyTo: RouterLike => Unit, getWss: () => typings.ws.mod.Server[WebSocket]): Instance = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], applyTo = js.Any.fromFunction1(applyTo), getWss = js.Any.fromFunction0(getWss))
      __obj.asInstanceOf[Instance]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Instance] (val x: Self) extends AnyVal {
      
      inline def setApp(value: Application): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setApplyTo(value: RouterLike => Unit): Self = StObject.set(x, "applyTo", js.Any.fromFunction1(value))
      
      inline def setGetWss(value: () => typings.ws.mod.Server[WebSocket]): Self = StObject.set(x, "getWss", js.Any.fromFunction0(value))
    }
  }
  
  trait Options extends StObject {
    
    var leaveRouterUntouched: js.UndefOr[Boolean] = js.undefined
    
    var wsOptions: js.UndefOr[ServerOptions] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setLeaveRouterUntouched(value: Boolean): Self = StObject.set(x, "leaveRouterUntouched", value.asInstanceOf[js.Any])
      
      inline def setLeaveRouterUntouchedUndefined: Self = StObject.set(x, "leaveRouterUntouched", js.undefined)
      
      inline def setWsOptions(value: ServerOptions): Self = StObject.set(x, "wsOptions", value.asInstanceOf[js.Any])
      
      inline def setWsOptionsUndefined: Self = StObject.set(x, "wsOptions", js.undefined)
    }
  }
  
  @js.native
  trait Router
    extends IRouter
       with WithWebsocketMethod {
    
    /* InferMemberOverrides */
    override def apply(arg1: /* req */ Request, arg2: /* res */ Response, arg3: /* next */ js.UndefOr[NextFunction]): Any = js.native
  }
  
  trait RouterLike
    extends StObject
       with /* key */ NumberDictionary[Any]
       with /* key */ StringDictionary[Any] {
    
    def get(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type
    @JSName("get")
    var get_Original: IRouterMatcher[this.type]
  }
  object RouterLike {
    
    inline def apply(get: IRouterMatcher[RouterLike]): RouterLike = {
      val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouterLike]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RouterLike] (val x: Self) extends AnyVal {
      
      inline def setGet(value: IRouterMatcher[RouterLike]): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WebsocketMethod[T] extends StObject {
    
    def apply(route: PathParams, middlewares: WebsocketRequestHandler*): T = js.native
  }
  
  type WebsocketRequestHandler = js.Function3[
    /* ws */ WebSocket, 
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* next */ typings.express.mod.NextFunction, 
    Unit
  ]
  
  trait WithWebsocketMethod extends StObject {
    
    def ws(route: PathParams, middlewares: WebsocketRequestHandler*): this.type
    @JSName("ws")
    var ws_Original: WebsocketMethod[this.type]
  }
  object WithWebsocketMethod {
    
    inline def apply(ws: WebsocketMethod[WithWebsocketMethod]): WithWebsocketMethod = {
      val __obj = js.Dynamic.literal(ws = ws.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithWebsocketMethod]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WithWebsocketMethod] (val x: Self) extends AnyVal {
      
      inline def setWs(value: WebsocketMethod[WithWebsocketMethod]): Self = StObject.set(x, "ws", value.asInstanceOf[js.Any])
    }
  }
}
