package typings.googleapis.buildSrcApisServiceusageV1Mod.serviceusage_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `Authentication` defines the authentication configuration for an API.
  * Example for an API targeted for external use:      name:
  * calendar.googleapis.com     authentication:       providers:       - id:
  * google_calendar_auth         jwks_uri:
  * https://www.googleapis.com/oauth2/v1/certs         issuer:
  * https://securetoken.google.com       rules:       - selector: &quot;*&quot;
  * requirements:           provider_id: google_calendar_auth
  */
@js.native
trait Schema$Authentication extends js.Object {
  /**
    * Defines a set of authentication providers that a service supports.
    */
  var providers: js.UndefOr[js.Array[Schema$AuthProvider]] = js.native
  /**
    * A list of authentication rules that apply to individual API methods.
    * **NOTE:** All service configuration rules follow &quot;last one
    * wins&quot; order.
    */
  var rules: js.UndefOr[js.Array[Schema$AuthenticationRule]] = js.native
}

object Schema$Authentication {
  @scala.inline
  def apply(providers: js.Array[Schema$AuthProvider] = null, rules: js.Array[Schema$AuthenticationRule] = null): Schema$Authentication = {
    val __obj = js.Dynamic.literal()
    if (providers != null) __obj.updateDynamic("providers")(providers.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Authentication]
  }
}

