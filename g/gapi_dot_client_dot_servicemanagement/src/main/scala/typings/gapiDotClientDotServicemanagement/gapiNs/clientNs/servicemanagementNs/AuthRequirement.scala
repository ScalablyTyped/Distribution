package typings.gapiDotClientDotServicemanagement.gapiNs.clientNs.servicemanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthRequirement extends js.Object {
  /**
    * NOTE: This will be deprecated soon, once AuthProvider.audiences is
    * implemented and accepted in all the runtime components.
    *
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
    * id from authentication provider.
    *
    * Example:
    *
    * provider_id: bookstore_auth
    */
  var providerId: js.UndefOr[String] = js.undefined
}

object AuthRequirement {
  @scala.inline
  def apply(audiences: String = null, providerId: String = null): AuthRequirement = {
    val __obj = js.Dynamic.literal()
    if (audiences != null) __obj.updateDynamic("audiences")(audiences)
    if (providerId != null) __obj.updateDynamic("providerId")(providerId)
    __obj.asInstanceOf[AuthRequirement]
  }
}

