package typings.expressOpenapi

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.Application_
import typings.express.mod.ErrorRequestHandler
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.NextFunction
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.Response
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.openapiFramework.mod.default
import typings.openapiFramework.typesMod.OpenAPIFrameworkArgs
import typings.openapiTypes.mod.OpenAPIV2.Document
import typings.qs.mod.ParsedQs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-openapi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def initialize(args: ExpressOpenAPIArgs): default = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(args.asInstanceOf[js.Any]).asInstanceOf[default]
  
  trait ExpressOpenAPIArgs
    extends StObject
       with OpenAPIFrameworkArgs {
    
    /**
      * Express instance itself is a request handler, which could be invoked without
      * third argument.
      */
    def app(req: Request[ParamsDictionary, js.Any, js.Any, ParsedQs], res: Response[js.Any, Double]): js.Any
    def app(req: Request[ParamsDictionary, js.Any, js.Any, ParsedQs], res: ServerResponse): js.Any
    def app(req: IncomingMessage, res: Response[js.Any, Double]): js.Any
    def app(req: IncomingMessage, res: ServerResponse): js.Any
    @JSName("app")
    var app_Original: Application_
    
    var consumesMiddleware: js.UndefOr[StringDictionary[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]] = js.undefined
    
    var docsPath: js.UndefOr[String] = js.undefined
    
    var errorMiddleware: js.UndefOr[ErrorRequestHandler[ParamsDictionary, js.Any, js.Any, Query]] = js.undefined
    
    var exposeApiDocs: js.UndefOr[Boolean] = js.undefined
    
    var promiseMode: js.UndefOr[Boolean] = js.undefined
    
    var securityFilter: js.UndefOr[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]] = js.undefined
  }
  object ExpressOpenAPIArgs {
    
    @scala.inline
    def apply(apiDoc: Document | typings.openapiTypes.mod.OpenAPIV3.Document | String, app: Application_): ExpressOpenAPIArgs = {
      val __obj = js.Dynamic.literal(apiDoc = apiDoc.asInstanceOf[js.Any], app = app.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpressOpenAPIArgs]
    }
    
    @scala.inline
    implicit class ExpressOpenAPIArgsMutableBuilder[Self <: ExpressOpenAPIArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApp(value: Application_): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsumesMiddleware(value: StringDictionary[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]): Self = StObject.set(x, "consumesMiddleware", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsumesMiddlewareUndefined: Self = StObject.set(x, "consumesMiddleware", js.undefined)
      
      @scala.inline
      def setDocsPath(value: String): Self = StObject.set(x, "docsPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocsPathUndefined: Self = StObject.set(x, "docsPath", js.undefined)
      
      @scala.inline
      def setErrorMiddleware(
        value: (/* err */ js.Any, /* req */ Request[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response[js.Any, Double], /* next */ NextFunction) => js.Any
      ): Self = StObject.set(x, "errorMiddleware", js.Any.fromFunction4(value))
      
      @scala.inline
      def setErrorMiddlewareUndefined: Self = StObject.set(x, "errorMiddleware", js.undefined)
      
      @scala.inline
      def setExposeApiDocs(value: Boolean): Self = StObject.set(x, "exposeApiDocs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExposeApiDocsUndefined: Self = StObject.set(x, "exposeApiDocs", js.undefined)
      
      @scala.inline
      def setPromiseMode(value: Boolean): Self = StObject.set(x, "promiseMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromiseModeUndefined: Self = StObject.set(x, "promiseMode", js.undefined)
      
      @scala.inline
      def setSecurityFilter(
        value: (/* req */ Request[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response[js.Any, Double], /* next */ NextFunction) => js.Any
      ): Self = StObject.set(x, "securityFilter", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSecurityFilterUndefined: Self = StObject.set(x, "securityFilter", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.expressOpenapi.mod.OperationFunction
    - typings.expressOpenapi.mod.OperationHandlerArray
  */
  trait Operation extends StObject
  
  @js.native
  trait OperationFunction
    extends typings.expressServeStaticCore.mod.RequestHandler[ParamsDictionary, js.Any, js.Any, Query]
       with Operation {
    
    var apiDoc: js.UndefOr[typings.openapiTypes.mod.OpenAPI.Operation] = js.native
    
    /* InferMemberOverrides */
    override def apply(
      arg1: /* req */ Request[ParamsDictionary, js.Any, js.Any, Query],
      arg2: /* res */ Response[js.Any, Double],
      arg3: /* next */ NextFunction
    ): js.Any = js.native
  }
  
  trait OperationHandlerArray
    extends StObject
       with /* index */ NumberDictionary[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
       with Operation {
    
    var apiDoc: js.UndefOr[typings.openapiTypes.mod.OpenAPI.Operation] = js.undefined
  }
  object OperationHandlerArray {
    
    @scala.inline
    def apply(): OperationHandlerArray = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OperationHandlerArray]
    }
    
    @scala.inline
    implicit class OperationHandlerArrayMutableBuilder[Self <: OperationHandlerArray] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiDoc(value: typings.openapiTypes.mod.OpenAPI.Operation): Self = StObject.set(x, "apiDoc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiDocUndefined: Self = StObject.set(x, "apiDoc", js.undefined)
    }
  }
}
