package typings.googleapisCommon

import org.scalablytyped.runtime.StringDictionary
import typings.gaxios.buildSrcCommonMod.GaxiosOptions
import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.gaxios.buildSrcCommonMod.GaxiosResponse
import typings.googleAuthLibrary.anon.TypeofDefaultTransporter
import typings.googleAuthLibrary.buildSrcAuthAuthclientMod.AuthClient
import typings.googleAuthLibrary.buildSrcAuthAwsclientMod.AwsClientOptions
import typings.googleAuthLibrary.buildSrcAuthBaseexternalclientMod.BaseExternalAccountClientOptions
import typings.googleAuthLibrary.buildSrcAuthComputeclientMod.ComputeOptions
import typings.googleAuthLibrary.buildSrcAuthExternalclientMod.ExternalAccountClientOptions
import typings.googleAuthLibrary.buildSrcAuthGoogleauthMod.GoogleAuthOptions
import typings.googleAuthLibrary.buildSrcAuthGoogleauthMod.JSONClient
import typings.googleAuthLibrary.buildSrcAuthIdentitypoolclientMod.IdentityPoolClientOptions
import typings.googleAuthLibrary.buildSrcAuthJwtclientMod.JWTOptions
import typings.googleAuthLibrary.buildSrcAuthOauth2clientMod.OAuth2ClientOptions
import typings.googleAuthLibrary.buildSrcAuthOauth2clientMod.RefreshOptions
import typings.googleAuthLibrary.buildSrcAuthRefreshclientMod.UserRefreshClientOptions
import typings.googleapisCommon.buildSrcApiMod.APIRequestParams
import typings.googleapisCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisCommon.buildSrcApiMod.GoogleConfigurable
import typings.googleapisCommon.buildSrcApiMod.ServiceOptions
import typings.googleapisCommon.buildSrcDiscoveryMod.DiscoveryOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("googleapis-common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("googleapis-common", "AuthPlus")
  @js.native
  open class AuthPlus ()
    extends typings.googleapisCommon.buildSrcAuthplusMod.AuthPlus {
    def this(opts: GoogleAuthOptions[JSONClient]) = this()
  }
  
  @JSImport("googleapis-common", "AwsClient")
  @js.native
  open class AwsClient protected ()
    extends typings.googleAuthLibrary.mod.AwsClient {
    /**
      * Instantiates an AwsClient instance using the provided JSON
      * object loaded from an external account credentials file.
      * An error is thrown if the credential is not a valid AWS credential.
      * @param options The external account options object typically loaded
      *   from the external account JSON credential file.
      * @param additionalOptions Optional additional behavior customization
      *   options. These currently customize expiration threshold time and
      *   whether to retry on 401/403 API request errors.
      */
    def this(options: AwsClientOptions) = this()
    def this(options: AwsClientOptions, additionalOptions: RefreshOptions) = this()
  }
  
  /* note: abstract class */ @JSImport("googleapis-common", "BaseExternalAccountClient")
  @js.native
  open class BaseExternalAccountClient protected ()
    extends typings.googleAuthLibrary.mod.BaseExternalAccountClient {
    /**
      * Instantiate a BaseExternalAccountClient instance using the provided JSON
      * object loaded from an external account credentials file.
      * @param options The external account options object typically loaded
      *   from the external account JSON credential file.
      * @param additionalOptions Optional additional behavior customization
      *   options. These currently customize expiration threshold time and
      *   whether to retry on 401/403 API request errors.
      */
    def this(options: BaseExternalAccountClientOptions) = this()
    def this(options: BaseExternalAccountClientOptions, additionalOptions: RefreshOptions) = this()
  }
  
  @JSImport("googleapis-common", "Compute")
  @js.native
  /**
    * Google Compute Engine service account credentials.
    *
    * Retrieve access token from the metadata server.
    * See: https://developers.google.com/compute/docs/authentication
    */
  open class Compute ()
    extends typings.googleAuthLibrary.mod.Compute {
    def this(options: ComputeOptions) = this()
  }
  
  @JSImport("googleapis-common", "DefaultTransporter")
  @js.native
  open class DefaultTransporter ()
    extends typings.googleAuthLibrary.mod.DefaultTransporter
  /* static members */
  object DefaultTransporter {
    
    /**
      * Default user agent.
      */
    @JSImport("googleapis-common", "DefaultTransporter.USER_AGENT")
    @js.native
    val USER_AGENT: String = js.native
  }
  
  @JSImport("googleapis-common", "Discovery")
  @js.native
  open class Discovery protected ()
    extends typings.googleapisCommon.buildSrcDiscoveryMod.Discovery {
    /**
      * Discovery for discovering API endpoints
      *
      * @param options Options for discovery
      */
    def this(options: DiscoveryOptions) = this()
  }
  
  @JSImport("googleapis-common", "Endpoint")
  @js.native
  open class Endpoint protected ()
    extends typings.googleapisCommon.buildSrcEndpointMod.Endpoint {
    def this(options: js.Object) = this()
  }
  
  @JSImport("googleapis-common", "ExternalAccountClient")
  @js.native
  open class ExternalAccountClient ()
    extends typings.googleAuthLibrary.mod.ExternalAccountClient
  /* static members */
  object ExternalAccountClient {
    
    @JSImport("googleapis-common", "ExternalAccountClient")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * This static method will instantiate the
      * corresponding type of external account credential depending on the
      * underlying credential source.
      * @param options The external account options object typically loaded
      *   from the external account JSON credential file.
      * @param additionalOptions Optional additional behavior customization
      *   options. These currently customize expiration threshold time and
      *   whether to retry on 401/403 API request errors.
      * @return A BaseExternalAccountClient instance or null if the options
      *   provided do not correspond to an external account credential.
      */
    inline def fromJSON(options: ExternalAccountClientOptions): typings.googleAuthLibrary.buildSrcAuthBaseexternalclientMod.BaseExternalAccountClient | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleAuthLibrary.buildSrcAuthBaseexternalclientMod.BaseExternalAccountClient | Null]
    inline def fromJSON(options: ExternalAccountClientOptions, additionalOptions: RefreshOptions): typings.googleAuthLibrary.buildSrcAuthBaseexternalclientMod.BaseExternalAccountClient | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(options.asInstanceOf[js.Any], additionalOptions.asInstanceOf[js.Any])).asInstanceOf[typings.googleAuthLibrary.buildSrcAuthBaseexternalclientMod.BaseExternalAccountClient | Null]
  }
  
  @JSImport("googleapis-common", "Gaxios")
  @js.native
  /**
    * The Gaxios class is responsible for making HTTP requests.
    * @param defaults The default set of options to be used for this instance.
    */
  open class Gaxios ()
    extends typings.gaxios.mod.Gaxios {
    def this(defaults: GaxiosOptions) = this()
  }
  
  @JSImport("googleapis-common", "GaxiosError")
  @js.native
  open class GaxiosError[T] protected ()
    extends typings.gaxios.mod.GaxiosError[T] {
    def this(message: String, options: GaxiosOptions, response: GaxiosResponse[T]) = this()
  }
  
  @JSImport("googleapis-common", "GoogleAuth")
  @js.native
  open class GoogleAuth[T /* <: AuthClient */] ()
    extends typings.googleAuthLibrary.mod.GoogleAuth[T] {
    def this(opts: GoogleAuthOptions[T]) = this()
  }
  /* static members */
  object GoogleAuth {
    
    @JSImport("googleapis-common", "GoogleAuth")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Export DefaultTransporter as a static property of the class.
      */
    @JSImport("googleapis-common", "GoogleAuth.DefaultTransporter")
    @js.native
    def DefaultTransporter: TypeofDefaultTransporter = js.native
    inline def DefaultTransporter_=(x: TypeofDefaultTransporter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultTransporter")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("googleapis-common", "IdentityPoolClient")
  @js.native
  open class IdentityPoolClient protected ()
    extends typings.googleAuthLibrary.mod.IdentityPoolClient {
    /**
      * Instantiate an IdentityPoolClient instance using the provided JSON
      * object loaded from an external account credentials file.
      * An error is thrown if the credential is not a valid file-sourced or
      * url-sourced credential or a workforce pool user project is provided
      * with a non workforce audience.
      * @param options The external account options object typically loaded
      *   from the external account JSON credential file.
      * @param additionalOptions Optional additional behavior customization
      *   options. These currently customize expiration threshold time and
      *   whether to retry on 401/403 API request errors.
      */
    def this(options: IdentityPoolClientOptions) = this()
    def this(options: IdentityPoolClientOptions, additionalOptions: RefreshOptions) = this()
  }
  
  @JSImport("googleapis-common", "JWT")
  @js.native
  open class JWT protected ()
    extends typings.googleAuthLibrary.mod.JWT {
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
  
  @JSImport("googleapis-common", "OAuth2Client")
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
  open class OAuth2Client ()
    extends typings.googleAuthLibrary.mod.OAuth2Client {
    def this(clientId: String) = this()
    def this(options: OAuth2ClientOptions) = this()
    def this(clientId: String, clientSecret: String) = this()
    def this(clientId: Unit, clientSecret: String) = this()
    def this(clientId: String, clientSecret: String, redirectUri: String) = this()
    def this(clientId: String, clientSecret: Unit, redirectUri: String) = this()
    def this(clientId: Unit, clientSecret: String, redirectUri: String) = this()
    def this(clientId: Unit, clientSecret: Unit, redirectUri: String) = this()
  }
  /* static members */
  object OAuth2Client {
    
    @JSImport("googleapis-common", "OAuth2Client")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Clock skew - five minutes in seconds
      */
    @JSImport("googleapis-common", "OAuth2Client.CLOCK_SKEW_SECS_")
    @js.native
    val CLOCK_SKEW_SECS_ : Any = js.native
    
    /**
      * The base URL for auth endpoints.
      */
    @JSImport("googleapis-common", "OAuth2Client.GOOGLE_OAUTH2_AUTH_BASE_URL_")
    @js.native
    val GOOGLE_OAUTH2_AUTH_BASE_URL_ : Any = js.native
    
    /**
      * Google Sign on certificates in JWK format.
      */
    @JSImport("googleapis-common", "OAuth2Client.GOOGLE_OAUTH2_FEDERATED_SIGNON_JWK_CERTS_URL_")
    @js.native
    val GOOGLE_OAUTH2_FEDERATED_SIGNON_JWK_CERTS_URL_ : Any = js.native
    
    /**
      * Google Sign on certificates in PEM format.
      */
    @JSImport("googleapis-common", "OAuth2Client.GOOGLE_OAUTH2_FEDERATED_SIGNON_PEM_CERTS_URL_")
    @js.native
    val GOOGLE_OAUTH2_FEDERATED_SIGNON_PEM_CERTS_URL_ : Any = js.native
    
    /**
      * Google Sign on certificates in JWK format.
      */
    @JSImport("googleapis-common", "OAuth2Client.GOOGLE_OAUTH2_IAP_PUBLIC_KEY_URL_")
    @js.native
    val GOOGLE_OAUTH2_IAP_PUBLIC_KEY_URL_ : Any = js.native
    
    /**
      * The base endpoint to revoke tokens.
      */
    @JSImport("googleapis-common", "OAuth2Client.GOOGLE_OAUTH2_REVOKE_URL_")
    @js.native
    val GOOGLE_OAUTH2_REVOKE_URL_ : Any = js.native
    
    /**
      * The base endpoint for token retrieval.
      */
    @JSImport("googleapis-common", "OAuth2Client.GOOGLE_OAUTH2_TOKEN_URL_")
    @js.native
    val GOOGLE_OAUTH2_TOKEN_URL_ : Any = js.native
    
    @JSImport("googleapis-common", "OAuth2Client.GOOGLE_TOKEN_INFO_URL")
    @js.native
    val GOOGLE_TOKEN_INFO_URL: /* "https://oauth2.googleapis.com/tokeninfo" */ String = js.native
    
    /**
      * The allowed oauth token issuers.
      */
    @JSImport("googleapis-common", "OAuth2Client.ISSUERS_")
    @js.native
    val ISSUERS_ : Any = js.native
    
    /**
      * Max Token Lifetime is one day in seconds
      */
    @JSImport("googleapis-common", "OAuth2Client.MAX_TOKEN_LIFETIME_SECS_")
    @js.native
    val MAX_TOKEN_LIFETIME_SECS_ : Any = js.native
    
    /**
      * Generates an URL to revoke the given token.
      * @param token The existing token to be revoked.
      */
    inline def getRevokeTokenUrl(token: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRevokeTokenUrl")(token.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSImport("googleapis-common", "UserRefreshClient")
  @js.native
  /**
    * User Refresh Token credentials.
    *
    * @param clientId The authentication client ID.
    * @param clientSecret The authentication client secret.
    * @param refreshToken The authentication refresh token.
    */
  open class UserRefreshClient ()
    extends typings.googleAuthLibrary.mod.UserRefreshClient {
    def this(clientId: String) = this()
    def this(options: UserRefreshClientOptions) = this()
    def this(clientId: String, clientSecret: String) = this()
    def this(clientId: Unit, clientSecret: String) = this()
    def this(clientId: String, clientSecret: String, refreshToken: String) = this()
    def this(clientId: String, clientSecret: Unit, refreshToken: String) = this()
    def this(clientId: Unit, clientSecret: String, refreshToken: String) = this()
    def this(clientId: Unit, clientSecret: Unit, refreshToken: String) = this()
  }
  
  inline def createAPIRequest[T](parameters: APIRequestParams[Any]): GaxiosPromise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAPIRequest")(parameters.asInstanceOf[js.Any]).asInstanceOf[GaxiosPromise[T]]
  inline def createAPIRequest[T](parameters: APIRequestParams[Any], callback: BodyResponseCallback[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAPIRequest")(parameters.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getAPI[T](api: String, options: String, versions: StringDictionary[Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getAPI")(api.asInstanceOf[js.Any], options.asInstanceOf[js.Any], versions.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def getAPI[T](api: String, options: String, versions: StringDictionary[Any], context: GoogleConfigurable): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getAPI")(api.asInstanceOf[js.Any], options.asInstanceOf[js.Any], versions.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def getAPI[T](api: String, options: ServiceOptions, versions: StringDictionary[Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getAPI")(api.asInstanceOf[js.Any], options.asInstanceOf[js.Any], versions.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def getAPI[T](api: String, options: ServiceOptions, versions: StringDictionary[Any], context: GoogleConfigurable): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getAPI")(api.asInstanceOf[js.Any], options.asInstanceOf[js.Any], versions.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[T]
}
