package typings.googleAuthLibrary.oauth2clientMod

import typings.gaxios.commonMod.GaxiosOptions
import typings.gaxios.commonMod.GaxiosPromise
import typings.gaxios.commonMod.GaxiosResponse
import typings.googleAuthLibrary.authclientMod.AuthClient
import typings.googleAuthLibrary.loginticketMod.LoginTicket
import typings.googleAuthLibrary.transportersMod.BodyResponseCallback
import typings.std.Error
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-auth-library/build/src/auth/oauth2client", "OAuth2Client")
@js.native
/**
  * Handles OAuth2 flow for Google APIs.
  *
  * @param clientId The authentication client ID.
  * @param clientSecret The authentication client secret.
  * @param redirectUri The URI to redirect to after completing the auth
  * request.
  * @param opts optional options for overriding the given parameters.
  * @constructor
  */
class OAuth2Client () extends AuthClient {
  def this(clientId: String) = this()
  def this(options: OAuth2ClientOptions) = this()
  def this(clientId: js.UndefOr[scala.Nothing], clientSecret: String) = this()
  def this(clientId: String, clientSecret: String) = this()
  def this(clientId: js.UndefOr[scala.Nothing], clientSecret: js.UndefOr[scala.Nothing], redirectUri: String) = this()
  def this(clientId: js.UndefOr[scala.Nothing], clientSecret: String, redirectUri: String) = this()
  def this(clientId: String, clientSecret: js.UndefOr[scala.Nothing], redirectUri: String) = this()
  def this(clientId: String, clientSecret: String, redirectUri: String) = this()
  
  var _clientId: js.UndefOr[String] = js.native
  
  var _clientSecret: js.UndefOr[String] = js.native
  
  var apiKey: js.UndefOr[String] = js.native
  
  var certificateCache: js.Any = js.native
  
  var certificateCacheFormat: js.Any = js.native
  
  var certificateExpiry: js.Any = js.native
  
  var eagerRefreshThresholdMillis: Double = js.native
  
  var forceRefreshOnFailure: Boolean = js.native
  
  /**
    * Generates URL for consent page landing.
    * @param opts Options.
    * @return URL to consent page.
    */
  def generateAuthUrl(): String = js.native
  def generateAuthUrl(opts: GenerateAuthUrlOpts): String = js.native
  
  def generateCodeVerifier(): Unit = js.native
  
  /**
    * Convenience method to automatically generate a code_verifier, and its
    * resulting SHA256. If used, this must be paired with a S256
    * code_challenge_method.
    *
    * For a full example see:
    * https://github.com/googleapis/google-auth-library-nodejs/blob/master/samples/oauth2-codeVerifier.js
    */
  def generateCodeVerifierAsync(): js.Promise[CodeVerifierResults] = js.native
  
  /**
    * Get a non-expired access token, after refreshing if necessary
    *
    * @param callback Callback to call with the access token
    */
  def getAccessToken(): js.Promise[GetAccessTokenResponse] = js.native
  def getAccessToken(callback: GetAccessTokenCallback): Unit = js.native
  
  var getAccessTokenAsync: js.Any = js.native
  
  /**
    * Gets federated sign-on certificates to use for verifying identity tokens.
    * Returns certs as array structure, where keys are key ids, and values
    * are certificates in either PEM or JWK format.
    * @param callback Callback supplying the certificates
    */
  def getFederatedSignonCerts(): js.Promise[FederatedSignonCertsResponse] = js.native
  def getFederatedSignonCerts(callback: GetFederatedSignonCertsCallback): Unit = js.native
  
  def getFederatedSignonCertsAsync(): js.Promise[FederatedSignonCertsResponse] = js.native
  
  /**
    * Gets federated sign-on certificates to use for verifying identity tokens.
    * Returns certs as array structure, where keys are key ids, and values
    * are certificates in either PEM or JWK format.
    * @param callback Callback supplying the certificates
    */
  def getIapPublicKeys(): js.Promise[IapPublicKeysResponse] = js.native
  def getIapPublicKeys(callback: GetIapPublicKeysCallback): Unit = js.native
  
  def getIapPublicKeysAsync(): js.Promise[IapPublicKeysResponse] = js.native
  
  /**
    * The main authentication interface.  It takes an optional url which when
    * present is the endpoint being accessed, and returns a Promise which
    * resolves with authorization header fields.
    *
    * In OAuth2Client, the result has the form:
    * { Authorization: 'Bearer <access_token_value>' }
    * @param url The optional url being authorized
    */
  def getRequestHeaders(): js.Promise[Headers] = js.native
  def getRequestHeaders(url: String): js.Promise[Headers] = js.native
  
  /* protected */ def getRequestMetadataAsync(): js.Promise[RequestMetadataResponse] = js.native
  /* protected */ def getRequestMetadataAsync(url: String): js.Promise[RequestMetadataResponse] = js.native
  
  /**
    * Gets the access token for the given code.
    * @param code The authorization code.
    * @param callback Optional callback fn.
    */
  def getToken(code: String): js.Promise[GetTokenResponse] = js.native
  def getToken(code: String, callback: GetTokenCallback): Unit = js.native
  def getToken(options: GetTokenOptions): js.Promise[GetTokenResponse] = js.native
  def getToken(options: GetTokenOptions, callback: GetTokenCallback): Unit = js.native
  
  var getTokenAsync: js.Any = js.native
  
  /**
    * Obtains information about the provisioned access token.  Especially useful
    * if you want to check the scopes that were provisioned to a given token.
    *
    * @param accessToken Required.  The Access Token for which you want to get
    * user info.
    */
  def getTokenInfo(accessToken: String): js.Promise[TokenInfo] = js.native
  
  /**
    * Returns true if a token is expired or will expire within
    * eagerRefreshThresholdMillismilliseconds.
    * If there is no expiry time, assumes the token is not expired or expiring.
    */
  /* protected */ def isTokenExpiring(): Boolean = js.native
  
  var projectId: js.UndefOr[String] = js.native
  
  var redirectUri: js.Any = js.native
  
  /**
    * Retrieves the access token using refresh token
    *
    * @deprecated use getRequestHeaders instead.
    * @param callback callback
    */
  def refreshAccessToken(): js.Promise[RefreshAccessTokenResponse] = js.native
  def refreshAccessToken(callback: RefreshAccessTokenCallback): Unit = js.native
  
  var refreshAccessTokenAsync: js.Any = js.native
  
  /**
    * Refreshes the access token.
    * @param refresh_token Existing refresh token.
    * @private
    */
  /* protected */ def refreshToken(): js.Promise[GetTokenResponse] = js.native
  /* protected */ def refreshToken(refreshToken: String): js.Promise[GetTokenResponse] = js.native
  
  /* protected */ def refreshTokenNoCache(): js.Promise[GetTokenResponse] = js.native
  /* protected */ def refreshTokenNoCache(refreshToken: String): js.Promise[GetTokenResponse] = js.native
  
  var refreshTokenPromises: Map[String, js.Promise[GetTokenResponse]] = js.native
  
  def request[T](opts: GaxiosOptions, callback: BodyResponseCallback[T]): Unit = js.native
  
  /* protected */ def requestAsync[T](opts: GaxiosOptions): js.Promise[GaxiosResponse[T]] = js.native
  /* protected */ def requestAsync[T](opts: GaxiosOptions, retry: Boolean): js.Promise[GaxiosResponse[T]] = js.native
  
  /**
    * Revokes access token and clears the credentials object
    * @param callback callback
    */
  def revokeCredentials(): GaxiosPromise[RevokeCredentialsResult] = js.native
  def revokeCredentials(callback: BodyResponseCallback[RevokeCredentialsResult]): Unit = js.native
  
  var revokeCredentialsAsync: js.Any = js.native
  
  /**
    * Revokes the access given to token.
    * @param token The existing token to be revoked.
    * @param callback Optional callback fn.
    */
  def revokeToken(token: String): GaxiosPromise[RevokeCredentialsResult] = js.native
  def revokeToken(token: String, callback: BodyResponseCallback[RevokeCredentialsResult]): Unit = js.native
  
  /**
    * Verify id token is token by checking the certs and audience
    * @param options that contains all options.
    * @param callback Callback supplying GoogleLogin if successful
    */
  def verifyIdToken(options: VerifyIdTokenOptions): js.Promise[LoginTicket] = js.native
  def verifyIdToken(
    options: VerifyIdTokenOptions,
    callback: js.Function2[/* err */ Error | Null, /* login */ js.UndefOr[LoginTicket], Unit]
  ): Unit = js.native
  
  var verifyIdTokenAsync: js.Any = js.native
  
  def verifySignedJwtWithCerts(): Unit = js.native
  
  /**
    * Verify the id token is signed with the correct certificate
    * and is from the correct audience.
    * @param jwt The jwt to verify (The ID Token in this case).
    * @param certs The array of certs to test the jwt against.
    * @param requiredAudience The audience to test the jwt against.
    * @param issuers The allowed issuers of the jwt (Optional).
    * @param maxExpiry The max expiry the certificate can be (Optional).
    * @return Returns a promise resolving to LoginTicket on verification.
    */
  def verifySignedJwtWithCertsAsync(jwt: String, certs: Certificates | PublicKeys): js.Promise[LoginTicket] = js.native
  def verifySignedJwtWithCertsAsync(
    jwt: String,
    certs: Certificates | PublicKeys,
    requiredAudience: js.UndefOr[scala.Nothing],
    issuers: js.UndefOr[scala.Nothing],
    maxExpiry: Double
  ): js.Promise[LoginTicket] = js.native
  def verifySignedJwtWithCertsAsync(
    jwt: String,
    certs: Certificates | PublicKeys,
    requiredAudience: js.UndefOr[scala.Nothing],
    issuers: js.Array[String]
  ): js.Promise[LoginTicket] = js.native
  def verifySignedJwtWithCertsAsync(
    jwt: String,
    certs: Certificates | PublicKeys,
    requiredAudience: js.UndefOr[scala.Nothing],
    issuers: js.Array[String],
    maxExpiry: Double
  ): js.Promise[LoginTicket] = js.native
  def verifySignedJwtWithCertsAsync(jwt: String, certs: Certificates | PublicKeys, requiredAudience: String): js.Promise[LoginTicket] = js.native
  def verifySignedJwtWithCertsAsync(
    jwt: String,
    certs: Certificates | PublicKeys,
    requiredAudience: String,
    issuers: js.UndefOr[scala.Nothing],
    maxExpiry: Double
  ): js.Promise[LoginTicket] = js.native
  def verifySignedJwtWithCertsAsync(jwt: String, certs: Certificates | PublicKeys, requiredAudience: String, issuers: js.Array[String]): js.Promise[LoginTicket] = js.native
  def verifySignedJwtWithCertsAsync(
    jwt: String,
    certs: Certificates | PublicKeys,
    requiredAudience: String,
    issuers: js.Array[String],
    maxExpiry: Double
  ): js.Promise[LoginTicket] = js.native
  def verifySignedJwtWithCertsAsync(jwt: String, certs: Certificates | PublicKeys, requiredAudience: js.Array[String]): js.Promise[LoginTicket] = js.native
  def verifySignedJwtWithCertsAsync(
    jwt: String,
    certs: Certificates | PublicKeys,
    requiredAudience: js.Array[String],
    issuers: js.UndefOr[scala.Nothing],
    maxExpiry: Double
  ): js.Promise[LoginTicket] = js.native
  def verifySignedJwtWithCertsAsync(
    jwt: String,
    certs: Certificates | PublicKeys,
    requiredAudience: js.Array[String],
    issuers: js.Array[String]
  ): js.Promise[LoginTicket] = js.native
  def verifySignedJwtWithCertsAsync(
    jwt: String,
    certs: Certificates | PublicKeys,
    requiredAudience: js.Array[String],
    issuers: js.Array[String],
    maxExpiry: Double
  ): js.Promise[LoginTicket] = js.native
}
/* static members */
object OAuth2Client {
  
  /**
    * Clock skew - five minutes in seconds
    */
  @JSImport("google-auth-library/build/src/auth/oauth2client", "OAuth2Client.CLOCK_SKEW_SECS_")
  @js.native
  val CLOCK_SKEW_SECS_ : js.Any = js.native
  
  /**
    * The base URL for auth endpoints.
    */
  @JSImport("google-auth-library/build/src/auth/oauth2client", "OAuth2Client.GOOGLE_OAUTH2_AUTH_BASE_URL_")
  @js.native
  val GOOGLE_OAUTH2_AUTH_BASE_URL_ : js.Any = js.native
  
  /**
    * Google Sign on certificates in JWK format.
    */
  @JSImport("google-auth-library/build/src/auth/oauth2client", "OAuth2Client.GOOGLE_OAUTH2_FEDERATED_SIGNON_JWK_CERTS_URL_")
  @js.native
  val GOOGLE_OAUTH2_FEDERATED_SIGNON_JWK_CERTS_URL_ : js.Any = js.native
  
  /**
    * Google Sign on certificates in PEM format.
    */
  @JSImport("google-auth-library/build/src/auth/oauth2client", "OAuth2Client.GOOGLE_OAUTH2_FEDERATED_SIGNON_PEM_CERTS_URL_")
  @js.native
  val GOOGLE_OAUTH2_FEDERATED_SIGNON_PEM_CERTS_URL_ : js.Any = js.native
  
  /**
    * Google Sign on certificates in JWK format.
    */
  @JSImport("google-auth-library/build/src/auth/oauth2client", "OAuth2Client.GOOGLE_OAUTH2_IAP_PUBLIC_KEY_URL_")
  @js.native
  val GOOGLE_OAUTH2_IAP_PUBLIC_KEY_URL_ : js.Any = js.native
  
  /**
    * The base endpoint to revoke tokens.
    */
  @JSImport("google-auth-library/build/src/auth/oauth2client", "OAuth2Client.GOOGLE_OAUTH2_REVOKE_URL_")
  @js.native
  val GOOGLE_OAUTH2_REVOKE_URL_ : js.Any = js.native
  
  /**
    * The base endpoint for token retrieval.
    */
  @JSImport("google-auth-library/build/src/auth/oauth2client", "OAuth2Client.GOOGLE_OAUTH2_TOKEN_URL_")
  @js.native
  val GOOGLE_OAUTH2_TOKEN_URL_ : js.Any = js.native
  
  @JSImport("google-auth-library/build/src/auth/oauth2client", "OAuth2Client.GOOGLE_TOKEN_INFO_URL")
  @js.native
  val GOOGLE_TOKEN_INFO_URL: /* "https://oauth2.googleapis.com/tokeninfo" */ String = js.native
  
  /**
    * The allowed oauth token issuers.
    */
  @JSImport("google-auth-library/build/src/auth/oauth2client", "OAuth2Client.ISSUERS_")
  @js.native
  val ISSUERS_ : js.Any = js.native
  
  /**
    * Max Token Lifetime is one day in seconds
    */
  @JSImport("google-auth-library/build/src/auth/oauth2client", "OAuth2Client.MAX_TOKEN_LIFETIME_SECS_")
  @js.native
  val MAX_TOKEN_LIFETIME_SECS_ : js.Any = js.native
  
  /**
    * Generates an URL to revoke the given token.
    * @param token The existing token to be revoked.
    */
  @JSImport("google-auth-library/build/src/auth/oauth2client", "OAuth2Client.getRevokeTokenUrl")
  @js.native
  def getRevokeTokenUrl(token: String): String = js.native
}
