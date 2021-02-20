package typings.feathersjsExpress

import typings.bodyParser.mod.OptionsJson
import typings.bodyParser.mod.OptionsUrlencoded
import typings.connect.mod.NextHandleFunction
import typings.express.mod.ErrorRequestHandler
import typings.express.mod.RequestHandler
import typings.express.mod.Response_
import typings.express.mod.RouterOptions
import typings.expressServeStaticCore.mod.NextFunction
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.Response
import typings.feathersjsFeathers.mod.Application
import typings.feathersjsFeathers.mod.Id
import typings.feathersjsFeathers.mod.NullableId
import typings.feathersjsFeathers.mod.Paginated
import typings.serveStatic.mod.RequestHandlerConstructor
import typings.serveStatic.mod.ServeStaticOptions
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call extends StObject {
    
    def apply(): js.Function0[Unit] = js.native
    def apply(handler: RequestHandler[ParamsDictionary, _, _, Query]): js.Function0[Unit] = js.native
    
    def formatter(req: Request[ParamsDictionary, _, _, Query], res: Response[_, Double], next: NextFunction): js.Any = js.native
    @JSName("formatter")
    var formatter_Original: RequestHandler[ParamsDictionary, _, _, Query] = js.native
  }
  
  @js.native
  trait Error extends StObject {
    
    var error: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.native
  }
  object Error {
    
    @scala.inline
    def apply(): Error = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: /* msg */ String => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    }
  }
  
  @js.native
  trait Html extends StObject {
    
    var html: js.UndefOr[js.Any] = js.native
    
    var json: js.UndefOr[js.Any] = js.native
    
    var logger: js.UndefOr[Error] = js.native
    
    var public: js.UndefOr[String] = js.native
  }
  object Html {
    
    @scala.inline
    def apply(): Html = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Html]
    }
    
    @scala.inline
    implicit class HtmlMutableBuilder[Self <: Html] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHtml(value: js.Any): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      @scala.inline
      def setJson(value: js.Any): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      @scala.inline
      def setLogger(value: Error): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setPublic(value: String): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@feathersjs/feathers.@feathersjs/feathers.ServiceMethods<any> & @feathersjs/feathers.@feathersjs/feathers.SetupMethod> */
  @js.native
  trait PartialServiceMethodsanyS extends StObject {
    
    var create: js.UndefOr[js.Function1[/* data */ Partial[_], js.Promise[_ | js.Array[_]]]] = js.native
    
    var find: js.UndefOr[js.Function0[js.Promise[_ | js.Array[_] | Paginated[_]]]] = js.native
    
    var get: js.UndefOr[js.Function1[/* id */ Id, js.Promise[_]]] = js.native
    
    var patch: js.UndefOr[js.Function2[/* id */ NullableId, /* data */ Partial[_], js.Promise[_]]] = js.native
    
    var remove: js.UndefOr[js.Function1[/* id */ NullableId, js.Promise[_]]] = js.native
    
    var setup: js.UndefOr[js.Function2[/* app */ Application[_], /* path */ String, Unit]] = js.native
    
    var update: js.UndefOr[js.Function2[/* id */ NullableId, /* data */ js.Any, js.Promise[_]]] = js.native
  }
  object PartialServiceMethodsanyS {
    
    @scala.inline
    def apply(): PartialServiceMethodsanyS = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialServiceMethodsanyS]
    }
    
    @scala.inline
    implicit class PartialServiceMethodsanySMutableBuilder[Self <: PartialServiceMethodsanyS] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate(value: /* data */ Partial[_] => js.Promise[_ | js.Array[_]]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      @scala.inline
      def setFind(value: () => js.Promise[_ | js.Array[_] | Paginated[_]]): Self = StObject.set(x, "find", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFindUndefined: Self = StObject.set(x, "find", js.undefined)
      
      @scala.inline
      def setGet(value: /* id */ Id => js.Promise[_]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
      
      @scala.inline
      def setPatch(value: (/* id */ NullableId, /* data */ Partial[_]) => js.Promise[_]): Self = StObject.set(x, "patch", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
      
      @scala.inline
      def setRemove(value: /* id */ NullableId => js.Promise[_]): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      @scala.inline
      def setSetup(value: (/* app */ Application[_], /* path */ String) => Unit): Self = StObject.set(x, "setup", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetupUndefined: Self = StObject.set(x, "setup", js.undefined)
      
      @scala.inline
      def setUpdate(value: (/* id */ NullableId, /* data */ js.Any) => js.Promise[_]): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  @js.native
  trait Typeofjson extends StObject {
    
    def apply(): NextHandleFunction = js.native
    def apply(options: OptionsJson): NextHandleFunction = js.native
  }
  
  @js.native
  trait Typeofself extends StObject {
    
    def default[T](app: Application[T]): typings.feathersjsExpress.mod.Application[T] = js.native
    
    def Router(): typings.expressServeStaticCore.mod.Router = js.native
    def Router(options: RouterOptions): typings.expressServeStaticCore.mod.Router = js.native
    
    def errorHandler(): ErrorRequestHandler[ParamsDictionary, _, _, Query] = js.native
    def errorHandler(options: Html): ErrorRequestHandler[ParamsDictionary, _, _, Query] = js.native
    
    /**
      * This is a built-in middleware function in Express. It parses incoming requests with JSON payloads and is based on body-parser.
      * @since 4.16.0
      */
    val json: Typeofjson = js.native
    
    def notFound(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    
    def rest(): js.Function0[Unit] = js.native
    def rest(handler: RequestHandler[ParamsDictionary, _, _, Query]): js.Function0[Unit] = js.native
    @JSName("rest")
    val rest_Original: Call = js.native
    
    /**
      * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
      */
    def static(root: String): typings.serveStatic.mod.RequestHandler[Response_[_]] = js.native
    /**
      * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
      */
    def static(root: String, options: ServeStaticOptions[Response_[_]]): typings.serveStatic.mod.RequestHandler[Response_[_]] = js.native
    /**
      * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
      */
    @JSName("static")
    var static_Original: RequestHandlerConstructor[Response_[_]] = js.native
    
    /**
      * This is a built-in middleware function in Express. It parses incoming requests with urlencoded payloads and is based on body-parser.
      * @since 4.16.0
      */
    val urlencoded: Typeofurlencoded = js.native
  }
  
  @js.native
  trait Typeofurlencoded extends StObject {
    
    def apply(): NextHandleFunction = js.native
    def apply(options: OptionsUrlencoded): NextHandleFunction = js.native
  }
}
