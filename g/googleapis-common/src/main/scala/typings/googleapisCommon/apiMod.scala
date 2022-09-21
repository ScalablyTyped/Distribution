package typings.googleapisCommon

import typings.gaxios.commonMod.GaxiosOptions
import typings.gaxios.commonMod.GaxiosResponse
import typings.googleAuthLibrary.googleauthMod.JSONClient
import typings.googleAuthLibrary.mod.BaseExternalAccountClient
import typings.googleAuthLibrary.mod.GoogleAuth
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleapisCommon.endpointMod.Endpoint
import typings.googleapisCommon.googleapisCommonStrings.stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiMod {
  
  type APIEndpoint = Endpoint & Any
  
  trait APIRequestContext extends StObject {
    
    var _options: GlobalOptions
    
    var google: js.UndefOr[GoogleConfigurable] = js.undefined
  }
  object APIRequestContext {
    
    inline def apply(_options: GlobalOptions): APIRequestContext = {
      val __obj = js.Dynamic.literal(_options = _options.asInstanceOf[js.Any])
      __obj.asInstanceOf[APIRequestContext]
    }
    
    extension [Self <: APIRequestContext](x: Self) {
      
      inline def setGoogle(value: GoogleConfigurable): Self = StObject.set(x, "google", value.asInstanceOf[js.Any])
      
      inline def setGoogleUndefined: Self = StObject.set(x, "google", js.undefined)
      
      inline def set_options(value: GlobalOptions): Self = StObject.set(x, "_options", value.asInstanceOf[js.Any])
    }
  }
  
  trait APIRequestParams[T] extends StObject {
    
    var context: APIRequestContext
    
    var mediaUrl: js.UndefOr[String | Null] = js.undefined
    
    var options: MethodOptions
    
    var params: T
    
    var pathParams: js.Array[String]
    
    var requiredParams: js.Array[String]
  }
  object APIRequestParams {
    
    inline def apply[T](
      context: APIRequestContext,
      options: MethodOptions,
      params: T,
      pathParams: js.Array[String],
      requiredParams: js.Array[String]
    ): APIRequestParams[T] = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], pathParams = pathParams.asInstanceOf[js.Any], requiredParams = requiredParams.asInstanceOf[js.Any])
      __obj.asInstanceOf[APIRequestParams[T]]
    }
    
    extension [Self <: APIRequestParams[?], T](x: Self & APIRequestParams[T]) {
      
      inline def setContext(value: APIRequestContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setMediaUrl(value: String): Self = StObject.set(x, "mediaUrl", value.asInstanceOf[js.Any])
      
      inline def setMediaUrlNull: Self = StObject.set(x, "mediaUrl", null)
      
      inline def setMediaUrlUndefined: Self = StObject.set(x, "mediaUrl", js.undefined)
      
      inline def setOptions(value: MethodOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setParams(value: T): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setPathParams(value: js.Array[String]): Self = StObject.set(x, "pathParams", value.asInstanceOf[js.Any])
      
      inline def setPathParamsVarargs(value: String*): Self = StObject.set(x, "pathParams", js.Array(value*))
      
      inline def setRequiredParams(value: js.Array[String]): Self = StObject.set(x, "requiredParams", value.asInstanceOf[js.Any])
      
      inline def setRequiredParamsVarargs(value: String*): Self = StObject.set(x, "requiredParams", js.Array(value*))
    }
  }
  
  type BodyResponseCallback[T] = js.Function2[/* err */ js.Error | Null, /* res */ js.UndefOr[GaxiosResponse[T] | Null], Unit]
  
  trait GlobalOptions
    extends StObject
       with MethodOptions {
    
    var auth: js.UndefOr[GoogleAuth[JSONClient] | OAuth2Client | BaseExternalAccountClient | String] = js.undefined
  }
  object GlobalOptions {
    
    inline def apply(): GlobalOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalOptions]
    }
    
    extension [Self <: GlobalOptions](x: Self) {
      
      inline def setAuth(value: GoogleAuth[JSONClient] | OAuth2Client | BaseExternalAccountClient | String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    }
  }
  
  trait GoogleConfigurable extends StObject {
    
    var _options: GlobalOptions
  }
  object GoogleConfigurable {
    
    inline def apply(_options: GlobalOptions): GoogleConfigurable = {
      val __obj = js.Dynamic.literal(_options = _options.asInstanceOf[js.Any])
      __obj.asInstanceOf[GoogleConfigurable]
    }
    
    extension [Self <: GoogleConfigurable](x: Self) {
      
      inline def set_options(value: GlobalOptions): Self = StObject.set(x, "_options", value.asInstanceOf[js.Any])
    }
  }
  
  trait MethodOptions
    extends StObject
       with GaxiosOptions {
    
    var http2: js.UndefOr[Boolean] = js.undefined
    
    var rootUrl: js.UndefOr[String] = js.undefined
    
    var userAgentDirectives: js.UndefOr[js.Array[UserAgentDirective]] = js.undefined
  }
  object MethodOptions {
    
    inline def apply(): MethodOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MethodOptions]
    }
    
    extension [Self <: MethodOptions](x: Self) {
      
      inline def setHttp2(value: Boolean): Self = StObject.set(x, "http2", value.asInstanceOf[js.Any])
      
      inline def setHttp2Undefined: Self = StObject.set(x, "http2", js.undefined)
      
      inline def setRootUrl(value: String): Self = StObject.set(x, "rootUrl", value.asInstanceOf[js.Any])
      
      inline def setRootUrlUndefined: Self = StObject.set(x, "rootUrl", js.undefined)
      
      inline def setUserAgentDirectives(value: js.Array[UserAgentDirective]): Self = StObject.set(x, "userAgentDirectives", value.asInstanceOf[js.Any])
      
      inline def setUserAgentDirectivesUndefined: Self = StObject.set(x, "userAgentDirectives", js.undefined)
      
      inline def setUserAgentDirectivesVarargs(value: UserAgentDirective*): Self = StObject.set(x, "userAgentDirectives", js.Array(value*))
    }
  }
  
  trait ServiceOptions
    extends StObject
       with GlobalOptions {
    
    var version: js.UndefOr[String] = js.undefined
  }
  object ServiceOptions {
    
    inline def apply(): ServiceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceOptions]
    }
    
    extension [Self <: ServiceOptions](x: Self) {
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait StreamMethodOptions
    extends StObject
       with MethodOptions {
    
    @JSName("responseType")
    var responseType_StreamMethodOptions: stream
  }
  object StreamMethodOptions {
    
    inline def apply(): StreamMethodOptions = {
      val __obj = js.Dynamic.literal(responseType = "stream")
      __obj.asInstanceOf[StreamMethodOptions]
    }
    
    extension [Self <: StreamMethodOptions](x: Self) {
      
      inline def setResponseType(value: stream): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserAgentDirective extends StObject {
    
    var comment: js.UndefOr[String] = js.undefined
    
    var product: String
    
    var version: String
  }
  object UserAgentDirective {
    
    inline def apply(product: String, version: String): UserAgentDirective = {
      val __obj = js.Dynamic.literal(product = product.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserAgentDirective]
    }
    
    extension [Self <: UserAgentDirective](x: Self) {
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
