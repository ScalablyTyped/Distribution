package typings.expressOpenapi

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.Application_
import typings.express.mod.ErrorRequestHandler
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.NextFunction
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.Response
import typings.openapiFramework.distSrcTypesMod.OpenAPIFrameworkArgs
import typings.openapiFramework.mod.default
import typings.openapiTypes.mod.OpenAPIV2.Document
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-openapi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def initialize(args: ExpressOpenAPIArgs): js.Promise[default] = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[default]]
  
  trait ExpressOpenAPIArgs
    extends StObject
       with OpenAPIFrameworkArgs {
    
    var app: Application_
    
    var consumesMiddleware: js.UndefOr[
        StringDictionary[
          RequestHandler[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ]
        ]
      ] = js.undefined
    
    var docsPath: js.UndefOr[String] = js.undefined
    
    var errorMiddleware: js.UndefOr[
        ErrorRequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
      ] = js.undefined
    
    var exposeApiDocs: js.UndefOr[Boolean] = js.undefined
    
    var promiseMode: js.UndefOr[Boolean] = js.undefined
    
    var securityFilter: js.UndefOr[
        RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
      ] = js.undefined
  }
  object ExpressOpenAPIArgs {
    
    inline def apply(
      apiDoc: Document[js.Object] | typings.openapiTypes.mod.OpenAPIV3.Document[js.Object] | String,
      app: Application_
    ): ExpressOpenAPIArgs = {
      val __obj = js.Dynamic.literal(apiDoc = apiDoc.asInstanceOf[js.Any], app = app.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpressOpenAPIArgs]
    }
    
    extension [Self <: ExpressOpenAPIArgs](x: Self) {
      
      inline def setApp(value: Application_): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setConsumesMiddleware(
        value: StringDictionary[
              RequestHandler[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
                Any, 
                Any, 
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
                Record[String, Any]
              ]
            ]
      ): Self = StObject.set(x, "consumesMiddleware", value.asInstanceOf[js.Any])
      
      inline def setConsumesMiddlewareUndefined: Self = StObject.set(x, "consumesMiddleware", js.undefined)
      
      inline def setDocsPath(value: String): Self = StObject.set(x, "docsPath", value.asInstanceOf[js.Any])
      
      inline def setDocsPathUndefined: Self = StObject.set(x, "docsPath", js.undefined)
      
      inline def setErrorMiddleware(value: (/* err */ Any, /* req */ Request, /* res */ Response, /* next */ NextFunction) => Any): Self = StObject.set(x, "errorMiddleware", js.Any.fromFunction4(value))
      
      inline def setErrorMiddlewareUndefined: Self = StObject.set(x, "errorMiddleware", js.undefined)
      
      inline def setExposeApiDocs(value: Boolean): Self = StObject.set(x, "exposeApiDocs", value.asInstanceOf[js.Any])
      
      inline def setExposeApiDocsUndefined: Self = StObject.set(x, "exposeApiDocs", js.undefined)
      
      inline def setPromiseMode(value: Boolean): Self = StObject.set(x, "promiseMode", value.asInstanceOf[js.Any])
      
      inline def setPromiseModeUndefined: Self = StObject.set(x, "promiseMode", js.undefined)
      
      inline def setSecurityFilter(value: (/* req */ Request, /* res */ Response, /* next */ js.UndefOr[NextFunction]) => Any): Self = StObject.set(x, "securityFilter", js.Any.fromFunction3(value))
      
      inline def setSecurityFilterUndefined: Self = StObject.set(x, "securityFilter", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.expressOpenapi.mod.OperationFunction
    - typings.expressOpenapi.mod.OperationHandlerArray
  */
  trait Operation extends StObject
  
  @js.native
  trait OperationFunction
    extends typings.expressServeStaticCore.mod.RequestHandler
       with Operation {
    
    var apiDoc: js.UndefOr[typings.openapiTypes.mod.OpenAPI.Operation[js.Object]] = js.native
    
    /* InferMemberOverrides */
    override def apply(arg1: /* req */ Request, arg2: /* res */ Response, arg3: /* next */ js.UndefOr[NextFunction]): Any = js.native
  }
  
  trait OperationHandlerArray
    extends StObject
       with /* index */ NumberDictionary[
          RequestHandler[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ]
        ]
       with Operation {
    
    var apiDoc: js.UndefOr[typings.openapiTypes.mod.OpenAPI.Operation[js.Object]] = js.undefined
  }
  object OperationHandlerArray {
    
    inline def apply(): OperationHandlerArray = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OperationHandlerArray]
    }
    
    extension [Self <: OperationHandlerArray](x: Self) {
      
      inline def setApiDoc(value: typings.openapiTypes.mod.OpenAPI.Operation[js.Object]): Self = StObject.set(x, "apiDoc", value.asInstanceOf[js.Any])
      
      inline def setApiDocUndefined: Self = StObject.set(x, "apiDoc", js.undefined)
    }
  }
}
