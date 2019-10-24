package typings.atFeathersjsExpress

import typings.atFeathersjsExpress.atFeathersjsExpressMod.Application
import typings.atFeathersjsExpress.atFeathersjsExpressMod.FeathersApplicationRequestHandler
import typings.atFeathersjsExpress.atFeathersjsExpressMod.FeathersRouterMatcher
import typings.atFeathersjsExpress.atFeathersjsExpressStrings.use
import typings.atFeathersjsFeathers.atFeathersjsFeathersMod.ServiceMethods
import typings.atFeathersjsFeathers.atFeathersjsFeathersMod.SetupMethod
import typings.bodyDashParser.bodyDashParserMod.OptionsJson
import typings.bodyDashParser.bodyDashParserMod.OptionsUrlencoded
import typings.connect.connectMod.NextHandleFunction
import typings.express.Typeofm
import typings.express.expressMod.ErrorRequestHandler
import typings.express.expressMod.IRouterHandler
import typings.express.expressMod.RouterOptions
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Express
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Handler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.NextFunction
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.PathParams
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.RequestHandler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.RequestHandlerParams
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Response
import typings.serveDashStatic.serveDashStaticMod.ServeStaticOptions
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@feathersjs/express", JSImport.Namespace)
@js.native
object atFeathersjsExpressMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof express.express.Application, 'use'> ]: express.express.Application[P]}
  - Dropped {[ P in std.Exclude<keyof @feathersjs/feathers.@feathersjs/feathers.Application<T>, 'use'> ]: @feathersjs/feathers.@feathersjs/feathers.Application<T>[P]} */ @js.native
  trait Application[T] extends js.Object {
    @JSName("use")
    var use_Original: FeathersApplicationRequestHandler[T] = js.native
    def use(handlers: (RequestHandler[ParamsDictionary] | RequestHandlerParams[ParamsDictionary])*): T = js.native
    def use(
      path: PathParams,
      handlers: (RequestHandler[ParamsDictionary] | RequestHandlerParams[ParamsDictionary] | (Partial[ServiceMethods[_] with SetupMethod]) | Application[_])*
    ): T = js.native
  }
  
  val default: (js.Function1[
    /* app */ typings.atFeathersjsFeathers.atFeathersjsFeathersMod.Application[_], 
    Application[_]
  ]) with Typeofself = js.native
  val original: js.Function0[Express] with Typeofexpress = js.native
  def Router(): typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Router = js.native
  def Router(options: RouterOptions): typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Router = js.native
  def errorHandler(): ErrorRequestHandler = js.native
  def errorHandler(options: Anon_Html): ErrorRequestHandler = js.native
  def notFound(): typings.express.expressMod.RequestHandler = js.native
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
    @JSName("formatter")
    var formatter_Original: typings.express.expressMod.RequestHandler = js.native
    def apply(): js.Function0[Unit] = js.native
    def apply(handler: typings.express.expressMod.RequestHandler): js.Function0[Unit] = js.native
    def formatter(req: Request[ParamsDictionary], res: Response, next: NextFunction): js.Any = js.native
  }
  
  /**
    * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
    */
  @js.native
  object static extends js.Object {
    var mime: Typeofm = js.native
    def apply(root: String): Handler = js.native
    def apply(root: String, options: ServeStaticOptions): Handler = js.native
    def serveStatic(root: String): Handler = js.native
    def serveStatic(root: String, options: ServeStaticOptions): Handler = js.native
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
  type ExpressAndFeathersApplicationWithoutUse[T] = (Omit[typings.express.expressMod.Application, use]) with (Omit[typings.atFeathersjsFeathers.atFeathersjsFeathersMod.Application[T], use])
  type FeathersApplicationRequestHandler[T] = IRouterHandler[T] with FeathersRouterMatcher[T] with (js.Function1[/* repeated */ RequestHandlerParams[ParamsDictionary], T])
  type FeathersRouterMatcher[T] = js.Function2[
    /* path */ PathParams, 
    /* repeated */ RequestHandler[ParamsDictionary] | RequestHandlerParams[ParamsDictionary] | (Partial[ServiceMethods[_] with SetupMethod]) | Application[js.Any], 
    T
  ]
  type FeathersServiceOptions = js.Any
}

