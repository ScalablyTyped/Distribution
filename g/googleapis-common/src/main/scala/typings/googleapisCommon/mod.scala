package typings.googleapisCommon

import org.scalablytyped.runtime.StringDictionary
import typings.gaxios.commonMod.GaxiosPromise
import typings.googleAuthLibrary.googleauthMod.GoogleAuthOptions
import typings.googleAuthLibrary.oauth2clientMod.OAuth2ClientOptions
import typings.googleapisCommon.apiMod.APIRequestParams
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.apiMod.ServiceOptions
import typings.googleapisCommon.discoveryMod.DiscoveryOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("googleapis-common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("googleapis-common", "AuthPlus")
  @js.native
  class AuthPlus ()
    extends typings.googleapisCommon.authplusMod.AuthPlus {
    def this(opts: GoogleAuthOptions) = this()
  }
  
  @JSImport("googleapis-common", "Discovery")
  @js.native
  class Discovery protected ()
    extends typings.googleapisCommon.discoveryMod.Discovery {
    /**
      * Discovery for discovering API endpoints
      *
      * @param options Options for discovery
      */
    def this(options: DiscoveryOptions) = this()
  }
  
  @JSImport("googleapis-common", "Endpoint")
  @js.native
  class Endpoint protected ()
    extends typings.googleapisCommon.endpointMod.Endpoint {
    def this(options: js.Object) = this()
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
  class OAuth2Client ()
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
    val CLOCK_SKEW_SECS_ : js.Any = js.native
    
    /**
      * The base URL for auth endpoints.
      */
    @JSImport("googleapis-common", "OAuth2Client.GOOGLE_OAUTH2_AUTH_BASE_URL_")
    @js.native
    val GOOGLE_OAUTH2_AUTH_BASE_URL_ : js.Any = js.native
    
    /**
      * Google Sign on certificates in JWK format.
      */
    @JSImport("googleapis-common", "OAuth2Client.GOOGLE_OAUTH2_FEDERATED_SIGNON_JWK_CERTS_URL_")
    @js.native
    val GOOGLE_OAUTH2_FEDERATED_SIGNON_JWK_CERTS_URL_ : js.Any = js.native
    
    /**
      * Google Sign on certificates in PEM format.
      */
    @JSImport("googleapis-common", "OAuth2Client.GOOGLE_OAUTH2_FEDERATED_SIGNON_PEM_CERTS_URL_")
    @js.native
    val GOOGLE_OAUTH2_FEDERATED_SIGNON_PEM_CERTS_URL_ : js.Any = js.native
    
    /**
      * Google Sign on certificates in JWK format.
      */
    @JSImport("googleapis-common", "OAuth2Client.GOOGLE_OAUTH2_IAP_PUBLIC_KEY_URL_")
    @js.native
    val GOOGLE_OAUTH2_IAP_PUBLIC_KEY_URL_ : js.Any = js.native
    
    /**
      * The base endpoint to revoke tokens.
      */
    @JSImport("googleapis-common", "OAuth2Client.GOOGLE_OAUTH2_REVOKE_URL_")
    @js.native
    val GOOGLE_OAUTH2_REVOKE_URL_ : js.Any = js.native
    
    /**
      * The base endpoint for token retrieval.
      */
    @JSImport("googleapis-common", "OAuth2Client.GOOGLE_OAUTH2_TOKEN_URL_")
    @js.native
    val GOOGLE_OAUTH2_TOKEN_URL_ : js.Any = js.native
    
    @JSImport("googleapis-common", "OAuth2Client.GOOGLE_TOKEN_INFO_URL")
    @js.native
    val GOOGLE_TOKEN_INFO_URL: /* "https://oauth2.googleapis.com/tokeninfo" */ String = js.native
    
    /**
      * The allowed oauth token issuers.
      */
    @JSImport("googleapis-common", "OAuth2Client.ISSUERS_")
    @js.native
    val ISSUERS_ : js.Any = js.native
    
    /**
      * Max Token Lifetime is one day in seconds
      */
    @JSImport("googleapis-common", "OAuth2Client.MAX_TOKEN_LIFETIME_SECS_")
    @js.native
    val MAX_TOKEN_LIFETIME_SECS_ : js.Any = js.native
    
    /**
      * Generates an URL to revoke the given token.
      * @param token The existing token to be revoked.
      */
    @scala.inline
    def getRevokeTokenUrl(token: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRevokeTokenUrl")(token.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @scala.inline
  def createAPIRequest[T](parameters: APIRequestParams[js.Any]): GaxiosPromise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAPIRequest")(parameters.asInstanceOf[js.Any]).asInstanceOf[GaxiosPromise[T]]
  @scala.inline
  def createAPIRequest[T](parameters: APIRequestParams[js.Any], callback: BodyResponseCallback[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAPIRequest")(parameters.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def getAPI[T](api: String, options: String, versions: StringDictionary[js.Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getAPI")(api.asInstanceOf[js.Any], options.asInstanceOf[js.Any], versions.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def getAPI[T](api: String, options: String, versions: StringDictionary[js.Any], context: GoogleConfigurable): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getAPI")(api.asInstanceOf[js.Any], options.asInstanceOf[js.Any], versions.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def getAPI[T](api: String, options: ServiceOptions, versions: StringDictionary[js.Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getAPI")(api.asInstanceOf[js.Any], options.asInstanceOf[js.Any], versions.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def getAPI[T](
    api: String,
    options: ServiceOptions,
    versions: StringDictionary[js.Any],
    context: GoogleConfigurable
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getAPI")(api.asInstanceOf[js.Any], options.asInstanceOf[js.Any], versions.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[T]
}
