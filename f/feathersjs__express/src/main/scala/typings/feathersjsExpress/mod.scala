package typings.feathersjsExpress

import typings.express.mod.Application_
import typings.express.mod.ErrorRequestHandler
import typings.express.mod.IRouterHandler
import typings.express.mod.RequestHandler
import typings.express.mod.Response_
import typings.express.mod.RouterOptions
import typings.expressServeStaticCore.mod.Express
import typings.expressServeStaticCore.mod.NextFunction
import typings.expressServeStaticCore.mod.PathParams
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.RequestHandlerParams
import typings.expressServeStaticCore.mod.Response
import typings.feathersjsExpress.anon.Html
import typings.feathersjsExpress.anon.PartialServiceMethodsanyS
import typings.feathersjsExpress.anon.Typeofself
import typings.feathersjsExpress.feathersjsExpressStrings.use
import typings.serveStatic.mod.RequestHandlerConstructor
import typings.std.Exclude
import typings.std.Pick
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@feathersjs/express", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@feathersjs/express", JSImport.Default)
  @js.native
  val default: (js.Function1[/* app */ typings.feathersjsFeathers.mod.Application[Any], Application[Any]]) & Typeofself = js.native
  
  inline def Router(): typings.expressServeStaticCore.mod.Router = ^.asInstanceOf[js.Dynamic].applyDynamic("Router")().asInstanceOf[typings.expressServeStaticCore.mod.Router]
  inline def Router(options: RouterOptions): typings.expressServeStaticCore.mod.Router = ^.asInstanceOf[js.Dynamic].applyDynamic("Router")(options.asInstanceOf[js.Any]).asInstanceOf[typings.expressServeStaticCore.mod.Router]
  
  inline def errorHandler(): ErrorRequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("errorHandler")().asInstanceOf[ErrorRequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  inline def errorHandler(options: Html): ErrorRequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("errorHandler")(options.asInstanceOf[js.Any]).asInstanceOf[ErrorRequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with JSON payloads and is based on body-parser.
    * @since 4.16.0
    */
  @JSImport("@feathersjs/express", "json")
  @js.native
  def json: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof bodyParser.json */ Any = js.native
  inline def json_=(
    x: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof bodyParser.json */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("json")(x.asInstanceOf[js.Any])
  
  inline def notFound(): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("notFound")().asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  
  @JSImport("@feathersjs/express", "original")
  @js.native
  val original: js.Function0[Express] = js.native
  
  object rest {
    
    inline def apply(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Function0[Unit]]
    inline def apply(
      handler: RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
    ): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].apply(handler.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
    
    @JSImport("@feathersjs/express", "rest")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@feathersjs/express", "rest.formatter")
    @js.native
    def formatter: RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    inline def formatter(req: Request, res: Response): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formatter")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def formatter(req: Request, res: Response, next: NextFunction): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formatter")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def formatter_=(
      x: RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatter")(x.asInstanceOf[js.Any])
  }
  
  /**
    * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
    */
  @JSImport("@feathersjs/express", "static")
  @js.native
  def static: RequestHandlerConstructor[Response_[Any, Record[String, Any]]] = js.native
  inline def static_=(x: RequestHandlerConstructor[Response_[Any, Record[String, Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("static")(x.asInstanceOf[js.Any])
  
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with urlencoded payloads and is based on body-parser.
    * @since 4.16.0
    */
  @JSImport("@feathersjs/express", "urlencoded")
  @js.native
  def urlencoded: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof bodyParser.urlencoded */ Any = js.native
  inline def urlencoded_=(
    x: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof bodyParser.urlencoded */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("urlencoded")(x.asInstanceOf[js.Any])
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof express.express.Application, 'use'> ]: express.express.Application[P]}
  - Dropped {[ P in std.Exclude<keyof @feathersjs/feathers.@feathersjs/feathers.Application<T>, 'use'> ]: @feathersjs/feathers.@feathersjs/feathers.Application<T>[P]} */ trait Application[T] extends StObject {
    
    def use(handlers: (typings.expressServeStaticCore.mod.RequestHandler | RequestHandlerParams)*): T
    def use(
      path: PathParams,
      handlers: (typings.expressServeStaticCore.mod.RequestHandler | RequestHandlerParams | PartialServiceMethodsanyS | Application[Any])*
    ): T
    @JSName("use")
    var use_Original: FeathersApplicationRequestHandler[T]
  }
  object Application {
    
    inline def apply[T](use: FeathersApplicationRequestHandler[T]): Application[T] = {
      val __obj = js.Dynamic.literal(use = use.asInstanceOf[js.Any])
      __obj.asInstanceOf[Application[T]]
    }
    
    extension [Self <: Application[?], T](x: Self & Application[T]) {
      
      inline def setUse(value: FeathersApplicationRequestHandler[T]): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    }
  }
  
  // TypeScript methods cannot be overloaded with a different signature. Derive two application types without the use methods.
  type ExpressAndFeathersApplicationWithoutUse[T] = (Omit[Application_, use]) & (Omit[typings.feathersjsFeathers.mod.Application[T], use])
  
  type FeathersApplicationRequestHandler[T] = IRouterHandler[T] & FeathersRouterMatcher[T] & (js.Function1[/* repeated */ RequestHandlerParams, T])
  
  type FeathersRouterMatcher[T] = js.Function2[
    /* path */ PathParams, 
    /* repeated */ typings.expressServeStaticCore.mod.RequestHandler | RequestHandlerParams | PartialServiceMethodsanyS | Application[Any], 
    T
  ]
  
  type FeathersServiceOptions = Any
  
  type Omit[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]
}
