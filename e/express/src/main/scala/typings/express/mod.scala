package typings.express

import typings.bodyParser.mod.Options
import typings.bodyParser.mod.OptionsJson
import typings.bodyParser.mod.OptionsText
import typings.bodyParser.mod.OptionsUrlencoded
import typings.connect.mod.NextHandleFunction
import typings.express.anon.FnCall
import typings.expressServeStaticCore.mod.Application
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.Response
import typings.qs.mod.IParseOptions
import typings.serveStatic.mod.RequestHandlerConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Creates an Express application. The express() function is a top-level function exported by the express module.
    */
  @scala.inline
  def apply(): typings.expressServeStaticCore.mod.Express = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.expressServeStaticCore.mod.Express]
  
  @JSImport("express", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def Router(): typings.expressServeStaticCore.mod.Router = ^.asInstanceOf[js.Dynamic].applyDynamic("Router")().asInstanceOf[typings.expressServeStaticCore.mod.Router]
  @scala.inline
  def Router(options: RouterOptions): typings.expressServeStaticCore.mod.Router = ^.asInstanceOf[js.Dynamic].applyDynamic("Router")(options.asInstanceOf[js.Any]).asInstanceOf[typings.expressServeStaticCore.mod.Router]
  type Router = typings.expressServeStaticCore.mod.Router
  
  /**
    * These are the exposed prototypes.
    */
  @JSImport("express", "application")
  @js.native
  def application: Application_ = js.native
  @scala.inline
  def application_=(x: Application_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("application")(x.asInstanceOf[js.Any])
  
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with JSON payloads and is based on body-parser.
    * @since 4.16.0
    */
  @scala.inline
  def json(): NextHandleFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("json")().asInstanceOf[NextHandleFunction]
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with JSON payloads and is based on body-parser.
    * @since 4.16.0
    */
  @scala.inline
  def json(options: OptionsJson): NextHandleFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("json")(options.asInstanceOf[js.Any]).asInstanceOf[NextHandleFunction]
  
  @scala.inline
  def query(options: FnCall): Handler = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(options.asInstanceOf[js.Any]).asInstanceOf[Handler]
  @scala.inline
  def query(options: IParseOptions): Handler = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(options.asInstanceOf[js.Any]).asInstanceOf[Handler]
  
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with Buffer payloads and is based on body-parser.
    * @since 4.17.0
    */
  @scala.inline
  def raw(): NextHandleFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("raw")().asInstanceOf[NextHandleFunction]
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with Buffer payloads and is based on body-parser.
    * @since 4.17.0
    */
  @scala.inline
  def raw(options: Options): NextHandleFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("raw")(options.asInstanceOf[js.Any]).asInstanceOf[NextHandleFunction]
  
  @JSImport("express", "request")
  @js.native
  def request: Request_[ParamsDictionary, js.Any, js.Any, Query] = js.native
  @scala.inline
  def request_=(x: Request_[ParamsDictionary, js.Any, js.Any, Query]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("request")(x.asInstanceOf[js.Any])
  
  @JSImport("express", "response")
  @js.native
  def response: Response_[js.Any] = js.native
  @scala.inline
  def response_=(x: Response_[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("response")(x.asInstanceOf[js.Any])
  
  /**
    * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
    */
  @JSImport("express", "static")
  @js.native
  def static: RequestHandlerConstructor[Response_[js.Any]] = js.native
  @scala.inline
  def static_=(x: RequestHandlerConstructor[Response_[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("static")(x.asInstanceOf[js.Any])
  
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with text payloads and is based on body-parser.
    * @since 4.17.0
    */
  @scala.inline
  def text(): NextHandleFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("text")().asInstanceOf[NextHandleFunction]
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with text payloads and is based on body-parser.
    * @since 4.17.0
    */
  @scala.inline
  def text(options: OptionsText): NextHandleFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(options.asInstanceOf[js.Any]).asInstanceOf[NextHandleFunction]
  
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with urlencoded payloads and is based on body-parser.
    * @since 4.16.0
    */
  @scala.inline
  def urlencoded(): NextHandleFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("urlencoded")().asInstanceOf[NextHandleFunction]
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with urlencoded payloads and is based on body-parser.
    * @since 4.16.0
    */
  @scala.inline
  def urlencoded(options: OptionsUrlencoded): NextHandleFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("urlencoded")(options.asInstanceOf[js.Any]).asInstanceOf[NextHandleFunction]
  
  type Application_ = Application
  
  type CookieOptions = typings.expressServeStaticCore.mod.CookieOptions
  
  type Errback = typings.expressServeStaticCore.mod.Errback
  
  type ErrorRequestHandler[P, ResBody, ReqBody, ReqQuery] = typings.expressServeStaticCore.mod.ErrorRequestHandler[P, ResBody, ReqBody, ReqQuery]
  
  type Express = typings.expressServeStaticCore.mod.Express
  
  type Handler = typings.expressServeStaticCore.mod.Handler
  
  type IRoute = typings.expressServeStaticCore.mod.IRoute
  
  type IRouter = typings.expressServeStaticCore.mod.IRouter
  
  type IRouterHandler[T] = typings.expressServeStaticCore.mod.IRouterHandler[T]
  
  type IRouterMatcher[T] = typings.expressServeStaticCore.mod.IRouterMatcher[T, js.Any]
  
  type MediaType = typings.expressServeStaticCore.mod.MediaType
  
  type NextFunction = typings.expressServeStaticCore.mod.NextFunction
  
  type RequestHandler[P, ResBody, ReqBody, ReqQuery] = typings.expressServeStaticCore.mod.RequestHandler[P, ResBody, ReqBody, ReqQuery]
  
  type RequestParamHandler = typings.expressServeStaticCore.mod.RequestParamHandler
  
  type Request_[P, ResBody, ReqBody, ReqQuery] = Request[P, ResBody, ReqBody, ReqQuery]
  
  type Response_[ResBody] = Response[ResBody, Double]
  
  trait RouterOptions extends StObject {
    
    /**
      * Enable case sensitivity.
      */
    var caseSensitive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Preserve the req.params values from the parent router.
      * If the parent and the child have conflicting param names, the child’s value take precedence.
      *
      * @default false
      * @since 4.5.0
      */
    var mergeParams: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable strict routing.
      */
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object RouterOptions {
    
    @scala.inline
    def apply(): RouterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouterOptions]
    }
    
    @scala.inline
    implicit class RouterOptionsMutableBuilder[Self <: RouterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      @scala.inline
      def setMergeParams(value: Boolean): Self = StObject.set(x, "mergeParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergeParamsUndefined: Self = StObject.set(x, "mergeParams", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  type Send = typings.expressServeStaticCore.mod.Send[js.Any, Response[js.Any, Double]]
}
