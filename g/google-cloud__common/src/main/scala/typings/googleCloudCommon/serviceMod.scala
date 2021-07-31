package typings.googleCloudCommon

import typings.googleAuthLibrary.googleauthMod.GoogleAuthOptions
import typings.googleAuthLibrary.mod.GoogleAuth
import typings.googleCloudCommon.googleCloudCommonBooleans.`true`
import typings.googleCloudCommon.serviceObjectMod.Interceptor
import typings.googleCloudCommon.utilMod.Abortable
import typings.googleCloudCommon.utilMod.BodyResponseCallback
import typings.googleCloudCommon.utilMod.DecorateRequestOptions
import typings.googleCloudCommon.utilMod.Duplexify
import typings.googleCloudCommon.utilMod.MakeAuthenticatedRequest
import typings.googleCloudCommon.utilMod.MakeAuthenticatedRequestOptions
import typings.googleCloudCommon.utilMod.PackageJson
import typings.std.Error
import typings.teenyRequest.mod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serviceMod {
  
  @JSImport("@google-cloud/common/build/src/service", "Service")
  @js.native
  class Service protected () extends StObject {
    /**
      * Service is a base class, meant to be inherited from by a "service," like
      * BigQuery or Storage.
      *
      * This handles making authenticated requests by exposing a `makeReq_`
      * function.
      *
      * @constructor
      * @alias module:common/service
      *
      * @param {object} config - Configuration object.
      * @param {string} config.baseUrl - The base URL to make API requests to.
      * @param {string[]} config.scopes - The scopes required for the request.
      * @param {object=} options - [Configuration object](#/docs).
      */
    def this(config: ServiceConfig) = this()
    def this(config: ServiceConfig, options: ServiceOptions) = this()
    
    val apiEndpoint: String = js.native
    
    var authClient: GoogleAuth = js.native
    
    var baseUrl: String = js.native
    
    var getCredentials: js.Any = js.native
    
    /**
      * Get and update the Service's project ID.
      *
      * @param {function} callback - The callback function.
      */
    def getProjectId(): js.Promise[String] = js.native
    def getProjectId(callback: js.Function2[/* err */ Error | Null, /* projectId */ js.UndefOr[String], Unit]): Unit = js.native
    
    /* protected */ def getProjectIdAsync(): js.Promise[String] = js.native
    
    /**
      * Return the user's custom request interceptors.
      */
    def getRequestInterceptors(): js.Array[js.Function] = js.native
    
    var globalInterceptors: js.Any = js.native
    
    var interceptors: js.Array[Interceptor] = js.native
    
    def makeAuthenticatedRequest(reqOpts: DecorateRequestOptions): Duplexify = js.native
    def makeAuthenticatedRequest(reqOpts: DecorateRequestOptions, callback: BodyResponseCallback): Unit | Abortable = js.native
    def makeAuthenticatedRequest(reqOpts: DecorateRequestOptions, options: MakeAuthenticatedRequestOptions): Unit | Abortable = js.native
    @JSName("makeAuthenticatedRequest")
    var makeAuthenticatedRequest_Original: MakeAuthenticatedRequest = js.native
    @JSName("makeAuthenticatedRequest")
    def makeAuthenticatedRequest_Union(reqOpts: DecorateRequestOptions): Unit | Abortable = js.native
    
    var packageJson: js.Any = js.native
    
    var projectId: String = js.native
    
    var projectIdRequired: js.Any = js.native
    
    var providedUserAgent: js.UndefOr[String] = js.native
    
    /**
      * Make an authenticated API request.
      *
      * @param {object} reqOpts - Request options that are passed to `request`.
      * @param {string} reqOpts.uri - A URI relative to the baseUrl.
      * @param {function} callback - The callback function passed to `request`.
      */
    def request(reqOpts: DecorateRequestOptions, callback: BodyResponseCallback): Unit = js.native
    
    /**
      * Make an authenticated API request.
      *
      * @param {object} reqOpts - Request options that are passed to `request`.
      * @param {string} reqOpts.uri - A URI relative to the baseUrl.
      */
    def requestStream(reqOpts: DecorateRequestOptions): Request = js.native
    
    /**
      * Make an authenticated API request.
      *
      * @private
      *
      * @param {object} reqOpts - Request options that are passed to `request`.
      * @param {string} reqOpts.uri - A URI relative to the baseUrl.
      * @param {function} callback - The callback function passed to `request`.
      */
    var request_ : js.Any = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  
  trait ServiceConfig extends StObject {
    
    /**
      * The API Endpoint to use when connecting to the service.
      * Example:  storage.googleapis.com
      */
    var apiEndpoint: String
    
    /**
      * Reuse an existing GoogleAuth client instead of creating a new one.
      */
    var authClient: js.UndefOr[GoogleAuth] = js.undefined
    
    /**
      * The base URL to make API requests to.
      */
    var baseUrl: String
    
    var packageJson: PackageJson
    
    var projectIdRequired: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The scopes required for the request.
      */
    var scopes: js.Array[String]
  }
  object ServiceConfig {
    
    @scala.inline
    def apply(apiEndpoint: String, baseUrl: String, packageJson: PackageJson, scopes: js.Array[String]): ServiceConfig = {
      val __obj = js.Dynamic.literal(apiEndpoint = apiEndpoint.asInstanceOf[js.Any], baseUrl = baseUrl.asInstanceOf[js.Any], packageJson = packageJson.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceConfig]
    }
    
    @scala.inline
    implicit class ServiceConfigMutableBuilder[Self <: ServiceConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiEndpoint(value: String): Self = StObject.set(x, "apiEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthClient(value: GoogleAuth): Self = StObject.set(x, "authClient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthClientUndefined: Self = StObject.set(x, "authClient", js.undefined)
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackageJson(value: PackageJson): Self = StObject.set(x, "packageJson", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectIdRequired(value: Boolean): Self = StObject.set(x, "projectIdRequired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectIdRequiredUndefined: Self = StObject.set(x, "projectIdRequired", js.undefined)
      
      @scala.inline
      def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value :_*))
    }
  }
  
  trait ServiceOptions
    extends StObject
       with GoogleAuthOptions {
    
    var authClient: js.UndefOr[GoogleAuth] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    var interceptors_ : js.UndefOr[js.Array[Interceptor]] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var token: js.UndefOr[String] = js.undefined
    
    var userAgent: js.UndefOr[String] = js.undefined
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
      def setAuthClient(value: GoogleAuth): Self = StObject.set(x, "authClient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthClientUndefined: Self = StObject.set(x, "authClient", js.undefined)
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setInterceptors_(value: js.Array[Interceptor]): Self = StObject.set(x, "interceptors_", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterceptors_Undefined: Self = StObject.set(x, "interceptors_", js.undefined)
      
      @scala.inline
      def setInterceptors_Varargs(value: Interceptor*): Self = StObject.set(x, "interceptors_", js.Array(value :_*))
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      @scala.inline
      def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    }
  }
  
  trait StreamRequestOptions
    extends StObject
       with DecorateRequestOptions {
    
    @JSName("shouldReturnStream")
    var shouldReturnStream_StreamRequestOptions: `true`
  }
  object StreamRequestOptions {
    
    @scala.inline
    def apply(uri: String): StreamRequestOptions = {
      val __obj = js.Dynamic.literal(shouldReturnStream = true, uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamRequestOptions]
    }
    
    @scala.inline
    implicit class StreamRequestOptionsMutableBuilder[Self <: StreamRequestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShouldReturnStream(value: `true`): Self = StObject.set(x, "shouldReturnStream", value.asInstanceOf[js.Any])
    }
  }
}
