package typings.ethJsonRpcMiddleware

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fetchMod {
  
  @JSImport("eth-json-rpc-middleware/dist/fetch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createFetchConfigFromReq(hasReqRpcUrlOriginHttpHeaderKey: FetchMiddlewareFromReqOptions): FetchConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("createFetchConfigFromReq")(hasReqRpcUrlOriginHttpHeaderKey.asInstanceOf[js.Any]).asInstanceOf[FetchConfig]
  
  inline def createFetchMiddleware(hasRpcUrlOriginHttpHeaderKey: FetchMiddlewareOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createFetchMiddleware")(hasRpcUrlOriginHttpHeaderKey.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  trait FetchConfig extends StObject {
    
    var fetchParams: Request
    
    var fetchUrl: String
  }
  object FetchConfig {
    
    inline def apply(fetchParams: Request, fetchUrl: String): FetchConfig = {
      val __obj = js.Dynamic.literal(fetchParams = fetchParams.asInstanceOf[js.Any], fetchUrl = fetchUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchConfig]
    }
    
    extension [Self <: FetchConfig](x: Self) {
      
      inline def setFetchParams(value: Request): Self = StObject.set(x, "fetchParams", value.asInstanceOf[js.Any])
      
      inline def setFetchUrl(value: String): Self = StObject.set(x, "fetchUrl", value.asInstanceOf[js.Any])
    }
  }
  
  trait FetchMiddlewareFromReqOptions
    extends StObject
       with FetchMiddlewareOptions {
    
    var req: PayloadWithOrigin
  }
  object FetchMiddlewareFromReqOptions {
    
    inline def apply(req: PayloadWithOrigin, rpcUrl: String): FetchMiddlewareFromReqOptions = {
      val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any], rpcUrl = rpcUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchMiddlewareFromReqOptions]
    }
    
    extension [Self <: FetchMiddlewareFromReqOptions](x: Self) {
      
      inline def setReq(value: PayloadWithOrigin): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    }
  }
  
  trait FetchMiddlewareOptions extends StObject {
    
    var originHttpHeaderKey: js.UndefOr[String] = js.undefined
    
    var rpcUrl: String
  }
  object FetchMiddlewareOptions {
    
    inline def apply(rpcUrl: String): FetchMiddlewareOptions = {
      val __obj = js.Dynamic.literal(rpcUrl = rpcUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchMiddlewareOptions]
    }
    
    extension [Self <: FetchMiddlewareOptions](x: Self) {
      
      inline def setOriginHttpHeaderKey(value: String): Self = StObject.set(x, "originHttpHeaderKey", value.asInstanceOf[js.Any])
      
      inline def setOriginHttpHeaderKeyUndefined: Self = StObject.set(x, "originHttpHeaderKey", js.undefined)
      
      inline def setRpcUrl(value: String): Self = StObject.set(x, "rpcUrl", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JsonRpcRequest<Array<any>> * / any ]:? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JsonRpcRequest<Array<any>> * / any[P]} */ trait PayloadWithOrigin extends StObject {
    
    var origin: js.UndefOr[String] = js.undefined
  }
  object PayloadWithOrigin {
    
    inline def apply(): PayloadWithOrigin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PayloadWithOrigin]
    }
    
    extension [Self <: PayloadWithOrigin](x: Self) {
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    }
  }
  
  trait Request extends StObject {
    
    var body: String
    
    var headers: Record[String, String]
    
    var method: String
  }
  object Request {
    
    inline def apply(body: String, headers: Record[String, String], method: String): Request = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    extension [Self <: Request](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    }
  }
}
