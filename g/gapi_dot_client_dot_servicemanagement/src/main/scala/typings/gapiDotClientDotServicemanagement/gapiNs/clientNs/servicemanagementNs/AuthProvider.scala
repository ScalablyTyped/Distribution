package typings.gapiDotClientDotServicemanagement.gapiNs.clientNs.servicemanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthProvider extends js.Object {
  /**
    * The list of JWT
    * [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3).
    * that are allowed to access. A JWT containing any of these audiences will
    * be accepted. When this setting is absent, only JWTs with audience
    * "https://Service_name/API_name"
    * will be accepted. For example, if no audiences are in the setting,
    * LibraryService API will only accept JWTs with the following audience
    * "https://library-example.googleapis.com/google.example.library.v1.LibraryService".
    *
    * Example:
    *
    * audiences: bookstore_android.apps.googleusercontent.com,
    * bookstore_web.apps.googleusercontent.com
    */
  var audiences: js.UndefOr[String] = js.undefined
  /**
    * Redirect URL if JWT token is required but no present or is expired.
    * Implement authorizationUrl of securityDefinitions in OpenAPI spec.
    */
  var authorizationUrl: js.UndefOr[String] = js.undefined
  /**
    * The unique identifier of the auth provider. It will be referred to by
    * `AuthRequirement.provider_id`.
    *
    * Example: "bookstore_auth".
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Identifies the principal that issued the JWT. See
    * https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.1
    * Usually a URL or an email address.
    *
    * Example: https://securetoken.google.com
    * Example: 1234567-compute@developer.gserviceaccount.com
    */
  var issuer: js.UndefOr[String] = js.undefined
  /**
    * URL of the provider's public key set to validate signature of the JWT. See
    * [OpenID Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html#ProviderMetadata).
    * Optional if the key set document:
    * - can be retrieved from
    * [OpenID Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html
    * of the issuer.
    * - can be inferred from the email domain of the issuer (e.g. a Google service account).
    *
    * Example: https://www.googleapis.com/oauth2/v1/certs
    */
  var jwksUri: js.UndefOr[String] = js.undefined
}

object AuthProvider {
  @scala.inline
  def apply(
    audiences: String = null,
    authorizationUrl: String = null,
    id: String = null,
    issuer: String = null,
    jwksUri: String = null
  ): AuthProvider = {
    val __obj = js.Dynamic.literal()
    if (audiences != null) __obj.updateDynamic("audiences")(audiences)
    if (authorizationUrl != null) __obj.updateDynamic("authorizationUrl")(authorizationUrl)
    if (id != null) __obj.updateDynamic("id")(id)
    if (issuer != null) __obj.updateDynamic("issuer")(issuer)
    if (jwksUri != null) __obj.updateDynamic("jwksUri")(jwksUri)
    __obj.asInstanceOf[AuthProvider]
  }
}

