package typings.googleAuthLibrary

import typings.gaxios.buildSrcCommonMod.GaxiosOptions
import typings.gaxios.buildSrcCommonMod.GaxiosResponse
import typings.googleAuthLibrary.anon.Headers
import typings.googleAuthLibrary.anon.TypeofDefaultTransporter
import typings.googleAuthLibrary.buildSrcAuthAuthclientMod.AuthClient
import typings.googleAuthLibrary.buildSrcAuthComputeclientMod.Compute
import typings.googleAuthLibrary.buildSrcAuthCredentialsMod.CredentialBody
import typings.googleAuthLibrary.buildSrcAuthCredentialsMod.ImpersonatedJWTInput
import typings.googleAuthLibrary.buildSrcAuthCredentialsMod.JWTInput
import typings.googleAuthLibrary.buildSrcAuthEnvDetectMod.GCPEnv
import typings.googleAuthLibrary.buildSrcAuthExternalclientMod.ExternalAccountClientOptions
import typings.googleAuthLibrary.buildSrcAuthIdtokenclientMod.IdTokenClient
import typings.googleAuthLibrary.buildSrcAuthImpersonatedMod.Impersonated
import typings.googleAuthLibrary.buildSrcAuthImpersonatedMod.ImpersonatedOptions
import typings.googleAuthLibrary.buildSrcAuthJwtclientMod.JWT
import typings.googleAuthLibrary.buildSrcAuthJwtclientMod.JWTOptions
import typings.googleAuthLibrary.buildSrcAuthOauth2clientMod.OAuth2ClientOptions
import typings.googleAuthLibrary.buildSrcAuthOauth2clientMod.RefreshOptions
import typings.googleAuthLibrary.buildSrcAuthRefreshclientMod.UserRefreshClientOptions
import typings.googleAuthLibrary.buildSrcTransportersMod.Transporter
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcAuthGoogleauthMod {
  
  @JSImport("google-auth-library/build/src/auth/googleauth", "CLOUD_SDK_CLIENT_ID")
  @js.native
  val CLOUD_SDK_CLIENT_ID: /* "764086051850-6qr4p6gpi6hn506pt8ejuq83di341hur.apps.googleusercontent.com" */ String = js.native
  
  @JSImport("google-auth-library/build/src/auth/googleauth", "GoogleAuth")
  @js.native
  open class GoogleAuth[T /* <: AuthClient */] () extends StObject {
    def this(opts: GoogleAuthOptions[T]) = this()
    
    /**
      * Return a JWT or UserRefreshClient from JavaScript object, caching both the
      * object used to instantiate and the client.
      * @param json The input object.
      * @param options The JWT or UserRefresh options for the client
      * @returns JWT or UserRefresh Client with data
      */
    /* private */ var _cacheClientFromJSON: Any = js.native
    
    /* private */ var _cachedProjectId: Any = js.native
    
    /**
      * Determines whether the auth layer is running on Google Compute Engine.
      * @returns A promise that resolves with the boolean.
      * @api private
      */
    def _checkIsGCE(): js.Promise[Boolean] = js.native
    
    /* private */ var _findProjectIdPromise: Any = js.native
    
    /**
      * Attempts to load default credentials from a file at the given path..
      * @param filePath The path to the file to read.
      * @returns Promise that resolves with the OAuth2Client
      * @api private
      */
    def _getApplicationCredentialsFromFilePath(filePath: String): js.Promise[JSONClient] = js.native
    def _getApplicationCredentialsFromFilePath(filePath: String, options: RefreshOptions): js.Promise[JSONClient] = js.native
    
    /**
      * Determines whether the current operating system is Windows.
      * @api private
      */
    /* private */ var _isWindows: Any = js.native
    
    /**
      * Attempts to load default credentials from the environment variable path..
      * @returns Promise that resolves with the OAuth2Client or null.
      * @api private
      */
    def _tryGetApplicationCredentialsFromEnvironmentVariable(): js.Promise[JSONClient | Null] = js.native
    def _tryGetApplicationCredentialsFromEnvironmentVariable(options: RefreshOptions): js.Promise[JSONClient | Null] = js.native
    
    /**
      * Attempts to load default credentials from a well-known file location
      * @return Promise that resolves with the OAuth2Client or null.
      * @api private
      */
    def _tryGetApplicationCredentialsFromWellKnownFile(): js.Promise[JSONClient | Null] = js.native
    def _tryGetApplicationCredentialsFromWellKnownFile(options: RefreshOptions): js.Promise[JSONClient | Null] = js.native
    
    /**
      * Obtain credentials for a request, then attach the appropriate headers to
      * the request options.
      * @param opts Axios or Request options on which to attach the headers
      */
    def authorizeRequest(opts: Headers): js.Promise[Headers] = js.native
    
    var cachedCredential: JSONClient | Impersonated | Compute | T | Null = js.native
    
    /**
      * Caches a value indicating whether the auth layer is running on Google
      * Compute Engine.
      * @private
      */
    /* private */ var checkIsGCE: Any = js.native
    
    /* private */ var clientOptions: Any = js.native
    
    /**
      * Scopes populated by the client library by default. We differentiate between
      * these and user defined scopes when deciding whether to use a self-signed JWT.
      */
    var defaultScopes: js.UndefOr[String | js.Array[String]] = js.native
    
    var defaultServicePath: js.UndefOr[String] = js.native
    
    /* private */ var findAndCacheProjectId: Any = js.native
    
    /**
      * Create a credentials instance using the given API key string.
      * @param apiKey The API key string
      * @param options An optional options object.
      * @returns A JWT loaded from the key
      */
    def fromAPIKey(apiKey: String): JWT = js.native
    def fromAPIKey(apiKey: String, options: RefreshOptions): JWT = js.native
    
    /**
      * Create a credentials instance using a given impersonated input options.
      * @param json The impersonated input object.
      * @returns JWT or UserRefresh Client with data
      */
    def fromImpersonatedJSON(json: ImpersonatedJWTInput): Impersonated = js.native
    
    def fromJSON(json: ImpersonatedJWTInput): JSONClient = js.native
    def fromJSON(json: ImpersonatedJWTInput, options: RefreshOptions): JSONClient = js.native
    /**
      * Create a credentials instance using the given input options.
      * @param json The input object.
      * @param options The JWT or UserRefresh options for the client
      * @returns JWT or UserRefresh Client with data
      */
    def fromJSON(json: JWTInput): JSONClient = js.native
    def fromJSON(json: JWTInput, options: RefreshOptions): JSONClient = js.native
    
    /**
      * Create a credentials instance using the given input stream.
      * @param inputStream The input stream.
      * @param callback Optional callback.
      */
    def fromStream(inputStream: Readable): js.Promise[JSONClient] = js.native
    def fromStream(inputStream: Readable, callback: CredentialCallback): Unit = js.native
    def fromStream(inputStream: Readable, options: RefreshOptions): js.Promise[JSONClient] = js.native
    def fromStream(inputStream: Readable, options: RefreshOptions, callback: CredentialCallback): Unit = js.native
    
    /* private */ var fromStreamAsync: Any = js.native
    
    /**
      * Automatically obtain application default credentials, and return
      * an access token for making requests.
      */
    def getAccessToken(): js.Promise[js.UndefOr[String | Null]] = js.native
    
    /**
      * @returns Any scopes (user-specified or default scopes specified by the
      *   client library) that need to be set on the current Auth client.
      */
    /* private */ var getAnyScopes: Any = js.native
    
    /**
      * Obtains the default service-level credentials for the application.
      * @param callback Optional callback.
      * @returns Promise that resolves with the ADCResponse (if no callback was
      * passed).
      */
    def getApplicationDefault(): js.Promise[ADCResponse] = js.native
    def getApplicationDefault(callback: ADCCallback): Unit = js.native
    def getApplicationDefault(options: RefreshOptions): js.Promise[ADCResponse] = js.native
    def getApplicationDefault(options: RefreshOptions, callback: ADCCallback): Unit = js.native
    
    /* private */ var getApplicationDefaultAsync: Any = js.native
    
    /**
      * Automatically obtain a client based on the provided configuration.  If no
      * options were passed, use Application Default Credentials.
      */
    def getClient(): js.Promise[Compute | JSONClient | T] = js.native
    
    /**
      * The callback function handles a credential object that contains the
      * client_email and private_key (if exists).
      * getCredentials first checks if the client is using an external account and
      * uses the service account email in place of client_email.
      * If that doesn't exist, it checks for these values from the user JSON.
      * If the user JSON doesn't exist, and the environment is on GCE, it gets the
      * client_email from the cloud metadata server.
      * @param callback Callback that handles the credential object that contains
      * a client_email and optional private key, or the error.
      * returned
      */
    def getCredentials(): js.Promise[CredentialBody] = js.native
    def getCredentials(
      callback: js.Function2[/* err */ js.Error | Null, /* credentials */ js.UndefOr[CredentialBody], Unit]
    ): Unit = js.native
    
    /* private */ var getCredentialsAsync: Any = js.native
    
    /**
      * Run the Google Cloud SDK command that prints the default project ID
      */
    /* private */ var getDefaultServiceProjectId: Any = js.native
    
    /**
      * Determine the compute environment in which the code is running.
      */
    def getEnv(): js.Promise[GCPEnv] = js.native
    
    /**
      * Gets the project ID from external account client if available.
      */
    /* private */ var getExternalAccountClientProjectId: Any = js.native
    
    /**
      * Loads the project id from the GOOGLE_APPLICATION_CREDENTIALS json file.
      * @api private
      */
    /* private */ var getFileProjectId: Any = js.native
    
    /**
      * Gets the Compute Engine project ID if it can be inferred.
      */
    /* private */ var getGCEProjectId: Any = js.native
    
    /**
      * Creates a client which will fetch an ID token for authorization.
      * @param targetAudience the audience for the fetched ID token.
      * @returns IdTokenClient for making HTTP calls authenticated with ID tokens.
      */
    def getIdTokenClient(targetAudience: String): js.Promise[IdTokenClient] = js.native
    
    /**
      * Loads the project id from environment variables.
      * @api private
      */
    /* private */ var getProductionProjectId: Any = js.native
    
    /**
      * Obtains the default project ID for the application.
      * @param callback Optional callback
      * @returns Promise that resolves with project Id (if used without callback)
      */
    def getProjectId(): js.Promise[String] = js.native
    def getProjectId(callback: ProjectIdCallback): Unit = js.native
    
    /* private */ var getProjectIdAsync: Any = js.native
    
    /**
      * A temporary method for internal `getProjectId` usages where `null` is
      * acceptable. In a future major release, `getProjectId` should return `null`
      * (as the `Promise<string | null>` base signature describes) and this private
      * method should be removed.
      *
      * @returns Promise that resolves with project id (or `null`)
      */
    /* private */ var getProjectIdOptional: Any = js.native
    
    /**
      * Obtain the HTTP headers that will provide authorization for a given
      * request.
      */
    def getRequestHeaders(): js.Promise[typings.googleAuthLibrary.buildSrcAuthOauth2clientMod.Headers] = js.native
    def getRequestHeaders(url: String): js.Promise[typings.googleAuthLibrary.buildSrcAuthOauth2clientMod.Headers] = js.native
    
    def isGCE: js.UndefOr[Boolean] = js.native
    
    var jsonContent: JWTInput | ExternalAccountClientOptions | Null = js.native
    
    /* private */ var keyFilename: Any = js.native
    
    /**
      * Automatically obtain application default credentials, and make an
      * HTTP request using the given options.
      * @param opts Axios request options for the HTTP request.
      */
    def request[T](opts: GaxiosOptions): js.Promise[GaxiosResponse[T]] = js.native
    
    /* private */ var scopes: Any = js.native
    
    def setGapicJWTValues(client: JWT): Unit = js.native
    
    /**
      * Sign the given data with the current private key, or go out
      * to the IAM API to sign it.
      * @param data The data to be signed.
      */
    def sign(data: String): js.Promise[String] = js.native
    
    /* private */ var signBlob: Any = js.native
    
    var transporter: js.UndefOr[Transporter] = js.native
    
    var useJWTAccessWithScope: js.UndefOr[Boolean] = js.native
  }
  /* static members */
  object GoogleAuth {
    
    @JSImport("google-auth-library/build/src/auth/googleauth", "GoogleAuth")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Export DefaultTransporter as a static property of the class.
      */
    @JSImport("google-auth-library/build/src/auth/googleauth", "GoogleAuth.DefaultTransporter")
    @js.native
    def DefaultTransporter: TypeofDefaultTransporter = js.native
    inline def DefaultTransporter_=(x: TypeofDefaultTransporter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultTransporter")(x.asInstanceOf[js.Any])
  }
  
  type ADCCallback = js.Function3[
    /* err */ js.Error | Null, 
    /* credential */ js.UndefOr[AuthClient], 
    /* projectId */ js.UndefOr[String | Null], 
    Unit
  ]
  
  trait ADCResponse extends StObject {
    
    var credential: AuthClient
    
    var projectId: String | Null
  }
  object ADCResponse {
    
    inline def apply(credential: AuthClient): ADCResponse = {
      val __obj = js.Dynamic.literal(credential = credential.asInstanceOf[js.Any], projectId = null)
      __obj.asInstanceOf[ADCResponse]
    }
    
    extension [Self <: ADCResponse](x: Self) {
      
      inline def setCredential(value: AuthClient): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
      
      inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    }
  }
  
  type CredentialCallback = js.Function2[/* err */ js.Error | Null, /* result */ js.UndefOr[JSONClient], Unit]
  
  trait GoogleAuthOptions[T /* <: AuthClient */] extends StObject {
    
    /**
      * An `AuthClient` to use
      */
    var authClient: js.UndefOr[T] = js.undefined
    
    /**
      * Options object passed to the constructor of the client
      */
    var clientOptions: js.UndefOr[
        JWTOptions | OAuth2ClientOptions | UserRefreshClientOptions | ImpersonatedOptions
      ] = js.undefined
    
    /**
      * Object containing client_email and private_key properties, or the
      * external account client options.
      */
    var credentials: js.UndefOr[CredentialBody | ExternalAccountClientOptions] = js.undefined
    
    /**
      * Path to a .json, .pem, or .p12 key file
      */
    var keyFile: js.UndefOr[String] = js.undefined
    
    /**
      * Path to a .json, .pem, or .p12 key file
      */
    var keyFilename: js.UndefOr[String] = js.undefined
    
    /**
      * Your project ID.
      */
    var projectId: js.UndefOr[String] = js.undefined
    
    /**
      * Required scopes for the desired API request
      */
    var scopes: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object GoogleAuthOptions {
    
    inline def apply[T /* <: AuthClient */](): GoogleAuthOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GoogleAuthOptions[T]]
    }
    
    extension [Self <: GoogleAuthOptions[?], T /* <: AuthClient */](x: Self & GoogleAuthOptions[T]) {
      
      inline def setAuthClient(value: T): Self = StObject.set(x, "authClient", value.asInstanceOf[js.Any])
      
      inline def setAuthClientUndefined: Self = StObject.set(x, "authClient", js.undefined)
      
      inline def setClientOptions(value: JWTOptions | OAuth2ClientOptions | UserRefreshClientOptions | ImpersonatedOptions): Self = StObject.set(x, "clientOptions", value.asInstanceOf[js.Any])
      
      inline def setClientOptionsUndefined: Self = StObject.set(x, "clientOptions", js.undefined)
      
      inline def setCredentials(value: CredentialBody | ExternalAccountClientOptions): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setKeyFile(value: String): Self = StObject.set(x, "keyFile", value.asInstanceOf[js.Any])
      
      inline def setKeyFileUndefined: Self = StObject.set(x, "keyFile", js.undefined)
      
      inline def setKeyFilename(value: String): Self = StObject.set(x, "keyFilename", value.asInstanceOf[js.Any])
      
      inline def setKeyFilenameUndefined: Self = StObject.set(x, "keyFilename", js.undefined)
      
      inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
      
      inline def setScopes(value: String | js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
      
      inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.googleAuthLibrary.buildSrcAuthJwtclientMod.JWT
    - typings.googleAuthLibrary.buildSrcAuthRefreshclientMod.UserRefreshClient
    - typings.googleAuthLibrary.buildSrcAuthBaseexternalclientMod.BaseExternalAccountClient
    - typings.googleAuthLibrary.buildSrcAuthImpersonatedMod.Impersonated
  */
  trait JSONClient extends StObject
  
  type ProjectIdCallback = js.Function2[
    /* err */ js.UndefOr[js.Error | Null], 
    /* projectId */ js.UndefOr[String | Null], 
    Unit
  ]
  
  trait SignBlobResponse extends StObject {
    
    var keyId: String
    
    var signedBlob: String
  }
  object SignBlobResponse {
    
    inline def apply(keyId: String, signedBlob: String): SignBlobResponse = {
      val __obj = js.Dynamic.literal(keyId = keyId.asInstanceOf[js.Any], signedBlob = signedBlob.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignBlobResponse]
    }
    
    extension [Self <: SignBlobResponse](x: Self) {
      
      inline def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
      
      inline def setSignedBlob(value: String): Self = StObject.set(x, "signedBlob", value.asInstanceOf[js.Any])
    }
  }
}
