package typings.googleapisDashCommon

import org.scalablytyped.runtime.StringDictionary
import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleDashAuthDashLibrary.buildSrcAuthOauth2clientMod.OAuth2ClientOptions
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestParams
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import typings.googleapisDashCommon.buildSrcApiMod.ServiceOptions
import typings.googleapisDashCommon.buildSrcDiscoveryMod.DiscoveryOptions
import typings.googleapisDashCommon.googleapisDashCommonStrings.httpsColonSlashSlashoauth2DotgoogleapisDotcomSlashtokeninfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis-common", JSImport.Namespace)
@js.native
object googleapisDashCommonMod extends js.Object {
  @js.native
  class AuthPlus ()
    extends typings.googleapisDashCommon.buildSrcAuthplusMod.AuthPlus
  
  @js.native
  class Discovery protected ()
    extends typings.googleapisDashCommon.buildSrcDiscoveryMod.Discovery {
    /**
      * Discovery for discovering API endpoints
      *
      * @param options Options for discovery
      */
    def this(options: DiscoveryOptions) = this()
  }
  
  @js.native
  class Endpoint protected ()
    extends typings.googleapisDashCommon.buildSrcEndpointMod.Endpoint {
    def this(options: js.Object) = this()
  }
  
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
    extends typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client {
    def this(clientId: String) = this()
    def this(options: OAuth2ClientOptions) = this()
    def this(clientId: String, clientSecret: String) = this()
    def this(clientId: String, clientSecret: String, redirectUri: String) = this()
  }
  
  def createAPIRequest[T](parameters: APIRequestParams[_]): GaxiosPromise[T] = js.native
  def createAPIRequest[T](parameters: APIRequestParams[_], callback: BodyResponseCallback[T]): Unit = js.native
  def getAPI[T](api: String, options: String, versions: StringDictionary[js.Any]): T = js.native
  def getAPI[T](api: String, options: String, versions: StringDictionary[js.Any], context: GoogleConfigurable): T = js.native
  def getAPI[T](api: String, options: ServiceOptions, versions: StringDictionary[js.Any]): T = js.native
  def getAPI[T](
    api: String,
    options: ServiceOptions,
    versions: StringDictionary[js.Any],
    context: GoogleConfigurable
  ): T = js.native
  /* static members */
  @js.native
  object OAuth2Client extends js.Object {
    /**
      * Clock skew - five minutes in seconds
      */
    val CLOCK_SKEW_SECS_ : js.Any = js.native
    /**
      * The base URL for auth endpoints.
      */
    val GOOGLE_OAUTH2_AUTH_BASE_URL_ : js.Any = js.native
    /**
      * Google Sign on certificates in JWK format.
      */
    val GOOGLE_OAUTH2_FEDERATED_SIGNON_JWK_CERTS_URL_ : js.Any = js.native
    /**
      * Google Sign on certificates in PEM format.
      */
    val GOOGLE_OAUTH2_FEDERATED_SIGNON_PEM_CERTS_URL_ : js.Any = js.native
    /**
      * The base endpoint to revoke tokens.
      */
    val GOOGLE_OAUTH2_REVOKE_URL_ : js.Any = js.native
    /**
      * The base endpoint for token retrieval.
      */
    val GOOGLE_OAUTH2_TOKEN_URL_ : js.Any = js.native
    val GOOGLE_TOKEN_INFO_URL: httpsColonSlashSlashoauth2DotgoogleapisDotcomSlashtokeninfo = js.native
    /**
      * The allowed oauth token issuers.
      */
    val ISSUERS_ : js.Any = js.native
    /**
      * Max Token Lifetime is one day in seconds
      */
    val MAX_TOKEN_LIFETIME_SECS_ : js.Any = js.native
    /**
      * Generates an URL to revoke the given token.
      * @param token The existing token to be revoked.
      */
    def getRevokeTokenUrl(token: String): String = js.native
  }
  
}

