package typings.googleAuthLibrary.buildSrcAuthOauth2clientMod

import typings.gaxios.buildSrcCommonMod.GaxiosOptions
import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.gaxios.buildSrcCommonMod.GaxiosResponse
import typings.googleAuthLibrary.buildSrcAuthAuthclientMod.AuthClient
import typings.googleAuthLibrary.buildSrcAuthLoginticketMod.LoginTicket
import typings.googleAuthLibrary.buildSrcTransportersMod.BodyResponseCallback
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
open class OAuth2Client () extends AuthClient {
  def this(clientId: String) = this()
  def this(options: OAuth2ClientOptions) = this()
  def this(clientId: String, clientSecret: String) = this()
  def this(clientId: Unit, clientSecret: String) = this()
  def this(clientId: String, clientSecret: String, redirectUri: String) = this()
  def this(clientId: String, clientSecret: Unit, redirectUri: String) = this()
  def this(clientId: Unit, clientSecret: String, redirectUri: String) = this()
  def this(clientId: Unit, clientSecret: Unit, redirectUri: String) = this()
  
  var _clientId: js.UndefOr[String] = js.native
  
  var _clientSecret: js.UndefOr[String] = js.native
  
  var apiKey: js.UndefOr[String] = js.native
  
  /* private */ var certificateCache: Any = js.native
  
  /* private */ var certificateCacheFormat: Any = js.native
  
  /* private */ var certificateExpiry: Any = js.native
  
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
    * https://github.com/googleapis/google-auth-library-nodejs/blob/main/samples/oauth2-codeVerifier.js
    */
  def generateCodeVerifierAsync(): js.Promise[CodeVerifierResults] = js.native
  
  def getAccessToken(callback: GetAccessTokenCallback): Unit = js.native
  
  /* private */ var getAccessTokenAsync: Any = js.native
  
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
  
  /* private */ var getTokenAsync: Any = js.native
  
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
  
  /**
    * Returns a promise that resolves with AccessTokenResponse type if
    * refreshHandler is defined.
    * If not, nothing is returned.
    */
  /* private */ var processAndValidateRefreshHandler: Any = js.native
  
  @JSName("projectId")
  var projectId_OAuth2Client: js.UndefOr[String] = js.native
  
  /* private */ var redirectUri: Any = js.native
  
  /**
    * Retrieves the access token using refresh token
    *
    * @param callback callback
    */
  def refreshAccessToken(): js.Promise[RefreshAccessTokenResponse] = js.native
  def refreshAccessToken(callback: RefreshAccessTokenCallback): Unit = js.native
  
  /* private */ var refreshAccessTokenAsync: Any = js.native
  
  var refreshHandler: js.UndefOr[GetRefreshHandlerCallback] = js.native
  
  /**
    * Refreshes the access token.
    * @param refresh_token Existing refresh token.
    * @private
    */
  /* protected */ def refreshToken(): js.Promise[GetTokenResponse] = js.native
  /* protected */ def refreshToken(refreshToken: String): js.Promise[GetTokenResponse] = js.native
  
  /* protected */ def refreshTokenNoCache(): js.Promise[GetTokenResponse] = js.native
  /* protected */ def refreshTokenNoCache(refreshToken: String): js.Promise[GetTokenResponse] = js.native
  
  /* protected */ var refreshTokenPromises: Map[String, js.Promise[GetTokenResponse]] = js.native
  
  def request[T](opts: GaxiosOptions, callback: BodyResponseCallback[T]): Unit = js.native
  
  /* protected */ def requestAsync[T](opts: GaxiosOptions): js.Promise[GaxiosResponse[T]] = js.native
  /* protected */ def requestAsync[T](opts: GaxiosOptions, retry: Boolean): js.Promise[GaxiosResponse[T]] = js.native
  
  /**
    * Revokes access token and clears the credentials object
    * @param callback callback
    */
  def revokeCredentials(): GaxiosPromise[RevokeCredentialsResult] = js.native
  def revokeCredentials(callback: BodyResponseCallback[RevokeCredentialsResult]): Unit = js.native
  
  /* private */ var revokeCredentialsAsync: Any = js.native
  
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
    callback: js.Function2[/* err */ js.Error | Null, /* login */ js.UndefOr[LoginTicket], Unit]
  ): Unit = js.native
  
  /* private */ var verifyIdTokenAsync: Any = js.native
  
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
  def verifySignedJwtWithCertsAsync(jwt: String, certs: Certificates | PublicKeys, requiredAudience: String): js.Promise[LoginTicket] = js.native
  def verifySignedJwtWithCertsAsync(jwt: String, certs: Certificates | PublicKeys, requiredAudience: String, issuers: js.Array[String]): js.Promise[LoginTicket] = js.native
  def verifySignedJwtWithCertsAsync(
    jwt: String,
    certs: Certificates | PublicKeys,
    requiredAudience: String,
    issuers: js.Array[String],
    maxExpiry: Double
  ): js.Promise[LoginTicket] = js.native
  def verifySignedJwtWithCertsAsync(
    jwt: String,
    certs: Certificates | PublicKeys,
    requiredAudience: String,
    issuers: Unit,
    maxExpiry: Double
  ): js.Promise[LoginTicket] = js.native
  def verifySignedJwtWithCertsAsync(jwt: String, certs: Certificates | PublicKeys, requiredAudience: js.Array[String]): js.Promise[LoginTicket] = js.native
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
  def verifySignedJwtWithCertsAsync(
    jwt: String,
    certs: Certificates | PublicKeys,
    requiredAudience: js.Array[String],
    issuers: Unit,
    maxExpiry: Double
  ): js.Promise[LoginTicket] = js.native
  def verifySignedJwtWithCertsAsync(jwt: String, certs: Certificates | PublicKeys, requiredAudience: Unit, issuers: js.Array[String]): js.Promise[LoginTicket] = js.native
  def verifySignedJwtWithCertsAsync(
    jwt: String,
    certs: Certificates | PublicKeys,
    requiredAudience: Unit,
    issuers: js.Array[String],
    maxExpiry: Double
  ): js.Promise[LoginTicket] = js.native
  def verifySignedJwtWithCertsAsync(
    jwt: String,
    certs: Certificates | PublicKeys,
    requiredAudience: Unit,
    issuers: Unit,
    maxExpiry: Double
  ): js.Promise[LoginTicket] = js.native
}
/* static members */
object OAuth2Client {
  
  @JSImport("google-auth-library/build/src/auth/oauth2client", "OAuth2Client")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Clock skew - five minutes in seconds
    */
  @JSImport("google-auth-library/build/src/auth/oauth2client", "OAuth2Client.CLOCK_SKEW_SECS_")
  @js.native
  val CLOCK_SKEW_SECS_ : Any = js.native
  
  /**
    * The base URL for auth endpoints.
    */
  @JSImport("google-auth-library/build/src/auth/oauth2client", "OAuth2Client.GOOGLE_OAUTH2_AUTH_BASE_URL_")
  @js.native
  val GOOGLE_OAUTH2_AUTH_BASE_URL_ : Any = js.native
  
  /**
    * Google Sign on certificates in JWK format.
    */
  @JSImport("google-auth-library/build/src/auth/oauth2client", "OAuth2Client.GOOGLE_OAUTH2_FEDERATED_SIGNON_JWK_CERTS_URL_")
  @js.native
  val GOOGLE_OAUTH2_FEDERATED_SIGNON_JWK_CERTS_URL_ : Any = js.native
  
  /**
    * Google Sign on certificates in PEM format.
    */
  @JSImport("google-auth-library/build/src/auth/oauth2client", "OAuth2Client.GOOGLE_OAUTH2_FEDERATED_SIGNON_PEM_CERTS_URL_")
  @js.native
  val GOOGLE_OAUTH2_FEDERATED_SIGNON_PEM_CERTS_URL_ : Any = js.native
  
  /**
    * Google Sign on certificates in JWK format.
    */
  @JSImport("google-auth-library/build/src/auth/oauth2client", "OAuth2Client.GOOGLE_OAUTH2_IAP_PUBLIC_KEY_URL_")
  @js.native
  val GOOGLE_OAUTH2_IAP_PUBLIC_KEY_URL_ : Any = js.native
  
  /**
    * The base endpoint to revoke tokens.
    */
  @JSImport("google-auth-library/build/src/auth/oauth2client", "OAuth2Client.GOOGLE_OAUTH2_REVOKE_URL_")
  @js.native
  val GOOGLE_OAUTH2_REVOKE_URL_ : Any = js.native
  
  /**
    * The base endpoint for token retrieval.
    */
  @JSImport("google-auth-library/build/src/auth/oauth2client", "OAuth2Client.GOOGLE_OAUTH2_TOKEN_URL_")
  @js.native
  val GOOGLE_OAUTH2_TOKEN_URL_ : Any = js.native
  
  @JSImport("google-auth-library/build/src/auth/oauth2client", "OAuth2Client.GOOGLE_TOKEN_INFO_URL")
  @js.native
  val GOOGLE_TOKEN_INFO_URL: /* "https://oauth2.googleapis.com/tokeninfo" */ String = js.native
  
  /**
    * The allowed oauth token issuers.
    */
  @JSImport("google-auth-library/build/src/auth/oauth2client", "OAuth2Client.ISSUERS_")
  @js.native
  val ISSUERS_ : Any = js.native
  
  /**
    * Max Token Lifetime is one day in seconds
    */
  @JSImport("google-auth-library/build/src/auth/oauth2client", "OAuth2Client.MAX_TOKEN_LIFETIME_SECS_")
  @js.native
  val MAX_TOKEN_LIFETIME_SECS_ : Any = js.native
  
  /**
    * Generates an URL to revoke the given token.
    * @param token The existing token to be revoked.
    */
  inline def getRevokeTokenUrl(token: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRevokeTokenUrl")(token.asInstanceOf[js.Any]).asInstanceOf[String]
}
