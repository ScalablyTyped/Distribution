package typings.expressWs

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.Application_
import typings.express.mod.IRouterMatcher
import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.RouterOptions
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
import typings.ws.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-ws", JSImport.Namespace)
  @js.native
  def apply(app: Application_): Instance = js.native
  @JSImport("express-ws", JSImport.Namespace)
  @js.native
  def apply(app: Application_, server: js.UndefOr[scala.Nothing], options: Options): Instance = js.native
  @JSImport("express-ws", JSImport.Namespace)
  @js.native
  def apply(app: Application_, server: Server): Instance = js.native
  @JSImport("express-ws", JSImport.Namespace)
  @js.native
  def apply(app: Application_, server: Server, options: Options): Instance = js.native
  @JSImport("express-ws", JSImport.Namespace)
  @js.native
  def apply(app: Application_, server: typings.node.httpsMod.Server): Instance = js.native
  @JSImport("express-ws", JSImport.Namespace)
  @js.native
  def apply(app: Application_, server: typings.node.httpsMod.Server, options: Options): Instance = js.native
  
  /* augmented module */
  object expressAugmentingMod {
    
    @JSImport("express", "Router")
    @js.native
    def Router(options: js.UndefOr[RouterOptions]): typings.express.mod.Router = js.native
  }
  
  type Application = Application_ with WithWebsocketMethod
  
  @js.native
  trait Instance extends StObject {
    
    /**
      * Express instance itself is a request handler, which could be invoked without
      * third argument.
      */
    def app(req: Request[ParamsDictionary, _, _, ParsedQs], res: Response[_, Double]): js.Any = js.native
    def app(req: Request[ParamsDictionary, _, _, ParsedQs], res: ServerResponse): js.Any = js.native
    def app(req: IncomingMessage, res: Response[_, Double]): js.Any = js.native
    def app(req: IncomingMessage, res: ServerResponse): js.Any = js.native
    @JSName("app")
    var app_Original: Application = js.native
    
    def applyTo(target: RouterLike): Unit = js.native
    
    def getWss(): typings.ws.mod.Server = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    var leaveRouterUntouched: js.UndefOr[Boolean] = js.native
    
    var wsOptions: js.UndefOr[ServerOptions] = js.native
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
  
  type Router = typings.express.mod.Router with WithWebsocketMethod
  
  @js.native
  trait RouterLike
    extends /* key */ NumberDictionary[js.Any]
       with /* key */ StringDictionary[js.Any] {
    
    def get(path: PathParams, subApplication: typings.expressServeStaticCore.mod.Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def get[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("get")
    var get_Original: IRouterMatcher[this.type] = js.native
  }
  
  type WebsocketMethod[T] = js.Function2[/* route */ PathParams, /* repeated */ WebsocketRequestHandler, T]
  
  type WebsocketRequestHandler = js.Function3[
    /* ws */ ^, 
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* next */ NextFunction, 
    Unit
  ]
  
  @js.native
  trait WithWebsocketMethod extends StObject {
    
    def ws(route: PathParams, middlewares: WebsocketRequestHandler*): this.type = js.native
    @JSName("ws")
    var ws_Original: WebsocketMethod[this.type] = js.native
  }
}
