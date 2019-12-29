package typings.googleapisDashCommon

import org.scalablytyped.runtime.Instantiable0
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleapisDashCommon.googleapisDashCommonStrings.httpsColonSlashSlashoauth2DotgoogleapisDotcomSlashtokeninfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassOAuth2Client extends Instantiable0[OAuth2Client] {
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

