package typings.feathersjsExpress

import typings.bodyParser.mod.OptionsJson
import typings.bodyParser.mod.OptionsUrlencoded
import typings.connect.mod.NextHandleFunction
import typings.express.mod.Application_
import typings.express.mod.ErrorRequestHandler
import typings.express.mod.IRouterHandler
import typings.express.mod.RequestHandler
import typings.express.mod.Response_
import typings.express.mod.RouterOptions
import typings.expressServeStaticCore.mod.Express
import typings.expressServeStaticCore.mod.NextFunction
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.PathParams
import typings.expressServeStaticCore.mod.Query
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.RequestHandlerParams
import typings.expressServeStaticCore.mod.Response
import typings.feathersjsExpress.anon.Html
import typings.feathersjsExpress.anon.PartialServiceMethodsanyS
import typings.feathersjsExpress.anon.Typeofexpress
import typings.feathersjsExpress.anon.Typeofself
import typings.feathersjsExpress.feathersjsExpressStrings.use
import typings.qs.mod.ParsedQs
import typings.serveStatic.mod.RequestHandlerConstructor
import typings.std.Exclude
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@feathersjs/express", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def Router(): typings.expressServeStaticCore.mod.Router = js.native
  def Router(options: RouterOptions): typings.expressServeStaticCore.mod.Router = js.native
  
  val default: (js.Function1[/* app */ typings.feathersjsFeathers.mod.Application[_], Application[_]]) with Typeofself = js.native
  
  def errorHandler(): ErrorRequestHandler[ParamsDictionary, _, _, Query] = js.native
  def errorHandler(options: Html): ErrorRequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  def notFound(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  val original: js.Function0[Express] with Typeofexpress = js.native
  
  /**
    * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
    */
  var static: RequestHandlerConstructor[Response_[js.Any]] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof express.express.Application, 'use'> ]: express.express.Application[P]}
  - Dropped {[ P in std.Exclude<keyof @feathersjs/feathers.@feathersjs/feathers.Application<T>, 'use'> ]: @feathersjs/feathers.@feathersjs/feathers.Application<T>[P]} */ @js.native
  trait Application[T] extends js.Object {
    
    def use(
      handlers: ((typings.expressServeStaticCore.mod.RequestHandler[ParamsDictionary, _, _, ParsedQs]) | (RequestHandlerParams[ParamsDictionary, _, _, ParsedQs]))*
    ): T = js.native
    def use(
      path: PathParams,
      handlers: ((typings.expressServeStaticCore.mod.RequestHandler[ParamsDictionary, _, _, ParsedQs]) | (RequestHandlerParams[ParamsDictionary, _, _, ParsedQs]) | PartialServiceMethodsanyS | Application[_])*
    ): T = js.native
    @JSName("use")
    var use_Original: FeathersApplicationRequestHandler[T] = js.native
  }
  
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with JSON payloads and is based on body-parser.
    * @since 4.16.0
    */
  @js.native
  object json extends js.Object {
    
    def apply(): NextHandleFunction = js.native
    def apply(options: OptionsJson): NextHandleFunction = js.native
  }
  
  @js.native
  object rest extends js.Object {
    
    def apply(): js.Function0[Unit] = js.native
    def apply(handler: RequestHandler[ParamsDictionary, _, _, Query]): js.Function0[Unit] = js.native
    
    def formatter(req: Request[ParamsDictionary, _, _, Query], res: Response[_, Double], next: NextFunction): js.Any = js.native
    @JSName("formatter")
    var formatter_Original: RequestHandler[ParamsDictionary, _, _, Query] = js.native
  }
  
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with urlencoded payloads and is based on body-parser.
    * @since 4.16.0
    */
  @js.native
  object urlencoded extends js.Object {
    
    def apply(): NextHandleFunction = js.native
    def apply(options: OptionsUrlencoded): NextHandleFunction = js.native
  }
  
  // TypeScript methods cannot be overloaded with a different signature. Derive two application types without the use methods.
  type ExpressAndFeathersApplicationWithoutUse[T] = (Omit[Application_, use]) with (Omit[typings.feathersjsFeathers.mod.Application[T], use])
  
  type FeathersApplicationRequestHandler[T] = IRouterHandler[T] with FeathersRouterMatcher[T] with (js.Function1[/* repeated */ RequestHandlerParams[ParamsDictionary, _, _, ParsedQs], T])
  
  type FeathersRouterMatcher[T] = js.Function2[
    /* path */ PathParams, 
    /* repeated */ (typings.expressServeStaticCore.mod.RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs]) | (RequestHandlerParams[ParamsDictionary, js.Any, js.Any, ParsedQs]) | PartialServiceMethodsanyS | Application[js.Any], 
    T
  ]
  
  type FeathersServiceOptions = js.Any
  
  type Omit[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]
}
