package typings.googleapisCommon

import typings.gaxios.commonMod.GaxiosOptions
import typings.gaxios.commonMod.GaxiosResponse
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleapisCommon.endpointMod.Endpoint
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiMod {
  
  type APIEndpoint = Endpoint with js.Any
  
  @js.native
  trait APIRequestContext extends StObject {
    
    var _options: GlobalOptions = js.native
    
    var google: js.UndefOr[GoogleConfigurable] = js.native
  }
  object APIRequestContext {
    
    @scala.inline
    def apply(_options: GlobalOptions): APIRequestContext = {
      val __obj = js.Dynamic.literal(_options = _options.asInstanceOf[js.Any])
      __obj.asInstanceOf[APIRequestContext]
    }
    
    @scala.inline
    implicit class APIRequestContextMutableBuilder[Self <: APIRequestContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGoogle(value: GoogleConfigurable): Self = StObject.set(x, "google", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGoogleUndefined: Self = StObject.set(x, "google", js.undefined)
      
      @scala.inline
      def set_options(value: GlobalOptions): Self = StObject.set(x, "_options", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait APIRequestParams[T] extends StObject {
    
    var context: APIRequestContext = js.native
    
    var mediaUrl: js.UndefOr[String | Null] = js.native
    
    var options: MethodOptions = js.native
    
    var params: T = js.native
    
    var pathParams: js.Array[String] = js.native
    
    var requiredParams: js.Array[String] = js.native
  }
  object APIRequestParams {
    
    @scala.inline
    def apply[T](
      context: APIRequestContext,
      options: MethodOptions,
      params: T,
      pathParams: js.Array[String],
      requiredParams: js.Array[String]
    ): APIRequestParams[T] = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], pathParams = pathParams.asInstanceOf[js.Any], requiredParams = requiredParams.asInstanceOf[js.Any])
      __obj.asInstanceOf[APIRequestParams[T]]
    }
    
    @scala.inline
    implicit class APIRequestParamsMutableBuilder[Self <: APIRequestParams[_], T] (val x: Self with APIRequestParams[T]) extends AnyVal {
      
      @scala.inline
      def setContext(value: APIRequestContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaUrl(value: String): Self = StObject.set(x, "mediaUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaUrlNull: Self = StObject.set(x, "mediaUrl", null)
      
      @scala.inline
      def setMediaUrlUndefined: Self = StObject.set(x, "mediaUrl", js.undefined)
      
      @scala.inline
      def setOptions(value: MethodOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: T): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathParams(value: js.Array[String]): Self = StObject.set(x, "pathParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathParamsVarargs(value: String*): Self = StObject.set(x, "pathParams", js.Array(value :_*))
      
      @scala.inline
      def setRequiredParams(value: js.Array[String]): Self = StObject.set(x, "requiredParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredParamsVarargs(value: String*): Self = StObject.set(x, "requiredParams", js.Array(value :_*))
    }
  }
  
  type BodyResponseCallback[T] = js.Function2[/* err */ Error | Null, /* res */ js.UndefOr[GaxiosResponse[T] | Null], Unit]
  
  @js.native
  trait GlobalOptions extends MethodOptions {
    
    var auth: js.UndefOr[OAuth2Client | String] = js.native
  }
  object GlobalOptions {
    
    @scala.inline
    def apply(): GlobalOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalOptions]
    }
    
    @scala.inline
    implicit class GlobalOptionsMutableBuilder[Self <: GlobalOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth(value: OAuth2Client | String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    }
  }
  
  @js.native
  trait GoogleConfigurable extends StObject {
    
    var _options: GlobalOptions = js.native
  }
  object GoogleConfigurable {
    
    @scala.inline
    def apply(_options: GlobalOptions): GoogleConfigurable = {
      val __obj = js.Dynamic.literal(_options = _options.asInstanceOf[js.Any])
      __obj.asInstanceOf[GoogleConfigurable]
    }
    
    @scala.inline
    implicit class GoogleConfigurableMutableBuilder[Self <: GoogleConfigurable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_options(value: GlobalOptions): Self = StObject.set(x, "_options", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MethodOptions extends GaxiosOptions {
    
    var rootUrl: js.UndefOr[String] = js.native
    
    var userAgentDirectives: js.UndefOr[js.Array[UserAgentDirective]] = js.native
  }
  object MethodOptions {
    
    @scala.inline
    def apply(): MethodOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MethodOptions]
    }
    
    @scala.inline
    implicit class MethodOptionsMutableBuilder[Self <: MethodOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRootUrl(value: String): Self = StObject.set(x, "rootUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUrlUndefined: Self = StObject.set(x, "rootUrl", js.undefined)
      
      @scala.inline
      def setUserAgentDirectives(value: js.Array[UserAgentDirective]): Self = StObject.set(x, "userAgentDirectives", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserAgentDirectivesUndefined: Self = StObject.set(x, "userAgentDirectives", js.undefined)
      
      @scala.inline
      def setUserAgentDirectivesVarargs(value: UserAgentDirective*): Self = StObject.set(x, "userAgentDirectives", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ServiceOptions extends GlobalOptions {
    
    var version: js.UndefOr[String] = js.native
  }
  object ServiceOptions {
    
    @scala.inline
    def apply(): ServiceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceOptions]
    }
    
    @scala.inline
    implicit class ServiceOptionsMutableBuilder[Self <: ServiceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait UserAgentDirective extends StObject {
    
    var comment: js.UndefOr[String] = js.native
    
    var product: String = js.native
    
    var version: String = js.native
  }
  object UserAgentDirective {
    
    @scala.inline
    def apply(product: String, version: String): UserAgentDirective = {
      val __obj = js.Dynamic.literal(product = product.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserAgentDirective]
    }
    
    @scala.inline
    implicit class UserAgentDirectiveMutableBuilder[Self <: UserAgentDirective] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
