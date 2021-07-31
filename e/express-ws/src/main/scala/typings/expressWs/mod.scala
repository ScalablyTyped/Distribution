package typings.expressWs

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.Application_
import typings.express.mod.IRouterMatcher
import typings.express.mod.Request_
import typings.express.mod.RouterOptions
import typings.expressServeStaticCore.mod.IRouter
import typings.expressServeStaticCore.mod.NextFunction
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.PathParams
import typings.expressServeStaticCore.mod.Query
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.RequestHandler
import typings.expressServeStaticCore.mod.RequestHandlerParams
import typings.expressServeStaticCore.mod.Response
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import typings.qs.mod.ParsedQs
import typings.ws.mod.ServerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(app: Application_): Instance = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[Instance]
  @scala.inline
  def apply(app: Application_, server: Unit, options: Options): Instance = (^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any], server.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Instance]
  @scala.inline
  def apply(app: Application_, server: Server): Instance = (^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any], server.asInstanceOf[js.Any])).asInstanceOf[Instance]
  @scala.inline
  def apply(app: Application_, server: Server, options: Options): Instance = (^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any], server.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Instance]
  @scala.inline
  def apply(app: Application_, server: typings.node.httpsMod.Server): Instance = (^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any], server.asInstanceOf[js.Any])).asInstanceOf[Instance]
  @scala.inline
  def apply(app: Application_, server: typings.node.httpsMod.Server, options: Options): Instance = (^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any], server.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Instance]
  
  @JSImport("express-ws", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* augmented module */
  object expressAugmentingMod {
    
    @JSImport("express", JSImport.Namespace)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def Router(options: js.UndefOr[RouterOptions]): typings.express.mod.Router = ^.asInstanceOf[js.Dynamic].applyDynamic("Router")(options.asInstanceOf[js.Any]).asInstanceOf[typings.express.mod.Router]
  }
  
  @js.native
  trait Application
    extends typings.expressServeStaticCore.mod.Application
       with WithWebsocketMethod
  
  trait Instance extends StObject {
    
    /**
      * Express instance itself is a request handler, which could be invoked without
      * third argument.
      */
    def app(req: Request[ParamsDictionary, js.Any, js.Any, ParsedQs], res: Response[js.Any, Double]): js.Any
    def app(req: Request[ParamsDictionary, js.Any, js.Any, ParsedQs], res: ServerResponse): js.Any
    def app(req: IncomingMessage, res: Response[js.Any, Double]): js.Any
    def app(req: IncomingMessage, res: ServerResponse): js.Any
    @JSName("app")
    var app_Original: Application
    
    def applyTo(target: RouterLike): Unit
    
    def getWss(): typings.ws.mod.Server
  }
  object Instance {
    
    @scala.inline
    def apply(app: Application, applyTo: RouterLike => Unit, getWss: () => typings.ws.mod.Server): Instance = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], applyTo = js.Any.fromFunction1(applyTo), getWss = js.Any.fromFunction0(getWss))
      __obj.asInstanceOf[Instance]
    }
    
    @scala.inline
    implicit class InstanceMutableBuilder[Self <: Instance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApp(value: Application): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplyTo(value: RouterLike => Unit): Self = StObject.set(x, "applyTo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetWss(value: () => typings.ws.mod.Server): Self = StObject.set(x, "getWss", js.Any.fromFunction0(value))
    }
  }
  
  trait Options extends StObject {
    
    var leaveRouterUntouched: js.UndefOr[Boolean] = js.undefined
    
    var wsOptions: js.UndefOr[ServerOptions] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeaveRouterUntouched(value: Boolean): Self = StObject.set(x, "leaveRouterUntouched", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeaveRouterUntouchedUndefined: Self = StObject.set(x, "leaveRouterUntouched", js.undefined)
      
      @scala.inline
      def setWsOptions(value: ServerOptions): Self = StObject.set(x, "wsOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWsOptionsUndefined: Self = StObject.set(x, "wsOptions", js.undefined)
    }
  }
  
  @js.native
  trait Router
    extends IRouter
       with WithWebsocketMethod {
    
    /* InferMemberOverrides */
    override def apply(
      arg1: /* req */ Request[ParamsDictionary, js.Any, js.Any, ParsedQs],
      arg2: /* res */ Response[js.Any, Double],
      arg3: /* next */ NextFunction
    ): js.Any = js.native
  }
  
  trait RouterLike
    extends StObject
       with /* key */ NumberDictionary[js.Any]
       with /* key */ StringDictionary[js.Any] {
    
    def get(path: PathParams, subApplication: typings.expressServeStaticCore.mod.Application): this.type
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def get[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type
    @JSName("get")
    var get_Original: IRouterMatcher[this.type]
  }
  object RouterLike {
    
    @scala.inline
    def apply(get: IRouterMatcher[RouterLike]): RouterLike = {
      val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouterLike]
    }
    
    @scala.inline
    implicit class RouterLikeMutableBuilder[Self <: RouterLike] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet(value: IRouterMatcher[RouterLike]): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WebsocketMethod[T] extends StObject {
    
    def apply(route: PathParams, middlewares: WebsocketRequestHandler*): T = js.native
  }
  
  type WebsocketRequestHandler = js.Function3[
    /* ws */ typings.ws.mod.^, 
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* next */ typings.express.mod.NextFunction, 
    Unit
  ]
  
  trait WithWebsocketMethod extends StObject {
    
    def ws(route: PathParams, middlewares: WebsocketRequestHandler*): this.type
    @JSName("ws")
    var ws_Original: WebsocketMethod[this.type]
  }
  object WithWebsocketMethod {
    
    @scala.inline
    def apply(ws: WebsocketMethod[WithWebsocketMethod]): WithWebsocketMethod = {
      val __obj = js.Dynamic.literal(ws = ws.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithWebsocketMethod]
    }
    
    @scala.inline
    implicit class WithWebsocketMethodMutableBuilder[Self <: WithWebsocketMethod] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWs(value: WebsocketMethod[WithWebsocketMethod]): Self = StObject.set(x, "ws", value.asInstanceOf[js.Any])
    }
  }
}
