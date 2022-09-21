package typings.googleCloudStorage

import typings.googleAuthLibrary.authclientMod.AuthClient
import typings.googleAuthLibrary.credentialsMod.CredentialBody
import typings.googleAuthLibrary.externalclientMod.ExternalAccountClientOptions
import typings.googleAuthLibrary.googleauthMod.JSONClient
import typings.googleAuthLibrary.impersonatedMod.ImpersonatedOptions
import typings.googleAuthLibrary.jwtclientMod.JWTOptions
import typings.googleAuthLibrary.mod.GoogleAuth
import typings.googleAuthLibrary.oauth2clientMod.OAuth2ClientOptions
import typings.googleAuthLibrary.refreshclientMod.UserRefreshClientOptions
import typings.googleCloudStorage.googleCloudStorageBooleans.`true`
import typings.googleCloudStorage.serviceObjectMod.Interceptor
import typings.googleCloudStorage.utilMod.Abortable
import typings.googleCloudStorage.utilMod.BodyResponseCallback
import typings.googleCloudStorage.utilMod.DecorateRequestOptions
import typings.googleCloudStorage.utilMod.Duplexify
import typings.googleCloudStorage.utilMod.MakeAuthenticatedRequest
import typings.googleCloudStorage.utilMod.MakeAuthenticatedRequestOptions
import typings.googleCloudStorage.utilMod.PackageJson
import typings.teenyRequest.mod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serviceMod {
  
  @JSImport("@google-cloud/storage/build/src/nodejs-common/service", "DEFAULT_PROJECT_ID_TOKEN")
  @js.native
  val DEFAULT_PROJECT_ID_TOKEN: /* "{{projectId}}" */ String = js.native
  
  @JSImport("@google-cloud/storage/build/src/nodejs-common/service", "Service")
  @js.native
  open class Service protected () extends StObject {
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
    
    var authClient: GoogleAuth[AuthClient] = js.native
    
    var baseUrl: String = js.native
    
    /* private */ var getCredentials: Any = js.native
    
    /**
      * Get and update the Service's project ID.
      *
      * @param {function} callback - The callback function.
      */
    def getProjectId(): js.Promise[String] = js.native
    def getProjectId(callback: js.Function2[/* err */ js.Error | Null, /* projectId */ js.UndefOr[String], Unit]): Unit = js.native
    
    /* protected */ def getProjectIdAsync(): js.Promise[String] = js.native
    
    /**
      * Return the user's custom request interceptors.
      */
    def getRequestInterceptors(): js.Array[js.Function] = js.native
    
    /* private */ var globalInterceptors: Any = js.native
    
    var interceptors: js.Array[Interceptor] = js.native
    
    def makeAuthenticatedRequest(reqOpts: DecorateRequestOptions): Unit | Abortable = js.native
    def makeAuthenticatedRequest(reqOpts: DecorateRequestOptions, callback: BodyResponseCallback): Unit | Abortable = js.native
    def makeAuthenticatedRequest(reqOpts: DecorateRequestOptions, options: MakeAuthenticatedRequestOptions): Unit | Abortable = js.native
    @JSName("makeAuthenticatedRequest")
    def makeAuthenticatedRequest_Duplexify(reqOpts: DecorateRequestOptions): Duplexify = js.native
    @JSName("makeAuthenticatedRequest")
    var makeAuthenticatedRequest_Original: MakeAuthenticatedRequest = js.native
    
    /* private */ var packageJson: Any = js.native
    
    var projectId: String = js.native
    
    /* private */ var projectIdRequired: Any = js.native
    
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
    /* private */ var request_ : Any = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  
  trait ServiceConfig extends StObject {
    
    /**
      * The API Endpoint to use when connecting to the service.
      * Example:  storage.googleapis.com
      */
    var apiEndpoint: String
    
    /**
      * Reuse an existing `AuthClient` or `GoogleAuth` client instead of creating a new one.
      */
    var authClient: js.UndefOr[AuthClient | GoogleAuth[JSONClient]] = js.undefined
    
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
    
    inline def apply(apiEndpoint: String, baseUrl: String, packageJson: PackageJson, scopes: js.Array[String]): ServiceConfig = {
      val __obj = js.Dynamic.literal(apiEndpoint = apiEndpoint.asInstanceOf[js.Any], baseUrl = baseUrl.asInstanceOf[js.Any], packageJson = packageJson.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceConfig]
    }
    
    extension [Self <: ServiceConfig](x: Self) {
      
      inline def setApiEndpoint(value: String): Self = StObject.set(x, "apiEndpoint", value.asInstanceOf[js.Any])
      
      inline def setAuthClient(value: AuthClient | GoogleAuth[JSONClient]): Self = StObject.set(x, "authClient", value.asInstanceOf[js.Any])
      
      inline def setAuthClientUndefined: Self = StObject.set(x, "authClient", js.undefined)
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setPackageJson(value: PackageJson): Self = StObject.set(x, "packageJson", value.asInstanceOf[js.Any])
      
      inline def setProjectIdRequired(value: Boolean): Self = StObject.set(x, "projectIdRequired", value.asInstanceOf[js.Any])
      
      inline def setProjectIdRequiredUndefined: Self = StObject.set(x, "projectIdRequired", js.undefined)
      
      inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
    }
  }
  
  /* Inlined parent std.Omit<google-auth-library.google-auth-library.GoogleAuthOptions<google-auth-library.google-auth-library/build/src/auth/googleauth.JSONClient>, 'authClient'> */
  trait ServiceOptions extends StObject {
    
    var authClient: js.UndefOr[AuthClient | GoogleAuth[JSONClient]] = js.undefined
    
    var clientOptions: js.UndefOr[
        JWTOptions | OAuth2ClientOptions | UserRefreshClientOptions | ImpersonatedOptions
      ] = js.undefined
    
    var credentials: js.UndefOr[CredentialBody | ExternalAccountClientOptions] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    var interceptors_ : js.UndefOr[js.Array[Interceptor]] = js.undefined
    
    var keyFile: js.UndefOr[String] = js.undefined
    
    var keyFilename: js.UndefOr[String] = js.undefined
    
    var projectId: js.UndefOr[String] = js.undefined
    
    var scopes: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var token: js.UndefOr[String] = js.undefined
    
    var useAuthWithCustomEndpoint: js.UndefOr[Boolean] = js.undefined
    
    var userAgent: js.UndefOr[String] = js.undefined
  }
  object ServiceOptions {
    
    inline def apply(): ServiceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceOptions]
    }
    
    extension [Self <: ServiceOptions](x: Self) {
      
      inline def setAuthClient(value: AuthClient | GoogleAuth[JSONClient]): Self = StObject.set(x, "authClient", value.asInstanceOf[js.Any])
      
      inline def setAuthClientUndefined: Self = StObject.set(x, "authClient", js.undefined)
      
      inline def setClientOptions(value: JWTOptions | OAuth2ClientOptions | UserRefreshClientOptions | ImpersonatedOptions): Self = StObject.set(x, "clientOptions", value.asInstanceOf[js.Any])
      
      inline def setClientOptionsUndefined: Self = StObject.set(x, "clientOptions", js.undefined)
      
      inline def setCredentials(value: CredentialBody | ExternalAccountClientOptions): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setInterceptors_(value: js.Array[Interceptor]): Self = StObject.set(x, "interceptors_", value.asInstanceOf[js.Any])
      
      inline def setInterceptors_Undefined: Self = StObject.set(x, "interceptors_", js.undefined)
      
      inline def setInterceptors_Varargs(value: Interceptor*): Self = StObject.set(x, "interceptors_", js.Array(value*))
      
      inline def setKeyFile(value: String): Self = StObject.set(x, "keyFile", value.asInstanceOf[js.Any])
      
      inline def setKeyFileUndefined: Self = StObject.set(x, "keyFile", js.undefined)
      
      inline def setKeyFilename(value: String): Self = StObject.set(x, "keyFilename", value.asInstanceOf[js.Any])
      
      inline def setKeyFilenameUndefined: Self = StObject.set(x, "keyFilename", js.undefined)
      
      inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
      
      inline def setScopes(value: String | js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
      
      inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      inline def setUseAuthWithCustomEndpoint(value: Boolean): Self = StObject.set(x, "useAuthWithCustomEndpoint", value.asInstanceOf[js.Any])
      
      inline def setUseAuthWithCustomEndpointUndefined: Self = StObject.set(x, "useAuthWithCustomEndpoint", js.undefined)
      
      inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    }
  }
  
  trait StreamRequestOptions
    extends StObject
       with DecorateRequestOptions {
    
    @JSName("shouldReturnStream")
    var shouldReturnStream_StreamRequestOptions: `true`
  }
  object StreamRequestOptions {
    
    inline def apply(uri: String): StreamRequestOptions = {
      val __obj = js.Dynamic.literal(shouldReturnStream = true, uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamRequestOptions]
    }
    
    extension [Self <: StreamRequestOptions](x: Self) {
      
      inline def setShouldReturnStream(value: `true`): Self = StObject.set(x, "shouldReturnStream", value.asInstanceOf[js.Any])
    }
  }
}
