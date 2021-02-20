package typings.googleAuthLibrary

import org.scalablytyped.runtime.Shortcut
import typings.googleAuthLibrary.anon.TypeofDefaultTransporter
import typings.googleAuthLibrary.computeclientMod.ComputeOptions
import typings.googleAuthLibrary.googleauthMod.GoogleAuthOptions
import typings.googleAuthLibrary.idtokenclientMod.IdTokenOptions
import typings.googleAuthLibrary.jwtclientMod.JWTOptions
import typings.googleAuthLibrary.loginticketMod.TokenPayload
import typings.googleAuthLibrary.oauth2clientMod.OAuth2ClientOptions
import typings.googleAuthLibrary.refreshclientMod.UserRefreshClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("google-auth-library", "CodeChallengeMethod")
  @js.native
  object CodeChallengeMethod extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.googleAuthLibrary.oauth2clientMod.CodeChallengeMethod with String] = js.native
    
    /* "plain" */ val Plain: typings.googleAuthLibrary.oauth2clientMod.CodeChallengeMethod.Plain with String = js.native
    
    /* "S256" */ val S256: typings.googleAuthLibrary.oauth2clientMod.CodeChallengeMethod.S256 with String = js.native
  }
  
  @JSImport("google-auth-library", "Compute")
  @js.native
  /**
    * Google Compute Engine service account credentials.
    *
    * Retrieve access token from the metadata server.
    * See: https://developers.google.com/compute/docs/authentication
    */
  class Compute ()
    extends typings.googleAuthLibrary.computeclientMod.Compute {
    def this(options: ComputeOptions) = this()
  }
  
  @JSImport("google-auth-library", "DefaultTransporter")
  @js.native
  class DefaultTransporter ()
    extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
  /* static members */
  object DefaultTransporter {
    
    /**
      * Default user agent.
      */
    @JSImport("google-auth-library", "DefaultTransporter.USER_AGENT")
    @js.native
    val USER_AGENT: String = js.native
  }
  
  @JSImport("google-auth-library", "GCPEnv")
  @js.native
  object GCPEnv extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.googleAuthLibrary.envDetectMod.GCPEnv with String] = js.native
    
    /* "APP_ENGINE" */ val APP_ENGINE: typings.googleAuthLibrary.envDetectMod.GCPEnv.APP_ENGINE with String = js.native
    
    /* "CLOUD_FUNCTIONS" */ val CLOUD_FUNCTIONS: typings.googleAuthLibrary.envDetectMod.GCPEnv.CLOUD_FUNCTIONS with String = js.native
    
    /* "COMPUTE_ENGINE" */ val COMPUTE_ENGINE: typings.googleAuthLibrary.envDetectMod.GCPEnv.COMPUTE_ENGINE with String = js.native
    
    /* "KUBERNETES_ENGINE" */ val KUBERNETES_ENGINE: typings.googleAuthLibrary.envDetectMod.GCPEnv.KUBERNETES_ENGINE with String = js.native
    
    /* "NONE" */ val NONE: typings.googleAuthLibrary.envDetectMod.GCPEnv.NONE with String = js.native
  }
  
  @JSImport("google-auth-library", "GoogleAuth")
  @js.native
  class GoogleAuth ()
    extends typings.googleAuthLibrary.googleauthMod.GoogleAuth {
    def this(opts: GoogleAuthOptions) = this()
  }
  /* static members */
  object GoogleAuth {
    
    @JSImport("google-auth-library", "GoogleAuth")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Export DefaultTransporter as a static property of the class.
      */
    @JSImport("google-auth-library", "GoogleAuth.DefaultTransporter")
    @js.native
    def DefaultTransporter: TypeofDefaultTransporter = js.native
    @scala.inline
    def DefaultTransporter_=(x: TypeofDefaultTransporter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultTransporter")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("google-auth-library", "IAMAuth")
  @js.native
  class IAMAuth protected ()
    extends typings.googleAuthLibrary.iamMod.IAMAuth {
    /**
      * IAM credentials.
      *
      * @param selector the iam authority selector
      * @param token the token
      * @constructor
      */
    def this(selector: String, token: String) = this()
  }
  
  @JSImport("google-auth-library", "IdTokenClient")
  @js.native
  class IdTokenClient protected ()
    extends typings.googleAuthLibrary.idtokenclientMod.IdTokenClient {
    /**
      * Google ID Token client
      *
      * Retrieve access token from the metadata server.
      * See: https://developers.google.com/compute/docs/authentication
      */
    def this(options: IdTokenOptions) = this()
  }
  
  @JSImport("google-auth-library", "JWT")
  @js.native
  class JWT protected ()
    extends typings.googleAuthLibrary.jwtclientMod.JWT {
    /**
      * JWT service account credentials.
      *
      * Retrieve access token using gtoken.
      *
      * @param email service account email address.
      * @param keyFile path to private key file.
      * @param key value of key
      * @param scopes list of requested scopes or a single scope.
      * @param subject impersonated account's email address.
      * @param key_id the ID of the key
      */
    def this(options: JWTOptions) = this()
    def this(
      email: js.UndefOr[String],
      keyFile: js.UndefOr[String],
      key: js.UndefOr[String],
      scopes: js.UndefOr[String | js.Array[String]],
      subject: js.UndefOr[String],
      keyId: js.UndefOr[String]
    ) = this()
  }
  
  @JSImport("google-auth-library", "JWTAccess")
  @js.native
  class JWTAccess protected ()
    extends typings.googleAuthLibrary.jwtaccessMod.JWTAccess {
    /**
      * JWTAccess service account credentials.
      *
      * Create a new access token by using the credential to create a new JWT token
      * that's recognized as the access token.
      *
      * @param email the service account email address.
      * @param key the private key that will be used to sign the token.
      * @param keyId the ID of the private key used to sign the token.
      */
    def this(
      email: js.UndefOr[String | Null],
      key: js.UndefOr[String | Null],
      keyId: js.UndefOr[String | Null],
      eagerRefreshThresholdMillis: js.UndefOr[Double]
    ) = this()
  }
  /* static members */
  object JWTAccess {
    
    @JSImport("google-auth-library", "JWTAccess")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns an expiration time for the JWT token.
      *
      * @param iat The issued at time for the JWT.
      * @returns An expiration time for the JWT.
      */
    @JSImport("google-auth-library", "JWTAccess.getExpirationTime")
    @js.native
    def getExpirationTime: js.Any = js.native
    @scala.inline
    def getExpirationTime_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getExpirationTime")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("google-auth-library", "LoginTicket")
  @js.native
  /**
    * Create a simple class to extract user ID from an ID Token
    *
    * @param {string} env Envelope of the jwt
    * @param {TokenPayload} pay Payload of the jwt
    * @constructor
    */
  class LoginTicket ()
    extends typings.googleAuthLibrary.loginticketMod.LoginTicket {
    def this(env: String) = this()
    def this(env: js.UndefOr[scala.Nothing], pay: TokenPayload) = this()
    def this(env: String, pay: TokenPayload) = this()
  }
  
  @JSImport("google-auth-library", "OAuth2Client")
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
  class OAuth2Client ()
    extends typings.googleAuthLibrary.oauth2clientMod.OAuth2Client {
    def this(clientId: String) = this()
    def this(options: OAuth2ClientOptions) = this()
    def this(clientId: js.UndefOr[scala.Nothing], clientSecret: String) = this()
    def this(clientId: String, clientSecret: String) = this()
    def this(clientId: js.UndefOr[scala.Nothing], clientSecret: js.UndefOr[scala.Nothing], redirectUri: String) = this()
    def this(clientId: js.UndefOr[scala.Nothing], clientSecret: String, redirectUri: String) = this()
    def this(clientId: String, clientSecret: js.UndefOr[scala.Nothing], redirectUri: String) = this()
    def this(clientId: String, clientSecret: String, redirectUri: String) = this()
  }
  /* static members */
  object OAuth2Client {
    
    /**
      * Clock skew - five minutes in seconds
      */
    @JSImport("google-auth-library", "OAuth2Client.CLOCK_SKEW_SECS_")
    @js.native
    val CLOCK_SKEW_SECS_ : js.Any = js.native
    
    /**
      * The base URL for auth endpoints.
      */
    @JSImport("google-auth-library", "OAuth2Client.GOOGLE_OAUTH2_AUTH_BASE_URL_")
    @js.native
    val GOOGLE_OAUTH2_AUTH_BASE_URL_ : js.Any = js.native
    
    /**
      * Google Sign on certificates in JWK format.
      */
    @JSImport("google-auth-library", "OAuth2Client.GOOGLE_OAUTH2_FEDERATED_SIGNON_JWK_CERTS_URL_")
    @js.native
    val GOOGLE_OAUTH2_FEDERATED_SIGNON_JWK_CERTS_URL_ : js.Any = js.native
    
    /**
      * Google Sign on certificates in PEM format.
      */
    @JSImport("google-auth-library", "OAuth2Client.GOOGLE_OAUTH2_FEDERATED_SIGNON_PEM_CERTS_URL_")
    @js.native
    val GOOGLE_OAUTH2_FEDERATED_SIGNON_PEM_CERTS_URL_ : js.Any = js.native
    
    /**
      * Google Sign on certificates in JWK format.
      */
    @JSImport("google-auth-library", "OAuth2Client.GOOGLE_OAUTH2_IAP_PUBLIC_KEY_URL_")
    @js.native
    val GOOGLE_OAUTH2_IAP_PUBLIC_KEY_URL_ : js.Any = js.native
    
    /**
      * The base endpoint to revoke tokens.
      */
    @JSImport("google-auth-library", "OAuth2Client.GOOGLE_OAUTH2_REVOKE_URL_")
    @js.native
    val GOOGLE_OAUTH2_REVOKE_URL_ : js.Any = js.native
    
    /**
      * The base endpoint for token retrieval.
      */
    @JSImport("google-auth-library", "OAuth2Client.GOOGLE_OAUTH2_TOKEN_URL_")
    @js.native
    val GOOGLE_OAUTH2_TOKEN_URL_ : js.Any = js.native
    
    @JSImport("google-auth-library", "OAuth2Client.GOOGLE_TOKEN_INFO_URL")
    @js.native
    val GOOGLE_TOKEN_INFO_URL: /* "https://oauth2.googleapis.com/tokeninfo" */ String = js.native
    
    /**
      * The allowed oauth token issuers.
      */
    @JSImport("google-auth-library", "OAuth2Client.ISSUERS_")
    @js.native
    val ISSUERS_ : js.Any = js.native
    
    /**
      * Max Token Lifetime is one day in seconds
      */
    @JSImport("google-auth-library", "OAuth2Client.MAX_TOKEN_LIFETIME_SECS_")
    @js.native
    val MAX_TOKEN_LIFETIME_SECS_ : js.Any = js.native
    
    /**
      * Generates an URL to revoke the given token.
      * @param token The existing token to be revoked.
      */
    @JSImport("google-auth-library", "OAuth2Client.getRevokeTokenUrl")
    @js.native
    def getRevokeTokenUrl(token: String): String = js.native
  }
  
  @JSImport("google-auth-library", "UserRefreshClient")
  @js.native
  /**
    * User Refresh Token credentials.
    *
    * @param clientId The authentication client ID.
    * @param clientSecret The authentication client secret.
    * @param refreshToken The authentication refresh token.
    */
  class UserRefreshClient ()
    extends typings.googleAuthLibrary.refreshclientMod.UserRefreshClient {
    def this(clientId: String) = this()
    def this(options: UserRefreshClientOptions) = this()
    def this(clientId: js.UndefOr[scala.Nothing], clientSecret: String) = this()
    def this(clientId: String, clientSecret: String) = this()
    def this(clientId: js.UndefOr[scala.Nothing], clientSecret: js.UndefOr[scala.Nothing], refreshToken: String) = this()
    def this(clientId: js.UndefOr[scala.Nothing], clientSecret: String, refreshToken: String) = this()
    def this(clientId: String, clientSecret: js.UndefOr[scala.Nothing], refreshToken: String) = this()
    def this(clientId: String, clientSecret: String, refreshToken: String) = this()
  }
  
  object auth extends Shortcut {
    
    @JSImport("google-auth-library", "auth")
    @js.native
    val ^ : typings.googleAuthLibrary.googleauthMod.GoogleAuth = js.native
    
    /**
      * Export DefaultTransporter as a static property of the class.
      */
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("google-auth-library", "auth.DefaultTransporter")
    @js.native
    class DefaultTransporterCls ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporterCls {
      
      @JSImport("google-auth-library", "auth.DefaultTransporter.constructor")
      @js.native
      def constructor(): js.Any = js.native
    }
    
    type _To = typings.googleAuthLibrary.googleauthMod.GoogleAuth
    
    /* This means you don't have to write `^`, but can instead just say `auth.foo` */
    override def _to: typings.googleAuthLibrary.googleauthMod.GoogleAuth = ^
  }
}
