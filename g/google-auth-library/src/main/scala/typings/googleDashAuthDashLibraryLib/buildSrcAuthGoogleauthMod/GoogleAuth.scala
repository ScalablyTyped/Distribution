package typings
package googleDashAuthDashLibraryLib.buildSrcAuthGoogleauthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-auth-library/build/src/auth/googleauth", "GoogleAuth")
@js.native
class GoogleAuth () extends js.Object {
  def this(opts: GoogleAuthOptions) = this()
  var _cachedProjectId: js.UndefOr[js.Any] = js.native
  var _getDefaultProjectIdPromise: js.UndefOr[js.Any] = js.native
  /**
    * Determines whether the current operating system is Windows.
    * @api private
    */
  var _isWindows: js.Any = js.native
  var cachedCredential: googleDashAuthDashLibraryLib.buildSrcAuthJwtclientMod.JWT | googleDashAuthDashLibraryLib.buildSrcAuthRefreshclientMod.UserRefreshClient | googleDashAuthDashLibraryLib.buildSrcAuthComputeclientMod.Compute | scala.Null = js.native
  /**
    * Caches a value indicating whether the auth layer is running on Google
    * Compute Engine.
    * @private
    */
  var checkIsGCE: js.UndefOr[js.Any] = js.native
  var clientOptions: js.UndefOr[js.Any] = js.native
  var createError: js.Any = js.native
  var fromStreamAsync: js.Any = js.native
  var getApplicationDefaultAsync: js.Any = js.native
  var getCredentialsAsync: js.Any = js.native
  /**
    * Run the Google Cloud SDK command that prints the default project ID
    */
  var getDefaultServiceProjectId: js.Any = js.native
  /**
    * Loads the project id from the GOOGLE_APPLICATION_CREDENTIALS json file.
    * @api private
    */
  var getFileProjectId: js.Any = js.native
  /**
    * Gets the Compute Engine project ID if it can be inferred.
    */
  var getGCEProjectId: js.Any = js.native
  /**
    * Loads the project id from environment variables.
    * @api private
    */
  var getProductionProjectId: js.Any = js.native
  var getProjectIdAsync: js.Any = js.native
  val isGCE: js.UndefOr[scala.Boolean] = js.native
  var jsonContent: googleDashAuthDashLibraryLib.buildSrcAuthCredentialsMod.JWTInput | scala.Null = js.native
  var keyFilename: js.UndefOr[js.Any] = js.native
  var scopes: js.UndefOr[js.Any] = js.native
  var transporter: js.UndefOr[googleDashAuthDashLibraryLib.buildSrcTransportersMod.Transporter] = js.native
  /**
    * Determines whether the auth layer is running on Google Compute Engine.
    * @returns A promise that resolves with the boolean.
    * @api private
    */
  def _checkIsGCE(): js.Promise[scala.Boolean] = js.native
  /**
    * Creates a file stream. Allows mocking.
    * @api private
    */
  def _createReadStream(filePath: java.lang.String): nodeLib.fsMod.ReadStream = js.native
  /**
    * Determines whether a file exists. Allows mocking.
    * @api private
    */
  def _fileExists(filePath: java.lang.String): scala.Boolean = js.native
  /**
    * Attempts to load default credentials from a file at the given path..
    * @param filePath The path to the file to read.
    * @returns Promise that resolves with the OAuth2Client
    * @api private
    */
  def _getApplicationCredentialsFromFilePath(filePath: java.lang.String): js.Promise[
    googleDashAuthDashLibraryLib.buildSrcAuthJwtclientMod.JWT | googleDashAuthDashLibraryLib.buildSrcAuthRefreshclientMod.UserRefreshClient
  ] = js.native
  def _getApplicationCredentialsFromFilePath(
    filePath: java.lang.String,
    options: googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod.RefreshOptions
  ): js.Promise[
    googleDashAuthDashLibraryLib.buildSrcAuthJwtclientMod.JWT | googleDashAuthDashLibraryLib.buildSrcAuthRefreshclientMod.UserRefreshClient
  ] = js.native
  /**
    * Allows mocking of the path to a well-known file.
    * @api private
    */
  def _mockWellKnownFilePath(filePath: java.lang.String): java.lang.String = js.native
  /**
    * Gets the current operating system platform. Allows mocking.
    * @api private
    */
  def _osPlatform(): nodeLib.NodeJSNs.Platform = js.native
  /**
    * Joins two parts of a path. Allows mocking.
    * @api private
    */
  def _pathJoin(item1: java.lang.String, item2: java.lang.String): java.lang.String = js.native
  /**
    * Attempts to load default credentials from the environment variable path..
    * @returns Promise that resolves with the OAuth2Client or null.
    * @api private
    */
  def _tryGetApplicationCredentialsFromEnvironmentVariable(): js.Promise[
    googleDashAuthDashLibraryLib.buildSrcAuthJwtclientMod.JWT | googleDashAuthDashLibraryLib.buildSrcAuthRefreshclientMod.UserRefreshClient | scala.Null
  ] = js.native
  def _tryGetApplicationCredentialsFromEnvironmentVariable(options: googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod.RefreshOptions): js.Promise[
    googleDashAuthDashLibraryLib.buildSrcAuthJwtclientMod.JWT | googleDashAuthDashLibraryLib.buildSrcAuthRefreshclientMod.UserRefreshClient | scala.Null
  ] = js.native
  /**
    * Attempts to load default credentials from a well-known file location
    * @return Promise that resolves with the OAuth2Client or null.
    * @api private
    */
  def _tryGetApplicationCredentialsFromWellKnownFile(): js.Promise[
    googleDashAuthDashLibraryLib.buildSrcAuthJwtclientMod.JWT | googleDashAuthDashLibraryLib.buildSrcAuthRefreshclientMod.UserRefreshClient | scala.Null
  ] = js.native
  def _tryGetApplicationCredentialsFromWellKnownFile(options: googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod.RefreshOptions): js.Promise[
    googleDashAuthDashLibraryLib.buildSrcAuthJwtclientMod.JWT | googleDashAuthDashLibraryLib.buildSrcAuthRefreshclientMod.UserRefreshClient | scala.Null
  ] = js.native
  /**
    * Obtain credentials for a request, then attach the appropriate headers to
    * the request options.
    * @param opts Axios or Request options on which to attach the headers
    */
  def authorizeRequest(opts: googleDashAuthDashLibraryLib.Anon_Headers): js.Promise[googleDashAuthDashLibraryLib.Anon_HeadersUri] = js.native
  /**
    * Create a credentials instance using the given API key string.
    * @param apiKey The API key string
    * @param options An optional options object.
    * @returns A JWT loaded from the key
    */
  def fromAPIKey(apiKey: java.lang.String): googleDashAuthDashLibraryLib.buildSrcAuthJwtclientMod.JWT = js.native
  def fromAPIKey(
    apiKey: java.lang.String,
    options: googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod.RefreshOptions
  ): googleDashAuthDashLibraryLib.buildSrcAuthJwtclientMod.JWT = js.native
  /**
    * Create a credentials instance using the given input options.
    * @param json The input object.
    * @param options The JWT or UserRefresh options for the client
    * @returns JWT or UserRefresh Client with data
    */
  def fromJSON(json: googleDashAuthDashLibraryLib.buildSrcAuthCredentialsMod.JWTInput): googleDashAuthDashLibraryLib.buildSrcAuthJwtclientMod.JWT | googleDashAuthDashLibraryLib.buildSrcAuthRefreshclientMod.UserRefreshClient = js.native
  def fromJSON(
    json: googleDashAuthDashLibraryLib.buildSrcAuthCredentialsMod.JWTInput,
    options: googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod.RefreshOptions
  ): googleDashAuthDashLibraryLib.buildSrcAuthJwtclientMod.JWT | googleDashAuthDashLibraryLib.buildSrcAuthRefreshclientMod.UserRefreshClient = js.native
  /**
    * Create a credentials instance using the given input stream.
    * @param inputStream The input stream.
    * @param callback Optional callback.
    */
  def fromStream(inputStream: nodeLib.streamMod.Readable): js.Promise[
    googleDashAuthDashLibraryLib.buildSrcAuthJwtclientMod.JWT | googleDashAuthDashLibraryLib.buildSrcAuthRefreshclientMod.UserRefreshClient
  ] = js.native
  def fromStream(inputStream: nodeLib.streamMod.Readable, callback: CredentialCallback): scala.Unit = js.native
  def fromStream(
    inputStream: nodeLib.streamMod.Readable,
    options: googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod.RefreshOptions
  ): js.Promise[
    googleDashAuthDashLibraryLib.buildSrcAuthJwtclientMod.JWT | googleDashAuthDashLibraryLib.buildSrcAuthRefreshclientMod.UserRefreshClient
  ] = js.native
  def fromStream(
    inputStream: nodeLib.streamMod.Readable,
    options: googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod.RefreshOptions,
    callback: CredentialCallback
  ): scala.Unit = js.native
  /**
    * Automatically obtain application default credentials, and return
    * an access token for making requests.
    */
  def getAccessToken(): js.Promise[js.UndefOr[java.lang.String | scala.Null]] = js.native
  /**
    * Obtains the default service-level credentials for the application.
    * @param callback Optional callback.
    * @returns Promise that resolves with the ADCResponse (if no callback was
    * passed).
    */
  def getApplicationDefault(): js.Promise[ADCResponse] = js.native
  def getApplicationDefault(callback: ADCCallback): scala.Unit = js.native
  def getApplicationDefault(options: googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod.RefreshOptions): js.Promise[ADCResponse] = js.native
  def getApplicationDefault(
    options: googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod.RefreshOptions,
    callback: ADCCallback
  ): scala.Unit = js.native
  /**
    * Automatically obtain a client based on the provided configuration.  If no
    * options were passed, use Application Default Credentials.
    */
  def getClient(): js.Promise[
    googleDashAuthDashLibraryLib.buildSrcAuthComputeclientMod.Compute | googleDashAuthDashLibraryLib.buildSrcAuthJwtclientMod.JWT | googleDashAuthDashLibraryLib.buildSrcAuthRefreshclientMod.UserRefreshClient
  ] = js.native
  def getClient(options: GoogleAuthOptions): js.Promise[
    googleDashAuthDashLibraryLib.buildSrcAuthComputeclientMod.Compute | googleDashAuthDashLibraryLib.buildSrcAuthJwtclientMod.JWT | googleDashAuthDashLibraryLib.buildSrcAuthRefreshclientMod.UserRefreshClient
  ] = js.native
  /**
    * The callback function handles a credential object that contains the
    * client_email and private_key (if exists).
    * getCredentials checks for these values from the user JSON at first.
    * If it doesn't exist, and the environment is on GCE, it gets the
    * client_email from the cloud metadata server.
    * @param callback Callback that handles the credential object that contains
    * a client_email and optional private key, or the error.
    * returned
    */
  def getCredentials(): js.Promise[googleDashAuthDashLibraryLib.buildSrcAuthCredentialsMod.CredentialBody] = js.native
  def getCredentials(
    callback: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* credentials */ js.UndefOr[googleDashAuthDashLibraryLib.buildSrcAuthCredentialsMod.CredentialBody], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * THIS METHOD HAS BEEN DEPRECATED.
    * It will be removed in 3.0.  Please use getProjectId instead.
    */
  def getDefaultProjectId(): js.Promise[java.lang.String] = js.native
  def getDefaultProjectId(callback: ProjectIdCallback): scala.Unit = js.native
  /**
    * Determine the compute environment in which the code is running.
    */
  def getEnv(): js.Promise[googleDashAuthDashLibraryLib.buildSrcAuthEnvDetectMod.GCPEnv] = js.native
  /**
    * Obtains the default project ID for the application.
    * @param callback Optional callback
    * @returns Promise that resolves with project Id (if used without callback)
    */
  def getProjectId(): js.Promise[java.lang.String] = js.native
  def getProjectId(callback: ProjectIdCallback): scala.Unit = js.native
  /**
    * Obtain the HTTP headers that will provide authorization for a given
    * request.
    */
  def getRequestHeaders(): js.Promise[googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod.Headers] = js.native
  def getRequestHeaders(url: java.lang.String): js.Promise[googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod.Headers] = js.native
  /**
    * Automatically obtain application default credentials, and make an
    * HTTP request using the given options.
    * @param opts Axios request options for the HTTP request.
    */
  def request[T](opts: gaxiosLib.buildSrcCommonMod.GaxiosOptions): js.Promise[gaxiosLib.buildSrcCommonMod.GaxiosResponse[T]] = js.native
  /**
    * Sign the given data with the current private key, or go out
    * to the IAM API to sign it.
    * @param data The data to be signed.
    */
  def sign(data: java.lang.String): js.Promise[java.lang.String] = js.native
  /**
    * Credentials from the Cloud SDK that are associated with Cloud SDK's project
    * are problematic because they may not have APIs enabled and have limited
    * quota. If this is the case, warn about it.
    */
  /* protected */ def warnOnProblematicCredentials(client: googleDashAuthDashLibraryLib.buildSrcAuthJwtclientMod.JWT): scala.Unit = js.native
}

/* static members */
@JSImport("google-auth-library/build/src/auth/googleauth", "GoogleAuth")
@js.native
object GoogleAuth extends js.Object {
  /**
    * Export DefaultTransporter as a static property of the class.
    */
  var DefaultTransporter: googleDashAuthDashLibraryLib.TypeofClassDefaultTransporter = js.native
}

